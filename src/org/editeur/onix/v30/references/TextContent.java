//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.11 at 10:06:55 PM IST 
//


package org.editeur.onix.v30.references;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}TextType"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}ContentAudience" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}Text" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}TextAuthor" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}TextSourceCorporate" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}SourceTitle" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}ContentDate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://ns.editeur.org/onix/3.0/reference}generalAttributes"/>
 *       &lt;attribute name="refname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="TextContent"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="shortname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="textcontent"/>
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
    "textType",
    "contentAudience",
    "text",
    "textAuthor",
    "textSourceCorporate",
    "sourceTitle",
    "contentDate"
})
@XmlRootElement(name = "TextContent")
public class TextContent {

    @XmlElement(name = "TextType", required = true)
    protected TextType textType;
    @XmlElement(name = "ContentAudience", required = true)
    protected List<ContentAudience> contentAudience;
    @XmlElement(name = "Text", required = true)
    protected List<Text> text;
    @XmlElement(name = "TextAuthor")
    protected TextAuthor textAuthor;
    @XmlElement(name = "TextSourceCorporate")
    protected TextSourceCorporate textSourceCorporate;
    @XmlElement(name = "SourceTitle")
    protected SourceTitle sourceTitle;
    @XmlElement(name = "ContentDate")
    protected List<ContentDate> contentDate;
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
     * Gets the value of the textType property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getTextType() {
        return textType;
    }

    /**
     * Sets the value of the textType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setTextType(TextType value) {
        this.textType = value;
    }

    /**
     * Gets the value of the contentAudience property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentAudience property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentAudience().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentAudience }
     * 
     * 
     */
    public List<ContentAudience> getContentAudience() {
        if (contentAudience == null) {
            contentAudience = new ArrayList<ContentAudience>();
        }
        return this.contentAudience;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     * 
     * 
     */
    public List<Text> getText() {
        if (text == null) {
            text = new ArrayList<Text>();
        }
        return this.text;
    }

    /**
     * Gets the value of the textAuthor property.
     * 
     * @return
     *     possible object is
     *     {@link TextAuthor }
     *     
     */
    public TextAuthor getTextAuthor() {
        return textAuthor;
    }

    /**
     * Sets the value of the textAuthor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextAuthor }
     *     
     */
    public void setTextAuthor(TextAuthor value) {
        this.textAuthor = value;
    }

    /**
     * Gets the value of the textSourceCorporate property.
     * 
     * @return
     *     possible object is
     *     {@link TextSourceCorporate }
     *     
     */
    public TextSourceCorporate getTextSourceCorporate() {
        return textSourceCorporate;
    }

    /**
     * Sets the value of the textSourceCorporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextSourceCorporate }
     *     
     */
    public void setTextSourceCorporate(TextSourceCorporate value) {
        this.textSourceCorporate = value;
    }

    /**
     * Gets the value of the sourceTitle property.
     * 
     * @return
     *     possible object is
     *     {@link SourceTitle }
     *     
     */
    public SourceTitle getSourceTitle() {
        return sourceTitle;
    }

    /**
     * Sets the value of the sourceTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceTitle }
     *     
     */
    public void setSourceTitle(SourceTitle value) {
        this.sourceTitle = value;
    }

    /**
     * Gets the value of the contentDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentDate }
     * 
     * 
     */
    public List<ContentDate> getContentDate() {
        if (contentDate == null) {
            contentDate = new ArrayList<ContentDate>();
        }
        return this.contentDate;
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
