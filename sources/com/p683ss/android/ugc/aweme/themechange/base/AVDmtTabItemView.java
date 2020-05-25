package com.p683ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.p683ss.android.ugc.tools.C50179a.C50180a;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtTabItemView */
public final class AVDmtTabItemView extends FrameLayout {

    /* renamed from: a */
    private SimpleDraweeView f118196a;

    /* renamed from: b */
    private AVDmtTextView f118197b;

    /* renamed from: c */
    private View f118198c;

    /* renamed from: d */
    private int f118199d;

    /* renamed from: e */
    private int f118200e;

    /* renamed from: f */
    private boolean f118201f;

    public final int getSelectColor() {
        return this.f118199d;
    }

    public final int getUnSelectColor() {
        return this.f118200e;
    }

    /* renamed from: a */
    public final void mo93985a() {
        int b = (int) C9432q.m18687b(getContext(), 4.0f);
        setPadding(b, 0, b, 0);
    }

    /* renamed from: a */
    public final void mo93986a(int i) {
        AVDmtTextView aVDmtTextView = this.f118197b;
        if (aVDmtTextView == null) {
            C52711k.m112237a("textView");
        }
        aVDmtTextView.setTextColor(i);
        SimpleDraweeView simpleDraweeView = this.f118196a;
        if (simpleDraweeView == null) {
            C52711k.m112237a("iconImgView");
        }
        simpleDraweeView.setImageAlpha(Color.alpha(i));
    }

    /* renamed from: b */
    public final void mo93989b(boolean z) {
        int i;
        View view = this.f118198c;
        if (view == null) {
            C52711k.m112237a("dotView");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public final void setSelected(boolean z) {
        int i;
        super.setSelected(z);
        if (z) {
            i = this.f118199d;
        } else {
            i = this.f118200e;
        }
        mo93986a(i);
        mo93988a(z);
    }

    public final void setText(int i) {
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        setText(context.getResources().getString(i));
    }

    /* renamed from: a */
    public final void mo93988a(boolean z) {
        if (C50180a.m108284a().f125723c) {
            if (z) {
                AVDmtTextView aVDmtTextView = this.f118197b;
                if (aVDmtTextView == null) {
                    C52711k.m112237a("textView");
                }
                aVDmtTextView.mo93998b();
                AVDmtTextView aVDmtTextView2 = this.f118197b;
                if (aVDmtTextView2 == null) {
                    C52711k.m112237a("textView");
                }
                aVDmtTextView2.setTypeface(Typeface.defaultFromStyle(1));
                return;
            }
            AVDmtTextView aVDmtTextView3 = this.f118197b;
            if (aVDmtTextView3 == null) {
                C52711k.m112237a("textView");
            }
            aVDmtTextView3.setTypeface(Typeface.defaultFromStyle(0));
        }
    }

    public final void setText(String str) {
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            AVDmtTextView aVDmtTextView = this.f118197b;
            if (aVDmtTextView == null) {
                C52711k.m112237a("textView");
            }
            aVDmtTextView.setVisibility(0);
            SimpleDraweeView simpleDraweeView = this.f118196a;
            if (simpleDraweeView == null) {
                C52711k.m112237a("iconImgView");
            }
            simpleDraweeView.setVisibility(8);
            AVDmtTextView aVDmtTextView2 = this.f118197b;
            if (aVDmtTextView2 == null) {
                C52711k.m112237a("textView");
            }
            aVDmtTextView2.setText(charSequence);
        }
    }

    public AVDmtTabItemView(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        this(context, null, 0);
        this.f118201f = z;
        this.f118199d = C46788b.m101630a(z);
        this.f118200e = C46788b.m101629a(this.f118199d);
    }

    /* renamed from: a */
    public final void mo93987a(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            AVDmtTextView aVDmtTextView = this.f118197b;
            if (aVDmtTextView == null) {
                C52711k.m112237a("textView");
            }
            aVDmtTextView.setVisibility(8);
            SimpleDraweeView simpleDraweeView = this.f118196a;
            if (simpleDraweeView == null) {
                C52711k.m112237a("iconImgView");
            }
            simpleDraweeView.setVisibility(0);
            if (str == null) {
                C52711k.m112234a();
            }
            if (C52830p.m112411b(str, "res://", false, 2, null)) {
                SimpleDraweeView simpleDraweeView2 = this.f118196a;
                if (simpleDraweeView2 == null) {
                    C52711k.m112237a("iconImgView");
                }
                simpleDraweeView2.setImageDrawable(C46788b.f118235d.mo94008a(getContext(), i, this.f118201f));
                return;
            }
            SimpleDraweeView simpleDraweeView3 = this.f118196a;
            if (simpleDraweeView3 == null) {
                C52711k.m112237a("iconImgView");
            }
            C50181a.m108292a(simpleDraweeView3, str);
        }
    }

    public AVDmtTabItemView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f118199d = -1;
        this.f118200e = -1;
        View inflate = LayoutInflater.from(context).inflate(R.layout.s6, this, true);
        View findViewById = inflate.findViewById(R.id.cww);
        C52711k.m112236a((Object) findViewById, "rootView.findViewById(R.id.tab_item_img)");
        this.f118196a = (SimpleDraweeView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.cwx);
        C52711k.m112236a((Object) findViewById2, "rootView.findViewById(R.id.tab_item_text)");
        this.f118197b = (AVDmtTextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.cwv);
        C52711k.m112236a((Object) findViewById3, "rootView.findViewById(R.id.tab_item_dot)");
        this.f118198c = findViewById3;
        int color = context.getResources().getColor(R.color.a3_);
        View view = this.f118198c;
        if (view == null) {
            C52711k.m112237a("dotView");
        }
        view.setBackground(C42430at.m93195a(color, color, 0));
        AVDmtTextView aVDmtTextView = this.f118197b;
        if (aVDmtTextView == null) {
            C52711k.m112237a("textView");
        }
        aVDmtTextView.setTextSize(15.0f);
        if (C50180a.m108284a().f125722b) {
            AVDmtTextView aVDmtTextView2 = this.f118197b;
            if (aVDmtTextView2 == null) {
                C52711k.m112237a("textView");
            }
            aVDmtTextView2.mo93998b();
        } else {
            AVDmtTextView aVDmtTextView3 = this.f118197b;
            if (aVDmtTextView3 == null) {
                C52711k.m112237a("textView");
            }
            aVDmtTextView3.setTypeface(Typeface.defaultFromStyle(0));
        }
        AVDmtTextView aVDmtTextView4 = this.f118197b;
        if (aVDmtTextView4 == null) {
            C52711k.m112237a("textView");
        }
        aVDmtTextView4.setSingleLine();
        AVDmtTextView aVDmtTextView5 = this.f118197b;
        if (aVDmtTextView5 == null) {
            C52711k.m112237a("textView");
        }
        aVDmtTextView5.setEllipsize(TruncateAt.END);
        setLayoutParams(new LayoutParams(-2, -1));
    }
}
