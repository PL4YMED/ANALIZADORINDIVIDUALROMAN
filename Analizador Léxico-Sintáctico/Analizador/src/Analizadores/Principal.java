package Analizadores;

import java.io.File;

public class Principal
{
	public static void main(String[] args)
	{
		String ruta="C:\\Users\\fer_s\\Desktop\\Analizador\\src\\Analizadores\\Lexer.flex";
		GenerarLexer(ruta);
	}

	public static void GenerarLexer(String ruta)
	{
		File archivo = new File(ruta);
		JFlex.Main.generate(archivo);
	}
}