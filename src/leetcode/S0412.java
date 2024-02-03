package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class S0412 {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

    // Todo: 매개변수로 받은 숫자만큼의 크기를 가진 list를 반환하는 함수 fizzBuzz() 만들기
    //  1. 각각 인덱스에는 무엇이 들어오는지 입출력예제를 통해 규칙성을 파악하기
    public static List<String> fizzBuzz(int n) {
        // 규칙에 알맞게 인덱스 값을 저장해줄 list 한 개 생성하기
        List<String> list = new ArrayList<>();

        // 0부터 n 미만으로 하지 않은 이유는 입출력 예제를 보면,
        // 첫번째 인덱스 값으로 "1" 이 들어오기 때문에 인덱스 번호와 값에 들어올 숫자를 일치시켜주었습니다.
        for (int i = 1; i <= n; i++) {

            /** if - else 문의 조건식의 순서를 지정해주는 기준은 더 특별한 규칙을 가지고 있는 것을 우선으로 합니다.
                아래 if - else 문에서의 우선순위: FizzBuzz > Fizz > Buzz
                만약 FizzBuzz 조건을 나중에 두면, 15의 배수일 때 Fizz 또는 Buzz 규칙에도 부합하게 되어
                잘못된 결과가 나올 수 있습니다.
                따라서 더 구체적이로 특별한 조건을 먼저 체크하여 우선순위로 조절한다면 정확한 결과를 얻을 수 있습니다.
             **/

            // Example 3: 3과 5의 최소공배수 인덱스
            if (i % 15 == 0) {
                list.add("FizzBuzz");

                // Example 1: 3의 최소공배수 인덱스
            } else if (i % 3 == 0) {
                list.add("Fizz");

                // Example 2: 5의 최소공배수 인덱스
            } else if (i % 5 == 0) {
                list.add("Buzz");

                // 그 외 일반적 경우: 인덱스를 나타내는 숫자 그대로 문자열로 변환
            } else {
                list.add(Integer.toString(i));
                Integer.toString(i);
            }
        }
        return list;
    }
}
