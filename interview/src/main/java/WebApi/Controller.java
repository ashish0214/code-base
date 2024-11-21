package WebApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    ServiceImple serviceImple;
  @GetMapping()
    ResponseEntity<List<String>> getName(){
        return ResponseEntity.ok(serviceImple.getName());
    }
}
