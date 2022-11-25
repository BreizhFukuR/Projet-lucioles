public static char symboliseLuciole (double niveauEnergie) {
		if (niveauEnergie >= SEUIL) {
			return '*';
		
		}
		else {
			return '.';
		}
	}

	
	public static void afficheLuciole (double niveauEnergie, boolean verbeux) {
		System.out.print(symboliseLuciole(niveauEnergie));
		if (verbeux == true) {
			System.out.print(" " + niveauEnergie);
		}
		System.out.println();
	}
	
	
	
	
	
	public static double incrementeLuciole (double niveauEnergie, double deltaEnergie) {
		return niveauEnergie + deltaEnergie;
	}
	
	
	
	
	
	
	
	
	
	public static void simuleLucioleNbPas (int nbPas) {
		double lucioleEnergie = RandomGen.rGen.nextDouble(0, 100);
		double lucioleDeltaEnergie = RandomGen.rGen.nextDouble(0, 1);
		for (int i = 0; i < nbPas; i++) {
			lucioleEnergie = incrementeLuciole(lucioleEnergie, lucioleDeltaEnergie);
			afficheLuciole(lucioleEnergie, true);
			if (lucioleEnergie >= SEUIL) {
				lucioleEnergie = 0;
			}
		}
	}
	
	
	
	
	
	
	
	
	public static void simuleLucioleNbFlashs (int nbPas) {
		double lucioleEnergie = RandomGen.rGen.nextDouble(0, 100);
		double lucioleDeltaEnergie = RandomGen.rGen.nextDouble(0, 1);
		int nbFlashs = 0;
		for (int i = 0; i < nbPas; i++) {
			lucioleEnergie = incrementeLuciole(lucioleEnergie, lucioleDeltaEnergie);
			if (nbFlashs >= 3) {
				afficheLuciole(lucioleEnergie, false);
			}
			else {
				afficheLuciole(lucioleEnergie, true);
			}
			if (lucioleEnergie >= SEUIL) {
				lucioleEnergie = 0;
				nbFlashs += 1;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		double lucioleEnergie = RandomGen.rGen.nextDouble(0, 100);
		System.out.println(lucioleEnergie);
		System.out.println(symboliseLuciole(lucioleEnergie));
		afficheLuciole(lucioleEnergie, true);
		lucioleEnergie += lucioleEnergie + RandomGen.rGen.nextDouble();
		afficheLuciole(lucioleEnergie, true);
		lucioleEnergie += lucioleEnergie + RandomGen.rGen.nextDouble();
		afficheLuciole(lucioleEnergie, true);
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		double lucioleDeltaEnergie = RandomGen.rGen.nextDouble(0, 1);
		
		afficheLuciole(incrementeLuciole(lucioleEnergie, lucioleDeltaEnergie), true);
		lucioleEnergie =incrementeLuciole(lucioleEnergie, lucioleDeltaEnergie);
		afficheLuciole(incrementeLuciole(lucioleEnergie, lucioleDeltaEnergie), true);
		lucioleEnergie =incrementeLuciole(lucioleEnergie, lucioleDeltaEnergie);
		afficheLuciole(incrementeLuciole(lucioleEnergie, lucioleDeltaEnergie), true);
		lucioleEnergie =incrementeLuciole(lucioleEnergie, lucioleDeltaEnergie);
		afficheLuciole(incrementeLuciole(lucioleEnergie, lucioleDeltaEnergie), true);
		lucioleEnergie =incrementeLuciole(lucioleEnergie, lucioleDeltaEnergie);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		simuleLucioleNbPas(300);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		simuleLucioleNbFlashs(700);
		
	}
