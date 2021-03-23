package uz.pdp.l2v1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.l2v1.entity.template.AbsEntity;


import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Supplier extends AbsEntity {

    private String phoneNumber;
}
