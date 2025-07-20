package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class NhanVien {
    private int MaNV;
    private String TenNV;
    private String ChucVu;
    private String Sdt;
    private String Email;
    private boolean Gioitinh;
    private String MatKhau;
    private boolean TrangThai;
}
