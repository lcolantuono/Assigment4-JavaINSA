package com.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UndirectedGraph {
	private Map<Node, ArrayList<Node>> graph = new HashMap<Node, ArrayList<Node>>();

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
				if (hasRelation(n, p)){
					System.out.println("It is not possible add this Node in the Undirected Grph because has already a relation.");
				}else{
					l.add(n);
				}
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
					}
				}
			}
		}
		
		private boolean hasRelation(Node p, Node n){
			boolean result = false;
			ArrayList nList = graph.get(p);
			if (nList!=null)
				for (int i = 0; i<nList.size(); i++){
					Node node = (Node) nList.get(i);
					if (node==n) {
						result = true;
					}
				}
			return result;
		}
}
