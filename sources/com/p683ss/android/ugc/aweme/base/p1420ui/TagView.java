package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p043v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.ui.TagView */
public class TagView extends BorderLayout {

    /* renamed from: e */
    private String f63039e;

    /* renamed from: f */
    private ImageView f63040f;

    /* renamed from: g */
    private AppCompatTextView f63041g;

    /* renamed from: h */
    private int f63042h;

    public TagView(Context context) {
        this(context, null);
    }

    public void setSelected(boolean z) {
        if (this.f63040f != null) {
            this.f63040f.setSelected(z);
        }
        if (this.f63041g != null) {
            if (z) {
                this.f63041g.setTextColor(this.f62910c);
            } else {
                this.f63041g.setTextColor(this.f63042h);
            }
        }
        super.setSelected(z);
    }

    public TagView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TagView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
        inflate(getContext(), R.layout.a7r, this);
        this.f63040f = (ImageView) findViewById(R.id.b4u);
        this.f63041g = (AppCompatTextView) findViewById(R.id.dh0);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.cj, R.attr.ck, R.attr.nm, R.attr.a1h, R.attr.a5i, R.attr.a6d, R.attr.a_5});
        this.f62908a = (float) obtainStyledAttributes.getDimensionPixelSize(1, (int) this.f62908a);
        this.f62909b = (float) obtainStyledAttributes.getDimensionPixelSize(0, (int) this.f62909b);
        this.f62910c = obtainStyledAttributes.getColor(3, this.f62910c);
        this.f62911d = obtainStyledAttributes.getColor(6, this.f62911d);
        this.f63039e = obtainStyledAttributes.getString(4);
        this.f63042h = obtainStyledAttributes.getColor(5, this.f62911d);
        if (!TextUtils.isEmpty(this.f63039e) && this.f63041g != null) {
            this.f63041g.setText(this.f63039e);
            this.f63041g.setTextColor(this.f63042h);
        }
        mo48980a(this.f62910c, this.f62911d);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (!(drawable == null || this.f63040f == null)) {
            this.f63040f.setImageDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
    }
}
