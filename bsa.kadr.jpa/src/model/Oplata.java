package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the OPLATA database table.
 * 
 */
@Entity
public class Oplata implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Temporal(TemporalType.DATE)
	private Date datkno;

	@Temporal(TemporalType.DATE)
	private Date datso;

	private String kno;

	private double nadb;

	private int so;

	private double tso;

	private String zancnt;

	private String zcnt;

	//bi-directional many-to-one association to Naznach
	@ManyToOne
	@JoinColumn(name="ID_NAZNACH")
	private Naznach naznach;

	public Oplata() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDatkno() {
		return this.datkno;
	}

	public void setDatkno(Date datkno) {
		this.datkno = datkno;
	}

	public Date getDatso() {
		return this.datso;
	}

	public void setDatso(Date datso) {
		this.datso = datso;
	}

	public String getKno() {
		return this.kno;
	}

	public void setKno(String kno) {
		this.kno = kno;
	}

	public double getNadb() {
		return this.nadb;
	}

	public void setNadb(double nadb) {
		this.nadb = nadb;
	}

	public int getSo() {
		return this.so;
	}

	public void setSo(int so) {
		this.so = so;
	}

	public double getTso() {
		return this.tso;
	}

	public void setTso(double tso) {
		this.tso = tso;
	}

	public String getZancnt() {
		return this.zancnt;
	}

	public void setZancnt(String zancnt) {
		this.zancnt = zancnt;
	}

	public String getZcnt() {
		return this.zcnt;
	}

	public void setZcnt(String zcnt) {
		this.zcnt = zcnt;
	}

	public Naznach getNaznach() {
		return this.naznach;
	}

	public void setNaznach(Naznach naznach) {
		this.naznach = naznach;
	}

}