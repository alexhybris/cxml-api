//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.06 at 12:45:09 AM EDT 
//


package org.cxml.catalog;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "description",
    "enumerationValueOrRange",
    "extrinsic"
})
@XmlRootElement(name = "TypeAttribute")
public class TypeAttribute {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nameAttribute;
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "shortTag")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String shortTag;
    @XmlAttribute(name = "mappedFrom")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mappedFrom;
    @XmlAttribute(name = "isRequired")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isRequired;
    @XmlAttribute(name = "isRequiredForOrdering")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isRequiredForOrdering;
    @XmlAttribute(name = "isRefinable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isRefinable;
    @XmlAttribute(name = "isSearchable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isSearchable;
    @XmlAttribute(name = "isCollection")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isCollection;
    @XmlAttribute(name = "isCaseSensitive")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isCaseSensitive;
    @XmlAttribute(name = "isInKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isInKey;
    @XmlAttribute(name = "isInFreeTextSearch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isInFreeTextSearch;
    @XmlAttribute(name = "isHidden")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isHidden;
    @XmlAttribute(name = "isSortable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isSortable;
    @XmlAttribute(name = "isReadOnly")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isReadOnly;
    @XmlAttribute(name = "unit")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String unit;
    @XmlElement(name = "Name")
    protected List<Name> name;
    @XmlElement(name = "Description")
    protected List<Description> description;
    @XmlElements({
        @XmlElement(name = "EnumerationValue", type = EnumerationValue.class),
        @XmlElement(name = "Range", type = Range.class)
    })
    protected List<Object> enumerationValueOrRange;
    @XmlElement(name = "Extrinsic")
    protected List<Extrinsic> extrinsic;

   
    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the shortTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortTag() {
        return shortTag;
    }

    /**
     * Sets the value of the shortTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortTag(String value) {
        this.shortTag = value;
    }

    /**
     * Gets the value of the mappedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappedFrom() {
        return mappedFrom;
    }

    /**
     * Sets the value of the mappedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappedFrom(String value) {
        this.mappedFrom = value;
    }

    /**
     * Gets the value of the isRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRequired() {
        return isRequired;
    }

    /**
     * Sets the value of the isRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRequired(String value) {
        this.isRequired = value;
    }

    /**
     * Gets the value of the isRequiredForOrdering property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRequiredForOrdering() {
        return isRequiredForOrdering;
    }

    /**
     * Sets the value of the isRequiredForOrdering property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRequiredForOrdering(String value) {
        this.isRequiredForOrdering = value;
    }

    /**
     * Gets the value of the isRefinable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRefinable() {
        return isRefinable;
    }

    /**
     * Sets the value of the isRefinable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRefinable(String value) {
        this.isRefinable = value;
    }

    /**
     * Gets the value of the isSearchable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSearchable() {
        return isSearchable;
    }

    /**
     * Sets the value of the isSearchable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSearchable(String value) {
        this.isSearchable = value;
    }

    /**
     * Gets the value of the isCollection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCollection() {
        return isCollection;
    }

    /**
     * Sets the value of the isCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCollection(String value) {
        this.isCollection = value;
    }

    /**
     * Gets the value of the isCaseSensitive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCaseSensitive() {
        return isCaseSensitive;
    }

    /**
     * Sets the value of the isCaseSensitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCaseSensitive(String value) {
        this.isCaseSensitive = value;
    }

    /**
     * Gets the value of the isInKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsInKey() {
        return isInKey;
    }

    /**
     * Sets the value of the isInKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsInKey(String value) {
        this.isInKey = value;
    }

    /**
     * Gets the value of the isInFreeTextSearch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsInFreeTextSearch() {
        return isInFreeTextSearch;
    }

    /**
     * Sets the value of the isInFreeTextSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsInFreeTextSearch(String value) {
        this.isInFreeTextSearch = value;
    }

    /**
     * Gets the value of the isHidden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsHidden() {
        return isHidden;
    }

    /**
     * Sets the value of the isHidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsHidden(String value) {
        this.isHidden = value;
    }

    /**
     * Gets the value of the isSortable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSortable() {
        return isSortable;
    }

    /**
     * Sets the value of the isSortable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSortable(String value) {
        this.isSortable = value;
    }

    /**
     * Gets the value of the isReadOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsReadOnly() {
        return isReadOnly;
    }

    /**
     * Sets the value of the isReadOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsReadOnly(String value) {
        this.isReadOnly = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Name }
     * 
     * 
     */
    public List<Name> getName() {
        if (name == null) {
            name = new ArrayList<Name>();
        }
        return this.name;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * 
     * 
     */
    public List<Description> getDescription() {
        if (description == null) {
            description = new ArrayList<Description>();
        }
        return this.description;
    }

    /**
     * Gets the value of the enumerationValueOrRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumerationValueOrRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumerationValueOrRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumerationValue }
     * {@link Range }
     * 
     * 
     */
    public List<Object> getEnumerationValueOrRange() {
        if (enumerationValueOrRange == null) {
            enumerationValueOrRange = new ArrayList<Object>();
        }
        return this.enumerationValueOrRange;
    }

    /**
     * Gets the value of the extrinsic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extrinsic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtrinsic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extrinsic }
     * 
     * 
     */
    public List<Extrinsic> getExtrinsic() {
        if (extrinsic == null) {
            extrinsic = new ArrayList<Extrinsic>();
        }
        return this.extrinsic;
    }

    
    public String getNameAttribute() {
		return nameAttribute;
	}
    
    public void setNameAttribute(String nameAttribute) {
		this.nameAttribute = nameAttribute;
	}
}
