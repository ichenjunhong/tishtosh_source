package com.p683ss.android.ugc.aweme.profile.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "publish_video_strategy_type")
/* renamed from: com.ss.android.ugc.aweme.profile.experiment.ShowPrivateAlbumExp */
public final class ShowPrivateAlbumExp {
    @C10179b
    public static final int EXP_ONE = 1;
    @C10179b
    public static final int EXP_TWO = 2;
    public static final ShowPrivateAlbumExp INSTANCE = new ShowPrivateAlbumExp();
    @C10179b(mo18165a = true)
    public static final int OLD_STYLE = 0;

    private ShowPrivateAlbumExp() {
    }

    /* renamed from: a */
    public static final boolean m88630a() {
        if (C10181b.m20511a().mo18168a(ShowPrivateAlbumExp.class, true, "publish_video_strategy_type", 31744, 0) == 2) {
            return true;
        }
        return false;
    }
}
