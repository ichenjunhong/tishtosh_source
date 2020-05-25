package com.p683ss.android.ugc.aweme.shortvideo.mob;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45054bg;
import java.util.UUID;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mob.b */
public final class C43995b {
    /* renamed from: a */
    public static final void m96558a(VideoPublishEditModel videoPublishEditModel, String str) {
        boolean z;
        C52711k.m112240b(videoPublishEditModel, "$this$checkAndFillCreationId");
        C52711k.m112240b(str, "scene");
        CharSequence charSequence = videoPublishEditModel.creationId;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            videoPublishEditModel.creationId = UUID.randomUUID().toString();
            C26890h.m65011a("check_creation_id", C23089d.m56640a().mo47829a("shoot_way", videoPublishEditModel.mShootWay).mo47829a("content_source", C45054bg.m98545a(videoPublishEditModel)).mo47829a("content_type", C43434az.m95202a(videoPublishEditModel)).mo47829a("scene", str).f61491a);
        }
    }
}
