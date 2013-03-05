package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import model.Person;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;


/**
 * The persistent class for the PDATA database table.
 * 
 */
@Entity
public class Pdata implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long pid;

	@Column(name="A_NDOM")
	private String aNdom;

	@Column(name="A_NKV")
	private String aNkv;

	@Column(name="A_OBL")
	private String aObl;

	@Column(name="A_RAJON")
	private String aRajon;

	@Column(name="A_TNP")
	private String aTnp;

	@Column(name="A_TOWN")
	private String aTown;

	@Column(name="A_TUL")
	private String aTul;

	@Column(name="A_UL")
	private String aUl;

	private String bank;

	@Column(name="BANK_ACC")
	private String bankAcc;

	private String mestorogd;

	private String obrazov;

	@Temporal(TemporalType.DATE)
	@Column(name="PASP_DATEV")
	private Date paspDatev;

	@Column(name="PASP_KEMV")
	private String paspKemv;

	@Column(name="PASP_NOM")
	private String paspNom;

	@Column(name="PASP_SER")
	private String paspSer;

	private String phone;

	private String pidcod;

	private String pol;

	@Column(name="POST_IND")
	private String postInd;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Person person;

	public Pdata() {
	}

	public long getPid() {
		return this.pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public String getANdom() {
		return this.aNdom;
	}

	public void setANdom(String aNdom) {
		this.aNdom = aNdom;
	}

	public String getANkv() {
		return this.aNkv;
	}

	public void setANkv(String aNkv) {
		this.aNkv = aNkv;
	}

	public String getAObl() {
		return this.aObl;
	}

	public void setAObl(String aObl) {
		this.aObl = aObl;
	}

	public String getARajon() {
		return this.aRajon;
	}

	public void setARajon(String aRajon) {
		this.aRajon = aRajon;
	}

	public String getATnp() {
		return this.aTnp;
	}

	public void setATnp(String aTnp) {
		this.aTnp = aTnp;
	}

	public String getATown() {
		return this.aTown;
	}

	public void setATown(String aTown) {
		this.aTown = aTown;
	}

	public String getATul() {
		return this.aTul;
	}

	public void setATul(String aTul) {
		this.aTul = aTul;
	}

	public String getAUl() {
		return this.aUl;
	}

	public void setAUl(String aUl) {
		this.aUl = aUl;
	}

	public String getBank() {
		return this.bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBankAcc() {
		return this.bankAcc;
	}

	public void setBankAcc(String bankAcc) {
		this.bankAcc = bankAcc;
	}

	public String getMestorogd() {
		return this.mestorogd;
	}

	public void setMestorogd(String mestorogd) {
		this.mestorogd = mestorogd;
	}

	public String getObrazov() {
		return this.obrazov;
	}

	public void setObrazov(String obrazov) {
		this.obrazov = obrazov;
	}

	public Date getPaspDatev() {
		return this.paspDatev;
	}

	public void setPaspDatev(Date paspDatev) {
		this.paspDatev = paspDatev;
	}

	public String getPaspKemv() {
		return this.paspKemv;
	}

	public void setPaspKemv(String paspKemv) {
		this.paspKemv = paspKemv;
	}

	public String getPaspNom() {
		return this.paspNom;
	}

	public void setPaspNom(String paspNom) {
		this.paspNom = paspNom;
	}

	public String getPaspSer() {
		return this.paspSer;
	}

	public void setPaspSer(String paspSer) {
		this.paspSer = paspSer;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPidcod() {
		return this.pidcod;
	}

	public void setPidcod(String pidcod) {
		this.pidcod = pidcod;
	}

	public String getPol() {
		return this.pol;
	}

	public void setPol(String pol) {
		this.pol = pol;
	}

	public String getPostInd() {
		return this.postInd;
	}

	public void setPostInd(String postInd) {
		this.postInd = postInd;
	}

	public Person getPerson() {
	    return person;
	}

	public void setPerson(Person param) {
	    this.person = param;
	}

}