package br.com.nicolas.exercicios_spring.exe38;

public enum CodigoErro {
    NOT_FOUND(404, "Recurso não encontrado"),
    BAD_REQUEST(400, "Requisição inválida"),
    INTERNA_SEVER_ERROR(500, "Erro interno do servidor");

    private final int codigo;
    private final String descricao;

    CodigoErro(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
