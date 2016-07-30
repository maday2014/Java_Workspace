
interface drawTest1{
	public void draw();
}

interface drawTest2{
	public void draw();
}

class ParallelogramgleUseInterface extends QuadrangleUseInterface
	implements drawTest1{
	public void draw(){
		System.out.println("平行四边形.draw()");
	}
	
	void doAnyThing(){
		
	}
}

class SquareUseInterface extends QuadrangleUseInterface implements
	drawTest1{
	public void draw(){
		System.out.println("正方形.draw()");
	}
	
	void doAnyThing(){
		
	}
}

class AnyThingUseInterface extends QuadrangleUseInterface implements
	drawTest1{
	public void draw(){
		System.out.println("Anything.draw()");
	}
	
	void doAnyThing(){
		
	}
}
public class QuadrangleUseInterface {
	public void doAnyTthing(){
		
	}
	
	public static void main(String[] args){
		drawTest1[] d={ new SquareUseInterface(), 
				new ParallelogramgleUseInterface(), new AnyThingUseInterface()};
		
		for(int i=0; i< d.length; i++){
			d[i].draw();
		}
	}
}
