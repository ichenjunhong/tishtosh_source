package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import com.bytedance.apm.p501q.C9190h;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.p2264x.C45624b;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h */
public final class C43047h {

    /* renamed from: a */
    public static String f108661a = null;

    /* renamed from: b */
    public static String f108662b = null;

    /* renamed from: c */
    public static String f108663c = null;

    /* renamed from: d */
    public static String f108664d = "";

    /* renamed from: e */
    public static String f108665e = "";

    /* renamed from: f */
    public static String f108666f = null;

    /* renamed from: g */
    public static final C43047h f108667g = new C43047h();

    /* renamed from: h */
    private static final String f108668h = f108668h;

    private C43047h() {
    }

    /* renamed from: a */
    public static C23089d m94328a() {
        C23089d a = C23089d.m56640a().mo47829a("shoot_way", f108661a).mo47829a("creation_id", f108662b).mo47829a("enter_from", f108668h);
        C52711k.m112236a((Object) a, "EventMapBuilder.newBuild…(\"enter_from\", enterFrom)");
        return a;
    }

    /* renamed from: a */
    public static String m94330a(boolean z) {
        if (z) {
            return "sound_sync";
        }
        if (f108666f == null) {
            return "video";
        }
        String str = f108666f;
        if (str != null) {
            return str;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.String");
    }

    /* renamed from: b */
    private final C23089d m94333b(boolean z) {
        C23089d a = C23089d.m56640a().mo47829a("shoot_way", f108661a).mo47829a("creation_id", f108662b).mo47829a("content_source", "upload").mo47829a("content_type", m94330a(z));
        C52711k.m112236a((Object) a, "EventMapBuilder.newBuild…ntType(isStickPointMode))");
        return a;
    }

    /* renamed from: a */
    public static void m94331a(String str) {
        C52711k.m112240b(str, "tabName");
        C26890h.m65011a("enter_music_tab", C23089d.m56640a().mo47829a("enter_from", f108668h).mo47829a("shoot_way", f108661a).mo47829a("content_source", "upload").mo47829a("content_type", "sound_sync").mo47829a("creation_id", f108662b).mo47829a("tab_name", str).f61491a);
    }

    /* renamed from: a */
    public final void mo87424a(List<? extends VideoSegment> list) {
        if (!C9190h.m18253a(list)) {
            long j = 0;
            if (list == null) {
                C52711k.m112234a();
            }
            int i = 0;
            int i2 = 0;
            for (VideoSegment videoSegment : list) {
                j += videoSegment.f107904c;
                if (videoSegment.mo86944a()) {
                    i2++;
                }
            }
            if (!C52711k.m112239a((Object) "comment_reply", (Object) f108661a)) {
                f108664d = "";
                f108665e = "";
            }
            String str = "enter_clip_edit_page";
            C23089d a = m94328a().mo47829a("content_type", "sound_sync").mo47829a("content_source", "upload").mo47827a("content_duration_ms", j).mo47829a("reply_comment_id", f108664d).mo47829a("reply_user_id", f108665e).mo47826a("video_cnt", list.size() - i2).mo47826a("pic_cnt", i2);
            String str2 = "is_multi_content";
            if (list.size() > 1) {
                i = 1;
            }
            C26890h.m65011a(str, a.mo47826a(str2, i).mo47829a("mix_type", C45624b.m99356a(list.size() - i2, i2)).mo47829a("enter_from", f108668h).f61491a);
        }
    }

    /* renamed from: b */
    public final void mo87427b(List<? extends VideoSegment> list) {
        int i;
        if (!C9190h.m18253a(list)) {
            long j = 0;
            if (list == null) {
                C52711k.m112234a();
            }
            boolean z = false;
            int i2 = 0;
            for (VideoSegment videoSegment : list) {
                j += videoSegment.f107904c;
                if (videoSegment.mo86944a()) {
                    i2++;
                }
            }
            if (!C52711k.m112239a((Object) "comment_reply", (Object) f108661a)) {
                f108664d = "";
                f108665e = "";
            }
            C23089d a = m94328a().mo47829a("content_type", m94330a(false)).mo47829a("content_source", "upload").mo47827a("content_duration_ms", j).mo47829a("reply_comment_id", f108664d).mo47829a("reply_user_id", f108665e).mo47826a("video_cnt", list.size() - i2).mo47826a("pic_cnt", i2);
            String str = "is_multi_content";
            if (list.size() > 1) {
                i = 1;
            } else {
                i = 0;
            }
            C23089d a2 = a.mo47826a(str, i).mo47829a("mix_type", C45624b.m99356a(list.size() - i2, i2)).mo47829a("enter_from", "clip_edit_page");
            CharSequence charSequence = f108663c;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            }
            if (!z) {
                a2.mo47829a("enter_method", f108663c);
            }
            C26890h.m65011a("enter_clip_edit_page", a2.f61491a);
        }
    }

    /* renamed from: b */
    public static void m94334b(String str, String str2) {
        f108664d = str;
        f108665e = str2;
    }

    /* renamed from: a */
    public static void m94332a(String str, String str2) {
        f108661a = str;
        f108662b = str2;
    }

    /* renamed from: a */
    public final void mo87425a(List<? extends VideoSegment> list, String str, boolean z) {
        if (!C9190h.m18253a(list)) {
            ArrayList<VideoSegment> arrayList = new ArrayList<>();
            if (list == null) {
                C52711k.m112234a();
            }
            for (VideoSegment videoSegment : list) {
                if (!videoSegment.f107911j) {
                    arrayList.add(videoSegment);
                }
            }
            long j = 0;
            for (VideoSegment videoSegment2 : arrayList) {
                j += videoSegment2.f107904c;
            }
            C26890h.m65011a(str, m94328a().mo47829a("content_type", m94330a(z)).mo47829a("content_source", "upload").mo47827a("content_duration_ms", j).f61491a);
        }
    }

    /* renamed from: a */
    public final void mo87426a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        if (z2) {
            C26890h.m65011a("edit_clip", m94333b(z).mo47829a("edit_way", "click").f61491a);
        } else if (z5) {
            C26890h.m65011a("edit_clip_delete", m94333b(z).f61491a);
        } else if (z3) {
            C26890h.m65011a("edit_clip_complete", m94333b(z).f61491a);
        } else if (z4) {
            C26890h.m65011a("edit_clip_cancel", m94333b(z).f61491a);
        } else if (z6) {
            C26890h.m65011a("edit_clips_order", m94333b(z).mo47829a("edit_way", "press").f61491a);
        }
    }
}
