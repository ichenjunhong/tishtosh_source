package com.bytedance.ies.dmt.p664ui.widget.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.setting.EffectiveSettingItem */
public class EffectiveSettingItem extends EffectiveSettingItemBase {

    /* renamed from: h */
    protected ImageView f28727h;

    /* renamed from: i */
    protected TextView f28728i;

    /* renamed from: j */
    protected ImageView f28729j;

    /* renamed from: k */
    boolean f28730k;

    /* renamed from: l */
    int f28731l;

    public TextView getTxtRight() {
        return this.f28728i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo19287b() {
        this.f28727h = (ImageView) findViewById(R.id.b3r);
        this.f28728i = (TextView) findViewById(R.id.df1);
        this.f28729j = (ImageView) findViewById(R.id.b2t);
        if (this.f28730k) {
            this.f28727h.setVisibility(8);
        }
        this.f28728i.setText(this.f28735m);
        Drawable drawable = getResources().getDrawable(this.f28731l);
        if (drawable != null) {
            this.f28727h.setImageDrawable(drawable);
        }
        this.f28728i.setTextColor(this.f28741s);
    }

    public EffectiveSettingItem(Context context) {
        super(context);
    }

    public void setRightTxt(String str) {
        super.setRightTxt(str);
        this.f28728i.setText(this.f28735m);
    }

    public EffectiveSettingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo19286a(Context context, AttributeSet attributeSet) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.kk, R.attr.ko, R.attr.kp, R.attr.n9});
        this.f28730k = obtainStyledAttributes.getBoolean(3, false);
        if (C10675b.m21498b(context)) {
            i = R.drawable.c_e;
        } else {
            i = R.drawable.c_f;
        }
        this.f28731l = obtainStyledAttributes.getResourceId(0, i);
        obtainStyledAttributes.recycle();
    }

    public EffectiveSettingItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
