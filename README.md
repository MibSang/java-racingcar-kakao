# java-racingcar-kakao



## 0. 문자열 계산기 (페어 프로그래밍)

### 요구사항 정리

- [x] 숫자가 쉼표또는 콜론으로 구분된 문자열을 입력 받는다.
- [x] 숫자를 모두 더한 값을 출력한다.
- [x] 커스텀 구분자를 설정할 수 있다.
- [x] 커스텀 구분자는 문자열 앞부분에 "//\n"으로 감싼다.
- [x] 잘못된 값이 들어오면 RuntimeException으로 에러 던진다.



### 기능 정의

- 입력 문자열 검사

  - null 문자열 or length 가 0인경우 0
  - 구분자가 없는경우 그냥 숫자
  - 이상한 문자가 들어오는 경우 예외 던지기

- 커스텀 구분자 입력

  - //로 시작하는 문자열인 경우 커스텀 구분자를 등록

- 문자열 split

  - 기본 구분자인 경우
  - 커스텀 구분자인 경우

- 문자열 숫자로 변환

  - 변환 오류 발생시 예외 던지기

- 숫자들 더하기

- 결과 출력하기

  
## 1. 자동차 경주 (1단계) (페어 프로그래밍)


### 요구사항 정리
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.

- 각 자동차에 이름을 부여할 수 있다.

  - 자동차의 이름과 전진한 정도를 함께 출력한다.
  
- 자동차의 이름은 쉽표로 구분하여 5자 이하로 입력 받는다.

  - e.g) pobi,crong,honux
  - 불가!) random, davi, sean

- 시뮬레이션 횟수를 입력 받는다.

- 전진 조건
  - 각 자동차별로 0~9사이의 랜덤 값을 구한다.
  - 0~3 : 정지
  - 4~9 : 전진 

- 횟수가 종료되면 누가 우승했는지를 출력한다
  - 우승자는 한 명 이상일 수 있다.

### 기능 정의

- 게임 진행 도중 화면 입출력(System.i/o) 기능 View 클래스를 정의한다.
  - 자동차 이름 입/출력
  - 시도 회수 입/출력
  - 실행 결과 출력
  - 경주 결과 출력
- 레이싱을 관리하는 클래스를 정의한다.
  - 레이싱 전진 시도 회수를 입력받는다
  - 입력된 이름을 가진 자동차를 생성한다
  - 시도 회수에 따라 자동차에게 전진 시도 요청을 보낸다
  - 레이싱 결과를 반환한다
- 자동차 클래스를 정의한다.
  - 상태로 이름, 나아간 정도를 가진다
  - 동작으로 전진시도하는 행동을 가진다