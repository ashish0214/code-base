//package Web;
//
//
//import jakarta.persistence.*;
//
//@Entity
//public class Employees {
//@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//private String name;
//private String email;
//private Double salary;
//
//@OneToOne(cascade = CascadeType.ALL)
//@JoinColumn(name="department_id",referencedColumnName = "id")
//private Department department;
//}
