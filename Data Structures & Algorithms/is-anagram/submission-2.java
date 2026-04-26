class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mp=new HashMap<>();
        int n1=s.length();
        int n2=t.length();
        if(n1!=n2){
            return false;
        }
        for(int i=0;i<n1;i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!mp.containsKey(ch)) return false;
            mp.put(ch,mp.get(ch)-1);
            if(mp.get(ch)==0){
                mp.remove(ch);
            }
        }
        return mp.isEmpty();
        
    }
}
