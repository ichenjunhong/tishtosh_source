package com.p683ss.android.ugc.aweme.app.download;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import okhttp3.C53673t;
import okhttp3.C53673t.C53674a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.app.download.b */
public final class C23079b {

    /* renamed from: a */
    public static final C23079b f61480a = new C23079b();

    private C23079b() {
    }

    /* renamed from: a */
    public static final String m56620a(Aweme aweme, String str) {
        if (!(aweme == null || aweme.getVideo() == null)) {
            Video video = aweme.getVideo();
            C52711k.m112236a((Object) video, "aweme.video");
            if (video.isNeedSetCookie() && str != null && !TextUtils.isEmpty(str)) {
                Video video2 = aweme.getVideo();
                C52711k.m112236a((Object) video2, "aweme.video");
                if (!video2.isNeedSetCookie() || !C52830p.m112411b(str, "http://", false, 2, null)) {
                    C53673t f = C53673t.m114180f(str);
                    if (f == null || f.mo111612c("ss_is_p_v_ss") != null) {
                        return str;
                    }
                    C53674a j = f.mo111624j();
                    j.mo111634c("ss_is_p_v_ss", "1");
                    return j.toString();
                }
                C41979aq.m91947b().monitorIllegalUrl(str);
                return str;
            }
        }
        return str;
    }
}
