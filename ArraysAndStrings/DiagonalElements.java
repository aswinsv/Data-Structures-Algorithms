class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        List<Integer>diagonalElements=new ArrayList<Integer>();
        
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
               if(i==j) {
                    if(!diagonalElements.contains(matrix[i][j])) {
                        diagonalElements.add(matrix[i][j]);
                    }   
                }
                else if(diagonalElements.contains(matrix[i][j])) {
                    continue;
                }
                else {
                  
                     
                    if((j-i)==2) {
                         if(j < matrix.length && i < matrix[i].length) {
                        diagonalElements.add(matrix[j][i]);
                       }  
                        if(i+1 < matrix.length && j-1 < matrix[i].length) {
                             diagonalElements.add(matrix[i+1][j-1]);
                        } 
                        diagonalElements.add(matrix[i][j]);
                    }
                    else {
                          diagonalElements.add(matrix[i][j]);
                         if(j < matrix.length && i < matrix[i].length) {
                            diagonalElements.add(matrix[j][i]);
                       }  
                    }
                      
                }
            }
        }
         Integer[] diagonalElementsArray=new Integer[diagonalElements.size()];
         diagonalElementsArray=diagonalElements.toArray(diagonalElementsArray);
         return Arrays.stream(diagonalElementsArray).mapToInt(Integer::intValue).toArray();
        
    }
}