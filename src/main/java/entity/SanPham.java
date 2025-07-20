package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SanPham {
    private int MaSP;
    private String TenSP;
    private int MaTH;
    private int MaXX;
    private String MoTa;
    private int IdDayDeo;
    private int SoNganTrong;
    private int SoNganNgoai;
    private int IdKhoa;
    private int SoDay;
}