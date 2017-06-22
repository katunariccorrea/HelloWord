import javax.sound.midi.Soundbank;


public class helloWord {

	public helloWord() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World!!!");
		int num = 10;
		for (int i = 0; i< num; i++){
			System.out.print(i+1);
				if ((i+1) == (num/2)){
					System.out.print(" - Metade!!!");
				}
				System.out.print("\n");
		}
		

	}

}
