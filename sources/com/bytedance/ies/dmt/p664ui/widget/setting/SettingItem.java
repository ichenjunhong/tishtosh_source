package com.bytedance.ies.dmt.p664ui.widget.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.setting.SettingItem */
public class SettingItem extends SettingItemBase {

    /* renamed from: a */
    protected FrameLayout f28750a;

    /* renamed from: b */
    protected ImageView f28751b;

    /* renamed from: c */
    protected TextView f28752c;

    /* renamed from: d */
    protected ImageView f28753d;

    public View getRightLayout() {
        return this.f28750a;
    }

    /* access modifiers changed from: protected */
    public int getRightLayoutId() {
        return R.layout.at5;
    }

    public TextView getTxtRight() {
        return this.f28752c;
    }

    public SettingItem(Context context) {
        super(context);
    }

    public void setRightTxt(String str) {
        super.setRightTxt(str);
        this.f28752c.setText(this.f28755e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo19302a(Context context) {
        super.mo19302a(context);
        this.f28751b = (ImageView) this.f28756f.findViewById(R.id.b3r);
        this.f28750a = (FrameLayout) this.f28756f.findViewById(R.id.ccj);
        this.f28752c = (TextView) this.f28756f.findViewById(R.id.df1);
        this.f28753d = (ImageView) this.f28756f.findViewById(R.id.b2t);
    }

    public SettingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo19303a(Context context, AttributeSet attributeSet) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.kk, R.attr.ko, R.attr.kp, R.attr.n9});
        if (obtainStyledAttributes.getBoolean(3, false)) {
            this.f28751b.setVisibility(8);
        }
        this.f28752c.setText(this.f28755e);
        if (C10675b.m21498b(context)) {
            i = R.drawable.c_e;
        } else {
            i = R.drawable.c_f;
        }
        Drawable drawable = getResources().getDrawable(obtainStyledAttributes.getResourceId(0, i));
        if (drawable != null) {
            this.f28751b.setImageDrawable(drawable);
        }
        this.f28752c.setTextColor(this.f28766p);
        obtainStyledAttributes.recycle();
    }

    public SettingItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
