package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.f */
public final class C44306f {

    /* renamed from: a */
    public static final C44306f f112168a = new C44306f();

    /* renamed from: b */
    private static String f112169b;

    /* renamed from: c */
    private static String f112170c;

    private C44306f() {
    }

    /* renamed from: a */
    static C23089d m97048a(boolean z) {
        String str;
        C23089d a = C23089d.m56640a().mo47829a("shoot_way", f112170c).mo47829a("creation_id", f112169b).mo47829a("content_source", "upload").mo47829a("enter_from", "album_panel");
        String str2 = "content_type";
        if (z) {
            str = "video";
        } else {
            str = "photo";
        }
        C23089d a2 = a.mo47829a(str2, str);
        C52711k.m112236a((Object) a2, "EventMapBuilder.newBuild…eo) \"video\" else \"photo\")");
        return a2;
    }

    /* renamed from: a */
    public static void m97049a(String str, String str2) {
        f112169b = str;
        f112170c = str2;
    }
}
