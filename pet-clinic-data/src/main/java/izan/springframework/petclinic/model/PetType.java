package izan.springframework.petclinic.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "types")
public class PetType extends BaseEntity{

    @Column(name = "name")
    private String name;


}
