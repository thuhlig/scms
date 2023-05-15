package de.c4u.scms.persistence.projection;

import org.springframework.beans.factory.annotation.Value;

public interface CustomerProjection {

    @Value("#{target.firstName + ' ' + target.lastName}")
    String getFullName();

    String getMobil();
}
