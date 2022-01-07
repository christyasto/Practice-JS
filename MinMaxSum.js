/*
 * Complete the 'miniMaxSum' function below.
 *
 * Given five positive integers, find the minimum and maximum values 
 * that can be calculated by summing exactly four of the five integers. 
 * Then print the respective minimum and maximum values as a single line 
 * of two space-separated long integers.
 * 
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

function miniMaxSum(arr) {
    // Write your code here
    var sorted = JSON.parse(JSON.stringify(arr));
    sorted.sort();
    var min = JSON.parse(JSON.stringify(sorted));
    var max = JSON.parse(JSON.stringify(sorted));
    min.pop();
    max.shift();
    var totalMin = 0, totalMax = 0;
    for(var i=0; i<min.length; i++){
        totalMin += min[i];
        totalMax += max[i];
    }
    console.log(totalMin+" "+totalMax);
}