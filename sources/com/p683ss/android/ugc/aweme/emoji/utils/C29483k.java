package com.p683ss.android.ugc.aweme.emoji.utils;

import com.bytedance.common.utility.p524d.C9396a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.model.C29358c;
import com.taobao.android.dexposed.ClassUtils;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.k */
public final class C29483k {
    /* renamed from: a */
    private static String m69570a() {
        StringBuilder sb = new StringBuilder();
        sb.append(C9396a.m18577a(C11010c.m22280a()));
        sb.append("/im_resources/");
        return sb.toString();
    }

    /* renamed from: b */
    public static String m69575b(C29358c cVar) {
        return m69576b(cVar.getType(), cVar.getId(), cVar.getVersion());
    }

    /* renamed from: a */
    public static String m69572a(C29358c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(m69573a(cVar.getType()));
        sb.append(m69571a(cVar.getId(), cVar.getVersion()));
        sb.append(".zip");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m69573a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(m69570a());
        sb.append(str);
        sb.append("/");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m69571a(long j, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("_");
        if (str == null) {
            str2 = "";
        } else {
            str2 = str.replace(ClassUtils.PACKAGE_SEPARATOR, "_");
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    public static String m69576b(String str, long j, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(m69574a(str, j, str2));
        sb.append("/");
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m69574a(String str, long j, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(m69573a(str));
        sb.append(m69571a(j, str2));
        return sb.toString();
    }
}
