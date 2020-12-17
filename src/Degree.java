/**
 * Jessica Yang
 * Comp Sci 2210
 * Concept Asn 2
 * Student Number : 251083596
 * Username: jyang762
 * Date: Oct 20 2020
 *
 */
public class Degree {

	int maxDeg =0;
	public int maxDegree(Node r) {
		/* Input: Root r of a tree
     Output: Maximum degree of the nodes in the tree

     You can use the following methods from class Node:
        - numChildren() returns the number of children of a node.
        - isLeaf(): returns true if a node is a leaf and returns false otherwise

     To translate the following pseudocode

        for each child u of r do { ... }

     use the following java code:

        Node[] children = r.getChildren();
        for (Node u : children) { ... }
		 */
		if (r.isLeaf()) return maxDeg; // if the current node is a leaf, then return the max degree
		else { //otherwise check the current node and its children
			if (r.numChildren()>maxDeg) maxDeg = r.numChildren(); // if the current node has more children than maxDeg then set that as the new maxDeg
			Node[] children = r.getChildren();
			for (Node u: children) maxDegree(u);  // check all the degrees of the children of the current node
		}
		return maxDeg; // returns the ending max degree


	}

}