package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LoaiDayDeo {
    private int idDayDeo;
    private Integer chieuDaiTayCam;
    private Integer chieuDaiDayDeo;
    private Integer tongChieuDai;
    private String chatLieu;
}
