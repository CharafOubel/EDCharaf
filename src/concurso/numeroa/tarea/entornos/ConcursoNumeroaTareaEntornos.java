/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurso.numeroa.tarea.entornos;

import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * ConcursoNumeroaTareaEntornos : Develop a Java program that allows you to play
 * to a game of questions and answers inspired by the well-known television
 * contest Know and win.
 *
 * @author OUBELKAS_CHARAF_EDDINE
 */
public class ConcursoNumeroaTareaEntornos
{

    static Scanner sc = new Scanner(System.in);
    static int turnoJogador, numJogadores = 0;
    static int arraysLengh, numRondas;
    static char rondas, simbol;
    static int numDeEnteros, i;
    static String[] arrays;
    static String[] nombres;
    static int matriz[][];

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args)
    {
        
        /**
         * THIS FUNCTION contains a set of functions that generate the game
         */
        iniciarPartida();

        /* CON ESTA FUNCION GENERAMOS LAS */
        /**
         * generarPregunta : With this function generate the expression randomly
         * and ask the players
         */
        generarPregunta();

        /**
         * With this function we generate the end of the game and show the
         * winner
         */
        finalizarPartida();

    }
    /**
     * WITH THIS FUNCTION WE START THE GAME contains several functions within
     */
    
    public static void iniciarPartida()
    {
        numJugadores();
        guardarNombreJugador();
        elegirRondas();
        matriz = matrizDeNombresNotas();

    }

    /**
     * With this function we ask and save the number of players
     */
    public static void numJugadores()
    {
        System.out.println("************************************BIEN VENIDO AL JUEGO *Saber y ganar* EL JUEGO MAS DEIVERTIDO DEL MUNDO**********************************");

        while (true)
        {
            System.out.println("Intoduce numero de jugadores entre 1 y 6");
            numJogadores = sc.nextInt();
            sc.nextLine(); // Para que no salte el jugador (1)
            // Con esta condicion comprobamos si el numero introducido esta entre 1 y 6 .
            // Si si salgamos del bucle.
            if (numJogadores < 1 | 6 < numJogadores)
            {
                System.out.println("El juego acepta entre 1 y 6 jugadores");
            } else
                break;
        }
    }

    /**
     * With this function we ask and save the name of each player
     *
     */
    public static void guardarNombreJugador()
    {
        // Esta funcion para guardar los nombres de los jugadores
        // y Ordenar aleatoramente los jugadores 
        nombres = new String[numJogadores];

        for (i = 0; i < numJogadores; i++)
        {
            // (i+1) para que no muestre por pantalla jugador(0).
            System.out.println("Intoduce el nombre del jugadore(" + (i + 1) + ") :");
            // creamos un arrays donde guargamos los cada nomre introducido
            nombres[i] = sc.nextLine();
        }

        // Ordenar aleatoramente los jugadores a preguntar.
        for (i = 0; i < numJogadores; i++)
        {
            // El valor del variable pos empieza del 0 hsta el numJogadores para que el index no salga del lentgh.
            int pos = (int) (Math.random() * numJogadores);
            // **** La siguiente forma para guardar los nombres en un arrays aleatoriamenete
            String posJugador = "";   // Una cadena vacia
            posJugador = nombres[i]; // Guardamos el jodador(i+1) en la cadena
            nombres[i] = nombres[pos]; // Ponemos el nombre[i] en la pos aleatorio
            nombres[pos] = posJugador; // Al final ponemos la cadena que tiene el nombre en una posicion aleatorio
            System.out.println("El orden de los jugadores sera :");

            for (i = 0; i < numJogadores; i++)
            {
                System.out.println((i + 1) + ":" + nombres[i]);
            }
        }
    }

    /**
     * With this function randomly generate the order of the players
     */
    public static void elegirRondas()
    {
        while (true)
        {
            System.out.println("");
            System.out.print("Eligi la ronda :\n"
                    + "A) Tres rondas rapidas\n"
                    + "B) Cinco rondas cortas\n"
                    + "C) Diez rondaz largas\n"
                    + "D) Veinte rondaz largas\n");
            rondas = sc.next().charAt(0);// Leemos la ronda elegida
            // Aprobamos si el char introducido es correcto
            if (rondas != 'A' && rondas != 'a'
                    && rondas != 'B' && rondas != 'b'
                    && rondas != 'C' && rondas != 'c'
                    && rondas != 'D' && rondas != 'd')
            {
                System.out.println("Las rondas disponibles : A - B - C -D");
            } else

                break;
        }
        generaRonda();

    }

    /**
     * Function to check the number of rounds that the user wants. According
     * choose "A"/"a","B" / "b", "C" / "c" , "D" /"d", one amount or another
     * will be returned.
     *
     */
    public static void generaRonda()
    {
        switch (rondas)
        {   // en el caso de que el usuario introduce un character mayuscula o miniscula
            case 'A':
            case 'a':
                numRondas = 3;
                break;
            case 'B':
            case 'b':
                numRondas = 5;
                break;
            case 'C':
            case 'c':
                numRondas = 10;
                break;
            case 'D':
            case 'd':
                numRondas = 20;
                break;

        }
    }
    
    /**
     * With this function we generate the matrix where we have the points of each player.
     * We create an array to hold the names and notes of each player
     * @return array : An array that holds the names of the players
     */
    public static int[][] matrizDeNombresNotas()
    {
        // 
        int matriz[][] = new int[numJogadores][2];
        for (i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                // En esta Matriz de dos columnas y "numJogadores" linias quiero guardar las posiciones de jugadores
                // y sus puenuaciones que al princepio seran egual a cero.
                matriz[i][0] = i; // pos de jugadores

                matriz[i][1] = 0; // los puntos de jugadores = ceros

            }
        }
        return matriz;
    }

    /**
     * Function to generate a random string (mathematical expression). Create an
     * array to save random numbers and then in a string they will be saved
     * those numbers plus symbol that will be the operations calling the
     * function symbol().
     *
     */
    public static void generarPregunta()
    {
        for (int j = 0; j < numRondas; j++) // !!!!!! ronda debe ser un integer no un Char
        {
            for (i = 0; i < numJogadores; i++) // pndre en esta for las notas de cada jugador [i]
            {
                numDeEnteros = (int) (4 + Math.random() * (8 - 4 + 1));         // numDeEnteros : entero entre 4 y 8

                arraysLengh = (numDeEnteros * 2) - 1;

                arrays = new String[arraysLengh]; // Para que el length dek array sera suficente para numeros y operadores
                for (int x = 0; x < arraysLengh; x++)
                {

                    int numMath = (int) (2 + Math.random() * (12 - 2 + 1));

                    arrays[x] = numMath + ""; // Guardar un integer en un String
                    char operador = simbol();

                    // Esta condicion para que la exprexion finaliza con un numero
                    if (x != (arraysLengh - 1))
                    {
                        arrays[x + 1] = operador + ""; // Guardar un Char a un String
                    }
                    x++; // Para saltar la posicion donde ha guardado el operador
                }
                //Converit el Arrays a String
                String concat = "";

                for (int x = 0; x < arraysLengh; x++)
                {
                    concat += arrays[x];
                }

                int res = evaluarExpresion(concat);
                System.out.println("");
                System.out.println("Calcula la siguiente expresion : (" + concat + ")");

                int respuesta = sc.nextInt();
                if (respuesta == res)
                {
                    System.out.println("****La respuesta es correcta****");
                    matriz[i][1] += 1;
                } else
                {
                    System.out.println("****La respuesta NO es correcta****");
                    System.out.println("El resultado de la expresión matemática " + concat + " es: " + res);

                }
                System.out.println("");
                System.out.println("El jugador " + nombres[i] + " tiene : " + matriz[i][1]);
            }

        }
    }

    /**
     * Function to generate a random symbol that will be an operation for the
     * Mathematic expression.
     *
     * @return Returns a String that will be the symbol.
     */
    static char simbol()
    {
        int simbolos = (int) (1 + Math.random() * (3 - 1 + 1));

        simbol = '+'; // Supongamos que el operador es '+'

        if (simbolos == 2)
        {
            simbol = '-';
        } else if (simbolos == 3)
        {
            simbol = '*';
        }
        return simbol;
    }

    /**
     * Function to evaluate the randomly generated mathematical expression.
     *
     * @param expression Reads a string (the mathematical expression) and
     * evaluates it.
     * @return Returns the result of the mathematical expression it reads.
     */
    // Funcion para evaluar la expresion matematica :
    static int evaluarExpresion(String expresion)
    {
        int valor = 0;
        try
        {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("javascript");
            Object result = engine.eval(expresion);
            valor = Integer.decode(result.toString());

        } catch (Exception e)
        {
            e.getMessage();
        }
        return valor;
    }

    /**
     * Function to show the winner, read the scores and show the player who has
     * the highest score.
     *
     * @param scores Read the array of scores
     * @return Returns the name string of the player with the highest
     * punctuation
     */
    /* CON ESTA FUNCION FINALIZAMOS LA PARTIDA Y MONSTAMOS EL ****GANADOR****  */
    static void finalizarPartida()
    {
        for (i = 0; i < numJogadores - 1; i++)
        {
            System.out.println("El jugador " + nombres[i] + " tiene : " + matriz[i][1]);
        }

        System.out.println("");
        String ganador = "";
        int puntuacionMax = 0;
        for (i = 0; i < matriz.length; i++)
        {
            if (i == 0)
            {
                puntuacionMax = matriz[i][1];
                ganador = nombres[i];
            } else if (matriz[i][1] > puntuacionMax)
            {
                puntuacionMax = matriz[i][1];
                ganador = nombres[i];
            }
        }
        System.out.println("El ganador es : ****" + ganador + "****");
    }

}
