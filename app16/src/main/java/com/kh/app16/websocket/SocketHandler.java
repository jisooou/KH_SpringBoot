package com.kh.app16.websocket;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@RequiredArgsConstructor
public class SocketHandler extends TextWebSocketHandler {

    private final Map<String, WebSocketSession> sessionMap = new ConcurrentHashMap<>();

//    연결 이후 동작하는 메서드
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println("SocketHandler.afterConnectionEstablished");
        String msg = "웹소켓 연결완료!";

//        웹소켓 메시지의 자손한테 담아서 보내주기
        TextMessage tm = new TextMessage(msg);
        session.sendMessage(tm);
        sessionMap.put(session.getId(), session);
    }

//    연결 끊길 때 동작하는 메서드
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        System.out.println("SocketHandler.afterConnectionClosed");

        sessionMap.remove(session.getId());
    }

//    메시지 수신했을 때 동작하는 메서드
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        System.out.println("SocketHandler.handleTextMessage");

        Map<String, Object> attributes = session.getAttributes();
        MemberVo loginMemberVo = (MemberVo) attributes.get("loginMemberVo");
        String id = loginMemberVo.getId();

        String msg = id + " : " + message.getPayload();
        Collection<WebSocketSession>sessions = sessionMap.values();
        for (WebSocketSession s : sessions) {
            s.sendMessage(new TextMessage(msg));
        }
    }
}
