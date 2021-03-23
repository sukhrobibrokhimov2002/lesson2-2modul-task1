package uz.pdp.l2v1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.l2v1.entity.attachment.Attachment;
import uz.pdp.l2v1.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends AbsEntity {

    @ManyToOne
    private  Category category;
    @OneToOne
    private Attachment photoId;
    @Column(nullable = false,unique = true)
    private String code;
    @ManyToOne
    private Measurement measurement;


}
