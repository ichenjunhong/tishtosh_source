package com.p683ss.android.ugc.asve.recorder.camera;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.p683ss.android.medialib.camera.C19274g;
import com.p683ss.android.ugc.asve.recorder.camera.p1248c.C20477j;
import com.p683ss.android.vesdk.C50704j;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.a */
public final class C20453a {

    /* renamed from: a */
    public static final C20453a f56081a = new C20453a();

    private C20453a() {
    }

    /* renamed from: b */
    private static boolean m50911b(Context context, int i, boolean z) {
        C52711k.m112240b(context, "context");
        if (!z) {
            return C19274g.m47033a(context, i);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("device_support_wide_angle", false);
        C50704j.m109625a(context, C20482f.m51067b(i), bundle);
        return bundle.getBoolean("device_support_wide_angle");
    }

    /* renamed from: a */
    public static final int m50910a(Context context, int i, boolean z) {
        C52711k.m112240b(context, "context");
        if (i == -1) {
            i = C20477j.m51057a(Build.MODEL);
        }
        switch (i) {
            case 1:
                if (m50911b(context, 3, z)) {
                    return 1;
                }
                if (m50911b(context, 4, z)) {
                    return 3;
                }
                return 0;
            case 2:
                return 2;
            case 3:
                if (m50911b(context, 4, z)) {
                    return 3;
                }
                return 0;
            case 4:
                if (m50911b(context, 2, z)) {
                    return 4;
                }
                return 0;
            case 5:
                if (m50911b(context, 6, z)) {
                    return 5;
                }
                return 0;
            default:
                return 0;
        }
    }
}
