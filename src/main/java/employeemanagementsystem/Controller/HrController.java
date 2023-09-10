package employeemanagementsystem.Controller;

import employeemanagementsystem.Model.HR;
import employeemanagementsystem.Service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hr")
public class HrController {
    @Autowired
    HRService hrService;





    @PostMapping("/")
    public HR createHR(@RequestBody HR hr) {
        return hrService.createHR(hr);
    }


    @PutMapping("/")
    public HR updateHR(@RequestBody HR hr) {
        return hrService.updateHR(hr);
    }



//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteHR(@PathVariable Long id) {
//        hrService.deleteHR(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
}
