### 50. 방어적 복사본을 만들라
[방어적 복사본](http://www.javapractices.com/topic/TopicAction.do?Id=15)
Date, StringBuilder 처럼 가변 인스턴스는 String, Integer과 달리 생성이 완료된 후에 변경될 위험이 있습니다. 

Date 대신 LocalDateTime을 사용하면 가변의 위험이 제거됩니다. (이 방법이 최선일겁니다 하지만 여의치 않을 경우 방어적 복사본을 사용하면 됩니다.)

방어적 복사본을 생성해주는데 가장 큰 이유는 객체 필드 갑의 추후 변경을 방지하기 위해서입니다. 

`핵심은` 가변 위험이 있는 메서드나 생성자 내 원본을 복사하는 것입니다.