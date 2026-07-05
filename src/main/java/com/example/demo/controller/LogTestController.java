package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController {

    // 💡 SLF4J 로거 인터페이스 선언
    private static final Logger log = LoggerFactory.getLogger(LogTestController.class);

    @GetMapping("/api/log-test")
    public String logTest() {
        // 로그 레벨별 기록 테스트
        log.info("INFO 레벨 로그: 사용자 로그 테스트 요청이 들어왔습니다.");
        log.warn("WARN 레벨 로그: 시스템에 잠재적인 경고 상황을 시뮬레이션합니다.");
        log.error("ERROR 레벨 로그: 예외 발생 시 인프라/운영팀이 감지해야 하는 로그입니다.");

        return "로깅 시스템 연동 성공! 프로젝트 하위의 log 폴더를 확인해 보세요.";
    }
}