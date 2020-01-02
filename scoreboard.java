

package scoreboard;
import java.util.*;
public class Scoreboard {
    
    public static void main(String []args){
      Scanner asd = new Scanner(System.in);
        System.out.print("Please enter game time: ");
      int game = asd.nextInt();
        System.out.print("Please enter how many player play this game: ");
      int players = asd.nextInt();
      int a[][] = new int[game][players];
      for(int g = 0;g<game;g++){
          for(int s = 0;s<players;s++){
              System.out.print("Please enter player "+(s+1)+"'s score: ");
      a[g][s] = asd.nextInt();
      }
    }
      for(int j = 0;j<game;j++){
     for(int i = 0;i<players;i++){
         System.out.println("Game "+(j+1)+": "+"Player "+(i+1)+": "+a[j][i]+" ");
     }
    }int score[] = new int[players];
      for(int j = 0;j<game;j++){
     for(int i = 0;i<players;i++){
        score[i] += a[j][i];
     } 
    }
     for(int i = 0;i<players;i++){
          System.out.println("Player "+(i+1)+": "+score[i]);
     }
     sort(score);  
     
}public static void sort(int a[]) {
    boolean swap = true;
    int t;
    int increase = 0;
    while(swap){
        swap = false;
        increase++;
    for(int i = 0;i<a.length - increase;i++){
        if(a[i]<a[i+1]){
            t = a[i];
            a[i] = a[i+1];
            a[i+1] = t;
            swap = true;
              }
    }
}
    for(int i = 0;i<a.length;i++){
        System.out.println(i+"_"+a[i]);
    }
}
}
