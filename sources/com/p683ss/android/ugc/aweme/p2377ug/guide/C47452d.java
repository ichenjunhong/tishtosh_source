package com.p683ss.android.ugc.aweme.p2377ug.guide;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.common.widget.C26963a;
import com.p683ss.android.ugc.aweme.experiment.AnimationOptAB;
import com.p683ss.android.ugc.aweme.experiment.StaticLayoutAB;
import com.p683ss.android.ugc.aweme.main.p1940d.p1941a.C36577a;
import com.p683ss.android.ugc.aweme.p1397az.C23337c;
import com.p683ss.android.ugc.aweme.p1911j.C35708a;
import com.p683ss.android.ugc.aweme.share.viewmodel.C42245a;
import com.p683ss.android.ugc.aweme.share.viewmodel.C42245a.C42246a;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1715j;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ug.guide.d */
public final class C47452d extends C36577a {

    /* renamed from: m */
    public static final C47453a f119702m = new C47453a(null);

    /* renamed from: a */
    public final C42245a f119703a;

    /* renamed from: b */
    public final boolean f119704b = C10181b.m20511a().mo18172a(AnimationOptAB.class, true, "anim_opt", 31744, true);

    /* renamed from: d */
    public final String f119705d = "swipeStrengthLayout";

    /* renamed from: e */
    public View f119706e;

    /* renamed from: f */
    public AnimationImageView f119707f;

    /* renamed from: g */
    public SwipeUpGuideStrengthenLayout f119708g;

    /* renamed from: h */
    public final ViewGroup f119709h;

    /* renamed from: i */
    public final C26963a f119710i;

    /* renamed from: j */
    public final String f119711j;

    /* renamed from: k */
    public final boolean f119712k;

    /* renamed from: l */
    public final boolean f119713l;

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.d$a */
    public static final class C47453a {
        private C47453a() {
        }

        public /* synthetic */ C47453a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.d$b */
    static final class C47454b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f119714a;

        /* renamed from: b */
        final /* synthetic */ C47452d f119715b;

        C47454b(View view, C47452d dVar) {
            this.f119714a = view;
            this.f119715b = dVar;
        }

        public final void run() {
            this.f119714a.setVisibility(8);
            this.f119715b.f119707f = null;
            this.f119715b.f119703a.mo86217d(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.d$c */
    public static final class C47455c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f119716a;

        /* renamed from: b */
        final /* synthetic */ C47452d f119717b;

        public C47455c(View view, C47452d dVar) {
            this.f119716a = view;
            this.f119717b = dVar;
        }

        public final void run() {
            int i;
            this.f119717b.f119707f = (AnimationImageView) this.f119716a.findViewById(R.id.b15);
            if (!this.f119717b.f119704b || !C23337c.m57398a()) {
                AnimationImageView animationImageView = this.f119717b.f119707f;
                if (animationImageView != null) {
                    animationImageView.mo6658c(true);
                }
                AnimationImageView animationImageView2 = this.f119717b.f119707f;
                if (animationImageView2 != null) {
                    animationImageView2.setAnimation(this.f119717b.f119711j);
                }
                AnimationImageView animationImageView3 = this.f119717b.f119707f;
                if (animationImageView3 != null) {
                    animationImageView3.mo6654b();
                }
            } else {
                ImageView imageView = (ImageView) this.f119716a.findViewById(R.id.eew);
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                if (C10181b.m20511a().mo18168a(StaticLayoutAB.class, true, "static_swipup_guide_style", 31744, 1) == StaticLayoutAB.LAYOUT2) {
                    i = R.drawable.ct4;
                } else {
                    i = R.drawable.ct3;
                }
                ImageView imageView2 = (ImageView) this.f119716a.findViewById(R.id.eew);
                if (imageView2 != null) {
                    imageView2.setImageResource(i);
                }
                DmtTextView dmtTextView = (DmtTextView) this.f119716a.findViewById(R.id.f4m);
                if (dmtTextView != null) {
                    dmtTextView.setVisibility(0);
                }
                AnimationImageView animationImageView4 = this.f119717b.f119707f;
                if (animationImageView4 != null) {
                    animationImageView4.setVisibility(8);
                }
            }
            if (this.f119717b.f119712k) {
                C2201v.m6592a(6000, TimeUnit.MILLISECONDS).mo6522a((C1715j<? super T>) new C1715j<Long>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C47455c f119718a;

                    {
                        this.f119718a = r1;
                    }

                    /* renamed from: a */
                    public final /* synthetic */ boolean mo6207a(Object obj) {
                        C52711k.m112240b((Long) obj, "it");
                        View view = this.f119718a.f119717b.f119706e;
                        if (view == null || view.getVisibility() != 0) {
                            return false;
                        }
                        return true;
                    }
                }).mo6529b(C1667a.m5940a()).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C1710e<Long>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C47455c f119719a;

                    {
                        this.f119719a = r1;
                    }

                    public final /* synthetic */ void accept(Object obj) {
                        Long l = (Long) obj;
                        this.f119719a.f119717b.dismiss();
                    }
                });
            }
        }
    }

    public final void dismiss() {
        if (C52711k.m112239a((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
            View view = this.f119706e;
            if (view != null) {
                view.animate().alpha(0.0f).setDuration(300).withEndAction(new C47454b(view, this)).start();
            }
        } else {
            String stackTraceString = Log.getStackTraceString(new Throwable("execute UI not in main Thread"));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_stack", stackTraceString);
                jSONObject.put("error_type", "UI_not_in_main");
                C35708a.m80693a(jSONObject);
            } catch (Exception unused) {
                C35708a.f91668a.mo74317a(stackTraceString);
            }
        }
    }

    public C47452d(ViewGroup viewGroup, C26963a aVar, String str, boolean z, boolean z2) {
        C52711k.m112240b(viewGroup, "viewContainer");
        C52711k.m112240b(aVar, "viewPager");
        C52711k.m112240b(str, "source");
        super(viewGroup);
        this.f119709h = viewGroup;
        this.f119710i = aVar;
        this.f119711j = str;
        this.f119712k = z;
        this.f119713l = z2;
        C42246a aVar2 = C42245a.f106807d;
        Context context = this.f119709h.getContext();
        C52711k.m112236a((Object) context, "viewContainer.context");
        this.f119703a = aVar2.mo86224a(context);
    }
}
