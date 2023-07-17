package academy.atl.trivia.entities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "category")
@Data
public class Category {

    @Id //Para que sepa que este atributo es como la pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Funciona como el autoincrement pero en java
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

}
