package employeemanagementsystem.Controller;

import employeemanagementsystem.Model.Attendence;
import employeemanagementsystem.Model.Employee;
import employeemanagementsystem.Service.AttendanceService;
import employeemanagementsystem.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {
    @Autowired
    AttendanceService attendanceService;

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/record")
    public Attendence recordAttendance(@RequestBody Attendence attendance) {
        return attendanceService.recordAttendance(attendance);
    }


    @GetMapping("/employee/{employeeId}")
    public List<Attendence> getAttendanceByEmployee(@PathVariable Long employeeId) {
        Optional<Employee> employee = employeeService.getEmployeeById(employeeId);
        return attendanceService.getAttendanceByEmployee(employee);
    }
}
