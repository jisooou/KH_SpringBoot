package com.kh.app07.advice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice(annotations = {Controller.class, RestController.class})
public class KhControllerAdvice {

//    여러 개의 ExceptionHandler가 있다면,
//    우선순위: 좁은 error > 넓은 error

    @ExceptionHandler(NullPointerException.class)
    public void m01(Model model){
        System.out.println("KhControllerAdvice.m01");
    }

//    다른 예외를 처리하기 위해서 만듦.
    @ExceptionHandler(ArithmeticException.class)
    public void m02(){
        System.out.println("KhControllerAdvice.m02");
    }

//    모든 예외를 받아버리도록 상위타입으로 지정해 준다.
    @ExceptionHandler(Exception.class)
    public void m03(){
        System.out.println("KhControllerAdvice.m03");
    }

}
