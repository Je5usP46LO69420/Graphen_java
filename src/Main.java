public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();


        graph.addnode(1);
        graph.addnode(2);
        graph.addnode(3);

        graph.addedge(1,7,2);
        graph.addedge(2,5,3);

        graph.printgraph();

    }
}