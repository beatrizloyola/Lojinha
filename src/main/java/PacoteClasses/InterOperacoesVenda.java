package PacoteClasses;

import java.sql.Connection;

public interface InterOperacoesVenda {

    public abstract void compra(Connection con, Venda venda, Produto produto);

    public abstract void devolucao(Connection con, Venda venda);
    
    public abstract Venda retornarUmaVenda(Connection con, int id);
}
