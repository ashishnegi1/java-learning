package interviewbit;

import java.util.ArrayList;

public class Solution1 {
    public static int maximalRectangle(ArrayList<ArrayList<Integer>> A) {
        int i=0, j=0, n=A.size(), m=A.get(0).size();
        // ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        // for(i=0;i<n;i++){
        //     ArrayList<Integer> temp = new ArrayList<Integer>();
        //     temp.addAll(A.get(i));
        //     arr.add(temp);
        // }
        for(i=0;i<n;i++){
            System.out.println(A.get(i));
        }
        System.out.println();
        for(i=0;i<n;i++){
            for(j=1;j<m;j++){
                if(A.get(i).get(j) == 0) continue;
                int val = A.get(i).get(j-1)+1;
                A.get(i).set(j, val);
            }
        }
        int ans=0;
        for(i=0;i<n;i++){
            System.out.println(A.get(i));
        }
        System.out.println();
        for(j=0;j<m;j++){
            int br = 0, ln = Integer.MAX_VALUE;
            for(i=0;i<n;i++){
                if(A.get(i).get(j) == 0) {
                    br = 0;
                    ln = Integer.MAX_VALUE;
                } else {
                    br++;
                    ln = Math.min(ln, A.get(i).get(j));
                    ans = Math.max(ans, ln*br);
                    A.get(i).set(j, ln*br);
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.println(A.get(i));
        }
        System.out.println();
        return ans;
    }

    public static void giveParams(){
        // int[] arr = {1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 };
        int[] arr = {0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1};
        ArrayList<ArrayList<Integer>> param = new ArrayList<ArrayList<Integer>>();
        int k=0;
        for(int i=0; i<8;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<9;j++){
                temp.add(arr[k++]);
            }
            param.add(temp);
        }
        int ans = maximalRectangle(param);
        System.out.println(ans);
    }


    public static void main(String[] args) {
        giveParams();
    }
}
