package com.p683ss.android.ugc.aweme.poi.preview;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.a */
public final class C39154a {
    /* renamed from: a */
    public static void m86995a(String str, C39067g gVar) {
        m86994a(str, 0, gVar);
    }

    /* renamed from: a */
    public static void m86993a(C39067g gVar, String str) {
        C39452l.m87730a(gVar, "poi_pic_operation", C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("enter_method", "slide_outer").mo47829a("poi_channel", C23198ae.m56852b()).mo47829a("poi_id", gVar.getPoiId()).mo47829a("poi_type", gVar.getPoiType()).mo47829a("group_id", gVar.getAwemeId()).mo47829a("previous_page", gVar.getPreviousPage()).mo47829a("content_type", str));
    }

    /* renamed from: a */
    public static void m86994a(String str, int i, C39067g gVar) {
        C23089d a = C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("enter_method", "click_top_pic").mo47829a("poi_id", gVar.getPoiId()).mo47829a("poi_type", gVar.getPoiType()).mo47829a("group_id", gVar.getAwemeId()).mo47829a("previous_page", gVar.getPreviousPage()).mo47829a("poi_channel", C23198ae.m56852b()).mo47829a("content_type", str);
        if (i > 0) {
            a.mo47826a("pic_tag", i);
        }
        C39452l.m87730a(gVar, "poi_pic_operation", a);
    }
}
