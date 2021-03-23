package uz.pdp.l2v1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.l2v1.entity.Supplier;

@Projection(name = "CustomSupplier", types = Supplier.class)
public interface CustomSupplier {
    Integer getId();

    String getName();

    String getPhoneNumber();

}
