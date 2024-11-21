//package Web;
//
//import jakarta.persistence.*;
//
//@Entity
//public class Department {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String departmentName;
//
//    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
//    private Employees employee;
//}
