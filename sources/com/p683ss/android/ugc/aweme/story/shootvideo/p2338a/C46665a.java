package com.p683ss.android.ugc.aweme.story.shootvideo.p2338a;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.a.a */
public final class C46665a {
    /* renamed from: a */
    public static C23089d m101262a(String str, String str2, boolean z, boolean z2, boolean z3) {
        String str3;
        String str4;
        String str5;
        C23089d a = C23089d.m56640a().mo47829a("creation_id", str2).mo47829a("shoot_way", str);
        String str6 = "content_type";
        if (z2) {
            str3 = "photo";
        } else {
            str3 = "video";
        }
        C23089d a2 = a.mo47829a(str6, str3);
        String str7 = "content_source";
        if (z) {
            str4 = "upload";
        } else {
            str4 = "shoot";
        }
        C23089d a3 = a2.mo47829a(str7, str4).mo47829a("camera_type", C39629l.m88232a().mo58569G()).mo47826a("camera_level", C39629l.m88232a().mo58574e().mo83118b(C40796a.RecordCameraCompatLevel));
        String str8 = "enter_from";
        if (z3) {
            str5 = "edit_post_page";
        } else {
            str5 = "video_shoot_page";
        }
        return a3.mo47829a(str8, str5);
    }
}
