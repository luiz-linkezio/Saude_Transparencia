package com.jr.saudeapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Gasto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String ano;
    private String mes;
    private String uf;
    private String regiao;
    private String ugResponsavel;
    private String funcional;
    private String funcao;
    private String subfuncao;
    private String programa;
    private String acao;
    private String esfera;
    private String categoriaEconomica;
    private String gnd;
    private String modAplicacao;
    private String empenho;
    private String observacao;
    private String empAnoEmissao;
    private String empenhado;
    private String liquidado;
    private String pago;
    private String rpPago;
    private String despesaExecutada;

    public Gasto() {
    }

    public Gasto(String ano, String mes, String uf, String regiao, String ugResponsavel, String funcional, String funcao, String subfuncao, String programa, String acao, String esfera, String categoriaEconomica, String gnd, String modAplicacao, String empenho, String observacao, String empAnoEmissao, String empenhado, String liquidado, String pago, String rpPago, String despesaExecutada) {
        this.ano = ano;
        this.mes = mes;
        this.uf = uf;
        this.regiao = regiao;
        this.ugResponsavel = ugResponsavel;
        this.funcional = funcional;
        this.funcao = funcao;
        this.subfuncao = subfuncao;
        this.programa = programa;
        this.acao = acao;
        this.esfera = esfera;
        this.categoriaEconomica = categoriaEconomica;
        this.gnd = gnd;
        this.modAplicacao = modAplicacao;
        this.empenho = empenho;
        this.observacao = observacao;
        this.empAnoEmissao = empAnoEmissao;
        this.empenhado = empenhado;
        this.liquidado = liquidado;
        this.pago = pago;
        this.rpPago = rpPago;
        this.despesaExecutada = despesaExecutada;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getUgResponsavel() {
        return ugResponsavel;
    }

    public void setUgResponsavel(String ugResponsavel) {
        this.ugResponsavel = ugResponsavel;
    }

    public String getFuncional() {
        return funcional;
    }

    public void setFuncional(String funcional) {
        this.funcional = funcional;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSubfuncao() {
        return subfuncao;
    }

    public void setSubfuncao(String subfuncao) {
        this.subfuncao = subfuncao;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getEsfera() {
        return esfera;
    }

    public void setEsfera(String esfera) {
        this.esfera = esfera;
    }

    public String getCategoriaEconomica() {
        return categoriaEconomica;
    }

    public void setCategoriaEconomica(String categoriaEconomica) {
        this.categoriaEconomica = categoriaEconomica;
    }

    public String getGnd() {
        return gnd;
    }

    public void setGnd(String gnd) {
        this.gnd = gnd;
    }

    public String getModAplicacao() {
        return modAplicacao;
    }

    public void setModAplicacao(String modAplicacao) {
        this.modAplicacao = modAplicacao;
    }

    public String getEmpenho() {
        return empenho;
    }

    public void setEmpenho(String empenho) {
        this.empenho = empenho;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getEmpAnoEmissao() {
        return empAnoEmissao;
    }

    public void setEmpAnoEmissao(String empAnoEmissao) {
        this.empAnoEmissao = empAnoEmissao;
    }

    public String getEmpenhado() {
        return empenhado;
    }

    public void setEmpenhado(String empenhado) {
        this.empenhado = empenhado;
    }

    public String getLiquidado() {
        return liquidado;
    }

    public void setLiquidado(String liquidado) {
        this.liquidado = liquidado;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public String getRpPago() {
        return rpPago;
    }

    public void setRpPago(String rpPago) {
        this.rpPago = rpPago;
    }

    public String getDespesaExecutada() {
        return despesaExecutada;
    }

    public void setDespesaExecutada(String despesaExecutada) {
        this.despesaExecutada = despesaExecutada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gasto gasto = (Gasto) o;
        return id == gasto.id && Objects.equals(ano, gasto.ano) && Objects.equals(mes, gasto.mes) && Objects.equals(uf, gasto.uf) && Objects.equals(regiao, gasto.regiao) && Objects.equals(ugResponsavel, gasto.ugResponsavel) && Objects.equals(funcional, gasto.funcional) && Objects.equals(funcao, gasto.funcao) && Objects.equals(subfuncao, gasto.subfuncao) && Objects.equals(programa, gasto.programa) && Objects.equals(acao, gasto.acao) && Objects.equals(esfera, gasto.esfera) && Objects.equals(categoriaEconomica, gasto.categoriaEconomica) && Objects.equals(gnd, gasto.gnd) && Objects.equals(modAplicacao, gasto.modAplicacao) && Objects.equals(empenho, gasto.empenho) && Objects.equals(observacao, gasto.observacao) && Objects.equals(empAnoEmissao, gasto.empAnoEmissao) && Objects.equals(empenhado, gasto.empenhado) && Objects.equals(liquidado, gasto.liquidado) && Objects.equals(pago, gasto.pago) && Objects.equals(rpPago, gasto.rpPago) && Objects.equals(despesaExecutada, gasto.despesaExecutada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ano, mes, uf, regiao, ugResponsavel, funcional, funcao, subfuncao, programa, acao, esfera, categoriaEconomica, gnd, modAplicacao, empenho, observacao, empAnoEmissao, empenhado, liquidado, pago, rpPago, despesaExecutada);
    }
}
