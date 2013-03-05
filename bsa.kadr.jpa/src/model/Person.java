package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the PERSON database table.
 * 
 */
@Entity
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long pid;

	@Temporal(TemporalType.DATE)
	private Date datar;

	private String fam;

	private String im;

	private String ot;

	//bi-directional many-to-one association to Priem
	@OneToMany(mappedBy="person")
	private List<Priem> priems;

	public Person() {
	}

	public long getPid() {
		return this.pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public Date getDatar() {
		return this.datar;
	}

	public void setDatar(Date datar) {
		this.datar = datar;
	}

	public String getFam() {
		return this.fam;
	}

	public void setFam(String fam) {
		this.fam = fam;
	}

	public String getIm() {
		return this.im;
	}

	public void setIm(String im) {
		this.im = im;
	}

	public String getOt() {
		return this.ot;
	}

	public void setOt(String ot) {
		this.ot = ot;
	}

	public List<Priem> getPriems() {
		return this.priems;
	}

	public void setPriems(List<Priem> priems) {
		this.priems = priems;
	}

}