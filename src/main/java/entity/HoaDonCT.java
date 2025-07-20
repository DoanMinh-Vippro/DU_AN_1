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
public class HoaDonCT {
    private int MaHD;
    private int MaSPCT;
    private int SoLuong;
    private BigDecimal DonGia;
}
