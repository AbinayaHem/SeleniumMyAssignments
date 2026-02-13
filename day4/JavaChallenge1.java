package week2.day4;

public class JavaChallenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//intializing the variable
		String sentence1 = "Hello world";
		
		//To split the sentence using space
		String[] split=sentence1.split(" ");
		String lastWord = split[split.length-1];
		System.out.println("The last word in first sentence is " + lastWord);
		System.out.println("The length of the last word in First sentence is " + lastWord.length());
		
		String sentence2 = "fly me to the moon";
		String[] split1 = sentence2.split(" ");
		String lastWord1 = split1[split1.length-1];
		System.out.println("The last word in second sentence is " +lastWord1);
		System.out.println("The length of the last word in Second sentence is " +lastWord1.length());
		
		//System.out.println(split1.length);
		
		String sentence3 ="luffy is still joyboy";
		String[] split2 = sentence3.split(" ");
		String lastWord2 = split2[split2.length-1];
		System.out.println("The last word in third sentence is "+lastWord2);
		System.out.println("The length of the last word in Third sentence is "+lastWord2.length());
	}

}
