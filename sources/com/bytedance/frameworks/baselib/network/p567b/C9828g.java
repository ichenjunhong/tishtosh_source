package com.bytedance.frameworks.baselib.network.p567b;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.bytedance.frameworks.baselib.network.b.g */
public final class C9828g {

    /* renamed from: a */
    public ThreadPoolExecutor f26728a;

    /* renamed from: b */
    public ThreadPoolExecutor f26729b;

    /* renamed from: c */
    public int f26730c;

    /* renamed from: d */
    public int f26731d;

    /* renamed from: e */
    public int f26732e;

    /* renamed from: f */
    public int f26733f;

    /* renamed from: g */
    public long f26734g;

    /* renamed from: h */
    public long f26735h;

    /* renamed from: i */
    public long f26736i;

    /* renamed from: j */
    public boolean f26737j;

    /* renamed from: com.bytedance.frameworks.baselib.network.b.g$a */
    public static final class C9830a {

        /* renamed from: a */
        public ThreadPoolExecutor f26738a;

        /* renamed from: b */
        public ThreadPoolExecutor f26739b;

        /* renamed from: c */
        public int f26740c;

        /* renamed from: d */
        public int f26741d;

        /* renamed from: e */
        public int f26742e;

        /* renamed from: f */
        public int f26743f;

        /* renamed from: g */
        public long f26744g;

        /* renamed from: h */
        public long f26745h;

        /* renamed from: i */
        public long f26746i;

        /* renamed from: j */
        public boolean f26747j = true;

        /* renamed from: a */
        public final C9828g mo17674a() {
            return new C9828g(this);
        }

        /* renamed from: a */
        public final C9830a mo17673a(boolean z) {
            this.f26747j = true;
            return this;
        }

        /* renamed from: c */
        public final C9830a mo17677c(long j) {
            this.f26746i = 10;
            return this;
        }

        /* renamed from: a */
        public final C9830a mo17672a(long j) {
            this.f26744g = 30;
            return this;
        }

        /* renamed from: b */
        public final C9830a mo17676b(long j) {
            this.f26745h = 10;
            return this;
        }

        /* renamed from: a */
        public final C9830a mo17671a(int i, int i2) {
            this.f26740c = 8;
            this.f26742e = 8;
            return this;
        }

        /* renamed from: b */
        public final C9830a mo17675b(int i, int i2) {
            this.f26741d = 8;
            this.f26743f = 8;
            return this;
        }
    }

    /* renamed from: a */
    public static C9830a m19666a() {
        return new C9830a();
    }

    private C9828g(C9830a aVar) {
        this.f26730c = 8;
        this.f26731d = 8;
        this.f26732e = 8;
        this.f26733f = 8;
        this.f26734g = 30;
        this.f26735h = 10;
        this.f26736i = 10;
        this.f26737j = true;
        if (aVar.f26739b != null) {
            this.f26728a = aVar.f26739b;
        }
        if (aVar.f26738a != null) {
            this.f26729b = aVar.f26738a;
        }
        if (aVar.f26740c > 0) {
            this.f26730c = aVar.f26740c;
        }
        if (aVar.f26741d > 0) {
            this.f26731d = aVar.f26741d;
        }
        if (aVar.f26742e > 0) {
            this.f26732e = aVar.f26742e;
        }
        if (aVar.f26743f > 0) {
            this.f26733f = aVar.f26743f;
        }
        if (aVar.f26744g > 0) {
            this.f26734g = aVar.f26744g;
        }
        if (aVar.f26745h > 0) {
            this.f26735h = aVar.f26745h;
        }
        if (aVar.f26746i > 0) {
            this.f26736i = aVar.f26746i;
        }
        this.f26737j = aVar.f26747j;
    }
}
