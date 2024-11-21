//package Web;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/dep")
//public class DepController {
//    private  DepartmentService depService;
//    public DepController (){
//        this.depService = depService;
//    }
//    @RequestMapping("/{id}")
//    public ResponseEntity<List<Employees>> getDep(@PathVariable Long id){
//        return new ResponseEntity(depService.getDepartment(id), HttpStatus.OK);
//    }
//}
