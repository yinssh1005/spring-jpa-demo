package s.j.d.springjpademo.entities;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link Cars}
 */
public class CarsDto implements Serializable {
    private final Long id;
    private final String carname;

    public CarsDto(Long id, String carname) {
        this.id = id;
        this.carname = carname;
    }

    public Long getId() {
        return id;
    }

    public String getCarname() {
        return carname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarsDto entity = (CarsDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.carname, entity.carname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, carname);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "carname = " + carname + ")";
    }
}