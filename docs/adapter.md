# 어댑터 (Adapter)

## 정의
재사용하려는 클래스가 제공하는 인터페이스와 클라이언트가 사용하는 인터페이스가 다를 경우 
어댑터 클래스를 이용하여 인터페이스를 일치시키는 패턴  

## 구성요소
1. Target
    - 클라이언트에게 필요한 메서드를 제공한다
    
1. Adapter
    - Adaptee가 제공하는 메서드를 사용하고 Target 인터페이스를 구현한다

1. Adaptee
    - 클라이언트가 원하는 기능을 구현한 메서드를 가지고 있다

## 사용시점
- 다른 개발자가 작성한 클래스를 재사용해야 한다
- 클라이언트가 요구하는 인터페이스와 재사용하려는 클래스의 인터페이스가 일치하지 않는다
- 애플리케이션에 필요한 기능을 이미 구현한 기존의 클래스를 수정하기 힘들다

## 사용효과
- 인터페이스가 호환되지 않아 사용할 수 없었던 클래스를 사용할 수 있게 해준다
- 기존 클래스가 제공하는 기능의 안정성을 그대로 유지할 수 있다

## 사용 예
- SLF4J라는 로깅 API

## 참고
- com.designpattern.study.adapter

---
[HOME](../README.md)