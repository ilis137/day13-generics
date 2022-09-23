package com.javapractice;

public class MaxNumber {
  public int calculateMaxNumber(int ...nums){
    Integer max=Integer.valueOf(nums[0]);
     for(int num:nums){
       Integer temp=Integer.valueOf(num);
       if(temp.compareTo(max)>0){
        max=num;
       }
     }
     return max;
  }
}
