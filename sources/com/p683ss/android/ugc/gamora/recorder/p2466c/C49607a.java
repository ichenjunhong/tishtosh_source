package com.p683ss.android.ugc.gamora.recorder.p2466c;

import android.support.p030v4.app.FragmentActivity;
import com.bytedance.als.ApiCenter.C2755a;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2762f;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24434d;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.tools.C47062g;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.c.a */
public interface C49607a extends C2759d {

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.a$a */
    public static final class C49608a {

        /* renamed from: a */
        public static final C49608a f124440a = new C49608a();

        private C49608a() {
        }

        /* renamed from: a */
        public static final C49607a m107072a(FragmentActivity fragmentActivity) {
            C49607a b = m107073b(fragmentActivity);
            if (b == null) {
                C52711k.m112234a();
            }
            return b;
        }

        /* renamed from: b */
        public static final C49607a m107073b(FragmentActivity fragmentActivity) {
            if (fragmentActivity == null) {
                return null;
            }
            return (C49607a) C2755a.m7851a(fragmentActivity).mo7341b(C49607a.class);
        }
    }

    /* renamed from: a */
    void mo97513a(float f, float f2);

    /* renamed from: a */
    void mo97514a(C24434d dVar);

    /* renamed from: a */
    void mo97515a(C42482c cVar);

    /* renamed from: a */
    void mo97516a(C47062g gVar);

    /* renamed from: a */
    void mo97517a(Boolean bool, Boolean bool2, Boolean bool3);

    /* renamed from: a */
    void mo97518a(Integer num);

    /* renamed from: a */
    void mo97519a(boolean z);

    /* renamed from: a */
    void mo97520a(boolean z, String str, C42482c cVar, String str2);

    /* renamed from: e */
    C2762f<C52860x> mo97521e();

    /* renamed from: g */
    C2762f<C52860x> mo97522g();

    /* renamed from: k */
    void mo97523k();

    /* renamed from: l */
    void mo97524l();

    /* renamed from: m */
    void mo97525m();
}
