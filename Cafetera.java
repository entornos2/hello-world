public class Cafetera
	{
		private int capacidadMaxima; 
		private int cantidadActual;
	
		public Cafetera()
			{ 
				capacidadMaxima = 1000;
				cantidadActual = 0;
			}
	
		public Cafetera(int capacidad)
			{ 
				capacidadMaxima = capacidad; 
				cantidadActual = capacidadMaxima;
			}
	
		public Cafetera(int capacidad, int cantidad)
			{ 
				this.capacidadMaxima = capacidad;
				
				if (cantidad > capacidad)
					{
						this.cantidadActual = capacidad;
					}
				else
					{
						this.cantidadActual = cantidad;
					}
			}
	
		public int getCapacidadMaxima()
			{
				return capacidadMaxima;
			} 
	
		public int getCantidadActual()
			{
				return cantidadActual;
			} 
	
		public void setCapacidadMaxima(int c)
			{ 
				//probar que la cantidad en el deposito no sea mayor que la capacidad maxima
				capacidadMaxima = c;
				
				if (cantidadActual > capacidadMaxima)
					{
						cantidadActual=capacidadMaxima;
					}
			}
		
		public void setCantidadActual(int c)
			{ 
				if (c > capacidadMaxima)
					{
						cantidadActual = capacidadMaxima;
					}
				else
					{
						cantidadActual = c;
					}
			}
	
		public void llenarCafetera()
			{ 
				cantidadActual = capacidadMaxima;
			}
	
		public int servirTaza(int cc)
			{ 
				int servido=0; 
				
				if(cantidadActual == 0)
					{
						System.out.println("Lo siento, pero no queda nada de cafe."); 
						
						servido = 0;
					}
				else
					{
						if(cantidadActual <= cc)
							{
								System.out.println("Se ha servido todo lo que quedaba (" + cantidadActual + " c.c.)"); 
								
								servido = cantidadActual; 
								
								cantidadActual = 0;			
							}
						else
							{ 
								servido = cc;
								
								cantidadActual -= cc; 
								
								System.out.println("Todavia quedan " + cantidadActual + " c.c.");
							}
					}
				
				return servido;
			}
	
		public void vaciarCafetera()
			{ 
				cantidadActual = 0;
			}
	
		public void agregarCafe(int cc)
			{ 
				int cantidad = 0;
				
				//no se puede superar la capacidadMaxima
				cantidad = cantidadActual + cc;
				
				if (cantidad > capacidadMaxima)
					{
						cantidadActual = capacidadMaxima;
					}
				else
					{
						cantidadActual = cantidad;
					}		
			}
	
		public String toString()
			{
				return "Capacidad = " + capacidadMaxima + " Cantidad actual = " + cantidadActual;
			}
		
		System.out.print("Otro comentario para el git");
		
		System.out.print("Un comentario mas desde GitHub");
	}
