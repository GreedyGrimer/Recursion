package Projects.P2;

import java.util.ArrayList;
import java.util.Scanner;

public class P2Test {



    public static void main(String[] args) {

        Scanner walmart = new Scanner(System.in);
        String p1Name = "name", p1Move = "move", p2Name = "name", p2Move = "move";
        double p1Hp = 0;
        double  p1Power = 0;
        double p1Speed = 0;
        double  p2Hp = 0;
        double p2Power = 0;
        double  p2Speed = 0;

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> moves = new ArrayList<>();

        P2Score x = new P2Score();
        P2Stats y = new P2Stats();

       int round = y.Round();
       int cRound = 1;

        while (round >= cRound){
           System.out.printf("-------------------ROUND %d----------------------\n", cRound);


        String outName1 = y.setName(p1Name);
        String outMove1 = y.setMove(p1Move, outName1);
        double outHp1 = y.setHp(p1Hp,outName1);
        double outPower1 = y.setPower(p1Power,outName1);
        double outSpeed1 = y.setSpeed(p1Speed,outName1);
      // System.out.printf("%s,%s,%.2f,%.2f,%.2f" ,outName1,outMove1,outHp1,outPower1,outSpeed1);


        String outName2 = y.setName(p2Name);
        String outMove2 = y.setMove(p2Move, outName2);
        double outHp2 = y.setHp(p2Hp,outName2);
        double outPower2 = y.setPower(p2Power,outName2);
        double outSpeed2 = y.setSpeed(p2Speed,outName2);

        while(outHp1 > 0 && outHp2 > 0){
            if(outSpeed1 > outSpeed2){
                outHp2-=outPower1;
            } else if (outSpeed2 > outSpeed1) {
                outHp1-=outPower2;

            }

            x.scoring(outHp1,outHp2);
            cRound++;
        }



        names.add(outName1);
        names.add(outName2);
        moves.add(outMove1);
        moves.add(outMove2);
        } //rounds loop

        x.Win();





        System.out.println("Print Moves or Names database? (q for neither, both for both):\n");
       String ans = walmart.nextLine();
       if (ans.equalsIgnoreCase("q")){
           System.out.println("Thank you for playing");
       } else if (ans.equalsIgnoreCase("names") ){
           System.out.println(names);
        }else if (ans.equalsIgnoreCase("moves") ){
           System.out.println(moves);
       }else if (ans.equalsIgnoreCase("both") ){
           System.out.println(names);
           System.out.println(moves);
       }




       }


        //Take information
        //Compare











    }

