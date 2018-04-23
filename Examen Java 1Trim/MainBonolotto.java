public class MainBonolotto{
	public static void main(String[] args) {
		System.out.println("Bonoloto: ");

		Bombo bombo = new Bombo(50);
		for(int i=1;i<6;i++)
			System.out.print(bombo.sacaBola() + " / ");
	}
}
