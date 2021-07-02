
public class Arrays {
    public static void main(String[] args) {
          int arrayLength = (int)(Math.pow(2, 20));
          int[] array = new int[arrayLength];
          int sum = 0;
          for (int i = 0; i<arrayLength; i++){
            array[i] = (int)(Math.random()*10);
            sum += array[i];
          }
          System.out.println(sum);
      }
  }
