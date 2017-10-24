package com.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Label {
	
	private Map<Node, ArrayList<Edge>> graph = new HashMap<Node, ArrayList<Edge>>();
	
	public void addNode(Node n){
		if (graph.containsKey(n)){
			System.out.println("The Node is already added in the Graph.");
		}else{
			graph.put(n, new ArrayList<Edge>());
		}
	}
	
	public void addEdge(Node p, Edge e){
		if (graph.containsKey(p)){
			ArrayList<Edge> l = graph.get(p);
			l.add(e);
		}else{
			System.out.println("Parent Node is not added in the Graph.");
		}
	}
	
	public void deleteEdge(Node p, Edge e){
		ArrayList nList = graph.get(p);
		if (nList==null){
			System.out.println("Parent Node is not added in the Graph.");
		}else{
			for (int i = 0; i<nList.size(); i++){
				Edge nodeDelete = (Edge) nList.get(i);
				if (nodeDelete==e) {
					nList.remove(nodeDelete);
				}
			}
		}
	}
	
	public void getLabelsOfNode(Node n){
		ArrayList nList = graph.get(n);
		if (nList==null){
			System.out.println("The Node is not added in the Graph.");
		}else{
			for (int i = 0; i<nList.size(); i++){
				Edge e = (Edge) nList.get(i);
				System.out.println(n.getName()+" "+e.getLabel()+" "+e.getDestination().getName());
			}
		}
	}
	
}
