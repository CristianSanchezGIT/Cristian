#include <iostream> 
#include <windows.h>  

using namespace std; 
void clrscr(){ 
	system("cls"); 
} 
int main(int argc, char *argv[]) 
{ 
	int h,h2,m,m2,s,s2,seguir,ho,mi,a,b; 
	do {
		system ("cls");
		cout<<""<<endl;
		cout<<""<<endl;
		cout<<"        ////////////////////////////////////////////////////////////////"<<endl;
		cout<<"        ///                                                          ///"<<endl;
		cout<<"        ///         En Cuantas Horas Desea Que Inicie El Reloj       ///"<<endl;
		cout<<"        ///                                                          ///"<<endl;
		cout<<"        ///                 100 Para Salir Del Reloj                 ///"<<endl;
		cout<<"        ///                                                          ///"<<endl;
		cout<<"        ///                                                          ///"<<endl;
		cout<<"        ////////////////////////////////////////////////////////////////"<<endl;
		cout<<"        ///                                                          ///"<<endl;
		cout<<"        ///     Recuerde Que Solo Puede Ingresar Numeros Enteros     ///"<<endl;
		cout<<"        ///                                                          ///"<<endl;
		cout<<"        ////////////////////////////////////////////////////////////////"<<endl;
		cin>> ho;
		
		if (ho <= 9){
			a =0;
			b =ho;
		}else{
			
		 
		   if (ho >= 10){
			    if (ho <= 99){
				    a = ho / 10;
				    b = (ho % 10) / 1;
			    }else{
				
			    }
		    }else{
			 
			}
		}
		
		if (ho<24 and ho>0){
			system("PAUSE"); 
		    for(h=a;h<=1;h++){ 
	    	   for(h2=b;h2<=9;h2++){ 
				  for(m=0;m<=5;m++){ 
			    	   for(m2=0;m2<=9;m2++){ 
				    	   for(s=0;s<=5;s++){ 
							  for(s2=0;s2<=9;s2++){ 
							     clrscr(); 
								 cout<<""<<endl;
								 cout<<""<<endl;
								 cout<<""<<endl;
								 cout<<""<<endl;
								 cout<<""<<endl;
								 cout<<""<<endl;
								 cout<<""<<endl;
								 cout<<"           |>              |>              |>         "<<endl;
								 cout<<"           |               |               |          "<<endl;
								 cout<<"           |               |               |          "<<endl;
								 cout<<"           |               |               |          "<<endl;
								 cout<<"           -               -               -          "<<endl;
								 cout<<"          ---             ---             ---         "<<endl; 
								 cout<<"         -----           -----           -----        "<<endl;
								 cout<<"        --  ---         ---  ---        ---  --       "<<endl; 
								 cout<<"        --  ---         ---  ---        ---  ---      "<<endl; 
								 cout<<"        --  ---         ---  ---        ---  ---      "<<endl;
								 cout<<"        -------         --------        --------      "<<endl; 
								 cout<<"        ----------------------------------------      "<<endl; 
								 cout<<"        -----------------Reloj-----------------      "<<endl; 
								 cout<<"         -------------------------------------               ^^^^^^"<<endl; 
								 cout<<"           ---------------------------------                ^^^^ ^^^^"<<endl; 
								 cout<<"             -----------------------------                 ^^^^   ^^^^"<<endl; 
								 cout<<"               -------              -----                  ^^^^   ^^^^"<<endl; 
							     cout<<"                ------   "<<h<<h2<<":"<<m<<m2<<":"<<s<<s2<<"   -----"<<endl; 
								 cout<<"        --------------              ------------           ^^^^   ^^^^"<<endl; 
								 cout<<"        ----------------------------------------            ^^^^ ^^^^"<<endl; 
								 cout<<"        ----------------------------------------             ^^^^^^^"<<endl; 
								 cout<<"        ----------------------------------------               |||  "<<endl; 
								 cout<<"        ----------------------------------------               |||  "<<endl; 
								 cout<<"        ----------  ---  FICHA:927176  --   ----               |||     O"<<endl; 
								 cout<<"        ----------  ---------------------   ----               |||   ^^^^"<<endl; 
								 cout<<"        ----------  ---------------------   ----               |||    /"<<endl; 
								 cout<<"        ----------------------------------------               |||   /"<<endl; 
								 cout<<"        ----------------------------------------               |||  /"<<endl; 
								 cout<<"        ----------------------  ----------------               ||| /"<<endl; 
								 cout<<"        ----------------------  ----------------               |||/   O"<<endl; 
								 cout<<"        ----------------------  ----------------               |||  ^^^^"<<endl; 
								 cout<<"        ----------------------------------------               |||   /"<<endl; 
								 cout<<"        ----------------------------------------               |||  /"<<endl; 
								 cout<<"           ------  ------------------  ------                  ||| /"<<endl; 
								 cout<<"            -----  ------------------  -----                   |||/"<<endl; 
								 cout<<"             ------  --------------  ------                    ||| "<<endl; 
								 cout<<"              -----                  -----                     ||| "<<endl; 
								 cout<<"               --------------------------                      ||| "<<endl; 
								 cout<<"              -----------------------------                    ||| "<<endl; 
								 cout<<"             -------------------------------                   ||| "<<endl; 
								 cout<<"            ---------------------------------                  ||| "<<endl; 
								 cout<<"           -----------------------------------                 ||| "<<endl; 
								 cout<<"        ----------------------------------------               ||| "<<endl; 
								 cout<<"        ----------------------------------------               ||| "<<endl; 
								 cout<<"        ----------------------------------------               ||| "<<endl; 
								 cout<<"        ----------------------------------------               ||| "<<endl; 
								 cout<<"        ----------------------------------------               ||| "<<endl; 
								 cout<<"        ----------------------------------------               ||| "<<endl; 
								 cout<<"        ----------------------------------------               ||| "<<endl; 
								 cout<<"^^^^^^^^----------------------------------------^^^^^^^^^^^^^^^^^^^^^^ "<<endl; 
								 cout<<"                                                      "<<endl;
								 cout<<"                                                      "<<endl;
								 cout<<"                                                      "<<endl;
							     Sleep(0.0001);
						        } 
					        } 
				        } 
			        } 
		        }  
		    } 
			
			if (ho==20 or ho==21 or ho==22 or ho==23){
				
			}else{
				b=0;
			}
			
			
			for(h=2;h<=2;h++){ 
				for(h2=b;h2<=3;h2++){ 
					for(m=0;m<=5;m++){ 
						for(m2=0;m2<=9;m2++){ 
							for(s=0;s<=5;s++){ 
								for(s2=0;s2<=9;s2++){ 
									clrscr(); 
									cout<<""<<endl;
									cout<<""<<endl;
									cout<<""<<endl;
									cout<<""<<endl;
									cout<<""<<endl;
									cout<<""<<endl;
									cout<<""<<endl;
									cout<<"           |>              |>              |>         "<<endl;
									cout<<"           |               |               |          "<<endl;
									cout<<"           |               |               |          "<<endl;
									cout<<"           |               |               |          "<<endl;
									cout<<"           -               -               -          "<<endl;
									cout<<"          ---             ---             ---         "<<endl; 
									cout<<"         -----           -----           -----        "<<endl;
									cout<<"        --  ---         ---  ---        ---  --       "<<endl; 
									cout<<"        --  ---         ---  ---        ---  ---      "<<endl; 
									cout<<"        --  ---         ---  ---        ---  ---      "<<endl;
									cout<<"        -------         --------        --------      "<<endl; 
									cout<<"        ----------------------------------------      "<<endl; 
									cout<<"        -----------------Reloj-----------------      "<<endl; 
									cout<<"         -------------------------------------               ^^^^^^"<<endl; 
									cout<<"           ---------------------------------                ^^^^ ^^^^"<<endl; 
									cout<<"             -----------------------------                 ^^^^   ^^^^"<<endl; 
									cout<<"               -------              -----                  ^^^^   ^^^^"<<endl; 
									cout<<"                ------   "<<h<<h2<<":"<<m<<m2<<":"<<s<<s2<<"   -----"<<endl; 
									cout<<"        --------------              ------------           ^^^^   ^^^^"<<endl; 
									cout<<"        ----------------------------------------            ^^^^ ^^^^"<<endl; 
									cout<<"        ----------------------------------------             ^^^^^^^"<<endl; 
									cout<<"        ----------------------------------------               |||  "<<endl; 
									cout<<"        ----------------------------------------               |||  "<<endl; 
									cout<<"        ----------  ---  FICHA:927176  --   ----               |||     O"<<endl; 
									cout<<"        ----------  ---------------------   ----               |||   ^^^^"<<endl; 
									cout<<"        ----------  ---------------------   ----               |||    /"<<endl; 
									cout<<"        ----------------------------------------               |||   /"<<endl; 
									cout<<"        ----------------------------------------               |||  /"<<endl; 
									cout<<"        ----------------------  ----------------               ||| /"<<endl; 
									cout<<"        ----------------------  ----------------               |||/   O"<<endl; 
									cout<<"        ----------------------  ----------------               |||  ^^^^"<<endl; 
									cout<<"        ----------------------------------------               |||   /"<<endl; 
									cout<<"        ----------------------------------------               |||  /"<<endl; 
									cout<<"           ------  ------------------  ------                  ||| /"<<endl; 
									cout<<"            -----  ------------------  -----                   |||/"<<endl; 
									cout<<"             ------  --------------  ------                    ||| "<<endl; 
									cout<<"              -----                  -----                     ||| "<<endl; 
									cout<<"               --------------------------                      ||| "<<endl; 
									cout<<"              -----------------------------                    ||| "<<endl; 
									cout<<"             -------------------------------                   ||| "<<endl; 
									cout<<"            ---------------------------------                  ||| "<<endl; 
									cout<<"           -----------------------------------                 ||| "<<endl; 
									cout<<"        ----------------------------------------               ||| "<<endl; 
									cout<<"        ----------------------------------------               ||| "<<endl; 
									cout<<"        ----------------------------------------               ||| "<<endl; 
									cout<<"        ----------------------------------------               ||| "<<endl; 
									cout<<"        ----------------------------------------               ||| "<<endl; 
									cout<<"        ----------------------------------------               ||| "<<endl; 
									cout<<"        ----------------------------------------               ||| "<<endl; 
									cout<<"^^^^^^^^----------------------------------------^^^^^^^^^^^^^^^^^^^^^^ "<<endl; 
									cout<<"                                                      "<<endl;
									cout<<"                                                      "<<endl;
									cout<<"                                                      "<<endl;
									Sleep(0.001);
								} 
							} 
						} 
					} 
				}  
			} 
			
			cout<<""<<endl;
			cout<<""<<endl;
			cout<<""<<endl;
			cout<<"        ////////////////////////////////////////////////////////////////"<<endl;
			cout<<"        ///                                                          ///"<<endl;
			cout<<"        ///                  El Reloj Ha Finalizado                  ///"<<endl;
			cout<<"        ///                                                          ///"<<endl;
			cout<<"        ////////////////////////////////////////////////////////////////"<<endl;
			cout<<""<<endl;
			cout<<""<<endl;
			cout<<""<<endl;
			cout<<"        ////////////////////////////////////////////////////////////////"<<endl;
			cout<<"        ///                                                          ///"<<endl;
			cout<<"        ///        Si Desea Volver A Inicia El Reloj Pulse (1)       ///"<<endl;
			cout<<"        ///              Si No Pulse Lo Que Quiera                   ///"<<endl;
			cout<<"        ///                                                          ///"<<endl;
			cout<<"        ////////////////////////////////////////////////////////////////"<<endl;
			
			
			cin>> seguir;
			
		}else {
			if (ho==100){
				seguir=0;
				
			            
			}else{
				
			
			cout<<""<<endl;
			cout<<""<<endl;
			cout<<""<<endl;
			cout<<"        ////////////////////////////////////////////////////////////////"<<endl;
			cout<<"        ///                                                          ///"<<endl;
			cout<<"        ///          Este Numero Es Muy Grande O Muy Peque�o         ///"<<endl;
			cout<<"        ///              Lo Maximo Es 23 Y Lo Minimo Es 1            ///"<<endl;
			cout<<"        ///                                                          ///"<<endl;
			cout<<"        ////////////////////////////////////////////////////////////////"<<endl;
			cout<<""<<endl;
			cout<<""<<endl;
			cout<<""<<endl;
			cout<<""<<endl;
			cout<<"        ////////////////////////////////////////////////////////////////"<<endl;
			cout<<"        ///                                                          ///"<<endl;
			cout<<"        ///        Si Desea Volver A Inicia El Reloj Pulse (1)       ///"<<endl;
			cout<<"        ///              Si No Pulse Lo Que Quiera                   ///"<<endl;
			cout<<"        ///                                                          ///"<<endl;
			cout<<"        ////////////////////////////////////////////////////////////////"<<endl;
			cin>> seguir;
		    }
		}
	}
	while(seguir==1);    
	return EXIT_SUCCESS; 
	}

