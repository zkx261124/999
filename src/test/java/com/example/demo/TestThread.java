package com.example.demo;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

class SubThread extends Thread{
    public void  run(){
        for (int i=0;i<100000;i++){
            System.out.println(Thread.currentThread().getName()+"///"+i+"--优先级---》"+Thread.currentThread().getPriority());
        }
    }
}class SubThread2 extends Thread{
    public void  run(){
        for (int i=0;i<100000;i++){

            System.out.println(Thread.currentThread().getName()+"---"+i+"--优先级---》"+Thread.currentThread().getPriority());
        }
    }
}
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestThread {
    public static void main(String[] args){
        SubThread subThread=new SubThread();
        SubThread2 subThread2=new SubThread2();
        subThread.setName("zkx");
        subThread2.setName("wxh");
        subThread2.setPriority(6);
        subThread.start();
        subThread2.start();

        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"sss:"+i);
            if(i%1000==0){Thread.currentThread().yield();}
        }
    }
}
