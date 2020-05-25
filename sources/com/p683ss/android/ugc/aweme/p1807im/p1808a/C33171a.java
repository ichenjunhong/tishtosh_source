package com.p683ss.android.ugc.aweme.p1807im.p1808a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.C0535b;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.discover.hitrank.C28220g;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.share.C35475a;
import com.p683ss.android.ugc.aweme.p1807im.service.share.p1908a.C35476a;
import com.p683ss.android.ugc.aweme.p1807im.service.share.p1908a.C35477b;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.share.improve.C42146c;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42346c;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.a.a */
public final class C33171a implements C35477b {

    /* renamed from: f */
    public static final C33174a f86126f = new C33174a(null);

    /* renamed from: a */
    public C35475a f86127a;

    /* renamed from: b */
    public int f86128b;

    /* renamed from: c */
    public int f86129c;

    /* renamed from: d */
    public int f86130d;

    /* renamed from: e */
    public final C33178c f86131e;

    /* renamed from: com.ss.android.ugc.aweme.im.a.a$a */
    public static final class C33174a {
        private C33174a() {
        }

        public /* synthetic */ C33174a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.a.a$b */
    public static final class C33175b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C33171a f86134a;

        /* renamed from: b */
        final /* synthetic */ boolean f86135b;

        public final void onAnimationEnd(Animator animator) {
            if (this.f86135b) {
                View a = C33171a.m76195a(this.f86134a).mo73264a();
                if (a == null) {
                    C52711k.m112234a();
                }
                a.setVisibility(8);
            } else {
                this.f86134a.f86131e.f86140d.setVisibility(8);
            }
            C33171a.m76195a(this.f86134a).mo73266a(this.f86135b);
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f86135b) {
                this.f86134a.f86131e.f86140d.setVisibility(0);
                return;
            }
            View a = C33171a.m76195a(this.f86134a).mo73264a();
            if (a == null) {
                C52711k.m112234a();
            }
            a.setVisibility(0);
        }

