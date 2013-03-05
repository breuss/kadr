package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NAZNACH database table.
 * 
 */
@Entity
public class Naznach implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private int cex;

	private int classn;

	@Temporal(TemporalType.DATE)
	private Date datnaz;

	private int kat;

	private int prof;

	private boolean sovm;

	private int uch;

	//bi-directional many-to-one association to Priem
	@ManyToOne
	@JoinColumn(name="ID_PRIEM")
	private Priem priem;

	//bi-directional many-to-one association to Oplata
	@OneToMany(mappedBy="naznach")
	private List<Oplata> oplatas;

	public Naznach() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCex() {
		return this.cex;
	}

	public void setCex(int cex) {
		this.cex = cex;
	}

	public int getClassn() {
		return this.classn;
	}

	public void setClassn(int classn) {
		this.classn = classn;
	}

	public Date getDatnaz() {
		return this.datnaz;
	}

	public void setDatnaz(Date datnaz) {
		this.datnaz = datnaz;
	}

	public int getKat() {
		return this.kat;
	}

	public void setKat(int kat) {
		this.kat = kat;
	}

	public int getProf() {
		return this.prof;
	}

	public void setProf(int prof) {
		this.prof = prof;
	}

	public boolean getSovm() {
		return this.sovm;
	}

	public void setSovm(boolean sovm) {
		this.sovm = sovm;
	}

	public int getUch() {
		return this.uch;
	}

	public void setUch(int uch) {
		this.uch = uch;
	}

	public Priem getPriem() {
		return this.priem;
	}

	public void setPriem(Priem priem) {
		this.priem = priem;
	}

	public List<Oplata> getOplatas() {
		return this.oplatas;
	}

	public void setOplatas(List<Oplata> oplatas) {
		this.oplatas = oplatas;
	}

}