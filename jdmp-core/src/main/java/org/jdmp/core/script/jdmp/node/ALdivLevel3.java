/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.script.jdmp.node;

import org.jdmp.core.script.jdmp.analysis.*;

@SuppressWarnings("nls")
public final class ALdivLevel3 extends PLevel3
{
    private PLevel3 _left_;
    private TLdiv _ldiv_;
    private PLevel2 _right_;

    public ALdivLevel3()
    {
        // Constructor
    }

    public ALdivLevel3(
        @SuppressWarnings("hiding") PLevel3 _left_,
        @SuppressWarnings("hiding") TLdiv _ldiv_,
        @SuppressWarnings("hiding") PLevel2 _right_)
    {
        // Constructor
        setLeft(_left_);

        setLdiv(_ldiv_);

        setRight(_right_);

    }

    
    public Object clone()
    {
        return new ALdivLevel3(
            cloneNode(this._left_),
            cloneNode(this._ldiv_),
            cloneNode(this._right_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALdivLevel3(this);
    }

    public PLevel3 getLeft()
    {
        return this._left_;
    }

    public void setLeft(PLevel3 node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
    }

    public TLdiv getLdiv()
    {
        return this._ldiv_;
    }

    public void setLdiv(TLdiv node)
    {
        if(this._ldiv_ != null)
        {
            this._ldiv_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ldiv_ = node;
    }

    public PLevel2 getRight()
    {
        return this._right_;
    }

    public void setRight(PLevel2 node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    
    public String toString()
    {
        return ""
            + toString(this._left_)
            + toString(this._ldiv_)
            + toString(this._right_);
    }

    
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        if(this._ldiv_ == child)
        {
            this._ldiv_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._left_ == oldChild)
        {
            setLeft((PLevel3) newChild);
            return;
        }

        if(this._ldiv_ == oldChild)
        {
            setLdiv((TLdiv) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((PLevel2) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
