package com.p683ss.android.ugc.aweme.p1441bn;

import com.p683ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.bn.a */
public final class C23863a implements ISpecialPlusService {

    /* renamed from: a */
    public static final C52668f f63537a = C52732g.m112285a(C23865b.f63540a);

    /* renamed from: b */
    public static final C23864a f63538b = new C23864a(null);

    /* renamed from: com.ss.android.ugc.aweme.bn.a$a */
    public static final class C23864a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f63539a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23864a.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/ugc/aweme/specialplus/SpecialPlusServiceImpl;"))};

        private C23864a() {
        }

        /* renamed from: a */
        public static C23863a m58580a() {
            return (C23863a) C23863a.f63537a.getValue();
        }

        public /* synthetic */ C23864a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bn.a$b */
    static final class C23865b extends C52712l implements C52670a<C23863a> {

        /* renamed from: a */
        public static final C23865b f63540a = new C23865b();

        C23865b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23863a();
        }
    }

    public final String getSpecialPlusOpenUrl() {
        return null;
    }

    public final String getSpecialPlusTips() {
        return null;
    }

    public final boolean isNeedShowSpecialPlusDirect() {
        return false;
    }

    public final void setSpecialPlusClicked() {
    }

    public final void setSpecialPlusShowed() {
    }

    public final boolean shouldShowSpecialPlus() {
        return false;
    }

    public final List<String> getSpecialPlusEffectList() {
        return C52575l.m112097a();
    }
}
