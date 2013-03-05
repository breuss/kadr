package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the PRIEM database table.
 * 
 */
@Entity
public class Priem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Temporal(TemporalType.DATE)
	private Date datnstag;

	@Temporal(TemporalType.DATE)
	private Date datostag;

	@Temporal(TemporalType.DATE)
	private Date datp;

	@Temporal(TemporalType.DATE)
	private Date datuv;

	private String prfs;

	private int pruv;

	private String tn;

	private int uslpr;

	//bi-directional many-to-one association to Naznach
	@OneToMany(mappedBy="priem")
	private List<Naznach> naznaches;

	//bi-directional many-to-one association to Person
	@ManyToOne
	@JoinColumn(name="PID")
	private Person person;

	public Priem() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDatnstag() {
		return this.datnstag;
	}

	public void setDatnstag(Date datnstag) {
		this.datnstag = datnstag;
	}

	public Date getDatostag() {
		return this.datostag;
	}

	public void setDatostag(Date datostag) {
		this.datostag = datostag;
	}

	public Date getDatp() {
		return this.datp;
	}

	public void setDatp(Date datp) {
		this.datp = datp;
	}

	public Date getDatuv() {
		return this.datuv;
	}

	public void setDatuv(Date datuv) {
		this.datuv = datuv;
	}

	public String getPrfs() {
		return this.prfs;
	}

	public void setPrfs(String prfs) {
		this.prfs = prfs;
	}

	public int getPruv() {
		return this.pruv;
	}

	public void setPruv(int pruv) {
		this.pruv = pruv;
	}

	public String getTn() {
		return this.tn;
	}

	public void setTn(String tn) {
		this.tn = tn;
	}

	public int getUslpr() {
		return this.uslpr;
	}

	public void setUslpr(int uslpr) {
		this.uslpr = uslpr;
	}

	public List<Naznach> getNaznaches() {
		return this.naznaches;
	}

	public void setNaznaches(List<Naznach> naznaches) {
		this.naznaches = naznaches;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}