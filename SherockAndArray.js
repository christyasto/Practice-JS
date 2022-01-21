/*
 * Complete the 'balancedSums' function below.
 *
 * Watson gives Sherlock an array of integers. 
 * His challenge is to find an element of the array 
 * such that the sum of all elements to the left is 
 * equal to the sum of all elements to the right.
 * 
 * You will be given arrays of integers and must 
 * determine whether there is an element that meets 
 * the criterion. If there is, return YES. Otherwise, return NO.
 * 
 * The function is expected to return a STRING.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

function balancedSums(arr) {
    // Write your code here
    var sum = 0, checker = 0, io = true;
    for(var i=0; i<arr.length; i++){
        sum += arr[i];
    }
    sum /= 2;
    
    for(var i=0; i<arr.length; i++){
        if(io) checker += arr[i];
        else checker -= arr[i];
        if(checker == sum) return "NO";
        else if(checker > sum) {
            io = false;
            checker -= arr[i];
        }
    }
    if(checker == 0) return "YES";
    else return "NO";
}
