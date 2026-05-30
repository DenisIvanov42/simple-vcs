package SAP.Project.simple_vcs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SAP.Project.simple_vcs.entity.Comment;
import SAP.Project.simple_vcs.entity.User;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByVersionDocumentId(Long docId);

    List<Comment> findByAuthor(User author);

}