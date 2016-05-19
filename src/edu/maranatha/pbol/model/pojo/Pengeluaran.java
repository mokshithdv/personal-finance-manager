package edu.maranatha.pbol.model.pojo;
// Generated May 12, 2016 9:02:47 AM by Hibernate Tools 3.6.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pengeluaran generated by hbm2java
 */
@Entity
@Table(name = "pengeluaran", catalog = "moneymanager")
public class Pengeluaran implements java.io.Serializable {

    private Integer idpengeluaran;
    private User user;
    private int nominal;
    private Date tanggalpengeluaran;
    private String keterangan;
    private String status;

    public Pengeluaran() {
    }

    public Pengeluaran(User user, int nominal, Date tanggalpengeluaran, String keterangan, String status) {
        this.user = user;
        this.nominal = nominal;
        this.tanggalpengeluaran = tanggalpengeluaran;
        this.keterangan = keterangan;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "idpengeluaran", unique = true, nullable = false)
    public Integer getIdpengeluaran() {
        return this.idpengeluaran;
    }

    public void setIdpengeluaran(Integer idpengeluaran) {
        this.idpengeluaran = idpengeluaran;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iduser", nullable = false)
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column(name = "nominal", nullable = false)
    public int getNominal() {
        return this.nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "tanggalpengeluaran", nullable = false, length = 19)
    public Date getTanggalpengeluaran() {
        return this.tanggalpengeluaran;
    }

    public void setTanggalpengeluaran(Date tanggalpengeluaran) {
        this.tanggalpengeluaran = tanggalpengeluaran;
    }

    @Column(name = "keterangan", nullable = false, length = 65535)
    public String getKeterangan() {
        return this.keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    @Column(name = "status", nullable = false, length = 40)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
