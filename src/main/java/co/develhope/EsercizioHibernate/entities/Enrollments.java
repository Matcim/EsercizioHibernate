package co.develhope.EsercizioHibernate.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Enrollments {

  @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classes_id",referencedColumnName = "id")
    private Classes classes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "students_id",referencedColumnName = "id")
    private Students students;
}
