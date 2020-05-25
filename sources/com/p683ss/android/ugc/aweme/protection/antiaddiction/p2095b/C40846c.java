package com.p683ss.android.ugc.aweme.protection.antiaddiction.p2095b;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.antiaddic.p1353a.C22689a;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.protection.antiaddiction.C40839a;
import com.p683ss.android.ugc.aweme.protection.antiaddiction.C40849c;
import com.p683ss.android.ugc.aweme.protection.antiaddiction.C40853f;
import com.p683ss.android.ugc.aweme.protection.antiaddiction.api.TiktokRelieveAweme;
import com.p683ss.android.ugc.aweme.protection.antiaddiction.api.TiktokRelieveAwemeApi;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.protection.antiaddiction.b.c */
public final class C40846c extends C40839a {

    /* renamed from: a */
    private final C22689a f104000a = new C22689a() {
        /* renamed from: a */
        public final C23051bf<Long> mo47077a() {
            SharePrefCache inst = SharePrefCache.inst();
            C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
            C23051bf<Long> lastGetRelieveAwemeTime = inst.getLastGetRelieveAwemeTime();
            C52711k.m112236a((Object) lastGetRelieveAwemeTime, "SharePrefCache.inst().lastGetRelieveAwemeTime");
            return lastGetRelieveAwemeTime;
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.protection.antiaddiction.b.c$a */
    public static final class C40848a implements C1674ab<TiktokRelieveAweme> {
        C40848a() {
        }

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public final /* synthetic */ void onNext(Object obj) {
            TiktokRelieveAweme tiktokRelieveAweme = (TiktokRelieveAweme) obj;
            C52711k.m112240b(tiktokRelieveAweme, "t");
            if (!TextUtils.isEmpty(tiktokRelieveAweme.getAwemeId())) {
                C40849c.m90331a().f104002a = true;
                C40853f.f104016a = tiktokRelieveAweme.getAwemeId();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo83168a(long j, long j2) {
        if (!C40853f.m90345a() || !C40849c.m90331a().mo83177a(j, j2) || !this.f104000a.mo47079b(j)) {
            return false;
        }
        this.f104000a.mo47078a(j);
        try {
            TiktokRelieveAwemeApi.f103992a.getTiktokRelieveAweme(C40849c.m90331a().mo83176a(System.currentTimeMillis()) ^ true ? 1 : 0).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C40848a<Object>());
        } catch (Exception unused) {
        }
        return true;
    }
}
