class BrowserHistory {

    private class Node{
        Node prev; // prev pointer
        Node next; // next pointer
        String url; // data

        Node(String _url){
            url = _url;
        }
    }

    private Node current;

    public BrowserHistory(String homepage) {
        current = new Node(homepage);
    }
    
    public void visit(String url) {
        
        Node page = new Node(url);
        current.next = null;

        page.prev = current;
        current.next = page;

        current = page;
    }
    
    public String back(int steps) {
        
        while(steps > 0 && current.prev != null){
            current = current.prev;
            steps--;
        }

        return current.url;
    }
    
    public String forward(int steps) {
        
        while(steps > 0 && current.next != null){
            current = current.next;
            steps--;
        }

        return current.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */