package employeemanagementsystem.Service;


import employeemanagementsystem.Model.HR;
import employeemanagementsystem.Repository.IhrRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HRService {

    IhrRepository ihrRepository;
    public HR createHR(HR hr) {
        return ihrRepository.save(hr);
    }

    public HR updateHR(HR hr) {
        return ihrRepository.save(hr);
    }

//    public HR deleteHR(Long id) {
//
//        Optional<HR> existingHR = ihrRepository.findById(id);
//
//        if(existingHR.isPresent()){
//            HR hrToDelete = existingHR.get();
//            ihrRepository.delete(hrToDelete);
//            return  hrToDelete;
//        }
//        else{
//            throw new HRNotFoundException("HR record not found");
//        }
//
//    }
}
