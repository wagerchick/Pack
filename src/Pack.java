import java.util.Scanner;

class Pack {
    public int index = 0;
    int fuction;
    Object[] objects = new Object[10];
    public void select(){
        System.out.println("1 添加数据 2 删除数据 3 打印数据  4 查询元素个数 5 修改数据 6 插入数据 0 退出");
    }
    public void setFuction(int fuction){
        Scanner in = new Scanner(System.in);
        this.fuction=fuction;
    }//跳回功能实现
    public void add(Object o){
        //当index超出最初定义数组的长度时，自动扩容
        if(index == objects.length){
            Object[] newObjects = new Object[objects.length * 2];
            for (int i = 0; i <index ; i++) {
                newObjects[i] = objects[i];
            }
            objects = newObjects;
        }
        objects[index] = o;
        index++;
    }//添加数据，实现自动扩容
    public void remove(int fuction){
        for (int i = fuction-1; i < index ; i++) {
            objects[i] = objects[i+1];
        }index--;
    }//删除数据
    public void insert(int fuction,Object o ){
        index++;
        for (int i = index ; i > fuction-1 ; i--) {
            objects[i] = objects[i-1];
        }
        objects[fuction-1] = o;

    }//插入数据
    public void print(int sum){
        System.out.println(objects[sum]);
    }//查询单个下标元素
    public void printall(){
        System.out.print("{");
        for (int i = 0; i <index ; i++) {
            System.out.print("["+objects[i]+"]");
        }
        System.out.println("}");
    }//打印所有元素
    public int size(){
        return index;
    }//查询容器内所有元素个数
    public void change(int fuction){
        objects[fuction-1]=null;
    }
    public void change1(int index,Object o){
        objects[index-1] = o;
    }
}
