package es.unileon.prg.tema5;

/**
 * Clase con los ejercicios correspondientes a conversiones de tipo.
 *
 * @author PRG
 * @version 1.0
 */
    public class Apartado030104 extends Apartado {
   
       protected String obtenerPractica(){
         return "P-VAR";
      }
   
       protected String obtenerBloque() {
         return "Conversiones de tipo";
      }
   
   /**
    * Conversiones de tipo - Ejercicio1.
    *
    * </br>
    *
    * Comprobar cuales de las conversiones implicitas realizadas son correctas y comentar las incorrectas.
    */
       public void ejercicio01() {
         cabecera("01","");
      
         byte varByte;
         short varShort;
         int varInt;
         long varLong;
         float varFloat;
         double varDouble;
         char varChar ;
         boolean varBoolean;
          
         varByte = 50;//bien
         varShort = 1500 ;//bien
         varInt = 1500000 ;//bien
         varLong = 65000000 ;//entra en int
         varFloat = 20.0E4F ;//200.000 entra en int
         varDouble = 0.123456789e9 ;//123.456.789 entra en int
         varChar = 'H' ;//bien
         varBoolean = true ;//bien
      
         varInt    = varShort;//posible hacer conversion
         varDouble = varFloat;//posible hacer conversion  
         varFloat  = varLong;//posible hacer conversion
         varLong   = varInt;//No posible
         varLong   = 9223372036854775807L;//posible hacer conversion
         varFloat  = varLong;//posible hacer conversion
         varByte   = (byte) varShort;//No posible
         varShort  = (short) varInt;//No posible
      
      }
   
   /**
    * Conversiones de tipo - Ejercicio2.
    *
    * </br>
    *
    * Asignar varLong al resto de variables realizando las conversiones explicitas necesarias
    * Imprime por pantalla el resultado de dichas conversiones
    */
       public void ejercicio02() {
         cabecera("02", "");
      
      // Inicio modificacion
         byte varByte;
         short varShort;
         int varInt;
         long varLong;
      
         varLong=35000L;
	 varInt =(int) varLong;
	 varShort = (short) varInt;
	 varByte = (byte) varShort;
	 System.out.println("Covertir long: "+varLong+" en Int: "+varInt+" en Short: "+varShort+" en Byte: "+varByte);
      // Fin modificacion
      }
   
   /**
    * Conversiones de tipo - Ejercicio3.
    *
    * </br>
    *
    * Asignar varFloat al resto de variables realizando las conversiones necesarias.
    * Imprime por pantalla el resultado de dichas conversiones
    */
       public void ejercicio03() {
         cabecera("03", "");
      
      // Inicio modificacion
         byte varByte;
         short varShort;
         int varInt;
         long varLong;
         float varFloat;
         double varDouble;
         varFloat= 123.1f;
	 varDouble = varFloat;
	 varLong = (long) varDouble;
	 varInt = (int) varLong;
	 varShort = (short) varInt;
	 varByte = (byte) varShort;
	 System.out.println("Covertir float: "+varFloat+" en Double: "+varDouble+" en Long: "+varLong+" en Int: "+varInt+" en Short: "+varShort+" en Byte: "+varByte);
        // Fin modificacion
      }
   
   /**
    * Conversiones de tipo - Ejercicio4.
    *
    * </br>
    *
    * Arreglar los posibles errores de compilacion y explicar en el fichero LEEME.TXT los resultados    */
       public void ejercicio04() {
         cabecera("04", "");
      
         double dGigante, dNormal, dMinimo;
         float  fGigante, fNormal, fMinimo;
      
         dGigante = 1.766e289;//17660..*259ceros..0 bien
         dNormal  = 35.987654321;//bien
         dMinimo  = 0.2E-256;//bien
      
         fGigante = (float)dGigante;
         fNormal  = (float)dNormal;
         fMinimo  = (float)dMinimo;
      
         System.out.println("Gigante: " + fGigante);    
         System.out.println("Normal : " + fNormal);    
         System.out.println("Minimo : " + fMinimo);
      
         byte b = (byte)130;
         short s = (short)32770;
         int i = (int)2147483650l; 
      
         System.out.println("Byte  : " + b);    
         System.out.println("Short : " + s);    
         System.out.println("Int   : " + i);
      
         float f = (float)1.3e22;   //faltaba (float)
         System.out.println("float: " + f);    
      }
   }
