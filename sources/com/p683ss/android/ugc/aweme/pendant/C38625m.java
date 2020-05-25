package com.p683ss.android.ugc.aweme.pendant;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.pendant.m */
public final class C38625m extends C38604f {

    /* renamed from: p */
    public static final C38628a f98246p = new C38628a(null);

    /* renamed from: q */
    private List<String> f98247q;

    /* renamed from: r */
    private List<String> f98248r;

    /* renamed from: s */
    private final SmartImageView f98249s;

    /* renamed from: t */
    private final SmartImageView f98250t;

    /* renamed from: u */
    private ValueAnimator f98251u;

    /* renamed from: v */
    private final SmartImageView f98252v;

    /* renamed from: w */
    private final SmartImageView f98253w;

    /* renamed from: com.ss.android.ugc.aweme.pendant.m$a */
    public static final class C38628a {
        private C38628a() {
        }

        public /* synthetic */ C38628a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.m$b */
    static final class C38629b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C38625m f98256a;

        /* renamed from: b */
        final /* synthetic */ List f98257b;

        /* renamed from: c */
        final /* synthetic */ SmartImageView f98258c;

        C38629b(C38625m mVar, List list, SmartImageView smartImageView) {
            this.f98256a = mVar;
            this.f98257b = list;
            this.f98258c = smartImageView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            StringBuilder sb = new StringBuilder("it.animatedValue ");
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                sb.append(((Integer) animatedValue).intValue());
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (animatedValue2 == null) {
                    throw new C52857u("null cannot be cast to non-null type kotlin.Int");
                } else if (((Integer) animatedValue2).intValue() < this.f98257b.size()) {
                    List list = this.f98257b;
                    Object animatedValue3 = valueAnimator.getAnimatedValue();
                    if (animatedValue3 != null) {
                        C12203q.m24646a((String) list.get(((Integer) animatedValue3).intValue())).mo23116a((C12197k) this.f98258c).mo23121a();
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type kotlin.Int");
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.Int");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.m$c */
    public static final class C38630c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C38625m f98259a;

        /* renamed from: b */
        final /* synthetic */ List f98260b;

        /* renamed from: c */
        final /* synthetic */ SmartImageView f98261c;

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f98259a.f98087e = false;
            this.f98261c.setVisibility(8);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f98259a.f98087e = false;
            this.f98261c.setVisibility(8);
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f98259a.f98087e = true;
            this.f98261c.setVisibility(0);
        }

        C38630c(C38625m mVar, List list, SmartImageView smartImageView) {
            this.f98259a = mVar;
            this.f98260b = list;
            this.f98261c = smartImageView;
        }
    }

    /* renamed from: e */
    public final void mo78504e() {
        ValueAnimator valueAnimator = this.f98251u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78501c() {
        /*
            r5 = this;
            boolean r0 = m85892a()
            if (r0 == 0) goto L_0x0068
            super.mo78501c()
            boolean r0 = r5.f98086d
            if (r0 == 0) goto L_0x0010
            com.bytedance.lighten.loader.SmartImageView r0 = r5.f98250t
            goto L_0x0012
        L_0x0010:
            com.bytedance.lighten.loader.SmartImageView r0 = r5.f98249s
        L_0x0012:
            boolean r1 = r5.f98086d
            if (r1 == 0) goto L_0x0020
            java.util.List<java.lang.String> r1 = r5.f98248r
            if (r1 != 0) goto L_0x0027
            java.lang.String r2 = "smallPngUrlList"
        L_0x001c:
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            goto L_0x0027
        L_0x0020:
            java.util.List<java.lang.String> r1 = r5.f98247q
            if (r1 != 0) goto L_0x0027
            java.lang.String r2 = "bigPngUrlList"
            goto L_0x001c
        L_0x0027:
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x0068
            int[] r2 = new int[r3]
            r3 = 0
            int r4 = r1.size()
            r2[r3] = r4
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r2)
            java.lang.String r3 = "ValueAnimator.ofInt(urlList.size)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r5.f98251u = r2
            android.animation.ValueAnimator r2 = r5.f98251u
            r3 = 2000(0x7d0, double:9.88E-321)
            r2.setDuration(r3)
            r3 = 0
            r2.setInterpolator(r3)
            com.ss.android.ugc.aweme.pendant.m$b r3 = new com.ss.android.ugc.aweme.pendant.m$b
            r3.<init>(r5, r1, r0)
            android.animation.ValueAnimator$AnimatorUpdateListener r3 = (android.animation.ValueAnimator.AnimatorUpdateListener) r3
            r2.addUpdateListener(r3)
            com.ss.android.ugc.aweme.pendant.m$c r3 = new com.ss.android.ugc.aweme.pendant.m$c
            r3.<init>(r5, r1, r0)
            android.animation.Animator$AnimatorListener r3 = (android.animation.Animator.AnimatorListener) r3
            r2.addListener(r3)
            r2.start()
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.pendant.C38625m.mo78501c():void");
    }

    /* renamed from: a */
    public final void mo78531a(C38622k kVar) {
        C52711k.m112240b(kVar, "resConfigure");
        super.mo78531a(kVar);
        if (m85892a()) {
            List<String> list = kVar.f98237f;
            if (list == null) {
                list = C52575l.m112097a();
            }
            this.f98247q = list;
            List<String> list2 = kVar.f98238g;
            if (list2 == null) {
                list2 = C52575l.m112097a();
            }
            this.f98248r = list2;
            List<String> list3 = this.f98247q;
            if (list3 == null) {
                C52711k.m112237a("bigPngUrlList");
            }
            for (String a : list3) {
                C12203q.m24646a(a).mo23129d();
            }
            List<String> list4 = this.f98248r;
            if (list4 == null) {
                C52711k.m112237a("smallPngUrlList");
            }
            for (String a2 : list4) {
                C12203q.m24646a(a2).mo23129d();
            }
        }
    }

    public C38625m(Context context, View view, SmartImageView smartImageView, SmartImageView smartImageView2, View view2, final C38609g gVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(view, C42311c.f106865i);
        C52711k.m112240b(smartImageView, "bigImageView");
        C52711k.m112240b(smartImageView2, "smallImageView");
        C52711k.m112240b(view2, "closeBtn");
        C52711k.m112240b(gVar, "configure");
        super(context, view, smartImageView, smartImageView2, view2, gVar);
        this.f98252v = smartImageView;
        this.f98253w = smartImageView2;
        View findViewById = view.findViewById(R.id.dzb);
        C52711k.m112236a((Object) findViewById, "content.findViewById(R.id.big_twinkle_img)");
        this.f98249s = (SmartImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.ewd);
        C52711k.m112236a((Object) findViewById2, "content.findViewById(R.id.small_twinkle_img)");
        this.f98250t = (SmartImageView) findViewById2;
        this.f98249s.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C52670a<C52860x> aVar = gVar.f98196c;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        });
        this.f98250t.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C52670a<C52860x> aVar = gVar.f98196c;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        });
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0});
        C52711k.m112236a((Object) ofInt, "ValueAnimator.ofInt(0)");
        this.f98251u = ofInt;
    }
}
