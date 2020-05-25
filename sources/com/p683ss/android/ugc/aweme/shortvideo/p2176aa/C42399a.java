package com.p683ss.android.ugc.aweme.shortvideo.p2176aa;

import android.content.Context;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.utils.C47721bi;
import com.p683ss.android.ugc.tools.utils.C50200d;
import java.io.File;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52718r;
import p2628d.p2639f.p2641b.C52719s;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.aa.a */
public final class C42399a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f107244a = {C52728w.m112248a((C52718r) new C52719s(C52728w.m112246a(C42399a.class, "tools.camera-record_tiktokI18nRelease"), "WATER_DIR", "getWATER_DIR()Ljava/lang/String;")), C52728w.m112248a((C52718r) new C52719s(C52728w.m112246a(C42399a.class, "tools.camera-record_tiktokI18nRelease"), "WATER_MASK_LAYER_DIR", "getWATER_MASK_LAYER_DIR()Ljava/lang/String;"))};

    /* renamed from: b */
    static final C52668f f107245b = C52732g.m112285a(C42400a.f107247a);

    /* renamed from: c */
    private static final C52668f f107246c = C52732g.m112285a(C42401b.f107248a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.aa.a$a */
    static final class C42400a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        public static final C42400a f107247a = new C42400a();

        C42400a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append(C43307ea.f109491d);
            sb.append("water");
            sb.append(File.separatorChar);
            String sb2 = sb.toString();
            C50200d.m108339a(sb2, false);
            return sb2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.aa.a$b */
    static final class C42401b extends C52712l implements C52670a<String> {

        /* renamed from: a */
        public static final C42401b f107248a = new C42401b();

        C42401b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append((String) C42399a.f107245b.getValue());
            sb.append("mask");
            sb.append(File.separatorChar);
            String sb2 = sb.toString();
            C50200d.m108339a(sb2, false);
            return sb2;
        }
    }

    /* renamed from: a */
    public static final String m93162a(boolean z) {
        String str;
        if (z) {
            str = "av_ic_water_mark_9_16.png";
        } else {
            str = "av_ic_water_mark_16_9.png";
        }
        return C47721bi.m103300a((Context) C39618d.f101160a, str, (String) f107246c.getValue());
    }
}
