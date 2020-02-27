# 팩토리 메서드 (Factory Method)

## 정의
상위 클래스에서 알고리즘의 골격을 정하고 구체적인 객체생성은 하위 클래스에서 하는 패턴

## 구성요소
1. Product
    - 팩토리 메서드로 생성될 객체의 인터페이스를 정의한다
    
1. AbstractFactory
    - Product를 생성하는 `팩토리 메서드`를 선언한다

1. ConcreteProduct
    - Product 인터페이스를 구현한다

1. ConcreteFactory
    - AbstractFactory의 팩토리 메서드를 구현하여 ConcreteProduct를 생성한다

## 사용시점
- 여러 단계를 가지는 알고리즘의 골격이 존재한다
- 알고리즘의 일부 특정단계에서는 상황별로 차이가 난다

## 사용효과
- 설계 단계에서 프로그램 뼈대를 고민하는 비용을 줄일 수 있고 기술 노하우를 결집시킬 수 있다
- 객체의 생성 코드를 별도의 클래스/메서드로 분리함으로써 객체 생성의 변화에 대비하는 데 유용

## 사용 예
- XML 파서 제공자: javax.xml.parsers.DocumentBuilderFactory 등

## 참고
- com.designpattern.study.factorymethod

---
[HOME](../README.md)
