/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questao5QuedaFolhasArvore;

import java.util.HashSet;

/**
 *
 * @author anaFidelis
 */
public class PilhaFolhas {
    private int index;
    private HashSet<NoArvoreBinaria> folhas;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public HashSet<NoArvoreBinaria> getFolhas() {
        return folhas;
    }

    public void setFolhas(HashSet<NoArvoreBinaria> folhas) {
        this.folhas = folhas;
    }

    public PilhaFolhas() {
        folhas = new HashSet<>();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (equals((int) obj)){
            return true;
        }
        
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PilhaFolhas other = (PilhaFolhas) obj;
        if (this.index != other.index) {
            return false;
        }
        return true;
    }   
    
    public boolean equals(int index){
        return (this.index == index);
    }

    @Override
    public String toString() {
        int soma = 0;
        for (NoArvoreBinaria folha: folhas){
            soma += (int) folha.getInfo();
        }
        
        return "" + soma;
    }
    
    
    
}
