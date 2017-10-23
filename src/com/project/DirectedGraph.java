package com.project;

import java.util.*;

public class DirectedGraph {
	
private Map<Node, ArrayList<Node>> graph = new HashMap<Node, ArrayList<Node>>();
private ArrayList<Label> label = new ArrayList<Label>();
	
	public void addNode(Node n){
		if (graph.containsKey(n)){
			System.out.println("The Node is already added in the Graph.");
		}else{
			graph.put(n, new ArrayList<Node>());
		}
	}
	
	public void addNeighbour(Node p, Node n){
		if (graph.containsKey(p)){
			ArrayList<Node> l = graph.get(p);
			l.add(n);
			Label e = new Label(p.getName()+","+n.getName());
			label.add(e);
		}else{
			System.out.println("Parent Node is not added in the Graph.");
		}
	}
	
	public void addNeighbourList(Node n, ArrayList<Node> nList){
		for (int i = 0; i<nList.size(); i++){
			addNeighbour(n, nList.get(i));
		}
	}
	
	public void getNeighboursOfNode(Node n){
		ArrayList nList = graph.get(n);
		if (nList==null){
			System.out.println("The Node is not added in the Graph.");
		}else{
			for (int i = 0; i<nList.size(); i++){
				System.out.println(((Node) nList.get(i)).getName());
			}
		}
	}
	
	public void deleteNeighbour(Node p, Node n){
		ArrayList nList = graph.get(p);
		if (nList==null){
			System.out.println("Parent Node is not added in the Graph.");
		}else{
			for (int i = 0; i<nList.size(); i++){
				Node nodeDelete = (Node) nList.get(i);
				if (nodeDelete==n) {
					nList.remove(nodeDelete);
					Label e = new Label(p.getName()+","+n.getName());
					label.remove(e);
				}
			}
		}
	}
	
}
