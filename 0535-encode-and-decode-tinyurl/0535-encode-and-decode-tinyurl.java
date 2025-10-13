public class Codec {
    
    Map<Integer,String>s=new HashMap<>();
    int i=0;
    
    public String encode(String longUrl) {
        s.put(i,longUrl);
        return "http://tinyurl.com/"+i++;
    }
    public String decode(String shortUrl) {
        return s.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/","")));
    }
}