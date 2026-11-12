import java.util.Scanner;

public class GuessingGame {
        
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Gstatus = "Inizalizing";
        System.out.print(Gstatus);
            String Input = "N/A";
            int ScreenUnitBorder = 3;
            int ScreenUnitMAX = 21;
            int Screenairspace = 0;

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
                        System.out.println(("\033[1A\r") + Screenprint + "     " );
                        PrintProccess = ScreenUnitMAX;
                        if (!(PrintProccess == 0)) {
                        Screenprint = state.CeilingFloor; 
                        }
                        break;
                        
                    case CeilingFloor:
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
                            PrintProccess = ScreenUnitMAX/2;
                             System.out.println(("\033[10A\r") + Screenprint + "     ");
                             System.out.println( );
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
                   System.out.println(("\033[10A\r") + Screenprint + "         ");
                   System.out.println( );
                        Screenairspace = ScreenUnitMAX; 

                            while (!(PrintProccess == 0)) {
                                Screenairspace = ScreenUnitMAX; 
                                    if (PrintProccess == ScreenOrigin) {
                                    System.out.print("-");
                                        while (!(Screenairspace == 2 )) {
                                            System.out.print(" ");
                                            Screenairspace -= 1;
                                            }
                                        System.out.println("-");
                                    PrintProccess -= 1;
                                    } else {
                                    System.out.print("|");
                                        while (!(Screenairspace == 2)) {
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
                        System.out.print(">");
                        Input = input.next();
                        Gstatus = "Running...";
                        System.out.print("\033[1A" + "[    ");
                        System.out.println("\033[2A\r" + Gstatus);
                    break;
                    
                }
                }
                
            enum MovementState {
                NORMAL,
                LEFT,
                RIGHT,
            }
        
            MovementState Movement = MovementState.NORMAL;
                        
                    while (Gstatus == "Running..."){
                        switch (Movement) {
                            case NORMAL:
                                Input = input.next();
                                if (Input.equals("a")) {
                                Movement = MovementState.LEFT;
                                } else if (Input.equals("d")) {
                                Movement = MovementState.RIGHT;
                                  } else {
                                System.out.println("Normal");
                                Movement = MovementState.NORMAL;
                                }
                                break;
                                case LEFT:
                                System.out.println("Left");
                                Movement = MovementState.NORMAL;
                                break;
                                case RIGHT:
                                System.out.println("Right");
                                Movement = MovementState.NORMAL;
                                break;
                    }
                     
            }
}        }
