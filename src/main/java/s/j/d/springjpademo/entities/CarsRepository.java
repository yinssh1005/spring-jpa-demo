package s.j.d.springjpademo.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CarsRepository extends JpaRepository<Cars, Long> {
    @Query("SELECT f FROM Cars f WHERE LOWER(f.carname) = LOWER(:carname)")
    Cars findByName(@Param("carname") String carname);
}