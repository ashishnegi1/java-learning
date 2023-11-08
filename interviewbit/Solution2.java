package interviewbit;

import java.util.ArrayList;

public class Solution2 {
    public static int uniquePathsWithObstacles(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> copy = new ArrayList<ArrayList<Integer>>();
        int i=0,j=0,n=A.size(),m=A.get(0).size();
        for(i=0;i<n;i++){
            System.out.println(A.get(i));
        }
        System.out.println();
        if(A.get(n-1).get(m-1)==1 || A.get(0).get(0)==1) return 0;
        if(n==1) {
            for(i=0;i<m;i++) if( A.get(0).get(i)==1 ) return 0;
            return 1;
        }
        if(m==1) {
            for(i=0;i<n;i++) if( A.get(i).get(0)==1 ) return 0;
            return 1;
        }
        for(i=0;i<n;i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(j=0;j<m;j++){
                int val = (A.get(i).get(j) == 0 ? 1 : 0);
                temp.add(val);
            }
            copy.add(temp);
        }
        for(i=0;i<n;i++){
            System.out.println(copy.get(i));
        }
        System.out.println();
        for(i=n-1;i>=0;i--){
            for(j=m-1;j>=0;j--){
                if(copy.get(i).get(j)==0 || (i==n-1 && j==m-1)) continue;
                if(j==m-1) {
                    if(copy.get(i+1).get(j)==0) copy.get(i).set(j,0);
                    continue;
                } 
                if(i==n-1) {
                    if(copy.get(i).get(j+1)==0) copy.get(i).set(j,0);
                    continue;
                } 
                int val = copy.get(i+1).get(j) + copy.get(i).get(j+1);
                copy.get(i).set(j, val);
            }
        }
        for(i=0;i<n;i++){
            System.out.println(copy.get(i));
        }
        System.out.println();
        return copy.get(0).get(0);
    }

    public static void giveParams(){
        String input = "0 0 0 0 0 0 1 0 0 0";
        ArrayList<ArrayList<Integer>> param = new ArrayList<ArrayList<Integer>>();
        int k=0;
        for(int i=0; i<5;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<2;j++){
                char c = input.charAt(k++);
                int val = c - '0';
                temp.add(val);
                k++;
            }
            param.add(temp);
        }
        int ans = uniquePathsWithObstacles(param);
        System.out.println(ans);
    }


    public static void main(String[] args) {
        giveParams();
    }
}

// 7 9 0 0 0 1 0 1 1 0 0 0 0 0 1 1 0 1 1 0 1 0 0 0 0 0 0 1 0 1 1 0 0 1 1 0 0 1 1 1 1 0 0 0 1 0 0 1 1 1 0 0 1 1 1 1 0 0 1 1 1 0 0 1 0