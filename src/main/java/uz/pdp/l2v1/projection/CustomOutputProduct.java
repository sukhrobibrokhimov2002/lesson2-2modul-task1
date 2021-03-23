package uz.pdp.l2v1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.l2v1.entity.Output;
import uz.pdp.l2v1.entity.OutputProduct;
import uz.pdp.l2v1.entity.Product;

@Projection(name = "CustomOutputProduct", types = OutputProduct.class)
public interface CustomOutputProduct {

    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Output getOutput();
}
