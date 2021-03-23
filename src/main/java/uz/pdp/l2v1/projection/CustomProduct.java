package uz.pdp.l2v1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.l2v1.entity.Category;
import uz.pdp.l2v1.entity.Measurement;
import uz.pdp.l2v1.entity.Product;
import uz.pdp.l2v1.entity.attachment.Attachment;

@Projection(name = "CustomProduct", types = Product.class)
public interface CustomProduct {
    Integer getId();

    String getName();

    Category getCategory();

    Attachment getPhotoId();

    String getCode();

    Measurement getMeasurement();

}
