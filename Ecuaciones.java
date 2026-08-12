import java.util.Scanner;

public class Ecuaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        double z;
        int opcion;

        System.out.print("Ingrese un valor para x: ");
        x = sc.nextDouble();
        System.out.print("Ingrese un valor para z: ");
        z = sc.nextDouble();
        System.out.print("Elija una ecuación:" + "\n" + "- Ecuación 1" + "\n" + "- Ecuación 2" + "\n" + "Número de ecuación: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                y = (3*x)/((1)+((3*x)/(3*(z)*(z)+(2)))) / (1)/(((1)/(1+z))+(3*(x)*(x))+(2*z)+(3)); 
                System.out.print("El resultado de la ecuación es: " + y);     
                break;
            case 2:
                y = (x*x + 3*z + 2)/(2 + 1.0/(1 + 2*z)) + (2.0/(1 + 3*x*x*x + 3*z + 2))/(1.0/(1 + 3*x) + (3*x + 1)/(2*z + 3.0/(1 + 5.0/z)));
                System.out.print("El resultado de la ecuación es: " + y);
                break;
            default:
                System.out.println("Opción inválida, intente de nuevo.");
        }
        sc.close();
    }    
}



<<<<<<< HEAD
/*        ,
       \`-._           __
        \\  `-..____,.'  `.
         :`.         /    \`.
         :  )       :      : \
          ;'        '   ;  |  :
          )..      .. .:.`.;  :
         /::...  .:::...   ` ;
         ; _ '    __        /:\
         `:o>   /\o_>      ;:. `.
        `-`.__ ;   __..--- /:.   \
        === \_/   ;=====_.':.     ;
         ,/'`--'...`--....        ;
              ;                    ;
            .'                      ;
          .'                        ;
        .'     ..     ,      .       ;
       :       ::..  /      ;::.     |
      /      `.;::.  |       ;:..    ;
     :         |:.   :       ;:.    ;
     :         ::     ;:..   |.    ;
      :       :;      :::....|     |
      /\     ,/ \      ;:::::;     ;
    .:. \:..|    :     ; '.--|     ;
   ::.  :''  `-.,,;     ;'   ;     ;
.-'. _.'\      / `;      \,__:      \
`---'    `----'   ;      /    \,.,,,/
                   `----`              
 */
=======
/*

              .
             .@.                                    .
             @m@,.                                 .@
            .@m%nm@,.                            .@m@
           .@nvv%vnmm@,.                      .@mn%n@
          .@mnvvv%vvnnmm@,.                .@mmnv%vn@,
          @mmnnvvv%vvvvvnnmm@,.        .@mmnnvvv%vvnm@
          @mmnnvvvvv%vvvvvvnnmm@, ;;;@mmnnvvvvv%vvvnm@,
          `@mmnnvvvvvv%vvvvvnnmmm;;@mmnnvvvvvv%vvvvnmm@
           `@mmmnnvvvvvv%vvvnnmmm;%mmnnvvvvvv%vvvvnnmm@
             `@m%v%v%v%v%v;%;%;%;%;%;%;%%%vv%vvvvnnnmm@
             .,mm@@@@@mm%;;@@m@m@@m@@m@mm;;%%vvvnnnmm@;@,.
          .,@mmmmmmvv%%;;@@vmvvvvvvvvvmvm@@;;%%vvnnm@;%mmm@,
       .,@mmnnvvvvv%%;;@@vvvvv%%%%%%%vvvvmm@@;;%%mm@;%%nnnnm@,
    .,@mnnvv%v%v%v%%;;@mmvvvv%%;*;*;%%vvvvmmm@;;%m;%%v%v%v%vmm@,.
,@mnnvv%v%v%v%v%v%v%;;@@vvvv%%;*;*;*;%%vvvvm@@;;m%%%v%v%v%v%v%vnnm@,
`    `@mnnvv%v%v%v%%;;@mvvvvv%%;;*;;%%vvvmmmm@;;%m;%%v%v%v%vmm@'   '
        `@mmnnvvvvv%%;;@@mvvvv%%%%%%%vvvvmm@@;;%%mm@;%%nnnnm@'
           `@mmmmmmvv%%;;@@mvvvvvvvvvvmmm@@;;%%mmnmm@;%mmm@'
              `mm@@@@@mm%;;@m@@m@m@m@@m@@;;%%vvvvvnmm@;@'
             ,@m%v%v%v%v%v;%;%;%;%;%;%;%;%vv%vvvvvnnmm@
           .@mmnnvvvvvvv%vvvvnnmm%mmnnvvvvvvv%vvvvnnmm@
          .@mmnnvvvvvv%vvvvvvnnmm'`@mmnnvvvvvv%vvvnnmm@
          @mmnnvvvvv%vvvvvvnnmm@':%::`@mmnnvvvv%vvvnm@'
          @mmnnvvv%vvvvvnnmm@'`:::%%:::'`@mmnnvv%vvmm@
          `@mnvvv%vvnnmm@'     `:;%%;:'     `@mvv%vm@'
           `@mnv%vnnm@'          `;%;'         `@n%n@
            `@m%mm@'              ;%;.           `@m@
             @m@'                 `;%;             `@
             `@'                   ;%;.             '
   ,          `                    `;%;
   %,                               ;%;.
   `;%%%%%%%,                       `;%;
     `%%%%%%%%%,                     ;%;.
              ::,                    `;%;
              ::%,                    ;%;
              ::%%,                   ;%;
              ::;%%                  .;%;
              ::;;%%                 ;%;'
              `::;%%                .;%;
               ::;;%%               ;%;'
               `::;%%              .;%;
                ::;;%%             ;%;'
                `::;%%            .;%;
                 ::;;%%           ;%;'
                 `::;%%          .;%;
                  ::;;%%         ;%;'
                  `::;%%        .;%;
                   ::;%%,       ;%;'
                   `::;%%      .;%;
                    ::;%%      ;%;'
                    `::%%     .;%;
                     ::%%     ;%;'
                     `:;%    .;%;
                      :;%   .;%;'
                      :;%  .;%%;
                      `:% .;%%;'
                       `::%%;





*/
>>>>>>> 3ace46f8db5c1a00a31b1ae1e0349a7228bd788c
