package employeemanagementsystem.Repository;


import employeemanagementsystem.Model.Attendence;
import employeemanagementsystem.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface IAttendanceRepository extends JpaRepository<Attendence,Long> {
    List<Attendence> findByEmployeeIdAndDataBetween(Long employeeId, LocalDate startDate, LocalDate endDate);

    List<Attendence> findByEmployee(Optional<Employee> employee);
}
