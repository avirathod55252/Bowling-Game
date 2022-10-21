import java.util.*; 
import java.util.Collection;
 class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
        
    }
    public void getWinner(){
        String best="";
        Iterator<Map.Entry<String,Integer>> it =players.entrySet().iterator();
        int max=0;
        while(it.hasNext()){
        
         String playerName=it.next().getKey();
      Integer checkVal=players.get(playerName);
          if (checkVal>=max){
        
              max=checkVal;
              best=playerName;
          }
            
        }
        
       System.out.println(best);
    }
}

public class Program {
    public static void main(String[] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
       game.getWinner();
    }
}
 
