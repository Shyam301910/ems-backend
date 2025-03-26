package net.javaguides.ems.entity;

//import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("employees")
public class Employee {

//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
//    @Column(nullable = false)
    private String firstName;
//    @Column(nullable = false)
    private String lastName;
//    @Column(nullable = false,unique = true)
    private String email;
}
