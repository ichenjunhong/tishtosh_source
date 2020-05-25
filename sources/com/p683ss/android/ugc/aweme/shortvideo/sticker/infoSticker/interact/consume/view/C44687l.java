package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.l */
public final class C44687l extends RelativeLayout {

    /* renamed from: a */
    private DmtTextView f113047a;

    /* renamed from: b */
    private DmtTextView f113048b;

    public final void setSelect(boolean z) {
        if (z) {
            DmtTextView dmtTextView = this.f113047a;
            if (dmtTextView != null) {
                dmtTextView.setTextColor(getResources().getColor(R.color.h));
            }
            DmtTextView dmtTextView2 = this.f113048b;
            if (dmtTextView2 != null) {
                dmtTextView2.setTextColor(getResources().getColor(R.color.h));
            }
        } else {
            DmtTextView dmtTextView3 = this.f113047a;
            if (dmtTextView3 != null) {
                dmtTextView3.setTextColor(getResources().getColor(R.color.j));
            }
            DmtTextView dmtTextView4 = this.f113048b;
            if (dmtTextView4 != null) {
                dmtTextView4.setTextColor(getResources().getColor(R.color.j));
            }
        }
    }

    /* renamed from: a */
    public final void mo90661a(String str, long j) {
        C52711k.m112240b(str, "option");
        DmtTextView dmtTextView = this.f113048b;
        if (dmtTextView != null) {
            dmtTextView.setText(str);
        }
        DmtTextView dmtTextView2 = this.f113047a;
        if (dmtTextView2 != null) {
            dmtTextView2.setText(C33095b.m76068a(j));
        }
    }

    public C44687l(Context context, boolean z) {
        View view;
        DmtTextView dmtTextView;
        super(context);
        if (z) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.awf, this, false);
        } else {
            view = LayoutInflater.from(getContext()).inflate(R.layout.awh, this, false);
        }
        DmtTextView dmtTextView2 = null;
        if (view != null) {
            dmtTextView = (DmtTextView) view.findViewById(R.id.d8u);
        } else {
            dmtTextView = null;
        }
        this.f113047a = dmtTextView;
        if (view != null) {
            dmtTextView2 = (DmtTextView) view.findViewById(R.id.dd5);
        }
        this.f113048b = dmtTextView2;
        addView(view);
    }
}
