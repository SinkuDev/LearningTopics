//package A_Own_DSA_Sheet;
//
//public class ConvertBinaryTreetoDoublyLinkedList {
//    LLNode head;
//    LLNode tail;
//
//
//    public TreeNode convert(TreeNode root) {
//        if (root == null) {
//            return null;
//
//        }
//        helper(root);
//        return head;
//    }
//
//    private void helper(TreeNode node) {
//        if (node == null) {
//            return null;
//
//        }
//        //left
//        helper(node.left);
//
//        //Root
//        LLNode newNode = new LLNode(node.val);
//        if (head == null) {
//            head = newNode;
//            tail = newNode;
//
//        } else {
//
//            tail = newNode;
//        }
//
//        //Right
//        helper(node.right);
//    }
//}
//
//class  LLNode{
//    int val;
//    LLNode prev;
//    LLNode next;
//
//    public LLNode(int val) {
//        this.val = val;
//    }
//}
//
//class TreeNode{
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    public TreeNode(int val) {
//        this.val = val;
//    }
//}
