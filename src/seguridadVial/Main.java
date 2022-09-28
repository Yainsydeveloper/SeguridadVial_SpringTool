package seguridadVial;

public class Main {

	public static void main(String[] args) {
	
		
		//Declaración de array
		Auto [] autos;
		Moto [] motos;
		Conductor[] conductores;
		
		
		//autos
		
		Auto auto1= new Auto("ABC-123", "CORSA", "Colorado",4, 120,true);
		Auto auto2= new Auto("DEF-123", "PALIO", "Azul",5, 80,false);
		Auto auto3= new Auto("GHI-123", "VMW", "Negro",2, 180,true);
		//Asignacion/Creacion y el 3 es cantidad de elementos
		autos =new Auto[3];
		autos[0]=auto1;
		autos[1]=auto2;
		autos[2]=auto3;
		System.out.println("La cantidad de autos en la pista es de :  "+ autos.length);
		
		//motos
		
		Moto moto1= new Moto("A-123", "ONDA", "Negro",1, 200,2);
		Moto moto2= new Moto("B-123", "YAMAHA", "Azul",2, 100,1);
		Moto moto3= new Moto("C-123", "GILLERA", "Roja",2,120,2);
		motos = new Moto[3];
		motos[0] = moto1;
		motos[1] = moto2;
		motos[2] = moto3;
		
		
		//Conductores y sus vehiculos
		
			Conductor conductor1= new Conductor(96001676, true, auto1);
			Conductor conductor2= new Conductor(96001676, true, moto1);
			Conductor conductor3 = new Conductor(555555, true, moto2);
			Conductor conductor4 = new Conductor(777777, false, auto2);
			Conductor conductor5 = new Conductor(555555, true, moto3);
			Conductor conductor6 = new Conductor(66666, false, auto3);
			

			conductores = new Conductor[6];

			conductores[0] = conductor1;
			conductores[1] = conductor2;
			conductores[2] = conductor3;
			conductores[3] = conductor4;
			conductores[4] = conductor5;
			conductores[5] = conductor6;
			
			System.out.println(" estos son los conducores : " + conductores.length);
			
			
			
			
			//RECORRER LOS ARRAY EN BUSCA DE VALORES Y VALIDACIONES
			for ( Auto auto : autos) {
			int velocidadAuto = auto.getVelocidad();
			boolean ruedaAux = auto.isRuedaAuxilio();


					if ( velocidadAuto <= 140 && ruedaAux  == true)  {
					System.out.println("El auto " + auto.getModelo()+" es seguro");
					String modeloAutoSeguro= auto.getModelo();
		
						for ( Moto Moto : motos) {
						int velocidadMoto = Moto.getVelocidad();
						int espejoRetrovisor = Moto.getNroEspejos();
			
			
							if ( velocidadMoto <= 160 && espejoRetrovisor >= 2)  {
							System.out.println("La Moto " + Moto.getModelo()+" es segura ");
							String modeloMotoSeguro= Moto.getModelo();
				
									for ( Conductor conductor : conductores) {
						
									      boolean Registro      =   conductor.isLicenciaConducir();
									     // String conductorSeguro  =   conductor.;
									     
									      if ( Registro == true)  {
									      //boolean conductor = true;
									System.out.println("el conductor de DNI " + conductor.getDni()+" es seguro y conduce el Auto "+ modeloAutoSeguro);
									}
				        //le falta arreglar este FOR ANIdADO       
			                        }
			                }

			            }
			        }
			     }


			




			
			
			
			
			
			
			
			
			
			
			
			
			
			/*for ( Auto auto : autos) {
				int velocidadAuto = auto.getVelocidad();
				boolean ruedaAux = auto.isRuedaAuxilio();


				if ( velocidadAuto >= 140 || ruedaAux  == false)  {
				System.out.println("El auto " + auto.getModelo()+"es insegurode patente: "+auto.getPatente());
				boolean registro = false;	
				}else {
				System.out.println("El auto " + auto.getModelo()+"es SEGURO de patente: "+auto.getPatente());
				boolean registro = true;				 
				
				if (registro == true)  {
				System.out.println("El auto " + auto.getModelo()+"es insegurode patente: "+auto.getPatente());

				}else {
				System.out.println("El auto " + auto.getModelo()+"es SEGURO de patente: "+auto.getPatente());
				         
				 }
				}
				}
            */
			
			
			
			
			
			/*try {
				for (Conductor conductor : conductores ){
					boolean licencia=conductor.isLicenciaConducir();
					int velocidadAuto = conductor.getAuto().getVelocidad();
					boolean ruedaAuxilio = conductor.getAuto().isRuedaAuxilio();
					
					System.out.println(velocidadAuto);
					
					if (licencia == false ||velocidadAuto>= 140 || ruedaAuxilio == false)  {
					System.out.println("el auto inseguro es el:" + conductor.getAuto().getModelo());

					}else {System.out.println("el auto seguro es el  :" + conductor.getAuto().getModelo());}

					}}catch (NullPointerException e) {

						System.out.println("El error obtenido es:" + e);

					}*/
				
			
			/*for (Conductor conductor : conductores ){
				boolean licencia=conductor.isLicenciaConducir();
				if (conductor.isLicenciaConducir() == false || conductor.getAuto().getVelocidad()>= 140 || conductor.getAuto().isRuedaAuxilio() == false)  {
				System.out.println("el auto es inseguro :" + conductor.getAuto());

				}else {System.out.println("el auto es seguro :" + conductor.getAuto());}

				}*/

				/*for (Conductor conductor : conductores ){
				if (conductor.isLicenciaConducir() == false || conductor.getMoto().getVelocidad( ) >= 160  || conductor.getMoto().getNroEspejos() < 2)  {
				System.out.println("la  moto  es inseguro :" + conductor.getMoto());
				
				}else {System.out.println("la moto es segura :" + conductor.getMoto());}

				}*/
			
			
			
			
			
}

}
