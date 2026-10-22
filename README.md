<details> 
<summary> #Chapter01 -Java 기초</summary>

## 자바의 특징
- 이식성이 좋다 (모든 운영체제에서 실행이 가능)
- 자동 메모리 해제 (가비지 컬렉션) => 필요시엔 직접 호출 (System.gc())
- 객체 지향 프로그램 : 조립식 ex) 메인보드
- 풍부한 라이브러리 존재

## 주의점
- 모든 프로그램은 main()을 필요로 한다.
- public 클래스명과 파일명이 동일해야 한다. ex) public class Main -> Main.java
- 클래스명, 변수명 등에는 가급적 한글을 사용하지 않는다.

## 주석
- 여러줄 주석 "/ * * /" => ctrl + shift + / 
- 해제  => ctrl + shift + \
- 한줄 주석 // => ctrl + /

## 컴파일과 실행
- Java는 소스 코드를 컴파일하여 바이트코드로 변환한 후 JVM에서 실행한다.

```text
Java 소스 코드 (A.java)
          |
          | javac (컴파일러)
          ▼
    A.class (바이트코드)
          |
          | java (JVM 실행)
          ▼
      프로그램 실행
```
</details>

# Chapter02 - 변수

## 변수
- 한개의 데이터를 저장하는 메모리 공간
- 모든 프로그래밍 언어는 RAM에 저장

## 변수의 기본형

1. 정수 타입

| 자료형 | 크기 | 저장되는 값의 범위 |
|---|---|---|
| `byte` | 1byte (8bit) | -128 ~ 127 |
| `char` | 2byte (16bit) | 0 ~ 65,535 |
| `short` | 2byte (16bit) | -32,768 ~ 32,767 |
| `int` | 4byte (32bit) | -2,147,483,648 ~ 2,147,483,647 |
| `long` | 8byte (64bit) | -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 |


2. 실수 타입
     
| 자료형 | 크기 | 저장되는 값의 범위 (양의 값 기준) |
|---|---|---|
| `float` | 4byte (32bit) | 1.4E-45 ~ 3.4028235E38 |
| `double` | 8byte (64bit) | 4.9E-324 ~ 1.7976931348623157E308 |



3. 논리 타입
 
| 자료형 | 크기 | 저장되는 값의 범위 |
|---|---|---|
| `boolean` | JVM 구현에 따라 다름 | `true`, `false` |

## 타입 변환
1. 자동(묵시적) 타입 변환
- 작은 크기의 타입이 큰 크기의 타입에 저장될 때 발생한다.
```text
byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
// 단 char는 음수가 저장될 수 없어 byte -> char 자동 변환 불가
```

2. 강제(명시적) 타입 변환 (Casting)
- 큰 타입을 작은 타입으로 쪼개어 저장하는것.
```text
int intValue = 103029770;
byte byteValue = (byte)intValue;
// 결과 : 10 (마지막 1byte만 저장)
```

# Chapter03 - 연산자

## 연산자
1. 산술 연산자 (계산)
- 숫자를 계산할 때 사용한다.

| 연산자 | 설명 | 예시 | 결과 |
|---|---|---|---|
| `+` | 덧셈 | `10 + 3` | `13` |
| `-` | 뺄셈 | `10 - 3` | `7` |
| `*` | 곱셈 | `10 * 3` | `30` |
| `/` | 나눗셈 (몫) | `10 / 3` | `3` |
| `%` | 나머지 | `10 % 3` | `1` |

2. 대입 연산자 (값 저장)
- 변수에 값을 저장하거나 갱신할 때 사용한다

| 연산자 | 설명 | 예시 | 동일한 표현 |
|---|---|---|---|
| `=` | 오른쪽 값을 왼쪽 변수에 대입 | `a = 10` | `a = 10` |
| `+=` | 더한 결과를 대입 | `a += 3` | `a = a + 3` |
| `-=` | 뺀 결과를 대입 | `a -= 3` | `a = a - 3` |
| `*=` | 곱한 결과를 대입 | `a *= 3` | `a = a * 3` |
| `/=` | 나눈 결과를 대입 | `a /= 3` | `a = a / 3` |
| `%=` | 나머지를 대입 | `a %= 3` | `a = a % 3` |

3. 비교 연산자 (크기 비교)
- 두 값을 비교할 때 사용한다.

| 연산자 | 설명 | 예시 | 결과 |
|---|---|---|---|
| `==` | 두 값이 같으면 참 | `10 == 10` | `true` |
| `!=` | 두 값이 다르면 참 | `10 != 5` | `true` |
| `>` | 왼쪽 값이 크면 참 | `10 > 5` | `true` |
| `<` | 왼쪽 값이 작으면 참 | `10 < 5` | `false` |
| `>=` | 왼쪽 값이 크거나 같으면 참 | `10 >= 10` | `true` |
| `<=` | 왼쪽 값이 작거나 같으면 참 | `10 <= 5` | `false` |

4. 논리 연산자 (조건 연결)
- 여러 조건을 조합할 때 사용한다.

| 연산자 | 설명 | 예시 | 결과 |
|---|---|---|---|
| `&&` | AND (논리곱) - 모두 참이면 참 | `true && false` | `false` |
| `\|\|` | OR (논리합) - 하나라도 참이면 참 | `true \|\| false` | `true` |
| `!` | NOT (논리 부정) - 참과 거짓을 반대로 변경 | `!true` | `false` |

