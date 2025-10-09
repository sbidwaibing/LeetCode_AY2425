class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length, m = mana.length;
        long[] cumulativeSkills = new long[n];
        cumulativeSkills[0] = skill[0];
        for (int i = 1; i < n; i++) {
            cumulativeSkills[i] = cumulativeSkills[i - 1] + skill[i];
        }
        long totalSkill = cumulativeSkills[n - 1];
        int[] kelborthanzSkill = skill.clone();
        int[] kelborthanzMana = mana.clone();
        long startTime = 0;
        for (int j = 1; j < m; j++) {
            long newStartTime = Long.MIN_VALUE;
            newStartTime = Math.max(newStartTime, startTime + (long) skill[0] * mana[j - 1]);
            for (int i = 1; i < n; i++) {
                long candidate = startTime + cumulativeSkills[i] * mana[j - 1] - cumulativeSkills[i - 1] * mana[j];
                newStartTime = Math.max(newStartTime, candidate);
            }
            startTime = newStartTime;
        }
        return startTime + totalSkill * mana[m - 1];
    }
}