package com.bytedance.p702im.sugar.input;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.p702im.sugar.input.C11504a.C11505a;

/* renamed from: com.bytedance.im.sugar.input.FuncLayoutView */
public class FuncLayoutView extends FrameLayout implements C11504a {

    /* renamed from: a */
    protected int f30851a;

    /* renamed from: b */
    protected C11505a f30852b;

    /* renamed from: c */
    protected final SparseArray<View> f30853c;

    /* renamed from: c */
    public final int mo22250c() {
        return this.f30851a;
    }

    /* renamed from: b */
    public final void mo22249b() {
        mo22246a(-1);
    }

    /* renamed from: a */
    public final boolean mo22248a() {
        if (this.f30851a != -1) {
            return true;
        }
        return false;
    }

    public void setOnPanelChangeListener(C11505a aVar) {
        this.f30852b = aVar;
    }

    public FuncLayoutView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo22246a(int i) {
        if (this.f30851a != i) {
            if (i == -1) {
                setVisibility(8);
                this.f30851a = i;
                if (this.f30852b != null) {
                    this.f30852b.mo22264a(i, null);
                }
            } else {
                View view = (View) this.f30853c.get(i);
                if (view != null) {
                    setVisibility(0);
                    int size = this.f30853c.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        int keyAt = this.f30853c.keyAt(i2);
                        if (keyAt != i) {
                            ((View) this.f30853c.get(keyAt)).setVisibility(8);
                        }
                    }
                    view.setVisibility(0);
                    this.f30851a = i;
                    if (this.f30852b != null) {
                        this.f30852b.mo22264a(i, view);
                    }
                }
            }
        }
    }

    public FuncLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo22247a(int i, View view) {
        if (i < 0) {
            throw new IllegalArgumentException("panelType must be more than 0 ");
        } else if (this.f30853c.get(i) == null) {
            this.f30853c.put(i, view);
            addView(view, new LayoutParams(-1, -1));
            view.setVisibility(8);
        }
    }

    public FuncLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30851a = -1;
        this.f30853c = new SparseArray<>();
    }
}
