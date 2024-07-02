# 웅진 쿠버네티스 역량 강화 스터디 프로젝트
- - -
1. version 정보
   * java 11
   * spring boot 2.7.18
2. dependency 정보
   * org.springframework.boot.spring-boot-starter-web
   * org.projectlombok.lombok
   * org.springframework.boot.spring-boot-starter-test
3. github 주소
   * https://github.com/seamoon-dev-git/wj-sample.git
- - -
### 사이트 호출
1. localhost:8080/
* 응답 결과(웹 화면 노출)
  : 쿠버네티스 역량 강화 스터디 

2. localhost:8080/sample
* 응답 결과(웹 화면 노출)
   : {
  "result": "/sample url 호출",
  "resultCode": 200,
  "resultMsg": "호출 성공"
  }