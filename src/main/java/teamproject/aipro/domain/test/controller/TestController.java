package teamproject.aipro.domain.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/health")
    public ResponseEntity<String> check() {
         return ResponseEntity.ok("OK");
//       return ResponseEntity.status(HttpStatus.BAD_REQUEST)
//           .body("BAD_REQUEST");
    }

    @GetMapping("/ver")
    public int getVersion() {
        return 2;
    }

    @GetMapping("/rollback")
    public ResponseEntity<String> rollback() {
        return ResponseEntity.ok("OK");
    }

}
