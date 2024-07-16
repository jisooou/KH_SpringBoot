package com.kh.app99.hello;

import com.kh.app99.HelloWorld;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

public class HelloTest {


//    애노테이션에 All이 달려있는 친구들은
//    맨처음에 실행되어야 하기 때문에,
//    메서드를 static으로 만들어줘야 한다.

    @BeforeAll
    public static void 비포올(){
        System.out.println("HelloTest.비포올");
    }

    @BeforeEach
    public void 비포이치(){
        System.out.println("HelloTest.비포이치");
    }

    @AfterAll
    public static void 애프터올(){
        System.out.println("HelloTest.애프터올");
    }

    @AfterEach
    public void 애프터이치(){
        System.out.println("HelloTest.애프터이치");
    }

    @Test
    public void 회원가입_성공_테스트(){
//        HelloWorld hw = new HelloWorld();
//        int result = hw.plus(10, 20);
//        System.out.println("result = " + result);
//        if(result != 30){
//            throw new RuntimeException();
//        }

        System.out.println("HelloTest.회원가입_성공_테스트");
        HelloWorld helloWorld = new HelloWorld();
        int result = helloWorld.write();

        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void 테스트02(){
        System.out.println("HelloTest.테스트02");
        Assertions.assertThat(1+2).isEqualTo(3);
    }

    @Test
    public void 테스트03(){
        System.out.println("HelloTest.테스트03");
        Assertions.assertThat(10+20).isEqualTo(30);
    }
}
