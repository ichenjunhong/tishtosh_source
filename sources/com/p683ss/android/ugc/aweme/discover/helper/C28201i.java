package com.p683ss.android.ugc.aweme.discover.helper;

import android.content.Context;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.feed.experiment.HotSpotPlayerPositionAb;
import com.p683ss.android.ugc.aweme.feed.experiment.HotSpotPlayerStyleAb;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.i */
public final class C28201i {

    /* renamed from: a */
    public static final C28201i f74032a = new C28201i();

    private C28201i() {
    }

    /* renamed from: a */
    public static boolean m67096a() {
        if (C10181b.m20511a().mo18168a(HotSpotPlayerPositionAb.class, true, "hot_spot_barrage_style_type", 31744, 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m67098b() {
        if (C10181b.m20511a().mo18168a(HotSpotPlayerStyleAb.class, true, "hot_spot_player_style_type", 31744, 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo56615a(Context context) {
        C52711k.m112240b(context, "context");
        if (m67098b()) {
            return m67097b(context, 244);
        }
        return m67097b(context, 264);
    }

    /* renamed from: a */
    public static int m67095a(Context context, int i) {
        C52711k.m112240b(context, "context");
        return (i * C9432q.m18688b(context)) / 812;
    }

    /* renamed from: b */
    private static int m67097b(Context context, int i) {
        C52711k.m112240b(context, "context");
        return (i * C9432q.m18670a(context)) / 375;
    }
}
