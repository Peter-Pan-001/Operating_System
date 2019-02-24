import java.util.*;
public class Algorithm {
	private int array1[] = new int[10];  //�����������
	private int array2[] = new int[11];  //ִ���㷨����ƶ�����
	private int current;  //��ǰ�ŵ�
	private int direction;  //��ǰ��ͷ�ƶ�����1��ʾ���⵽�ڣ�0��ʾ���ڵ���
	private float eachtime;  //��Խһ���ŵ�����ʱ��
	private float starttime;  //����ʱ��
	private float speed;  //����ת��
	private int num1;  //ÿ�ŵ�������
	private int num2;  //ÿ�����ֽ���
	private int movement;  //�����ƶ���
	private float searchtime;  //Ѱ��ʱ��
	private float delaytime;  //ƽ����ת�ӳ�ʱ��
	private float transmissiontime;  //����ʱ��
	private float totaltime;  //�ܷ��ʴ���ʱ��
	
	public Algorithm(){}
	
	//����Ϊ����set����
	public void setRandomArray1(){
		Random rand = new Random();
		for(int i=0;i<10;i++){
			array1[i] = rand.nextInt(200);
		}
	}
	public void setRandomCurrent(){
		Random rand = new Random();
		current = rand.nextInt(200);
	}
	public void setRandomDirection(){
		Random rand = new Random();
		direction = rand.nextInt(2);
	}
	public void setEachtime(float eachtime){
		this.eachtime = eachtime;
	}
	public void setStarttime(float starttime){
		this.starttime = starttime;
	}
	public void setSpeed(float speed){
		this.speed = speed;
	}
	public void setNum1(int num1){
		this.num1 = num1;
	}
	public void setNum2(int num2){
		this.num2 = num2;
	}
	//����Ϊ����get����
	public int[] getRandomArray1(){
		return this.array1;
	}
	public int[] getRandomArray2(){
		return this.array2;
	}
	public int getRandomCurrent(){
		return this.current;
	}
	public int getRandomDirection(){
		return this.direction;
	}
	public float getEachtime(){
		return this.eachtime;
	}
	public float getStarttime(){
		return this.starttime;
	}
	public float getSpeed(){
		return this.speed;
	}
	public int getNum1(){
		return this.num1;
	}
	public int getNum2(){
		return this.num2;
	}
	public int getMovement(){
		return this.movement;
	}
	public float getSearchtime(){
		return this.searchtime;
	}
	public float getDelaytime(){
		return this.delaytime;
	}
	public float getTransmissiontime(){
		return this.transmissiontime;
	}
	public float getTotaltime(){
		return this.totaltime;
	}
	//����Ϊ����set��get����
	public int[] sort(){
		int temparray[] = new int[10];
		for(int i=0;i<10;i++){
			temparray[i] = array1[i];
		}
		int temp;
		for(int i=0;i<9;i++){
			for(int j=i; j<10;j++){
				if(temparray[i]<temparray[j]){
					temp = temparray[i];
					temparray[i] = temparray[j];
					temparray[j] = temp;
				}
			}
		}
		return temparray;
	}
	public int[] FCFS(){
		array2[0] = current;
		for(int i=0;i<10;i++){
			array2[i+1]=array1[i];
		}
		return this.array2;
	}
	
	public int[] SSTF(){
		array2[0] = current;
		int temparray1[] = new int[10];  //���ڴ洢������array1
		Integer temparray2[] = new Integer[10];  //���ڽ�int��������ת��ΪInteger��������
		List<Integer> list = new ArrayList<Integer>();  //������������������㷨
		temparray1 = sort();
		for(int i=0;i<10;i++){
			temparray2[i] = new Integer(temparray1[i]);
		}
		list = Arrays.asList(temparray2);
		int count = 0;
		for(int i=0;i<10;i++){  //���������array2[0]������Ӧ���ڵ�λ��
			if(temparray1[i] > current) break;
			count++;
		}
		list.add(count,new Integer(array2[0]));
		Integer initial = new Integer(array2[0]);
		Integer last,next;
		while(list.size()>0){
			last = list.get(list.indexOf(initial)-1);
			next = list.get(list.indexOf(initial)+1);
			
		}
	}
}
