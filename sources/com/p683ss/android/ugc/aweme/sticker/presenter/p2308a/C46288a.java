package com.p683ss.android.ugc.aweme.sticker.presenter.p2308a;

import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Random;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.a.a */
public final class C46288a implements C46291c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f116784a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C46288a.class), "random", "getRandom()Ljava/util/Random;"))};

    /* renamed from: b */
    private final C52668f f116785b = C52732g.m112285a(C46289a.f116787a);

    /* renamed from: c */
    private final C52688s<Integer, Integer, String, Effect, Boolean, Integer> f116786c;

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.a.a$a */
    static final class C46289a extends C52712l implements C52670a<Random> {

        /* renamed from: a */
        public static final C46289a f116787a = new C46289a();

        C46289a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new Random();
        }
    }

    /* renamed from: b */
    private final Random m100504b() {
        return (Random) this.f116785b.getValue();
    }

    /* renamed from: a */
    public final int mo93009a() {
        return m100503b(null, false);
    }

    public C46288a(C52688s<? super Integer, ? super Integer, ? super String, ? super Effect, ? super Boolean, Integer> sVar) {
        C52711k.m112240b(sVar, "setSticker");
        this.f116786c = sVar;
    }

    /* renamed from: a */
    public final int mo93010a(Effect effect, boolean z) {
        C52711k.m112240b(effect, "sticker");
        return m100503b(effect, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r1 == null) goto L_0x0013;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m100503b(com.p683ss.android.ugc.effectmanager.effect.model.Effect r9, boolean r10) {
        /*
            r8 = this;
            java.util.Random r0 = r8.m100504b()
            int r0 = r0.nextInt()
            if (r9 == 0) goto L_0x0013
            java.lang.String r1 = r9.getUnzipPath()
            if (r1 != 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = r1
            goto L_0x0016
        L_0x0013:
            java.lang.String r1 = ""
            goto L_0x0011
        L_0x0016:
            if (r9 == 0) goto L_0x0029
            java.lang.String r1 = r9.getEffectId()
            if (r1 == 0) goto L_0x0029
            java.lang.Integer r1 = p2628d.p2650m.C52830p.m112395c(r1)
            if (r1 == 0) goto L_0x0029
            int r1 = r1.intValue()
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            d.f.a.s<java.lang.Integer, java.lang.Integer, java.lang.String, com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Boolean, java.lang.Integer> r2 = r8.f116786c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r10)
            r6 = r9
            java.lang.Object r9 = r2.mo58987a(r3, r4, r5, r6, r7)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.presenter.p2308a.C46288a.m100503b(com.ss.android.ugc.effectmanager.effect.model.Effect, boolean):int");
    }
}
