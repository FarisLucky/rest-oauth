package restfulapi.spring.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import restfulapi.spring.web.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
