//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.11 at 10:07:00 PM IST 
//


package org.editeur.onix.v30.shorts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}b253"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}b252"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}b251" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}x420" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://ns.editeur.org/onix/3.0/short}generalAttributes"/>
 *       &lt;attribute name="refname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="Language"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="shortname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="language"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "b253",
    "b252",
    "b251",
    "x420"
})
@XmlRootElement(name = "language")
public class Language {

    @XmlElement(required = true)
    protected B253 b253;
    @XmlElement(required = true)
    protected B252 b252;
    protected B251 b251;
    protected X420 x420;
    @XmlAttribute(name = "refname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refname;
    @XmlAttribute(name = "shortname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shortname;
    @XmlAttribute(name = "datestamp")
    protected String datestamp;
    @XmlAttribute(name = "sourcetype")
    protected String sourcetype;
    @XmlAttribute(name = "sourcename")
    @XmlSchemaType(name = "anySimpleType")
    protected String sourcename;

    /**
     * Gets the value of the b253 property.
     * 
     * @return
     *     possible object is
     *     {@link B253 }
     *     
     */
    public B253 getB253() {
        return b253;
    }

    /**
     * Sets the value of the b253 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B253 }
     *     
     */
    public void setB253(B253 value) {
        this.b253 = value;
    }

    /**
     * Gets the value of the b252 property.
     * 
     * @return
     *     possible object is
     *     {@link B252 }
     *     
     */
    public B252 getB252() {
        return b252;
    }

    /**
     * Sets the value of the b252 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B252 }
     *     
     */
    public void setB252(B252 value) {
        this.b252 = value;
    }

    /**
     * Gets the value of the b251 property.
     * 
     * @return
     *     possible object is
     *     {@link B251 }
     *     
     */
    public B251 getB251() {
        return b251;
    }

    /**
     * Sets the value of the b251 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B251 }
     *     
     */
    public void setB251(B251 value) {
        this.b251 = value;
    }

    /**
     * Gets the value of the x420 property.
     * 
     * @return
     *     possible object is
     *     {@link X420 }
     *     
     */
    public X420 getX420() {
        return x420;
    }

    /**
     * Sets the value of the x420 property.
     * 
     * @param value
     *     allowed object is
     *     {@link X420 }
     *     
     */
    public void setX420(X420 value) {
        this.x420 = value;
    }

    /**
     * Gets the value of the refname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefname() {
        return refname;
    }

    /**
     * Sets the value of the refname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefname(String value) {
        this.refname = value;
    }

    /**
     * Gets the value of the shortname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortname() {
        return shortname;
    }

    /**
     * Sets the value of the shortname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortname(String value) {
        this.shortname = value;
    }

    /**
     * Gets the value of the datestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatestamp() {
        return datestamp;
    }

    /**
     * Sets the value of the datestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatestamp(String value) {
        this.datestamp = value;
    }

    /**
     * Gets the value of the sourcetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcetype() {
        return sourcetype;
    }

    /**
     * Sets the value of the sourcetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcetype(String value) {
        this.sourcetype = value;
    }

    /**
     * Gets the value of the sourcename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcename() {
        return sourcename;
    }

    /**
     * Sets the value of the sourcename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcename(String value) {
        this.sourcename = value;
    }

}
