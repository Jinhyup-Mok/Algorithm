class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] str1 = new String[n];
        String[] str2 = new String[n];
        for(int i=0; i<n; i++) {
            str1[i] = "";
            str2[i] = "";
        }
        
        for(int i=0; i<n; i++) {
            int tmp1 = arr1[i];
            int tmp2 = arr2[i];
            while(tmp1 > 0) {
                str1[i] += Integer.toString(tmp1 % 2);
                tmp1 /= 2;
            }
            while(str1[i].length() < n) str1[i] += "0";
            
            while(tmp2 > 0) {
                str2[i] += Integer.toString(tmp2 % 2);
                tmp2 /= 2;
            }
            while(str2[i].length() < n) str2[i] += "0";
        }
        
        for(int i=0; i<n; i++) {
            String pw = "";
            for(int j=0; j<n; j++) {
                if(str1[i].charAt(j) == '1' || str2[i].charAt(j) == '1') pw += "#";
                else pw += " ";
            }
            StringBuffer sb = new StringBuffer(pw);
            answer[i] = sb.reverse().toString();
        }
        return answer;
    }
}