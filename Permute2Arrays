/*
 * Complete the 'twoArrays' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. INTEGER_ARRAY A
 *  3. INTEGER_ARRAY B
 * TASK:
 *  Permute A and B such that A[i]+B[i] >= k
 *  If it's possible to do that return YES, if not, NO.
 */

function twoArrays(k, A, B) {
    // Write your code here
    const countA = {};
    for (const num of A.sort()) {
        countA[num] = countA[num] ? countA[num] + 1 : 1;
    }
    var counter = 0;
    for(var num in countA){
        var checker = 0;
        for(var i=counter; i<B.length; i++){
            if(B.sort().reverse()[i]+ parseInt(num) >= k) checker++;
            if(checker == countA[num]) break;
        }
        if(checker < countA[num]) return "NO";
        counter += countA[num];
    }
    return "YES";
}