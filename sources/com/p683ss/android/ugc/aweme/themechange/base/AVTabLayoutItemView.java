package com.p683ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.p683ss.android.ugc.tools.C50179a.C50180a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVTabLayoutItemView */
public final class AVTabLayoutItemView extends FrameLayout {

    /* renamed from: a */
    private AVDmtTextView f118219a;

    /* renamed from: b */
    private int f118220b;

    /* renamed from: c */
    private int f118221c;

    public final void setText(int i) {
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        setText(context.getResources().getString(i));
    }

    public final void setText(String str) {
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            AVDmtTextView aVDmtTextView = this.f118219a;
            if (aVDmtTextView == null) {
                C52711k.m112237a("textView");
            }
            aVDmtTextView.setVisibility(0);
            AVDmtTextView aVDmtTextView2 = this.f118219a;
            if (aVDmtTextView2 == null) {
                C52711k.m112237a("textView");
            }
            aVDmtTextView2.setText(charSequence);
        }
    }

    public final void setSelected(boolean z) {
        int i;
        super.setSelected(z);
        if (z) {
            i = this.f118220b;
        } else {
            i = this.f118221c;
        }
        AVDmtTextView aVDmtTextView = this.f118219a;
        if (aVDmtTextView == null) {
            C52711k.m112237a("textView");
        }
        aVDmtTextView.setTextColor(i);
        if (C50180a.m108284a().f125723c) {
            if (z) {
                AVDmtTextView aVDmtTextView2 = this.f118219a;
                if (aVDmtTextView2 == null) {
                    C52711k.m112237a("textView");
                }
                aVDmtTextView2.mo93998b();
                AVDmtTextView aVDmtTextView3 = this.f118219a;
                if (aVDmtTextView3 == null) {
                    C52711k.m112237a("textView");
                }
                aVDmtTextView3.setTypeface(Typeface.defaultFromStyle(1));
                return;
            }
            AVDmtTextView aVDmtTextView4 = this.f118219a;
            if (aVDmtTextView4 == null) {
                C52711k.m112237a("textView");
            }
            aVDmtTextView4.setTypeface(Typeface.defaultFromStyle(0));
        }
    }

    public AVTabLayoutItemView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f118220b = -1;
        this.f118221c = -1;
        View findViewById = LayoutInflater.from(context).inflate(R.layout.bhm, this, true).findViewById(R.id.cwx);
        C52711k.m112236a((Object) findViewById, "rootView.findViewById(R.id.tab_item_text)");
        this.f118219a = (AVDmtTextView) findViewById;
        AVDmtTextView aVDmtTextView = this.f118219a;
        if (aVDmtTextView == null) {
            C52711k.m112237a("textView");
        }
        aVDmtTextView.setTextSize(15.0f);
        if (C50180a.m108284a().f125722b) {
            AVDmtTextView aVDmtTextView2 = this.f118219a;
            if (aVDmtTextView2 == null) {
                C52711k.m112237a("textView");
            }
            aVDmtTextView2.mo93998b();
        } else {
            AVDmtTextView aVDmtTextView3 = this.f118219a;
            if (aVDmtTextView3 == null) {
                C52711k.m112237a("textView");
            }
            aVDmtTextView3.setTypeface(Typeface.defaultFromStyle(0));
        }
        AVDmtTextView aVDmtTextView4 = this.f118219a;
        if (aVDmtTextView4 == null) {
            C52711k.m112237a("textView");
        }
        aVDmtTextView4.setSingleLine();
        AVDmtTextView aVDmtTextView5 = this.f118219a;
        if (aVDmtTextView5 == null) {
            C52711k.m112237a("textView");
        }
        aVDmtTextView5.setEllipsize(TruncateAt.END);
        setLayoutParams(new LayoutParams(-1, -1));
        this.f118220b = C46788b.m101630a(false);
        this.f118221c = C46788b.m101629a(this.f118220b);
    }

    public /* synthetic */ AVTabLayoutItemView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
