package ra.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient(name = "account-service")
public interface AccountServiceClient {
    @GetMapping("/api/accounts/{id}/balance")
    BigDecimal getBalance(@PathVariable Long id);

    @PutMapping("/api/accounts/{id}/update-balance")
    void updateBalance(@PathVariable Long id, @RequestParam BigDecimal amount);
}