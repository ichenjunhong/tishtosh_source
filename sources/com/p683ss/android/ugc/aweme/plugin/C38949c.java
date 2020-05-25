package com.p683ss.android.ugc.aweme.plugin;

import android.content.Context;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.ttuploader.TTImageUploader;
import com.p683ss.ttuploader.TTUploadSpeedProber;
import com.p683ss.ttuploader.TTVideoUploader;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.plugin.c */
public final class C38949c {

    /* renamed from: a */
    public static final C38949c f99223a = new C38949c();

    private C38949c() {
    }

    /* renamed from: b */
    public static final TTImageUploader m86786b() throws Exception {
        C39630m.m88234a().mo58628z().mo80678a("ttvideouploader");
        return new TTImageUploader();
    }

    /* renamed from: a */
    public static final TTVideoUploader m86785a() throws Exception {
        C39630m.m88234a().mo58628z().mo80678a("ttvideouploader");
        return new TTVideoUploader();
    }

    /* renamed from: a */
    public static final TTUploadSpeedProber m86784a(Context context, int i) {
        C52711k.m112240b(context, "context");
        C39630m.m88234a().mo58628z().mo80678a("ttvideouploader");
        try {
            return new TTUploadSpeedProber(context, i);
        } catch (Throwable unused) {
            return null;
        }
    }
}
