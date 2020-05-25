package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.api.b */
public final class C3037b {

    /* renamed from: a */
    public static final String f8913a;

    /* renamed from: b */
    public static final String f8914b = C3922z.m9903a((int) R.string.efq);

    /* renamed from: c */
    public static final String f8915c = C3922z.m9903a((int) R.string.efs);

    /* renamed from: d */
    public static final String f8916d = C3922z.m9903a((int) R.string.efo);

    static {
        String str;
        if (((Boolean) LiveSettingKeys.LIVE_ENABLE_NEW_GESTURE_DIALOG.mo9431a()).booleanValue()) {
            str = C3922z.m9903a((int) R.string.hqe);
        } else {
            str = C3922z.m9903a((int) R.string.efr);
        }
        f8913a = str;
    }
}
