public class Porco extends Animal implements Pesado, Colorido {
    public void fazerBarulho(){
      System.out.println("Oinc!");
    }
    public double obterPeso(){
      return 60.0;
    }
    public String obterCor(){
      return "Rosa";
    }
    public boolean enlameado(){
      return true;
    }
    public String toString(){
      return String.format("\n%s: %s \n%s: %f \n%s %s", "Cor", obterCor(), "Peso", obterPeso(), "Enlameado?", enlameado());
    }
  }