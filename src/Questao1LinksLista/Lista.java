/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao1LinksLista;

/**
 *
 * @author Ana Paula Fidelis e Barbara Marquez
 * @param <T>
 */
public class Lista<T> {
    private NoLista<T> primeiro;
    
    public NoLista<T> getPrimeiro(){
        return primeiro;
    }
    
    public void inserir(T info){
        NoLista<T> novo = new NoLista();
        novo.setInfo(info);
        novo.setProximo(primeiro);
        primeiro = novo;
    }
    
    public void exibir(){
        NoLista<T> p = primeiro;
        while (p != null) {            
            System.out.println(p.getInfo());
            p = p.getProximo();            
        }
    }
    
    public boolean estaVazia(){
        return (primeiro == null);        
    }
    
    public NoLista<T> buscar(T info){
        NoLista<T> p = primeiro;
        while (p != null) {            
            if (p.getInfo().equals(info)){
                mudaPrimeiro(p);
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }
    
    public void mudaPrimeiro(NoLista<T> no){
        if (no != primeiro){
            NoLista p = primeiro;
            if (no.getProximo() == null){
                primeiro = no;
                primeiro.setProximo(p);
                while(p.getProximo() != no)
                    p = p.getProximo();
                
                p.setProximo(null);
            }else{
                NoLista pp = primeiro;
                while(p.getProximo() != no)
                    p = p.getProximo();
                
                p.setProximo(no.getProximo());
                primeiro = no;
                primeiro.setProximo(pp);
            }
        }
    }
    
    public void retirar(T info){
        NoLista<T> anterior = null;
        NoLista<T> p = primeiro;
        
        while ((p != null) && (p.getInfo() != info)){
            anterior = p;
            p = p.getProximo();
        }
        
        if (p != null){
            if (anterior == null){
                primeiro = p.getProximo();
            }else{
                anterior.setProximo(p.getProximo());
            }
        }
    }
    
    public int obterComprimento(){
        NoLista<T> p = primeiro;
        
        int soma = 0;
        while (p != null) {            
            soma++;
            p = p.getProximo();
        }
        
        return soma;
    }
    
    @Override
    public boolean equals(Object lista){
        if (this == lista)
            return true;
        if (lista == null)
            return false;
        if (getClass() != lista.getClass())
            return false;
        
        Lista<T> other = (Lista<T>) lista;
        
        /*if (this.obterComprimento() != other.obterComprimento())
            return false;*/
        
        NoLista<T> p1 = this.getPrimeiro();
        NoLista<T> p2 = other.getPrimeiro();
        
        while((p1!=null) && (p2!=null)){
            if(!(p1.getInfo().equals(p2.getInfo())))
                return false;
            
            p1 = p1.getProximo();
            p2 = p2.getProximo();
        
        }
        
        return (p1==null)&&(p2==null);
    }
    
    public NoLista getNo(int idx){
        if ((idx > obterComprimento()) || (idx < 0))
            throw new IndexOutOfBoundsException();
        
        NoLista<T> p = getPrimeiro();
        for (int i = 0; i < idx; i++) {
           p = p.getProximo(); 
        }
        
        return p;
    }
}
