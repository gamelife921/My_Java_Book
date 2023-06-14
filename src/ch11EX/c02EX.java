package ch11EX;
import java.util.Scanner;
public class c02EX {
public static void main(String[] args) {
	//5 명[의 학생에 국영수점수를 입력받아 2차원 배열 저장
	//각 학생의 국영수 점수의 합/평균 구하기
	//각 과목당 합/평균 구해보세요
	
	int [][] score = new int [5][3];
	Scanner sc = new Scanner(System.in);
	System.out.println("국여수 점수 입력 >");
	for(int i= 0 ; i<score.length;i++) {//score ==5
		for(int j=0;j<score.length;j++) {//score[i] == 각 행의 길이
			score[i][j]=sc.nextInt();
		}
	}
	//각 학생별 (행 별) 국영수 종합/평균
	int stdsum[] =new int[5];
	double stdavg[] = new double[5];
	for(int i= 0 ; i<score.length;i++) {//score ==5
		for(int j=0;j<score.length;j++) {//score[i] == 각 행의 길이
			stdsum[i]+=score[i][j];
		}
		stdavg[i]=stdsum[i]/3;
	}
	
	
	for(int i=0;i<5; i++) {
		System.out.printf("%d 번째 학생점수: %d %f\n",stdsum[i],stdavg[i]);
	}
	//각 과목(열 별) 국영수 총합/평균
	int subsum[] = new int[3];
	double subavg[]=new double[3];
	for(int j= 0 ; j<3;j++) {//score ==5
		
		for(int i=0;i<5;i++) {//score[i] == 각 행의 길이
			subsum[j]+=score[i][j];
			
		}
		subavg[j]=subsum[j]/score.length;
	}
	System.out.printf("국영수 총합 평균 : %d %d %d %f\n",subsum[0],subsum[1],subsum[2]);
}
}
