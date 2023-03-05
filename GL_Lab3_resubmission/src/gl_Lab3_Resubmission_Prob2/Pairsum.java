package gl_Lab3_Resubmission_Prob2;

import java.util.Scanner;

public class Pairsum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BinarySearchTree bst = new BinarySearchTree();
		System.out.println("Please eneter how many node you want to insert");
		int noOfNode = scanner.nextInt();
		for (int i=1; i<=noOfNode; i++) {
			System.out.println("Please enter value for node.");
			bst.insert(scanner.nextInt());
		}
		System.out.println("Provided Binary Tree is Below.");
		bst.inOrderTraversal();
		System.out.println();
		System.out.println("Please enter sum value which you want to find pair");
		int sum = scanner.nextInt();
		boolean isFound = bst.findPairForGivenSum(sum);
		if (!isFound) {
			System.out.println("For Given Sum "+sum+" Pair is not found");
		}


	}

}
