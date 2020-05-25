package com.p683ss.android.ugc.aweme.sticker.types.mimoji.scanface;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.C43845fn;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.mimoji.scanface.c */
public final class C46591c {

    /* renamed from: a */
    TextView f117545a;

    /* renamed from: b */
    private View f117546b;

    /* renamed from: c */
    private final float f117547c = 0.54f;

    /* renamed from: d */
    private final int f117548d = UnReadVideoExperiment.BROWSE_RECORD_LIST;

    /* renamed from: e */
    private final int f117549e = 15;

    /* renamed from: f */
    private final FrameLayout f117550f;

    /* renamed from: c */
    private final void m101131c() {
        TextView textView = this.f117545a;
        if (textView == null) {
            C52711k.m112237a("hintTextView");
        }
        textView.setText(R.string.amd);
    }

    /* renamed from: a */
    public final void mo93383a() {
        FrameLayout frameLayout = this.f117550f;
        View view = this.f117546b;
        if (view == null) {
            C52711k.m112237a("mCurView");
        }
        frameLayout.addView(view);
        View view2 = this.f117546b;
        if (view2 == null) {
            C52711k.m112237a("mCurView");
        }
        view2.setVisibility(0);
        m101131c();
    }

    /* renamed from: b */
    public final void mo93384b() {
        View view = this.f117546b;
        if (view == null) {
            C52711k.m112237a("mCurView");
        }
        view.setVisibility(8);
        FrameLayout frameLayout = this.f117550f;
        View view2 = this.f117546b;
        if (view2 == null) {
            C52711k.m112237a("mCurView");
        }
        frameLayout.removeView(view2);
    }

    public C46591c(FrameLayout frameLayout) {
        C52711k.m112240b(frameLayout, "containerView");
        this.f117550f = frameLayout;
        View inflate = LayoutInflater.from(this.f117550f.getContext()).inflate(R.layout.a6w, this.f117550f, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…ce, containerView, false)");
        this.f117546b = inflate;
        View view = this.f117546b;
        if (view == null) {
            C52711k.m112237a("mCurView");
        }
        View findViewById = view.findViewById(R.id.ch6);
        C52711k.m112236a((Object) findViewById, "mCurView.findViewById(R.id.scan_face_hint)");
        this.f117545a = (TextView) findViewById;
        View view2 = this.f117546b;
        if (view2 == null) {
            C52711k.m112237a("mCurView");
        }
        int b = (C43303dy.m94971b(view2.getContext()) * 16) / 9;
        StringBuilder sb = new StringBuilder("video Height: ");
        sb.append(C22452a.m55501g());
        sb.append("video width: ");
        View view3 = this.f117546b;
        if (view3 == null) {
            C52711k.m112237a("mCurView");
        }
        sb.append(C43303dy.m94971b(view3.getContext()));
        sb.append("expireSurfaceHeight: ");
        sb.append(b);
        sb.append("  screenHeight: ");
        View view4 = this.f117546b;
        if (view4 == null) {
            C52711k.m112237a("mCurView");
        }
        sb.append(C43303dy.m94974e(view4.getContext()));
        sb.append("textHeight: ");
        TextView textView = this.f117545a;
        if (textView == null) {
            C52711k.m112237a("hintTextView");
        }
        sb.append(textView.getHeight());
        StringBuilder sb2 = new StringBuilder("hasStatusBar: ");
        sb2.append(C22452a.m55499e());
        sb2.append("  statusBarHeight: ");
        View view5 = this.f117546b;
        if (view5 == null) {
            C52711k.m112237a("mCurView");
        }
        sb2.append(C43303dy.m94972c(view5.getContext()));
        View view6 = this.f117546b;
        if (view6 == null) {
            C52711k.m112237a("mCurView");
        }
        int e = C43303dy.m94974e(view6.getContext());
        int g = (int) ((((float) C22452a.m55501g()) * this.f117547c) + ((float) C22452a.m55498d()));
        int a = C43845fn.m96282a((double) this.f117548d, this.f117550f.getContext());
        int a2 = C43845fn.m96282a((double) this.f117549e, this.f117550f.getContext());
        TextView textView2 = this.f117545a;
        if (textView2 == null) {
            C52711k.m112237a("hintTextView");
        }
        LayoutParams layoutParams = textView2.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = (((e - g) + a) - a2) / 2;
            TextView textView3 = this.f117545a;
            if (textView3 == null) {
                C52711k.m112237a("hintTextView");
            }
            textView3.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
