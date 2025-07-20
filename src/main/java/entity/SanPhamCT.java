
package entity;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SanPhamCT {
    private int MaSPCT;
    private int MaMAUSAC;
    private String MaKT;
    private int MaSP;
    private int SoLuong;
    private boolean TrangThai;
    private String ChatLieu;
    private float TrongLuong;
    private BigDecimal DonGia;
}
