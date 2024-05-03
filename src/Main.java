public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();


        Node erster = new Node(2);
        Node zweiter = new Node(4);
        Node dritter = new Node(5);
        Node vierter = new Node(7);
        Node fuenfter = new Node(10);
        Node sechster = new Node(14);


        graph.addnode(erster);
        graph.addnode(zweiter);
        graph.addnode(dritter);
        graph.addnode(vierter);

        graph.addedge(erster ,7,zweiter);
        graph.addedge(zweiter,5,dritter);
        graph.addedge(dritter,6,vierter);
        graph.addedge(zweiter,3,vierter);

        graph.tiefensuche(erster);

    }
}