package hash;

import java.util.HashMap;

public class ex {

  public static void main(String[] args) {
    //String [] alphabet = { "A", "B", "C" ,"A"}; 
    
   // HashMap<String, Integer> hm = new HashMap<>();
    
    //for(String key : alphabet) 
   //   hm.put(key, hm.getOrDefault(key, 0) + 1); 
    
   
    //System.out.println("결과 : " + hm);
    
    HashMap<String, Integer> map1 = new HashMap<>();
    map1.put("yujin", 3);
    
    System.out.println(map1.getOrDefault("yujin", 0)+1);
   //HashMap의 경우 동일 키 값을 추가할 경우 Value의 값이 덮어쓰기가 됩니다. 따라서 기존 key 값의 value를 계속 사용하고 싶을 경우 getOrDefault 메서드를 사용하여 위의 예와 같이 사용할 수 있습니다.


  }

}
