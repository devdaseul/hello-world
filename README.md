# Spring Boot + Thymeleaf + JPA 기반 회원가입 프로젝트

---

## 소개

이 프로젝트는 Spring Boot와 Thymeleaf, JPA를 활용하여 회원 정보를 데이터베이스에 저장하는 기능을 구현하였습니다. 
계정 등록 후 Alert 기능을 활용하여 성공 메시지를 화면에 보여줍니다.

---

## 기능

- 회원가입 form 제공 (아이디, 이름, 비밀번호 입력)
- 입력된 회원 정보를 데이터베이스에 저장 (JPA 활용)
- 회원가입 성공 시 Alert 기능을 활용한 메시지 페이지 출력
- Thymeleaf를 이용한 서버 사이드 렌더링

---

## 설치 방법

```bash
git clone https://github.com/devdaseul/project.git
cd project
./mvnw spring-boot:run
```
---

## 사용 방법 설명

1. 웹 브라우저에서 http://localhost:8080/home 접속
2. 아이디, 이름, 비밀번호 입력 후 "가입하기" 클릭
3. 회원가입 성공 메시지 확인

---

## 기술 스택

-Java 21
-Spring Boot 3.2.5
-Thymeleaf
-Spring Data JPA
-Postgresql Database
-Lombok

---
