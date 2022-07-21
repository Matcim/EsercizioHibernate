package co.develhope.EsercizioHibernate.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "classes")
    private List<Enrollments> enrollments;
}



