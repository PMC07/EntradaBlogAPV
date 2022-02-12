
package entradablogapv;

/**
 *
 * @author Andrés Plaza Vicente
 */
/*Clase para manejar las entradas de un blog.
 * La clase se creó el 12/2/2022 por Andrés Plaza.
 * Esta es la versión 12.1 de NetBeans
 */

public class EntradaBlogAPV {
	
	
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	

    /**
     *
     * @param id identificador
     * @param autor Andrés Plaza    
     * @param texto texto
     * @throws IllegalArgumentException si da negaitivo te salta la excepción
     */
	public EntradaBlogAPV(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}

    /**
     *
     * @return Devuelve  una cadena combinando la String de separador con autor.
     */
    @Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	

    /**
     *
     * @return devuelve el número de la entrada
     */
	public int getId(){
		return this.id;
	}
	
	

    /**
     *
     * @return devuelve el texto completo de la entrada
     */
	public String getTexto(){
		return this.texto;
	}
	
	
    /**
     *
     * @return devuelve el nombre del autor de la entrada en mayúsculas
     */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	

    /**
     *
     * @return devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
     */
	public String devuelveAutor(){
		return this.autor;
	}
	
	//No tiene porqué tener argumentos.

    /**
     *
     * @param args metodo principal del programa
     */
	public static void main(String[] args) {
                //Modificar.
		EntradaBlogAPV e1=new EntradaBlogAPV (3,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}

