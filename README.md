<details> 
<summary><h2>Chapter01 - Java 기초</h2></summary>

## 자바의 특징
- 이식성이 좋다 (모든 운영체제에서 실행이 가능(.class) 바이트 코드) 단, JVM 자체는 OS 종속적이다.
- 자동 메모리 해제 (가비지 컬렉션)
- 객체 지향 프로그램 => 부품화를 통해 재사용성과 유지보수성 향상
- 풍부한 라이브러리 존재

## 주의점
- Java의 진입점이 public static void main(String[] args)이다.
- public 클래스명과 파일명이 동일해야 한다. ex) public class Main -> Main.java
- 클래스명, 변수명 등에는 가급적 한글을 사용하지 않는다.

## 주석
- 한줄 주석 // 내용
- 여러줄 주석 "/* 내용 */"
- 문서화 주석 "/** */"


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

<details>
<summary><h2>Chapter02 - 변수</h2></summary>

## 변수
- 한개의 데이터를 저장하는 메모리 공간
- 프로그램 실행 시 변수는 메모리(RAM)에 할당되어 데이터를 저장하고 관리한다.

## 변수의 기본형

1. 정수 타입

| 자료형 | 크기 | 저장되는 값의 범위 |
|---|---|---|
| `byte` | 1byte (8bit) | -128 ~ 127 |
| `char` | 2byte (16bit) | 0 ~ 65,535 |
| `short` | 2byte (16bit) | -32,768 ~ 32,767 |
| `int` | 4byte (32bit) | -2,147,483,648 ~ 2,147,483,647 |
| `long` | 8byte (64bit) | -9,223,372,036,854,775,808L ~ 9,223,372,036,854,775,807L |


2. 실수 타입
     
| 자료형 | 크기 | 저장되는 값의 범위 (양의 값 기준) |
|---|---|---|
| `float` | 4byte (32bit) | 1.4E-45F ~ 3.4028235E38F |
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
// 단 char는 음수가 저장될 수 없어 byte, short -> char 자동 변환 불가
```

2. 강제(명시적) 타입 변환 (Casting)
- 큰 타입을 작은 타입으로 쪼개어 저장하는것.
- 상위 바이트가 잘려나가며 데이터 손실이 발생할 수 있다.
```text
int intValue = 103029770;
byte byteValue = (byte)intValue;
// 결과 : 10 (마지막 1byte만 저장)
```
</details>

<details>
<summary><h2>Chapter03 - 연산자</h2></summary>

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

- 나눗셈의 특성
  
```text
1. 정수 값으로 나눌 시 실수가 값이 실수가 아닌 정수로 반환된다.
   5 / 2 는 2.5가 아닌 2가 반환된다.
   실수의 값을 원할시 (double)5 / 2 or 5 / 2.0 등과 같이 실수로 변환해줘야한다.

2. 정수를 0으로 나누거나 나머지를 구할 때 (ArithmeticException)이 발생한다.
   단, 실수를 0으로 나누면 에러가 아닌 Infinity / NaN이 발생한다.
   /는 Infinity, %는 NaN
