public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();


        graph.addnode(25);
        graph.addnode(10);
        graph.addnode(7);

        graph.addedge(23,7,3);
        graph.addedge(5,4,45);

        graph.printgraph();

    }
}