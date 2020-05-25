package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse.ServerTimeExtra;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bv */
public final class C42477bv {
    /* renamed from: b */
    public static String m93328b(Throwable th) {
        if (th instanceof C23459a) {
            Object rawResponse = ((C23459a) th).getRawResponse();
            if (rawResponse instanceof BaseResponse) {
                ServerTimeExtra serverTimeExtra = ((BaseResponse) rawResponse).extra;
                if (serverTimeExtra != null) {
                    return serverTimeExtra.logid;
                }
            }
        }
        return "";
    }

    /* renamed from: a */
    public static int m93327a(Throwable th) {
        int i;
        if (!C42478bw.m93329a(C39618d.f101160a)) {
            i = -2;
        } else {
            i = -1;
        }
        if (th instanceof C23459a) {
            return ((C23459a) th).getErrorCode();
        }
        return i;
    }

    /* renamed from: a */
    public static int m93326a(int i, Throwable th) {
        if (!(th instanceof C23459a) && !C42478bw.m93329a(C39618d.f101160a)) {
            return i * 10000;
        }
        return i;
    }
}
