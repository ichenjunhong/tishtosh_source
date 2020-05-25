package com.p683ss.android.ugc.aweme.shortvideo.mob;

import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mob.a */
public final class C43994a {

    /* renamed from: a */
    public static final C43994a f111424a = new C43994a();

    private C43994a() {
    }

    /* renamed from: a */
    public static final void m96557a(List<Long> list, String str) {
        C52711k.m112240b(list, "fetchFrameTimeList");
        C52711k.m112240b(str, "scene");
        if (!list.isEmpty()) {
            C47702b.f120193a.mo94984a("tool_performance_fetch_frames", C42438az.m93209a().mo86524a("duration", C52575l.m112150m(list)).mo86523a("count", list.size()).mo86526a("scene", str).f107329a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r6 == null) goto L_0x0027;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m96556a(com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext r4, com.p683ss.android.ugc.asve.recorder.p1245b.C20426a r5, com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean r6, com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43904f r7, com.p683ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            java.lang.String r0 = "mediaController"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            java.lang.String r0 = "nextAction"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            com.ss.android.ugc.aweme.utils.b r0 = com.p683ss.android.ugc.aweme.utils.C47702b.f120193a
            java.lang.String r1 = "tool_performance_video_preview"
            com.ss.android.ugc.aweme.shortvideo.az r2 = com.p683ss.android.ugc.aweme.shortvideo.C42438az.m93209a()
            java.lang.String r3 = "next_action"
            com.ss.android.ugc.aweme.shortvideo.az r9 = r2.mo86526a(r3, r9)
            java.lang.String r2 = "effect_id"
            if (r6 == 0) goto L_0x0027
            java.lang.String r6 = r6.getId()
            if (r6 != 0) goto L_0x0029
        L_0x0027:
            java.lang.String r6 = ""
        L_0x0029:
            com.ss.android.ugc.aweme.shortvideo.az r6 = r9.mo86526a(r2, r6)
            java.lang.String r9 = "beauty_status"
            r2 = 1
            r3 = 0
            int r2 = com.p683ss.android.ugc.aweme.beauty.C23778b.m58354b(com.p683ss.android.ugc.aweme.beauty.C23778b.f63365a)
            com.ss.android.ugc.aweme.shortvideo.az r6 = r6.mo86523a(r9, r2)
            java.lang.String r9 = "shoot_way"
            java.lang.String r2 = r4.f107132y
            com.ss.android.ugc.aweme.shortvideo.az r6 = r6.mo86526a(r9, r2)
            java.lang.String r9 = "resolution"
            java.lang.String r2 = com.p683ss.android.ugc.aweme.property.C40797m.m90252g()
            com.ss.android.ugc.aweme.shortvideo.az r6 = r6.mo86526a(r9, r2)
            java.lang.String r9 = "creation_id"
            java.lang.String r4 = r4.f107131x
            com.ss.android.ugc.aweme.shortvideo.az r4 = r6.mo86526a(r9, r4)
            java.lang.String r6 = "fps"
            float r9 = r5.mo43330t()
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            com.ss.android.ugc.aweme.shortvideo.az r4 = r4.mo86525a(r6, r9)
            java.lang.String r6 = "lag_count"
            int r9 = r5.mo43327q()
            com.ss.android.ugc.aweme.shortvideo.az r4 = r4.mo86523a(r6, r9)
            java.lang.String r6 = "lag_max"
            int r9 = r5.mo43328r()
            com.ss.android.ugc.aweme.shortvideo.az r4 = r4.mo86523a(r6, r9)
            java.lang.String r6 = "lag_total_duration"
            int r5 = r5.mo43329s()
            com.ss.android.ugc.aweme.shortvideo.az r4 = r4.mo86523a(r6, r5)
            java.lang.String r5 = "filter_id"
            if (r7 == 0) goto L_0x0098
            com.ss.android.ugc.aweme.shortvideo.j.a r6 = r7.mo89445c()
            com.ss.android.ugc.aweme.shortvideo.j.h r6 = (com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43906h) r6
            if (r6 == 0) goto L_0x0098
            com.ss.android.ugc.aweme.filter.g r6 = r6.mo89440e()
            if (r6 == 0) goto L_0x0098
            int r6 = r6.f82324a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x009a
        L_0x0098:
            java.lang.String r6 = ""
        L_0x009a:
            com.ss.android.ugc.aweme.shortvideo.az r4 = r4.mo86525a(r5, r6)
            java.lang.String r5 = "beautify_used"
            int r6 = com.p683ss.android.ugc.aweme.beauty.C23778b.m58354b(r8)
            com.ss.android.ugc.aweme.shortvideo.az r4 = r4.mo86523a(r5, r6)
            java.lang.String r5 = "beautify_info"
            java.lang.String r6 = com.p683ss.android.ugc.aweme.beauty.C23778b.m58352a(r8)
            com.ss.android.ugc.aweme.shortvideo.az r4 = r4.mo86526a(r5, r6)
            java.lang.String r5 = "is_composer"
            int r6 = com.p683ss.android.ugc.aweme.beauty.C23778b.m58355c(r8)
            com.ss.android.ugc.aweme.shortvideo.az r4 = r4.mo86523a(r5, r6)
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f107329a
            r0.mo94984a(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mob.C43994a.m96556a(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, com.ss.android.ugc.asve.recorder.b.a, com.ss.android.ugc.aweme.sticker.model.FaceStickerBean, com.ss.android.ugc.aweme.shortvideo.j.f, com.ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo, java.lang.String):void");
    }
}
