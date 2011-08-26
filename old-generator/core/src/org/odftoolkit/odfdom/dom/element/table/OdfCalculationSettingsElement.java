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

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;
import org.odftoolkit.odfdom.dom.type.OdfPositiveInteger;


/**
 * ODF DOM Element implementation for element "<table:calculation-settings>".
 */
public abstract class OdfCalculationSettingsElement extends OdfElement
{        
    /**
	 * 
	 */
	private static final long serialVersionUID = -3445960828328250785L;
	public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "calculation-settings" );

    public OdfCalculationSettingsElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    @Override
	public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "table:case-sensitive".
     */
    public Boolean getCaseSensitive()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "case-sensitive" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:case-sensitive".
     */
    public void setCaseSensitive( Boolean _aCaseSensitive )
    {                    
        String aStringVal = OdfBoolean.toString( _aCaseSensitive );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "case-sensitive" ), aStringVal );
    }

    /**
     * Get value of attribute "table:precision-as-shown".
     */
    public Boolean getPrecisionAsShown()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "precision-as-shown" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:precision-as-shown".
     */
    public void setPrecisionAsShown( Boolean _aPrecisionAsShown )
    {                    
        String aStringVal = OdfBoolean.toString( _aPrecisionAsShown );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "precision-as-shown" ), aStringVal );
    }

    /**
     * Get value of attribute "table:search-criteria-must-apply-to-whole-cell".
     */
    public Boolean getSearchCriteriaMustApplyToWholeCell()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "search-criteria-must-apply-to-whole-cell" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:search-criteria-must-apply-to-whole-cell".
     */
    public void setSearchCriteriaMustApplyToWholeCell( Boolean _aSearchCriteriaMustApplyToWholeCell )
    {                    
        String aStringVal = OdfBoolean.toString( _aSearchCriteriaMustApplyToWholeCell );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "search-criteria-must-apply-to-whole-cell" ), aStringVal );
    }

    /**
     * Get value of attribute "table:automatic-find-labels".
     */
    public Boolean getAutomaticFindLabels()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "automatic-find-labels" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:automatic-find-labels".
     */
    public void setAutomaticFindLabels( Boolean _aAutomaticFindLabels )
    {                    
        String aStringVal = OdfBoolean.toString( _aAutomaticFindLabels );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "automatic-find-labels" ), aStringVal );
    }

    /**
     * Get value of attribute "table:use-regular-expressions".
     */
    public Boolean getUseRegularExpressions()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "use-regular-expressions" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:use-regular-expressions".
     */
    public void setUseRegularExpressions( Boolean _aUseRegularExpressions )
    {                    
        String aStringVal = OdfBoolean.toString( _aUseRegularExpressions );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "use-regular-expressions" ), aStringVal );
    }

    /**
     * Get value of attribute "table:use-wildcards".
     */
    public Boolean getUseWildcards()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "use-wildcards" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:use-wildcards".
     */
    public void setUseWildcards( Boolean _aUseWildcards )
    {                    
        String aStringVal = OdfBoolean.toString( _aUseWildcards );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "use-wildcards" ), aStringVal );
    }

    /**
     * Get value of attribute "table:null-year".
     */
    public Integer getNullYear()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "null-year" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "1930";
        }

        return OdfPositiveInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:null-year".
     */
    public void setNullYear( Integer _aNullYear )
    {                    
        String aStringVal = OdfPositiveInteger.toString( _aNullYear );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "null-year" ), aStringVal );
    }

}
