package com.p683ss.android.ugc.aweme.discover.mixfeed.p1656c;

import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.c.a */
public final class C28310a implements Serializable {
    public static final C28312b Companion = new C28312b(null);

    /* renamed from: a */
    private String f74247a = "";

    /* renamed from: b */
    private boolean f74248b = true;

    /* renamed from: c */
    private int f74249c = -1;

    /* renamed from: d */
    private String f74250d = "";

    /* renamed from: e */
    private String f74251e = "";

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.c.a$a */
    public static final class C28311a {

        /* renamed from: a */
        private String f74252a = "";

        /* renamed from: b */
        private boolean f74253b = true;

        /* renamed from: c */
        private int f74254c = -1;

        /* renamed from: d */
        private String f74255d = "";

        /* renamed from: e */
        private String f74256e = "";

        /* renamed from: a */
        public final C28310a mo56721a() {
            C28310a aVar = new C28310a();
            aVar.setSearchResultId(this.f74252a);
            aVar.setAladdin(this.f74253b);
            aVar.setRank(this.f74254c);
            aVar.setTokenType(this.f74255d);
            aVar.setSearchKeyWord(this.f74256e);
            return aVar;
        }

        /* renamed from: a */
        public final C28311a mo56719a(int i) {
            this.f74254c = i;
            return this;
        }

        /* renamed from: b */
        public final C28311a mo56722b(String str) {
            this.f74255d = str;
            return this;
        }

        /* renamed from: c */
        public final C28311a mo56723c(String str) {
            this.f74256e = str;
            return this;
        }

        /* renamed from: a */
        public final C28311a mo56720a(String str) {
            this.f74252a = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.c.a$b */
    public static final class C28312b {
        private C28312b() {
        }

        public /* synthetic */ C28312b(C52707g gVar) {
            this();
        }
    }

    public final int getRank() {
        return this.f74249c;
    }

    public final String getSearchKeyWord() {
        return this.f74251e;
    }

    public final String getSearchResultId() {
        return this.f74247a;
    }

    public final String getTokenType() {
        return this.f74250d;
    }

    public final boolean isAladdin() {
        return this.f74248b;
    }

    public static final C28311a newBuilder() {
        return new C28311a();
    }

    public final void setAladdin(boolean z) {
        this.f74248b = z;
    }

    public final void setRank(int i) {
        this.f74249c = i;
    }

    public final void setSearchKeyWord(String str) {
        this.f74251e = str;
    }

    public final void setSearchResultId(String str) {
        this.f74247a = str;
    }

    public final void setTokenType(String str) {
        this.f74250d = str;
    }
}
