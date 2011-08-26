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

package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfNonNegativeInteger;
import org.odftoolkit.odfdom.dom.type.table.OdfDataType;


/**
 * ODF DOM Element implementation for element "<table:filter-condition>".
 */
public abstract class OdfFilterConditionElement extends OdfElement
{        
    /**
	 * 
	 */
	private static final long serialVersionUID = -5685734831202519588L;
	public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "filter-condition" );

    public OdfFilterConditionElement( OdfFileDom _aOwnerDoc )
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
    public void init(Integer _aFieldNumber, String _aValue, String _aOperator)
    {
        setFieldNumber( _aFieldNumber );
        setValue( _aValue );
        setOperator( _aOperator );
    }

    /**
     * Get value of attribute "table:field-number".
     */
    public Integer getFieldNumber()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "field-number" ) );
        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:field-number".
     */
    public void setFieldNumber( Integer _aFieldNumber )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aFieldNumber );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "field-number" ), aStringVal );
    }

    /**
     * Get value of attribute "table:value".
     */
    public String getValue()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "value" ) );
    }

    /**
     * Set value of attribute "table:value".
     */
    public void setValue( String _aValue )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "value" ), _aValue );
    }

    /**
     * Get value of attribute "table:operator".
     */
    public String getOperator()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "operator" ) );
    }

    /**
     * Set value of attribute "table:operator".
     */
    public void setOperator( String _aOperator )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "operator" ), _aOperator );
    }

    /**
     * Get value of attribute "table:case-sensitive".
     */
    public String getCaseSensitive()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "case-sensitive" ) );
    }

    /**
     * Set value of attribute "table:case-sensitive".
     */
    public void setCaseSensitive( String _aCaseSensitive )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "case-sensitive" ), _aCaseSensitive );
    }

    /**
     * Get value of attribute "table:data-type".
     */
    public OdfDataType getDataType()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "data-type" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "text";
        }

        return OdfDataType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:data-type".
     */
    public void setDataType( OdfDataType _aDataType )
    {                    
        String aStringVal = OdfDataType.toString( _aDataType );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "data-type" ), aStringVal );
    }

}
