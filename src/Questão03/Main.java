
public class ItemDTesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();

        fornecedor.setNome("Mário");
        fornecedor.setEndereco("QNJ 24 Bloco 4 Casa 5");
        fornecedor.setTelefone("(61) 99874-5728");
        fornecedor.setValorCredito(300.45);
        fornecedor.setValorDivida(25.45);
        fornecedor.obterSaldo();

        System.out.println("Dados sobre o "+fornecedor.getClass().getSimpleName()+
                "\nNome: "+fornecedor.getNome()+
                "\nEndereço: "+fornecedor.getEndereco()+"\nTelefone: "+
                fornecedor.getTelefone()+"\nSaldo= Crédito - Divida => Saldo= ("+
                fornecedor.getValorCredito()+") - ("+ fornecedor.getValorDivida()+
                ") = "+ fornecedor.obterSaldo());
    }
}

-------------------------------------------------------------------------------------------

public class ProgramaTesteAdministrador {
    public static void main(String[] args) {
        Administrador adm = new Administrador();

        adm.setNome("Anabella");
        adm.setEndereco("QNL 11 bloco G casa 9");
        adm.setTelefone("(61) 99522-8604");
        adm.setCodigoSetor(105);
        adm.setSalarioBase(6500.0);
        adm.setImposto(0.15); // SalarioEmpregadoUsual = 6500 - (6500 * 0.15)
        adm.setAjudaDeCusto(350.75);

        System.out.println("Dados sobre o "+adm.getClass().getSimpleName()+"\nNome: "+
                adm.getNome()+"\nEndereço: "+ adm.getEndereco()+"\nTelefone: "+adm.getTelefone()+
                "\nCódigo do setor: "+ adm.getCodigoSetor()+"\nSalário adm = SalárioEmpregadoUsual + ajudaDeCusto"+
                "\nSalário final = ( "+adm.getSalarioBase()+" - ("+adm.getSalarioBase()+ " * "+ adm.getImposto()+") ) + "+
                adm.getAjudaDeCusto()+" = "+adm.calcularSalario());

    }
}

-------------------------------------------------------------------------------------------------

public class ProgramaTesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado();

        empregado.setNome("Sérgio");
        empregado.setEndereco("Qi 16 lote 24");
        empregado.setTelefone("(61) 99254-5288");
        empregado.setCodigoSetor(345);
        empregado.setSalarioBase(4500.0);
        empregado.setImposto(0.15);

        System.out.println("Dados sobre o "+empregado.getClass().getSimpleName()+"\nNome: "+
                empregado.getNome()+"\nEndereço: "+ empregado.getEndereco()+"\nTelefone: "+ empregado.getTelefone()+
                "\nCódigo do setor: "+ empregado.getCodigoSetor()+"\nSalário empregado = salarioBase - (salarioBase*imposto)"+
                " => Salário final = "+ empregado.getSalarioBase()+" - ( "+ empregado.getSalarioBase()+" * "+
                empregado.getImposto()+") = "+ empregado.calcularSalario());


    }
}
------------------------------------------------------------------------------------------------

public class ProgramaTesteOperario {
    public static void main(String[] args) {
        Operario op = new Operario();

        op.setNome("Sebastião");
        op.setEndereco("QNG 23 bloco D casa 5");
        op.setTelefone("(61) 95662-3488");
        op.setCodigoSetor(345);
        op.setSalarioBase(4500.0);
        op.setImposto(0.15);
        op.setValorProducao(70.0); // comissão = 70 * 0,3 = 21 -> calculo feito no getComissao
        op.setComissao(0.3);

        System.out.println("Dados sobre o "+op.getClass().getSimpleName()+"\nNome: "+
                op.getNome()+"\nEndereço: "+ op.getEndereco()+"\nTelefone: "+ op.getTelefone()+
                "\nCódigo do setor: "+ op.getCodigoSetor()+"\nSalário operário = SalárioEmpregadoUsual + comissão"+
                "\nSalário final = "+ op.getSalarioBase()+" - ( "+ op.getSalarioBase()+" * "+
                op.getImposto()+") + "+ op.getComissao()+" = "+ op.calcularSalario());
    }
}
----------------------------------------------------------------------------------------------

public class ProgramaTesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();

        vendedor.setNome("Valmir");
        vendedor.setEndereco("QND 5 quadra 11 ");
        vendedor.setTelefone("(61) 96644-2238");
        vendedor.setCodigoSetor(715);
        vendedor.setSalarioBase(3500.0);
        vendedor.setImposto(0.15);
        vendedor.setValorVendas(75); // comissao tirada em cima do valorVendas = 75 * 0.3 = 22.5 -> feito direto no getComissao
        vendedor.setComissao(0.3);

        System.out.println("Dados sobre o "+vendedor.getClass().getSimpleName()+"\nNome: "+
                vendedor.getNome()+"\nEndereço: "+ vendedor.getEndereco()+"\nTelefone: "+ vendedor.getTelefone()+
                "\nCódigo do setor: "+ vendedor.getCodigoSetor()+"\nSalário vendedor = SalárioEmpregadoUsual + comissão"+
                "\nSalário final = ("+ vendedor.getSalarioBase()+" - ( "+ vendedor.getSalarioBase()+" * "+
                vendedor.getImposto()+") ) + "+vendedor.getComissao()+ " = "+ vendedor.calcularSalario());
    }
}
