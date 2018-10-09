class Solution {
    public int compareVersion(String version1, String version2) {
        int traverseV1=0,traverseV2=0;
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");
        while(traverseV1 < v1.length && traverseV2 < v2.length) {
           if((v1[traverseV1].length() != v2[traverseV2].length()) && (Integer.valueOf(v1[traverseV1]) ==                     Integer.valueOf(v2[traverseV2]))) {
                return 0;
            }
            
            if(v1[traverseV1]=="." && v2[traverseV2]==".") {
                    traverseV1++;
                    traverseV2++;
                    continue;
            }  
           if(Integer.valueOf(v1[traverseV1]) < Integer.valueOf(v2[traverseV2])) {
                return -1;
            }
            else if(Integer.valueOf(v1[traverseV1]) > Integer.valueOf(v2[traverseV2])) {
                return 1;
            }
            else {
                traverseV1++;
                traverseV2++;
            }
        }
        if(traverseV1 < v1.length) {
              while(traverseV1 < v1.length) {
                 if(Integer.valueOf(v1[traverseV1]) > 0) {
                     return 1;
                 }
                 traverseV1++;
              }    
        }
        else if(traverseV2 < v2.length) {
           while(traverseV2 < v2.length) {
                 if(Integer.valueOf(v2[traverseV2]) > 0) {
                     return -1;
                 }
                 traverseV2++;
              }  
        }
        return 0;
        
    }
}