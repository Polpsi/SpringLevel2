package springlevel2.statisticmodule.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "sellstatistic")
public class Sell {
    @Id
    private Long id;
    private Long orderId;
    private String title;
    private String product;
    private Double price;
    private Integer quantity;
}
