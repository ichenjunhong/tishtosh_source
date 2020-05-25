package com.p683ss.android.ugc.aweme.emoji.utils.p1694a;

import java.io.Serializable;
import java.util.zip.ZipException;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.n */
public final class C29450n extends ZipException {
    private static final long serialVersionUID = 20161221;

    /* renamed from: a */
    private final C29451a f77106a;

    /* renamed from: b */
    private final transient C29459u f77107b;

    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.n$a */
    public static class C29451a implements Serializable {
        public static final C29451a DATA_DESCRIPTOR = new C29451a("data descriptor");
        public static final C29451a ENCRYPTION = new C29451a("encryption");
        public static final C29451a METHOD = new C29451a("compression method");

        /* renamed from: a */
        private final String f77108a;

        public final String toString() {
            return this.f77108a;
        }

        private C29451a(String str) {
            this.f77108a = str;
        }
    }

    public final C29459u getEntry() {
        return this.f77107b;
    }

    public final C29451a getFeature() {
        return this.f77106a;
    }

    public C29450n(C29451a aVar, C29459u uVar) {
        StringBuilder sb = new StringBuilder("unsupported feature ");
        sb.append(aVar);
        sb.append(" used in entry ");
        sb.append(uVar.getName());
        super(sb.toString());
        this.f77106a = aVar;
        this.f77107b = uVar;
    }
}
