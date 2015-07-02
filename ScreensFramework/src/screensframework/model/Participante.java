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

    public IntegerProperty getCodFIchaInscricao() {
        return codFIchaInscricao;
    }

    public void setCodFIchaInscricao(IntegerProperty codFIchaInscricao) {
        this.codFIchaInscricao = codFIchaInscricao;
    }

    public IntegerProperty getNumCOMEERJ() {
        return numCOMEERJ;
    }

    public void setNumCOMEERJ(IntegerProperty numCOMEERJ) {
        this.numCOMEERJ = numCOMEERJ;
    }

    public IntegerProperty getNumFichaInscricao() {
        return numFichaInscricao;
    }

    public void setNumFichaInscricao(IntegerProperty numFichaInscricao) {
        this.numFichaInscricao = numFichaInscricao;
    }

    public StringProperty getDscTipoParicipacao() {
        return dscTipoParicipacao;
    }

    public void setDscTipoParicipacao(StringProperty dscTipoParicipacao) {
        this.dscTipoParicipacao = dscTipoParicipacao;
    }

    public StringProperty getDscTipoComissao() {
        return dscTipoComissao;
    }

    public void setDscTipoComissao(StringProperty dscTipoComissao) {
        this.dscTipoComissao = dscTipoComissao;
    }

    public ObjectProperty<LocalDate> getDatNascimento() {
        return datNascimento;
    }

    public void setDatNascimento(ObjectProperty<LocalDate> datNascimento) {
        this.datNascimento = datNascimento;
    }

    public StringProperty getDscProfissao() {
        return dscProfissao;
    }

    public void setDscProfissao(StringProperty dscProfissao) {
        this.dscProfissao = dscProfissao;
    }

    public StringProperty getCodOpcao1Polo() {
        return codOpcao1Polo;
    }

    public void setCodOpcao1Polo(StringProperty codOpcao1Polo) {
        this.codOpcao1Polo = codOpcao1Polo;
    }

    public StringProperty getCodOpcao2Polo() {
        return codOpcao2Polo;
    }

    public void setCodOpcao2Polo(StringProperty codOpcao2Polo) {
        this.codOpcao2Polo = codOpcao2Polo;
    }

    public StringProperty getNomCompleto() {
        return nomCompleto;
    }

    public void setNomCompleto(StringProperty nomCompleto) {
        this.nomCompleto = nomCompleto;
    }

    public StringProperty getCodSexo() {
        return codSexo;
    }

    public void setCodSexo(StringProperty codSexo) {
        this.codSexo = codSexo;
    }

    public StringProperty getNomCracha() {
        return nomCracha;
    }

    public void setNomCracha(StringProperty nomCracha) {
        this.nomCracha = nomCracha;
    }

    public StringProperty getDscEmail() {
        return dscEmail;
    }

    public void setDscEmail(StringProperty dscEmail) {
        this.dscEmail = dscEmail;
    }

    public StringProperty getIndoutraCOMEERJ() {
        return indoutraCOMEERJ;
    }

    public void setIndoutraCOMEERJ(StringProperty indoutraCOMEERJ) {
        this.indoutraCOMEERJ = indoutraCOMEERJ;
    }

    public IntegerProperty getQtdOutraCOMEERJ() {
        return qtdOutraCOMEERJ;
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
