//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.11 at 10:06:33 PM IST 
//


package org.editeur.onix.v21.references;

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
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}RecordReference"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}NotificationType"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}DeletionCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}DeletionText" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}RecordSourceType" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/reference}RecordSourceIdentifierType"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/reference}RecordSourceIdentifier"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}RecordSourceName" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}SeriesIdentifier" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}Title" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}Contributor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}OtherText" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}Publisher" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}SubordinateEntries" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.editeur.org/onix/2.1/reference}generalAttributes"/>
 *       &lt;attribute name="refname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="MainSeriesRecord" />
 *       &lt;attribute name="shortname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="mainseriesrecord" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "recordReference",
    "notificationType",
    "deletionCode",
    "deletionText",
    "recordSourceType",
    "recordSourceIdentifierType",
    "recordSourceIdentifier",
    "recordSourceName",
    "seriesIdentifier",
    "title",
    "contributor",
    "otherText",
    "publisher",
    "subordinateEntries"
})
@XmlRootElement(name = "MainSeriesRecord")
public class MainSeriesRecord {

    @XmlElement(name = "RecordReference", required = true)
    protected RecordReference recordReference;
    @XmlElement(name = "NotificationType", required = true)
    protected NotificationType notificationType;
    @XmlElement(name = "DeletionCode")
    protected DeletionCode deletionCode;
    @XmlElement(name = "DeletionText")
    protected DeletionText deletionText;
    @XmlElement(name = "RecordSourceType")
    protected RecordSourceType recordSourceType;
    @XmlElement(name = "RecordSourceIdentifierType")
    protected RecordSourceIdentifierType recordSourceIdentifierType;
    @XmlElement(name = "RecordSourceIdentifier")
    protected RecordSourceIdentifier recordSourceIdentifier;
    @XmlElement(name = "RecordSourceName")
    protected RecordSourceName recordSourceName;
    @XmlElement(name = "SeriesIdentifier", required = true)
    protected List<SeriesIdentifier> seriesIdentifier;
    @XmlElement(name = "Title", required = true)
    protected List<Title> title;
    @XmlElement(name = "Contributor")
    protected List<Contributor> contributor;
    @XmlElement(name = "OtherText")
    protected List<OtherText> otherText;
    @XmlElement(name = "Publisher")
    protected List<Publisher> publisher;
    @XmlElement(name = "SubordinateEntries")
    protected SubordinateEntries subordinateEntries;
    @XmlAttribute(name = "refname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String refname;
    @XmlAttribute(name = "shortname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String shortname;
    @XmlAttribute(name = "textformat")
    protected String textformat;
    @XmlAttribute(name = "textcase")
    protected String textcase;
    @XmlAttribute(name = "language")
    protected List74 language;
    @XmlAttribute(name = "transliteration")
    protected List138 transliteration;
    @XmlAttribute(name = "datestamp")
    protected String datestamp;
    @XmlAttribute(name = "sourcetype")
    protected String sourcetype;
    @XmlAttribute(name = "sourcename")
    protected String sourcename;

    /**
     * Gets the value of the recordReference property.
     * 
     * @return
     *     possible object is
     *     {@link RecordReference }
     *     
     */
    public RecordReference getRecordReference() {
        return recordReference;
    }

    /**
     * Sets the value of the recordReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordReference }
     *     
     */
    public void setRecordReference(RecordReference value) {
        this.recordReference = value;
    }

    /**
     * Gets the value of the notificationType property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationType }
     *     
     */
    public NotificationType getNotificationType() {
        return notificationType;
    }

    /**
     * Sets the value of the notificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationType }
     *     
     */
    public void setNotificationType(NotificationType value) {
        this.notificationType = value;
    }

    /**
     * Gets the value of the deletionCode property.
     * 
     * @return
     *     possible object is
     *     {@link DeletionCode }
     *     
     */
    public DeletionCode getDeletionCode() {
        return deletionCode;
    }

    /**
     * Sets the value of the deletionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeletionCode }
     *     
     */
    public void setDeletionCode(DeletionCode value) {
        this.deletionCode = value;
    }

    /**
     * Gets the value of the deletionText property.
     * 
     * @return
     *     possible object is
     *     {@link DeletionText }
     *     
     */
    public DeletionText getDeletionText() {
        return deletionText;
    }

    /**
     * Sets the value of the deletionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeletionText }
     *     
     */
    public void setDeletionText(DeletionText value) {
        this.deletionText = value;
    }

    /**
     * Gets the value of the recordSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordSourceType }
     *     
     */
    public RecordSourceType getRecordSourceType() {
        return recordSourceType;
    }

    /**
     * Sets the value of the recordSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordSourceType }
     *     
     */
    public void setRecordSourceType(RecordSourceType value) {
        this.recordSourceType = value;
    }

    /**
     * Gets the value of the recordSourceIdentifierType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordSourceIdentifierType }
     *     
     */
    public RecordSourceIdentifierType getRecordSourceIdentifierType() {
        return recordSourceIdentifierType;
    }

    /**
     * Sets the value of the recordSourceIdentifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordSourceIdentifierType }
     *     
     */
    public void setRecordSourceIdentifierType(RecordSourceIdentifierType value) {
        this.recordSourceIdentifierType = value;
    }

    /**
     * Gets the value of the recordSourceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link RecordSourceIdentifier }
     *     
     */
    public RecordSourceIdentifier getRecordSourceIdentifier() {
        return recordSourceIdentifier;
    }

    /**
     * Sets the value of the recordSourceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordSourceIdentifier }
     *     
     */
    public void setRecordSourceIdentifier(RecordSourceIdentifier value) {
        this.recordSourceIdentifier = value;
    }

    /**
     * Gets the value of the recordSourceName property.
     * 
     * @return
     *     possible object is
     *     {@link RecordSourceName }
     *     
     */
    public RecordSourceName getRecordSourceName() {
        return recordSourceName;
    }

    /**
     * Sets the value of the recordSourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordSourceName }
     *     
     */
    public void setRecordSourceName(RecordSourceName value) {
        this.recordSourceName = value;
    }

    /**
     * Gets the value of the seriesIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seriesIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeriesIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeriesIdentifier }
     * 
     * 
     */
    public List<SeriesIdentifier> getSeriesIdentifier() {
        if (seriesIdentifier == null) {
            seriesIdentifier = new ArrayList<SeriesIdentifier>();
        }
        return this.seriesIdentifier;
    }

    /**
     * Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Title }
     * 
     * 
     */
    public List<Title> getTitle() {
        if (title == null) {
            title = new ArrayList<Title>();
        }
        return this.title;
    }

    /**
     * Gets the value of the contributor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contributor }
     * 
     * 
     */
    public List<Contributor> getContributor() {
        if (contributor == null) {
            contributor = new ArrayList<Contributor>();
        }
        return this.contributor;
    }

    /**
     * Gets the value of the otherText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherText }
     * 
     * 
     */
    public List<OtherText> getOtherText() {
        if (otherText == null) {
            otherText = new ArrayList<OtherText>();
        }
        return this.otherText;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publisher property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublisher().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Publisher }
     * 
     * 
     */
    public List<Publisher> getPublisher() {
        if (publisher == null) {
            publisher = new ArrayList<Publisher>();
        }
        return this.publisher;
    }

    /**
     * Gets the value of the subordinateEntries property.
     * 
     * @return
     *     possible object is
     *     {@link SubordinateEntries }
     *     
     */
    public SubordinateEntries getSubordinateEntries() {
        return subordinateEntries;
    }

    /**
     * Sets the value of the subordinateEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubordinateEntries }
     *     
     */
    public void setSubordinateEntries(SubordinateEntries value) {
        this.subordinateEntries = value;
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
        if (refname == null) {
            return "MainSeriesRecord";
        } else {
            return refname;
        }
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
        if (shortname == null) {
            return "mainseriesrecord";
        } else {
            return shortname;
        }
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
     * Gets the value of the textformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextformat() {
        if (textformat == null) {
            return "00";
        } else {
            return textformat;
        }
    }

    /**
     * Sets the value of the textformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextformat(String value) {
        this.textformat = value;
    }

    /**
     * Gets the value of the textcase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextcase() {
        if (textcase == null) {
            return "00";
        } else {
            return textcase;
        }
    }

    /**
     * Sets the value of the textcase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextcase(String value) {
        this.textcase = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link List74 }
     *     
     */
    public List74 getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link List74 }
     *     
     */
    public void setLanguage(List74 value) {
        this.language = value;
    }

    /**
     * Gets the value of the transliteration property.
     * 
     * @return
     *     possible object is
     *     {@link List138 }
     *     
     */
    public List138 getTransliteration() {
        return transliteration;
    }

    /**
     * Sets the value of the transliteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link List138 }
     *     
     */
    public void setTransliteration(List138 value) {
        this.transliteration = value;
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
        if (sourcetype == null) {
            return "00";
        } else {
            return sourcetype;
        }
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
