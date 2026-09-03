class TrieNodeEstatico {
    private char valor;
    private TrieNodeEstatico[] hijos;
    private boolean esFinDePalabra;

    public TrieNodeEstatico(char valor) {
        this.valor = valor;
        this.hijos = new TrieNodeEstatico[26];
        this.esFinDePalabra = false;
    }

    public void insertarHijo(char c, TrieNodeEstatico nuevoNodo) {
        int indice = c - 'a';
        hijos[indice] = nuevoNodo;
    }
}