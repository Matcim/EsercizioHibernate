package co.develhope.EsercizioHibernate.entities;



import lombok.Data;


import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Students  {

   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

   @Column(nullable = false)
   private String lastName;

   @Column(nullable = false)
   private String firstName;

   @Column(unique = true,nullable = false)
   private String email;

   @OneToMany(mappedBy = "students")
    private List<Enrollments> enrollments;

}
