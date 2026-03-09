import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int []i: intervals){
            if(i[0]<=end){
                end = Math.max(i[1], end);
            }
            else{
                res.add(new int[]{start,end});
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[0][]);
    }
    public static void main(String[] args) {
        int intervals[][] = {{1,3},{2,6},{8,10},{15,18}};
                int[][] ans = merge(intervals);
        for(int[] i : ans){
            System.out.println(i[0] + " " + i[1]);
        }
    }
}
