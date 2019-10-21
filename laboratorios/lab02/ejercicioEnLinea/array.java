public class arrays
{
    public static void main(String[] args)
    {

    }

    public boolean isEverywhere(int[] nums, int val)
    {
        boolean flag1 = true;
        boolean flag2 = true;

        for (int i = 0; i < nums.length; i += 2)
            if (nums[i] != val) flag1 = false;

        for (int i = 0; i < nums.length - 1; i += 2)
            if (nums[i + 1] != val) flag2 = false;

        return flag1 || flag2;
    }

    public int[] zeroFront(int[] nums)
    {
        int[] res      = new int[nums.length];
        int zeroPos    = 0;
        int nonZeroPos = res.length - 1;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 0)
                res[zeroPos++]    = 0;
            else
                res[nonZeroPos--] = nums[i];

        return res;
    }

    public int bigDiff(int[] nums)
    {
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
            if (nums[i] <= min) min = nums[i];
        }
        return max - min;
    }

    public boolean has12(int[] nums)
    {
        int one = 0;
        int two = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) one = i;
            if (nums[i] == 2) two = i;
        }
        return two > one;
    }

    public String[] fizzBuzz(int start, int end)
    {
        String[] array = new String[end - start];
        for(int i = start; i<end; i++){
            if(i%3 == 0 && i%5 == 0) array[i-start] = "FizzBuzz";
            else if(i%3 == 0) array[i-start] = "Fizz";
            else if(i%5 == 0) array[i-start] = "Buzz";
            else array[i-start] = String.valueOf(i);
        }
        return array;
    }

    public int[] evenOdd(int[] nums)
    {
        int[] res   = new int[nums.length];
        int evenPos = 0;
        int oddPos  = res.length - 1;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] % 2 == 0)
                res[evenPos++] = nums[i];
            else
                res[oddPos--]  = nums[i];
        return res;
    }

    public int centeredAverage(int[] nums)
    {
        int max = nums[0];
        int min = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }
        return (sum - (max + min)) / (nums.length - 2);
    }

}