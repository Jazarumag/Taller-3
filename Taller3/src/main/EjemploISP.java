package main;

public class EjemploISP{}

//Violando el principio de ISP
public interface Deportista{
  void estirarse();
  void ejercitarse();
  void correr();
  void esprintar();
  void saltar();
  void nadar();
  void bucear();
  void cargar();
  void lanzar();
}


//Principio de ISP aplicado correctamente
public interface DeportistaComun{
  void estirarse();
  void ejercitarse();
}

public interface Corredor{
  void correr();
  void esprintar();
  void saltar();
}

public interface Nadador{
  void nadar();
  void bucear();
}

public interface Lanzador{
  void cargar();
  void lanzar();
}
