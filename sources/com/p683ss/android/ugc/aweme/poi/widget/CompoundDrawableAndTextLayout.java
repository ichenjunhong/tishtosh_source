package com.p683ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.CompoundDrawableAndTextLayout */
public class CompoundDrawableAndTextLayout extends LinearLayout {

    /* renamed from: a */
    private RemoteImageView f100930a;

    /* renamed from: b */
    private TextView f100931b;

    /* renamed from: c */
    private int f100932c;

    /* renamed from: d */
    private boolean f100933d;

    /* renamed from: e */
    private int f100934e;

    /* renamed from: f */
    private int f100935f;

    public TextView getTextView() {
        return this.f100931b;
    }

    public CompoundDrawableAndTextLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo80434a(UrlModel urlModel) {
        if (this.f100930a != null) {
            C23515d.m57669a(this.f100930a, urlModel);
            requestLayout();
        }
    }

    public void setImageResource(int i) {
        if (this.f100930a != null) {
            this.f100930a.setImageResource(i);
            requestLayout();
        }
    }

    public void setText(String str) {
        this.f100931b.setText(str);
        requestLayout();
    }

    public void setTextRes(int i) {
        this.f100931b.setText(i);
        requestLayout();
    }

    /* renamed from: a */
    public final void mo80435a(PoiStruct poiStruct, int i) {
        setImageResource(R.drawable.dks);
    }

    public CompoundDrawableAndTextLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CompoundDrawableAndTextLayout(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet, i);
        this.f100934e = 12;
        this.f100935f = -1;
        setOrientation(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.hs, R.attr.ht, R.attr.hu, R.attr.hv, R.attr.hw, R.attr.hx, R.attr.hy});
        if (obtainStyledAttributes.hasValue(1)) {
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.f100930a = new RemoteImageView(context);
            if (dimensionPixelSize > 0) {
                i2 = dimensionPixelSize;
            } else {
                i2 = -2;
            }
            if (dimensionPixelSize <= 0) {
                dimensionPixelSize = -2;
            }
            addView(this.f100930a, new LayoutParams(i2, dimensionPixelSize));
            this.f100930a.setImageResource(resourceId);
        }
        this.f100932c = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        this.f100933d = obtainStyledAttributes.getBoolean(0, false);
        this.f100934e = obtainStyledAttributes.getDimensionPixelSize(6, 12);
        this.f100935f = obtainStyledAttributes.getColor(4, -1);
        boolean z = obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.recycle();
        this.f100931b = new DmtTextView(context);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        layoutParams.leftMargin = this.f100932c;
        addView(this.f100931b, layoutParams);
        this.f100931b.setTextColor(this.f100935f);
        this.f100931b.setTextSize(0, (float) this.f100934e);
        if (z) {
            this.f100931b.setMaxLines(1);
            this.f100931b.setEllipsize(TruncateAt.END);
        }
        if (VERSION.SDK_INT >= 17) {
            this.f100931b.setTextAlignment(5);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        if (this.f100930a == null) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int i6 = ((i4 - i2) - paddingTop) - paddingBottom;
        int measuredWidth = this.f100930a.getMeasuredWidth();
        int measuredHeight = this.f100930a.getMeasuredHeight();
        int measuredHeight2 = this.f100931b.getMeasuredHeight();
        int measuredWidth2 = this.f100931b.getMeasuredWidth();
        if (this.f100933d) {
            i5 = ((i6 - measuredHeight) / 2) + paddingTop;
        } else {
            int lineHeight = this.f100931b.getLineHeight();
            i5 = ((measuredHeight2 - (this.f100931b.getLineCount() * lineHeight)) / 2) + ((lineHeight - measuredHeight) / 2) + paddingTop;
        }
        int i7 = measuredWidth + paddingLeft;
        this.f100930a.layout(paddingLeft, i5, i7, measuredHeight + i5);
        int i8 = i7 + ((LayoutParams) this.f100931b.getLayoutParams()).leftMargin;
        int i9 = ((i6 - measuredHeight2) / 2) + paddingTop;
        this.f100931b.layout(i8, i9, measuredWidth2 + i8, measuredHeight2 + i9);
    }
}
