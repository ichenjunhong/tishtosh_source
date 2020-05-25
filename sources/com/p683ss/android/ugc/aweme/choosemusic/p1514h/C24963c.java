package com.p683ss.android.ugc.aweme.choosemusic.p1514h;

import android.text.TextUtils;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.p1513g.C24954a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37539bh;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.shortvideo.C43804f;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.h.c */
public final class C24963c {

    /* renamed from: a */
    public static String f66069a = null;

    /* renamed from: b */
    public static String f66070b = null;

    /* renamed from: c */
    public static String f66071c = null;

    /* renamed from: d */
    static C24966f f66072d = null;

    /* renamed from: e */
    private static String f66073e = null;

    /* renamed from: f */
    private static int f66074f = -1;

    /* renamed from: a */
    public static String m60714a() {
        return f66070b;
    }

    /* renamed from: b */
    public static String m60726b() {
        return f66073e;
    }

    /* renamed from: c */
    static int m60729c() {
        return f66074f;
    }

    /* renamed from: c */
    private static String m60730c(int i) {
        String str = "";
        switch (i) {
            case 0:
                return "popular_song";
            case 1:
                return "favourite_song";
            case 2:
                return "local_song";
            default:
                return str;
        }
    }

    /* renamed from: a */
    public static void m60725a(boolean z, String str, C24803a aVar, int i, LogPbBean logPbBean) {
        if (aVar != null) {
            C23089d a = C23089d.m56640a();
            a.mo47829a("enter_from", aVar.f65641a).mo47829a("music_id", str).mo47829a("category_name", aVar.f65642b).mo47829a("enter_method", aVar.f65643c).mo47829a("previous_page", aVar.f65644d).mo47826a("order", i).mo47829a("creation_id", m60714a());
            if (!TextUtils.isEmpty(aVar.f65645e)) {
                a.mo47829a("category_id", aVar.f65645e);
            }
            if (!TextUtils.isEmpty(aVar.f65647g)) {
                a.mo47829a("tag_id", aVar.f65647g);
            }
            if (!TextUtils.isEmpty(aVar.f65646f)) {
                a.mo47829a("prop_id", aVar.f65646f);
            }
            if (aVar.f65649i != null) {
                a.mo47828a("log_pb", (Object) aVar.f65649i);
                String str2 = "";
                if (!TextUtils.isEmpty(aVar.f65649i.getImprId())) {
                    str2 = aVar.f65649i.getImprId();
                }
                a.mo47829a("impr_id", str2);
            }
            if (TextUtils.equals(aVar.f65641a, "search_music")) {
                a.mo47829a("search_keyword", f66069a);
                a.mo47829a("log_pb", new C17971f().mo34889b(logPbBean));
                String str3 = z ? "favourite_song" : "cancel_favourite_song";
                if (m60732d()) {
                    a.mo47829a("is_commercial", "1");
                }
                C26890h.m65012a(str3, C37539bh.m83960a(a.f61491a));
            } else if (z) {
                if (m60732d()) {
                    a.mo47829a("is_commercial", "1");
                }
                C26890h.m65011a("favourite_song", a.f61491a);
            }
        }
    }

    /* renamed from: a */
    public static void m60724a(String str, String str2, String str3, String str4, String str5) {
        C23089d dVar = new C23089d();
        if (!TextUtils.isEmpty(str3)) {
            dVar.mo47829a("banner_id", str3);
        }
        dVar.mo47829a("category_name", str).mo47829a("enter_method", str2).mo47829a("enter_from", str4).mo47829a("creation_id", m60714a());
        if (!TextUtils.isEmpty(str5)) {
            dVar.mo47829a("category_id", str5);
        }
        if (m60732d()) {
            dVar.mo47829a("is_commercial", "1");
        }
        C26890h.m65011a("enter_song_category", dVar.f61491a);
    }

    /* renamed from: d */
    public static boolean m60732d() {
        return C24954a.m60699b();
    }

    /* renamed from: e */
    public static void m60733e() {
        m60727b(2);
    }

    /* renamed from: g */
    public static C23089d m60735g() {
        return C23089d.m56640a().mo47829a("enter_from", "lyricsticker_song_search").mo47829a("creation_id", m60714a()).mo47829a("shoot_way", f66071c);
    }

    /* renamed from: f */
    public static void m60734f() {
        C23089d dVar = new C23089d();
        dVar.mo47829a("enter_from", "change_music_page").mo47829a("creation_id", m60714a());
        if (m60732d()) {
            dVar.mo47829a("is_commercial", "1");
        }
        C26890h.m65011a("enter_search", dVar.f61491a);
    }

