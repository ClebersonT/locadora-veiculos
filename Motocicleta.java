/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

/**
 *
 * @author SUPORTE
 */
public class Motocicleta extends Veiculo{
    
    public Motocicleta(String fabricante, String cor, String placa, float valorDiaria, boolean status) {
        super(fabricante, cor, placa, valorDiaria, status);
    }
      public void alugarMoto(){
        if(this.getStatus() == true){
            System.out.println("Fabricante: " +this.getFab());
            System.out.println("Cor: " +this.getCor());
            System.out.println("Placa: " +this.getPlaca());
            System.out.println("Valor Diária: " +this.getValor());
            System.out.println("Motoka alugada com sucesso!");
        }else{
            System.out.println("Esta moto já está alugada! ");
            System.out.println("Fabricante: "+this.getFab());
            System.out.println("Cor: " +this.getCor());
            System.out.println("Placa: " +this.getPlaca());
        }
    }
    
}
