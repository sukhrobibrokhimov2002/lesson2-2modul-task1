package uz.pdp.l2v1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.l2v1.entity.Client;

@Projection(name = "CustomClient", types = Client.class)
public interface CustomClient {

    Integer getId();

    String getName();

    String getPhoneNumber();
}
