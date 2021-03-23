package uz.pdp.l2v1.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.l2v1.entity.template.AbsEntity;


import javax.persistence.Entity;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class WareHouse  extends AbsEntity {

}
