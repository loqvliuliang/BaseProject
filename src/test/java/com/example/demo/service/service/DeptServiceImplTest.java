package com.example.demo.service.service;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by ll on 2017/7/25.
 */
public class DeptServiceImplTest {
//
//    private DepartmentRepository deptServiceImpl;
//
//    private DepartmentMapper deptMapper;
//
//    private DepartmentServiceImpl deptService;
//    private Integer t;
//
//    @Before
//    public void setUp() throws Exception {
//        deptServiceImpl =  PowerMockito.mock(DepartmentRepository.class);
//        deptService = PowerMockito.mock(DepartmentServiceImpl.class);
//        deptMapper = PowerMockito.mock(DepartmentMapper.class);
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        Mockito.verifyNoMoreInteractions(deptServiceImpl);
//        Mockito.verifyNoMoreInteractions(deptMapper);
//    }
//    @Test
//    public void create() throws Exception {
//        //1.准备数据
//        Department deptment = Department
//                .builder()
//                .id(1L)
//                .name("测试新增")
//                .status(1)
//                .code("8888")
//                .build();
//        ArgumentCaptor<Department> deptmentArgumentCaptor = ArgumentCaptor.forClass(Department.class);
//        PowerMockito.when(deptServiceImpl.save(deptmentArgumentCaptor.capture())).thenReturn(deptment);
//        Department actual = new DepartmentServiceImpl(deptMapper,deptServiceImpl).createTest(deptment);
//        assertThat(deptmentArgumentCaptor.getValue().getName()).isEqualTo("测试新增111");
//        assertThat(actual.getId()).isEqualTo(1L);
//        Mockito.verify(deptServiceImpl,Mockito.times(1)).save(deptmentArgumentCaptor.capture());
//    }
//
//
//    @Test
//    public void testGetDepartmentByName(){
//        //1.准备数据
//        String name = "汉得汇联易";
//        Department deptment = Department
//                .builder()
//                .id(125L)
//                .name("汉得汇联易")
//                .status(1)
//                .code("cd32")
//                .build();
//        //mock方法
//        ArgumentCaptor<Department> deptmentArgumentCaptor = ArgumentCaptor.forClass(Department.class);
//        PowerMockito.when(deptMapper.insert(deptmentArgumentCaptor.capture())).thenReturn(t);
//        //方法调用
//        Department deptments =  new DepartmentServiceImpl(deptMapper,deptServiceImpl).insertDept1(deptment);
//        //verify结果
//        assertThat(deptmentArgumentCaptor.getValue().getName()).isEqualTo("汉得汇联易");
////        Mockito.verify(deptServiceImpl,Mockito.times(1)).save(deptmentArgumentCaptor.capture());
//
//    }

}