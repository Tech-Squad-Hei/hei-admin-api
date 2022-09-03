package school.hei.haapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import school.hei.haapi.model.Place;

@EnableJpaRepositories
public interface PlaceRepository extends JpaRepository<Place,Long> {

    Place findByName(Place place);
}
