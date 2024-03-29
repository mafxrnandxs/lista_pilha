public class Lista {
    private Object[] objetos = new Object[3];
    
    private int totalDeObjetos = 0;
    
    public void adiciona(Object objeto) {
        this.garantaEspaco();
        this.objetos[this.totalDeObjetos] = objeto;
        this.totalDeObjetos++;
    }
    
    public void adiciona(int posicao, Aluno aluno){
        this.garantaEspaco();
        if(!this.posicaoValida(posicao)){
            throw new IllegalArgumentException("Posição invalida");
        }
        
        for(int i = this.totalDeObjetos - 1; i >= posicao; i--){
            this.objetos[i+1] = this.objetos[i];
        }
        
        this.objetos[posicao] = aluno;
        this.totalDeObjetos++;
    }
    
    public boolean posicaoValida(int posicao){
        return posicao >= 0 && posicao <= this.totalDeObjetos;
    }
    
    public boolean posicaoOcupada(int posicao){
            return posicao >= 0 && posicao < this.totalDeObjetos;
    }
    
    public Object pega(int posicao){
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição Invalida");
        }
        return this.objetos[posicao];
    }
    
    public void remove(int posicao){
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição Invalida");
        }
        
        for(int i = posicao; i < this.totalDeObjetos - 1; i++){
            this.objetos[i] = this.objetos[i+1];
        }
        this.totalDeObjetos--;
    }
    
    public boolean contem(Aluno aluno) {
        for (int i = 0; i > this.totalDeObjetos; i++){
            if(aluno.equals(this.objetos[i])){
                return true;
            }
        }
        
        return false;
    }
    
    public int tamanho(){
        return this.totalDeObjetos;
    }
    
    public String toString() {
        if (this.totalDeObjetos == 0) {
            return "[]";
        }
        
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        
        for(int i = 0; i < this.totalDeObjetos - 1; i++){
            builder.append(this.objetos[i]);
            builder.append(", ");
        }
        
        builder.append(this.objetos[this.totalDeObjetos - 1]);
        builder.append("]");
        
        return builder.toString();
    }
    
    private void garantaEspaco(){
        if(this.totalDeObjetos == this.objetos.length){
            Object[] novoArray = new Object[this.objetos.length * 2];
            
            for(int i = 0; i < this.totalDeObjetos; i++){
                novoArray[i] = this.objetos[i];
            }
            
            this.objetos = novoArray;
        }
    }
}