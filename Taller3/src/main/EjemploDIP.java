public class EjemploDIP{}

// Ejemplo DIP
//Interfaces de como se comporta
public interface Rodable {}
public interface Habitable {}
public interface Manejable{}

public class CasaRodante {
  private Rodable irodable;
  private Habitable ihabitable;
  private Manejable imanejable; 
  public CasaRodante(Rodable irodable,
                     Habitable ihabitable,
                     Manejable imanejable){
    this.irodable=irodable;
    this.ihabitable=ihabitable;
    this.imanejable=imanejable;
  }
  public Carro(){}
  public Rodable Rodable;
  public Habitable Habitable;
  public Manejable Manejable;
}