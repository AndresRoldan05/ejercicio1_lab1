/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.top.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Andres
 */
@Entity
@Table(name = "ventas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ventas.findAll", query = "SELECT v FROM Ventas v")
    , @NamedQuery(name = "Ventas.findByIDventa", query = "SELECT v FROM Ventas v WHERE v.iDventa = :iDventa")
    , @NamedQuery(name = "Ventas.findByFecha", query = "SELECT v FROM Ventas v WHERE v.fecha = :fecha")})
public class Ventas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_venta")
    private Integer iDventa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "fecha")
    private String fecha;
    @JoinColumn(name = "matricula", referencedColumnName = "matricula")
    @ManyToOne(optional = false)
    private Carros matricula;
    @JoinColumn(name = "propietario", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Clientes propietario;
    @JoinColumn(name = "total", referencedColumnName = "total")
    @ManyToOne(optional = false)
    private Integer total;

    public Ventas() {
    }

    public Ventas(Integer iDventa, String fecha, Carros matricula, Clientes propietario, Integer total) {
        this.iDventa = iDventa;
        this.fecha = fecha;
        this.matricula = matricula;
        this.propietario = propietario;
        this.total = total;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Ventas(Integer iDventa) {
        this.iDventa = iDventa;
    }

    public Ventas(Integer iDventa, String fecha) {
        this.iDventa = iDventa;
        this.fecha = fecha;
    }

    public Integer getIDventa() {
        return iDventa;
    }

    public void setIDventa(Integer iDventa) {
        this.iDventa = iDventa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Carros getMatricula() {
        return matricula;
    }

    public void setMatricula(Carros matricula) {
        this.matricula = matricula;
    }

    public Clientes getPropietario() {
        return propietario;
    }

    public void setPropietario(Clientes propietario) {
        this.propietario = propietario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDventa != null ? iDventa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ventas)) {
            return false;
        }
        Ventas other = (Ventas) object;
        if ((this.iDventa == null && other.iDventa != null) || (this.iDventa != null && !this.iDventa.equals(other.iDventa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.top.entity.Ventas[ iDventa=" + iDventa + " ]";
    }
    
}
