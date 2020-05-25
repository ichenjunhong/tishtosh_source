package com.p683ss.android.ugc.aweme.shortvideo.upload;

import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C43852fu;
import com.p683ss.android.ugc.aweme.shortvideo.net.C44332b;
import com.p683ss.android.ugc.tools.utils.C50203g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b */
public final class C45252b {
    /* renamed from: a */
    private static final int m98737a(C43852fu fuVar) {
        if (!fuVar.f111087w) {
            return -1;
        }
        if (C44332b.m97107a(C39629l.m88233b())) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static final int m98738a(C43852fu fuVar, String str) {
        C52711k.m112240b(fuVar, "config");
        C52711k.m112240b(str, "scene");
        int a = m98737a(fuVar);
        StringBuilder sb = new StringBuilder("TTUploader ");
        sb.append(str);
        sb.append(" checkNetState: ");
        sb.append(a);
        C50203g.m108358a(sb.toString());
        return a;
    }
}
