package com.joseph.repository;
package com.artwood.ordercraft.repository;


import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository<Customer> extends JpaRepository<Customer, Long> {
}
