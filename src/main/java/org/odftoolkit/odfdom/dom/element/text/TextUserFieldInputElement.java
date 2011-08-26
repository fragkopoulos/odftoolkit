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

package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.pkg.OdfNamespace;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.text.TextNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextDescriptionAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleDataStyleNameAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element text:user-field-input}.
 *
 */
public class TextUserFieldInputElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TEXT, "user-field-input" );


	/**
	 * Create the instance of <code>TextUserFieldInputElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextUserFieldInputElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:user-field-input}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TextUserFieldInputElement}
	 *
     * @param textNameAttributeValue  The mandatory attribute {@odf.attribute  text:name}"
     *
	 */
	public void init(String textNameAttributeValue)
	{
		setTextNameAttribute( textNameAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextNameAttribute</code> , See {@odf.attribute text:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextNameAttribute()
	{
		TextNameAttribute attr = (TextNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.TEXT), "name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextNameAttribute</code> , See {@odf.attribute text:name}
	 *
	 * @param textNameValue   The type is <code>String</code>
	 */
	public void setTextNameAttribute( String textNameValue )
	{
		TextNameAttribute attr =  new TextNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextDescriptionAttribute</code> , See {@odf.attribute text:description}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextDescriptionAttribute()
	{
		TextDescriptionAttribute attr = (TextDescriptionAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.TEXT), "description" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextDescriptionAttribute</code> , See {@odf.attribute text:description}
	 *
	 * @param textDescriptionValue   The type is <code>String</code>
	 */
	public void setTextDescriptionAttribute( String textDescriptionValue )
	{
		TextDescriptionAttribute attr =  new TextDescriptionAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textDescriptionValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleDataStyleNameAttribute</code> , See {@odf.attribute style:data-style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleDataStyleNameAttribute()
	{
		StyleDataStyleNameAttribute attr = (StyleDataStyleNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.STYLE), "data-style-name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleDataStyleNameAttribute</code> , See {@odf.attribute style:data-style-name}
	 *
	 * @param styleDataStyleNameValue   The type is <code>String</code>
	 */
	public void setStyleDataStyleNameAttribute( String styleDataStyleNameValue )
	{
		StyleDataStyleNameAttribute attr =  new StyleDataStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleDataStyleNameValue );
	}

}
