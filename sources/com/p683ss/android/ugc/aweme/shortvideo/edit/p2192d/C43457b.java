package com.p683ss.android.ugc.aweme.shortvideo.edit.p2192d;

import android.content.Context;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.setting.AllowLongVideo;
import com.p683ss.android.ugc.aweme.setting.AllowLongVideoThreshold;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.d.b */
public final class C43457b {

    /* renamed from: a */
    public static final C43457b f109844a = new C43457b();

    private C43457b() {
    }

    /* renamed from: a */
    public static boolean m95263a() {
        return AllowLongVideo.INSTANCE.allow();
    }

    /* renamed from: b */
    public static final boolean m95264b() {
        if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableUploadVideoSlideAutoJust) || m95263a()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final String m95262a(Context context) {
        C52711k.m112240b(context, "context");
        String string = context.getResources().getString(R.string.gs0, new Object[]{Long.valueOf(AllowLongVideoThreshold.INSTANCE.videoThreshold() / 60000)});
        C52711k.m112236a((Object) string, "context.resources.getStr…reshold() / (60 * 1000L))");
        return string;
    }
}
