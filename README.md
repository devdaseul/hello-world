# Spring Boot + Thymeleaf + JPA 기반 회원 가입 및 로그인 프로젝트

---

## 📌 소개

이 프로젝트는 Spring Boot, Thymeleaf, JPA를 기반으로 한 **회원가입 및 로그인 기능**을 구현한 웹 애플리케이션입니다.  
회원정보는 데이터 베이스에 저장되며, 로그인 성공/실패에 따라 알림 메시지와 이동 페이지가 동작합니다.

---

## ✅ 주요 기능

- 회원가입 form 제공 (아이디, 이름, 비밀번호 입력)
- 입력된 회원 정보를 데이터베이스에 저장 (JPA 활용)
- 회원가입 성공 시 Alert 기능을 활용한 메시지 페이지 출력
- Thymeleaf를 이용한 서버 사이드 렌더링
- Spring Session을 이용한 로그인 상태 유지
  
---

## 🚀 프로젝트 실행 방법

### 1. 프로젝트 클론 및 실행

```bash
git clone https://github.com/devdaseul/project.git
cd project
./mvnw spring-boot:run
```

또는 Maven 설치된 경우:

```bash
mvn spring-boot:run
```

### 2. 브라우저 접속
http://localhost:8080

---

## 🖥️ 사용 방법

🌟 기본 흐름
1. 시작 페이지: http://localhost:8080 → 자동으로 로그인 페이지로 이동됨

2. 로그인 시도: 유효한 계정 ID와 비밀번호 입력 시 /hello 페이지로 이동
   - 없는 ID 입력 시: “존재하지 않는 ID입니다” 메시지 출력
   - 비밀번호 틀릴 시: “비밀번호가 틀렸습니다” 메시지 출력

3. 회원가입 페이지 이동: 로그인 페이지에서 “회원가입 하러 가기” 클릭 시 /register 이동

4. 회원가입 후: 성공 메시지 출력 후 로그인 페이지로 이동

---

## 🛠 기술 스택

- Java 21
- Spring Boot 3.2.5
- Spring Data JPA
- Thymeleaf
- Lombok
- PostgreSQL (또는 원하는 DB 설정 가능)
- Maven

---

## 📂 프로젝트 구조

```css
src
 └─ main
     └─ java/com/lily/project
         ├─ controller/AlertController.java
         ├─ entity/Account.java
         └─ repository/AccountRepository.java
```
---

## 📌 참고사항

- 현재 비밀번호는 암호화 없이 저장되며, 추후 암호화 기능 추가 예정입니다.

