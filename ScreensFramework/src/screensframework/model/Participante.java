/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screensframework.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author floriano.peixoto
 */
public class Participante {

    private IntegerProperty codFIchaInscricao;//0
    private IntegerProperty numCOMEERJ;
    private IntegerProperty numFichaInscricao;
    private StringProperty dscTipoParicipacao;
    private StringProperty dscTipoComissao;
    private ObjectProperty<LocalDate> datNascimento;
    private StringProperty dscProfissao;
    private StringProperty codOpcao1Polo;
    private StringProperty codOpcao2Polo;
    private StringProperty nomCompleto;
    private StringProperty codSexo;
    private StringProperty nomCracha;//11

    private StringProperty dscEmail;//24
    private StringProperty indoutraCOMEERJ;
    private IntegerProperty qtdOutraCOMEERJ;//26

    public Participante() {
    }

    public Participante(String[] dados) {
        this.codFIchaInscricao = new SimpleIntegerProperty(Integer.valueOf(dados[0]));
        this.numCOMEERJ = new SimpleIntegerProperty(Integer.valueOf(dados[1]));
        this.numFichaInscricao = new SimpleIntegerProperty(Integer.valueOf(dados[2]));
        this.dscTipoParicipacao = new SimpleStringProperty(dados[3]);
        this.dscTipoComissao = new SimpleStringProperty(dados[4]);
        this.datNascimento = "00/00/0000".equalsIgnoreCase(dados[5]) ? new SimpleObjectProperty<>(LocalDate.MIN) : new SimpleObjectProperty<>(LocalDate.parse(dados[5], DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        this.dscProfissao = new SimpleStringProperty(dados[6]);
        this.codOpcao1Polo = new SimpleStringProperty(dados[7]);
        this.codOpcao2Polo = new SimpleStringProperty(dados[8]);
        this.nomCompleto = new SimpleStringProperty(dados[9]);
        this.codSexo = new SimpleStringProperty(dados[10]);
        this.nomCracha = new SimpleStringProperty(dados[11]);
        this.dscEmail = new SimpleStringProperty(dados[24]);
        this.indoutraCOMEERJ = new SimpleStringProperty(dados[25]);
        this.qtdOutraCOMEERJ = new SimpleIntegerProperty(Integer.valueOf(dados[26]));
    }

    public Integer getCodFIchaInscricao() {
        return codFIchaInscricao.get();
    }

    public void setCodFIchaInscricao(Integer codFIchaInscricao) {
        this.codFIchaInscricao.set(codFIchaInscricao);
    }
    
    public IntegerProperty codFIchaInscricao() {
        return codFIchaInscricao;
    }

    public Integer getNumCOMEERJ() {
        return numCOMEERJ.get();
    }

    public void setNumCOMEERJ(IntegerProperty numCOMEERJ) {
        this.numCOMEERJ = numCOMEERJ;
    }

    public Integer getNumFichaInscricao() {
        return numFichaInscricao.get();
    }

    public void setNumFichaInscricao(IntegerProperty numFichaInscricao) {
        this.numFichaInscricao = numFichaInscricao;
    }

    public String getDscTipoParicipacao() {
        return dscTipoParicipacao.get();
    }

    public void setDscTipoParicipacao(StringProperty dscTipoParicipacao) {
        this.dscTipoParicipacao = dscTipoParicipacao;
    }

    public String getDscTipoComissao() {
        return dscTipoComissao.get();
    }

    public void setDscTipoComissao(StringProperty dscTipoComissao) {
        this.dscTipoComissao = dscTipoComissao;
    }

    public LocalDate getDatNascimento() {
        return datNascimento.get();
    }

    public void setDatNascimento(ObjectProperty<LocalDate> datNascimento) {
        this.datNascimento = datNascimento;
    }

    public String getDscProfissao() {
        return dscProfissao.get();
    }

    public void setDscProfissao(StringProperty dscProfissao) {
        this.dscProfissao = dscProfissao;
    }

    public String getCodOpcao1Polo() {
        return codOpcao1Polo.get();
    }

    public void setCodOpcao1Polo(StringProperty codOpcao1Polo) {
        this.codOpcao1Polo = codOpcao1Polo;
    }

    public String getCodOpcao2Polo() {
        return codOpcao2Polo.get();
    }

    public void setCodOpcao2Polo(StringProperty codOpcao2Polo) {
        this.codOpcao2Polo = codOpcao2Polo;
    }

    public String getNomCompleto() {
        return nomCompleto.get();
    }

    public void setNomCompleto(StringProperty nomCompleto) {
        this.nomCompleto = nomCompleto;
    }

    public String getCodSexo() {
        return codSexo.get();
    }

    public void setCodSexo(StringProperty codSexo) {
        this.codSexo = codSexo;
    }

    public String getNomCracha() {
        return nomCracha.get();
    }

    public void setNomCracha(StringProperty nomCracha) {
        this.nomCracha = nomCracha;
    }

    public String getDscEmail() {
        return dscEmail.get();
    }

    public void setDscEmail(StringProperty dscEmail) {
        this.dscEmail = dscEmail;
    }

    public String getIndoutraCOMEERJ() {
        return indoutraCOMEERJ.get();
    }

    public void setIndoutraCOMEERJ(StringProperty indoutraCOMEERJ) {
        this.indoutraCOMEERJ = indoutraCOMEERJ;
    }

    public Integer getQtdOutraCOMEERJ() {
        return qtdOutraCOMEERJ.get();
    }

    public void setQtdOutraCOMEERJ(IntegerProperty qtdOutraCOMEERJ) {
        this.qtdOutraCOMEERJ = qtdOutraCOMEERJ;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.codFIchaInscricao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Participante other = (Participante) obj;
        if (!Objects.equals(this.codFIchaInscricao, other.codFIchaInscricao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Participante{" + "codFIchaInscricao=" + codFIchaInscricao + ", numCOMEERJ=" + numCOMEERJ + ", numFichaInscricao=" + numFichaInscricao + ", dscTipoParicipacao=" + dscTipoParicipacao + ", dscTipoComissao=" + dscTipoComissao + ", datNascimento=" + datNascimento + ", dscProfissao=" + dscProfissao + ", codOpcao1Polo=" + codOpcao1Polo + ", codOpcao2Polo=" + codOpcao2Polo + ", nomCompleto=" + nomCompleto + ", codSexo=" + codSexo + ", nomCracha=" + nomCracha + ", dscEmail=" + dscEmail + ", indoutraCOMEERJ=" + indoutraCOMEERJ + ", qtdOutraCOMEERJ=" + qtdOutraCOMEERJ + '}';
    }

}
