class Solution {
    public int solution(String s) {
        String[] numstr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i=0;i<numstr.length;i++) {
        	if(s.contains(numstr[i])) {
        		s = s.replace(numstr[i], Integer.toString(i));
        	}
        }
        return Integer.parseInt(s);
    }
}