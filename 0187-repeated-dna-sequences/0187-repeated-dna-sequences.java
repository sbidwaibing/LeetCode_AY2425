class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
       
        Set<String> seenSeq = new HashSet<>();
        Set<String> repSeq = new HashSet<>();

        for(int i=0; i<=s.length() - 10; i++){
            String subSeq = s.substring(i, i + 10);

            if(!seenSeq.add(subSeq)) repSeq.add(subSeq);
        }

        return new ArrayList<>(repSeq);
    }
}