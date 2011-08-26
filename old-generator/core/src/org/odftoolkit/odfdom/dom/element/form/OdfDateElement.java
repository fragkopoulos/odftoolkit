/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.form;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import javax.xml.datatype.XMLGregorianCalendar;
import org.odftoolkit.odfdom.dom.type.OdfDate;
import org.odftoolkit.odfdom.dom.type.OdfId;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;
import org.odftoolkit.odfdom.dom.type.OdfNonNegativeInteger;
import org.odftoolkit.odfdom.dom.type.OdfCellAddress;
import javax.xml.datatype.Duration;
import org.odftoolkit.odfdom.dom.type.OdfDuration;


/**
 * ODF DOM Element implementation for element "<form:date>".
 */
public abstract class OdfDateElement extends OdfElement
{        
    /**
	 * 
	 */
	private static final long serialVersionUID = 3326621043809265568L;
	public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.FORM, "date" );

    public OdfDateElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    @Override
	public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialize mandatory attributes.
     */
    public void init(String _aId, String _aXmlid)
    {
        setId( _aId );
        setXmlid( _aXmlid );
    }

    /**
     * Get value of attribute "form:value".
     */
    public XMLGregorianCalendar getValue()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "value" ) );
        return OdfDate.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:value".
     */
    public void setValue( XMLGregorianCalendar _aValue )
    {                    
        String aStringVal = OdfDate.toString( _aValue );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "value" ), aStringVal );
    }

    /**
     * Get value of attribute "form:current-value".
     */
    public XMLGregorianCalendar getCurrentValue()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "current-value" ) );
        return OdfDate.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:current-value".
     */
    public void setCurrentValue( XMLGregorianCalendar _aCurrentValue )
    {                    
        String aStringVal = OdfDate.toString( _aCurrentValue );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "current-value" ), aStringVal );
    }

    /**
     * Get value of attribute "form:min-value".
     */
    public XMLGregorianCalendar getMinValue()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "min-value" ) );
        return OdfDate.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:min-value".
     */
    public void setMinValue( XMLGregorianCalendar _aMinValue )
    {                    
        String aStringVal = OdfDate.toString( _aMinValue );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "min-value" ), aStringVal );
    }

    /**
     * Get value of attribute "form:max-value".
     */
    public XMLGregorianCalendar getMaxValue()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "max-value" ) );
        return OdfDate.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:max-value".
     */
    public void setMaxValue( XMLGregorianCalendar _aMaxValue )
    {                    
        String aStringVal = OdfDate.toString( _aMaxValue );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "max-value" ), aStringVal );
    }

    /**
     * Get value of attribute "form:name".
     */
    public String getName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "name" ) );
    }

    /**
     * Set value of attribute "form:name".
     */
    public void setName( String _aName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "name" ), _aName );
    }

    /**
     * Get value of attribute "form:control-implementation".
     */
    public String getControlImplementation()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "control-implementation" ) );
    }

    /**
     * Set value of attribute "form:control-implementation".
     */
    public void setControlImplementation( String _aControlImplementation )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "control-implementation" ), _aControlImplementation );
    }

    /**
     * Get value of attribute "form:id".
     */
    public String getId()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "id" ) );
    }

    /**
     * Set value of attribute "form:id".
     */
    public void setId( String _aId )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "id" ), _aId );
    }

    /**
     * Get value of attribute "xml:id".
     */
    public String getXmlid()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.XML, "id" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "xml:id".
     */
    public void setXmlid( String _aXmlid )
    {                    
        String aStringVal = OdfId.toString( _aXmlid );
        setOdfAttribute( OdfName.get( OdfNamespace.XML, "id" ), aStringVal );
    }

    /**
     * Get value of attribute "xforms:bind".
     */
    public String getBind()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.XFORMS, "bind" ) );
    }

    /**
     * Set value of attribute "xforms:bind".
     */
    public void setBind( String _aBind )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.XFORMS, "bind" ), _aBind );
    }

    /**
     * Get value of attribute "form:disabled".
     */
    public Boolean getDisabled()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "disabled" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:disabled".
     */
    public void setDisabled( Boolean _aDisabled )
    {                    
        String aStringVal = OdfBoolean.toString( _aDisabled );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "disabled" ), aStringVal );
    }

    /**
     * Get value of attribute "form:max-length".
     */
    public Integer getMaxLength()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "max-length" ) );
        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:max-length".
     */
    public void setMaxLength( Integer _aMaxLength )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aMaxLength );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "max-length" ), aStringVal );
    }

    /**
     * Get value of attribute "form:printable".
     */
    public Boolean getPrintable()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "printable" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:printable".
     */
    public void setPrintable( Boolean _aPrintable )
    {                    
        String aStringVal = OdfBoolean.toString( _aPrintable );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "printable" ), aStringVal );
    }

    /**
     * Get value of attribute "form:readonly".
     */
    public Boolean getReadonly()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "readonly" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:readonly".
     */
    public void setReadonly( Boolean _aReadonly )
    {                    
        String aStringVal = OdfBoolean.toString( _aReadonly );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "readonly" ), aStringVal );
    }

    /**
     * Get value of attribute "form:tab-index".
     */
    public Integer getTabIndex()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "tab-index" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "0";
        }

        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:tab-index".
     */
    public void setTabIndex( Integer _aTabIndex )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aTabIndex );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "tab-index" ), aStringVal );
    }

    /**
     * Get value of attribute "form:tab-stop".
     */
    public Boolean getTabStop()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "tab-stop" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:tab-stop".
     */
    public void setTabStop( Boolean _aTabStop )
    {                    
        String aStringVal = OdfBoolean.toString( _aTabStop );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "tab-stop" ), aStringVal );
    }

    /**
     * Get value of attribute "form:title".
     */
    public String getTitle()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "title" ) );
    }

    /**
     * Set value of attribute "form:title".
     */
    public void setTitle( String _aTitle )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "title" ), _aTitle );
    }

    /**
     * Get value of attribute "form:convert-empty-to-null".
     */
    public Boolean getConvertEmptyToNull()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "convert-empty-to-null" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:convert-empty-to-null".
     */
    public void setConvertEmptyToNull( Boolean _aConvertEmptyToNull )
    {                    
        String aStringVal = OdfBoolean.toString( _aConvertEmptyToNull );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "convert-empty-to-null" ), aStringVal );
    }

    /**
     * Get value of attribute "form:data-field".
     */
    public String getDataField()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "data-field" ) );
    }

    /**
     * Set value of attribute "form:data-field".
     */
    public void setDataField( String _aDataField )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "data-field" ), _aDataField );
    }

    /**
     * Get value of attribute "form:linked-cell".
     */
    public String getLinkedCell()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "linked-cell" ) );
        return OdfCellAddress.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:linked-cell".
     */
    public void setLinkedCell( String _aLinkedCell )
    {                    
        String aStringVal = OdfCellAddress.toString( _aLinkedCell );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "linked-cell" ), aStringVal );
    }

    /**
     * Get value of attribute "form:spin-button".
     */
    public Boolean getSpinButton()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "spin-button" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:spin-button".
     */
    public void setSpinButton( Boolean _aSpinButton )
    {                    
        String aStringVal = OdfBoolean.toString( _aSpinButton );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "spin-button" ), aStringVal );
    }

    /**
     * Get value of attribute "form:repeat".
     */
    public Boolean getRepeat()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "repeat" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:repeat".
     */
    public void setRepeat( Boolean _aRepeat )
    {                    
        String aStringVal = OdfBoolean.toString( _aRepeat );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "repeat" ), aStringVal );
    }

    /**
     * Get value of attribute "form:delay-for-repeat".
     */
    public Duration getDelayForRepeat()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "delay-for-repeat" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "PT0.050S";
        }

        return OdfDuration.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:delay-for-repeat".
     */
    public void setDelayForRepeat( Duration _aDelayForRepeat )
    {                    
        String aStringVal = OdfDuration.toString( _aDelayForRepeat );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "delay-for-repeat" ), aStringVal );
    }

}
