package in.saurabh.testing;

class Calc{
    //unit to reverse a string :
    public String reverseString(String str){
        //First store the string in a char array:
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

}