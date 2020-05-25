package com.p683ss.android.ugc.aweme.comment.abtest;

import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;

/* renamed from: com.ss.android.ugc.aweme.comment.abtest.a */
public final class C25069a {
    /* renamed from: a */
    public static void m60927a(String str) {
        C23131p.m57779a("comment_not_show", new C23088c().mo47824a("comment_not_show_message", str).mo47825b());
    }

    /* renamed from: b */
    public static void m60928b(String str) {
        StringBuilder sb = new StringBuilder("NOTICE:");
        sb.append(str);
        m60927a(sb.toString());
    }
}
