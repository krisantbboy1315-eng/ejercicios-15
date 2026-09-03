class BTreeNodeEstatico {
    private int[] keys;
    private BTreeNodeEstatico[] hijos;
    private int numKeys;
    private boolean esHoja;

    public BTreeNodeEstatico(int grado) {
        this.keys = new int[2 * grado - 1];
        this.hijos = new BTreeNodeEstatico[2 * grado];
        this.numKeys = 0;
        this.esHoja = true;
    }
}