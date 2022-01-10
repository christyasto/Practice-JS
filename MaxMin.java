import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Result {

    /*
     * You will be given a list of integers, arr, and a single integer k. 
     * You must create an array of length k from elements of arr such that 
     * its unfairness is minimized. Call that array arr'. 
     * Unfairness of an array is calculated as max(arr')-min(arr')
     * 
     * Where:
     * - max denotes the largest integer in 
     * - min denotes the smallest integer in 
     * 
     * Complete the 'maxMin' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int maxMin(int k, List<Integer> arr) {
    // Write your code here
        List<Integer> _arr = arr.stream().sorted().collect(Collectors.toList());
        List<Integer> unfair = new ArrayList<Integer>();
        for(int i=0; i<arr.size()+1-k; i++){
            unfair.add(_arr.get(i+k-1) - _arr.get(i));
        }
        unfair = unfair.stream().sorted().collect(Collectors.toList());
        return unfair.get(0);
    }

}