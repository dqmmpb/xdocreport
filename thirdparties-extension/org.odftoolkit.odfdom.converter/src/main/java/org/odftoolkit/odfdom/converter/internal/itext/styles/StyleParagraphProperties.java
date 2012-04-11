/**
 * Copyright (C) 2011 Angelo Zerr <angelo.zerr@gmail.com> and Pascal Leclercq <pascal.leclercq@gmail.com>
 *
 * All rights reserved.
 *
 * Permission is hereby granted, free  of charge, to any person obtaining
 * a  copy  of this  software  and  associated  documentation files  (the
 * "Software"), to  deal in  the Software without  restriction, including
 * without limitation  the rights to  use, copy, modify,  merge, publish,
 * distribute,  sublicense, and/or sell  copies of  the Software,  and to
 * permit persons to whom the Software  is furnished to do so, subject to
 * the following conditions:
 *
 * The  above  copyright  notice  and  this permission  notice  shall  be
 * included in all copies or substantial portions of the Software.
 *
 * THE  SOFTWARE IS  PROVIDED  "AS  IS", WITHOUT  WARRANTY  OF ANY  KIND,
 * EXPRESS OR  IMPLIED, INCLUDING  BUT NOT LIMITED  TO THE  WARRANTIES OF
 * MERCHANTABILITY,    FITNESS    FOR    A   PARTICULAR    PURPOSE    AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE,  ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package org.odftoolkit.odfdom.converter.internal.itext.styles;

import java.awt.Color;

import com.lowagie.text.Element;

/**
 * fixes for paragraph pdf conversion by Leszek Piotrowicz <leszekp@safe-mail.net>
 */
public class StyleParagraphProperties
{

    private int alignment = Element.ALIGN_UNDEFINED;

    private Boolean autoTextIndent;

    private Color backgroundColor;

    private StyleBorder border;

    private StyleBorder borderBottom;

    private StyleBorder borderLeft;

    private StyleBorder borderRight;

    private StyleBorder borderTop;

    private Boolean breakBeforeColumn;

    private Boolean breakBeforePage;

    private Boolean keepTogether;

    private Float lineHeight;

    private boolean lineHeightProportional = true;

    private Float margin;

    private Float marginBottom;

    private Float marginLeft;

    private Float marginRight;

    private Float marginTop;

    private Float textIndent;

    public StyleParagraphProperties()
    {
    }

    public StyleParagraphProperties( StyleParagraphProperties paragraphProperties )
    {
        if ( paragraphProperties != null )
        {
            merge( paragraphProperties );
        }
    }

    public void merge( StyleParagraphProperties paragraphProperties )
    {
        if ( paragraphProperties.getAlignment() != Element.ALIGN_UNDEFINED )
        {
            alignment = paragraphProperties.getAlignment();
        }
        if ( paragraphProperties.getAutoTextIndent() != null )
        {
            autoTextIndent = paragraphProperties.getAutoTextIndent();
        }
        if ( paragraphProperties.getBackgroundColor() != null )
        {
            backgroundColor = paragraphProperties.getBackgroundColor();
        }
        if ( paragraphProperties.getBorder() != null )
        {
            border = paragraphProperties.getBorder();
        }
        if ( paragraphProperties.getBorderBottom() != null )
        {
            borderBottom = paragraphProperties.getBorderBottom();
        }
        if ( paragraphProperties.getBorderLeft() != null )
        {
            borderLeft = paragraphProperties.getBorderLeft();
        }
        if ( paragraphProperties.getBorderRight() != null )
        {
            borderRight = paragraphProperties.getBorderRight();
        }
        if ( paragraphProperties.getBorderTop() != null )
        {
            borderTop = paragraphProperties.getBorderTop();
        }
        if ( paragraphProperties.getBreakBeforeColumn() != null )
        {
            breakBeforeColumn = paragraphProperties.getBreakBeforeColumn();
        }
        if ( paragraphProperties.getBreakBeforePage() != null )
        {
            breakBeforePage = paragraphProperties.getBreakBeforePage();
        }
        if ( paragraphProperties.getKeepTogether() != null )
        {
            keepTogether = paragraphProperties.getKeepTogether();
        }
        if ( paragraphProperties.getLineHeight() != null )
        {
            lineHeight = paragraphProperties.getLineHeight();
            lineHeightProportional = paragraphProperties.isLineHeightProportional();
        }
        if ( paragraphProperties.getMargin() != null )
        {
            margin = paragraphProperties.getMargin();
        }
        if ( paragraphProperties.getMarginBottom() != null )
        {
            marginBottom = paragraphProperties.getMarginBottom();
        }
        if ( paragraphProperties.getMarginLeft() != null )
        {
            marginLeft = paragraphProperties.getMarginLeft();
        }
        if ( paragraphProperties.getMarginRight() != null )
        {
            marginRight = paragraphProperties.getMarginRight();
        }
        if ( paragraphProperties.getMarginTop() != null )
        {
            marginTop = paragraphProperties.getMarginTop();
        }
        if ( paragraphProperties.getTextIndent() != null )
        {
            textIndent = paragraphProperties.getTextIndent();
        }
    }

