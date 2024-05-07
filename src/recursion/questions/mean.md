How to find mean of a array using recursion.

Mean of array = sum of all the elements of array / number of elements in the array

from the above we can say that sum of all the elements of array = mean of array * number of elements of array

so now assume upto n-1 terms you already have the mean so from this we can say that mean of n terms = (sum of (n-1) + arr[n])/n;

we can replace the sum of (n-1) by mean of n-1 * (n-1)

from this we can write this code

***********************************************************************************************

How do I find the mean of an array using recursion?

Mean of array = sum of all the elements of array / number of elements in the array

from the above we can say that sum of all the elements of array = mean of array * number of elements of array

So now, assuming up to n-1 terms, you already have the mean, so from this, we can say that the mean of n terms is equal to the (sum of (n-1) + arr[n]))/n;

We can replace the sum of (n-1) by the mean of n-1 * (n-1).

from this we can write this code


```
private static double findMean(int[] arr,int n) {
	if (n == 1) return arr[n-1];
	return ((findMean(arr,n-1)*(n-1))+arr[n-1])/n;
}
```
