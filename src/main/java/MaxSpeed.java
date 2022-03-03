public class MaxSpeed {
        public static void main(String[] args) {


            boolean itsGreenLight = false;

            int MAX_SPEED = 10;


            int speedOfPlayer1 = 5;
            int speedOfPlayer2 = 0;
            int speedOfPlayer3 = 2;
            int speedOfPlayer4 = 7;
            int speedOfPlayer5 = 13;


            int count = 0;


            int players[] = {speedOfPlayer1, speedOfPlayer2, speedOfPlayer3, speedOfPlayer4, speedOfPlayer5};


            if (itsGreenLight == false) {

                for (int i = 0;  i < players.length; i++) {

                    if (players[i] >= MAX_SPEED ) count++;
                }
                System.out.println("Горит красный, выбывает " + count + " игроков");
            }

            else {
                for (int i = 0; i < players.length; i++) {

                    if (players[i] == 0) count++;
                }
                System.out.println("Горит зелёный, выбывает " + count + " игроков");
            }

        }
    }

