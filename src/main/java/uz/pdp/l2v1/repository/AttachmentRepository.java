package uz.pdp.l2v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.l2v1.entity.attachment.Attachment;



public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
    boolean existsByOriginalName(String originalFilename);
}
