// class Solution {
//     public int[] avoidFlood(int[] rains) {
//         int n=rains.length;
//         int[] ans=new int[n];
//         Arrays.fill(ans,-1);

//         HashMap<Integer,Integer> lastRain=new HashMap<Integer,Integer>();
//         Queue<Integer> flood=new LinkedList<Integer>();
//         // Queue<Integer> dryDay=new LinkedList<Integer>();

//         int lastDryDay=-1;

//         for(int i=0;i<n;i++){
//             if(rains[i]!=0){
//                 if(lastRain.containsKey(rains[i])){
//                     if(lastDryDay < lastRain.get(rains[i])){
//                         System.out.println(lastDryDay +" "+ lastRain.get(rains[i]));
//                         return new int[0];
//                     }
//                     flood.add(rains[i]);
//                 }
//                 else lastRain.put(rains[i],i);
//             }
//             else {
//                 // dryDay.add(i);
//                 lastDryDay=i;
//             }
//         }

//         for(int i=0;i<n;i++){
//             if(rains[i]==0){
//                 System.out.println(flood.peek());
//                 if(flood.size() == 0) ans[i] = 1;
//                 else ans[i]=flood.poll();
//             }
//         }

//         if(flood.size()>0)return new int[0];

//         return ans;
//     }
// }

class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1); // Default dry day as 1

        // Store last day it rained on each lake
        HashMap<Integer, Integer> lastRain = new HashMap<>();
        // Store available dry days (sorted)
        TreeSet<Integer> dryDays = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                dryDays.add(i);
                // Tentatively assign 1 (we’ll update later if needed)
                ans[i] = 1;
            } else {
                int lake = rains[i];
                ans[i] = -1; // it rained, can’t dry today

                if (lastRain.containsKey(lake)) {
                    // Find a dry day after last time this lake rained
                    Integer dry = dryDays.higher(lastRain.get(lake));
                    if (dry == null) return new int[0]; // no dry day available → flood

                    ans[dry] = lake;   // dry this lake on that dry day
                    dryDays.remove(dry);
                }
                lastRain.put(lake, i); // update last rain day
            }
        }
        return ans;
    }
}
