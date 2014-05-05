/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "ACMMM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Acmmm.findAll", query = "SELECT a FROM Acmmm a"),
    @NamedQuery(name = "Acmmm.findByCompany", query = "SELECT a FROM Acmmm a WHERE a.company = :company"),
    @NamedQuery(name = "Acmmm.findByCreator", query = "SELECT a FROM Acmmm a WHERE a.creator = :creator"),
    @NamedQuery(name = "Acmmm.findByUsrGroup", query = "SELECT a FROM Acmmm a WHERE a.usrGroup = :usrGroup"),
    @NamedQuery(name = "Acmmm.findByCreateDate", query = "SELECT a FROM Acmmm a WHERE a.createDate = :createDate"),
    @NamedQuery(name = "Acmmm.findByModifier", query = "SELECT a FROM Acmmm a WHERE a.modifier = :modifier"),
    @NamedQuery(name = "Acmmm.findByModiDate", query = "SELECT a FROM Acmmm a WHERE a.modiDate = :modiDate"),
    @NamedQuery(name = "Acmmm.findByFlag", query = "SELECT a FROM Acmmm a WHERE a.flag = :flag"),
    @NamedQuery(name = "Acmmm.findByMm001", query = "SELECT a FROM Acmmm a WHERE a.acmmmPK.mm001 = :mm001"),
    @NamedQuery(name = "Acmmm.findByMm002", query = "SELECT a FROM Acmmm a WHERE a.acmmmPK.mm002 = :mm002"),
    @NamedQuery(name = "Acmmm.findByMm003", query = "SELECT a FROM Acmmm a WHERE a.mm003 = :mm003"),
    @NamedQuery(name = "Acmmm.findByMm008", query = "SELECT a FROM Acmmm a WHERE a.mm008 = :mm008"),
    @NamedQuery(name = "Acmmm.findByMm009", query = "SELECT a FROM Acmmm a WHERE a.mm009 = :mm009"),
    @NamedQuery(name = "Acmmm.findByMm010", query = "SELECT a FROM Acmmm a WHERE a.mm010 = :mm010"),
    @NamedQuery(name = "Acmmm.findByMm011", query = "SELECT a FROM Acmmm a WHERE a.mm011 = :mm011"),
    @NamedQuery(name = "Acmmm.findByMm012", query = "SELECT a FROM Acmmm a WHERE a.mm012 = :mm012"),
    @NamedQuery(name = "Acmmm.findByMm013", query = "SELECT a FROM Acmmm a WHERE a.mm013 = :mm013"),
    @NamedQuery(name = "Acmmm.findByMm014", query = "SELECT a FROM Acmmm a WHERE a.mm014 = :mm014"),
    @NamedQuery(name = "Acmmm.findByUdf01", query = "SELECT a FROM Acmmm a WHERE a.udf01 = :udf01"),
    @NamedQuery(name = "Acmmm.findByUdf02", query = "SELECT a FROM Acmmm a WHERE a.udf02 = :udf02"),
    @NamedQuery(name = "Acmmm.findByUdf03", query = "SELECT a FROM Acmmm a WHERE a.udf03 = :udf03"),
    @NamedQuery(name = "Acmmm.findByUdf04", query = "SELECT a FROM Acmmm a WHERE a.udf04 = :udf04"),
    @NamedQuery(name = "Acmmm.findByUdf05", query = "SELECT a FROM Acmmm a WHERE a.udf05 = :udf05"),
    @NamedQuery(name = "Acmmm.findByUdf06", query = "SELECT a FROM Acmmm a WHERE a.udf06 = :udf06"),
    @NamedQuery(name = "Acmmm.findByUdf51", query = "SELECT a FROM Acmmm a WHERE a.udf51 = :udf51"),
    @NamedQuery(name = "Acmmm.findByUdf52", query = "SELECT a FROM Acmmm a WHERE a.udf52 = :udf52"),
    @NamedQuery(name = "Acmmm.findByUdf53", query = "SELECT a FROM Acmmm a WHERE a.udf53 = :udf53"),
    @NamedQuery(name = "Acmmm.findByUdf54", query = "SELECT a FROM Acmmm a WHERE a.udf54 = :udf54"),
    @NamedQuery(name = "Acmmm.findByUdf55", query = "SELECT a FROM Acmmm a WHERE a.udf55 = :udf55"),
    @NamedQuery(name = "Acmmm.findByUdf56", query = "SELECT a FROM Acmmm a WHERE a.udf56 = :udf56"),
    @NamedQuery(name = "Acmmm.findByUdf07", query = "SELECT a FROM Acmmm a WHERE a.udf07 = :udf07"),
    @NamedQuery(name = "Acmmm.findByUdf08", query = "SELECT a FROM Acmmm a WHERE a.udf08 = :udf08"),
    @NamedQuery(name = "Acmmm.findByUdf09", query = "SELECT a FROM Acmmm a WHERE a.udf09 = :udf09"),
    @NamedQuery(name = "Acmmm.findByUdf10", query = "SELECT a FROM Acmmm a WHERE a.udf10 = :udf10"),
    @NamedQuery(name = "Acmmm.findByUdf11", query = "SELECT a FROM Acmmm a WHERE a.udf11 = :udf11"),
    @NamedQuery(name = "Acmmm.findByUdf12", query = "SELECT a FROM Acmmm a WHERE a.udf12 = :udf12"),
    @NamedQuery(name = "Acmmm.findByUdf57", query = "SELECT a FROM Acmmm a WHERE a.udf57 = :udf57"),
    @NamedQuery(name = "Acmmm.findByUdf58", query = "SELECT a FROM Acmmm a WHERE a.udf58 = :udf58"),
    @NamedQuery(name = "Acmmm.findByUdf59", query = "SELECT a FROM Acmmm a WHERE a.udf59 = :udf59"),
    @NamedQuery(name = "Acmmm.findByUdf60", query = "SELECT a FROM Acmmm a WHERE a.udf60 = :udf60"),
    @NamedQuery(name = "Acmmm.findByUdf61", query = "SELECT a FROM Acmmm a WHERE a.udf61 = :udf61"),
    @NamedQuery(name = "Acmmm.findByUdf62", query = "SELECT a FROM Acmmm a WHERE a.udf62 = :udf62")})
