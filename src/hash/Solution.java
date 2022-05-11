package hash;

import java.util.HashMap;

public class Solution {
  
  public static String solution(String[]participant, String[] completion) {
    
    String answer = "";
    
    HashMap<String, Integer> part = new HashMap<>();
    for(String parti: participant) part.put(parti, part.getOrDefault(parti, 0)+1);
    
    
    for(String com : completion) {
      if(part.containsKey(com)) { //키 존재 여부 확인 
        part.put(com, part.get(com)-1);
      }
    }
    
    for(String key : part.keySet()) {
      if(part.get(key) == 1) {
        answer = key;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    
    String[] participant = {"mislav", "stanko", "mislav", "ana"};
    String[] completion  = {"stanko", "ana", "mislav"};
    
    String result = solution(participant, completion);
    
    System.out.println(result);
  }

}

/*
class Solution {
  public String solution(String[] participant, String[] completion) {
      String answer = "";
      HashMap<String, Integer> hm = new HashMap<>();
      for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
      for (String player : completion) hm.put(player, hm.get(player) - 1);

      for (String key : hm.keySet()) {
          if (hm.get(key) != 0){
              answer = key;
          }
      }
      return answer;
  }
}
*/