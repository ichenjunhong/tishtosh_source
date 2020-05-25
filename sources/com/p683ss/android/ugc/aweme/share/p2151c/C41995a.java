package com.p683ss.android.ugc.aweme.share.p2151c;

import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.share.c.a */
public interface C41995a {

    /* renamed from: a */
    public static final String f106290a = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig().shareDir();

    /* renamed from: b */
    public static final String f106291b;

    /* renamed from: c */
    public static final String f106292c;

    /* renamed from: d */
    public static final String f106293d;

    /* renamed from: e */
    public static final String f106294e;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(f106290a);
        sb.append("tmp/");
        f106291b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f106290a);
        sb2.append("pic/");
        f106292c = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f106290a);
        sb3.append("out/");
        f106293d = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(f106290a);
        sb4.append("openPlatform/");
        f106294e = sb4.toString();
    }
}
