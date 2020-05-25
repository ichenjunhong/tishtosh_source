package com.p683ss.android.ugc.aweme.shortvideo.upload.httpdns;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.ttuploader.TTUploadResolver;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.httpdns.a */
public final class C45301a {
    /* renamed from: a */
    public static final void m98772a() {
        HttpDNSConfig b = m98773b();
        if (b != null) {
            TTUploadResolver.setDNSType(b.getVersion(), b.getMainDNSType(), b.getBackDNSType(), b.getBackUpUsedDelayTime(), b.getExpiredTime());
        }
    }

    /* renamed from: b */
    private static final HttpDNSConfig m98773b() {
        HttpDNSConfig httpDNSConfig;
        String e = C39629l.m88232a().mo58583n().mo83107e(C40790a.TTUploaderHttpDNSConfig);
        StringBuilder sb = new StringBuilder("solveHttpDNSConfig json : ");
        sb.append(e);
        C45407ay.m98968a(sb.toString());
        try {
            httpDNSConfig = (HttpDNSConfig) new C17971f().mo34884a(e, HttpDNSConfig.class);
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder("solveHttpDNSConfig failed: ");
            sb2.append(e);
            C45407ay.m98971b(sb2.toString());
            httpDNSConfig = null;
        }
        StringBuilder sb3 = new StringBuilder("solveHttpDNSConfig config : ");
        sb3.append(httpDNSConfig);
        C45407ay.m98968a(sb3.toString());
        return httpDNSConfig;
    }
}
