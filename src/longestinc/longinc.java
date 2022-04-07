package longestinc;
	import java.util.Arrays;
	public class longinc  {  
	    static int lengthOfLIS(int[] a) {
	        if (a.length == 0) {
	            return 0;
	        }

	        int[] cache = new int[a.length];
	        Arrays.fill(cache, 1);

	        for (int i = 1; i < a.length; i++) {
	            for (int j = 0; j < i; j++) {
	                if (a[i] > a[j]) {
	                    cache[i] = Math.max(cache[i], cache[j] + 1);
	                }
	            }
	        }

	        return Arrays.stream(cache).max().getAsInt();
	    }


	    public static void main(String[] args) {
	        int[] arr = {12,45,86,84,36,75,91,45};
	        System.out.println("longest increament subsequence is ");
	        System.out.println(lengthOfLIS(arr));
	    }
	}


