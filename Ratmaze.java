public class Ratmaze {
   static int N=4;
   static boolean isSafe(int r,int c,int sol[][]){
       if(r<0 || r>=N || c<0 || c>=N){
           return false;
       }if(sol[r][c]==0 || sol[r][c]==1){
           return false;
       } 
       return true;
   }
   static void printSol(int sol[][]){
       for(int i=0;i<N;i++){
           for(int j=0;j<N;j++){
               System.out.print(sol[i][j]+ " ");
           }
           System.out.println();
       }
   }
   static boolean solveRatMaze(){
       int sol[][]=new int[4][4];
       for(int i=0;i<N;i++){
           for(int j=0;j<N;j++){
               sol[i][j]=-1;
           }
       }
       sol[0][1]=0;
       sol[0][2]=0;
       sol[0][3]=0;
       sol[1][2]=0;
       sol[2][0]=0;
       sol[2][2]=0;
       sol[2][3]=0;
       int xMove[]= {1,0};
       int yMove[]={0,1};
       sol[0][0]=1;
       if(!solveRMUntil(0, 0, sol, xMove, yMove)){
           return false;
       }else{
           printSol(sol);
       }
       return true;
   }
   static boolean solveRMUntil(int x,int y,int sol[][],int xMove[],int yMove[]){
    int next_x,next_y;
    if(x==N-1 && y==N-1){
        return true;
    }
    for(int i=0;i<2;i++){
        next_x=x+xMove[i];
        next_y=y+yMove[i];
        if(isSafe(next_x, next_y, sol)){
            sol[next_x][next_y]=1;
            if(solveRMUntil(next_x, next_y, sol, xMove, yMove)){
                return true;
            }else{
                sol[next_x][next_y]=-1;
            }
        }
        
    }
    return false;
   }
   public static void main(String[] args) {
       System.out.println("Done");
       solveRatMaze();
   }
}