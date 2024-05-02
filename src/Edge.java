public class Edge {
    private int _gewicht;
    private Node _knoten1;
    private Node _knoten2;

    public Edge(Node knoten1, int gewicht, Node knoten2) {
        _gewicht = gewicht;
        _knoten1 = knoten1;
        _knoten2 = knoten2;
    }

    public Node getsource() {
        return  _knoten1;
    }

    public Node getdestination() {
        return _knoten2;
    }

    public String getweight() {
        return "" + _gewicht;
    }

    public String print() {
        return getsource()+" "+getweight()+". "+getdestination()+" ";
    }
}

