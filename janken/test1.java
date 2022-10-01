package janken;

public class test1 {
  public static void main(String[]ages){
    int inputValue = 1;

    double randNum = Math.random();
    int userNum = 1: //1:グー 2:チョキ 3:パー

    //機械の手を乱数を使って判定していく
    int machineNum = 0;

    if(randNum<= 0.33){
      machineNum = 1;
    }else if(randNum <= 0.67){
      machineNum =2;
    }else{
      machineNum = 3;
    }

  }
  //勝敗の判定
  if(userNum == machineNum ){
    System.out.println("あいこ");
  }else if((userNum==1 && machineNum == 2)
         ||(userNum==2 && machineNum == 3)
         ||(userNum==3 && machineNum == 1)
        ){
          System.out.println("勝ち");
  }else{
    System.out.println("負け");
  }

}