5. 증가 / 감소 연산자
- 변수의 값을 1 증가 / 감소 시킬 때 사용한다.

| 연산자 | 설명 | 예시 | 동작 |
|---|---|---|---|
| `++` | 전위 증가 | `++a` | 값을 1 증가시킨 후 사용 |
| `++` | 후위 증가 | `a++` | 현재 값을 사용한 후 1 증가 |
| `--` | 전위 감소 | `--a` | 값을 1 감소시킨 후 사용 |
| `--` | 후위 감소 | `a--` | 현재 값을 사용한 후 1 감소 |

6. 삼항 연산자
- 조건에 따라 두 값 중 하나를 선택할 때 사용합니다.

| 연산자 | 설명 | 예시 | 결과 |
|---|---|---|---|
| `? :` | 조건이 참이면 첫 번째 값, 거짓이면 두 번째 값 선택 | `10 > 5 ? "참" : "거짓"` | `"참"` |

# Chapter04 - 제어문

## 조건문
1. if문
- 조건이 참일 때만 실행
       
```java
if (score >= 60) {
    System.out.println("합격")
}
```

2. if~else문
- 참과 거짓 중 하나 선택

```java
int age = 20;

if (age >= 19) {
    System.out.println("성인입니다.");
} else {
    System.out.println("미성년자입니다.");
}
```

3. 다중 조건문 (if~else if)
- 여러 조건을 순서대로 검사

```java
int score = 85;

if (score >= 90) {
    System.out.println("A학점");
} else if (score >= 80) {
    System.out.println("B학점");
} else if (score >= 70) {
    System.out.println("C학점");
} else if (score >= 60) {
    System.out.println("D학점");
} else {
    System.out.println("F학점");
}
```

4. 중첩 if문
- 조건 안에 또 다른 조건 검사

```java
if (age >=20) {
    if (ticket) {
        System.out.println("입장 가능");
    }
}
```

5. switch문
- 값이 일치하는 경우 실행

```java
switch (menu) {
    case 1: System.out.println("커피");
        break;
    case 2: System.out.println("주스");
        break;
    default: System.out.println("물");
}
```

java 12 이후부터는  switch문에서 Expressions를 사용할 수 있다
```java
switch (menu) {
    case 'A', 'a' -> {
          System.out.println("우수 회원입니다.");
    }
    case 'B', 'b' -> {
          System.out.println("일반 회원입니다.");
    }
    case 'C', 'c' -> {
          System.out.println("손님입니다.");
    }
```

## 반복문

1. for 문
- 반복 횟수가 정해져 있을 때
```java
for (int i = 1; i <= 100; i++) {
    sum = sum + i;
}
System.out.println(sum);
```

2. while 문
- 조건을 먼저 검사할 때
```java
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

3. do~while 문
- 최소 한 번은 실행해야 할 때
```java
do {
    System.out.println(i);
} while (i <= 5);
```

## 반복제어문

1. break
- 현재 반복문을 즉시 빠져나온다
```java
for(int i=1; i<=5; i++) {
   if(i==3) {
      break; // i가 3이면 반복문 종료
   }
   System.out.println(i);
}
System.out.println("종료")
```

2. continue
- 현재 반복의 남은 코드를 건너뛰고 다음 반복으로 넘어갑니다.
```java
for(int i=1; i<=5; i++) {
   if(i==3) {
      continue; // i가 3이면 건너뛰기
   }
   System.out.println(i);
}
```

3. label break;
- label을 지정하고, 해당 label이 붙은 반복문 전체를 빠져나온다.
```java
outer:
for(int i=1; i<=3; i++) {
    for(int j=1; j<=3; j++) {
        System.out.println(i + "." + j);

        if(i==2 && j==2) {
            break outer; // outer 반복문 종료
        } 
    }
}
```

## 문자열 (String)

 - String은 한번 생성되면 내용이 변하지 않는 '불변(Immutable)' 객체이다
```text
String s = "Java"를 생성한 후
s = "Python"을 작성해도 "Java"는 사라지지 않는다.
"Java" 객체는 남아있고 새로운 s = "Python" 객체가 생성된다.
```
 - String 문자열 값 비교는 '==' 대신 'equals()' 사용
```text
String s = "Java";
String ss = "Java";
boolean b = s == ss; 는 true이지만

String s = "Java";
String ss = new String("java");
boolean b = s == ss; 는 false
boolean b = s.equals(ss); 는 true이다.

== 메모리 주소를 비교하고 'equals()'는 실제 문자열 내용값을 비교한다.
```

## 배열

- 배열이란? 배열은 같은 자료형의 데이터를 여러 개 저장할 수 있는 자료구조이다.

- 주요 목적
  1. 여러 데이터 관리 (예: 점수, 이름, 상품 등)
  2. 반복 처리 (for문, for-each문)
  3. 데이터 검색과 정렬 (특정 값 찾기, 최댓값 구하기 등)
  4. 데이터 전달과 복사 (메서드에 전달, 데이터 분리)
  5. 자료구조 학습의 기초 (ArrayList, 컬렉션, DTO 등)
 
- 배열 구조와 메모리 저장
