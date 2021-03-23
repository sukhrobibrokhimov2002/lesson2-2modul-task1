package uz.pdp.l2v1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.l2v1.entity.WareHouse;

@Projection(name = "CustomWarehouse", types = WareHouse.class)
public interface CustomWarehouse {


    Integer getId();

    String getName();

}
