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
 *         &lt;group ref="{http://ns.editeur.org/onix/3.0/reference}gp.record_metadata"/>
 *         &lt;group ref="{http://ns.editeur.org/onix/3.0/reference}gp.product_numbers"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}DescriptiveDetail" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}CollateralDetail" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}ContentDetail" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}PublishingDetail" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}RelatedMaterial" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}ProductSupply" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://ns.editeur.org/onix/3.0/reference}generalAttributes"/>
 *       &lt;attribute name="refname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="Product"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="shortname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="product"/>
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
    "recordReference",
    "notificationType",
    "deletionText",
    "recordSourceType",
    "recordSourceIdentifier",
    "recordSourceName",
    "productIdentifier",
    "barcode",
    "descriptiveDetail",
    "collateralDetail",
    "contentDetail",
    "publishingDetail",
    "relatedMaterial",
    "productSupply"
})
@XmlRootElement(name = "Product")
public class Product {

    @XmlElement(name = "RecordReference", required = true)
    protected RecordReference recordReference;
    @XmlElement(name = "NotificationType", required = true)
    protected NotificationType notificationType;
    @XmlElement(name = "DeletionText")
    protected List<DeletionText> deletionText;
    @XmlElement(name = "RecordSourceType")
    protected RecordSourceType recordSourceType;
    @XmlElement(name = "RecordSourceIdentifier")
    protected List<RecordSourceIdentifier> recordSourceIdentifier;
    @XmlElement(name = "RecordSourceName")
    protected RecordSourceName recordSourceName;
    @XmlElement(name = "ProductIdentifier", required = true)
    protected List<ProductIdentifier> productIdentifier;
    @XmlElement(name = "Barcode")
    protected List<Barcode> barcode;
    @XmlElement(name = "DescriptiveDetail")
    protected DescriptiveDetail descriptiveDetail;
    @XmlElement(name = "CollateralDetail")
    protected CollateralDetail collateralDetail;
    @XmlElement(name = "ContentDetail")
    protected ContentDetail contentDetail;
    @XmlElement(name = "PublishingDetail")
    protected PublishingDetail publishingDetail;
    @XmlElement(name = "RelatedMaterial")
    protected RelatedMaterial relatedMaterial;
    @XmlElement(name = "ProductSupply")
    protected List<ProductSupply> productSupply;
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
     * Gets the value of the deletionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deletionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeletionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeletionText }
     * 
     * 
     */
    public List<DeletionText> getDeletionText() {
        if (deletionText == null) {
            deletionText = new ArrayList<DeletionText>();
        }
        return this.deletionText;
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
     * Gets the value of the recordSourceIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordSourceIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordSourceIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordSourceIdentifier }
     * 
     * 
     */
    public List<RecordSourceIdentifier> getRecordSourceIdentifier() {
        if (recordSourceIdentifier == null) {
            recordSourceIdentifier = new ArrayList<RecordSourceIdentifier>();
        }
        return this.recordSourceIdentifier;
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
     * Gets the value of the productIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentifier }
     * 
     * 
     */
    public List<ProductIdentifier> getProductIdentifier() {
        if (productIdentifier == null) {
            productIdentifier = new ArrayList<ProductIdentifier>();
        }
        return this.productIdentifier;
    }

    /**
     * Gets the value of the barcode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the barcode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBarcode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Barcode }
     * 
     * 
     */
    public List<Barcode> getBarcode() {
        if (barcode == null) {
            barcode = new ArrayList<Barcode>();
        }
        return this.barcode;
    }

    /**
     * Gets the value of the descriptiveDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptiveDetail }
     *     
     */
    public DescriptiveDetail getDescriptiveDetail() {
        return descriptiveDetail;
    }

    /**
     * Sets the value of the descriptiveDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptiveDetail }
     *     
     */
    public void setDescriptiveDetail(DescriptiveDetail value) {
        this.descriptiveDetail = value;
    }

    /**
     * Gets the value of the collateralDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralDetail }
     *     
     */
    public CollateralDetail getCollateralDetail() {
        return collateralDetail;
    }

    /**
     * Sets the value of the collateralDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralDetail }
     *     
     */
    public void setCollateralDetail(CollateralDetail value) {
        this.collateralDetail = value;
    }

    /**
     * Gets the value of the contentDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ContentDetail }
     *     
     */
    public ContentDetail getContentDetail() {
        return contentDetail;
    }

    /**
     * Sets the value of the contentDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentDetail }
     *     
     */
    public void setContentDetail(ContentDetail value) {
        this.contentDetail = value;
    }

    /**
     * Gets the value of the publishingDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PublishingDetail }
     *     
     */
    public PublishingDetail getPublishingDetail() {
        return publishingDetail;
    }

    /**
     * Sets the value of the publishingDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublishingDetail }
     *     
     */
    public void setPublishingDetail(PublishingDetail value) {
        this.publishingDetail = value;
    }

    /**
     * Gets the value of the relatedMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedMaterial }
     *     
     */
    public RelatedMaterial getRelatedMaterial() {
        return relatedMaterial;
    }

    /**
     * Sets the value of the relatedMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedMaterial }
     *     
     */
    public void setRelatedMaterial(RelatedMaterial value) {
        this.relatedMaterial = value;
    }

    /**
     * Gets the value of the productSupply property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSupply property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSupply().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSupply }
     * 
     * 
     */
    public List<ProductSupply> getProductSupply() {
        if (productSupply == null) {
            productSupply = new ArrayList<ProductSupply>();
        }
        return this.productSupply;
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
