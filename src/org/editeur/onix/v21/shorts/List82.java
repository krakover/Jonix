//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.11 at 10:06:39 PM IST 
//


package org.editeur.onix.v21.shorts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for List82.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List82">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AP"/>
 *     &lt;enumeration value="AQ"/>
 *     &lt;enumeration value="AX"/>
 *     &lt;enumeration value="AY"/>
 *     &lt;enumeration value="AZ"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="GC"/>
 *     &lt;enumeration value="GE"/>
 *     &lt;enumeration value="GS"/>
 *     &lt;enumeration value="OT"/>
 *     &lt;enumeration value="NT"/>
 *     &lt;enumeration value="NP"/>
 *     &lt;enumeration value="PE"/>
 *     &lt;enumeration value="PP"/>
 *     &lt;enumeration value="PS"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="ZZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List82")
@XmlEnum
public enum List82 {


    /**
     * The seven portions of the Apocrypha added to the Catholic canon at the Council of Trent in 1546: Tobit; Judith; Wisdom of Solomon; Sirach (Ecclesiasticus); Baruch, including the Letter of Jeremiah; I and II Maccabees; Extra portions of Esther and Daniel (Additions to Esther; the Prayer of Azariah; Song of the Three Jews; Susannah; Bel and the Dragon). These are not generally included in the Protestant canon.
     * 
     */
    AP,

    /**
     * A collection of Apocryphal texts, canon not specified.
     * 
     */
    AQ,

    /**
     * I Esdras; Prayer of Manasseh; Psalm 151; III Maccabees.
     * 
     */
    AX,

    /**
     * I and II Esdras; Prayer of Manasseh; Psalm 151; III and IV Maccabees.
     * 
     */
    AY,

    /**
     * Additional Apocryphal texts included in some Bible versions: I and II Esdras; Prayer of Manasseh.
     * 
     */
    AZ,

    /**
     * The 66 books included in the Protestant, Catholic and Orthodox canons, together with the seven portions of the Apocrypha included in the Catholic canon.
     * 
     */
    GA,

    /**
     * The 66 books included in the Protestant, Catholic and Orthodox canons, together with Apocryphal texts, canon not specified.
     * 
     */
    GC,

    /**
     * The 66 books included in the Protestant, Catholic and Orthodox canons, 39 from the Old Testament and 27 from the New Testament. The sequence of books may differ in different canons.
     * 
     */
    GE,

    /**
     * The books of Matthew, Mark, Luke and John.
     * 
     */
    GS,

    /**
     * Those 39 books which were included in the Jewish canon by the rabbinical academy established at Jamma in 90 CE. Also known as the Jewish or Hebrew scriptures.
     * 
     */
    OT,

    /**
     * The 27 books included in the Christian canon through the Easter Letter of Athanasius, Bishop of Alexandria and also by a general council of the Christian church held near the end of the 4th century CE.
     * 
     */
    NT,

    /**
     * Includes the 27 books of the New Testament plus Psalms and Proverbs from the Old Testament.
     * 
     */
    NP,

    /**
     * The books containing the letters of Paul to the various early Christian churches.
     * 
     */
    PE,

    /**
     * The book of Psalms and the book of Proverbs combined.
     * 
     */
    PP,

    /**
     * The book of Psalms.
     * 
     */
    PS,

    /**
     * The first five books of the Bible: Genesis, Exodus, Numbers, Leviticus, Deuteronomy. Also applied to the Torah.
     * 
     */
    PT,

    /**
     * Selected books of either the OT or NT not otherwise noted.
     * 
     */
    ZZ;

    public String value() {
        return name();
    }

    public static List82 fromValue(String v) {
        return valueOf(v);
    }

}
