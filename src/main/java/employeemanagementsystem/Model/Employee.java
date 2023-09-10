package employeemanagementsystem.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employee_table")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="phone_number")
    @Length(min=10,max=13,message = "please enter correct phone number")
    private String phoneNumber;

    @Column(name="email")
    @Email(message = "please enter correct email")
    private String email;

    @Column(name="job_role")
    private String jobRole;

    @Column(name="salary")
    private int salary;

    @Column(name="address")
    private String address;

}
