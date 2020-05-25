package com.bytedance.android.live.broadcast.utils;

import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.live.broadcast.utils.e */
public final class C3637e {

    /* renamed from: a */
    public static final C3638a f10365a = new C3638a(null);

    /* renamed from: com.bytedance.android.live.broadcast.utils.e$a */
    public static final class C3638a {
        private C3638a() {
        }

        public /* synthetic */ C3638a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static String m9476a(C8710m mVar) {
            C52711k.m112240b(mVar, "liveMode");
            switch (C3639f.f10366a[mVar.ordinal()]) {
                case 1:
                    return "video_live";
                case 2:
                    return "game";
                case 3:
                    return "third_party";
                case 4:
                    return "voice_live";
                default:
                    return "";
            }
        }
    }
}
