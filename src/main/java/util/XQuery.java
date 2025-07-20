package util;

import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class XQuery {

    public static <B> B getSingleBean(Class<B> beanClass, String sql, Object... values) {
        List<B> list = getBeanList(beanClass, sql, values);
        return list.isEmpty() ? null : list.get(0);
    }

    public static <B> List<B> getBeanList(Class<B> beanClass, String sql, Object... values) {
        List<B> list = new ArrayList<>();
        try (ResultSet rs = XJdbc.executeQuery(sql, values)) {
            while (rs.next()) {
                list.add(readBean(rs, beanClass));
            }
        } catch (Exception ex) {
            throw new RuntimeException("Lỗi truy vấn: " + ex.getMessage(), ex);
        }
        return list;
    }

    private static <B> B readBean(ResultSet rs, Class<B> beanClass) throws Exception {
        B bean = beanClass.getDeclaredConstructor().newInstance();
        Method[] methods = beanClass.getDeclaredMethods();

        for (Method method : methods) {
            String methodName = method.getName();
            if (methodName.startsWith("set") && method.getParameterCount() == 1) {
                String fieldName = methodName.substring(3); // Ví dụ: "TenSP"
                String columnName = toColumnName(fieldName); // → "ten_sp"

                try {
                    Object value = rs.getObject(columnName);
                    method.invoke(bean, value);
                } catch (SQLException e) {
                    System.err.printf("⚠ Không tìm thấy cột '%s', bỏ qua.%n", columnName);
                }
            }
        }
        return bean;
    }

    // Chuyển camelCase thành snake_case chuẩn: TenSP → ten_sp
    private static String toColumnName(String camelName) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < camelName.length(); i++) {
            char c = camelName.charAt(i);
            if (Character.isUpperCase(c) && i > 0) {
                sb.append('_');
            }
            sb.append(Character.toLowerCase(c));
        }
        return sb.toString();
    }
}
