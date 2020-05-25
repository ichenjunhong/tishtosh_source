package com.p683ss.android.ugc.aweme.favorites.p1704d;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;

/* renamed from: com.ss.android.ugc.aweme.favorites.d.a */
public final class C29692a {

    /* renamed from: a */
    public static String f77600a = "personal_homepage";

    /* renamed from: b */
    public static boolean f77601b;

    /* renamed from: com.ss.android.ugc.aweme.favorites.d.a$a */
    public interface C29693a {
        /* renamed from: a */
        void mo59961a();
    }

    /* renamed from: a */
    public static void m69732a() {
        C26890h.m65011a("expand_nearby_poi", C23089d.m56640a().mo47829a("enter_from", "personal_homepage").mo47829a("enter_method", "click_button").f61491a);
    }

    /* renamed from: a */
    public static void m69733a(int i) {
        C26890h.m65011a("poi_collection_nearby_section_show", C23089d.m56640a().mo47829a("enter_from", "personal_homepage").mo47829a("poi_cnt", String.valueOf(i)).f61491a);
    }

    /* renamed from: b */
    public static String m69740b(int i) {
        switch (i) {
            case 1:
                return "show_personal_collection";
            case 2:
                return "click_personal_collection";
            default:
                throw new IllegalArgumentException("wrong action value");
        }
    }

    /* renamed from: b */
    public static C23089d m69739b(String str, String str2) {
        return C23089d.m56640a().mo47829a(C42311c.f106865i, str).mo47829a("enter_from", str2);
    }

    /* renamed from: c */
    public static void m69742c(int i, String str) {
        C26890h.m65011a(m69740b(i), m69739b("prop", "collection_prop").mo47829a("prop_id", str).f61491a);
    }

    /* renamed from: a */
    public static void m69734a(int i, String str) {
        C26890h.m65011a(m69740b(1), m69739b("tag", "collection_tag").mo47829a("tag_id", str).f61491a);
    }

    /* renamed from: b */
    public static void m69741b(int i, String str) {
        C26890h.m65011a(m69740b(1), m69739b("music", "collection_music").mo47829a("music_id", str).f61491a);
    }

    /* renamed from: a */
    public static void m69737a(String str, String str2) {
        C26890h.m65011a("change_personal_collection_tab", C23089d.m56640a().mo47829a("enter_from", f77600a).mo47829a("enter_method", str).mo47829a("tab_name", str2).f61491a);
    }

    /* renamed from: a */
    public static void m69735a(int i, String str, boolean z) {
        String str2;
        String b = m69740b(1);
        C23089d a = m69739b("poi", "collection_poi").mo47829a("poi_id", str);
        String str3 = "sub_type";
        if (z) {
            str2 = "nearby";
        } else {
            str2 = "all";
        }
        C26890h.m65011a(b, a.mo47829a(str3, str2).f61491a);
    }

    /* renamed from: a */
    public static void m69738a(String str, String str2, String str3, boolean z) {
        String str4;
        C23089d a = C23089d.m56640a();
        if (!TextUtils.isEmpty(str3)) {
            a.mo47829a("tab_name", str3);
        }
        String str5 = "click_personal_collection";
        C23089d a2 = a.mo47829a("enter_from", str2).mo47829a(C42311c.f106865i, "poi");
        String str6 = "sub_type";
        if (z) {
            str4 = "nearby";
        } else {
            str4 = "all";
        }
        C26890h.m65011a(str5, a2.mo47829a(str6, str4).mo47829a("poi_id", str).f61491a);
    }

    /* renamed from: a */
    public static void m69736a(int i, String str, boolean z, String str2, String str3) {
        String str4;
        String b = m69740b(1);
        C23089d a = m69739b("poi", "collection_poi").mo47829a("poi_id", str);
        String str5 = "sub_type";
        if (z) {
            str4 = "nearby";
        } else {
            str4 = "all";
        }
        C26890h.m65011a(b, a.mo47829a(str5, str4).mo47829a("product_id", str2).mo47829a("supplier_id", str3).f61491a);
    }
}
