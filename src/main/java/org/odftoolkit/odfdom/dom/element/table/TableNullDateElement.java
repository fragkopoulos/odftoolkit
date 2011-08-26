/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
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

import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.pkg.OdfNamespace;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.table.TableValueTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableDateValueAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element table:null-date}.
 *
 */
public class TableNullDateElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "null-date" );


	/**
	 * Create the instance of <code>TableNullDateElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableNullDateElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:null-date}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}



	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableValueTypeAttribute</code> , See {@odf.attribute table:value-type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableValueTypeAttribute()
	{
		TableValueTypeAttribute attr = (TableValueTypeAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.TABLE), "value-type" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return TableValueTypeAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableValueTypeAttribute</code> , See {@odf.attribute table:value-type}
	 *
	 * @param tableValueTypeValue   The type is <code>String</code>
	 */
	public void setTableValueTypeAttribute( String tableValueTypeValue )
	{
		TableValueTypeAttribute attr =  new TableValueTypeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableValueTypeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableDateValueAttribute</code> , See {@odf.attribute table:date-value}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableDateValueAttribute()
	{
		TableDateValueAttribute attr = (TableDateValueAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.TABLE), "date-value" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return TableDateValueAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableDateValueAttribute</code> , See {@odf.attribute table:date-value}
	 *
	 * @param tableDateValueValue   The type is <code>String</code>
	 */
	public void setTableDateValueAttribute( String tableDateValueValue )
	{
		TableDateValueAttribute attr =  new TableDateValueAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableDateValueValue );
	}

}
