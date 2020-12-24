
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salman.sayeed
 */
public class TicTacToe {
    
    public static void printBoard(char [][]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(" "+arr[i][j]);
                if(j!=arr[i].length-1)
                {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if(i!= arr.length-1)
                System.out.println("-----------");
        }
    }
    public static void placeCharacter(char [][]arr,int pos, char ch)
    {
        switch (pos)
        {
            case 1:
                arr[0][0]=ch;
                break;
            case 2:
                arr[0][1]=ch;
                break;
            case 3:
                arr[0][2]=ch;
                break;
            case 4:
                arr[1][0]=ch;
                break;
            case 5:
                arr[1][1]=ch;
                break;
            case 6:
                arr[1][2]=ch;
                break;
            case 7:
                arr[2][0]=ch;
                break;
            case 8:
                arr[2][1]=ch;
                break;
            case 9:
                arr[2][2]=ch;
                break;
             
        }
    }
    public static boolean checkBoard(char[][] arr)
    {
        return (arr[0][0] == arr[0][1] && arr[0][0] == arr[0][2]) || (arr[1][0] == arr[1][1] && arr[1][0] == arr[1][2])|| (arr[2][0] == arr[2][1] && arr[2][0] == arr[2][2])||
                (arr[0][0] == arr[1][0] && arr[0][0] == arr[2][0]) || (arr[0][1] == arr[1][1] && arr[0][1] == arr[2][1]) || (arr[0][2] == arr[1][2] && arr[0][2] == arr[2][2]) || (arr[0][0]==arr[1][1] && arr[1][1] == arr[2][2]) || (arr[0][2]==arr[1][1] && arr[1][1]==arr[2][0]);
    }
    public static void main(String []args)
    {
        char [][] board = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        Scanner sc = new Scanner(System.in);
        boolean drawCheck = true;
        //printBoard(board);
        for(int i=0;i<9;i++)
        {
            if(i%2==0)
            {
                printBoard(board);
                System.out.println("Player 1 place 'X' to your desired position.");
                int position = sc.nextInt();
                placeCharacter(board,position,'X');
                if(checkBoard(board)== true)
                {
                    System.out.println("Game Over!! Player 1 is the winner");
                    printBoard(board);
                    drawCheck = false;
                    break;
                }
            }
            else
            {
                printBoard(board);
                System.out.println("Player 2 place 'O' to your desired position.");
                int position = sc.nextInt();
                placeCharacter(board,position,'O');
                if(checkBoard(board)== true)
                {
                    System.out.println("Game Over!! Player 2 is the winner");
                    printBoard(board);
                    drawCheck = false;
                    break;
                }
            }
           // printBoard(board);
        }
        if(drawCheck == true)
        {
            System.out.println("Sad!! The game ends with a draw");
            printBoard(board);
        }
        
    }
    
}
