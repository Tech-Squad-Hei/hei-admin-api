package school.hei.haapi.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school.hei.haapi.model.Place;
import school.hei.haapi.repository.PlaceRepository;

import java.util.List;

@Service
public class PlaceService {
    @Autowired
     private PlaceRepository placeRepository;

    public List<Place> getAllPlace(){
        return this.placeRepository.findAll();
    }

    public Place getPlaceById(Long id){
        return this.placeRepository.getById(id);
    }

    public Place createNewPlace(Place place){
        return this.placeRepository.save(place);
    }

    public Place getPlaceByName(Place place){
        return this.placeRepository.findByName(place);
    }

    public void removePlaceById(Long id){
        this.placeRepository.delete(placeRepository.getById(id));
    }
}
