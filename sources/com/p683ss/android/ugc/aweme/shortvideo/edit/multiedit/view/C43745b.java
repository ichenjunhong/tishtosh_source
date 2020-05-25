package com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.view;

import android.animation.AnimatorListenerAdapter;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.C2240a;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractVideoEditView;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2199c.C43690b;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b */
public class C43745b implements C43744a {

    /* renamed from: a */
    protected View f110750a;

    /* renamed from: b */
    protected AbstractVideoEditView f110751b;

    /* renamed from: c */
    protected View f110752c;

    /* renamed from: d */
    protected View f110753d;

    /* renamed from: e */
    protected View f110754e;

    /* renamed from: f */
    protected View f110755f;

    /* renamed from: g */
    public C43690b f110756g;

    /* renamed from: h */
    private View f110757h;

    /* renamed from: i */
    private View f110758i;

    /* renamed from: a */
    public void mo89207a(int i, int i2) {
    }

    /* renamed from: a */
    public void mo89208a(FragmentActivity fragmentActivity, int i, AnimatorListenerAdapter animatorListenerAdapter) {
    }

    /* renamed from: a */
    public void mo89209a(FragmentActivity fragmentActivity, int i, boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter) {
    }

    /* renamed from: a */
    public void mo89212a(FragmentActivity fragmentActivity, VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends VideoSegment> list) {
    }

    /* renamed from: a */
    public void mo89213a(C0794k<Float, Float> kVar) {
        C52711k.m112240b(kVar, "pair");
    }

    /* renamed from: a */
    public void mo89215a(VideoSegment videoSegment) {
    }

    /* renamed from: a */
    public void mo89217a(List<? extends VideoSegment> list) {
    }

    /* renamed from: a */
    public void mo89219a(boolean z, int i) {
    }

    /* renamed from: b */
    public void mo89220b(C0794k<Float, Float> kVar) {
        C52711k.m112240b(kVar, "pair");
    }

    /* renamed from: b */
    public void mo89221b(VideoSegment videoSegment) {
    }

    /* renamed from: f */
    public void mo89227f() {
    }

    /* renamed from: g */
    public void mo89228g() {
    }

    /* renamed from: h */
    public void mo89229h() {
    }

    /* renamed from: i */
    public void mo89230i() {
    }

    /* renamed from: j */
    public void mo89231j() {
    }

    /* renamed from: k */
    public View mo89232k() {
        return null;
    }

    /* renamed from: l */
    public void mo89233l() {
    }

    /* renamed from: a */
    public final void mo89218a(boolean z) {
        View view = this.f110757h;
        if (view == null) {
            C52711k.m112237a("playView");
        }
        view.setVisibility(z ? 0 : 8);
    }

    /* renamed from: a */
    public final AbstractVideoEditView mo89206a() {
        AbstractVideoEditView abstractVideoEditView = this.f110751b;
        if (abstractVideoEditView == null) {
            C52711k.m112237a("videoEditView");
        }
        return abstractVideoEditView;
    }

