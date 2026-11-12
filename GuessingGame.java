import java.util.Scanner;

public class GuessingGame {
        
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Gstatus = "Inizalizing";
        System.out.println(Gstatus);
            String Input = "N/A";
            int ScreenUnitBorder = 3;
            int ScreenUnitMAX = 11;
            int Screenairspace = 11;

            int ScreenOrigin = ((ScreenUnitMAX / 2+1));
            int PrintProccess = 0;
             
            enum  state {
                NA,
                Inizalizing,
                CeilingFloor,
                Walls,
                Inizalized,
                }
        
            state Screenprint = state.Inizalizing;
            
            while ((Gstatus == "Inizalizing")) {
                switch (Screenprint) {
                    case Inizalizing:
                        System.out.println(Screenprint);
                        PrintProccess = ScreenUnitMAX;
                        if (!(PrintProccess == 0)) {
                        Screenprint = state.CeilingFloor; 
                        }
                        break;
                        
                    case CeilingFloor:
                        System.out.println(Screenprint);
                         if (!(PrintProccess == 0)) {
                            while (!(PrintProccess == 0 )) {
                                if (PrintProccess == ScreenOrigin || PrintProccess == ScreenUnitMAX || PrintProccess == 1 ) {
                                System.out.print("|");
                                PrintProccess -= 1;
                                    } else {
                                    System.out.print("_");
                                    PrintProccess -= 1;
                                    }
                            }
                            PrintProccess = ScreenUnitMAX;
                            Screenprint = state.Walls;
                        } else {
                            PrintProccess = ScreenUnitMAX;
                            while (!(PrintProccess == 0)) {
                            if (PrintProccess == ScreenOrigin) {
                            System.out.print("|");
                            PrintProccess -= 1;
                                } else {
                                System.out.print("_");
                                PrintProccess -= 1;
                                }
                            Screenprint = state.Inizalized; 
                            }
                        
                    } break;
                    case Walls:
                    System.out.println(Screenprint);
                        Screenairspace = ScreenUnitMAX; 

                            while (!(PrintProccess == 0)) {
                                Screenairspace = ScreenUnitMAX; 
                                    if (PrintProccess == ScreenOrigin) {
                                    System.out.print("-");
                                        while (!(Screenairspace == 0)) {
                                            System.out.print(" ");
                                            Screenairspace -= 1;
                                            }
                                        System.out.println("-");
                                    PrintProccess -= 1;
                                    } else {
                                    System.out.print("|");
                                        while (!(Screenairspace == 0)) {
                                            System.out.print(" ");
                                            Screenairspace -= 1;
                                            }
                                    System.out.println("|");
                                    PrintProccess -= 1;
                                    }
                            } 
                        
                        
                    Screenprint = state.CeilingFloor; 
                    break;
                    
                    case Inizalized:
                        System.out.println(Screenprint);
                        Gstatus = "Inizalized";
                        System.out.println( );
                        System.out.println(Gstatus);
                        System.out.println("Ready?");
                        Input = input.next();
                        Gstatus = "Running";
                        System.out.println(Gstatus);
                    break;
                }
                }
            }
        }


import java.util.Scanner;

public class GuessingGame {
        
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Gstatus = "Inizalizing";
        System.out.println(Gstatus);
            String Input = "N/A";
            int ScreenUnitBorder = 3;
            int ScreenUnitMAX = 10;
            int ScreenOrigin = ((ScreenUnitMAX / 2) + 1);
            int PrintProccess = 0;
             
            enum  state {
                NA,
                Inizalizing,
                CeilingFloor,
                Walls,
                Inizalized,
                }
        
            state Screenprint = state.Inizalizing;
            
