/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

/**
 *
 * @author vh
 */
public class ProdutoBean {

    public int getProd_cod() {
        return Prod_cod;
    }

    public void setProd_cod(int Prod_cod) {
        this.Prod_cod = Prod_cod;
    }

    public String getProd_name() {
        return Prod_name;
    }

    public void setProd_name(String Prod_name) {
        this.Prod_name = Prod_name;
    }

    public String getProd_categ() {
        return Prod_categ;
    }

    public void setProd_categ(String Prod_categ) {
        this.Prod_categ = Prod_categ;
    }

    public int getProd_Quant() {
        return Prod_Quant;
    }

    public void setProd_Quant(int Prod_Quant) {
        this.Prod_Quant = Prod_Quant;
    }

    public float getProd_preço() {
        return Prod_preço;
    }

    public void setProd_preço(float Prod_preço) {
        this.Prod_preço = Prod_preço;
    }
    
    private int Prod_cod;
    private String Prod_name;
    private String Prod_categ;
    private int Prod_Quant;
    private float Prod_preço;
    
    
}
