package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class KhachHang {
    private int MaKH;
    private String TenKH;
    private String Sdt;
    private String Email;
    private String DiaChi;
    private boolean GioiTinh;
}
