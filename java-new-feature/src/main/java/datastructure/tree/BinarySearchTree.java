package datastructure.tree;


import java.util.Comparator;

/**
 * @auther guan.c.wang
 * @date 2/7/2020.
 * @see
 */
public class BinarySearchTree<T extends Integer> {

    private MyNode<T> root ;

    public BinarySearchTree(MyNode<T> root) {
        this.root = root;
    }

    public MyNode<T> getRoot() {
        return root;
    }

    public void setRoot(MyNode<T> root) {
        this.root = root;
    }

    public void add(MyNode<T>  myNode ) throws Exception {
        root.insert(myNode);
    }

    // 前序排序
    public void preorder(){
        root.preorder();
    }

    // 前序排序
    public void middleOrder(){
        root.middleOrder();
    }

    // 前序排序
    public void afterOrder(){
        root.afterOrder();
    }

}


