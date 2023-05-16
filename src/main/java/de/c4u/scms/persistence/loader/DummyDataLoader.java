package de.c4u.scms.persistence.loader;

import com.github.javafaker.Faker;
import de.c4u.scms.persistence.service.CustomerService;
import de.c4u.scms.persistence.service.UserService;
import de.c4u.scms.web.dto.CustomerRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DummyDataLoader implements ApplicationRunner {

    private final CustomerService customerService;

    private final UserService userService;

    @Override
    public void run(ApplicationArguments args) {
        this.userService.create("user1", "password1");

        for (int i = 0; i < 50; i++) {
            Faker f = new Faker();

            var data = new CustomerRequest(
                    f.name().firstName(),
                    f.name().lastName(),
                    f.phoneNumber().cellPhone(),
                    f.address().fullAddress(),
                    null,
                    null);

            this.customerService.create(data);
        }
    }
}
