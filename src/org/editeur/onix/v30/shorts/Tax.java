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
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}x470" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}x471" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}x472" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}x473" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}x474" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://ns.editeur.org/onix/3.0/short}generalAttributes"/>
 *       &lt;attribute name="refname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="Tax"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="shortname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="tax"/>
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
    "x470",
    "x471",
    "x472",
    "x473",
    "x474"
})
@XmlRootElement(name = "tax")
public class Tax {

    protected X470 x470;
    protected X471 x471;
    protected X472 x472;
    protected X473 x473;
    protected X474 x474;
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
     * Gets the value of the x470 property.
     * 
     * @return
     *     possible object is
     *     {@link X470 }
     *     
     */
    public X470 getX470() {
        return x470;
    }

    /**
     * Sets the value of the x470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link X470 }
     *     
     */
    public void setX470(X470 value) {
        this.x470 = value;
    }

    /**
     * Gets the value of the x471 property.
     * 
     * @return
     *     possible object is
     *     {@link X471 }
     *     
     */
    public X471 getX471() {
        return x471;
    }

    /**
     * Sets the value of the x471 property.
     * 
     * @param value
     *     allowed object is
     *     {@link X471 }
     *     
     */
    public void setX471(X471 value) {
        this.x471 = value;
    }

    /**
     * Gets the value of the x472 property.
     * 
     * @return
     *     possible object is
     *     {@link X472 }
     *     
     */
    public X472 getX472() {
        return x472;
    }

    /**
     * Sets the value of the x472 property.
     * 
     * @param value
     *     allowed object is
     *     {@link X472 }
     *     
     */
    public void setX472(X472 value) {
        this.x472 = value;
    }

    /**
     * Gets the value of the x473 property.
     * 
     * @return
     *     possible object is
     *     {@link X473 }
     *     
     */
    public X473 getX473() {
        return x473;
    }

    /**
     * Sets the value of the x473 property.
     * 
     * @param value
     *     allowed object is
     *     {@link X473 }
     *     
     */
    public void setX473(X473 value) {
        this.x473 = value;
    }

    /**
     * Gets the value of the x474 property.
     * 
     * @return
     *     possible object is
     *     {@link X474 }
     *     
     */
    public X474 getX474() {
        return x474;
    }

    /**
     * Sets the value of the x474 property.
     * 
     * @param value
     *     allowed object is
     *     {@link X474 }
     *     
     */
    public void setX474(X474 value) {
        this.x474 = value;
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
