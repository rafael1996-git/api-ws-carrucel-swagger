
package mx.com.talentport.controller;

import java.util.List;
import mx.com.talentport.dto.CarouselDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Salvador Fajardo
 */

@RestController
@RequestMapping("/api")
public class CarouselController {
    
    @RequestMapping(value = "/getCarousel", method = RequestMethod.GET)
	public ResponseEntity<List<CarouselDTO>> getCarousel() {
        
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
