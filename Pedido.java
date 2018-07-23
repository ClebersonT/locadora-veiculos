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
public class Pedido {
    public int numPedido;
    
        public static void main(String[] args) {
        // TODO code application logic here
        Cliente c = new Cliente(1111111111);
        
        Motocicleta m1 = new Motocicleta("Honda","Vermelha","NLT6666",100,true);
        Carro c1 = new Carro("Chevrolet", "Preto", "NNN4458", 200, true);
        Camionete c2 = new Camionete("FIAT","bordo","LUT8966",250,true);
        
       
        c.setNome("Cleberson Teodoro");
    
        System.out.println("============Dados Cliente==============");
        System.out.println("Nome: "+ c.getNome() +"\n"+ "CPF: " + c.getCpf());
        System.out.println("\n=============Dados Veiculo=============");
        
        m1.alugarMoto();
        System.out.println("");
        c1.alugarCarro();
        System.out.println("");
        c2.alugarCaminhonete();
    } 
}
