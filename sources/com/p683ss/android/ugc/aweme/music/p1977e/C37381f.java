package com.p683ss.android.ugc.aweme.music.p1977e;

import com.bytedance.common.utility.C9395d;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.music.e.f */
public final class C37381f {

    /* renamed from: a */
    public static final String f95373a;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig().musicDir());
        sb.append("rhythm/");
        f95373a = sb.toString();
    }

    /* renamed from: a */
    public static String m83705a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(f95373a);
        sb.append(m83706b(str));
        return sb.toString();
    }

    /* renamed from: b */
    public static String m83706b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C9395d.m18571a(str));
        sb.append(".json");
        return sb.toString();
    }
}
