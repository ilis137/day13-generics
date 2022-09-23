package com.javapractice;

public class Maximum {
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

  public String calculateLargestString(String ...elements){
    String max=elements[0];
     for(String element:elements){
       if(element.compareTo(max)>0){
        max=element;
       }
     }
     return max;
  }
}
