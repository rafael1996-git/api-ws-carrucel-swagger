/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.talentport.dto;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Salvador Fajardo
 */
@Getter
@Setter
public class CarouselDetailDTO {

    private BigDecimal idCarouselDetail;
    private String detail;
    private CarouselDTO carouselIdCarousel;

  
}
