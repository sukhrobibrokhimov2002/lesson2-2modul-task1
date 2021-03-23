package uz.pdp.l2v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.l2v1.entity.attachment.AttachmentContent;

import java.util.Optional;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {

    Optional<AttachmentContent> findByAttachment_Id(Integer id);
}
