# 브리지 (Bridge)

## 정의
추상적 개념과 구체적 구현 사이의 종속성을 제거하여 목적에 맞게 
다양한 구현 방법을 사용하도록 제공하는 패턴

## 구성요소
1. Abstraction
    - Implementor 역할의 메서드를 사용하여 기본적인 기능만 기술한 클래스
    - Implementor 역할만 가지고 있다
    - 기본적인 기능만 서술되어 있고 기술되어 있는 기능들이 Bridge를 통해
      기능을 위임받은 클래스와 교감한다
    
1. RefinedAbstraction
    - Abstraction 역할에 기능을 추가한 역할
    
1. Implementor
    - Abstraction 역할의 인터페이스를 구현하기 위한 메서드를 규정한다
    - 

1. ConcreteImplementor
    - Implementor 인터페이스를 구현한다


## 사용시점
- 기본 기능과 확장 가능한 기능이 하나의 클래스에 혼재한다
- 하나는 미래에 변할 가능성이 없지만, 하나는 변할 가능성이 존재할 때

## 사용효과
- 추상화된 부분과 실제 구현 부분을 독립적으로 확장할 수 있다
- 추상적 개념과 구체적 구현 사이의 종속성이 제거되어 다양한 구현 방법을 사용하게 한다

## 사용 예
- 여러 플랫폼에서 사용해야 할 그래픽스 및 윈도우 처리 시스템에서 유용하게 사용

## 참고
- com.designpattern.study.bridge

---
[HOME](../README.md)
