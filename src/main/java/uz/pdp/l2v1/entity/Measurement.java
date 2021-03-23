package uz.pdp.l2v1.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.l2v1.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Measurement extends AbsEntity {

}
