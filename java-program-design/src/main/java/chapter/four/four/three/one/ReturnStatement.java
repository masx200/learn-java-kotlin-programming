package chapter.four.four.three.one;

//例4.10 对于学生的成绩,根据分数的不同给出不同的评价:90 分以上为优秀,80 ~ 89 之间是优良,70 ~ 79 之间是中等,60 ~ 69 之间是及格,60 分以下是不及格。
//        import java.math.*;
public class ReturnStatement {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 100);
        System.out.println(score);
        ReturnStatement rs = new ReturnStatement();
        System.out.println(rs.evaluate(score));
    }

    String evaluate(int score) {
        String s;
        if (score >= 90) s = "成绩优异";
        else if (score >= 80) s = "成绩优良";
        else if (score >= 70) s = "成绩中等";
        else if (score >= 60) s = "成绩及格";
        else s = "成绩不及格";
        return s;
    }
}
