package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PhieuGiamGia {
    private int MaPhieu;
    private String LoaiGiamGia;
    private LocalDate NgayTao;
    private LocalDate NgayHetHan;
    private float GiaTriGiam;
    private float MucGiamToiDa;
    private String DieuKien;
}
