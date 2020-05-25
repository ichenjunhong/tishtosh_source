package com.p683ss.android.ugc.aweme.emoji.utils;

import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.taobao.android.dexposed.ClassUtils;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.c */
public final class C29473c {
    /* renamed from: a */
    public static String m69541a() {
        StringBuilder sb = new StringBuilder();
        sb.append(C29483k.m69576b("STICKER", 0, "0"));
        sb.append("/static/");
        return sb.toString();
    }

    /* renamed from: b */
    public static String m69544b(C29366a aVar) {
        return m69542a(aVar.getResourcesId(), aVar.getVersion(), aVar.getId(), aVar.getAnimateType());
    }

    /* renamed from: c */
    public static String m69545c(C29366a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.getId());
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(aVar.getStaticType());
        return sb.toString();
    }

    /* renamed from: a */
    public static String m69543a(C29366a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(C29483k.m69576b("STICKER", aVar.getResourcesId(), aVar.getVersion()));
        sb.append("/static/");
        sb.append(aVar.getId());
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(aVar.getStaticType());
        return sb.toString();
    }

    /* renamed from: a */
    public static String m69542a(long j, String str, long j2, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(C29483k.m69576b("STICKER", j, str));
        sb.append("/animate/");
        sb.append(j2);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(str2);
        return sb.toString();
    }
}
