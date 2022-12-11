public static void afficheTableau (double[] tab) {
		for (int i = 0; i< tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}
	
	
	
	public static double[] creerLuciole() {
		double[] luciole = {RandomGen.rGen.nextDouble(0, 100), RandomGen.rGen.nextDouble(0, 1)};
		return luciole;
	}
	
	
	public static double[] incrementeLuciole (double[] luciole) {
		luciole[ENERGIE] += luciole[DELTA];
		return luciole;
	}
	
	
	
	
	
	public static void main(String[] args) {
		double[] luciole1 = creerLuciole();
		afficheTableau(luciole1);
		incrementeLuciole(luciole1);
		afficheTableau(luciole1);
		System.out.print(23.594097024833914 + 0.24664027346932238 );
	}
