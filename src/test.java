import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pack pack = new Pack();
        pack.select();
        int fuction = in.nextInt();
        while (fuction != 0){
            switch (fuction){
                case 1://添加数据
                    int select;
                    System.out.println("请选择添加几个数据");
                    int jk0 = in.nextInt();
                    while (jk0 != 0){
                        System.out.println("请选择输入的数据类型");
                        System.out.println("1 字符串 2 整型 3 浮点数 ");
                        int jk1 = in.nextInt();
                        System.out.println("请输入倒数第"+jk0+"个数据");
                        switch (jk1) {
                            case 1:
                                String jk2 = in.next();
                                pack.add(jk2);
                                jk0--;
                                break;
                            case 2:
                                int jk3 = in.nextInt();
                                pack.add(jk3);
                                jk0--;
                                break;
                            case 3:
                                float jk4 =in.nextFloat();
                                pack.add(jk4);
                                jk0--;
                                break;
                            default://跳出程序
                                jk0 = 0;
                                break;
                        }
                    }
                    if (jk0 == 0) {
                        pack.select();
                        select = in.nextInt();
                        pack.setFuction(select);
                        fuction = pack.fuction;
                    }
                    break;
                case 2://删除数据
                    System.out.println("请问您要删除第几个数据？");
                    select = in.nextInt();
                    pack.remove(select);
                    System.out.println("成功删除第"+select+"个数据");
                    pack.select();
                    select = in.nextInt();
                    pack.setFuction(select);
                    fuction = pack.fuction;
                    break;
                case 3://打印数据
                    pack.printall();
                    pack.select();
                    select = in.nextInt();
                    pack.setFuction(select);
                    fuction = pack.fuction;
                    break;
                case 4://查询元素个数
                    System.out.println("容器内有"+pack.size()+"个元素");
                    pack.select();
                    select = in.nextInt();
                    pack.setFuction(select);
                    fuction = pack.fuction;
                    break;
                case 5://修改数据
                    jk0 = 1;
                    while (jk0 != 0) {
                    System.out.println("请问您要修改第几个数据？");
                    select = in.nextInt();
                        if (select != 0) {
                            pack.change(select);
                            System.out.println("请选择输入的数据类型");
                            System.out.println("1 字符串 2 整型 3 浮点数 ");
                            int jk1 = in.nextInt();
                            System.out.println("请输入修改后的数据");
                            switch (jk1) {
                                case 1:
                                    String jk2 = in.next();
                                    pack.change1(select,jk2);
                                    jk0 = 0;
                                    break;
                                case 2:
                                    int jk3 = in.nextInt();
                                    pack.change1(select,jk3);
                                    jk0 = 0;
                                    break;
                                case 3:
                                    float jk4 =in.nextFloat();
                                    pack.change1(select,jk4);
                                    jk0 = 0;
                                    break;
                                default://跳出程序
                                    jk0 = 0;
                                    break;
                            }
                            if (jk0 == 0) {
                                pack.select();
                                select = in.nextInt();
                                pack.setFuction(select);
                                fuction = pack.fuction;
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("请问您要插入第几个位置？");
                    select = in.nextInt();
                    System.out.println("请选择插入的数据类型");
                    System.out.println("1 字符串 2 整型 3 浮点数 ");
                    int jk1 = in.nextInt();
                    System.out.println("请输入要插入数据");
                    switch (jk1) {
                        case 1:
                            String jk2 = in.next();
                            pack.insert(select,jk2);
                            break;
                        case 2:
                            int jk3 = in.nextInt();
                            pack.insert(select,jk3);
                            break;
                        case 3:
                            float jk4 =in.nextFloat();
                            pack.insert(select,jk4);
                            break;
                        default://跳出程序
                            break;
                    }
                    System.out.println("插入成功");
                    pack.select();
                    select = in.nextInt();
                    pack.setFuction(select);
                    fuction = pack.fuction;
                    break;
                default://跳出程序
                    fuction = 0;
                    break;
            }
        }
    }
}