```

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
</details>

<details>
<summary><h2>Chapter04 - 제어문</h2></summary>

## 조건문
1. if문
- 조건이 참일 때만 실행
       
```java
if (score >= 60) {
    System.out.println("합격");
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
int sum = 0;
for (int i = 1; i <= 100; i++) {
    sum = sum + i;
}
System.out.println(sum);
```

1-1. for-each 문
- 배열을 순회할 때 인덱스를 직접 사용하지 않고 요소를 하나씩 꺼낼 수 있다.
```java
int[] numbers = {10, 20, 30, 40, 50};

for(int num : numbers) {
    System.out.print(num + " ");
}
```

2. while 문
- 조건을 먼저 검사할 때
```java
int i = 1;
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
    i++;
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
System.out.println("종료");
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
</details>

<details>
<summary><h2>Chapter05 - 참조타입</h2></summary>
          
## 참조타입 저장 방법
- 기본형 변수는 실제 값을 저장한다.
- 참조형 변수는 객체를 가르키는 참조값을 저장한다.
- 일반적으로 지역 변수는 스텍(Stack)에서 관리되고, 생성된 객체와 배열은 힙(Heap) 영역에서 관린된다.
- 참조변수의 저장된 값은 객체의 실제 메모리 주소와 반드시 동일한 것은 아니다.
          
## 문자열 (String)

 - String은 한번 생성되면 내용이 변하지 않는 '불변(Immutable)' 객체이다
```text
String s = "Java"를 생성한 후
s = "Python"을 작성해도 "Java"는 사라지지 않는다.
"Java" 객체는 남아있고 새로운 s = "Python" 객체가 생성된다.
```
 - String 문자열 값 비교는 '==' 대신 'equals()' 사용
```java
String s = "Java";
String ss = "Java";
boolean b = s == ss; 는 true이지만

String s = "Java";
String ss = new String("Java");
boolean b = s == ss; 는 false
boolean b = s.equals(ss); 는 true이다.

== 메모리 주소를 비교하고 'equals()'는 실제 문자열 내용값을 비교한다.
```

- 문자열 제어 메소드
```text
    1. equals() : 문자열 자체 비교, 대소문자 구분됨
    2. length() : 문자열의 갯수
    3. indexOf() / lastIndexOf() => 지정한 문자의 index번호를 반환 찾는 문자열 없는경우 -1 반환
    4. trim() / strip() : 좌우의 공백 제거 strip()는 JDK 11부터 지원, 유니코드를 지원해준다.
    5. toUpperCase() / toLowerCase() : 문자열을 대문자 / 소문자로 변환
    6. concat() : 문자열 결합 "+"가 있기 때문에 사용 빈도가 적다.
    7. replace() : 문자 / 문자열 변환
    8. startsWith() : 앞의 문자열이 같은 경우 조회
    9. endsWith() : 뒤의 문자열이 같은 경우 조회
    10. contains() : 문자열을 포함하는 경우 조회
    11. valueOf() : 모든 데이터형을 문자열로 변경
    12. format() : 형식에 맞게 문자열 변환
    13. split() : 지정된 문자를 잘라서 배열에 저장
    14. substring() : 지정한 인덱스 범위의 문자열을 반환
    15. substring(int start) : 인덱스 번호가 start부터 나머지 전체
    16. substring(int start, int end) : 인덱스 번호가 start부터 시작 end -1까지
```

## 문자열 배열(String Array)

- 여러개의 문자열을 하나의 배열로 관리하는 자료구조입니다.

- 선언과 초기화
```java
String[] names = {"민수", "영희", 철수"};
System.out.println(names[0]); // 민수
System.out.println(names[1]); // 영희
System.out.println(names[2]); // 철수

String[] names = new String[30];
으로 생성했다면 항목은 모두 null로 초기화한다.
```
        
## 배열

- 배열이란? 배열은 같은 자료형의 데이터를 여러 개 저장할 수 있는 자료구조이다.
  
- 장점
```text
  1. 빠른 접근 속도 => 인덱스 번호를 이용한다.
  2. 배열은 요소를 연속적인 구조로 관리하므로 순차 접근 시 CPU 캐시 지역성 측면에서 유리할 수 있다.
  3. 간단한 구현 => 배열의 데이터 저장 구조가 단순하다.
  4. 고정된 크기 => 메모리의 사용량을 예측 = 메모리 관리가 쉽다.
```
- 단점
```text
  1. 고정된 크기 => 추가, 삭제시에 어렵다 (비용이 많이 투자)
  2. 메모리 낭비 => 크게 만들면 사용이 안되는 메모리가 존재할 수 있다.
  3. 같은 데이터형만 저장된다. => 유연성이 떨어진다.
```

- 주요 목적
```java
  1. 여러 데이터 관리 (예: 점수, 이름, 상품 등)
  2. 반복 처리 (for문, for-each문)
  3. 데이터 검색과 정렬 (특정 값 찾기, 최댓값 구하기 등)
  4. 데이터 전달과 복사 (메서드에 전달, 데이터 분리)
  5. 자료구조 학습의 기초 (ArrayList, 컬렉션, DTO 등)
```
 
- 배열의 생성 방법
```java
데이터형[] 배열명; => Java 권장
int[] arr;

데이터형 배열명[]; => 주로 C언어에서 사용
int arr[];
```

- 배열 초기화
```java
선언과 동시에 초기화
int[] arr = {10, 20, 30, 40};

크기 지정 후 값 대입
int[] arr = new int[5]; // 초기화 하지 않은 값은 기본값 ex) int는 0

반복문으로 초기화
int[] arr = new int[5];
for(int i=0; i<arr.length; i++) {
    arr[i] = i + 1;

기본값
int : 0   long : 0L   double : 0.0
boolean : false   String : null
}
```

- 배열 인덱스
```java
배열의 각 요소는 0부터 시작하는 인덱스를 가집니다.

int arr[] = {10, 20, 30, 40, 50};
             0    1   2   3   4
System.out.print(arr[1]); 는 20
```

- 배열 복사 메소드

| 방법 | 설명 | 새 배열 생성 |
| --- | --- | --- |
| b = a | 같은 배열 객체를 참조 | X |
| a.Clone() | 배열 요소를 복사하는 새 배열 생성 | O |
| Arrays.copyOf(a, length) | 지정한 길이로 새 배열 생성 | O |
| System.arraycopy() | 기존 대상 배열의 지정된 위치에 요소 복사 | X |

- b = a는 복사가 아니라 참조값을 대입하는 것이다.
- Clone()과 Arrays.copyOf()는 기본형 배열에서는 값이 복사된다.
- 참조형 배열에서는 객체 자체가 아니라 참조값이 복사되는 얕은 복사이다.
- System.arraycopy()는 복사할 대상 배열이 미리 존재해야 한다.          

## 열거형

- 열거형이란?
- 미리 정해진 상수 목록을 하나의 자료형으로 정리하는 문법이다.
- 요일, 학년, 주문 상태, 게임 난이도처럼 정해진 값만 사용할 때 유용하다.
- 정해진 값만 사용할 수 있고 가능한 값이 명확하기 때문에 값을 통제하기 쉽다.
  
```java
enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

public class Main {
    public static void main(String[] args) {          
        Season today = Season.SUMMER;
        System.out.println(today); // SUMMER
}
```
</details>

<details>
<summary><h2>Chapter05 - 메소드</h2></summary>

## 메소드

- 특정 기능을 수행하는 코드의 묶음으로, 필요할 때마다 호출하여 사용할 수 있는 재사용 가능한 코드 블록이다.
- 입력(매개변수)를 입력하면, 메소드 내부에서 로직을 수행하여 리턴값이 반환된다. 단, 매개변수와 리턴값은 없어도 된다.
  
- 장점
```text
1. 한번 만들어 여러 곳에서 재사용이 가능하기 때문에 중복되는 코드를 반복할 필요가 없다.
2. 기능별로 분리하여 유지보수성이 좋다.
3. 기능별로 분리하여 사용하기 때문에 구조를 보기 쉽고 가독성이 좋아진다.
```

- 메소드 형식(기본 구조)
```java
리턴형 메소드 이름(매개변수) {
    // 구현부
    return 값;
}
예)
int add(int a, int b) {
    int c = a + b;
    return c;
}
```

- 메소드 호출 방법
```java
1. 인스턴스 메소드는 객체를 생성해야 호출 가능하다.
Calculator cal = new Calculator();
int result = cal.add(10, 20);

2. 정적 메소드(static)는 클래스 이름으로 호출 가능하다.
int result = Calculator.mutiply(10, 20);
````

- 메소드의 리턴형
  
| 리턴형 | 설명 |
|---|---|
| void | 값은 반환하지 않음 (반환문 없음) |
| int, double, boolean 등 | 기본형 데이터를 반환 |
| String | 문자열을 반환 |
| 객체 타입(클래스명) | 객체를 반환 |

- 매개변수
```text
데이터 타입과 개수를 정확히 맞춰야 하고, 매개변수의 타입 순서도 정확히 맞춰야한다.
여러개의 매개변수를 사용할 수 있다.
기본형(Primitive)와 참조형(Reference) 모두 사용 가능하다.
```
</details>

<details>
<summary><h2>Chapter06 - 객체지향프로그램</h2></summary>

## 클래스

1. 클래스란?
- 클래스는 객체를 만들기 위한 설계도이다.
- 데이터와 기능을 정의하여 같은 형태의 여러 객체를 생성할 수 있다.

2. 클래스의 구조
```java
public class Student {
    // 1. 필드 (Field) ---------------------------> 객체가 가지는 데이터와 상태 / 인스턴스 변수, 정적 변수, 상수 등이 있다.
    String name; // 인스턴스 변수
    String int age; // 인스턴스 변수
    static int count; // 정적 변수

    // 2. 생성자 (Constructor) --------------------> 객체 생성 시 초기화 / 클래스 이름과 동일하게 작성하고 반환형이 없다.
    Student(String name, int age) {
    this.name = name;
    this.age = age;
    Count++
    }

    // 3. 메소드 (Method) --------------------------> 객체의 기능과 동작 정의 / 반환형, 매개변수 사용 가능하다.
    public void introduce() {
        System.out.println("이름 : " + name + ", 나이 : " + age);
    }
    public static int getCount() {
        return count;
    }
}
```
3. 클래스 객체 생성 방법

```java
class Student() {
    String name = "홍순찬";
}
public class school() {

    public static void main(String[] args) {

        Student std = new Student(); // Student 타입의 std 객체 생성
        System.out.println(std.name); // 사용한 객체의 변수 호출 가능 : 홍순찬
    }
}
```

3. 정적 멤버(static)
- 객체가 아닌 클래스 자체에 소속되며, 객체 없이 사용 가능하다.
- 객체.과 클래스. 둘 다 사용 가능하다.
- 정적 변수 정적 메소드가 있고 여러 객체를 생성하더라도 하나의 값을 공유한다.
```java
class Student {
    String name = "홍순찬";
    String name = "19";
    static int count = 0;

Student {
    count++;
}

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1.count); // 공유되는 값이므로 count는 2이다.
    }
}
```

 4. 지역 변수(Local Variable)
- 메소드, 생성자, 제어문 등의 블록 내부에 선언
- 사용 범위 : 선언된 블록 내부
- 선언된 블록 안에서만 사용 가능
- 다른 메소드에서 직접 사용 불가
- 사용전 반드시 초기화 필요
- 메소드 실행이 끝나면 소멸
```java
Class Calculator {
    void calculate() {
        int a = 10; // 지역 변수
        int b = 20; // 지역 변수
        int result = a + b;
        System.out.println(result);
    }
}
```

5. 인스턴스 변수(Instance Variable)
- 클래스 내부(메소드 밖)에 선언
- 상용 범위 : 해당 객체의 데이터
- 객체를 생성할 때마다 별도 공간에 생성
- 초기화하지 않으면 기본값이 성정됨
- 객체별로 서로 다른 데이터 저장
```java
class Student {
    String name; // 인스턴스 변수
    int age;     // 인스턴스 변수
}
````

6. 정적 변수(Static Variable)
- static 키워드로 선언
- 사용 범위 : 같은 클래스의 객체들이 공유
- 클래스당 하나의 변수만 존재
- 모든 객체가 같은 값을 공유
- 클래스 이름으로 접근(Student.school)
```java
Class Student {
    String name;          // 인스턴스 변수
    static String school; // 정적(static) 변수
}

7. 인스턴스 변수와 정적 변수의 차이점

| 비교 항목 | 인스턴스 변수 | 정적 변수 |
|---|---|---|
| 선언 방법 | int age; | static int count; |
| 소속 | 객체 | 클래스 |
| 저장 방식 | 객체마다 별도 값 | 클래스에서 공유 |
| 객체 생성 | 객체마다 변수 생성 | 객체와 무관하게 클래스에 소속 |
| 접근 방법 | s1.age | Student.count |
| 주요 용도 | 이름, 나이, 점수 등 | 공통 설정, 객체 수, 공통 상수 등 |


</details>
