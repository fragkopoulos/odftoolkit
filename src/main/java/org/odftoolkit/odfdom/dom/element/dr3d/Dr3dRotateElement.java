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

package org.odftoolkit.odfdom.dom.element.dr3d;

import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.pkg.OdfNamespace;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.OdfStyleableShapeElement;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgViewBoxAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgDAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawZIndexAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawLayerAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawClassNamesAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationClassNamesAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dTransformAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element dr3d:rotate}.
 *
 */
public class Dr3dRotateElement extends OdfStyleableShapeElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DR3D, "rotate" );


	/**
	 * Create the instance of <code>Dr3dRotateElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public Dr3dRotateElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element dr3d:rotate}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  Dr3dRotateElement}
	 *
     * @param svgViewBoxAttributeValue  The mandatory attribute {@odf.attribute  svg:viewBox}"
     * @param svgDAttributeValue  The mandatory attribute {@odf.attribute  svg:d}"
     *
	 */
	public void init(String svgViewBoxAttributeValue, String svgDAttributeValue)
	{
		setSvgViewBoxAttribute( svgViewBoxAttributeValue );
		setSvgDAttribute( svgDAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgViewBoxAttribute</code> , See {@odf.attribute svg:viewBox}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgViewBoxAttribute()
	{
		SvgViewBoxAttribute attr = (SvgViewBoxAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.SVG), "viewBox" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgViewBoxAttribute</code> , See {@odf.attribute svg:viewBox}
	 *
	 * @param svgViewBoxValue   The type is <code>String</code>
	 */
	public void setSvgViewBoxAttribute( String svgViewBoxValue )
	{
		SvgViewBoxAttribute attr =  new SvgViewBoxAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( svgViewBoxValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgDAttribute</code> , See {@odf.attribute svg:d}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgDAttribute()
	{
		SvgDAttribute attr = (SvgDAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.SVG), "d" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgDAttribute</code> , See {@odf.attribute svg:d}
	 *
	 * @param svgDValue   The type is <code>String</code>
	 */
	public void setSvgDAttribute( String svgDValue )
	{
		SvgDAttribute attr =  new SvgDAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( svgDValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawZIndexAttribute</code> , See {@odf.attribute draw:z-index}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getDrawZIndexAttribute()
	{
		DrawZIndexAttribute attr = (DrawZIndexAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.DRAW), "z-index" ) ;
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawZIndexAttribute</code> , See {@odf.attribute draw:z-index}
	 *
	 * @param drawZIndexValue   The type is <code>Integer</code>
	 */
	public void setDrawZIndexAttribute( Integer drawZIndexValue )
	{
		DrawZIndexAttribute attr =  new DrawZIndexAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( drawZIndexValue.intValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawIdAttribute</code> , See {@odf.attribute draw:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawIdAttribute()
	{
		DrawIdAttribute attr = (DrawIdAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.DRAW), "id" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawIdAttribute</code> , See {@odf.attribute draw:id}
	 *
	 * @param drawIdValue   The type is <code>String</code>
	 */
	public void setDrawIdAttribute( String drawIdValue )
	{
		DrawIdAttribute attr =  new DrawIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawIdValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXmlIdAttribute()
	{
		XmlIdAttribute attr = (XmlIdAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.XML), "id" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @param xmlIdValue   The type is <code>String</code>
	 */
	public void setXmlIdAttribute( String xmlIdValue )
	{
		XmlIdAttribute attr =  new XmlIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xmlIdValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawLayerAttribute</code> , See {@odf.attribute draw:layer}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawLayerAttribute()
	{
		DrawLayerAttribute attr = (DrawLayerAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.DRAW), "layer" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawLayerAttribute</code> , See {@odf.attribute draw:layer}
	 *
	 * @param drawLayerValue   The type is <code>String</code>
	 */
	public void setDrawLayerAttribute( String drawLayerValue )
	{
		DrawLayerAttribute attr =  new DrawLayerAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawLayerValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawStyleNameAttribute</code> , See {@odf.attribute draw:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawStyleNameAttribute()
	{
		DrawStyleNameAttribute attr = (DrawStyleNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.DRAW), "style-name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawStyleNameAttribute</code> , See {@odf.attribute draw:style-name}
	 *
	 * @param drawStyleNameValue   The type is <code>String</code>
	 */
	public void setDrawStyleNameAttribute( String drawStyleNameValue )
	{
		DrawStyleNameAttribute attr =  new DrawStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawStyleNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawClassNamesAttribute</code> , See {@odf.attribute draw:class-names}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawClassNamesAttribute()
	{
		DrawClassNamesAttribute attr = (DrawClassNamesAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.DRAW), "class-names" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawClassNamesAttribute</code> , See {@odf.attribute draw:class-names}
	 *
	 * @param drawClassNamesValue   The type is <code>String</code>
	 */
	public void setDrawClassNamesAttribute( String drawClassNamesValue )
	{
		DrawClassNamesAttribute attr =  new DrawClassNamesAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawClassNamesValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationStyleNameAttribute</code> , See {@odf.attribute presentation:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationStyleNameAttribute()
	{
		PresentationStyleNameAttribute attr = (PresentationStyleNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.PRESENTATION), "style-name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationStyleNameAttribute</code> , See {@odf.attribute presentation:style-name}
	 *
	 * @param presentationStyleNameValue   The type is <code>String</code>
	 */
	public void setPresentationStyleNameAttribute( String presentationStyleNameValue )
	{
		PresentationStyleNameAttribute attr =  new PresentationStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( presentationStyleNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationClassNamesAttribute</code> , See {@odf.attribute presentation:class-names}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationClassNamesAttribute()
	{
		PresentationClassNamesAttribute attr = (PresentationClassNamesAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.PRESENTATION), "class-names" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationClassNamesAttribute</code> , See {@odf.attribute presentation:class-names}
	 *
	 * @param presentationClassNamesValue   The type is <code>String</code>
	 */
	public void setPresentationClassNamesAttribute( String presentationClassNamesValue )
	{
		PresentationClassNamesAttribute attr =  new PresentationClassNamesAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( presentationClassNamesValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dTransformAttribute</code> , See {@odf.attribute dr3d:transform}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dTransformAttribute()
	{
		Dr3dTransformAttribute attr = (Dr3dTransformAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.DR3D), "transform" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dTransformAttribute</code> , See {@odf.attribute dr3d:transform}
	 *
	 * @param dr3dTransformValue   The type is <code>String</code>
	 */
	public void setDr3dTransformAttribute( String dr3dTransformValue )
	{
		Dr3dTransformAttribute attr =  new Dr3dTransformAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dr3dTransformValue );
	}

}
