import java.util.ArrayList;
import java.util.List;



/* Class to store information of a question*/
public class QuestionInfo implements Comparable<QuestionInfo>{
	String id;
	String title;
	String type;
	String[] options;
	int numberOfOptions;
	boolean number;
	boolean text;
	int[]  freqChart;	//frequency chart for single choice type question
	
	
	public QuestionInfo() {
		
		this.id = "-1";
		//this.title = null;
		this.type = null;
		this.options = null;
		this.numberOfOptions=0;
		this.number = false;
		this.text = false;
	}

	//over riding compateTo
	public int compareTo(QuestionInfo q){
		//comparing questions lexiograficaly 
		int value=this.title.compareTo(q.title);
		return value;
	}

	public void setQuestionInfo(String id, String title, String type, String[] options,
			int num_options,boolean number, boolean text) {
		
		this.id = id;
		this.title = title;
		this.type = type;
		this.options = options;
		this.numberOfOptions=num_options;
		this.number = number;
		this.text = text;
	}
	
	
	//function to show content
		//Note: For debugging purpose
	void show(){
		System.out.println("\nQid="+id+  "\ntitle="+title+    "\ntype="+type+
				"\nnumberofoptions="+numberOfOptions+   "\nnumeber?="+number+   "\ntext?="+text);
		
		System.out.println("\nOptions are");
		if(options != null){
			for(String s : options){
				System.out.println(s);
			}
		}	
	}

	//function to initialize frequency chart
	public void initializeFC(int n){
		freqChart=new int[n+1];
		//initializing it with zero
		for(int i=0; i<n ; i++){
			freqChart[i]=0;
		}
	}
	
	//function to set survey data in frequency chart
	public void recordResponseData(int response){
		freqChart[response]++;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString(){
		return this.title;
	}
	
	
}
