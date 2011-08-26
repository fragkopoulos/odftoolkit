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
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleDisplayNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StylePageLayoutNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNextStyleNameAttribute;

import org.odftoolkit.odfdom.dom.element.draw.DrawLayerSetElement;
import org.odftoolkit.odfdom.dom.element.form.FormFormElement;
import org.odftoolkit.odfdom.dom.element.xforms.XformsModelElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawRectElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawLineElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPolylineElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPolygonElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawRegularPolygonElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPathElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawCircleElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawEllipseElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawGElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPageThumbnailElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawFrameElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawMeasureElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawCaptionElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawConnectorElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawControlElement;
import org.odftoolkit.odfdom.dom.element.dr3d.Dr3dSceneElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawCustomShapeElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawAElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimAnimateElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimSetElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimAnimateMotionElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimAnimateColorElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimAnimateTransformElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimTransitionFilterElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimParElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimSeqElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimIterateElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimAudioElement;
import org.odftoolkit.odfdom.dom.element.anim.AnimCommandElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationNotesElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element style:master-page}.
 *
 */
public class StyleMasterPageElement extends OdfStylableElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.STYLE, "master-page" );


	/**
	 * Create the instance of <code>StyleMasterPageElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public StyleMasterPageElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME, OdfStyleFamily.DrawingPage, OdfName.newName(OdfDocumentNamespace.DRAW, "style-name" )	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element style:master-page}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  StyleMasterPageElement}
	 *
     * @param styleNameAttributeValue  The mandatory attribute {@odf.attribute  style:name}"
     * @param stylePageLayoutNameAttributeValue  The mandatory attribute {@odf.attribute  style:page-layout-name}"
     *
	 */
	public void init(String styleNameAttributeValue, String stylePageLayoutNameAttributeValue)
	{
		setStylePageLayoutNameAttribute( stylePageLayoutNameAttributeValue );
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
	 * Receives the value of the ODFDOM attribute representation <code>StylePageLayoutNameAttribute</code> , See {@odf.attribute style:page-layout-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStylePageLayoutNameAttribute()
	{
		StylePageLayoutNameAttribute attr = (StylePageLayoutNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.STYLE), "page-layout-name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StylePageLayoutNameAttribute</code> , See {@odf.attribute style:page-layout-name}
	 *
	 * @param stylePageLayoutNameValue   The type is <code>String</code>
	 */
	public void setStylePageLayoutNameAttribute( String stylePageLayoutNameValue )
	{
		StylePageLayoutNameAttribute attr =  new StylePageLayoutNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( stylePageLayoutNameValue );
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
	 * Receives the value of the ODFDOM attribute representation <code>StyleNextStyleNameAttribute</code> , See {@odf.attribute style:next-style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleNextStyleNameAttribute()
	{
		StyleNextStyleNameAttribute attr = (StyleNextStyleNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.STYLE), "next-style-name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleNextStyleNameAttribute</code> , See {@odf.attribute style:next-style-name}
	 *
	 * @param styleNextStyleNameValue   The type is <code>String</code>
	 */
	public void setStyleNextStyleNameAttribute( String styleNextStyleNameValue )
	{
		StyleNextStyleNameAttribute attr =  new StyleNextStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleNextStyleNameValue );
	}

	/**
	 * Create child element {@odf.element style:header}.
	 *
	 * @return   return  the element {@odf.element style:header}
	 * DifferentQName 
	 */
	public StyleHeaderElement newStyleHeaderElement()
	{
		StyleHeaderElement  styleHeader = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleHeaderElement.class);
		this.appendChild( styleHeader);
		return  styleHeader;
	}                   
               
	/**
	 * Create child element {@odf.element style:header-left}.
	 *
	 * @return   return  the element {@odf.element style:header-left}
	 * DifferentQName 
	 */
	public StyleHeaderLeftElement newStyleHeaderLeftElement()
	{
		StyleHeaderLeftElement  styleHeaderLeft = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleHeaderLeftElement.class);
		this.appendChild( styleHeaderLeft);
		return  styleHeaderLeft;
	}                   
               
	/**
	 * Create child element {@odf.element style:footer}.
	 *
	 * @return   return  the element {@odf.element style:footer}
	 * DifferentQName 
	 */
	public StyleFooterElement newStyleFooterElement()
	{
		StyleFooterElement  styleFooter = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleFooterElement.class);
		this.appendChild( styleFooter);
		return  styleFooter;
	}                   
               
	/**
	 * Create child element {@odf.element style:footer-left}.
	 *
	 * @return   return  the element {@odf.element style:footer-left}
	 * DifferentQName 
	 */
	public StyleFooterLeftElement newStyleFooterLeftElement()
	{
		StyleFooterLeftElement  styleFooterLeft = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleFooterLeftElement.class);
		this.appendChild( styleFooterLeft);
		return  styleFooterLeft;
	}                   
               
	/**
	 * Create child element {@odf.element draw:layer-set}.
	 *
	 * @return   return  the element {@odf.element draw:layer-set}
	 * DifferentQName 
	 */
	public DrawLayerSetElement newDrawLayerSetElement()
	{
		DrawLayerSetElement  drawLayerSet = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawLayerSetElement.class);
		this.appendChild( drawLayerSet);
		return  drawLayerSet;
	}                   
               
	/**
	 * Create child element {@odf.element form:form}.
	 *
	 * @return   return  the element {@odf.element form:form}
	 * DifferentQName 
	 */
	public FormFormElement newFormFormElement()
	{
		FormFormElement  formForm = ((OdfFileDom)this.ownerDocument).newOdfElement(FormFormElement.class);
		this.appendChild( formForm);
		return  formForm;
	}                   
               
	/**
	 * Create child element {@odf.element xforms:model}.
	 *
	 * @return   return  the element {@odf.element xforms:model}
	 * DifferentQName 
	 */
	public XformsModelElement newXformsModelElement()
	{
		XformsModelElement  xformsModel = ((OdfFileDom)this.ownerDocument).newOdfElement(XformsModelElement.class);
		this.appendChild( xformsModel);
		return  xformsModel;
	}                   
               
	/**
	 * Create child element {@odf.element draw:rect}.
	 *
	 * @return   return  the element {@odf.element draw:rect}
	 * DifferentQName 
	 */
	public DrawRectElement newDrawRectElement()
	{
		DrawRectElement  drawRect = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawRectElement.class);
		this.appendChild( drawRect);
		return  drawRect;
	}                   
               
	/**
	 * Create child element {@odf.element draw:line}.
	 *
     * @param svgX1AttributeValue  the <code>String</code> value of <code>SvgX1Attribute</code>, see {@odf.attribute  svg:x1} at specification
	 * @param svgX2AttributeValue  the <code>String</code> value of <code>SvgX2Attribute</code>, see {@odf.attribute  svg:x2} at specification
	 * @param svgY1AttributeValue  the <code>String</code> value of <code>SvgY1Attribute</code>, see {@odf.attribute  svg:y1} at specification
	 * @param svgY2AttributeValue  the <code>String</code> value of <code>SvgY2Attribute</code>, see {@odf.attribute  svg:y2} at specification
	 * @return   return  the element {@odf.element draw:line}
	 * DifferentQName 
	 */
    
	public DrawLineElement newDrawLineElement(String svgX1AttributeValue, String svgX2AttributeValue, String svgY1AttributeValue, String svgY2AttributeValue)
	{
		DrawLineElement  drawLine = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawLineElement.class);
		drawLine.setSvgX1Attribute( svgX1AttributeValue );
		drawLine.setSvgX2Attribute( svgX2AttributeValue );
		drawLine.setSvgY1Attribute( svgY1AttributeValue );
		drawLine.setSvgY2Attribute( svgY2AttributeValue );
		this.appendChild( drawLine);
		return  drawLine;      
	}
    
	/**
	 * Create child element {@odf.element draw:polyline}.
	 *
     * @param drawPointsAttributeValue  the <code>String</code> value of <code>DrawPointsAttribute</code>, see {@odf.attribute  draw:points} at specification
	 * @param svgViewBoxAttributeValue  the <code>String</code> value of <code>SvgViewBoxAttribute</code>, see {@odf.attribute  svg:viewBox} at specification
	 * @return   return  the element {@odf.element draw:polyline}
	 * DifferentQName 
	 */
    
	public DrawPolylineElement newDrawPolylineElement(String drawPointsAttributeValue, String svgViewBoxAttributeValue)
	{
		DrawPolylineElement  drawPolyline = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawPolylineElement.class);
		drawPolyline.setDrawPointsAttribute( drawPointsAttributeValue );
		drawPolyline.setSvgViewBoxAttribute( svgViewBoxAttributeValue );
		this.appendChild( drawPolyline);
		return  drawPolyline;      
	}
    
	/**
	 * Create child element {@odf.element draw:polygon}.
	 *
     * @param drawPointsAttributeValue  the <code>String</code> value of <code>DrawPointsAttribute</code>, see {@odf.attribute  draw:points} at specification
	 * @param svgViewBoxAttributeValue  the <code>String</code> value of <code>SvgViewBoxAttribute</code>, see {@odf.attribute  svg:viewBox} at specification
	 * @return   return  the element {@odf.element draw:polygon}
	 * DifferentQName 
	 */
    
	public DrawPolygonElement newDrawPolygonElement(String drawPointsAttributeValue, String svgViewBoxAttributeValue)
	{
		DrawPolygonElement  drawPolygon = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawPolygonElement.class);
		drawPolygon.setDrawPointsAttribute( drawPointsAttributeValue );
		drawPolygon.setSvgViewBoxAttribute( svgViewBoxAttributeValue );
		this.appendChild( drawPolygon);
		return  drawPolygon;      
	}
    
	/**
	 * Create child element {@odf.element draw:regular-polygon}.
	 *
     * @param drawConcaveAttributeValue  the <code>boolean</code> value of <code>DrawConcaveAttribute</code>, see {@odf.attribute  draw:concave} at specification
	 * @param drawCornersAttributeValue  the <code>int</code> value of <code>DrawCornersAttribute</code>, see {@odf.attribute  draw:corners} at specification
	 * @return   return  the element {@odf.element draw:regular-polygon}
	 * DifferentQName 
	 */
    
	public DrawRegularPolygonElement newDrawRegularPolygonElement(boolean drawConcaveAttributeValue, int drawCornersAttributeValue)
	{
		DrawRegularPolygonElement  drawRegularPolygon = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawRegularPolygonElement.class);
		drawRegularPolygon.setDrawConcaveAttribute( Boolean.valueOf(drawConcaveAttributeValue) );
		drawRegularPolygon.setDrawCornersAttribute( Integer.valueOf(drawCornersAttributeValue) );
		this.appendChild( drawRegularPolygon);
		return  drawRegularPolygon;      
	}
    
	/**
	 * Create child element {@odf.element draw:path}.
	 *
     * @param svgDAttributeValue  the <code>String</code> value of <code>SvgDAttribute</code>, see {@odf.attribute  svg:d} at specification
	 * @param svgViewBoxAttributeValue  the <code>String</code> value of <code>SvgViewBoxAttribute</code>, see {@odf.attribute  svg:viewBox} at specification
	 * @return   return  the element {@odf.element draw:path}
	 * DifferentQName 
	 */
    
	public DrawPathElement newDrawPathElement(String svgDAttributeValue, String svgViewBoxAttributeValue)
	{
		DrawPathElement  drawPath = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawPathElement.class);
		drawPath.setSvgDAttribute( svgDAttributeValue );
		drawPath.setSvgViewBoxAttribute( svgViewBoxAttributeValue );
		this.appendChild( drawPath);
		return  drawPath;      
	}
    
	/**
	 * Create child element {@odf.element draw:circle}.
	 *
	 * @return   return  the element {@odf.element draw:circle}
	 * DifferentQName 
	 */
	public DrawCircleElement newDrawCircleElement()
	{
		DrawCircleElement  drawCircle = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawCircleElement.class);
		this.appendChild( drawCircle);
		return  drawCircle;
	}                   
               
	/**
	 * Create child element {@odf.element draw:ellipse}.
	 *
	 * @return   return  the element {@odf.element draw:ellipse}
	 * DifferentQName 
	 */
	public DrawEllipseElement newDrawEllipseElement()
	{
		DrawEllipseElement  drawEllipse = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawEllipseElement.class);
		this.appendChild( drawEllipse);
		return  drawEllipse;
	}                   
               
	/**
	 * Create child element {@odf.element draw:g}.
	 *
	 * @return   return  the element {@odf.element draw:g}
	 * DifferentQName 
	 */
	public DrawGElement newDrawGElement()
	{
		DrawGElement  drawG = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawGElement.class);
		this.appendChild( drawG);
		return  drawG;
	}                   
               
	/**
	 * Create child element {@odf.element draw:page-thumbnail}.
	 *
	 * @return   return  the element {@odf.element draw:page-thumbnail}
	 * DifferentQName 
	 */
	public DrawPageThumbnailElement newDrawPageThumbnailElement()
	{
		DrawPageThumbnailElement  drawPageThumbnail = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawPageThumbnailElement.class);
		this.appendChild( drawPageThumbnail);
		return  drawPageThumbnail;
	}                   
               
	/**
	 * Create child element {@odf.element draw:frame}.
	 *
	 * @return   return  the element {@odf.element draw:frame}
	 * DifferentQName 
	 */
	public DrawFrameElement newDrawFrameElement()
	{
		DrawFrameElement  drawFrame = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawFrameElement.class);
		this.appendChild( drawFrame);
		return  drawFrame;
	}                   
               
	/**
	 * Create child element {@odf.element draw:measure}.
	 *
     * @param svgX1AttributeValue  the <code>String</code> value of <code>SvgX1Attribute</code>, see {@odf.attribute  svg:x1} at specification
	 * @param svgX2AttributeValue  the <code>String</code> value of <code>SvgX2Attribute</code>, see {@odf.attribute  svg:x2} at specification
	 * @param svgY1AttributeValue  the <code>String</code> value of <code>SvgY1Attribute</code>, see {@odf.attribute  svg:y1} at specification
	 * @param svgY2AttributeValue  the <code>String</code> value of <code>SvgY2Attribute</code>, see {@odf.attribute  svg:y2} at specification
	 * @return   return  the element {@odf.element draw:measure}
	 * DifferentQName 
	 */
    
	public DrawMeasureElement newDrawMeasureElement(String svgX1AttributeValue, String svgX2AttributeValue, String svgY1AttributeValue, String svgY2AttributeValue)
	{
		DrawMeasureElement  drawMeasure = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawMeasureElement.class);
		drawMeasure.setSvgX1Attribute( svgX1AttributeValue );
		drawMeasure.setSvgX2Attribute( svgX2AttributeValue );
		drawMeasure.setSvgY1Attribute( svgY1AttributeValue );
		drawMeasure.setSvgY2Attribute( svgY2AttributeValue );
		this.appendChild( drawMeasure);
		return  drawMeasure;      
	}
    
	/**
	 * Create child element {@odf.element draw:caption}.
	 *
	 * @return   return  the element {@odf.element draw:caption}
	 * DifferentQName 
	 */
	public DrawCaptionElement newDrawCaptionElement()
	{
		DrawCaptionElement  drawCaption = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawCaptionElement.class);
		this.appendChild( drawCaption);
		return  drawCaption;
	}                   
               
	/**
	 * Create child element {@odf.element draw:connector}.
	 *
     * @param svgViewBoxAttributeValue  the <code>String</code> value of <code>SvgViewBoxAttribute</code>, see {@odf.attribute  svg:viewBox} at specification
	 * @return   return  the element {@odf.element draw:connector}
	 * DifferentQName 
	 */
    
	public DrawConnectorElement newDrawConnectorElement(String svgViewBoxAttributeValue)
	{
		DrawConnectorElement  drawConnector = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawConnectorElement.class);
		drawConnector.setSvgViewBoxAttribute( svgViewBoxAttributeValue );
		this.appendChild( drawConnector);
		return  drawConnector;      
	}
    
	/**
	 * Create child element {@odf.element draw:control}.
	 *
     * @param drawControlAttributeValue  the <code>String</code> value of <code>DrawControlAttribute</code>, see {@odf.attribute  draw:control} at specification
	 * @return   return  the element {@odf.element draw:control}
	 * DifferentQName 
	 */
    
	public DrawControlElement newDrawControlElement(String drawControlAttributeValue)
	{
		DrawControlElement  drawControl = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawControlElement.class);
		drawControl.setDrawControlAttribute( drawControlAttributeValue );
		this.appendChild( drawControl);
		return  drawControl;      
	}
    
	/**
	 * Create child element {@odf.element dr3d:scene}.
	 *
	 * @return   return  the element {@odf.element dr3d:scene}
	 * DifferentQName 
	 */
	public Dr3dSceneElement newDr3dSceneElement()
	{
		Dr3dSceneElement  dr3dScene = ((OdfFileDom)this.ownerDocument).newOdfElement(Dr3dSceneElement.class);
		this.appendChild( dr3dScene);
		return  dr3dScene;
	}                   
               
	/**
	 * Create child element {@odf.element draw:custom-shape}.
	 *
	 * @return   return  the element {@odf.element draw:custom-shape}
	 * DifferentQName 
	 */
	public DrawCustomShapeElement newDrawCustomShapeElement()
	{
		DrawCustomShapeElement  drawCustomShape = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawCustomShapeElement.class);
		this.appendChild( drawCustomShape);
		return  drawCustomShape;
	}                   
               
	/**
	 * Create child element {@odf.element draw:a}.
	 *
     * @param xlinkHrefAttributeValue  the <code>String</code> value of <code>XlinkHrefAttribute</code>, see {@odf.attribute  xlink:href} at specification
	 * @param xlinkTypeAttributeValue  the <code>String</code> value of <code>XlinkTypeAttribute</code>, see {@odf.attribute  xlink:type} at specification
	 * @return   return  the element {@odf.element draw:a}
	 * DifferentQName 
	 */
    
	public DrawAElement newDrawAElement(String xlinkHrefAttributeValue, String xlinkTypeAttributeValue)
	{
		DrawAElement  drawA = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawAElement.class);
		drawA.setXlinkHrefAttribute( xlinkHrefAttributeValue );
		drawA.setXlinkTypeAttribute( xlinkTypeAttributeValue );
		this.appendChild( drawA);
		return  drawA;      
	}
    
	/**
	 * Create child element {@odf.element anim:animate}.
	 *
     * @param smilAttributeNameAttributeValue  the <code>String</code> value of <code>SmilAttributeNameAttribute</code>, see {@odf.attribute  smil:attributeName} at specification
	 * @return   return  the element {@odf.element anim:animate}
	 * DifferentQName 
	 */
    
	public AnimAnimateElement newAnimAnimateElement(String smilAttributeNameAttributeValue)
	{
		AnimAnimateElement  animAnimate = ((OdfFileDom)this.ownerDocument).newOdfElement(AnimAnimateElement.class);
		animAnimate.setSmilAttributeNameAttribute( smilAttributeNameAttributeValue );
		this.appendChild( animAnimate);
		return  animAnimate;      
	}
    
	/**
	 * Create child element {@odf.element anim:set}.
	 *
     * @param smilAttributeNameAttributeValue  the <code>String</code> value of <code>SmilAttributeNameAttribute</code>, see {@odf.attribute  smil:attributeName} at specification
	 * @return   return  the element {@odf.element anim:set}
	 * DifferentQName 
	 */
    
	public AnimSetElement newAnimSetElement(String smilAttributeNameAttributeValue)
	{
		AnimSetElement  animSet = ((OdfFileDom)this.ownerDocument).newOdfElement(AnimSetElement.class);
		animSet.setSmilAttributeNameAttribute( smilAttributeNameAttributeValue );
		this.appendChild( animSet);
		return  animSet;      
	}
    
	/**
	 * Create child element {@odf.element anim:animateMotion}.
	 *
     * @param smilAttributeNameAttributeValue  the <code>String</code> value of <code>SmilAttributeNameAttribute</code>, see {@odf.attribute  smil:attributeName} at specification
	 * @return   return  the element {@odf.element anim:animateMotion}
	 * DifferentQName 
	 */
    
	public AnimAnimateMotionElement newAnimAnimateMotionElement(String smilAttributeNameAttributeValue)
	{
		AnimAnimateMotionElement  animAnimateMotion = ((OdfFileDom)this.ownerDocument).newOdfElement(AnimAnimateMotionElement.class);
		animAnimateMotion.setSmilAttributeNameAttribute( smilAttributeNameAttributeValue );
		this.appendChild( animAnimateMotion);
		return  animAnimateMotion;      
	}
    
	/**
	 * Create child element {@odf.element anim:animateColor}.
	 *
     * @param smilAttributeNameAttributeValue  the <code>String</code> value of <code>SmilAttributeNameAttribute</code>, see {@odf.attribute  smil:attributeName} at specification
	 * @return   return  the element {@odf.element anim:animateColor}
	 * DifferentQName 
	 */
    
	public AnimAnimateColorElement newAnimAnimateColorElement(String smilAttributeNameAttributeValue)
	{
		AnimAnimateColorElement  animAnimateColor = ((OdfFileDom)this.ownerDocument).newOdfElement(AnimAnimateColorElement.class);
		animAnimateColor.setSmilAttributeNameAttribute( smilAttributeNameAttributeValue );
		this.appendChild( animAnimateColor);
		return  animAnimateColor;      
	}
    
	/**
	 * Create child element {@odf.element anim:animateTransform}.
	 *
     * @param smilAttributeNameAttributeValue  the <code>String</code> value of <code>SmilAttributeNameAttribute</code>, see {@odf.attribute  smil:attributeName} at specification
	 * @param svgTypeAttributeValue  the <code>String</code> value of <code>SvgTypeAttribute</code>, see {@odf.attribute  svg:type} at specification
	 * @return   return  the element {@odf.element anim:animateTransform}
	 * DifferentQName 
	 */
    
	public AnimAnimateTransformElement newAnimAnimateTransformElement(String smilAttributeNameAttributeValue, String svgTypeAttributeValue)
	{
		AnimAnimateTransformElement  animAnimateTransform = ((OdfFileDom)this.ownerDocument).newOdfElement(AnimAnimateTransformElement.class);
		animAnimateTransform.setSmilAttributeNameAttribute( smilAttributeNameAttributeValue );
		animAnimateTransform.setSvgTypeAttribute( svgTypeAttributeValue );
		this.appendChild( animAnimateTransform);
		return  animAnimateTransform;      
	}
    
	/**
	 * Create child element {@odf.element anim:transitionFilter}.
	 *
     * @param smilTypeAttributeValue  the <code>String</code> value of <code>SmilTypeAttribute</code>, see {@odf.attribute  smil:type} at specification
	 * @return   return  the element {@odf.element anim:transitionFilter}
	 * DifferentQName 
	 */
    
	public AnimTransitionFilterElement newAnimTransitionFilterElement(String smilTypeAttributeValue)
	{
		AnimTransitionFilterElement  animTransitionFilter = ((OdfFileDom)this.ownerDocument).newOdfElement(AnimTransitionFilterElement.class);
		animTransitionFilter.setSmilTypeAttribute( smilTypeAttributeValue );
		this.appendChild( animTransitionFilter);
		return  animTransitionFilter;      
	}
    
	/**
	 * Create child element {@odf.element anim:par}.
	 *
	 * @return   return  the element {@odf.element anim:par}
	 * DifferentQName 
	 */
	public AnimParElement newAnimParElement()
	{
		AnimParElement  animPar = ((OdfFileDom)this.ownerDocument).newOdfElement(AnimParElement.class);
		this.appendChild( animPar);
		return  animPar;
	}                   
               
	/**
	 * Create child element {@odf.element anim:seq}.
	 *
	 * @return   return  the element {@odf.element anim:seq}
	 * DifferentQName 
	 */
	public AnimSeqElement newAnimSeqElement()
	{
		AnimSeqElement  animSeq = ((OdfFileDom)this.ownerDocument).newOdfElement(AnimSeqElement.class);
		this.appendChild( animSeq);
		return  animSeq;
	}                   
               
	/**
	 * Create child element {@odf.element anim:iterate}.
	 *
	 * @return   return  the element {@odf.element anim:iterate}
	 * DifferentQName 
	 */
	public AnimIterateElement newAnimIterateElement()
	{
		AnimIterateElement  animIterate = ((OdfFileDom)this.ownerDocument).newOdfElement(AnimIterateElement.class);
		this.appendChild( animIterate);
		return  animIterate;
	}                   
               
	/**
	 * Create child element {@odf.element anim:audio}.
	 *
	 * @return   return  the element {@odf.element anim:audio}
	 * DifferentQName 
	 */
	public AnimAudioElement newAnimAudioElement()
	{
		AnimAudioElement  animAudio = ((OdfFileDom)this.ownerDocument).newOdfElement(AnimAudioElement.class);
		this.appendChild( animAudio);
		return  animAudio;
	}                   
               
	/**
	 * Create child element {@odf.element anim:command}.
	 *
     * @param animCommandAttributeValue  the <code>String</code> value of <code>AnimCommandAttribute</code>, see {@odf.attribute  anim:command} at specification
	 * @return   return  the element {@odf.element anim:command}
	 * DifferentQName 
	 */
    
	public AnimCommandElement newAnimCommandElement(String animCommandAttributeValue)
	{
		AnimCommandElement  animCommand = ((OdfFileDom)this.ownerDocument).newOdfElement(AnimCommandElement.class);
		animCommand.setAnimCommandAttribute( animCommandAttributeValue );
		this.appendChild( animCommand);
		return  animCommand;      
	}
    
	/**
	 * Create child element {@odf.element presentation:notes}.
	 *
	 * @return   return  the element {@odf.element presentation:notes}
	 * DifferentQName 
	 */
	public PresentationNotesElement newPresentationNotesElement()
	{
		PresentationNotesElement  presentationNotes = ((OdfFileDom)this.ownerDocument).newOdfElement(PresentationNotesElement.class);
		this.appendChild( presentationNotes);
		return  presentationNotes;
	}                   
               
}
