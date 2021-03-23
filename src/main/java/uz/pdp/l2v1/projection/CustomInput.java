package uz.pdp.l2v1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.l2v1.entity.Currency;
import uz.pdp.l2v1.entity.Input;
import uz.pdp.l2v1.entity.Supplier;
import uz.pdp.l2v1.entity.WareHouse;

import java.util.Date;

@Projection(name = "CustomInput", types = Input.class)
public interface CustomInput {
    Date getDate();

    Integer getId();

    WareHouse getWareHouse();

    Supplier getSupplier();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();
}
