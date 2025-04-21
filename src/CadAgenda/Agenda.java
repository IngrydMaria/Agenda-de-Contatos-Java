package CadAgenda;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class Agenda extends WindowAdapter implements ActionListener{
    private Frame janela;
    private Panel painelEndereco, painelBotoes;
    private Label lCodigo, lNome, lEndereco, lfone, lCelular, lSexo, lNacionalidade, lDataNascimento, lCpf, lEmail, lNumeroResidencial, lCep, lComplementoEndereco, lObs;
    private TextField tCodigo, tNome, tEndereco, tFone, tCelular, tSexo, tNacionalidade, tDataNascimento, tCpf, tEmail, tNumeroResidencial, tCep, tComplementoEndereco;
    private TextField tObs;
    private Button bNovo, bSalva, bExclui, bProximo, bAnterior;
    private CheckboxGroup cbgSexo;
    private Checkbox masculino, feminino;
    private Vector vContatos;
    private int posicao;

    public Agenda(){
        vContatos = new Vector();
        janela = new Frame();
        janela.setTitle("Agenda");
        janela.setSize(420,650);
        janela.setBackground(new Color(255,182,193));
        janela.setLayout(null);
        janela.addWindowListener(this);

        painelEndereco = new Panel();
        painelEndereco.setBackground(new Color(255,182,193));
        painelEndereco.setSize(750,500);
        painelEndereco.setLocation(10,80);
        painelEndereco.setLayout(null);

        painelBotoes = new Panel();
        painelBotoes.setBackground(new Color(17,216,230));
        painelBotoes.setLayout(new GridLayout(1,5,10,10));
        painelBotoes.setSize(400,40);
        painelBotoes.setLocation(10,600);
        painelBotoes.setLayout(new FlowLayout());

        Font fonteRotos = new Font("Verdana", Font.PLAIN,14);

        lCodigo = new Label("Codigo:");
        lNome = new Label("Nome:");
        lEndereco = new Label("Endereco:");
        lfone = new Label("Fone:");
        lCelular = new Label("Celular:");
        lSexo = new Label("Sexo:");
        lNacionalidade = new Label("Nacionalidade:");
        lDataNascimento = new Label("Data de Nascimento:");
        lCpf = new Label("Cpf:");
        lEmail = new Label("Email:");
        lNumeroResidencial = new Label("Numero Residencial:");
        lCep = new Label("Cep:");
        lComplementoEndereco = new Label("Complemento:");
        lObs = new Label("Obs:");

        lCodigo.setFont(fonteRotos);
        lNome.setFont(fonteRotos);
        lEndereco.setFont(fonteRotos);
        lfone.setFont(fonteRotos);
        lCelular.setFont(fonteRotos);
        lSexo.setFont(fonteRotos);
        lNacionalidade.setFont(fonteRotos);
        lDataNascimento.setFont(fonteRotos);
        lCpf.setFont(fonteRotos);
        lEmail.setFont(fonteRotos);
        lNumeroResidencial.setFont(fonteRotos);
        lCep.setFont(fonteRotos);
        lComplementoEndereco.setFont(fonteRotos);
        lObs.setFont(fonteRotos);

        tCodigo = new TextField(10);
        tNome = new TextField(45);
        tEndereco = new TextField(60);
        tFone = new TextField(8);
        tCelular = new TextField(9);
        tNacionalidade = new TextField(20);
        tDataNascimento = new TextField(8);
        tCpf = new TextField(11);
        tEmail = new TextField(45);
        tNumeroResidencial = new TextField(11);
        tCep = new TextField(8);
        tComplementoEndereco = new TextField(60);
        tObs = new TextField(60);

        lCodigo.setBounds(10,15,60,20);
        tCodigo.setBounds(70,15,100,20);
        lNome.setBounds(10,45,60,20);
        tNome.setBounds(70,45,240,20);
        lEndereco.setBounds(10,75,80,20);
        tEndereco.setBounds(90,75,270,20);
        lfone.setBounds(10,105,60,20);
        tFone.setBounds(70,105,86,20);
        lCelular.setBounds(180,105,60,20);
        tCelular.setBounds(240,105,80,20);
        lSexo.setBounds(10,135,60,20);
        lNacionalidade.setBounds(10,160,100,20);
        tNacionalidade.setBounds(120,160,150,20);
        lDataNascimento.setBounds(10,185,120,20);
        tDataNascimento.setBounds(140,185,100,20);
        lCpf.setBounds(10,210,50,20);
        tCpf.setBounds(70,210,100,20);
        lEmail.setBounds(10,235,50,20);
        tEmail.setBounds( 70, 235,  200,  20);
        lNumeroResidencial.setBounds(10,260,120,20);
        tNumeroResidencial.setBounds(140,260,100,20);
        lCep.setBounds(10,285,50,20);
        tCep.setBounds(70,285,100,20);
        lComplementoEndereco.setBounds(10,310,120,20);
        tComplementoEndereco.setBounds(140,310,200,20);

        cbgSexo = new CheckboxGroup();
        masculino = new Checkbox("Masculino",false,cbgSexo);
        feminino = new Checkbox("Feminino", false, cbgSexo);
        masculino.setBounds(70,135,90,20);
        feminino.setBounds(160,135,90,20);

        masculino.setFont(fonteRotos);
        feminino.setFont(fonteRotos);

        lObs.setBounds(10, 340, 80, 20);
        tObs.setBounds(10, 360, 330, 90);

        painelEndereco.add(lCodigo);
        painelEndereco.add(tCodigo);
        painelEndereco.add(lNome);
        painelEndereco.add(tNome);
        painelEndereco.add(lEndereco);
        painelEndereco.add(tEndereco);
        painelEndereco.add(lfone);
        painelEndereco.add(tFone);
        painelEndereco.add(lCelular);
        painelEndereco.add(tCelular);
        painelEndereco.add(lNacionalidade);
        painelEndereco.add(tNacionalidade);
        painelEndereco.add(lDataNascimento);
        painelEndereco.add(tDataNascimento);
        painelEndereco.add(lCpf);
        painelEndereco.add(tCpf);
        painelEndereco.add(lEmail);
        painelEndereco.add(tEmail);
        painelEndereco.add(lNumeroResidencial);
        painelEndereco.add(tNumeroResidencial);
        painelEndereco.add(lCep);
        painelEndereco.add(tCep);
        painelEndereco.add(lComplementoEndereco);
        painelEndereco.add(tComplementoEndereco);
        painelEndereco.add(lObs);
        painelEndereco.add(tObs);
        painelEndereco.add(lSexo);
        painelEndereco.add(masculino);
        painelEndereco.add(feminino);

        Font fonteBotoes = new Font("Tahoma", Font.BOLD, 16);

        bNovo = new Button("Novo");
        bNovo.addActionListener(this);
        bNovo.setBackground(new Color(173, 216,230));
        bNovo.setForeground(Color.white);
        bNovo.setFont(fonteBotoes);
        bSalva = new Button("Salva");
        bSalva.addActionListener(this);
        bSalva.setBackground(new Color(173, 216,230));
        bSalva.setForeground(Color.white);
        bSalva.setFont(fonteBotoes);
        bExclui = new Button("Exclui");
        bExclui.addActionListener(this);
        bExclui.setBackground(new Color(173, 216,230));
        bExclui.setForeground(Color.white);
        bExclui.setFont(fonteBotoes);
        bProximo = new Button("Proximo");
        bProximo.addActionListener(this);
        bProximo.setBackground(new Color(173, 216,230));
        bProximo.setForeground(Color.white);
        bProximo.setFont(fonteBotoes);
        bAnterior = new Button("Anterior");
        bAnterior.addActionListener(this);
        bAnterior.setBackground(new Color(173, 216,230));
        bAnterior.setForeground(Color.white);
        bAnterior.setFont(fonteBotoes);


        painelBotoes.setLayout(new GridLayout(1,5));
        painelBotoes.add(bNovo);
        painelBotoes.add(bSalva);
        painelBotoes.add(bExclui);
        painelBotoes.add(bProximo);
        painelBotoes.add(bAnterior);

        janela.add(painelEndereco);
        janela.add(painelBotoes);

        bExclui.setEnabled(false);
        bAnterior.setEnabled(false);
        bProximo.setEnabled(false);
    }
    public void setCodigo(String codigo){
        tCodigo.setText(codigo);
    }
    public void setNome (String nome){
        tNome.setText(nome);
    }
    public void setEndereco (String endereco){
        tEndereco.setText(endereco);
    }
    public void setFone (String fone){
        tFone.setText(fone);
    }
    public void setCelular (String celular){
        tCelular.setText(celular);
    }
    public void setNacionalidade (String nacionalidade){
        tNacionalidade.setText(nacionalidade);
    }
    public void setDataNascimento (String dataNascimento){
        tDataNascimento.setText(dataNascimento);
    }
    public void setCpf (String cpf){
        tCpf.setText(cpf);
    }
    public void setEmail(String email){
        tEmail.setText(email);
    }
    public void setNumeroResidencial (String numeroResidencial){
        tNumeroResidencial.setText(numeroResidencial);
    }
    public void setCep (String cep){
        tCep.setText(cep);
    }
    public void setComplementoEndereco (String complementoEndereco){
        tComplementoEndereco.setText(complementoEndereco);
    }
    public void setObs (String obs){
        tObs.setText(obs);
    }
    public void setSexo (String sexo){
        if (sexo != null){
            if (sexo.equals("F")) feminino.setState(true);
            else if (sexo.equals("M")) masculino.setState(true);
        }
    }
    public void setMenuBar (MenuBar mb){
        janela.setMenuBar(mb);
    }
    public String getCodigo(){
        return tCodigo.getText();
    }
    public String getNome(){
        return tNome.getText();
    }
    public String getEndereco(){
        return tEndereco.getText();
    }
    public String getFone(){
        return tFone.getText();
    }
    public String getCelular(){
        return tCelular.getText();
    }
    public String getNacionalidade(){
        return tNacionalidade.getText();
    }
    public String getDataNascimento(){
        return tDataNascimento.getText();
    }
    public String getCpf(){
        return tCpf.getText();
    }
    public String getEmail(){
        return tEmail.getText();
    }
    public String getNumeroResidencial(){
        return tNumeroResidencial.getText();
    }
    public String getCep(){
        return tCep.getText();
    }
    public String getComplementoEndereco(){
        return tComplementoEndereco.getText();
    }
    public String getObs(){
        return tObs.getText();
    }
    public String getSexo(){
        if (masculino.getState() == true) return "M";
        else if (feminino.getState() == true) return "F";
        else return " ";
    }
    public void actionPerformed (ActionEvent e){
        Button b = (Button) e.getSource();
        if (b == bNovo) this.botaoNovo();
        else if (b == bSalva)  this.botaoSalva();
        else if ( b== bExclui)  this.botaoExclui();
        else if (b == bAnterior)  this.botaoAnterior();
        else if (b == bProximo)  this.botaoProximo();
    }
    void botaoNovo(){
        this.limpaDados();
        bExclui.setEnabled(false);
        bAnterior.setEnabled(false);
        bProximo.setEnabled(false);
        tCodigo.requestFocus();
    }
    public void botaoSalva(){
        vContatos.addElement(new Contato(getCodigo(), getNome(), getEndereco(), getFone(), getCelular(), getNacionalidade(), getDataNascimento(), getCpf(), getEmail(), getNumeroResidencial(), getCep(), getComplementoEndereco(), getObs(), getSexo()));
        bExclui.setEnabled(true);
        bAnterior.setEnabled(true);
        bProximo.setEnabled(true);
    }
    void botaoExclui(){
        if (!vContatos.isEmpty())
            vContatos.removeElementAt(posicao);
    }
    void botaoAnterior(){
        if (!vContatos.isEmpty()){
            bProximo.setEnabled(true);
            --posicao;
            if (posicao <=0){
                posicao=0;
                bAnterior.setEnabled(false);
            }
            this.obterDadosContatos(posicao);
        }
    }
    void botaoProximo(){
        if (!vContatos.isEmpty()){
            bAnterior.setEnabled(true);
            ++posicao;
            if (posicao >= vContatos.size()-1){
                posicao = vContatos.size()-1;
                bProximo.setEnabled(false);
            }
            this.obterDadosContatos(posicao);
        }
    }
    public void limpaDados(){
        this.setCodigo("");
        this.setNome("");
        this.setEndereco("");
        this.setFone("");
        this.setCelular("");
        this.setNacionalidade("");
        this.setDataNascimento("");
        this.setCpf("");
        this.setEmail("");
        this.setNumeroResidencial("");
        this.setCep("");
        this.setComplementoEndereco("");
        this.setObs("");
    }
    public void obterDadosContatos(int pos){
        Contato contatoAtual = (Contato) vContatos.elementAt(pos);
        this.setCodigo(contatoAtual.getCodigo());
        this.setNome(contatoAtual.getNome());
        this.setEndereco(contatoAtual.getEndereco());
        this.setFone(contatoAtual.getFone());
        this.setCelular(contatoAtual.getCelular());
        this.setNacionalidade(contatoAtual.getNacionalidade());
        this.setDataNascimento(contatoAtual.getDataNascimento());
        this.setCpf(contatoAtual.getCpf());
        this.setEmail(contatoAtual.getEmail());
        this.setNumeroResidencial(contatoAtual.getNumeroResidencial());
        this.setCep(contatoAtual.getCep());
        this.setComplementoEndereco(contatoAtual.getComplementoEndereco());
        this.setObs(contatoAtual.getObs());
    }
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
    public void mostraAgenda(){
        janela.setVisible(true);
    }
    public static void main (String [] args){
        Agenda agenda = new Agenda();
        agenda.mostraAgenda();
    }

}
