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

package org.odftoolkit.odfdom.dom.element.style;

import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.pkg.OdfNamespace;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.OdfStyleBase;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StylePageUsageAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element style:page-layout}.
 *
 */
public class StylePageLayoutElement extends OdfStyleBase
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.STYLE, "page-layout" );


	/**
	 * Create the instance of <code>StylePageLayoutElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public StylePageLayoutElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element style:page-layout}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  StylePageLayoutElement}
	 *
     * @param styleNameAttributeValue  The mandatory attribute {@odf.attribute  style:name}"
     *
	 */
	public void init(String styleNameAttributeValue)
	{
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleNameAttribute</code> , See {@odf.attribute style:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleNameAttribute()
	{
		StyleNameAttribute attr = (StyleNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.STYLE), "name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleNameAttribute</code> , See {@odf.attribute style:name}
	 *
	 * @param styleNameValue   The type is <code>String</code>
	 */
	public void setStyleNameAttribute( String styleNameValue )
	{
		StyleNameAttribute attr =  new StyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StylePageUsageAttribute</code> , See {@odf.attribute style:page-usage}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStylePageUsageAttribute()
	{
		StylePageUsageAttribute attr = (StylePageUsageAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.STYLE), "page-usage" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return StylePageUsageAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StylePageUsageAttribute</code> , See {@odf.attribute style:page-usage}
	 *
	 * @param stylePageUsageValue   The type is <code>String</code>
	 */
	public void setStylePageUsageAttribute( String stylePageUsageValue )
	{
		StylePageUsageAttribute attr =  new StylePageUsageAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( stylePageUsageValue );
	}

	/**
	 * Create child element {@odf.element style:page-layout-properties}.
	 *
	 * @return   return  the element {@odf.element style:page-layout-properties}
	 * DifferentQName 
	 */
	public StylePageLayoutPropertiesElement newStylePageLayoutPropertiesElement()
	{
		StylePageLayoutPropertiesElement  stylePageLayoutProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StylePageLayoutPropertiesElement.class);
		this.appendChild( stylePageLayoutProperties);
		return  stylePageLayoutProperties;
	}                   
               
	/**
	 * Create child element {@odf.element style:header-style}.
	 *
	 * @return   return  the element {@odf.element style:header-style}
	 * DifferentQName 
	 */
	public StyleHeaderStyleElement newStyleHeaderStyleElement()
	{
		StyleHeaderStyleElement  styleHeaderStyle = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleHeaderStyleElement.class);
		this.appendChild( styleHeaderStyle);
		return  styleHeaderStyle;
	}                   
               
	/**
	 * Create child element {@odf.element style:footer-style}.
	 *
	 * @return   return  the element {@odf.element style:footer-style}
	 * DifferentQName 
	 */
	public StyleFooterStyleElement newStyleFooterStyleElement()
	{
		StyleFooterStyleElement  styleFooterStyle = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleFooterStyleElement.class);
		this.appendChild( styleFooterStyle);
		return  styleFooterStyle;
	}                   
               
}
