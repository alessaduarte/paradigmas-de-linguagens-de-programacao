class Configuracao {
    private static Configuracao instancia;
    private java.util.Map<String, String> configuracoes;

    private Configuracao() {
        configuracoes = new java.util.HashMap<>();
    }

    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public void adicionarConfiguracao(String chave, String valor) {
        configuracoes.put(chave, valor);
    }

    public String obterConfiguracao(String chave) {
        return configuracoes.get(chave);
    }
}
