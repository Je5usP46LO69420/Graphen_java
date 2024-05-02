import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    HashMap<Integer,Node> _knoten;


    public Graph(){
        _knoten = new HashMap<>();
    }


    public void addnode(int data){
        _knoten.put(data,new Node(data));
    }
    public void addedge(int source,int weight ,int destination){
        _knoten.get(source).addedge(new Edge(_knoten.get(source),weight,_knoten.get(destination)));
    }

    public void breitensuche(Node start){

    }
    public void tiefensuche(Node start){
        System.out.println(start.getid());
        List<Node> besucht = new LinkedList<>();

        for(Edge e :start.getedge()){  //get edge nicht funktioniert
            Node neighbour = e.getdestination();
            if(!besucht.contains(neighbour)){
                besucht.add(neighbour);
                tiefensuche(neighbour);
            }
        }
    }
    public void shortestway(){

    }
}
