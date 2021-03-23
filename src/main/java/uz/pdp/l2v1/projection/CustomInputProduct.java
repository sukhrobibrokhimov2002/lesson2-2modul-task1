package uz.pdp.l2v1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.l2v1.entity.Input;
import uz.pdp.l2v1.entity.Product;

import java.util.Date;

@Projection(name = "CustomInputProduct", types = CustomInputProduct.class)
public interface CustomInputProduct {
    Integer getId();

    Product getProduct();

    Double getAmount();

    Double gerPrice();

    Date getExpireDate();

    Input getInput();
}
