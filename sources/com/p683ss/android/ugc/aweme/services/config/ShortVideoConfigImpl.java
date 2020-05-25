package com.p683ss.android.ugc.aweme.services.config;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.config.ShortVideoConfigImpl */
public final class ShortVideoConfigImpl extends ShortVideoConfigBaseImpl {
    public static final Companion Companion = new Companion(null);
    public static ShortVideoConfigImpl sInstance;

    /* renamed from: com.ss.android.ugc.aweme.services.config.ShortVideoConfigImpl$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final ShortVideoConfigImpl getInstance() {
            if (ShortVideoConfigImpl.sInstance == null) {
                synchronized (ShortVideoConfigBaseImpl.class) {
                    if (ShortVideoConfigImpl.sInstance == null) {
                        ShortVideoConfigImpl.sInstance = new ShortVideoConfigImpl();
                    }
                }
            }
            ShortVideoConfigImpl shortVideoConfigImpl = ShortVideoConfigImpl.sInstance;
            if (shortVideoConfigImpl == null) {
                C52711k.m112234a();
            }
            return shortVideoConfigImpl;
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public static final ShortVideoConfigImpl getInstance() {
        return Companion.getInstance();
    }

    public final String cutsameSdkVersion() {
        return "";
    }
}
