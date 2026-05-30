package SAP.Project.simple_vcs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SAP.Project.simple_vcs.entity.User;
import SAP.Project.simple_vcs.entity.Version;

@Repository
public interface VersionRepository extends JpaRepository<Version,Long>{
    List<Version> findByDocumentIdOrderByVersionNumberDesc(Long documentId);

    List<Version> findByAuthor(User author); 
    
    List<Version> findByReviewer(User reviewer); 

}
