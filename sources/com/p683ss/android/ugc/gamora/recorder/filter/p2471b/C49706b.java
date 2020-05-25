package com.p683ss.android.ugc.gamora.recorder.filter.p2471b;

import com.bytedance.als.C2759d;
import com.bytedance.als.C2764h;
import com.bytedance.als.C2767k;
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.group.C12896b;
import com.p683ss.android.ugc.gamora.recorder.filter.p2470a.C49683a;
import com.p683ss.android.ugc.gamora.recorder.filter.p2470a.C49684b;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.filter.b.b */
public final class C49706b extends C2764h<C49705a> implements C12356a, C49705a {

    /* renamed from: a */
    public final C49705a f124661a = this;

    /* renamed from: b */
    public final C49708c f124662b = new C49708c();

    /* renamed from: c */
    private final C49683a f124663c = ((C49683a) mo23370j().mo23373a(C49683a.class, (String) null));

    /* renamed from: d */
    private final C12896b f124664d;

    /* renamed from: e */
    private final C12361b f124665e;

    /* renamed from: f */
    private final int f124666f = R.id.c_q;

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.b.b$a */
    static final class C49707a<T> implements C2767k<C49684b> {

        /* renamed from: a */
        final /* synthetic */ C49706b f124667a;

        C49707a(C49706b bVar) {
            this.f124667a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
            if (r0 == null) goto L_0x007a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0085, code lost:
            if (r0 == null) goto L_0x0087;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0095 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r12) {
            /*
                r11 = this;
                com.ss.android.ugc.gamora.recorder.filter.a.b r12 = (com.p683ss.android.ugc.gamora.recorder.filter.p2470a.C49684b) r12
                com.ss.android.ugc.gamora.recorder.filter.b.b r0 = r11.f124667a
                com.ss.android.ugc.gamora.recorder.filter.b.c r0 = r0.f124662b
                r1 = 0
                if (r12 == 0) goto L_0x000c
                com.ss.android.ugc.aweme.filter.g r2 = r12.f124614a
                goto L_0x000d
            L_0x000c:
                r2 = r1
            L_0x000d:
                if (r12 == 0) goto L_0x0012
                com.ss.android.ugc.aweme.filter.g r3 = r12.f124615b
                goto L_0x0013
            L_0x0012:
                r3 = r1
            L_0x0013:
                if (r12 == 0) goto L_0x0019
                boolean r12 = r12.f124616c
                r7 = r12
                goto L_0x001b
            L_0x0019:
                r12 = 0
                r7 = 0
            L_0x001b:
                com.ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator r12 = r0.f124668i
                if (r12 != 0) goto L_0x0044
                android.view.View r12 = r0.mo24472r_()
                r4 = 2132019040(0x7f140760, float:1.9676404E38)
                android.view.View r12 = r12.findViewById(r4)
                java.lang.String r4 = "requireView().findViewBy…id.filter_indicator_stub)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r12, r4)
                android.support.v7.widget.ViewStubCompat r12 = (android.support.p043v7.widget.ViewStubCompat) r12
                android.view.View r12 = r12.mo5425a()
                if (r12 == 0) goto L_0x003c
                com.ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator r12 = (com.p683ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator) r12
                r0.f124668i = r12
                goto L_0x0044
            L_0x003c:
                d.u r12 = new d.u
                java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator"
                r12.<init>(r0)
                throw r12
            L_0x0044:
                com.ss.android.ugc.aweme.port.in.u r12 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.filter.c.a r12 = r12.mo58584o()
                com.ss.android.ugc.aweme.filter.repository.a.l r12 = r12.mo64334d()
                com.ss.android.ugc.aweme.filter.repository.a.n r12 = r12.mo64415e()
                if (r2 == 0) goto L_0x0061
                com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r4 = com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c.m73327b(r12, r2)
                if (r4 == 0) goto L_0x0061
                java.lang.String r4 = r4.getName()
                goto L_0x0062
            L_0x0061:
                r4 = r1
            L_0x0062:
                if (r3 == 0) goto L_0x006e
                com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r12 = com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c.m73327b(r12, r3)
                if (r12 == 0) goto L_0x006e
                java.lang.String r1 = r12.getName()
            L_0x006e:
                com.ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator r12 = r0.f124668i
                if (r12 == 0) goto L_0x0095
                com.ss.android.ugc.aweme.shortvideo.j.b r5 = new com.ss.android.ugc.aweme.shortvideo.j.b
                if (r2 == 0) goto L_0x007a
                java.lang.String r0 = r2.f82325b
                if (r0 != 0) goto L_0x007c
            L_0x007a:
                java.lang.String r0 = ""
            L_0x007c:
                r5.<init>(r0, r4)
                com.ss.android.ugc.aweme.shortvideo.j.b r6 = new com.ss.android.ugc.aweme.shortvideo.j.b
                if (r3 == 0) goto L_0x0087
                java.lang.String r0 = r3.f82325b
                if (r0 != 0) goto L_0x0089
            L_0x0087:
                java.lang.String r0 = ""
            L_0x0089:
                r6.<init>(r0, r1)
                r8 = 0
                r9 = 8
                r10 = 0
                r4 = r12
                r4.mo93945a(r5, r6, r7, false)
                return
            L_0x0095:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.filter.p2471b.C49706b.C49707a.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f124665e;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2759d mo7353a() {
        return this.f124661a;
    }

    public final void bO_() {
        super.bO_();
        this.f124664d.mo24389a(this.f124666f, (C12924i) this.f124662b, "FilterSwipeIndicatorScene");
        this.f124663c.mo97574g().mo7349a(this, new C49707a(this));
    }

    public C49706b(C12896b bVar, C12361b bVar2, int i) {
        C52711k.m112240b(bVar, "parentScene");
        C52711k.m112240b(bVar2, "diContainer");
        this.f124664d = bVar;
        this.f124665e = bVar2;
    }
}