            while ((Gstatus == "Inizalizing")) {
                switch (Screenprint) {
                    case Inizalizing:
                        System.out.println(Screenprint);
                        PrintProccess = ScreenUnitMAX;
                        if (!(PrintProccess == 0)) {
                        Screenprint = state.CeilingFloor; 
                        }
                        break;
                        
                    case CeilingFloor:
                        System.out.println(Screenprint);
                         if (!(PrintProccess == 0)) {
                            while (!(PrintProccess == 0)) {
                                if (PrintProccess == ScreenOrigin) {
                                System.out.print("|");
                                PrintProccess -= 1;
                                    } else {
                                    System.out.print("_");
                                    PrintProccess -= 1;
                                    }
                            }
                            PrintProccess = ScreenUnitMAX;
                            Screenprint = state.Walls;
                        } else {
                            PrintProccess = ScreenUnitMAX; 
                            while (!(PrintProccess == 0)) {
                            if (PrintProccess == ScreenOrigin) {
                            System.out.print("|");
                                } else {
                                System.out.print("_");
                                PrintProccess -= 1;
                                }
                            Screenprint = state.Inizalized; 
                            }
                        
                    } break;
                    case Walls:
                    System.out.println(Screenprint);
                        while (!(PrintProccess == 0)) {
                            if (PrintProccess == ScreenOrigin) {
                            System.out.println("-");
                             PrintProccess -= 1;
                                } else {
                                System.out.print("|");
                                PrintProccess -= 1;
                                }
                        Screenprint = state.CeilingFloor;
                    } break;
                    case Inizalized:
                        System.out.println(Screenprint);
                        Gstatus = "Inizalized";
                        System.out.println( );
                        System.out.println(Gstatus);
                        System.out.println("Ready?");
                        Input = input.next();
                        Gstatus = "Running";
                        System.out.println(Gstatus);
                    break;
                }
                }
            }
        }


import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Gstatus = "Inizalizing";
        System.out.println(Gstatus);
            String Input = "N/A";
            int ScreenUnitBorder = 3;
            int ScreenUnitMAX = 10;
            int ScreenOrigin = ((ScreenUnitMAX / 2) + 1);

        private enum  ScreenPrint {
                Inizalizing,
                CeilingFloor,
                Walls,
                Inizalized,
            }
        private ScreenPrint state;

        public void ScreenPrint(){
            public void loop() {
                switch (state) {
                    case Inizalizing:
                        int PrintProccess = ScreenUnitMAX;
                        
                        if (!(PrintProccess == 0)) {
                        state = CeilingFloor; 
                        }
                        break;
                    case CeilingFloor:
                         if (!(PrintProccess == 0)) {
                            while (!(PrintProccess == 0)) {
                                if (PrintProcces = ScreenOrigin) {
                                System.out.print("|");
                                    } else {
                                    System.out.print("_");
                                    PrintProccess -= 1;
                                    }
                                int PrintProccess = ScreenUnitMAX;
                                state = Walls; 
                            }
                        } else {
                            int PrintProccess = ScreenUnitMAX; 
                            while (!(PrintProccess == 0)) {
                            if (PrintProcces = ScreenOrigin) {
                            System.out.print("|");
                                } else {
                                System.out.print("_");
                                PrintProccess -= 1;
                                }
                            int PrintProccess = ScreenUnitMAX;
                            state = Inizalized; 
                            }
                        
                    } break;
                    case Walls:
                        while (!(PrintProccess == 0)) {
                            if (PrintProcces = ScreenOrigin) {
                            System.out.println("-");
                                } else {
                                System.out.print("|");
                                PrintProccess -= 1;
                                }
                        state = CeilingFloor;
                    } break;
                    case Inizalized:
                        Gstatus = "Inizalized";
                        System.out.println( );
                        System.out.println(Gstatus);
                        System.out.println("Ready?");
                        Input = input.next();
                        Gstatus = "Running";
                        System.out.println(Gstatus);
                    break;
        }
} /* <-- Placeholder For Screen Printing Test, Delete once moving on */

            public void inizalize() {
            printCeilingFloor();
            printWall();
            System.out.println( );
            Gstatus = "Inizalized";
        
            System.out.println(Gstatus);
            System.out.println("Ready?");
            Input = input.next();
            Gstatus = "Running";
            System.out.println(Gstatus);
    
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
