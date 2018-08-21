/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.top.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Andres
 */
@Entity
@Table(name = "carros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carros.findAll", query = "SELECT c FROM Carros c")
    , @NamedQuery(name = "Carros.findByMatricula", query = "SELECT c FROM Carros c WHERE c.matricula = :matricula")
    , @NamedQuery(name = "Carros.findByMarca", query = "SELECT c FROM Carros c WHERE c.marca = :marca")
    , @NamedQuery(name = "Carros.findByModelo", query = "SELECT c FROM Carros c WHERE c.modelo = :modelo")
    , @NamedQuery(name = "Carros.findByA\u00f1o", query = "SELECT c FROM Carros c WHERE c.a\u00f1o = :a\u00f1o")
    , @NamedQuery(name = "Carros.findByValor", query = "SELECT c FROM Carros c WHERE c.valor = :valor")
    , @NamedQuery(name = "Carros.findByCaracteristica", query = "SELECT c FROM Carros c WHERE c.caracteristica = :caracteristica")})
public class Carros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "matricula")
    private String matricula;
    @Size(max = 20)
    @Column(name = "marca")
    private String marca;
    @Size(max = 20)
    @Column(name = "modelo")
    private String modelo;
    @Size(max = 20)
    @Column(name = "a\u00f1o")
    private String año;
    @Column(name = "valor")
    private Integer valor;
    @Lob
    @Column(name = "foto")
    private byte[] foto;
    @Size(max = 20)
    @Column(name = "caracteristica")
    private String caracteristica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "matricula")
    private Collection<Ventas> ventasCollection;

    public Carros() {
    }

    public Carros(String matricula, String marca, String modelo, String año, Integer valor, byte[] foto, String caracteristica) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.valor = valor;
        this.foto = foto;
        this.caracteristica = caracteristica;
    }

    public Carros(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @XmlTransient
    public Collection<Ventas> getVentasCollection() {
        return ventasCollection;
    }

    public void setVentasCollection(Collection<Ventas> ventasCollection) {
        this.ventasCollection = ventasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matricula != null ? matricula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carros)) {
            return false;
        }
        Carros other = (Carros) object;
        if ((this.matricula == null && other.matricula != null) || (this.matricula != null && !this.matricula.equals(other.matricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.top.entity.Carros[ matricula=" + matricula + " ]";
    }
    
}
