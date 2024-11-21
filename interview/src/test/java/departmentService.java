//import Web.DepRepo;
//import Web.Department;
//import Web.DepartmentService;
//
//import java.util.Optional;
//
//import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;
//
//@ExtendWith(MockitoExtension.class)
//public class departmentService {
//    @Mock
//    public DepRepo depRepo;
//    @InjectMocks
//    public DepartmentService departmentService;
//
//    @Test
//    public void TestForService(){
//        when(depRepo.findById(1L)).thenReturn(Optional.of(new Department(1L,"HR")));
//
//        Department department = departmentService.getDepartment(1L);
//        verify(depRepo,times(1)).findById(1L);
//    }
//
//
//
//}