public class Acmmm implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AcmmmPK acmmmPK;
    @Column(name = "COMPANY")
    private String company;
    @Column(name = "CREATOR")
    private String creator;
    @Column(name = "USR_GROUP")
    private String usrGroup;
    @Column(name = "CREATE_DATE")
    private String createDate;
    @Column(name = "MODIFIER")
    private String modifier;
    @Column(name = "MODI_DATE")
    private String modiDate;
    @Column(name = "FLAG")
    private Short flag;
    @Column(name = "MM003")
    private Character mm003;
    @Lob
    @Column(name = "MM004")
    private String mm004;
    @Lob
    @Column(name = "MM005")
    private String mm005;
    @Lob
    @Column(name = "MM006")
    private String mm006;
    @Lob
    @Column(name = "MM007")
    private String mm007;
    @Column(name = "MM008")
    private String mm008;
    @Column(name = "MM009")
    private Character mm009;
    @Column(name = "MM010")
    private String mm010;
    @Column(name = "MM011")
    private String mm011;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MM012")
    private BigDecimal mm012;
    @Column(name = "MM013")
    private BigDecimal mm013;
    @Column(name = "MM014")
    private BigDecimal mm014;
    @Column(name = "UDF01")
    private String udf01;
    @Column(name = "UDF02")
    private String udf02;
    @Column(name = "UDF03")
    private String udf03;
    @Column(name = "UDF04")
    private String udf04;
    @Column(name = "UDF05")
    private String udf05;
    @Column(name = "UDF06")
    private String udf06;
    @Column(name = "UDF51")
    private BigDecimal udf51;
    @Column(name = "UDF52")
    private BigDecimal udf52;
    @Column(name = "UDF53")
    private BigDecimal udf53;
    @Column(name = "UDF54")
    private BigDecimal udf54;
    @Column(name = "UDF55")
    private BigDecimal udf55;
    @Column(name = "UDF56")
    private BigDecimal udf56;
    @Column(name = "UDF07")
    private String udf07;
    @Column(name = "UDF08")
    private String udf08;
    @Column(name = "UDF09")
    private String udf09;
    @Column(name = "UDF10")
    private String udf10;
    @Column(name = "UDF11")
    private String udf11;
    @Column(name = "UDF12")
    private String udf12;
    @Column(name = "UDF57")
    private BigDecimal udf57;
    @Column(name = "UDF58")
    private BigDecimal udf58;
    @Column(name = "UDF59")
    private BigDecimal udf59;
    @Column(name = "UDF60")
    private BigDecimal udf60;
    @Column(name = "UDF61")
    private BigDecimal udf61;
    @Column(name = "UDF62")
    private BigDecimal udf62;

    public Acmmm() {
    }

    public Acmmm(AcmmmPK acmmmPK) {
        this.acmmmPK = acmmmPK;
    }

    public Acmmm(String mm001, String mm002) {
        this.acmmmPK = new AcmmmPK(mm001, mm002);
    }

    public AcmmmPK getAcmmmPK() {
        return acmmmPK;
    }

    public void setAcmmmPK(AcmmmPK acmmmPK) {
        this.acmmmPK = acmmmPK;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUsrGroup() {
        return usrGroup;
    }

    public void setUsrGroup(String usrGroup) {
        this.usrGroup = usrGroup;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getModiDate() {
        return modiDate;
    }

    public void setModiDate(String modiDate) {
        this.modiDate = modiDate;
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    public Character getMm003() {
        return mm003;
    }

    public void setMm003(Character mm003) {
        this.mm003 = mm003;
    }

    public String getMm004() {
        return mm004;
    }

    public void setMm004(String mm004) {
        this.mm004 = mm004;
    }

    public String getMm005() {
        return mm005;
    }

    public void setMm005(String mm005) {
        this.mm005 = mm005;
    }

    public String getMm006() {
        return mm006;
    }

    public void setMm006(String mm006) {
        this.mm006 = mm006;
    }

    public String getMm007() {
        return mm007;
    }

    public void setMm007(String mm007) {
        this.mm007 = mm007;
    }

    public String getMm008() {
        return mm008;
    }

    public void setMm008(String mm008) {
        this.mm008 = mm008;
    }

    public Character getMm009() {
        return mm009;
    }

    public void setMm009(Character mm009) {
        this.mm009 = mm009;
    }

    public String getMm010() {
        return mm010;
    }

    public void setMm010(String mm010) {
        this.mm010 = mm010;
    }

    public String getMm011() {
        return mm011;
    }

    public void setMm011(String mm011) {
        this.mm011 = mm011;
    }

    public BigDecimal getMm012() {
        return mm012;
    }

    public void setMm012(BigDecimal mm012) {
        this.mm012 = mm012;
    }

    public BigDecimal getMm013() {
        return mm013;
    }

    public void setMm013(BigDecimal mm013) {
        this.mm013 = mm013;
    }

    public BigDecimal getMm014() {
        return mm014;
    }

    public void setMm014(BigDecimal mm014) {
        this.mm014 = mm014;
    }

    public String getUdf01() {
        return udf01;
    }

    public void setUdf01(String udf01) {
        this.udf01 = udf01;
    }

    public String getUdf02() {
        return udf02;
    }

    public void setUdf02(String udf02) {
        this.udf02 = udf02;
    }

    public String getUdf03() {
        return udf03;
    }

    public void setUdf03(String udf03) {
        this.udf03 = udf03;
    }

    public String getUdf04() {
        return udf04;
    }

    public void setUdf04(String udf04) {
        this.udf04 = udf04;
    }

    public String getUdf05() {
        return udf05;
    }

    public void setUdf05(String udf05) {
        this.udf05 = udf05;
    }

    public String getUdf06() {
        return udf06;
    }

    public void setUdf06(String udf06) {
        this.udf06 = udf06;
    }

    public BigDecimal getUdf51() {
        return udf51;
    }

    public void setUdf51(BigDecimal udf51) {
        this.udf51 = udf51;
    }

    public BigDecimal getUdf52() {
        return udf52;
    }

    public void setUdf52(BigDecimal udf52) {
        this.udf52 = udf52;
    }

    public BigDecimal getUdf53() {
        return udf53;
    }

    public void setUdf53(BigDecimal udf53) {
        this.udf53 = udf53;
    }

    public BigDecimal getUdf54() {
        return udf54;
    }

    public void setUdf54(BigDecimal udf54) {
        this.udf54 = udf54;
    }

    public BigDecimal getUdf55() {
        return udf55;
    }

    public void setUdf55(BigDecimal udf55) {
        this.udf55 = udf55;
    }

    public BigDecimal getUdf56() {
        return udf56;
    }

    public void setUdf56(BigDecimal udf56) {
        this.udf56 = udf56;
    }

    public String getUdf07() {
        return udf07;
    }

    public void setUdf07(String udf07) {
        this.udf07 = udf07;
    }

    public String getUdf08() {
        return udf08;
    }

    public void setUdf08(String udf08) {
        this.udf08 = udf08;
    }

    public String getUdf09() {
        return udf09;
    }

    public void setUdf09(String udf09) {
        this.udf09 = udf09;
    }

    public String getUdf10() {
        return udf10;
    }

    public void setUdf10(String udf10) {
        this.udf10 = udf10;
    }

    public String getUdf11() {
        return udf11;
    }

    public void setUdf11(String udf11) {
        this.udf11 = udf11;
    }

    public String getUdf12() {
        return udf12;
    }

    public void setUdf12(String udf12) {
        this.udf12 = udf12;
    }

    public BigDecimal getUdf57() {
        return udf57;
    }

    public void setUdf57(BigDecimal udf57) {
        this.udf57 = udf57;
    }

    public BigDecimal getUdf58() {
        return udf58;
    }

    public void setUdf58(BigDecimal udf58) {
        this.udf58 = udf58;
    }

    public BigDecimal getUdf59() {
        return udf59;
    }

    public void setUdf59(BigDecimal udf59) {
        this.udf59 = udf59;
    }

    public BigDecimal getUdf60() {
        return udf60;
    }

    public void setUdf60(BigDecimal udf60) {
        this.udf60 = udf60;
    }

    public BigDecimal getUdf61() {
        return udf61;
    }

    public void setUdf61(BigDecimal udf61) {
        this.udf61 = udf61;
    }

    public BigDecimal getUdf62() {
        return udf62;
    }

    public void setUdf62(BigDecimal udf62) {
        this.udf62 = udf62;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acmmmPK != null ? acmmmPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Acmmm)) {
            return false;
        }
        Acmmm other = (Acmmm) object;
        if ((this.acmmmPK == null && other.acmmmPK != null) || (this.acmmmPK != null && !this.acmmmPK.equals(other.acmmmPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Acmmm[ acmmmPK=" + acmmmPK + " ]";
    }
    
}
