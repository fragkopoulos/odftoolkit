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

package org.odftoolkit.odfdom.dom.element.draw;

import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.pkg.OdfNamespace;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawPointsAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgXAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgYAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgWidthAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgHeightAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgViewBoxAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawLayerAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawTransformAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawTextStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawCaptionIdAttribute;

import org.odftoolkit.odfdom.dom.element.svg.SvgTitleElement;
import org.odftoolkit.odfdom.dom.element.svg.SvgDescElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeEventListenersElement;
import org.odftoolkit.odfdom.dom.element.text.TextPElement;
import org.odftoolkit.odfdom.dom.element.text.TextListElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element draw:polyline}.
 *
 */
public class DrawPolylineElement extends DrawShapeElementBase
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DRAW, "polyline" );


	/**
	 * Create the instance of <code>DrawPolylineElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DrawPolylineElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element draw:polyline}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  DrawPolylineElement}
	 *
     * @param drawPointsAttributeValue  The mandatory attribute {@odf.attribute  draw:points}"
     * @param svgViewBoxAttributeValue  The mandatory attribute {@odf.attribute  svg:viewBox}"
     *
	 */
	public void init(String drawPointsAttributeValue, String svgViewBoxAttributeValue)
	{
		setDrawPointsAttribute( drawPointsAttributeValue );
		setSvgViewBoxAttribute( svgViewBoxAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawPointsAttribute</code> , See {@odf.attribute draw:points}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawPointsAttribute()
	{
		DrawPointsAttribute attr = (DrawPointsAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.DRAW), "points" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawPointsAttribute</code> , See {@odf.attribute draw:points}
	 *
	 * @param drawPointsValue   The type is <code>String</code>
	 */
	public void setDrawPointsAttribute( String drawPointsValue )
	{
		DrawPointsAttribute attr =  new DrawPointsAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawPointsValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgXAttribute</code> , See {@odf.attribute svg:x}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgXAttribute()
	{
		SvgXAttribute attr = (SvgXAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.SVG), "x" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgXAttribute</code> , See {@odf.attribute svg:x}
	 *
	 * @param svgXValue   The type is <code>String</code>
	 */
	public void setSvgXAttribute( String svgXValue )
	{
		SvgXAttribute attr =  new SvgXAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( svgXValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgYAttribute</code> , See {@odf.attribute svg:y}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgYAttribute()
	{
		SvgYAttribute attr = (SvgYAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.SVG), "y" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgYAttribute</code> , See {@odf.attribute svg:y}
	 *
	 * @param svgYValue   The type is <code>String</code>
	 */
	public void setSvgYAttribute( String svgYValue )
	{
		SvgYAttribute attr =  new SvgYAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( svgYValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgWidthAttribute</code> , See {@odf.attribute svg:width}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgWidthAttribute()
	{
		SvgWidthAttribute attr = (SvgWidthAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.SVG), "width" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgWidthAttribute</code> , See {@odf.attribute svg:width}
	 *
	 * @param svgWidthValue   The type is <code>String</code>
	 */
	public void setSvgWidthAttribute( String svgWidthValue )
	{
		SvgWidthAttribute attr =  new SvgWidthAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( svgWidthValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgHeightAttribute</code> , See {@odf.attribute svg:height}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgHeightAttribute()
	{
		SvgHeightAttribute attr = (SvgHeightAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.SVG), "height" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgHeightAttribute</code> , See {@odf.attribute svg:height}
	 *
	 * @param svgHeightValue   The type is <code>String</code>
	 */
	public void setSvgHeightAttribute( String svgHeightValue )
	{
		SvgHeightAttribute attr =  new SvgHeightAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( svgHeightValue );
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
	 * Receives the value of the ODFDOM attribute representation <code>DrawTransformAttribute</code> , See {@odf.attribute draw:transform}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawTransformAttribute()
	{
		DrawTransformAttribute attr = (DrawTransformAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.DRAW), "transform" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawTransformAttribute</code> , See {@odf.attribute draw:transform}
	 *
	 * @param drawTransformValue   The type is <code>String</code>
	 */
	public void setDrawTransformAttribute( String drawTransformValue )
	{
		DrawTransformAttribute attr =  new DrawTransformAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawTransformValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawTextStyleNameAttribute</code> , See {@odf.attribute draw:text-style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawTextStyleNameAttribute()
	{
		DrawTextStyleNameAttribute attr = (DrawTextStyleNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.DRAW), "text-style-name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawTextStyleNameAttribute</code> , See {@odf.attribute draw:text-style-name}
	 *
	 * @param drawTextStyleNameValue   The type is <code>String</code>
	 */
	public void setDrawTextStyleNameAttribute( String drawTextStyleNameValue )
	{
		DrawTextStyleNameAttribute attr =  new DrawTextStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawTextStyleNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawCaptionIdAttribute</code> , See {@odf.attribute draw:caption-id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawCaptionIdAttribute()
	{
		DrawCaptionIdAttribute attr = (DrawCaptionIdAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.DRAW), "caption-id" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawCaptionIdAttribute</code> , See {@odf.attribute draw:caption-id}
	 *
	 * @param drawCaptionIdValue   The type is <code>String</code>
	 */
	public void setDrawCaptionIdAttribute( String drawCaptionIdValue )
	{
		DrawCaptionIdAttribute attr =  new DrawCaptionIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawCaptionIdValue );
	}

	/**
	 * Create child element {@odf.element svg:title}.
	 *
	 * @return   return  the element {@odf.element svg:title}
	 * DifferentQName 
	 */
	public SvgTitleElement newSvgTitleElement()
	{
		SvgTitleElement  svgTitle = ((OdfFileDom)this.ownerDocument).newOdfElement(SvgTitleElement.class);
		this.appendChild( svgTitle);
		return  svgTitle;
	}                   
               
	/**
	 * Create child element {@odf.element svg:desc}.
	 *
	 * @return   return  the element {@odf.element svg:desc}
	 * DifferentQName 
	 */
	public SvgDescElement newSvgDescElement()
	{
		SvgDescElement  svgDesc = ((OdfFileDom)this.ownerDocument).newOdfElement(SvgDescElement.class);
		this.appendChild( svgDesc);
		return  svgDesc;
	}                   
               
	/**
	 * Create child element {@odf.element office:event-listeners}.
	 *
	 * @return   return  the element {@odf.element office:event-listeners}
	 * DifferentQName 
	 */
	public OfficeEventListenersElement newOfficeEventListenersElement()
	{
		OfficeEventListenersElement  officeEventListeners = ((OdfFileDom)this.ownerDocument).newOdfElement(OfficeEventListenersElement.class);
		this.appendChild( officeEventListeners);
		return  officeEventListeners;
	}                   
               
	/**
	 * Create child element {@odf.element draw:glue-point}.
	 *
     * @param drawEscapeDirectionAttributeValue  the <code>String</code> value of <code>DrawEscapeDirectionAttribute</code>, see {@odf.attribute  draw:escape-direction} at specification
	 * @param drawIdAttributeValue  the <code>String</code> value of <code>DrawIdAttribute</code>, see {@odf.attribute  draw:id} at specification
	 * @param svgXAttributeValue  the <code>String</code> value of <code>SvgXAttribute</code>, see {@odf.attribute  svg:x} at specification
	 * @param svgYAttributeValue  the <code>String</code> value of <code>SvgYAttribute</code>, see {@odf.attribute  svg:y} at specification
	 * @return   return  the element {@odf.element draw:glue-point}
	 * DifferentQName 
	 */
    
	public DrawGluePointElement newDrawGluePointElement(String drawEscapeDirectionAttributeValue, String drawIdAttributeValue, String svgXAttributeValue, String svgYAttributeValue)
	{
		DrawGluePointElement  drawGluePoint = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawGluePointElement.class);
		drawGluePoint.setDrawEscapeDirectionAttribute( drawEscapeDirectionAttributeValue );
		drawGluePoint.setDrawIdAttribute( drawIdAttributeValue );
		drawGluePoint.setSvgXAttribute( svgXAttributeValue );
		drawGluePoint.setSvgYAttribute( svgYAttributeValue );
		this.appendChild( drawGluePoint);
		return  drawGluePoint;      
	}
    
	/**
	 * Create child element {@odf.element text:p}.
	 *
	 * @return   return  the element {@odf.element text:p}
	 * DifferentQName 
	 */
	public TextPElement newTextPElement()
	{
		TextPElement  textP = ((OdfFileDom)this.ownerDocument).newOdfElement(TextPElement.class);
		this.appendChild( textP);
		return  textP;
	}                   
               
	/**
	 * Create child element {@odf.element text:list}.
	 *
	 * @return   return  the element {@odf.element text:list}
	 * DifferentQName 
	 */
	public TextListElement newTextListElement()
	{
		TextListElement  textList = ((OdfFileDom)this.ownerDocument).newOdfElement(TextListElement.class);
		this.appendChild( textList);
		return  textList;
	}                   
               
}
