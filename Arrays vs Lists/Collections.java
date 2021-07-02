import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
          int listLength = (int)(Math.pow(2, 20));
          ArrayList<Integer> list = new ArrayList<>();
          int sum = 0;
          for (int i = 0; i<listLength; i++){
            list.add((int)(Math.random()*10));
            sum += list.get(i);
          }
          System.out.println(sum);
      }
  }
