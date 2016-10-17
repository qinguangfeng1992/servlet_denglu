package Junit_Test;


import com.qinguangfeng827.entity.Tblstudent;
import com.qinguangfeng827.impl.ImplStu;
import org.junit.After;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * 这里是  专门用来 测试 的类
 * Created by Administrator on 2016/8/23.
 */


public class Test_Juint_Stu {
    private static Tblstudent tblstudent;
    private static ImplStu implStu;

    @Before
    public void start() {
        tblstudent = new Tblstudent();
        implStu = new ImplStu();
    }


    /**
     * 测试 查询全部的 方法
     */
    @Test
    public void testSelectAll() {


        List<Tblstudent> list = implStu.selectAll();
        for (Tblstudent tblstu : list) {

            System.out.println(tblstu.getStuId() + "\t" + tblstu.getStuName() + "\t" + tblstu.getStuAge() + "\t" + tblstu.getStuSex());
        }


    }


    /**
     * 测试 ==查询 单个学生
     */
    @Test
    public void testSelect() {
        Tblstudent str = implStu.selectId("1008");

        System.out.println(str.getStuId() + "\t" + str.getStuName() + "\t" + str.getStuAge() + "\t" + str.getStuSex());


    }


    /**
     * 测试 //==删除学生信息
     */
    @Test
    public void testDelete() {


        int result = implStu.delete(11);
        System.out.println("受影响" + result + "行！");

    }


    /**
     * 测试 ==修改学生信息
     */
    @Test
    public void testUdpate() {


        tblstudent.setStuId("1021");
        tblstudent.setStuName("陆小凤");
        tblstudent.setStuAge(20);
        tblstudent.setStuSex("男");


        int result = implStu.update(tblstudent);

        System.out.println("受影响" + result + "行！");
    }


    /**
     * 测试增加学生信息
     */
    @Test
    public void testInsert() {


        tblstudent.setStuId("1023");
        tblstudent.setStuName("苏小小");
        tblstudent.setStuAge(20);
        tblstudent.setStuSex("女");


        int result = implStu.insert(tblstudent);
        System.out.println("受影响" + result + "行！");

    }


    @After
    public void end() {

        System.out.println("程序结束了");
    }


}
