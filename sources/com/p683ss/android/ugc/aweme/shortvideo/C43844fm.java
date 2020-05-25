package com.p683ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.p683ss.android.ugc.asve.recorder.camera.C20453a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fm */
public final class C43844fm {
    /* renamed from: a */
    public static boolean m96281a(Context context) {
        int i;
        if (C20453a.m50910a(context, C39629l.m88232a().mo58574e().mo83118b(C40796a.WideCameraInfo), true) == 0) {
            i = 7;
        } else {
            i = 8;
        }
        if (!C43303dy.m94970a(context, i)) {
            return true;
        }
        return false;
    }
}
