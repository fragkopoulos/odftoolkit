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
import org.odftoolkit.odfdom.dom.element.OdfStyleBase;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleDisplayNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextConsecutiveNumberingAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element text:list-style}.
 *
 */
public class TextListStyleElement extends OdfStyleBase
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TEXT, "list-style" );


	/**
	 * Create the instance of <code>TextListStyleElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextListStyleElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:list-style}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TextListStyleElement}
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
	 * Receives the value of the ODFDOM attribute representation <code>StyleDisplayNameAttribute</code> , See {@odf.attribute style:display-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleDisplayNameAttribute()
	{
		StyleDisplayNameAttribute attr = (StyleDisplayNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.STYLE), "display-name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleDisplayNameAttribute</code> , See {@odf.attribute style:display-name}
	 *
	 * @param styleDisplayNameValue   The type is <code>String</code>
	 */
	public void setStyleDisplayNameAttribute( String styleDisplayNameValue )
	{
		StyleDisplayNameAttribute attr =  new StyleDisplayNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleDisplayNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextConsecutiveNumberingAttribute</code> , See {@odf.attribute text:consecutive-numbering}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextConsecutiveNumberingAttribute()
	{
		TextConsecutiveNumberingAttribute attr = (TextConsecutiveNumberingAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.TEXT), "consecutive-numbering" ) ;
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TextConsecutiveNumberingAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextConsecutiveNumberingAttribute</code> , See {@odf.attribute text:consecutive-numbering}
	 *
	 * @param textConsecutiveNumberingValue   The type is <code>Boolean</code>
	 */
	public void setTextConsecutiveNumberingAttribute( Boolean textConsecutiveNumberingValue )
	{
		TextConsecutiveNumberingAttribute attr =  new TextConsecutiveNumberingAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( textConsecutiveNumberingValue.booleanValue() );
	}

	/**
	 * Create child element {@odf.element text:list-level-style-number}.
	 *
     * @param styleNumFormatAttributeValue  the <code>String</code> value of <code>StyleNumFormatAttribute</code>, see {@odf.attribute  style:num-format} at specification
	 * @param textLevelAttributeValue  the <code>int</code> value of <code>TextLevelAttribute</code>, see {@odf.attribute  text:level} at specification
	 * @return   return  the element {@odf.element text:list-level-style-number}
	 * DifferentQName 
	 */
    
	public TextListLevelStyleNumberElement newTextListLevelStyleNumberElement(String styleNumFormatAttributeValue, int textLevelAttributeValue)
	{
		TextListLevelStyleNumberElement  textListLevelStyleNumber = ((OdfFileDom)this.ownerDocument).newOdfElement(TextListLevelStyleNumberElement.class);
		textListLevelStyleNumber.setStyleNumFormatAttribute( styleNumFormatAttributeValue );
		textListLevelStyleNumber.setTextLevelAttribute( Integer.valueOf(textLevelAttributeValue) );
		this.appendChild( textListLevelStyleNumber);
		return  textListLevelStyleNumber;      
	}
    
	/**
	 * Create child element {@odf.element text:list-level-style-bullet}.
	 *
     * @param textBulletCharAttributeValue  the <code>String</code> value of <code>TextBulletCharAttribute</code>, see {@odf.attribute  text:bullet-char} at specification
	 * @param textLevelAttributeValue  the <code>int</code> value of <code>TextLevelAttribute</code>, see {@odf.attribute  text:level} at specification
	 * @return   return  the element {@odf.element text:list-level-style-bullet}
	 * DifferentQName 
	 */
    
	public TextListLevelStyleBulletElement newTextListLevelStyleBulletElement(String textBulletCharAttributeValue, int textLevelAttributeValue)
	{
		TextListLevelStyleBulletElement  textListLevelStyleBullet = ((OdfFileDom)this.ownerDocument).newOdfElement(TextListLevelStyleBulletElement.class);
		textListLevelStyleBullet.setTextBulletCharAttribute( textBulletCharAttributeValue );
		textListLevelStyleBullet.setTextLevelAttribute( Integer.valueOf(textLevelAttributeValue) );
		this.appendChild( textListLevelStyleBullet);
		return  textListLevelStyleBullet;      
	}
    
	/**
	 * Create child element {@odf.element text:list-level-style-image}.
	 *
     * @param textLevelAttributeValue  the <code>int</code> value of <code>TextLevelAttribute</code>, see {@odf.attribute  text:level} at specification
	 * @return   return  the element {@odf.element text:list-level-style-image}
	 * DifferentQName 
	 */
    
	public TextListLevelStyleImageElement newTextListLevelStyleImageElement(int textLevelAttributeValue)
	{
		TextListLevelStyleImageElement  textListLevelStyleImage = ((OdfFileDom)this.ownerDocument).newOdfElement(TextListLevelStyleImageElement.class);
		textListLevelStyleImage.setTextLevelAttribute( Integer.valueOf(textLevelAttributeValue) );
		this.appendChild( textListLevelStyleImage);
		return  textListLevelStyleImage;      
	}
    
}
