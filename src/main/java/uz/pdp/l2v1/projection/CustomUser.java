package uz.pdp.l2v1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.l2v1.entity.Users;

@Projection(name = "CustomUser", types = Users.class)
public interface CustomUser {
    Integer getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getCode();

    boolean getActive();

    Long getChatId();

    String getState();
}
