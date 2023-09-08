package chapter.eleven.six.one;

public class IceCream {
    //创建对象数组,有10 个String 对象,是冰激凌的品种
    static final String[] breed = {" 巧克力", "香草", "草莓", "朗姆酒", "咖啡",
            "果仁", "香芋", "绿茶", "榛子", "葡萄干"};

    //产生随机排列的数组,数组长度由形参n 确定
    static String[] breedSet(int n) {
        n = Math.abs(n) % (breed.length + 1);   //n 是正整数,并且数组不越界
        String[] results = new String[n];  //创建对象数组,存放随机抽出的冰激凌的品种
        int[] picks = new int[n];     //创建数组,存放已提取的下标
        for (int i = 0; i < picks.length; i++) {
            picks[i] = -i;
        }
        //随机抽出冰激凌的品种排列的循环,如提取了重复元素,返回重选随机数,如不重复就
        //写入results[]数组
        for (int i = 0; i < picks.length; i++) { //为results[]数组每个元素赋值的循环
            retry:
            while (true) {
                int t = (int) (Math.random() * breed.length); //确定随机提取元素的下标
                for (int j = 0; j < i; j++) {
                    if (picks[j] == t) {
                        continue retry;
                    }
                }
                //如下标重复,重设随机数,picks[]用于记录已提取元素下标
                picks[i] = t;
                results[i] = breed[t]; //将提取元素存入results[]中
                break;
            }
        }
        return results; //返回对象数组
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) { //输出3 种排列
            System.out.print("breedSet()= ");
            String[] be = breedSet(breed.length);
            //输出对象数组元素的循环
            for (String s : be) {
                System.out.print("\t" + s); //\t 是制表符
            }
            System.out.println();
        }
    }
}
