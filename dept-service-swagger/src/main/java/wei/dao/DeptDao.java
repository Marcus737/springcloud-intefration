package wei.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import wei.po.Dept;

public interface DeptDao extends JpaRepository<Dept, Long> {

}
