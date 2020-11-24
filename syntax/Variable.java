package syntax;
// 변수
// 변수란 해당 공간의 값이 바뀔 수 있는 공간을
// 우리는 변수라고 지칭한다.
// 변수는 크게 기본형 변수와 참조형 변수로 나누어진다.
// 기본형 변수는 해당 공간에 2진법으로 변환된 값이 직접 저장이 된다.
// 참조형 변수는 해당 공간에 주소값이 저장되고 실제 값은 해당 주소를 참조해서 들어가야지 확인 가능하다.

// 기본적으로 모든 변수는
// 자바의 스택 영역에 저장이 되지만,
// 참조형 변수는 해당 공간에 힙 영역으로 향하는 주소값을 가지게 되는것이다.
// 즉,
// 기본형 변수는
// 스택 공간에 값이 저장됨
// 이고
// 참조형 변수는
// 스택 공간에 힙 영역 주소가 저장됨
// 이라는 차이가 있는 것이다.

// 변수는 한 종류의 자료형(datatype)만 저장할 수 있다.

// 변수를 선언하는 방법
// datatype 변수이름

// 변수의 값을 저장(=할당)하는 방법
// 변수이름 = 값

// 선언과 초기화(맨 처음 값을 할당하기)는 한 줄로 가능하다.
// datatype 변수이름 = 값

// 기본형 데이터타입에는 8가지 종류가 있다.
// 정수형: byte short int long
// 실수형: float double
// 문자형: char
// 논리형: boolean

// 참조형 데이터타입에는 3가지 종류가 있다.
// 클래스형, 배열형, 인터페이스형
class Variable {
     static void main(String[] args) {
         //int 형 변수를 하나 만들어보자
         int number;
         
         //number에 5라는 값을 할당해보자
         number = 5;
         
         //number에 저장된 값을 출력해보자
         System.out.println("nember의 현재값: "+number);
         
         //number에 30이라는 값을 할당해보자
         number = 30;
         System.out.println("nember의 현재값: "+number);
     }
}











