# 추상 팩토리 (Abstract Factory)

## 정의
관련성 있는 객체의 집합을 생성하는 인터페이스를 제공하는 패턴

## 구성요소
1. AbstractProduct
    - 생산할 Product의 추상형태를 제공한다
    
1. ConcreteProduct
    - AbstractProduct 공통 인터페이스를 구현한다
    - ConcreteFactory 클래스에서 생성되는 구체적인 제품
    
1. AbstractFactory
    - 팩토리의 공통 인터페이스를 정의한다
    - 각 제품의 부품을 생성하는 기능을 추상 메서드로 정의한다
    
1. ConcreteFactory
    - AbstractFactory 공통 인터페이스를 구현한다
    - AbstractFactory 클래스의 추상 메서드를 구현함으로써 구체적인 제품을 생성한다

## 사용시점
- 관련성이 있는 객체군이 존재한다
- 연관된 일련의 객체들을 일관된 방식으로 생성해야 하는 경우

## 사용효과
- 하나의 팩토리 객체를 통해 생성되는 객체들은 상호호환성을 보장받는다
- 사용자는 상황이 변해서 다른 객체군을 선택해야 될 때 단순히 팩토리 객체만 교체하면 된다

## 사용 예
- 자바의 JDBC API

## 참고
- com.designpattern.study.abstractfactory

---
[HOME](../README.md)
