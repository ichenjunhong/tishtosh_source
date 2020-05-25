package com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.model;

import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.model.a */
public final class C34537a implements Serializable {
    public static final C34538a Companion = new C34538a(null);
    public static final C34537a DEFAULT = new C34537a(0, false, 3, null);

    /* renamed from: a */
    private final int f89034a;

    /* renamed from: b */
    private final boolean f89035b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.model.a$a */
    public static final class C34538a {
        private C34538a() {
        }

        public /* synthetic */ C34538a(C52707g gVar) {
            this();
        }
    }

    public C34537a() {
        this(0, false, 3, null);
    }

    public static final C34537a getDEFAULT() {
        return DEFAULT;
    }

    public final int getMode() {
        return this.f89034a;
    }

    public final boolean getSendRaw() {
        return this.f89035b;
    }

    public final boolean isChooseMode() {
        if (this.f89034a == 1) {
            return true;
        }
        return false;
    }

    public C34537a(int i, boolean z) {
        this.f89034a = i;
        this.f89035b = z;
    }

    public /* synthetic */ C34537a(int i, boolean z, int i2, C52707g gVar) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        this(i, z);
    }
}
