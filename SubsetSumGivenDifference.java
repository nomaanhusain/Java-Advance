//Difference is given, find count subset sum s1 and s2 such that difference is equal to given diff
import java.util.*;
public class SubsetSumGivenDifference {
    public static void main(String[] args) {
        int []arr=new int[]{1,1,2,3};
        int diff=1;
    int sumar=0;
    for(int i=0;i<arr.length;i++){
        sumar=sumar+arr[i];
    }
    /*
    Now see s1+s2=sumar
    and s2-s1=diff
    ie. 2s2=(diff+sumar)
    s2= (diff+sumar)/2
    s1=sum-(diff+sumar)/2
    we confirm know values of s1 and s2 such that difference is diff
    */
  int s2=(diff+sumar)/2;
  int s1=sumar-s2;
  int [][]t=new int[arr.length+1][s2+1];

  //Initialization
  for(int i=0;i<arr.length+1;i++){
    for(int j=0;j<s2+1;j++){
        if(i==0){
            t[i][j]=0;
        }
        if(j==0){
            t[i][j]=0;
        }
    }
}

//s2=4
//s1=3
int c=0;
for(int i=1;i<=arr.length;i++){
    for(int j=1;j<=s2;j++){
        if(arr[i-1]<=j){
            if(arr[i-1]+t[i-1][j-arr[i-1]]==j){
                t[i][j]=arr[i-1]+t[i-1][j-arr[i-1]];
                if(c!=0 && t[i][j]==s1){
                    c++;
                }
                if(t[i][j]==s2){
                    c++;
                }
            }
            else{
                t[i][j]=t[i-1][j];
            }
        }
        else{
            t[i][j]=t[i-1][j];
        }
    }
}
System.out.println("DP Array -->");
for(int i=0;i<=arr.length;i++){
    System.out.print(i+" --> ");
    for(int j=0;j<=s2;j++){
        System.out.print(t[i][j]+" ");
    }
    System.out.println();
}
System.out.println("Count = "+ c);
}
}