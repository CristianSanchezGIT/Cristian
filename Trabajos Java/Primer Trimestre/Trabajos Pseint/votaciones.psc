Proceso votacion
	Repetir
		Borrar Pantalla
		v=0	
		vv=0
		b=0
		n=0
		s=0
		
		Escribir "";
		Escribir "";
		Escribir "   ___________________________________________________________________________________________________________";
		Escribir "   |                                                                                                         |";
		Escribir "   | WW        WW   WWWWWWWW  WWWWWWWWWW  WWWWWWWW  WWWWWWW  WWWWWWWW  WWWWWWWW  WWW     WW  WWWWWW  WWWWWWW |";
		Escribir "   |  WW      WW    WW    WW      WW      WW    WW  WW          WW     WW    WW  WW WW   WW  WW      WW      |";
		Escribir "   |   WW    WW     WW    WW      WW      WWWWWWWW  WW          WW     WW    WW  WW  WW  WW  WWWWWW  WWWWWWW |";
		Escribir "   |    WW  WW      WW    WW      WW      WW    WW  WW          WW     WW    WW  WW   WW WW  WW           WW |";
		Escribir "   |      WW        WWWWWWWW      WW      WW    WW  WWWWWWW  WWWWWWWW  WWWWWWWW  WW     WWW  WWWWWW  WWWWWWW |";
		Escribir "   |                                                                                                         |";
		
	   Escribir "   |.................................. ----------------------------------- ..................................|";
	   Escribir "   |..................................  Escriba El Nombre Del Candidato 1  ..................................|";
	   Escribir "   |.................................. ----------------------------------- ..................................|";
		Leer primero;
	   Escribir "   |.................................. ----------------------------------- ..................................|";
	   Escribir "   |..................................  Escriba El Nombre Del Candidato 2  ..................................|";
	   Escribir "   |.................................. ----------------------------------- ..................................|";
	    Leer segund;
       
	    Si primero=segund o primero= '' o segund='' o primero='blanco' o segund='blanco' Entonces
			
		    Si primero=segund Entonces
			    Escribir "   |................................. ------------------------------------- .................................|";
			    Escribir "   |.................................  Los Candidatos Deben Ser Diferentes  .................................|";
				Escribir "   |................................. ------------------------------------- .................................|";
				Escribir "   |_________________________________________________________________________________________________________|";				
		    Sino
				Si primero='blanco' o segund='blanco' Entonces
					Escribir "   |.............................. -------------------------------------------- .............................|";
					Escribir "   |.............................  Los Canditatos No Pueden Ser Igual a blanco  .............................|";
					Escribir "   |.............................. -------------------------------------------- .............................|";
					Escribir "   |_________________________________________________________________________________________________________|";
				Sino
					
			     Escribir "   |................................ ---------------------------------------- ...............................|";
			     Escribir "   |................................  Los Canditatos No Pueden Ser Igual a 0  ...............................|";
			     Escribir "   |................................ ---------------------------------------- ...............................|";
			     Escribir "   |_________________________________________________________________________________________________________|";
				 
		  FinSi
			Finsi
	    Sino
			co='blanco';
		    Borrar Pantalla
			Escribir "";
			Escribir "";
			Escribir "   ___________________________________________________________________________________________________________";
			Escribir "   |                                                                                                         |";
			Escribir "   | WW        WW   WWWWWWWW  WWWWWWWWWW  WWWWWWWW  WWWWWWW  WWWWWWWW  WWWWWWWW  WWW     WW  WWWWWW  WWWWWWW |";
			Escribir "   |  WW      WW    WW    WW      WW      WW    WW  WW          WW     WW    WW  WW WW   WW  WW      WW      |";
			Escribir "   |   WW    WW     WW    WW      WW      WWWWWWWW  WW          WW     WW    WW  WW  WW  WW  WWWWWW  WWWWWWW |";
			Escribir "   |    WW  WW      WW    WW      WW      WW    WW  WW          WW     WW    WW  WW   WW WW  WW           WW |";
			Escribir "   |      WW        WWWWWWWW      WW      WW    WW  WWWWWWW  WWWWWWWW  WWWWWWWW  WW     WWW  WWWWWW  WWWWWWW |";
			Escribir "   |                                                                                                         |";
			Escribir "   |   ___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|____|___|___|___|___|___|___|___|__   |";
		    Escribir "   |   _|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|____|___|___|___|___|___|___|___|___|   |"; 
		    Escribir "   |   ___|___|___|___|___|___|___|___|__                                __|___|___|___|___|___|___|___|__   |";
		    Escribir "   |   _|___|___|___|___|___|___|___|___|  cuantas Votos Desea Realizar  |___|___|___|___|___|___|___|___|   |"; 
		    Escribir "   |   ___|___|___|___|___|___|___|___|__                                __|___|___|___|___|___|___|___|__   |";
		    Escribir "   |   _|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|____|___|___|___|___|___|___|___|___|   |"; 
		    Escribir "   |   ___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|____|___|___|___|___|___|___|___|__   |";
			Escribir "   |_________________________________________________________________________________________________________|";
			Leer canvotos;
		  
	      Para a<-1 Hasta canvotos Con Paso 1 Hacer
			  Borrar Pantalla
			  Escribir "";
			  Escribir "";
			  Escribir "   ___________________________________________________________________________________________________________";
			  Escribir "   |                                                                                                         |";
			  Escribir "   | WW        WW   WWWWWWWW  WWWWWWWWWW  WWWWWWWW  WWWWWWW  WWWWWWWW  WWWWWWWW  WWW     WW  WWWWWW  WWWWWWW |";
			  Escribir "   |  WW      WW    WW    WW      WW      WW    WW  WW          WW     WW    WW  WW WW   WW  WW      WW      |";
			  Escribir "   |   WW    WW     WW    WW      WW      WWWWWWWW  WW          WW     WW    WW  WW  WW  WW  WWWWWW  WWWWWWW |";
			  Escribir "   |    WW  WW      WW    WW      WW      WW    WW  WW          WW     WW    WW  WW   WW WW  WW           WW |";
			  Escribir "   |      WW        WWWWWWWW      WW      WW    WW  WWWWWWW  WWWWWWWW  WWWWWWWW  WW     WWW  WWWWWW  WWWWWWW |";
			  Escribir "   |                                                                                                         |";
			   Escribir "   |  .....................................................................................................  |";
		       Escribir "   |  .....................................................................................................  |";
		       Escribir "   |  ........................................  �Su Voto Es Por?  .........................................  |";
		       Escribir "   |  .....................................................................................................  |";
		       Escribir "   |  ......................  (Si Desea Votar En Blanco Por Favor Escriba blanco)  ........................  |";
			   Escribir "   |  .....................................................................................................  |";
			   Escribir "   |  .....................................................................  Usted Lleva " s " De " canvotos " votos  ....  |";
			   
		       s=s+1
			   Leer voto; 
			   si voto=primero o voto=segund o voto=co Entonces
				   Escribir "   |                                                                                                         |";
				   Escribir "   |  .....................................................................................................  |";
				   Escribir "   |  .....................................................................................................  |";
				   Escribir "   |  .....................................  Su voto Se Ha Guardado  ......................................  |";
				   Escribir "   |  .....................................................................................................  |";
				   Escribir "   |  .....................................................................................................  |";
				   Escribir "   |_________________________________________________________________________________________________________|";
	
					Esperar 2 segundos
					
				   Si voto=primero Entonces
					   v=v+1
					   
				   Sino
					   Si voto=segund Entonces
						   vv=vv+1
						   
					   Sino
						  b=b+1
					  FinSi
				   FinSi
		       Sino
				   Escribir "   |                                                                                                         |";
				   Escribir "   |  .....................................................................................................  |";
				   Escribir "   |  .....................................................................................................  |";
				   Escribir "   |  ............  Este Voto Es Nulo Ya Que No Esta Votando Por Ningun Candidato Registrado  .............  |";
				   Escribir "   |  .....................................................................................................  |";
				   Escribir "   |  .....................................................................................................  |";
				   Escribir "   |_________________________________________________________________________________________________________|";   
				 n=n+1
				 
			       Esperar 2 segundos
	           FinSi
		   FinPara
		   
	       Si vv=v Entonces
			   Borrar Pantalla
			   Escribir "";
			   Escribir "";
			   
			   Escribir " _____________________________________________________________________________________________________________";
		       Escribir " |         MMMMMM  MMMMMMM  MMMMMMMM  MM    MM  MM     MMMMMMMM  MMMMMMM  MMMM    MMMMMMMM  MMMMMMMM         |";    
			   Escribir " |         MM  MM  MM       MM        MM    MM  MM        MM     MM   MM  MM  M   MM    MM  MM               |";
			   Escribir " |         MMMMMM  MMMMMMM  MMMMMMMM  MM    MM  MM        MM     MM   MM  MM   M  MM    MM  MMMMMMMM         |";
			   Escribir " |         MMMM    MM             MM  MM    MM  MM        MM     MMMMMMM  MM   M  MM    MM        MM         |";
			   Escribir " |         MM MM   MM             MM  MM    MM  MM        MM     MM   MM  MM  M   MM    MM        MM         |";
			   Escribir " |         MM  MM  MMMMMMM  MMMMMMMM  MMMMMMMM  MMMMMMM   MM     MM   MM  MMMM    MMMMMMMM  MMMMMMMM         |";
			   Escribir " |...........................................................................................................|";
	  	       Escribir " |......................................  ___         __   __  ___  ___ .....................................|";
			   Escribir " |...................................... |___ |\__/| |__| |__|  |  |___ .....................................|";
			   Escribir " |...................................... |___ |    | |    |  |  |  |___ .....................................|";
			   Escribir " |...........................................................................................................|";
			   Escribir " |                                                                                                           |";
			   Escribir " |...........................................................................................................|";
		       Escribir "                        //////////   Los Votos Obtenidos Por " segund " son " vv " votos   //////////      ";
			   Escribir " |...........................................................................................................|";
		       Escribir " |...........................................................................................................|";
			   Escribir "                        //////////   Los Votos Obtenidos Por " primero " son " v " votos   //////////      ";
			   Escribir " |...........................................................................................................|";
			   Escribir " |...........................................................................................................|";
			   Escribir "                           //////////   Los Votos En Blanco Fueron " b " votos   ////////// ";
		       Escribir " |...........................................................................................................|";
			   Escribir " |...........................................................................................................|";
			   Escribir "                             //////////   Los Votos Nulos Fueron " n " votos   ////////// ";
			   Escribir " |...........................................................................................................|";
			   Escribir " |___________________________________________________________________________________________________________|";
	       Sino
			   
	           Si vv>v Entonces
				   Escribir "";
				   Escribir "";
				   Escribir " _____________________________________________________________________________________________________________";
				   Escribir " |         MMMMMM  MMMMMMM  MMMMMMMM  MM    MM  MM     MMMMMMMM  MMMMMMM  MMMM    MMMMMMMM  MMMMMMMM         |";    
				   Escribir " |         MM  MM  MM       MM        MM    MM  MM        MM     MM   MM  MM  M   MM    MM  MM               |";
				   Escribir " |         MMMMMM  MMMMMMM  MMMMMMMM  MM    MM  MM        MM     MM   MM  MM   M  MM    MM  MMMMMMMM         |";
				   Escribir " |         MMMM    MM             MM  MM    MM  MM        MM     MMMMMMM  MM   M  MM    MM        MM         |";
				   Escribir " |         MM MM   MM             MM  MM    MM  MM        MM     MM   MM  MM  M   MM    MM        MM ........|";
				   Escribir " |         MM  MM  MMMMMMM  MMMMMMMM  MMMMMMMM  MMMMMMM   MM     MM   MM  MMMM    MMMMMMMM  MMMMMMMM ........|";
				   Escribir " |...........................................................................................................|";
				   Escribir " |........................  ____       __   __        __   _   __   __     __  ___  .........................|";
				   Escribir " |........................ |___ |     |__  |__| |\ | |__| | \ |  | |__|   |__ |___  .........................|";
				   Escribir " |........................ |___ |__   |__| |  | | \| |  | |_/ |__| |\     |__  ___| .........................|";
				   Escribir "                                            ========  "   segund "  ========";
				   Escribir " |                                                                                                           |";
				   Escribir " |...........................................................................................................|";
				   Escribir "                       //////////   Los Votos Obtenidos Por " segund " son " vv " votos   //////////      ";
				   Escribir " |...........................................................................................................|";
				   Escribir " |...........................................................................................................|";
				   Escribir "                       //////////   Los Votos Obtenidos Por " primero " son " v " votos   //////////      ";
				   Escribir " |...........................................................................................................|";
				   Escribir " |...........................................................................................................|";
				   Escribir "                         //////////   Los Votos En Blanco Fueron " b " votos   ////////// ";
				   Escribir " |...........................................................................................................|";
				   Escribir " |...........................................................................................................|";
				   Escribir "                           //////////   Los Votos Nulos Fueron " n " votos   ////////// ";
				   Escribir " |...........................................................................................................|";
				   Escribir " |___________________________________________________________________________________________________________|";
			  Sino
				  
		          Escribir "";
				  Escribir "";
				  Escribir " _____________________________________________________________________________________________________________";
				  Escribir " |         MMMMMM  MMMMMMM  MMMMMMMM  MM    MM  MM     MMMMMMMM  MMMMMMM  MMMM    MMMMMMMM  MMMMMMMM         |";    
				  Escribir " |         MM  MM  MM       MM        MM    MM  MM        MM     MM   MM  MM  M   MM    MM  MM               |";
				  Escribir " |         MMMMMM  MMMMMMM  MMMMMMMM  MM    MM  MM        MM     MM   MM  MM   M  MM    MM  MMMMMMMM         |";
				  Escribir " |         MMMM    MM             MM  MM    MM  MM        MM     MMMMMMM  MM   M  MM    MM        MM         |";
				  Escribir " |         MM MM   MM             MM  MM    MM  MM        MM     MM   MM  MM  M   MM    MM        MM ........|";
				  Escribir " |         MM  MM  MMMMMMM  MMMMMMMM  MMMMMMMM  MMMMMMM   MM     MM   MM  MMMM    MMMMMMMM  MMMMMMMM ........|";
				  Escribir " |...........................................................................................................|";
				  Escribir " |........................  ____       __   __        __   _   __   __     __  ___  .........................|";
				  Escribir " |........................ |___ |     |__  |__| |\ | |__| | \ |  | |__|   |__ |___  .........................|";
				  Escribir " |........................ |___ |__   |__| |  | | \| |  | |_/ |__| |\     |__  ___| .........................|";
				  Escribir "                                            ========  "   primero "  ========";
				  Escribir " |";
				  Escribir " |...........................................................................................................|";
				  Escribir "                       //////////   Los Votos Obtenidos Por " primero " son " v " votos   //////////      ";
				  Escribir " |...........................................................................................................|";
				  Escribir " |...........................................................................................................|";
				  Escribir "                       //////////   Los Votos Obtenidos Por " segund " son " vv " votos   //////////      ";
				  Escribir " |...........................................................................................................|";
				  Escribir " |...........................................................................................................|";
				  Escribir "                         //////////   Los Votos En Blanco Fueron " b " votos   ////////// ";
				  Escribir " |...........................................................................................................|";
				  Escribir " |...........................................................................................................|";
				  Escribir "                           //////////   Los Votos Nulos Fueron " n " votos   ////////// ";
				  Escribir " |...........................................................................................................|";
				  Escribir " |___________________________________________________________________________________________________________|";
				  Escribir "";
			  FinSi
			  
		  Finsi
		  
	  FinSi
	  Escribir "";
	  Escribir "              ___________________________________________________________________________________";
	  Escribir "             |                                                                                   |";
	  Escribir "             |   Desea Volver A Ingresar Los Candidatos si/no (por favor escriba en minuscula)   |";
	  Escribir "             |___________________________________________________________________________________|";
	  Leer p;
    Hasta Que p<>'si'
	
FinProceso