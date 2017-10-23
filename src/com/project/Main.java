package com.project;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DirectedGraph dGraph = new DirectedGraph();
		
		Node n1 = new Node(1, "A");
		Node n2 = new Node(1, "B");
		Node n3 = new Node(1, "C");
		Node n4 = new Node(1, "D");
		Node n5 = new Node(1, "E");
		
		dGraph.addNode(n1);
		dGraph.addNode(n2);
		dGraph.addNode(n3);
		dGraph.addNode(n4);
		dGraph.addNode(n5);
		
		dGraph.addNeighbour(n1, n2);
		dGraph.addNeighbour(n1, n3);
		
		dGraph.getNeighboursOfNode(n1);
		
		ArrayList<Node> l1 = new ArrayList<Node>();
		l1.add(n2);
		l1.add(n5);
		
		dGraph.addNeighbourList(n2, l1);
		
		dGraph.getNeighboursOfNode(n2);
		
	}

}
