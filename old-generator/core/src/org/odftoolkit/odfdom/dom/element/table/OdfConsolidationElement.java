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
import org.odftoolkit.odfdom.dom.type.OdfCellRangeAddressList;
import org.odftoolkit.odfdom.dom.type.OdfCellAddress;
import org.odftoolkit.odfdom.dom.type.table.OdfUseLabelsType;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;


/**
 * ODF DOM Element implementation for element "<table:consolidation>".
 */
public abstract class OdfConsolidationElement extends OdfElement
{        
    /**
	 * 
	 */
	private static final long serialVersionUID = 5054952136966937645L;
	public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "consolidation" );

    public OdfConsolidationElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aFunction, String _aSourceCellRangeAddresses, String _aTargetCellAddress)
    {
        setFunction( _aFunction );
        setSourceCellRangeAddresses( _aSourceCellRangeAddresses );
        setTargetCellAddress( _aTargetCellAddress );
    }

    /**
     * Get value of attribute "table:function".
     */
    public String getFunction()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "function" ) );
    }

    /**
     * Set value of attribute "table:function".
     */
    public void setFunction( String _aFunction )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "function" ), _aFunction );
    }

    /**
     * Get value of attribute "table:source-cell-range-addresses".
     */
    public String getSourceCellRangeAddresses()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "source-cell-range-addresses" ) );
        return OdfCellRangeAddressList.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:source-cell-range-addresses".
     */
    public void setSourceCellRangeAddresses( String _aSourceCellRangeAddresses )
    {                    
        String aStringVal = OdfCellRangeAddressList.toString( _aSourceCellRangeAddresses );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "source-cell-range-addresses" ), aStringVal );
    }

    /**
     * Get value of attribute "table:target-cell-address".
     */
    public String getTargetCellAddress()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "target-cell-address" ) );
        return OdfCellAddress.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:target-cell-address".
     */
    public void setTargetCellAddress( String _aTargetCellAddress )
    {                    
        String aStringVal = OdfCellAddress.toString( _aTargetCellAddress );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "target-cell-address" ), aStringVal );
    }

    /**
     * Get value of attribute "table:use-labels".
     */
    public OdfUseLabelsType getUseLabels()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "use-labels" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "none";
        }

        return OdfUseLabelsType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:use-labels".
     */
    public void setUseLabels( OdfUseLabelsType _aUseLabels )
    {                    
        String aStringVal = OdfUseLabelsType.toString( _aUseLabels );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "use-labels" ), aStringVal );
    }

    /**
     * Get value of attribute "table:link-to-source-data".
     */
    public Boolean getLinkToSourceData()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "link-to-source-data" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:link-to-source-data".
     */
    public void setLinkToSourceData( Boolean _aLinkToSourceData )
    {                    
        String aStringVal = OdfBoolean.toString( _aLinkToSourceData );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "link-to-source-data" ), aStringVal );
    }

}
