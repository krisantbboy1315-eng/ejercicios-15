class UnrolledNodeEstatico {
    private int[] buffer;
    private int count;
    private UnrolledNodeEstatico siguiente;

    public UnrolledNodeEstatico(int capacidadBloque) {
        this.buffer = new int[capacidadBloque];
        this.count = 0;
        this.siguiente = null;
    }

    public boolean agregar(int valor) {
        if (count < buffer.length) {
            buffer[count++] = valor;
            return true;
        }
        return false;
    }
}