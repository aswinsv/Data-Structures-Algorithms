class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]+1 < 10) {
               digits[digits.length-1]++; 
               return digits;
        }  
      else {
          if(digits.length-2 < 0) {
              int[] newNumber=new int[2];
              newNumber[0]=1;
              newNumber[1]=0;
              return newNumber;
           }
          digits[digits.length-1]=0;
          int previousIndex=digits.length-2;
          int carry=1;
          while(previousIndex >=0 && carry==1) {
             if(digits[previousIndex]+carry<10) {
                  digits[previousIndex]+=carry;
                  return digits;
              }
             else {
                 digits[previousIndex]=0;
                 carry=1;
                 previousIndex-=1;
             } 
          }
          int[]newNumber=new int[digits.length+1];
          newNumber[0]=1;
          int index=1;
          for(int i=0;i<digits.length;i++) {
              newNumber[index]=digits[i];
              index++;
          }
          return newNumber;
      }
    }
}