    public int getAlignment()
    {
        return alignment;
    }

    public void setAlignment( int alignment )
    {
        this.alignment = alignment;
    }

    public Boolean getAutoTextIndent()
    {
        return autoTextIndent;
    }

    public void setAutoTextIndent( Boolean autoTextIndent )
    {
        this.autoTextIndent = autoTextIndent;
    }

    public Color getBackgroundColor()
    {
        return backgroundColor;
    }

    public void setBackgroundColor( Color backgroundColor )
    {
        this.backgroundColor = backgroundColor;
    }

    public StyleBorder getBorder()
    {
        return border;
    }

    public void setBorder( StyleBorder border )
    {
        this.border = border;
    }

    public StyleBorder getBorderBottom()
    {
        return borderBottom;
    }

    public void setBorderBottom( StyleBorder borderBottom )
    {
        this.borderBottom = borderBottom;
    }

    public StyleBorder getBorderLeft()
    {
        return borderLeft;
    }

    public void setBorderLeft( StyleBorder borderLeft )
    {
        this.borderLeft = borderLeft;
    }

    public StyleBorder getBorderRight()
    {
        return borderRight;
    }

    public void setBorderRight( StyleBorder borderRight )
    {
        this.borderRight = borderRight;
    }

    public StyleBorder getBorderTop()
    {
        return borderTop;
    }

    public void setBorderTop( StyleBorder borderTop )
    {
        this.borderTop = borderTop;
    }

    public Boolean getBreakBeforeColumn()
    {
        return breakBeforeColumn;
    }

    public void setBreakBeforeColumn( Boolean breakBeforeColumn )
    {
        this.breakBeforeColumn = breakBeforeColumn;
    }

    public Boolean getBreakBeforePage()
    {
        return breakBeforePage;
    }

    public void setBreakBeforePage( Boolean breakBeforePage )
    {
        this.breakBeforePage = breakBeforePage;
    }

    public Boolean getKeepTogether()
    {
        return keepTogether;
    }

    public void setKeepTogether( Boolean keepTogether )
    {
        this.keepTogether = keepTogether;
    }

    public Float getLineHeight()
    {
        return lineHeight;
    }

    public void setLineHeight( Float lineHeight )
    {
        this.lineHeight = lineHeight;
    }

    public boolean isLineHeightProportional()
    {
        return lineHeightProportional;
    }

    public void setLineHeightProportional( boolean lineHeightProportional )
    {
        this.lineHeightProportional = lineHeightProportional;
    }

    public Float getMargin()
    {
        return margin;
    }

    public void setMargin( Float margin )
    {
        this.margin = margin;
    }

    public Float getMarginBottom()
    {
        return marginBottom;
    }

    public void setMarginBottom( Float marginBottom )
    {
        this.marginBottom = marginBottom;
    }

    public Float getMarginLeft()
    {
        return marginLeft;
    }

    public void setMarginLeft( Float marginLeft )
    {
        this.marginLeft = marginLeft;
    }

    public Float getMarginRight()
    {
        return marginRight;
    }

    public void setMarginRight( Float marginRight )
    {
        this.marginRight = marginRight;
    }

    public Float getMarginTop()
    {
        return marginTop;
    }

    public void setMarginTop( Float marginTop )
    {
        this.marginTop = marginTop;
    }

    public Float getTextIndent()
    {
        return textIndent;
    }

    public void setTextIndent( Float textIndent )
    {
        this.textIndent = textIndent;
    }
}
