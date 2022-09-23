package com.javapractice;

public class Maximum {

  //calculate maximum for integers
  public int calculateMaxNumber(int ...nums){
    Integer max=Integer.valueOf(nums[0]);//convert into integer object with wrapper class
     for(int num:nums){
       Integer temp=Integer.valueOf(num);
       if(temp.compareTo(max)>0){//compare two numbers with compareTo method
        max=num;
       }
     }//compares each element and returns a maximum in the end
     return max;
  }

  //calculate maximum for strings
  public String calculateLargestString(String ...elements){
    String max=elements[0];//String stata type is already an object
     for(String element:elements){
       if(element.compareTo(max)>0){
        max=element;
       }
     }//compares each element and returns a maximum in the end
     return max;
  }

  ////calculate maximum for generic types
   public  <T extends Comparable<T>> T calculateMaximum(T ...elements) {//declare a generic type of T
    T max = elements[0];//
    for (T element : elements) {
        if (element.compareTo(max) > 0) {//T is an object therefore compareTo method works via autoboxing
            max = element;
        }
    }//compares each element and returns a maximum in the end
    return max;
}
}
