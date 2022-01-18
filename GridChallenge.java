import java.util.*;

class Result {

    /* 
     * Given a square grid of characters in the range ascii[a-z], 
     * rearrange elements of each row alphabetically, ascending. 
     * Determine if the columns are also in ascending alphabetical 
     * order, top to bottom. Return YES if they are or NO if they are not.
     * 
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
        // Write your code here
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<grid.size(); i++){
            char[] chars = grid.get(i).toCharArray();
            Arrays.sort(chars);
            grid.set(i, new String(chars));
        }
        for(int i=0; i<grid.get(0).length(); i++){
            int checker = 0;
            for(int j=0; j<grid.size(); j++){
                if(alpha.indexOf(grid.get(j).charAt(i)) < checker) return "NO";
                checker = alpha.indexOf(grid.get(j).charAt(i));
            }
        }
        return "YES";
    }

}