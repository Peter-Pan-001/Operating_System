import java.util.*;
public class Algorithm {
	private int array1[] = new int[10];  //访问随机序列
	private int array2[] = new int[11];  //执行算法后的移动序列
	private int current;  //当前磁道
	private int direction;  //当前磁头移动方向，1表示由外到内，0表示由内到外
	private float eachtime;  //跨越一个磁道所用时间
	private float starttime;  //启动时间
	private float speed;  //磁盘转速
	private int num1;  //每磁道扇区数
	private int num2;  //每扇区字节数
	private int movement;  //引臂移动量
	private float searchtime;  //寻道时间
	private float delaytime;  //平均旋转延迟时间
	private float transmissiontime;  //传输时间
	private float totaltime;  //总访问处理时间
	
	public Algorithm(){}
	
	//以下为所有set函数
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
	//以下为所有get函数
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
	//以上为所有set和get方法
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
		int temparray1[] = new int[10];  //用于存储排序后的array1
		Integer temparray2[] = new Integer[10];  //用于将int类型数组转化为Integer类型数组
		List<Integer> list = new ArrayList<Integer>();  //将数组存入容器方便算法
		temparray1 = sort();
		for(int i=0;i<10;i++){
			temparray2[i] = new Integer(temparray1[i]);
		}
		list = Arrays.asList(temparray2);
		int count = 0;
		for(int i=0;i<10;i++){  //计算如果将array2[0]插入所应该在的位置
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
