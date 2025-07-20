
package entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HoaDon {
    private int MaHD;
    private int MaNV;
    private int MaKH;
    private int MaPhieu;
    private LocalDate NgayTao;
    private BigDecimal TongTienTamTinh;
    private BigDecimal TongTienGiam;
    private BigDecimal TongTien;
    private String TrangThaiHoaDon;
}
