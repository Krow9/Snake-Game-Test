import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Gstatus = "Inizalizing";
        System.out.println(Gstatus);
            String Input = "A";
            int ScreenUnitMIN = 1;
            int ScreenUnitMAX = 4;
            int ScreenUnit = ((ScreenUnitMAX / 2) + 1);
        
        int PrintProccess = ScreenUnit;
        while (!(PrintProccess == 0)) {
            System.out.print(1);
            PrintProccess -= 1;
        }
        System.out.println( );
        Gstatus = "Inizalized";
        System.out.println(Gstatus);
        System.out.println("Ready?");
        Input = input.next();
        Gstatus = "Running";
        System.out.println(Gstatus);
    } 
}   

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Gstatus = "Inizalizing";
        System.out.println(Gstatus);
            String Input = "A";
            int ScreenUnitMIN = 1;
            int ScreenUnitMAX = 4;
            int ScreenUnit = ((ScreenUnitMAX / 2) + 1);
        
        Int PrintProccess = ScreenUnit;
        while ( PrintProccess = 0 ) {
            System.out.println(1);
            PrintProccess -=
            }
        
        String Gstatus = "Inizalized";
        System.out.println(Gstatus);

        System.out.println("Ready?");
        Input = input.next();
            String Gstatus = "Running";
            System.out.println(Gstatus);
    } 
}     
        while (Input.equals("yes")) {
            System.out.println("");

        private enum MovementState {
                NORMAL,
                LEFT,
                RIGHT,
            }
        private MovementState state;

        public void Movement(){
            public void liip() {
                switch (state) {
                    case NORMAL:
                        if (Input.equals("a")) {
                            state = LEFT;
                        } else if (Input.equals("d")) {
                            state = RIGHT;
                        } else {
                            state = NORMAL;
                        }
                        break;
                    case LEFT:
                        if 
            

        
    }
}

    public void init() {

    public void loop() {
        switch (state) {
            case INIT:
                if (timer.seconds() < 1) {
                }
                else {
                    state = AutoState.DRIVE;
                }
                break;

            case DRIVE:
                if (timer.seconds() < 3) {
                }
                else {
                    state = AutoState.TURN;
                }
                break;

            case TURN:
                if (timer.seconds() < 1) {
                }
                else {
                    state = AutoState.COMPLETE;
                }
                break;

            case COMPLETE:
                break;
        }
    }
}
