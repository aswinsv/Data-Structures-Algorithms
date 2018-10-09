class Solution {
    private class RoomIndex {
        int rowIndex=0;
        int columnIndex=0;
        RoomIndex() {
            
        }
        RoomIndex(int rowIndex,int columnIndex) {
            this.rowIndex=rowIndex;
            this.columnIndex=columnIndex;
        }
        public void setRowIndex(int rowIndex) {
            this.rowIndex=rowIndex;
        }
        public int getRowIndex() {
            return rowIndex;
        }
         public void setColumnIndex(int columnIndex) {
            this.columnIndex=columnIndex;
        }
        public int getColumnIndex() {
            return columnIndex;
        }
        @Override
        public boolean equals(Object o) {
            if(o == this) return true;
            if(!(o instanceof RoomIndex)) {
                return false;
            }
            RoomIndex roomIndex=(RoomIndex) o;
            return (roomIndex.getRowIndex()==rowIndex) && (roomIndex.getColumnIndex()==columnIndex);
        }
        @Override
        public int hashCode() {
            String combinedIndex=String.valueOf(rowIndex).concat(String.valueOf(columnIndex));
            return Integer.parseInt(combinedIndex);
        }
    }
    public void wallsAndGates(int[][] rooms) {
        Queue<RoomIndex> nodes=new LinkedList<RoomIndex>();
        Set<RoomIndex> used=new HashSet<RoomIndex>();
        
        for(int i=0;i<rooms.length;i++) {
            for(int j=0;j<rooms[i].length;j++) {
                int distance=-1;
                if(rooms[i][j]== 2147483647) {
                    nodes.clear();
                    used.clear();
                    RoomIndex firstRoomIndex=new RoomIndex(i,j);
                    nodes.add(firstRoomIndex);
                    used.add(firstRoomIndex);
                    while(!nodes.isEmpty()) {
                        distance=distance+1;
                        int size=nodes.size();
                        for(int k=0;k<size;k++) {
                           RoomIndex roomIndex=(RoomIndex) nodes.poll();
                           int rowIndex=roomIndex.getRowIndex();
                           int colIndex=roomIndex.getColumnIndex();
                            if(rooms[rowIndex][colIndex]==0) {
                                rooms[i][j]=distance;
                                break;
                            }
                          if(rowIndex+1 < rooms.length) {
                                 RoomIndex tempIndex1=new RoomIndex(rowIndex+1,colIndex);
                                 if((rooms[rowIndex+1][colIndex]!=-1 &&  !used.contains(tempIndex1)))                                                                                   
                                 {
                                     nodes.add(tempIndex1);
                                     used.add(roomIndex);
                                 }
                            }        
                        
                           if(colIndex+1 < rooms[i].length) {
                                 RoomIndex tempIndex2=new RoomIndex(rowIndex,colIndex+1);
                                 if((rooms[rowIndex][colIndex+1]!=-1) &&  !used.contains(tempIndex2))                                                                                      
                                 {
                                     nodes.add(tempIndex2);
                                     used.add(roomIndex);
                                 }
                             } 
                            if(rowIndex-1 >= 0) {
                                 RoomIndex tempIndex3=new RoomIndex(rowIndex-1,colIndex);
                                 if((rooms[rowIndex-1][colIndex]!=-1 &&   !used.contains(tempIndex3)))                                                                                                                    
                                 {
                                     nodes.add(tempIndex3);
                                     used.add(roomIndex);
                                 }
                             } 
                          if(colIndex-1 >= 0) {
                                 RoomIndex tempIndex4=new RoomIndex(rowIndex,colIndex-1);
                                 if((rooms[rowIndex][colIndex-1]!=-1) &&   !used.contains(tempIndex4))                                                                                  
                                 {
                                     nodes.add(tempIndex4);
                                     used.add(roomIndex);
                                 }
                             } 
                           } 
                         if(rooms[i][j]!=2147483647) {
                           break;
                         }    
                      }
                           
                   }  
                }   
            }
        }    
                
    }
