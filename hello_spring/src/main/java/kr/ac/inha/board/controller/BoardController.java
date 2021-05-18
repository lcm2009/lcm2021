package kr.ac.inha.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//노란 밑줄된 import는 없애야하는데
//단축키가 ctrl + shift + o 이다 (import 정리)

//컨트롤러 역할을 한다고 얘기해줘야함 지정해주지 않는다면 하나인 클래스일뿐
//메인이란것은 실행흐름이 정해져있는데 스프링은 내가 정하는게 아니니까 메인 안씀
//다만 컨트롤러로 쓸 클래스를 만들어서 활용할뿐

@RestController //앞으로 이 역할을 할 클래스가됨
//restcontroller 가 없어도 실행은 되지만 매핑을 하지못한다.
public class BoardController {
	//원래라면 new해서 써야지만 스프링에선 new 안함
	//실행한다고 무조건 hello world가 나오는게 아님
	//서버 프로그램은 요청받았을때 나오도록 지정해야함
	@RequestMapping("/hello") //hello라는 리퀘스트(요청)을 받으면 hello wolrd를 리턴해줘라
	public String hello() {
		return "hello world!!";
	}
	
	//파라미터 받아쓰기
	//inha?param=www. 이런식으로 파라미터를 준다
	//?param=www. <-- 겟방식 인터넷에서 요청할 때 방식
	//param 명과 인터넷 브라우저에서 넘겨주는 명이 똑같으면 넘겨받는다
	//똑같이 자바랑 같이 짜지만 메인메소드를 작성하는게 아니라 
	//리퀘스트에 맵핑되는 사용자의 요청을 처리해줄 수 있는 메소드 작성
	//사용자가 요청한 시점에 하나하나가 메인메소드가 된다 생각 
	@RequestMapping("/inha")
	public String inha(String param) {
		return param + "inha.ac.kr";
	}
	
	//연습문제 2
	//파라미터로 아이디를 입력받아 출력
	@RequestMapping("/name")
	public String name(String id) {
		return "당신의 학번은 " + id + "입니다.";
	}
	
	//스프링프레임워크는 mvc 패턴 방식으로 동작하는데 그걸 가능케 하는게 어노테이션(@)으로 
	//주의해야할 점 컨트롤러 만들때는 무조건 컨트롤러로 끝내야함 클래스명 관습
	//똑같은 내용을 작성하면 에러난다 헬로우라는 매핑이 2개있으면 뭘 호출해야할지 몰라 에러
	//+퀘스트 매핑은 동일이름 불가, 그안에 있는 메소드 명은 상관이 없다+
	
	//git 연결 Team - share Project
	
	
	//연습문제 3
	//구구단
	
}
