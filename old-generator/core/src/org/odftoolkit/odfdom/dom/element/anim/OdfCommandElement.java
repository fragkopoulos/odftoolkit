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

package org.odftoolkit.odfdom.dom.element.anim;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.presentation.OdfNodeType;
import org.odftoolkit.odfdom.dom.type.presentation.OdfPresetClassType;
import org.odftoolkit.odfdom.dom.type.OdfId;


/**
 * ODF DOM Element implementation for element "<anim:command>".
 */
public abstract class OdfCommandElement extends OdfElement
{        
    /**
	 * 
	 */
	private static final long serialVersionUID = 3798509024023860405L;
	public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.ANIM, "command" );

    public OdfCommandElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aCommand)
    {
        setCommand( _aCommand );
    }

    /**
     * Get value of attribute "presentation:node-type".
     */
    public OdfNodeType getPresentationNode()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "node-type" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "default";
        }

        return OdfNodeType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:node-type".
     */
    public void setPresentationNode( OdfNodeType _aPresentationNode )
    {                    
        String aStringVal = OdfNodeType.toString( _aPresentationNode );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "node-type" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:preset-id".
     */
    public String getPresetId()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "preset-id" ) );
    }

    /**
     * Set value of attribute "presentation:preset-id".
     */
    public void setPresetId( String _aPresetId )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "preset-id" ), _aPresetId );
    }

    /**
     * Get value of attribute "presentation:preset-sub-type".
     */
    public String getPresetSubType()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "preset-sub-type" ) );
    }

    /**
     * Set value of attribute "presentation:preset-sub-type".
     */
    public void setPresetSubType( String _aPresetSubType )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "preset-sub-type" ), _aPresetSubType );
    }

    /**
     * Get value of attribute "presentation:preset-class".
     */
    public OdfPresetClassType getPresetClass()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "preset-class" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "custom";
        }

        return OdfPresetClassType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:preset-class".
     */
    public void setPresetClass( OdfPresetClassType _aPresetClass )
    {                    
        String aStringVal = OdfPresetClassType.toString( _aPresetClass );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "preset-class" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:master-element".
     */
    public String getMasterElement()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "master-element" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:master-element".
     */
    public void setMasterElement( String _aMasterElement )
    {                    
        String aStringVal = OdfId.toString( _aMasterElement );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "master-element" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:group-id".
     */
    public String getGroupId()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "group-id" ) );
    }

    /**
     * Set value of attribute "presentation:group-id".
     */
    public void setGroupId( String _aGroupId )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "group-id" ), _aGroupId );
    }

    /**
     * Get value of attribute "anim:id".
     */
    public String getId()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.ANIM, "id" ) );
    }

    /**
     * Set value of attribute "anim:id".
     */
    public void setId( String _aId )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.ANIM, "id" ), _aId );
    }

    /**
     * Get value of attribute "xml:id".
     */
    public String getXmlid()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.XML, "id" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "xml:id".
     */
    public void setXmlid( String _aXmlid )
    {                    
        String aStringVal = OdfId.toString( _aXmlid );
        setOdfAttribute( OdfName.get( OdfNamespace.XML, "id" ), aStringVal );
    }

    /**
     * Get value of attribute "anim:command".
     */
    public String getCommand()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.ANIM, "command" ) );
    }

    /**
     * Set value of attribute "anim:command".
     */
    public void setCommand( String _aCommand )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.ANIM, "command" ), _aCommand );
    }

    /**
     * Get value of attribute "smil:begin".
     */
    public String getBegin()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "begin" ) );
    }

    /**
     * Set value of attribute "smil:begin".
     */
    public void setBegin( String _aBegin )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "begin" ), _aBegin );
    }

    /**
     * Get value of attribute "smil:end".
     */
    public String getEnd()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "end" ) );
    }

    /**
     * Set value of attribute "smil:end".
     */
    public void setEnd( String _aEnd )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "end" ), _aEnd );
    }

    /**
     * Get value of attribute "smil:targetElement".
     */
    public String getTargetelement()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "targetElement" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:targetElement".
     */
    public void setTargetelement( String _aTargetelement )
    {                    
        String aStringVal = OdfId.toString( _aTargetelement );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "targetElement" ), aStringVal );
    }

    /**
     * Get value of attribute "anim:sub-item".
     */
    public String getSubItem()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.ANIM, "sub-item" ) );
    }

    /**
     * Set value of attribute "anim:sub-item".
     */
    public void setSubItem( String _aSubItem )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.ANIM, "sub-item" ), _aSubItem );
    }

}
