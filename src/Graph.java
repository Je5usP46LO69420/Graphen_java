import java.util.ArrayList;
import java.util.HashMap;
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

    public void printgraph(){
        for(Node node : _knoten.values()){
            node.print();
        }
    }
    public void breitensuche(int id){

    }
    public void tiefensuche(){

    }
    public void shortestway(){

    }
}
