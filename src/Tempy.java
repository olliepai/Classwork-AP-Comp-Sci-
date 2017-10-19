import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class Tempy {
	public static void main(String[] args) {
		System.out.println(myAbs(-8));
	}
	
	public static int myAbs(int x) {
		int answer;
		
		if (x >= 0) {
			answer = x;
		}
		else {
			answer = -x;
		}
		
		return answer;
	}
}
	