        C33175b(C33171a aVar, boolean z) {
            this.f86134a = aVar;
            this.f86135b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.a.a$c */
    static final class C33176c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C33171a f86136a;

        C33176c(C33171a aVar) {
            this.f86136a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                float f = floatValue / ((float) this.f86136a.f86128b);
                this.f86136a.f86131e.f86140d.setAlpha(f);
                View a = C33171a.m76195a(this.f86136a).mo73264a();
                if (a == null) {
                    C52711k.m112234a();
                }
                a.setAlpha(1.0f - f);
                LayoutParams layoutParams = this.f86136a.f86131e.f86139c.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    marginLayoutParams.height = (int) floatValue;
                    marginLayoutParams.topMargin = (int) (((float) this.f86136a.f86129c) * f);
                    marginLayoutParams.bottomMargin = (int) (f * ((float) this.f86136a.f86130d));
                    this.f86136a.f86131e.f86139c.setLayoutParams(marginLayoutParams);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: a */
    private final boolean m76196a() {
        return this.f86131e.f86138b instanceof C42146c;
    }

    /* renamed from: a */
    public static final /* synthetic */ C35475a m76195a(C33171a aVar) {
        C35475a aVar2 = aVar.f86127a;
        if (aVar2 == null) {
            C52711k.m112237a("realImChannel");
        }
        return aVar2;
    }

    /* renamed from: b */
    private static Aweme m76197b(SharePackage sharePackage) {
        String string = sharePackage.f106900i.getString("aid", "");
        if (string == null) {
            string = "";
        }
        return C23324d.m57378a().getRawAdAwemeById(string);
    }

    /* renamed from: a */
    public final void mo70329a(C35475a aVar) {
        C52711k.m112240b(aVar, "channel");
        this.f86127a = aVar;
    }

    /* renamed from: b */
    private final boolean m76198b(boolean z) {
        C35475a aVar = this.f86127a;
        if (aVar == null) {
            C52711k.m112237a("realImChannel");
        }
        View a = aVar.mo73264a();
        if (a == null) {
            C52711k.m112234a();
        }
        if ((!z || a.getVisibility() != 0) && (z || a.getVisibility() == 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private final void m76199c(boolean z) {
        C33178c cVar = this.f86131e;
        cVar.f86140d.setVisibility(8);
        if (z) {
            C35475a aVar = this.f86127a;
            if (aVar == null) {
                C52711k.m112237a("realImChannel");
            }
            aVar.mo73268c();
            cVar.f86139c.setVisibility(0);
            cVar.f86141e.setVisibility(0);
        } else {
            cVar.f86139c.setVisibility(8);
            cVar.f86141e.setVisibility(8);
        }
        C35475a aVar2 = this.f86127a;
        if (aVar2 == null) {
            C52711k.m112237a("realImChannel");
        }
        aVar2.mo73266a(z);
    }

    public C33171a(C33178c cVar) {
        C52711k.m112240b(cVar, "provider");
        this.f86131e = cVar;
        View findViewById = this.f86131e.f86138b.findViewById(R.id.d3x);
        if (findViewById != null) {
            findViewById.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C33171a f86132a;

                {
                    this.f86132a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    View a = C33171a.m76195a(this.f86132a).mo73264a();
                    if (a == null || a.getVisibility() != 0) {
                        this.f86132a.f86131e.f86138b.cancel();
                    } else {
                        this.f86132a.mo70333a(true);
                    }
                }
            });
        }
        this.f86131e.f86139c.post(new Runnable(this) {

            /* renamed from: a */
            final /* synthetic */ C33171a f86133a;

            {
                this.f86133a = r1;
            }

            public final void run() {
                LayoutParams layoutParams = this.f86133a.f86131e.f86139c.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    this.f86133a.f86128b = this.f86133a.f86131e.f86139c.getHeight();
                    this.f86133a.f86129c = marginLayoutParams.topMargin;
                    this.f86133a.f86130d = marginLayoutParams.bottomMargin;
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        });
        Dialog dialog = this.f86131e.f86138b;
        if (dialog != null && (dialog instanceof C0535b)) {
            FrameLayout frameLayout = (FrameLayout) ((C0535b) dialog).findViewById(R.id.a4q);
            if (frameLayout != null) {
                BottomSheetBehavior a = BottomSheetBehavior.m1227a(frameLayout);
                a.mo1296a(frameLayout.getHeight());
                a.f1639j = true;
            }
        }
    }

    /* renamed from: d */
    private final void m76200d(boolean z) {
        ValueAnimator valueAnimator;
        int i = 0;
        if (z) {
            C35475a aVar = this.f86127a;
            if (aVar == null) {
                C52711k.m112237a("realImChannel");
            }
            aVar.mo73268c();
            valueAnimator = ValueAnimator.ofFloat(new float[]{0.0f, (float) this.f86128b});
            C52711k.m112236a((Object) valueAnimator, "ValueAnimator.ofFloat(0F…nChannelHeight.toFloat())");
        } else {
            valueAnimator = ValueAnimator.ofFloat(new float[]{(float) this.f86128b, 0.0f});
            C52711k.m112236a((Object) valueAnimator, "ValueAnimator.ofFloat(or…nnelHeight.toFloat(), 0F)");
        }
        View view = this.f86131e.f86141e;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
        this.f86131e.f86138b.setCancelable(z);
        valueAnimator.addListener(new C33175b(this, z));
        valueAnimator.addUpdateListener(new C33176c(this));
        valueAnimator.setDuration(150);
        valueAnimator.start();
    }

    /* renamed from: a */
    public final void mo70331a(C42348d dVar) {
        C52711k.m112240b(dVar, "config");
        C33178c cVar = this.f86131e;
        SharePackage sharePackage = dVar.f106953i;
        C52711k.m112240b(sharePackage, "<set-?>");
        cVar.f86142f = sharePackage;
        this.f86131e.f86143g = dVar.f106957m;
    }

    /* renamed from: a */
    public final void mo70333a(boolean z) {
        C33171a aVar;
        if (m76198b(z)) {
            aVar = this;
        } else {
            aVar = null;
        }
        C33171a aVar2 = aVar;
        if (aVar2 != null) {
            if (aVar2.m76196a()) {
                aVar2.m76199c(z);
            } else {
                aVar2.m76200d(z);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo70334a(SharePackage sharePackage) {
        C52711k.m112240b(sharePackage, "sharePackage");
        if (C26512f.m64060c(m76197b(sharePackage))) {
            C10691a.m21542b(this.f86131e.f86137a, (int) R.string.dn).mo19066a();
            return false;
        }
        C42346c cVar = this.f86131e.f86143g;
        if (cVar != null) {
            return cVar.mo55494b(sharePackage);
        }
        C52711k.m112240b(sharePackage, "sharePackage");
        C35476a aVar = this;
        C52711k.m112240b(sharePackage, "sharePackage");
        return true;
    }

    /* renamed from: a */
    public final void mo70328a(IMContact iMContact, boolean z) {
        boolean z2;
        C52711k.m112240b(iMContact, "contact");
        C35475a aVar = this.f86127a;
        if (aVar == null) {
            C52711k.m112237a("realImChannel");
        }
        Collection b = aVar.mo73267b();
        if (b == null || b.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        mo70333a(z2);
    }

    /* renamed from: a */
    public final void mo70330a(SharePackage sharePackage, boolean z) {
        C52711k.m112240b(sharePackage, "sharePackage");
        C33177b.m76208a(this.f86131e.f86138b);
        if (C52711k.m112239a((Object) sharePackage.f106895d, (Object) CustomActionPushReceiver.f104061f)) {
            C10691a.m21533a(C11010c.m22280a(), (int) R.string.bna).mo19066a();
        }
        Bundle bundle = sharePackage.f106900i;
        if (!C52711k.m112239a((Object) bundle.getString("is_star"), (Object) "1")) {
            bundle = null;
        }
        if (bundle != null) {
            C28220g gVar = C28220g.f74083b;
            String string = bundle.getString("author_id", "");
            C52711k.m112236a((Object) string, "it.getString(SharePackage.KEY_AUTHOR_ID, \"\")");
            gVar.mo56653a(string, 3);
        }
        C42346c cVar = this.f86131e.f86143g;
        if (cVar != null) {
            cVar.mo55492a(sharePackage);
        }
    }

    /* renamed from: a */
    public final void mo70332a(String str, SharePackage sharePackage) {
        C52711k.m112240b(str, "channel");
        C52711k.m112240b(sharePackage, "sharePackage");
        Aweme b = m76197b(sharePackage);
        if (C26512f.m64061d(b)) {
            C26088l.m63381r(this.f86131e.f86137a, b);
        }
        C42346c cVar = this.f86131e.f86143g;
        if (cVar != null) {
            cVar.mo55493a(str, sharePackage);
        }
        if (C52711k.m112239a((Object) str, (Object) "chat_merge")) {
            C33177b.m76208a(this.f86131e.f86138b);
        }
    }
}
