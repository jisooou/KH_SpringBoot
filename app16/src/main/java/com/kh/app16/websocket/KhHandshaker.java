package com.kh.app16.websocket;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import java.lang.reflect.Member;
import java.util.Map;

public class KhHandshaker implements HandshakeInterceptor {


    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {

        ServletServerHttpRequest a = (ServletServerHttpRequest) request;
        HttpServletRequest req = a.getServletRequest();
        HttpSession hs = req.getSession();

        MemberVo loginMemberVo = (MemberVo) hs.getAttribute("loginMemberVo");

        attributes.put("loginMemberVo", loginMemberVo);

        return loginMemberVo != null;
    }

    @Override
    public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Exception exception) {

    }
}
