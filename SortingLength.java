String[] sortByLength(String[] inputArray) {
  // Arrays.sort(inputArray);
    String temp;
   for(int i=0;i<inputArray.length;i++)
   {
       for(int j=0;j<inputArray.length-i-1;j++)
       {
            if(!(inputArray[j].length() == inputArray[j+1].length()))
               {
                 if(inputArray[j].length() > inputArray[j+1].length() )
                  {
                  temp=inputArray[j];
                  inputArray[j]=inputArray[j+1];
                  inputArray[j+1]=temp;
                   }
               }
       }
       
   }
    return inputArray;

}



/*

Given an array of strings, sort them in the order of increasing lengths. If two strings have the same length, their relative order must be the same as in the initial array.

Example

sortByLength(["abc",
              "",
              "aaa",
              "a",
              "zz"]) = ["",
                        "a",
                        "zz",
                        "abc",
                        "aaa"]
[input] array.string inputArray

A non-empty array of strings

https://www.youtube.com/watch?v=UcOxGmj45AA


*/