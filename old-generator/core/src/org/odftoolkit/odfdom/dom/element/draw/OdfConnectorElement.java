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

package org.odftoolkit.odfdom.dom.element.draw;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.type.draw.OdfType;
import org.odftoolkit.odfdom.dom.type.OdfId;
import org.odftoolkit.odfdom.dom.type.OdfNonNegativeInteger;
import org.odftoolkit.odfdom.dom.type.OdfStyleName;


/**
 * ODF DOM Element implementation for element "<draw:connector>".
 */
public abstract class OdfConnectorElement extends OdfShapeElementBase
{        
    /**
	 * 
	 */
	private static final long serialVersionUID = 4039666781082212019L;
	public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DRAW, "connector" );

    public OdfConnectorElement( OdfFileDom _aOwnerDoc )
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
    public void init(Integer _aViewbox)
    {
        setViewbox( _aViewbox );
    }

    /**
     * Get value of attribute "draw:type".
     */
    public OdfType getType()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "type" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "standard";
        }

        return OdfType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:type".
     */
    public void setType( OdfType _aType )
    {                    
        String aStringVal = OdfType.toString( _aType );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "type" ), aStringVal );
    }

    /**
     * Get value of attribute "svg:x1".
     */
    public String getX1()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "x1" ) );
    }

    /**
     * Set value of attribute "svg:x1".
     */
    public void setX1( String _aX1 )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "x1" ), _aX1 );
    }

    /**
     * Get value of attribute "svg:y1".
     */
    public String getY1()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "y1" ) );
    }

    /**
     * Set value of attribute "svg:y1".
     */
    public void setY1( String _aY1 )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "y1" ), _aY1 );
    }

    /**
     * Get value of attribute "draw:start-shape".
     */
    public String getStartShape()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "start-shape" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:start-shape".
     */
    public void setStartShape( String _aStartShape )
    {                    
        String aStringVal = OdfId.toString( _aStartShape );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "start-shape" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:start-glue-point".
     */
    public Integer getStartGluePoint()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "start-glue-point" ) );
        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:start-glue-point".
     */
    public void setStartGluePoint( Integer _aStartGluePoint )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aStartGluePoint );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "start-glue-point" ), aStringVal );
    }

    /**
     * Get value of attribute "svg:x2".
     */
    public String getX2()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "x2" ) );
    }

    /**
     * Set value of attribute "svg:x2".
     */
    public void setX2( String _aX2 )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "x2" ), _aX2 );
    }

    /**
     * Get value of attribute "svg:y2".
     */
    public String getY2()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "y2" ) );
    }

    /**
     * Set value of attribute "svg:y2".
     */
    public void setY2( String _aY2 )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "y2" ), _aY2 );
    }

    /**
     * Get value of attribute "draw:end-shape".
     */
    public String getEndShape()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "end-shape" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:end-shape".
     */
    public void setEndShape( String _aEndShape )
    {                    
        String aStringVal = OdfId.toString( _aEndShape );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "end-shape" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:end-glue-point".
     */
    public Integer getEndGluePoint()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "end-glue-point" ) );
        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:end-glue-point".
     */
    public void setEndGluePoint( Integer _aEndGluePoint )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aEndGluePoint );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "end-glue-point" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:line-skew".
     */
    public String getLineSkew()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "line-skew" ) );
    }

    /**
     * Set value of attribute "draw:line-skew".
     */
    public void setLineSkew( String _aLineSkew )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "line-skew" ), _aLineSkew );
    }

    /**
     * Get value of attribute "svg:d".
     */
    public String getD()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "d" ) );
    }

    /**
     * Set value of attribute "svg:d".
     */
    public void setD( String _aD )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "d" ), _aD );
    }

    /**
     * Get value of attribute "draw:layer".
     */
    public String getLayer()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "layer" ) );
    }

    /**
     * Set value of attribute "draw:layer".
     */
    public void setLayer( String _aLayer )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "layer" ), _aLayer );
    }

    /**
     * Get value of attribute "draw:transform".
     */
    public String getTransform()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "transform" ) );
    }

    /**
     * Set value of attribute "draw:transform".
     */
    public void setTransform( String _aTransform )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "transform" ), _aTransform );
    }

    /**
     * Get value of attribute "draw:text-style-name".
     */
    public String getTextStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "text-style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:text-style-name".
     */
    public void setTextStyleName( String _aTextStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aTextStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "text-style-name" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:caption-id".
     */
    public String getCaptionId()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "caption-id" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:caption-id".
     */
    public void setCaptionId( String _aCaptionId )
    {                    
        String aStringVal = OdfId.toString( _aCaptionId );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "caption-id" ), aStringVal );
    }

    /**
     * Get value of attribute "svg:viewBox".
     */
    public Integer getViewbox()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SVG, "viewBox" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "svg:viewBox".
     */
    public void setViewbox( Integer _aViewbox )
    {                    
        String aStringVal = Integer.toString( _aViewbox );
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "viewBox" ), aStringVal );
    }

}
