package com.p683ss.android.ugc.aweme.shortvideo.sticker;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.ktx.C12932b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43507as;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2226a.C44519a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2226a.C44523c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2226a.C44523c.C44524a;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d */
public final class C44548d extends C12924i {

    /* renamed from: l */
    public static final C44549a f112720l = new C44549a(null);

    /* renamed from: i */
    C44523c f112721i;

    /* renamed from: j */
    final C43507as f112722j = new C43507as();

    /* renamed from: k */
    public TextView f112723k;

    /* renamed from: m */
    private StickerHintTextViewModel f112724m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d$a */
    public static final class C44549a {
        private C44549a() {
        }

        public /* synthetic */ C44549a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d$b */
    static final class C44550b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44548d f112725a;

        C44550b(C44548d dVar) {
            this.f112725a = dVar;
        }

        public final void run() {
            TextView textView = this.f112725a.f112723k;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d$c */
    static final class C44551c<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44548d f112726a;

        C44551c(C44548d dVar) {
            this.f112726a = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            TextView textView = this.f112726a.f112723k;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d$d */
    static final class C44552d<T> implements C0199s<C44545c> {

        /* renamed from: a */
        final /* synthetic */ C44548d f112727a;

        C44552d(C44548d dVar) {
            this.f112727a = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            if (r0.f112722j.f110029a.getBoolean("lyric_sticker_hint_set", false) == false) goto L_0x0053;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
            if (r0.f112722j.f110029a.getBoolean("interact_sticker_hint_set", false) == false) goto L_0x0053;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
            if (r0.f112722j.f110029a.getBoolean("text_sticker_hint_set", false) == false) goto L_0x0053;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
            if (r0.f112722j.mo88525a() == false) goto L_0x0053;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
            if (r0.f112722j.mo88525a() == false) goto L_0x0053;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r10) {
            /*
                r9 = this;
                com.ss.android.ugc.aweme.shortvideo.sticker.c r10 = (com.p683ss.android.ugc.aweme.shortvideo.sticker.C44545c) r10
                if (r10 == 0) goto L_0x0195
                com.ss.android.ugc.aweme.shortvideo.sticker.d r0 = r9.f112727a
                float r1 = r10.f112710a
                float r2 = r10.f112711b
                int r3 = r10.f112712c
                int r4 = r10.f112713d
                boolean r10 = r10.f112714e
                android.widget.TextView r5 = r0.f112723k
                if (r5 == 0) goto L_0x0195
                r5 = 1
                r6 = 0
                switch(r4) {
                    case 0: goto L_0x004b;
                    case 1: goto L_0x003e;
                    case 2: goto L_0x0031;
                    case 3: goto L_0x0024;
                    case 4: goto L_0x001b;
                    default: goto L_0x0019;
                }
            L_0x0019:
                r5 = 0
                goto L_0x0053
            L_0x001b:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.as r7 = r0.f112722j
                boolean r7 = r7.mo88525a()
                if (r7 != 0) goto L_0x0019
                goto L_0x0053
            L_0x0024:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.as r7 = r0.f112722j
                com.bytedance.keva.Keva r7 = r7.f110029a
                java.lang.String r8 = "lyric_sticker_hint_set"
                boolean r7 = r7.getBoolean(r8, r6)
                if (r7 != 0) goto L_0x0019
                goto L_0x0053
            L_0x0031:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.as r7 = r0.f112722j
                com.bytedance.keva.Keva r7 = r7.f110029a
                java.lang.String r8 = "interact_sticker_hint_set"
                boolean r7 = r7.getBoolean(r8, r6)
                if (r7 != 0) goto L_0x0019
                goto L_0x0053
            L_0x003e:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.as r7 = r0.f112722j
                com.bytedance.keva.Keva r7 = r7.f110029a
                java.lang.String r8 = "text_sticker_hint_set"
                boolean r7 = r7.getBoolean(r8, r6)
                if (r7 != 0) goto L_0x0019
                goto L_0x0053
            L_0x004b:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.as r7 = r0.f112722j
                boolean r7 = r7.mo88525a()
                if (r7 != 0) goto L_0x0019
            L_0x0053:
                if (r5 != 0) goto L_0x0057
                goto L_0x0195
            L_0x0057:
                android.widget.TextView r5 = r0.f112723k
                if (r5 != 0) goto L_0x005e
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x005e:
                r5.setText(r3)
                android.widget.TextView r3 = r0.f112723k
                if (r3 != 0) goto L_0x0068
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0068:
                android.widget.TextView r5 = r0.f112723k
                if (r5 != 0) goto L_0x006f
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x006f:
                android.content.Context r5 = r5.getContext()
                int r5 = com.p683ss.android.ugc.aweme.shortvideo.C43303dy.m94971b(r5)
                r7 = -2147483648(0xffffffff80000000, float:-0.0)
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
                android.widget.TextView r8 = r0.f112723k
                if (r8 != 0) goto L_0x0084
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0084:
                android.content.Context r8 = r8.getContext()
                int r8 = com.p683ss.android.ugc.aweme.shortvideo.C43303dy.m94967a(r8)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r7)
                r3.measure(r5, r7)
                r3 = 4
                r5 = 0
                if (r4 != r3) goto L_0x00af
                boolean r3 = com.p683ss.android.ugc.aweme.adaptation.C22452a.m55499e()
                if (r3 == 0) goto L_0x00af
                android.widget.TextView r3 = r0.f112723k
                if (r3 != 0) goto L_0x00a4
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00a4:
                android.content.Context r3 = r3.getContext()
                r4 = 1099956224(0x41900000, float:18.0)
                float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r4)
                goto L_0x00b0
            L_0x00af:
                r3 = 0
            L_0x00b0:
                android.widget.TextView r4 = r0.f112723k
                if (r4 != 0) goto L_0x00b7
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00b7:
                android.content.Context r4 = r4.getContext()
                boolean r4 = com.p683ss.android.ugc.aweme.tools.C46811b.m101654a(r4)
                if (r4 == 0) goto L_0x00d3
                android.widget.TextView r4 = r0.f112723k
                if (r4 != 0) goto L_0x00c8
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00c8:
                android.content.Context r4 = r4.getContext()
                int r4 = com.p683ss.android.ugc.aweme.shortvideo.C43303dy.m94971b(r4)
                float r4 = (float) r4
                float r1 = r4 - r1
            L_0x00d3:
                if (r10 == 0) goto L_0x00ec
                int r3 = com.p683ss.android.ugc.aweme.adaptation.C22452a.m55498d()
                android.widget.TextView r4 = r0.f112723k
                if (r4 != 0) goto L_0x00e0
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00e0:
                int r4 = r4.getMeasuredHeight()
                float r4 = (float) r4
                float r2 = r2 - r4
                float r3 = (float) r3
                float r2 = r2 + r3
                r0.mo90494a(r1, r2)
                goto L_0x0132
            L_0x00ec:
                android.widget.TextView r4 = r0.f112723k
                if (r4 != 0) goto L_0x00f3
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00f3:
                int r4 = r4.getMeasuredWidth()
                float r4 = (float) r4
                r7 = 1073741824(0x40000000, float:2.0)
                float r4 = r4 / r7
                float r4 = r1 - r4
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 < 0) goto L_0x0121
                android.widget.TextView r4 = r0.f112723k
                if (r4 != 0) goto L_0x0108
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0108:
                int r4 = r4.getMeasuredWidth()
                float r4 = (float) r4
                float r4 = r4 / r7
                float r1 = r1 - r4
                android.widget.TextView r4 = r0.f112723k
                if (r4 != 0) goto L_0x0116
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0116:
                int r4 = r4.getMeasuredHeight()
                float r4 = (float) r4
                float r2 = r2 - r4
                float r2 = r2 + r3
                r0.mo90494a(r1, r2)
                goto L_0x0132
            L_0x0121:
                android.widget.TextView r1 = r0.f112723k
                if (r1 != 0) goto L_0x0128
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0128:
                int r1 = r1.getMeasuredHeight()
                float r1 = (float) r1
                float r2 = r2 - r1
                float r2 = r2 + r3
                r0.mo90494a(r5, r2)
            L_0x0132:
                if (r10 == 0) goto L_0x017c
                android.widget.TextView r10 = r0.f112723k
                if (r10 != 0) goto L_0x013b
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x013b:
                java.lang.String r1 = "alpha"
                r2 = 2
                float[] r3 = new float[r2]
                r3 = {0, 1065353216} // fill-array
                android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r10, r1, r3)
                android.widget.TextView r1 = r0.f112723k
                if (r1 != 0) goto L_0x014e
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x014e:
                java.lang.String r3 = "translationY"
                float[] r2 = new float[r2]
                r2 = {1090519040, 0} // fill-array
                android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r1, r3, r2)
                android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
                r2.<init>()
                android.animation.Animator r10 = (android.animation.Animator) r10
                android.animation.AnimatorSet$Builder r10 = r2.play(r10)
                android.animation.Animator r1 = (android.animation.Animator) r1
                r10.with(r1)
                r3 = 300(0x12c, double:1.48E-321)
                r2.setDuration(r3)
                com.ss.android.ugc.aweme.shortvideo.sticker.d$e r10 = new com.ss.android.ugc.aweme.shortvideo.sticker.d$e
                r10.<init>(r0)
                android.animation.Animator$AnimatorListener r10 = (android.animation.Animator.AnimatorListener) r10
                r2.addListener(r10)
                r2.start()
                goto L_0x0195
            L_0x017c:
                com.ss.android.ugc.aweme.shortvideo.sticker.a.c r10 = r0.f112721i
                if (r10 == 0) goto L_0x0194
                android.widget.TextView r1 = r0.f112723k
                if (r1 != 0) goto L_0x0187
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0187:
                android.view.View r1 = (android.view.View) r1
                com.ss.android.ugc.aweme.shortvideo.sticker.d$f r2 = new com.ss.android.ugc.aweme.shortvideo.sticker.d$f
                r2.<init>(r0)
                com.ss.android.ugc.aweme.shortvideo.sticker.a.c$a r2 = (com.p683ss.android.ugc.aweme.shortvideo.sticker.p2226a.C44523c.C44524a) r2
                r10.mo90458a(r1, r6, r2)
                goto L_0x0195
            L_0x0194:
                return
            L_0x0195:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.C44548d.C44552d.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d$e */
    public static final class C44553e implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C44548d f112728a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d$e$a */
        static final class C44554a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C44553e f112729a;

            C44554a(C44553e eVar) {
                this.f112729a = eVar;
            }

            public final void run() {
                TextView textView = this.f112729a.f112728a.f112723k;
                if (textView == null) {
                    C52711k.m112234a();
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "alpha", new float[]{1.0f, 0.0f});
                TextView textView2 = this.f112729a.f112728a.f112723k;
                if (textView2 == null) {
                    C52711k.m112234a();
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, "translationY", new float[]{0.0f, 8.0f});
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(ofFloat).with(ofFloat2);
                animatorSet.setDuration(300);
                animatorSet.start();
            }
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        C44553e(C44548d dVar) {
            this.f112728a = dVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C12932b.m25978a(this.f112728a, new C44554a(this), 3000);
        }

        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f112728a.f112723k;
            if (textView == null) {
                C52711k.m112234a();
            }
            textView.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d$f */
    public static final class C44555f implements C44524a {

        /* renamed from: a */
        final /* synthetic */ C44548d f112730a;

        /* renamed from: a */
        public final void mo88582a() {
            TextView textView = this.f112730a.f112723k;
            if (textView == null) {
                C52711k.m112234a();
            }
            textView.setVisibility(0);
        }

        /* renamed from: b */
        public final void mo88583b() {
            C44548d dVar = this.f112730a;
            TextView textView = dVar.f112723k;
            if (textView != null) {
                textView.postDelayed(new C44550b(dVar), 3000);
            }
        }

        C44555f(C44548d dVar) {
            this.f112730a = dVar;
        }
    }

    /* renamed from: d */
    public final void mo24408d(Bundle bundle) {
        super.mo24408d(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            C0209x a = C0214z.m440a((FragmentActivity) activity).mo359a(StickerHintTextViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java]");
            this.f112724m = (StickerHintTextViewModel) a;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo90494a(float f, float f2) {
        LayoutParams layoutParams;
        TextView textView = this.f112723k;
        if (textView != null) {
            layoutParams = textView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = (int) f;
        }
        if (VERSION.SDK_INT >= 17 && marginLayoutParams != null) {
            marginLayoutParams.setMarginStart((int) f);
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = (int) f2;
        }
        TextView textView2 = this.f112723k;
        if (textView2 != null) {
            textView2.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: a */
    public final void mo24463a(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.mo24463a(view, bundle);
        this.f112723k = (TextView) mo24464b((int) R.id.dgm);
        TextView textView = this.f112723k;
        if (textView == null) {
            C52711k.m112234a();
        }
        Context context = textView.getContext();
        C52711k.m112236a((Object) context, "hintTextView!!.context");
        C44519a aVar = new C44519a(context, 200, 200, null);
        this.f112721i = aVar;
        TextView textView2 = this.f112723k;
        if (textView2 == null) {
            C52711k.m112234a();
        }
        TextPaint paint = textView2.getPaint();
        C52711k.m112236a((Object) paint, "hintTextView!!.paint");
        paint.setFakeBoldText(true);
        StickerHintTextViewModel stickerHintTextViewModel = this.f112724m;
        if (stickerHintTextViewModel == null) {
            C52711k.m112237a("stickerHintTextViewModel");
        }
        C0198r a = stickerHintTextViewModel.mo90441a();
        if (a != null) {
            a.observe(this, new C44551c(this));
        }
        StickerHintTextViewModel stickerHintTextViewModel2 = this.f112724m;
        if (stickerHintTextViewModel2 == null) {
            C52711k.m112237a("stickerHintTextViewModel");
        }
        C0198r b = stickerHintTextViewModel2.mo90442b();
        if (b != null) {
            b.observe(this, new C44552d(this));
        }
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.aed, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…t_text, container, false)");
        return inflate;
    }
}
