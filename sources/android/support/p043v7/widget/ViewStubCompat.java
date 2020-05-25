package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.ViewStubCompat */
public final class ViewStubCompat extends View {

    /* renamed from: a */
    private int f4957a;

    /* renamed from: b */
    private int f4958b;

    /* renamed from: c */
    private WeakReference<View> f4959c;

    /* renamed from: d */
    private LayoutInflater f4960d;

    /* renamed from: e */
    private C1382a f4961e;

    /* renamed from: android.support.v7.widget.ViewStubCompat$a */
    public interface C1382a {
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
    }

    public final void draw(Canvas canvas) {
    }

    public final int getInflatedId() {
        return this.f4958b;
    }

    public final LayoutInflater getLayoutInflater() {
        return this.f4960d;
    }

    public final int getLayoutResource() {
        return this.f4957a;
    }

    /* renamed from: a */
    public final View mo5425a() {
        LayoutInflater layoutInflater;
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f4957a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (this.f4960d != null) {
                layoutInflater = this.f4960d;
            } else {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f4957a, viewGroup, false);
            if (this.f4958b != -1) {
                inflate.setId(this.f4958b);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f4959c = new WeakReference<>(inflate);
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public final void setInflatedId(int i) {
        this.f4958b = i;
    }

    public final void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f4960d = layoutInflater;
    }

    public final void setLayoutResource(int i) {
        this.f4957a = i;
    }

    public final void setOnInflateListener(C1382a aVar) {
        this.f4961e = aVar;
    }

    public final void setVisibility(int i) {
        if (this.f4959c != null) {
            View view = (View) this.f4959c.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo5425a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842960, 16842994, 16842995}, i, 0);
        this.f4958b = obtainStyledAttributes.getResourceId(2, -1);
        this.f4957a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
