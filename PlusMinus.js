/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 * Given an array of integers, calculate the ratios of its 
 * elements that are positive, negative, and zero. 
 * Print the decimal value of each fraction on a new line 
 * with 6 places after the decimal.
 * 
 */

function plusMinus(arr) {
    var len = arr.length, pos = 0, neg = 0, nul =0;
    for(var i=0; i<len; i++){
        if(arr[i]>0){pos++;}
        else if(arr[i]<0){neg++;}
        else {nul++;}
    }
    console.log((pos/len).toFixed(5));
    console.log((neg/len).toFixed(5));
    console.log((nul/len).toFixed(5));
}
