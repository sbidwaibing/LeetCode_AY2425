class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> unqEmail = new HashSet<>();

        for(String email: emails){
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];

            local = local.split("\\+")[0];
            local = local.replace(".", "");

            unqEmail.add(local + "@" + domain);
        }
        return unqEmail.size();
    }
}