package multiDumansinialArrayDemo;



public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String[2][2];
		
		sehirler [0][0] ="istanbul";
		sehirler [0][1]	="bursa";
		sehirler [1][0]="ankara";
		sehirler[1][1]="konya";
		for (int i = 0; i<=1; i++) {		
			for(int j = 0; j<=1; j++) {
				System.out.println(sehirler[i][j]);
				
			}
		}System.out.println("good night baby");
		
	}
}
