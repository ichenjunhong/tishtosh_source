package com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.b */
public final class C43682b {

    /* renamed from: a */
    public static String f110608a;

    /* renamed from: b */
    public static String f110609b;

    /* renamed from: c */
    public static String f110610c;

    /* renamed from: d */
    public static String f110611d;

    /* renamed from: e */
    public static String f110612e;

    /* renamed from: f */
    public static final C43682b f110613f = new C43682b();

    private C43682b() {
    }

    /* renamed from: a */
    public final void mo89108a() {
        C26890h.m65011a("cancel_video_trim", m95953c().f61491a);
    }

    /* renamed from: b */
    public final void mo89110b() {
        C26890h.m65011a("exit_video_trim", m95953c().f61491a);
    }

    /* renamed from: c */
    public static C23089d m95953c() {
        C23089d a = C23089d.m56640a().mo47829a("shoot_way", f110609b).mo47829a("creation_id", f110608a).mo47829a("enter_from", f110610c).mo47829a("content_type", f110611d).mo47829a("content_source", f110612e).mo47829a("enter_from", "video_edit_page");
        C52711k.m112236a((Object) a, "EventMapBuilder.newBuild…from\", \"video_edit_page\")");
        return a;
    }

    /* renamed from: a */
    public final void mo89109a(boolean z, boolean z2, int i, int i2, int i3) {
        String str = "multi_entire";
        if (z2) {
            str = "single";
        } else if (z) {
            str = "multi_part";
        }
        C26890h.m65011a("edit_video_length", m95953c().mo47829a("trim_type", str).mo47829a("order", String.valueOf(i + 1)).mo47829a("from_length", String.valueOf(i2)).mo47829a("to_length", String.valueOf(i3)).f61491a);
    }
}
