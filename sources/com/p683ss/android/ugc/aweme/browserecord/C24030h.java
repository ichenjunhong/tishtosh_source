package com.p683ss.android.ugc.aweme.browserecord;

import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.browserecord.h */
public final class C24030h {

    /* renamed from: a */
    public static int f63763a;

    /* renamed from: b */
    public static final C24030h f63764b = new C24030h();

    /* renamed from: com.ss.android.ugc.aweme.browserecord.h$a */
    public static final class C24031a<T> implements C1710e<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ boolean f63765a;

        public C24031a(boolean z) {
            this.f63765a = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            BaseResponse baseResponse = (BaseResponse) obj;
            C24030h.m58831a(this.f63765a ? 1 : 0);
        }
    }

    private C24030h() {
    }

    /* renamed from: a */
    public static void m58831a(int i) {
        f63763a = i;
    }
}
