

public class array {

   public static int countPath(int n, int m) {
      {
         if (n == m) {
            return 2;
         }
         if (n > m) {
            return 1;
         }
         // for horizontal
         int horizontalSpaces = countPath(n - 1, m);
         // for verticle
         int rverticle = countPath(n, m);
         return horizontalSpaces + rverticle;
      }

   }

   public static void main(String[] args) {

      @SuppressWarnings("unused")
      int n = 3, m = 3;

      int totalPath = countPath(0, 0);
      System.out.println(totalPath);

   }

}
