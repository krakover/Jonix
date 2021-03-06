//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.11 at 10:06:55 PM IST 
//


package org.editeur.onix.v30.references;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Flow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Flow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}block"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}inline"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flow", propOrder = {
    "content"
})
@XmlSeeAlso({
    Div.class,
    Li.class,
    BookClubAdoption.class,
    CopiesSold.class,
    ReprintDetail.class,
    PromotionCampaign.class,
    MarketPublishingStatusNote.class,
    PrizeJury.class,
    PromotionContact.class,
    Text.class,
    Td.class,
    Th.class,
    FeatureNote.class,
    ReissueDescription.class,
    SalesRestrictionNote.class,
    AncillaryContentDescription.class,
    IllustrationsNote.class,
    ReligiousTextFeatureDescription.class,
    ConferenceTheme.class,
    ConferenceName.class,
    ContributorStatement.class,
    ContributorDescription.class,
    BiographicalNote.class,
    TitleStatement.class,
    AudienceDescription.class,
    CitationNote.class,
    WebsiteDescription.class,
    Dd.class,
    PublishingStatusNote.class
})
public class Flow {

    @XmlElementRefs({
        @XmlElementRef(name = "inline", namespace = "http://ns.editeur.org/onix/3.0/reference", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "block", namespace = "http://ns.editeur.org/onix/3.0/reference", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Ol }{@code >}
     * {@link JAXBElement }{@code <}{@link Blockquote }{@code >}
     * {@link JAXBElement }{@code <}{@link Big }{@code >}
     * {@link JAXBElement }{@code <}{@link Dfn }{@code >}
     * {@link JAXBElement }{@code <}{@link Samp }{@code >}
     * {@link JAXBElement }{@code <}{@link H3 }{@code >}
     * {@link JAXBElement }{@code <}{@link Sub }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link JAXBElement }{@code <}{@link H4 }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Span }{@code >}
     * {@link JAXBElement }{@code <}{@link Abbr }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Cite }{@code >}
     * {@link JAXBElement }{@code <}{@link Small }{@code >}
     * {@link JAXBElement }{@code <}{@link Ul }{@code >}
     * {@link JAXBElement }{@code <}{@link Div }{@code >}
     * {@link JAXBElement }{@code <}{@link Tt }{@code >}
     * {@link JAXBElement }{@code <}{@link Br }{@code >}
     * {@link JAXBElement }{@code <}{@link Bdo }{@code >}
     * {@link JAXBElement }{@code <}{@link H1 }{@code >}
     * {@link JAXBElement }{@code <}{@link Acronym }{@code >}
     * {@link JAXBElement }{@code <}{@link H2 }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Pre }{@code >}
     * {@link JAXBElement }{@code <}{@link I }{@code >}
     * {@link JAXBElement }{@code <}{@link Map }{@code >}
     * {@link JAXBElement }{@code <}{@link B }{@code >}
     * {@link JAXBElement }{@code <}{@link Table }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link Img }{@code >}
     * {@link JAXBElement }{@code <}{@link Q }{@code >}
     * {@link JAXBElement }{@code <}{@link Kbd }{@code >}
     * {@link JAXBElement }{@code <}{@link H5 }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Hr }{@code >}
     * {@link JAXBElement }{@code <}{@link P }{@code >}
     * {@link JAXBElement }{@code <}{@link Code }{@code >}
     * {@link JAXBElement }{@code <}{@link Em }{@code >}
     * {@link JAXBElement }{@code <}{@link Strong }{@code >}
     * {@link JAXBElement }{@code <}{@link Address }{@code >}
     * {@link JAXBElement }{@code <}{@link org.editeur.onix.v30.references.Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Dl }{@code >}
     * {@link JAXBElement }{@code <}{@link Sup }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link JAXBElement }{@code <}{@link A }{@code >}
     * {@link JAXBElement }{@code <}{@link Var }{@code >}
     * {@link JAXBElement }{@code <}{@link H6 }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

}
