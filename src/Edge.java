public class Edge {
    private int _gewicht;
    private Node _knoten1;
    private Node _knoten2;

    public Edge(Node knoten1, int gewicht) {
        _gewicht = gewicht;
        _knoten1 = knoten1;
    }

    public Node getsource() {
        return  _knoten1;
    }
    public String getweight() {
        return "" + _gewicht;
    }

}

