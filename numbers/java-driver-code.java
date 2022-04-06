import java.io.*;
import java.util.*;

public class Main {
  	// The main function reads the input in the required format.
  	// Just complete the solve function below.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        int count=0;
        for(int t_i = 0; t_i < T; t_i++)
        {
            int n =  Integer.parseInt(br.readLine());
            String out_ = solve(n);
            System.out.println(out_);
         }
         wr.close();
         br.close();
    }
  
    static String solve(int n){
      for(int i=1;i<T;i++)
      {
        if(n%i==0)
        {
          count++;
        }
      }
      	if(n%2&&n%3){
        String result = "Special";
        return result;
        }
      else if (n%2&&n%7){
        String result = "Special";
        return result;
      }
      else {
        String result = "Regular";
        return result;
      }
    }
}
