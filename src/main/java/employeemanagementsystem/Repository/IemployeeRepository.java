package employeemanagementsystem.Repository;

import employeemanagementsystem.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IemployeeRepository extends JpaRepository<Employee, Long> {
}
