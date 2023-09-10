package employeemanagementsystem.Service;

import employeemanagementsystem.Model.Attendence;
import employeemanagementsystem.Model.Employee;
import employeemanagementsystem.Repository.IAttendanceRepository;
import employeemanagementsystem.Repository.IemployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    IemployeeRepository iemployeeRepository;

    @Autowired
    IAttendanceRepository attendanceRepository;

    public List<Employee> getAllEmployees() {
        return iemployeeRepository.findAll();
    }

    public Employee createEmployee(Employee employee) {
        return iemployeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return iemployeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        iemployeeRepository.deleteById(id);
    }

    public double calculateSalary(Long employeeId, LocalDate startDate, LocalDate endDate) {
        List<Attendence> attendenceList = attendanceRepository.findByEmployeeIdAndDataBetween(employeeId,startDate,endDate);

        Employee employee = iemployeeRepository.findById(employeeId).orElse(null);

        if(employee != null){
            int totalDaysPresent = attendenceList.size();
            double perDaySalary = employee.getSalary();
            return totalDaysPresent * perDaySalary;
        }
        return  -1;
    }

    public Optional<Employee> getEmployeeById(Long employeeId) {
        return  iemployeeRepository.findById(employeeId);
    }
}
