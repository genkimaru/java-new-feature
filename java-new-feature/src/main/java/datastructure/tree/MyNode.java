package datastructure.tree;

import java.util.Comparator;

/**
 * @auther guan.c.wang
 * @date 2/7/2020.
 * @see
 */
public class MyNode<T extends Integer>{

    public MyNode(T data) {
        this.data = data;
    }

    private  T data;
    private MyNode<T> left = null;
    private MyNode<T> right = null;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public MyNode<T> getLeft() {
        return left;
    }

    public void setLeft(MyNode<T> left) {
        this.left = left;
    }

    public MyNode<T> getRight() {
        return right;
    }

    public void setRight(MyNode<T> right) {
        this.right = right;
    }

    public void insert(MyNode node){
        if(data.compareTo(node.getData()) < 0 ){
            if(this.right == null){
                this.right = node;
            }else{
                this.right.insert(node);
            }

        }else{
            if(this.left == null ){
                this.left = node;
            }else{
                this.left.insert(node);
            }
        }
    }


    public void preorder(){
        //root
        System.out.print(data + " - ");
        //left
        if(left != null){
            left.preorder();
        }
        if(right != null){
            right.preorder();
        }
    }


    public void middleOrder(){
        if(left != null){
            left.preorder();
        }
        //root
        System.out.print(data + " - ");
        if(right != null){
            right.preorder();
        }
    }

    public void afterOrder(){
        if(left != null){
            left.preorder();
        }
        if(right != null){
            right.preorder();
        }
        //root
        System.out.print(data + " - ");
    }

}