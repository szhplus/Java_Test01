/**
 * 掷骰子游戏
 *产生随机数方法练习
 */

public class Test {
    public static void main(String[] args) {
        int i=(int)(6*Math.random()+1);//产生1-6的随机数
        System.out.println("第一枚骰子的点数："+i);//打印第一枚骰子的点数
        int j=(int)(6*Math.random()+1);
        System.out.println("第二枚骰子的点数："+j);
        int k=(int)(6*Math.random()+1);
        System.out.println("第三枚骰子的点数："+k);
        int a=i+j+k;
        if(a>15)
        {
            System.out.println("您的点数是："+a);
            System.out.println("运气不错，再来一把！");

        }
        else if(a>12){
            System.out.println("您的点数是："+a);
            System.out.println("运气一般，再来两把！！");
        }
        else if(a>6){
            System.out.println("您的点数是："+a);
            System.out.println("运气不行啊！");
        }
        else{
            System.out.println("您的点数是："+a);
            System.out.println("运气太差了，回去吧！");
        }
    }
}
