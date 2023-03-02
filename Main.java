public class Main {
    public static void main(String[] args) {
        // 1.g
        Team team1 = new Team("De Uovervindelige");
        team1.setRank(3);
        System.out.println(team1.toString());

        // 1.k
        Team team2 = new Team("a");
        team2.setRank(1);
        System.out.println(team2.toString());

        Team team3 = new Team("b");
        team3.setRank(2);
        System.out.println(team3.toString());

        Team team4 = new Team("c");
        team4.setRank(4);
        System.out.println(team4.toString());

        Team team5 = new Team("d");
        team5.setRank(5);
        System.out.println(team5.toString());

        Team team6 = new Team("e");
        team6.setRank(6);
        System.out.println(team6.toString());
    }
}
public class Team {
    //  1.c, 1.d, 1.e
    private String name;
    private int rank;
    private String[] players;

    //  1.f
    public Team(String name) {
        this.name = name;
    }

    //  1.h
    public void setRank(int rank) {
        this.rank = rank;
    }

    //  1.j
  
    public String toString() {
 return "Hold: " + name + " Rang: " + rank;
 
   }       
}



