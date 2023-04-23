/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.talentport.dto;

import java.math.BigDecimal;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Salvador Fajardo
 */
@Getter
@Setter
public class CarouselDTO {

    private BigDecimal idCarousel;
    private String title;
    private String description;
    private List<CarouselDetailDTO> carouselDetailList;

}
