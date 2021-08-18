package cine;

public class Butaca {
  private boolean ocupada; //se inicializa en false
  public boolean estaOcupada() {
    return this.ocupada;
  }
  public void ocupar() {
    if(this.estaOcupada()) {
      throw new Error("Butaca ocupada");
    }
    this.ocupada = true;
  }
}