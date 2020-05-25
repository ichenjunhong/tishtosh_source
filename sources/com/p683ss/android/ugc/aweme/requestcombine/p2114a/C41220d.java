package com.p683ss.android.ugc.aweme.requestcombine.p2114a;

import com.p683ss.android.ugc.aweme.lego.C35857a.C35862d;
import com.p683ss.android.ugc.aweme.profile.p2084b.C39802f;
import com.p683ss.android.ugc.aweme.profile.util.C40521ab.C40522a;
import com.p683ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a.d */
public final class C41220d extends C41216a {

    /* renamed from: a */
    private BaseCombineMode f104667a;

    /* renamed from: com.ss.android.ugc.aweme.requestcombine.a.d$a */
    public static final class C41221a implements C40522a {
        C41221a() {
        }

        /* renamed from: a */
        public final void mo82802a() {
            C47718bf.m103288a(new C39802f());
        }
    }

    /* renamed from: a */
    public final String mo83708a() {
        return null;
    }

    /* renamed from: a */
    public final void mo83710a(C35862d dVar) {
        C52711k.m112240b(dVar, "transaction");
    }

    /* renamed from: b */
    public final BaseCombineMode mo83712b() {
        return this.f104667a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0012  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo83711a(com.p683ss.android.ugc.aweme.requestcombine.model.SettingCombineModel r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x000e
            com.ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel r6 = r6.getData()
            if (r6 == 0) goto L_0x000e
            com.ss.android.ugc.aweme.requestcombine.model.YellowPointCombineModel r6 = r6.getYellowPointModel()
            goto L_0x000f
        L_0x000e:
            r6 = r0
        L_0x000f:
            r1 = 0
            if (r6 == 0) goto L_0x0086
            com.ss.android.ugc.aweme.profile.model.YellowPointResponse r2 = r6.getYellowPoint()
            if (r2 == 0) goto L_0x0086
            int r2 = r2.status_code
            if (r2 == 0) goto L_0x001d
            goto L_0x0086
        L_0x001d:
            r2 = r6
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r2 = (com.p683ss.android.ugc.aweme.requestcombine.model.BaseCombineMode) r2
            r5.f104667a = r2
            int r2 = r6.getHttpCode()
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 1
            if (r2 != r3) goto L_0x002d
            r2 = 1
            goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            if (r2 == 0) goto L_0x0085
            com.ss.android.ugc.aweme.profile.model.YellowPointResponse r6 = r6.getYellowPoint()
            if (r6 == 0) goto L_0x0038
            java.util.List<com.ss.android.ugc.aweme.profile.model.NeedPointStruct> r0 = r6.needPoints
        L_0x0038:
            com.ss.android.ugc.aweme.requestcombine.a.d$a r6 = new com.ss.android.ugc.aweme.requestcombine.a.d$a
            r6.<init>()
            com.ss.android.ugc.aweme.profile.util.ab$a r6 = (com.p683ss.android.ugc.aweme.profile.util.C40521ab.C40522a) r6
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L_0x004a
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x004b
        L_0x004a:
            r1 = 1
        L_0x004b:
            if (r1 != 0) goto L_0x0085
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            if (r1 == 0) goto L_0x0085
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getCurUser()
            if (r1 == 0) goto L_0x0085
            java.lang.String r1 = r1.getUid()
            if (r1 != 0) goto L_0x0060
            goto L_0x0085
        L_0x0060:
            com.ss.android.ugc.aweme.profile.util.ab$d r3 = new com.ss.android.ugc.aweme.profile.util.ab$d
            r3.<init>(r1, r0)
            c.a.y r3 = (p064c.p065a.C2205y) r3
            c.a.v r0 = p064c.p065a.C2201v.m6601a(r3)
            c.a.ac r1 = p064c.p065a.p093k.C2168a.m6521b()
            c.a.v r0 = r0.mo6529b(r1)
            c.a.ac r1 = p064c.p065a.p066a.p068b.C1667a.m5940a()
            c.a.v r0 = r0.mo6514a(r1)
            com.ss.android.ugc.aweme.profile.util.ab$e r1 = new com.ss.android.ugc.aweme.profile.util.ab$e
            r1.<init>(r6)
            c.a.d.e r1 = (p064c.p065a.p071d.C1710e) r1
            r0.mo6545f(r1)
        L_0x0085:
            return r2
        L_0x0086:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41220d.mo83711a(com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel):boolean");
    }
}