    /* renamed from: e */
    public final boolean mo89226e() {
        AbstractVideoEditView abstractVideoEditView = this.f110751b;
        if (abstractVideoEditView == null) {
            C52711k.m112237a("videoEditView");
        }
        return abstractVideoEditView.mo87559g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final AbstractVideoEditView mo89234m() {
        AbstractVideoEditView abstractVideoEditView = this.f110751b;
        if (abstractVideoEditView == null) {
            C52711k.m112237a("videoEditView");
        }
        return abstractVideoEditView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final View mo89235n() {
        View view = this.f110752c;
        if (view == null) {
            C52711k.m112237a("cancleView");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final View mo89236o() {
        View view = this.f110753d;
        if (view == null) {
            C52711k.m112237a("saveView");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final View mo89237p() {
        View view = this.f110754e;
        if (view == null) {
            C52711k.m112237a("rootView");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final View mo89238q() {
        View view = this.f110755f;
        if (view == null) {
            C52711k.m112237a("iRephotographLayout");
        }
        return view;
    }

    /* renamed from: b */
    public final boolean mo89223b() {
        View view = this.f110757h;
        if (view == null) {
            C52711k.m112237a("playView");
        }
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final C0794k<Float, Float> mo89225d() {
        AbstractVideoEditView abstractVideoEditView = this.f110751b;
        if (abstractVideoEditView == null) {
            C52711k.m112237a("videoEditView");
        }
        C0794k<Float, Float> slideX = abstractVideoEditView.getSlideX();
        C52711k.m112236a((Object) slideX, "videoEditView.slideX");
        return slideX;
    }

    /* renamed from: c */
    public final void mo89224c() {
        Locale locale = Locale.getDefault();
        C52711k.m112236a((Object) locale, "Locale.getDefault()");
        String str = "%.1f";
        Object[] objArr = new Object[1];
        AbstractVideoEditView abstractVideoEditView = this.f110751b;
        if (abstractVideoEditView == null) {
            C52711k.m112237a("videoEditView");
        }
        objArr[0] = Float.valueOf(abstractVideoEditView.getSelectedTime());
        String a = C2240a.m6773a(locale, str, Arrays.copyOf(objArr, 1));
        C52711k.m112236a((Object) a, "java.lang.String.format(locale, format, *args)");
        View view = this.f110750a;
        if (view == null) {
            C52711k.m112237a("tvTime");
        }
        String string = view.getResources().getString(R.string.c8j, new Object[]{a});
        View view2 = this.f110750a;
        if (view2 == null) {
            C52711k.m112237a("tvTime");
        }
        if (view2 != null) {
            ((TextView) view2).setText(string);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.TextView");
    }

    /* renamed from: b */
    public final void mo89222b(boolean z) {
        int i;
        View view = this.f110754e;
        if (view == null) {
            C52711k.m112237a("rootView");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        if (z) {
            AbstractVideoEditView abstractVideoEditView = this.f110751b;
            if (abstractVideoEditView == null) {
                C52711k.m112237a("videoEditView");
            }
            abstractVideoEditView.mo87538a();
        }
        mo89218a(z);
    }

    /* renamed from: a */
    public void mo89214a(OnClickListener onClickListener) {
        View view = this.f110752c;
        if (view == null) {
            C52711k.m112237a("cancleView");
        }
        view.setOnClickListener(onClickListener);
        View view2 = this.f110753d;
        if (view2 == null) {
            C52711k.m112237a("saveView");
        }
        view2.setOnClickListener(onClickListener);
        View view3 = this.f110758i;
        if (view3 == null) {
            C52711k.m112237a("videoControlView");
        }
        view3.setOnClickListener(onClickListener);
        View view4 = this.f110755f;
        if (view4 == null) {
            C52711k.m112237a("iRephotographLayout");
        }
        view4.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void mo89216a(C43690b bVar) {
        C52711k.m112240b(bVar, "itemListener");
        this.f110756g = bVar;
    }

    /* renamed from: a */
    public void mo89210a(FragmentActivity fragmentActivity, View view) {
        if (fragmentActivity != null && view != null) {
            this.f110754e = view;
            View findViewById = view.findViewById(R.id.d6f);
            C52711k.m112236a((Object) findViewById, "rootView.findViewById(R.id.tvTime)");
            this.f110750a = findViewById;
            View findViewById2 = view.findViewById(R.id.d7g);
            C52711k.m112236a((Object) findViewById2, "rootView.findViewById(R.id.tv_cancle)");
            this.f110752c = findViewById2;
            View findViewById3 = view.findViewById(R.id.df8);
            C52711k.m112236a((Object) findViewById3, "rootView.findViewById(R.id.tv_save)");
            this.f110753d = findViewById3;
            View findViewById4 = view.findViewById(R.id.eru);
            C52711k.m112236a((Object) findViewById4, "rootView.findViewById(R.id.rephotograph_layout)");
            this.f110755f = findViewById4;
            View findViewById5 = view.findViewById(R.id.dos);
            C52711k.m112236a((Object) findViewById5, "rootView.findViewById(R.id.videoEditView)");
            this.f110751b = (AbstractVideoEditView) findViewById5;
            View findViewById6 = view.findViewById(R.id.axn);
            C52711k.m112236a((Object) findViewById6, "rootView.findViewById(R.id.ivPlay)");
            this.f110757h = findViewById6;
            View findViewById7 = view.findViewById(R.id.e3r);
            C52711k.m112236a((Object) findViewById7, "rootView.findViewById(R.id.control_layout)");
            this.f110758i = findViewById7;
            View findViewById8 = view.findViewById(R.id.axq);
            C52711k.m112236a((Object) findViewById8, "rootView.findViewById<View>(R.id.ivSpeed)");
            findViewById8.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo89211a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends MediaModel> list, boolean z) {
        AbstractVideoEditView abstractVideoEditView = this.f110751b;
        if (abstractVideoEditView == null) {
            C52711k.m112237a("videoEditView");
        }
        abstractVideoEditView.setExtractFramesInRoughMode(true);
        AbstractVideoEditView abstractVideoEditView2 = this.f110751b;
        if (abstractVideoEditView2 == null) {
            C52711k.m112237a("videoEditView");
        }
        abstractVideoEditView2.mo87553a(fragmentActivity, cutMultiVideoViewModel, list, z);
    }
}
