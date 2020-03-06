# 데코레이터 (Decorator)

## 정의
기본 기능을 하는 객체와 다양한 부가 기능을 하는 데코레이터를 조합하여 기능을 확장할 수 있는 패턴

## 구성요소
1. Component
    - 기본기능을 뜻하는 ConcreteComponent와 부가기능을 뜻하는 Decorator의 공통기능을 정의한다
    
1. ConcreteComponent
    - Component 인터페이스를 구현한다
    - 기본기능을 구현한다
    - 여러 부가기능으로 장식(Decorate)할 수 있다
    
1. Decorator
    - Component와 동일한 인터페이스를 가진다
    - 장식할 대상이 되는 Component 역할도 한다
    - 자신이 장식하는 Component 객체를 인스턴스 변수로 가지고 있다
    - 다양한 부가기능을 나타내는 구체적인 Decorator의 공통기능을 제공한다
    
1. ConcreteDecorator
    - Decorator 인터페이스를 구현한다
    - 기본기능에 다양한 부가기능을 조합하여 추가할 수 있다

## 사용시점
- 기본기능과 다양한 부과기능이 존재
- 부가기능은 기본기능을 활용
- 부가기능은 여러가지 방식으로 조합 가능

## 사용효과
- 많은 데코레이터를 생성할 수 있다
- 실시간으로 특정한 객체에 다양한 행동을 부여할 수 있다

## 사용 예
- java.io 패키지의 자바 I/O API
- 자바 Component의 Border

## 참고
- com.designpattern.study.composite

---
[HOME](../README.md)
