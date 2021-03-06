package io.reflectoring.boundaries.billingmodule.internal.database.internal;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories
@ComponentScan
class BillingDatabaseConfiguration {

}
