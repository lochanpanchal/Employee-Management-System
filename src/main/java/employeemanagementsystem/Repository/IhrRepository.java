package employeemanagementsystem.Repository;

import employeemanagementsystem.Model.HR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IhrRepository extends JpaRepository<HR,Long> {
    HR findByUsername(String hr);
}
