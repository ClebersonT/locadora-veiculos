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
public class Carro extends Veiculo{
    
    public Carro(String fabricante, String cor, String placa, float valorDiaria, boolean status) {
        super(fabricante, cor, placa, valorDiaria, status);
    }
    
       public void alugarCarro(){
        if(this.getStatus() == true){
            System.out.println("Fabricante: " +this.getFab());
            System.out.println("Cor: " +this.getCor());
            System.out.println("Placa: " +this.getPlaca());
            System.out.println("Valor Diária: " +this.getValor());
            System.out.println("Carro alugado com sucesso!");
        }else{
            System.out.println("Este carro já está alugado! ");
            System.out.println("Fabricante: "+this.getFab());
            System.out.println("Cor: " +this.getCor());
            System.out.println("Placa: " +this.getPlaca());
        }
    }
}
