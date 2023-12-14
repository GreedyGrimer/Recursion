package week9;

public class MovieBookingSimulation {
    public static void main(String[] args) {
        int theater[][] = { //10x5 //assign seats manually
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},

        };
        for(int i = 0; i < 10; i++){ //Assign seats with loop
            for (int j = 0; j < 5; j++){
                theater[i][j] = 0;
            }
        }

        String movie[][] = {
                {"The Thing", "3D", "6", "$5"},
                {"Inglorious Bastards", "2D", "7", "$15"},
                {"Coraline", "3D", "8", "$9"}
        };


        System.out.printf("SEATING:\n");
        for(int i = 0; i < 10; i++){ //Assign seats with loop
            for (int j = 0; j < 5; j++){
                System.out.printf("%d ",theater[i][j] );
            }
            System.out.printf("\n");
        }


        System.out.printf("\nTITLE\t2D/3D\tSEATS\tPRICE\n");
        for(int i = 0; i < 3; i++){ //Assign seats with loop
            for (int j = 0; j < 4; j++){
                System.out.printf("%s\t ",movie[i][j] );
            }
            System.out.printf("\n");
        }


        theater[0][1] = 1;
        theater[2][4] = 1;
        theater[8][3] = 1;
        theater[6][4] = 1;


        System.out.printf("\nUPDATED SEATING:\n");
        for(int i = 0; i < 10; i++){ //Assign seats with loop
            for (int j = 0; j < 5; j++){
                System.out.printf("%d ",theater[i][j] );
            }
            System.out.printf("\n");
        }



    }
}
