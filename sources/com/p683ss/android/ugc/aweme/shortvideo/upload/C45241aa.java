package com.p683ss.android.ugc.aweme.shortvideo.upload;

import com.p683ss.android.ugc.aweme.shortvideo.C42477bv;
import com.p683ss.ttuploader.TTVideoInfo;
import p2628d.p2629a.C52568f;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.aa */
public final class C45241aa extends RuntimeException {
    public static final C45242a Companion = new C45242a(null);
    public static final Integer[] USER_NETWORK_BAD_CODES = {Integer.valueOf(-5), Integer.valueOf(-110), Integer.valueOf(120000)};

    /* renamed from: a */
    private final TTVideoInfo f114423a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.aa$a */
    public static final class C45242a {
        private C45242a() {
        }

        public /* synthetic */ C45242a(C52707g gVar) {
            this();
        }
    }

    public final long getErrorCode() {
        TTVideoInfo tTVideoInfo = this.f114423a;
        if (tTVideoInfo != null) {
            return tTVideoInfo.mErrcode;
        }
        return 0;
    }

    public C45241aa(TTVideoInfo tTVideoInfo) {
        this.f114423a = tTVideoInfo;
    }

    public static final boolean isUserNetworkBad(int i) {
        return C52568f.m112077a((Object[]) USER_NETWORK_BAD_CODES, (Object) Integer.valueOf(i));
    }

    public static final int resolveErrorCode(Throwable th) {
        C52711k.m112240b(th, "t");
        int a = C42477bv.m93326a(12, th);
        if (!(th instanceof C45241aa)) {
            return a;
        }
        C45241aa aaVar = (C45241aa) th;
        if (aaVar.getErrorCode() != 0) {
            return (int) aaVar.getErrorCode();
        }
        return a;
    }
}
