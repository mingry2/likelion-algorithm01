package com.example.likelionalgorithm.class1028;


import java.util.HashSet;

/*
1. 얼마나 느려질까? -> 알고리즘 풀 때 접근법
2. 아주 중요한 힌트!
    phone_book의 길이는 1 이상 1,000,000 이하입니다.
    각 전화번호의 길이는 1 이상 20 이하입니다.
    같은 전화번호가 중복해서 들어있지 않습니다.
3. indexOf() 사용
    System.out.println("123".indexOf("12")); --> 0
    System.out.println("12".indexOf("123")); --> -1
    ["12","123","1235","567","88"]
    "12" -- 있으면 count++
    이렇게 하나씩 다 비교하는 것
    --> 이 방법은 너무 오래걸림 쓰기 어려움
 */
public class PhoneNumBook {
    public boolean solution(String[] phone_books) {

        HashSet<String> hs = new HashSet<>();
        // var를 사용할 때 타입이 명명백백 확실한 경우에만 사용하는 것이 좋음
        // 타입을 추론해야하는 경우엔 다른 타입이 나올 수 있기 때문에 오히려 헷갈림
        for(var phone_book : phone_books) hs.add(phone_book); // for each 방식. 한줄, 중괄호 생략

        // hashset에서 한개씩 뽑아
        // ex) 12348765 라면 1, 12, 123, 1234, 12345, 12348, 123487...12348765 를 hs에서 검색
        // 그럼 O(20N)으로 됨 O(N제곱2)

        return false;
    }

    public static void main(String[] args) {


    }
}
