package teamproject.aipro.domain.health.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthController {

    private final static String HEALTH_CHECK = "Application is running.";

    @GetMapping
    public ResponseEntity<String> check() {
        return ResponseEntity.ok(HEALTH_CHECK);
    }

}
