/**
 * @author Ines Llopis Martinez
 * @version 1.2
 */
public class Rectangulo_ILM extends FiguraGeometrica_ILM {
	private double l1;
	private double l2;

	/*pide los datos para realizar los calculos*/
	public Rectangulo_ILM(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}


	@Override
	/** @param recibe los datos de los lados del rectangulo
	 * @return devuelve el area del rectangulo
	 */
	public double area() {
		return l1 * l2;
	}


	@Override
	/** @param recibe los datos de los lados del rectangulo
	 * @return devuelve el perimetro del rectangulo
	 */
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
