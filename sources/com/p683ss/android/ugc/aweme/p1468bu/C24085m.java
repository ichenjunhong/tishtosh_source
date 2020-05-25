package com.p683ss.android.ugc.aweme.p1468bu;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;

/* renamed from: com.ss.android.ugc.aweme.bu.m */
public final class C24085m {

    /* renamed from: a */
    public C24093p f63932a;

    /* renamed from: b */
    public String f63933b;

    /* renamed from: c */
    public int f63934c;

    /* renamed from: d */
    public BlockingQueue<Runnable> f63935d;

    /* renamed from: e */
    public RejectedExecutionHandler f63936e;

    /* renamed from: f */
    public long f63937f;

    /* renamed from: g */
    public ThreadFactory f63938g;

    /* renamed from: com.ss.android.ugc.aweme.bu.m$a */
    public static final class C24087a {

        /* renamed from: a */
        public C24093p f63939a;

        /* renamed from: b */
        public String f63940b;

        /* renamed from: c */
        public int f63941c;

        /* renamed from: d */
        public BlockingQueue<Runnable> f63942d;

        /* renamed from: e */
        public RejectedExecutionHandler f63943e;

        /* renamed from: f */
        public long f63944f;

        /* renamed from: g */
        public ThreadFactory f63945g;

        /* renamed from: a */
        public final C24085m mo49847a() {
            return new C24085m(this);
        }

        /* renamed from: a */
        public final C24087a mo49844a(int i) {
            this.f63941c = i;
            return this;
        }

        /* renamed from: a */
        public final C24087a mo49845a(String str) {
            this.f63940b = str;
            return this;
        }

        /* renamed from: a */
        public final C24087a mo49846a(ThreadFactory threadFactory) {
            this.f63945g = threadFactory;
            return this;
        }

        private C24087a(C24093p pVar) {
            this.f63941c = 1;
            this.f63942d = new LinkedBlockingQueue();
            this.f63943e = new AbortPolicy();
            this.f63944f = -1;
            this.f63939a = pVar;
        }
    }

    /* renamed from: a */
    public static C24087a m58928a(C24093p pVar) {
        return new C24087a(pVar);
    }

    private C24085m(C24087a aVar) {
        this.f63932a = aVar.f63939a;
        this.f63933b = aVar.f63940b;
        this.f63934c = aVar.f63941c;
        this.f63935d = aVar.f63942d;
        this.f63936e = aVar.f63943e;
        this.f63937f = aVar.f63944f;
        this.f63938g = aVar.f63945g;
    }
}
