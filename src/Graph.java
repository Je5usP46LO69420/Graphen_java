import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    List<Node> _knoten;
    List<Node> besucht = new LinkedList<>();


    public Graph(){
        _knoten = new LinkedList<>();
    }


    public void addnode(Node node){
        _knoten.add(node);
    }
    public void addedge(Node source,int weight ,Node destination){
        if(_knoten.contains(source)&&_knoten.contains(destination)){
            int indexk1 = _knoten.indexOf(source);
            int indexk2 = _knoten.indexOf(destination);

            _knoten.get(indexk1).addedge(destination,weight);
            _knoten.get(indexk2).addedge(source,weight);
        }
    }

    public void tiefennsuchecode(Node start,HashMap<Integer,Node> viseted){
        viseted.put(start.getid(),start);
        System.out.println(start.getid());

        for(Edge edge: start.getedges()){
            if(!viseted.containsKey(edge.getsource().getid())){
                viseted.put(edge.getsource().getid(),edge.getsource());
                tiefennsuchecode(edge.getsource(),viseted);
            }
        }

    }
    public void tiefensuche(Node start){
        HashMap<Integer, Node> viseted = new HashMap<>();

        tiefennsuchecode(start,viseted);
    }
    public void breitensuche(){
        for(int i = 1; i<_knoten.size()+1;i++){
            if(!besucht.contains(_knoten.get(i))) {
                System.out.println(_knoten.get(i).getid());
                besucht.add(_knoten.get(i));
            }
            else {
                breitensuche();
            }
        }

    }
    public void shortestway(){

    }
}
