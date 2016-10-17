package Junit_Test;


import com.qinguangfeng827.entity.Tblcourse;


import com.qinguangfeng827.impl.ImplCous;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * 这里是  专门用来 测试 的类
 * Created by Administrator on 2016/8/23.
 */


public class Test_Juint_Cour {

    private static Tblcourse tblcourse;
    private static ImplCous implCous;

    @Before
    public void start() {
        tblcourse = new Tblcourse();
        implCous = new ImplCous();
    }


    /**
     * 测试 查询全部的 方法
     */
    @Test
    public void testSelectCousAll() {
        List<Tblcourse> list = implCous.selectCousAll();
        for (Tblcourse tblcour : list) {

            System.out.println(tblcour.getCourseId() + "\t" + tblcour.getCourseName() + "\t" + tblcour.getTeaId());
        }


    }


    /**
     * 测试 ==查询 单个学生
     */
    @Test
    public void testSelectCousId() {


        Tblcourse str = implCous.selectCousId("001");

        System.out.println(str.getCourseId() + "\t" + str.getCourseName() + "\t" + str.getTeaId());


    }


    /**
     * 测试 //==删除学生信息
     */
    @Test
    public void testDeleteCous() {


        int result = implCous.deleteCous("018");
        System.out.println("受影响" + result + "行！");

    }


    /**
     * 测试 ==修改学生信息
     */
    @Test
    public void testupdateCous() {


        tblcourse.setCourseId("018");
        tblcourse.setCourseName("陆小凤");
        tblcourse.setTeaId("002");


        int result = implCous.updateCous(tblcourse);

        System.out.println("受影响" + result + "行！");
    }


    /**
     * 测试增加学生信息
     */
    @Test
    public void testInsertCous() {


        tblcourse.setCourseId("018");
        tblcourse.setCourseName("苏小小");
        tblcourse.setTeaId("20");


        int result = implCous.insertCous(tblcourse);
        System.out.println("受影响" + result + "行！");

    }


    @After
    public void end() {

        System.out.println("\n程序结束了");
    }


}
