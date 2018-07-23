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
public class Veiculo {
    private String fabricante;
    private String cor;
    private String placa;
    private float valorDiaria;
    private boolean status;
   
    
    public Veiculo(String fabricante, String cor, String placa, float valorDiaria, boolean status) {
        this.fabricante = fabricante;
        this.cor = cor;
        this.placa = placa;
        this.valorDiaria = valorDiaria;
        this.status = status;
    }    
    public String getFab() {
        return fabricante;
    }

    public void setFab(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public float getValor(){
        return valorDiaria;
    }
    public void setValor(float valorDiaria){
        this.valorDiaria = valorDiaria;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
