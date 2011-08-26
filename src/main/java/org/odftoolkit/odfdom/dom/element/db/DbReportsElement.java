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

package org.odftoolkit.odfdom.dom.element.db;

import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.pkg.OdfNamespace;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.pkg.OdfElement;


/**
 * DOM implementation of OpenDocument element  {@odf.element db:reports}.
 *
 */
public class DbReportsElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DB, "reports" );


	/**
	 * Create the instance of <code>DbReportsElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DbReportsElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element db:reports}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}


	/**
	 * Create child element {@odf.element db:component}.
	 *
     * @param dbNameAttributeValue  the <code>String</code> value of <code>DbNameAttribute</code>, see {@odf.attribute  db:name} at specification
	 * @return   return  the element {@odf.element db:component}
	 * DifferentQName 
	 */
    
	public DbComponentElement newDbComponentElement(String dbNameAttributeValue)
	{
		DbComponentElement  dbComponent = ((OdfFileDom)this.ownerDocument).newOdfElement(DbComponentElement.class);
		dbComponent.setDbNameAttribute( dbNameAttributeValue );
		this.appendChild( dbComponent);
		return  dbComponent;      
	}
    
	/**
	 * Create child element {@odf.element db:component-collection}.
	 *
     * @param dbNameAttributeValue  the <code>String</code> value of <code>DbNameAttribute</code>, see {@odf.attribute  db:name} at specification
	 * @return   return  the element {@odf.element db:component-collection}
	 * DifferentQName 
	 */
    
	public DbComponentCollectionElement newDbComponentCollectionElement(String dbNameAttributeValue)
	{
		DbComponentCollectionElement  dbComponentCollection = ((OdfFileDom)this.ownerDocument).newOdfElement(DbComponentCollectionElement.class);
		dbComponentCollection.setDbNameAttribute( dbNameAttributeValue );
		this.appendChild( dbComponentCollection);
		return  dbComponentCollection;      
	}
    
}
