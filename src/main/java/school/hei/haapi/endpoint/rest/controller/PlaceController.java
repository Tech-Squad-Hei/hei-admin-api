package school.hei.haapi.endpoint.rest.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import school.hei.haapi.model.Place;
import school.hei.haapi.service.PlaceService;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlaceController {
    private PlaceService placeService;

    @GetMapping("/places")
    public List<Place> getAllPlace() {
        return this.placeService.getAllPlace();
    }

    @GetMapping("/places/{id}")
    public Place getPLaceById(@PathVariable Long id) {
        return this.placeService.getPlaceById(id);
    }

    @PutMapping("/places")
    public Place getPlaceByName(Place place) {
        Place place1 = placeService.getPlaceByName(place);
        if (place1.equals(null)) {
            return placeService.createNewPlace(place);
        } else {
            place1.setName(place.getName());
            placeService.removePlaceById(place.getId());
            return placeService.createNewPlace(place1);
        }
    }

    @DeleteMapping("/places/{id}")
    public void removePlaceById(@PathVariable Long id) {

        placeService.removePlaceById(id);
    }
}