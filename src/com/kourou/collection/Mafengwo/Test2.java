package com.kourou.collection.Mafengwo;
/**
 * @Author： kourou
 * @Data： 2019/9/23 19:38
 * @Description：给定一棵满二叉树，要求找出中序遍历序列的下一个节点。
 * 输入：1,2,3,4,5,6,7,8,9        4
 * 输出：9
 */
class Main{
    private  class TreeNode{
        int value;
        TreeNode left = null;
        TreeNode right = null;
        TreeNode next = null;
        int a = -1;
        TreeNode(int value1, int i6, int i5, int i4, int i3, int i2, int i1, int i, int value){
            this.value = value;
        }
    }
    public int GetNode(TreeNode node){
        if (node == null){
            return -1;
        }
        //有右子树
        if (node.right != null) {
            node = node.right;
            while (node.left != null){
                node = node.left;
            }
            return node.value;
        }
        //没有右子树
        while (node.next != null && node.next.right == node){
            node = node.next;
        }
        return node.next.value;
    }

}