    /* renamed from: a */
    public static void m60715a(int i) {
        f66074f = i;
    }

    /* renamed from: b */
    public static void m60728b(String str) {
        f66073e = str;
    }

    /* renamed from: a */
    public static void m60720a(String str) {
        if (f66072d != null) {
            f66072d.mo50924a(str);
        }
    }

    /* renamed from: a */
    public static void m60716a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("tab_name", "local_song");
        hashMap.put("show_duration", String.valueOf(j));
        C26890h.m65012a("local_music_show_duration", C37539bh.m83960a(hashMap));
    }

    /* renamed from: b */
    public static void m60727b(int i) {
        C23089d dVar = new C23089d();
        dVar.mo47829a("tab_name", m60730c(i)).mo47829a("previous_page", m60726b());
        if (m60732d()) {
            dVar.mo47829a("is_commercial", "1");
        }
        C26890h.m65011a("enter_music_tab", dVar.f61491a);
    }

    /* renamed from: c */
    private static void m60731c(String str) {
        C43804f aVNationalTaskTips = AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().getAVNationalTaskTips();
        if (aVNationalTaskTips != null && !aVNationalTaskTips.f110929f) {
            if (aVNationalTaskTips.f110927d != null && !TextUtils.equals(aVNationalTaskTips.f110927d.getMid(), str)) {
                aVNationalTaskTips.f110929f = true;
            }
            if (aVNationalTaskTips.f110928e != null && !TextUtils.equals(aVNationalTaskTips.f110928e.getMid(), str)) {
                aVNationalTaskTips.f110929f = true;
            }
        }
    }

    /* renamed from: a */
    public static void m60722a(String str, String str2) {
        C26890h.m65011a("search_lyricsticker_song", m60735g().mo47829a("search_keyword", str).mo47829a("search_type", str2).mo47829a("creation_id", m60714a()).f61491a);
    }

    /* renamed from: a */
    public static void m60721a(String str, C24803a aVar) {
        int i;
        long j;
        if (aVar != null && f66072d != null) {
            C23089d a = C23089d.m56640a();
            C23089d a2 = a.mo47829a("music_id", str).mo47829a("category_name", aVar.f65642b);
            String str2 = "time";
            if (f66072d == null) {
                i = 0;
            } else {
                i = f66072d.mo50926c(str);
            }
            C23089d a3 = a2.mo47826a(str2, i);
            String str3 = "stay_time";
            if (f66072d == null) {
                j = 0;
            } else {
                j = f66072d.mo50925b(str);
            }
            a3.mo47827a(str3, j).mo47829a("enter_from", aVar.f65641a).mo47829a("enter_method", aVar.f65643c).mo47829a("previous_page", aVar.f65644d).mo47829a("creation_id", m60714a());
            if (!TextUtils.isEmpty(aVar.f65647g)) {
                a.mo47829a("tag_id", aVar.f65647g);
            }
            if (!TextUtils.isEmpty(aVar.f65646f)) {
                a.mo47829a("prop_id", aVar.f65646f);
            }
            if (aVar.f65649i != null) {
                a.mo47828a("log_pb", (Object) aVar.f65649i);
                String str4 = "";
                if (!TextUtils.isEmpty(aVar.f65649i.getImprId())) {
                    str4 = aVar.f65649i.getImprId();
                }
                a.mo47829a("impr_id", str4);
            }
            C26890h.m65011a("music_play_time", a.f61491a);
            f66072d = null;
        }
    }

    /* renamed from: a */
    public static void m60723a(String str, String str2, C24803a aVar) {
        long j;
        if (aVar != null) {
            C23089d a = C23089d.m56640a();
            C23089d a2 = a.mo47829a("to_music_id", str).mo47829a("category_name", aVar.f65642b).mo47829a("previous_page", aVar.f65644d).mo47829a("from_music_id", str2).mo47829a("creation_id", m60714a()).mo47829a("enter_method", aVar.f65643c);
            String str3 = "this_music_stay_time";
            if (f66072d == null) {
                j = 0;
            } else {
                j = f66072d.mo50925b(str2);
            }
            a2.mo47827a(str3, j);
            if (aVar.f65649i != null) {
                a.mo47828a("log_pb", (Object) aVar.f65649i);
                String str4 = "";
                if (!TextUtils.isEmpty(aVar.f65649i.getImprId())) {
                    str4 = aVar.f65649i.getImprId();
                }
                a.mo47829a("impr_id", str4);
            }
            C26890h.m65011a("click_next_music", a.f61491a);
        }
    }

    /* renamed from: a */
    public static void m60719a(C24803a aVar, String str, boolean z, String str2) {
        String str3;
        if (aVar != null) {
            C23089d a = C23089d.m56640a();
            C23089d a2 = a.mo47829a("enter_from", aVar.f65641a).mo47829a("music_id", str).mo47829a("category_name", aVar.f65642b).mo47829a("creation_id", m60714a());
            String str4 = "enter_method";
            if (z) {
                str3 = "click_banner";
            } else {
                str3 = "click_button";
            }
            a2.mo47829a(str4, str3);
            if (!TextUtils.isEmpty(aVar.f65645e)) {
                a.mo47829a("category_id", aVar.f65645e);
            }
            if (!TextUtils.isEmpty(str2)) {
                a.mo47829a("process_id", str2);
            }
            if (aVar.f65649i != null) {
                a.mo47828a("log_pb", (Object) aVar.f65649i);
                String str5 = "";
                if (!TextUtils.isEmpty(aVar.f65649i.getImprId())) {
                    str5 = aVar.f65649i.getImprId();
                }
                a.mo47829a("impr_id", str5);
            }
            C26890h.m65011a("enter_music_detail", a.f61491a);
        }
    }

    /* renamed from: a */
    public static void m60717a(C24803a aVar, String str, int i, LogPbBean logPbBean) {
        if (aVar != null) {
            C23089d a = C23089d.m56640a();
            a.mo47829a("enter_from", aVar.f65641a).mo47829a("music_id", str).mo47829a("category_name", aVar.f65642b).mo47829a("enter_method", aVar.f65643c).mo47826a("order", i).mo47829a("previous_page", m60726b()).mo47829a("creation_id", m60714a());
            if (!TextUtils.isEmpty(aVar.f65647g)) {
                a.mo47829a("tag_id", aVar.f65647g);
            }
            if (!TextUtils.isEmpty(aVar.f65646f)) {
                a.mo47829a("prop_id", aVar.f65646f);
            }
            if (!TextUtils.isEmpty(aVar.f65645e)) {
                a.mo47829a("category_id", aVar.f65645e);
            }
            if (aVar.f65649i != null) {
                a.mo47828a("log_pb", (Object) aVar.f65649i);
                String str2 = "";
                if (!TextUtils.isEmpty(aVar.f65649i.getImprId())) {
                    str2 = aVar.f65649i.getImprId();
                }
                a.mo47829a("impr_id", str2);
            }
            if (TextUtils.equals(aVar.f65641a, "search_music")) {
                a.mo47829a("search_keyword", f66069a);
                a.mo47829a("log_pb", new C17971f().mo34889b(logPbBean));
                if (m60732d()) {
                    a.mo47829a("is_commercial", "1");
                }
                C26890h.m65012a("add_music", C37539bh.m83960a(a.f61491a));
            } else {
                if (m60732d()) {
                    a.mo47829a("is_commercial", "1");
                }
                C26890h.m65011a("add_music", a.f61491a);
            }
            m60731c(str);
        }
    }

    /* renamed from: a */
    public static void m60718a(C24803a aVar, String str, int i, boolean z) {
        if (aVar != null && z) {
            C23089d dVar = new C23089d();
            dVar.mo47829a("enter_from", aVar.f65641a).mo47829a("music_id", str).mo47829a("category_name", aVar.f65642b).mo47829a("enter_method", aVar.f65643c).mo47829a("previous_page", aVar.f65644d).mo47826a("order", i).mo47829a("creation_id", m60714a());
            if (!TextUtils.isEmpty(aVar.f65645e)) {
                dVar.mo47829a("category_id", aVar.f65645e);
            }
            if (!TextUtils.isEmpty(aVar.f65647g)) {
                dVar.mo47829a("tag_id", aVar.f65647g);
            }
            if (!TextUtils.isEmpty(aVar.f65646f)) {
                dVar.mo47829a("prop_id", aVar.f65646f);
            }
            if (aVar.f65649i != null) {
                dVar.mo47828a("log_pb", (Object) aVar.f65649i);
                String str2 = "";
                if (!TextUtils.isEmpty(aVar.f65649i.getImprId())) {
                    str2 = aVar.f65649i.getImprId();
                }
                dVar.mo47829a("impr_id", str2);
            }
            if (m60732d()) {
                dVar.mo47829a("is_commercial", "1");
            }
            C26890h.m65011a("show_music", dVar.f61491a);
        }
    }
}
