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

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.table.TableNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableFirstRowStartColumnAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableFirstRowEndColumnAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableLastRowStartColumnAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableLastRowEndColumnAttribute;

import org.odftoolkit.odfdom.dom.attribute.table.TableStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableStyleNameAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:table-template}.
 *
 */
public abstract class TableTableTemplateElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "table-template" );


	/**
	 * Create the instance of <code>TableTableTemplateElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableTableTemplateElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:table-template}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TableTableTemplateElement}
	 *
     * @param tableNameAttributeValue  The mandatory attribute {@odf.attribute  table:name}"
     * @param tableFirstRowStartColumnAttributeValue  The mandatory attribute {@odf.attribute  table:first-row-start-column}"
     * @param tableFirstRowEndColumnAttributeValue  The mandatory attribute {@odf.attribute  table:first-row-end-column}"
     * @param tableLastRowStartColumnAttributeValue  The mandatory attribute {@odf.attribute  table:last-row-start-column}"
     * @param tableLastRowEndColumnAttributeValue  The mandatory attribute {@odf.attribute  table:last-row-end-column}"
     *
	 */
	public void init(String tableNameAttributeValue, String tableFirstRowStartColumnAttributeValue, String tableFirstRowEndColumnAttributeValue, String tableLastRowStartColumnAttributeValue, String tableLastRowEndColumnAttributeValue)
	{
		setTableFirstRowStartColumnAttribute( tableFirstRowStartColumnAttributeValue );
		setTableFirstRowEndColumnAttribute( tableFirstRowEndColumnAttributeValue );
		setTableLastRowStartColumnAttribute( tableLastRowStartColumnAttributeValue );
		setTableLastRowEndColumnAttribute( tableLastRowEndColumnAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableNameAttribute</code> , See {@odf.attribute table:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableNameAttribute()
	{
		TableNameAttribute attr = (TableNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "name" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableNameAttribute</code> , See {@odf.attribute table:name}
	 *
	 * @param tableNameValue   The type is <code>String</code>
	 */
	public void setTableNameAttribute( String tableNameValue )
	{
		TableNameAttribute attr =  new TableNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableFirstRowStartColumnAttribute</code> , See {@odf.attribute table:first-row-start-column}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableFirstRowStartColumnAttribute()
	{
		TableFirstRowStartColumnAttribute attr = (TableFirstRowStartColumnAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "first-row-start-column" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableFirstRowStartColumnAttribute</code> , See {@odf.attribute table:first-row-start-column}
	 *
	 * @param tableFirstRowStartColumnValue   The type is <code>String</code>
	 */
	public void setTableFirstRowStartColumnAttribute( String tableFirstRowStartColumnValue )
	{
		TableFirstRowStartColumnAttribute attr =  new TableFirstRowStartColumnAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableFirstRowStartColumnValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableFirstRowEndColumnAttribute</code> , See {@odf.attribute table:first-row-end-column}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableFirstRowEndColumnAttribute()
	{
		TableFirstRowEndColumnAttribute attr = (TableFirstRowEndColumnAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "first-row-end-column" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableFirstRowEndColumnAttribute</code> , See {@odf.attribute table:first-row-end-column}
	 *
	 * @param tableFirstRowEndColumnValue   The type is <code>String</code>
	 */
	public void setTableFirstRowEndColumnAttribute( String tableFirstRowEndColumnValue )
	{
		TableFirstRowEndColumnAttribute attr =  new TableFirstRowEndColumnAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableFirstRowEndColumnValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableLastRowStartColumnAttribute</code> , See {@odf.attribute table:last-row-start-column}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableLastRowStartColumnAttribute()
	{
		TableLastRowStartColumnAttribute attr = (TableLastRowStartColumnAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "last-row-start-column" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableLastRowStartColumnAttribute</code> , See {@odf.attribute table:last-row-start-column}
	 *
	 * @param tableLastRowStartColumnValue   The type is <code>String</code>
	 */
	public void setTableLastRowStartColumnAttribute( String tableLastRowStartColumnValue )
	{
		TableLastRowStartColumnAttribute attr =  new TableLastRowStartColumnAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableLastRowStartColumnValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableLastRowEndColumnAttribute</code> , See {@odf.attribute table:last-row-end-column}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableLastRowEndColumnAttribute()
	{
		TableLastRowEndColumnAttribute attr = (TableLastRowEndColumnAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "last-row-end-column" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableLastRowEndColumnAttribute</code> , See {@odf.attribute table:last-row-end-column}
	 *
	 * @param tableLastRowEndColumnValue   The type is <code>String</code>
	 */
	public void setTableLastRowEndColumnAttribute( String tableLastRowEndColumnValue )
	{
		TableLastRowEndColumnAttribute attr =  new TableLastRowEndColumnAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableLastRowEndColumnValue );
	}

	/**
	 * Create child element {@odf.element table:first-row}.
	 *
     * @param tableStyleNameAttributeValue  the <code>String</code> value of <code>TableStyleNameAttribute</code>, see {@odf.attribute  table:style-name} at specification
	 * @return   return  the element {@odf.element table:first-row}
	 * DifferentQName 
	 */
    
	public TableFirstRowElement newTableFirstRowElement(String tableStyleNameAttributeValue)
	{
		TableFirstRowElement  tableFirstRow = ((OdfFileDom)this.ownerDocument).newOdfElement(TableFirstRowElement.class);
		tableFirstRow.setTableStyleNameAttribute( tableStyleNameAttributeValue );
		this.appendChild( tableFirstRow);
		return  tableFirstRow;      
	}
    
	/**
	 * Create child element {@odf.element table:last-row}.
	 *
     * @param tableStyleNameAttributeValue  the <code>String</code> value of <code>TableStyleNameAttribute</code>, see {@odf.attribute  table:style-name} at specification
	 * @return   return  the element {@odf.element table:last-row}
	 * DifferentQName 
	 */
    
	public TableLastRowElement newTableLastRowElement(String tableStyleNameAttributeValue)
	{
		TableLastRowElement  tableLastRow = ((OdfFileDom)this.ownerDocument).newOdfElement(TableLastRowElement.class);
		tableLastRow.setTableStyleNameAttribute( tableStyleNameAttributeValue );
		this.appendChild( tableLastRow);
		return  tableLastRow;      
	}
    
	/**
	 * Create child element {@odf.element table:first-column}.
	 *
     * @param tableStyleNameAttributeValue  the <code>String</code> value of <code>TableStyleNameAttribute</code>, see {@odf.attribute  table:style-name} at specification
	 * @return   return  the element {@odf.element table:first-column}
	 * DifferentQName 
	 */
    
	public TableFirstColumnElement newTableFirstColumnElement(String tableStyleNameAttributeValue)
	{
		TableFirstColumnElement  tableFirstColumn = ((OdfFileDom)this.ownerDocument).newOdfElement(TableFirstColumnElement.class);
		tableFirstColumn.setTableStyleNameAttribute( tableStyleNameAttributeValue );
		this.appendChild( tableFirstColumn);
		return  tableFirstColumn;      
	}
    
	/**
	 * Create child element {@odf.element table:last-column}.
	 *
     * @param tableStyleNameAttributeValue  the <code>String</code> value of <code>TableStyleNameAttribute</code>, see {@odf.attribute  table:style-name} at specification
	 * @return   return  the element {@odf.element table:last-column}
	 * DifferentQName 
	 */
    
	public TableLastColumnElement newTableLastColumnElement(String tableStyleNameAttributeValue)
	{
		TableLastColumnElement  tableLastColumn = ((OdfFileDom)this.ownerDocument).newOdfElement(TableLastColumnElement.class);
		tableLastColumn.setTableStyleNameAttribute( tableStyleNameAttributeValue );
		this.appendChild( tableLastColumn);
		return  tableLastColumn;      
	}
    
	/**
	 * Create child element {@odf.element table:body}.
	 *
     * @param tableStyleNameAttributeValue  the <code>String</code> value of <code>TableStyleNameAttribute</code>, see {@odf.attribute  table:style-name} at specification
	 * @return   return  the element {@odf.element table:body}
	 * DifferentQName 
	 */
    
	public TableBodyElement newTableBodyElement(String tableStyleNameAttributeValue)
	{
		TableBodyElement  tableBody = ((OdfFileDom)this.ownerDocument).newOdfElement(TableBodyElement.class);
		tableBody.setTableStyleNameAttribute( tableStyleNameAttributeValue );
		this.appendChild( tableBody);
		return  tableBody;      
	}
    
	/**
	 * Create child element {@odf.element table:even-rows}.
	 *
     * @param tableStyleNameAttributeValue  the <code>String</code> value of <code>TableStyleNameAttribute</code>, see {@odf.attribute  table:style-name} at specification
	 * @return   return  the element {@odf.element table:even-rows}
	 * DifferentQName 
	 */
    
	public TableEvenRowsElement newTableEvenRowsElement(String tableStyleNameAttributeValue)
	{
		TableEvenRowsElement  tableEvenRows = ((OdfFileDom)this.ownerDocument).newOdfElement(TableEvenRowsElement.class);
		tableEvenRows.setTableStyleNameAttribute( tableStyleNameAttributeValue );
		this.appendChild( tableEvenRows);
		return  tableEvenRows;      
	}
    
	/**
	 * Create child element {@odf.element table:odd-rows}.
	 *
     * @param tableStyleNameAttributeValue  the <code>String</code> value of <code>TableStyleNameAttribute</code>, see {@odf.attribute  table:style-name} at specification
	 * @return   return  the element {@odf.element table:odd-rows}
	 * DifferentQName 
	 */
    
	public TableOddRowsElement newTableOddRowsElement(String tableStyleNameAttributeValue)
	{
		TableOddRowsElement  tableOddRows = ((OdfFileDom)this.ownerDocument).newOdfElement(TableOddRowsElement.class);
		tableOddRows.setTableStyleNameAttribute( tableStyleNameAttributeValue );
		this.appendChild( tableOddRows);
		return  tableOddRows;      
	}
    
	/**
	 * Create child element {@odf.element table:even-columns}.
	 *
     * @param tableStyleNameAttributeValue  the <code>String</code> value of <code>TableStyleNameAttribute</code>, see {@odf.attribute  table:style-name} at specification
	 * @return   return  the element {@odf.element table:even-columns}
	 * DifferentQName 
	 */
    
	public TableEvenColumnsElement newTableEvenColumnsElement(String tableStyleNameAttributeValue)
	{
		TableEvenColumnsElement  tableEvenColumns = ((OdfFileDom)this.ownerDocument).newOdfElement(TableEvenColumnsElement.class);
		tableEvenColumns.setTableStyleNameAttribute( tableStyleNameAttributeValue );
		this.appendChild( tableEvenColumns);
		return  tableEvenColumns;      
	}
    
	/**
	 * Create child element {@odf.element table:odd-columns}.
	 *
     * @param tableStyleNameAttributeValue  the <code>String</code> value of <code>TableStyleNameAttribute</code>, see {@odf.attribute  table:style-name} at specification
	 * @return   return  the element {@odf.element table:odd-columns}
	 * DifferentQName 
	 */
    
	public TableOddColumnsElement newTableOddColumnsElement(String tableStyleNameAttributeValue)
	{
		TableOddColumnsElement  tableOddColumns = ((OdfFileDom)this.ownerDocument).newOdfElement(TableOddColumnsElement.class);
		tableOddColumns.setTableStyleNameAttribute( tableStyleNameAttributeValue );
		this.appendChild( tableOddColumns);
		return  tableOddColumns;      
	}
    
	/**
	 * Create child element {@odf.element table:background}.
	 *
     * @param tableStyleNameAttributeValue  the <code>String</code> value of <code>TableStyleNameAttribute</code>, see {@odf.attribute  table:style-name} at specification
	 * @return   return  the element {@odf.element table:background}
	 * DifferentQName 
	 */
    
	public TableBackgroundElement newTableBackgroundElement(String tableStyleNameAttributeValue)
	{
		TableBackgroundElement  tableBackground = ((OdfFileDom)this.ownerDocument).newOdfElement(TableBackgroundElement.class);
		tableBackground.setTableStyleNameAttribute( tableStyleNameAttributeValue );
		this.appendChild( tableBackground);
		return  tableBackground;      
	}
    
}