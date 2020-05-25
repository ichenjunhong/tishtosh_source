package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.a */
public final class C43511a implements C43522i {

    /* renamed from: a */
    private FixBubbleLayout f110057a;

    /* renamed from: b */
    private TextView f110058b;

    /* renamed from: c */
    private C43512a f110059c;

    /* renamed from: d */
    private final C43524k f110060d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.a$a */
    public interface C43512a {
    }

    /* renamed from: b */
    public final FixBubbleLayout mo88544b() {
        return this.f110057a;
    }

    /* renamed from: a */
    public final void mo88541a() {
        this.f110058b = new DmtTextView(this.f110060d.mo88576p());
        TextView textView = this.f110058b;
        if (textView == null) {
            C52711k.m112234a();
        }
        Activity p = this.f110060d.mo88576p();
        C52711k.m112236a((Object) p, "popupWindow.activity");
        textView.setTextColor(p.getResources().getColor(R.color.a1k));
        TextView textView2 = this.f110058b;
        if (textView2 == null) {
            C52711k.m112234a();
        }
        textView2.setTextSize(13.0f);
        TextView textView3 = this.f110058b;
        if (textView3 == null) {
            C52711k.m112234a();
        }
        textView3.setLayoutParams(new LayoutParams(-2, -2));
        TextView textView4 = this.f110058b;
        if (textView4 == null) {
            C52711k.m112234a();
        }
        textView4.setMaxLines(2);
        TextView textView5 = this.f110058b;
        if (textView5 == null) {
            C52711k.m112234a();
        }
        textView5.setGravity(17);
        mo88542a((View) this.f110058b);
        this.f110060d.mo88574n().mo88565d(true);
        this.f110060d.getContentView().measure(DynamicTabYellowPointVersion.DEFAULT, DynamicTabYellowPointVersion.DEFAULT);
    }

    /* renamed from: a */
    public final void mo88543a(C43512a aVar) {
        C52711k.m112240b(aVar, "listener");
        this.f110059c = aVar;
    }

    public C43511a(C43524k kVar) {
        C52711k.m112240b(kVar, "popupWindow");
        this.f110060d = kVar;
    }

    /* renamed from: a */
    public final void mo88542a(View view) {
        this.f110057a = new FixBubbleLayout(this.f110060d.mo88576p());
        FixBubbleLayout fixBubbleLayout = this.f110057a;
        if (fixBubbleLayout == null) {
            C52711k.m112234a();
        }
        fixBubbleLayout.setBackgroundColor(0);
        FixBubbleLayout fixBubbleLayout2 = this.f110057a;
        if (fixBubbleLayout2 == null) {
            C52711k.m112234a();
        }
        fixBubbleLayout2.addView(view);
        FixBubbleLayout fixBubbleLayout3 = this.f110057a;
        if (fixBubbleLayout3 == null) {
            C52711k.m112234a();
        }
        fixBubbleLayout3.setGravity(17);
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-2, -2);
        FixBubbleLayout fixBubbleLayout4 = this.f110057a;
        if (fixBubbleLayout4 == null) {
            C52711k.m112234a();
        }
        fixBubbleLayout4.setLayoutParams(marginLayoutParams);
        FixBubbleLayout fixBubbleLayout5 = this.f110057a;
        if (fixBubbleLayout5 == null) {
            C52711k.m112234a();
        }
        fixBubbleLayout5.setVisibility(8);
        C43523j q = this.f110060d.mo88577q();
        C52711k.m112236a((Object) q, "popupWindow.bubbleParams");
        if (q.mo88553d() != 0) {
            FixBubbleLayout fixBubbleLayout6 = this.f110057a;
            if (fixBubbleLayout6 == null) {
                C52711k.m112234a();
            }
            C43523j q2 = this.f110060d.mo88577q();
            C52711k.m112236a((Object) q2, "popupWindow.bubbleParams");
            fixBubbleLayout6.setBgColor(q2.mo88553d());
        }
        FixBubbleLayout fixBubbleLayout7 = this.f110057a;
        if (fixBubbleLayout7 == null) {
            C52711k.m112234a();
        }
        C43523j q3 = this.f110060d.mo88577q();
        C52711k.m112236a((Object) q3, "popupWindow.bubbleParams");
        fixBubbleLayout7.setNeedPath(q3.mo88556e());
        FixBubbleLayout fixBubbleLayout8 = this.f110057a;
        if (fixBubbleLayout8 == null) {
            C52711k.m112234a();
        }
        C43523j q4 = this.f110060d.mo88577q();
        C52711k.m112236a((Object) q4, "popupWindow.bubbleParams");
        fixBubbleLayout8.setNeedPressFade(q4.mo88558f());
        this.f110060d.setContentView(this.f110057a);
    }
}
