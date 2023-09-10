package employeemanagementsystem.Service;

import employeemanagementsystem.Model.Attendence;
import employeemanagementsystem.Model.Employee;
import employeemanagementsystem.Repository.IAttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttendanceService {
    @Autowired
    IAttendanceRepository attendanceRepository;
    public Attendence recordAttendance(Attendence attendance) {
        return attendanceRepository.save(attendance);
    }

    public List<Attendence> getAttendanceByEmployee(Optional<Employee> employee) {
        return  attendanceRepository.findByEmployee(employee);
    }
}
