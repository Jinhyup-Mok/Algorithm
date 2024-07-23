class Solution {
    public boolean solution(int x) {
        
        String str = Integer.toString(x);
        int sum = 0;
        
        for (int i=0; i<str.length(); i++) sum += str.charAt(i)-'0';
        
        return x%sum==0?true:false;
    }
}

//         int sum = String.valueOf(x).chars().map(ch -> ch-'0').sum();
        
//         return x % sum == 0;