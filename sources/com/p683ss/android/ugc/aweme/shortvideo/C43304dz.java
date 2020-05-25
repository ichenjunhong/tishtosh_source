package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dz */
public final class C43304dz {
    /* renamed from: a */
    private static void m94977a(ShortVideoContext shortVideoContext, String str) {
        String str2;
        String str3 = "mute_microphone";
        C23089d a = C23089d.m56640a().mo47829a("content_type", "video").mo47829a("creation_id", shortVideoContext.f107131x).mo47829a("to_status", str).mo47829a("shoot_way", "react").mo47826a("draft_id", shortVideoContext.f107022A).mo47829a("enter_from", "video_shoot_page");
        String str4 = "enter_method";
        if (shortVideoContext.f107046Y) {
            str2 = "click_draft";
        } else {
            str2 = "";
        }
        C26890h.m65011a(str3, a.mo47829a(str4, str2).f61491a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m94976a(android.app.Activity r4, com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext r5, com.p683ss.android.ugc.aweme.tools.C47347v r6) {
        /*
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            boolean r0 = r5.mo86366g()
            r1 = 2132548220(0x7f1c1a7c, float:2.0749708E38)
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0050
            boolean r0 = com.p683ss.android.ugc.aweme.shortvideo.duet.C43236a.m94873a(r5)
            if (r0 == 0) goto L_0x0015
            goto L_0x0050
        L_0x0015:
            boolean r0 = r5.mo86362d()
            if (r0 == 0) goto L_0x006c
            int r6 = r6.f119498a
            switch(r6) {
                case 1: goto L_0x0038;
                case 2: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x006c
        L_0x0021:
            r5.f107040S = r3
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r6 = r5.f107036O
            r6.setMuted(r3)
            r6 = 2132543632(0x7f1c0890, float:2.0740403E38)
            com.bytedance.ies.dmt.ui.d.a r4 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21549c(r4, r6, r3)
            r4.mo19066a()
            java.lang.String r4 = "off"
            m94977a(r5, r4)
            goto L_0x006c
        L_0x0038:
            r5.f107040S = r2
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r6 = r5.f107036O
            if (r6 == 0) goto L_0x0043
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r6 = r5.f107036O
            r6.setMuted(r2)
        L_0x0043:
            com.bytedance.ies.dmt.ui.d.a r4 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21549c(r4, r1, r3)
            r4.mo19066a()
            java.lang.String r4 = "on"
            m94977a(r5, r4)
            return
        L_0x0050:
            int r6 = r6.f119498a
            switch(r6) {
                case 1: goto L_0x005e;
                case 2: goto L_0x0056;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x006d
        L_0x0056:
            r5.f107040S = r3
            java.lang.String r4 = "off"
            m94977a(r5, r4)
            goto L_0x006d
        L_0x005e:
            r5.f107040S = r2
            com.bytedance.ies.dmt.ui.d.a r4 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21549c(r4, r1, r3)
            r4.mo19066a()
            java.lang.String r4 = "on"
            m94977a(r5, r4)
        L_0x006c:
            return
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.C43304dz.m94976a(android.app.Activity, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, com.ss.android.ugc.aweme.tools.v):void");
    }
}
