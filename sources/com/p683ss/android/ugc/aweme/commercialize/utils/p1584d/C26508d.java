package com.p683ss.android.ugc.aweme.commercialize.utils.p1584d;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.d.d */
public final class C26508d {

    /* renamed from: a */
    List<C26506c> f69825a = new ArrayList();

    /* renamed from: b */
    int f69826b;

    /* renamed from: c */
    private C26509a f69827c = new C26509a(this);

    /* renamed from: d */
    private C26505b f69828d = C26504a.f69814a;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.d.d$a */
    public static final class C26509a extends Handler {

        /* renamed from: c */
        public static final C26510a f69829c = new C26510a(null);

        /* renamed from: a */
        public long f69830a = 1000;

        /* renamed from: b */
        public final C26508d f69831b;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.d.d$a$a */
        public static final class C26510a {
            private C26510a() {
            }

            public /* synthetic */ C26510a(C52707g gVar) {
                this();
            }
        }

        /* renamed from: a */
        public final void mo54204a() {
            if (!hasMessages(1)) {
                sendEmptyMessage(1);
            }
        }

        /* renamed from: b */
        public final void mo54205b() {
            if (hasMessages(1)) {
                removeMessages(1);
            }
        }

        public C26509a(C26508d dVar) {
            C52711k.m112240b(dVar, "playTaskManager");
            this.f69831b = dVar;
        }

        public final void handleMessage(Message message) {
            Integer num;
            if (message != null) {
                num = Integer.valueOf(message.what);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 1) {
                C26508d dVar = this.f69831b;
                long d = this.f69831b.mo54203d();
                if (!dVar.f69825a.isEmpty()) {
                    List arrayList = new ArrayList();
                    for (C26506c cVar : dVar.f69825a) {
                        if ((dVar.f69826b == cVar.f69815a && d >= ((long) cVar.f69816b)) || dVar.f69826b > cVar.f69815a) {
                            try {
                                Runnable runnable = cVar.f69819e;
                                if (runnable != null) {
                                    runnable.run();
                                }
                                if (!cVar.f69820f) {
                                    cVar.f69819e = null;
                                }
                            } catch (Exception unused) {
                            }
                            if (!cVar.f69820f) {
                                arrayList.add(cVar);
                            } else {
                                cVar.f69815a++;
                            }
                        }
                    }
                    dVar.f69825a.removeAll(arrayList);
                }
                sendEmptyMessageDelayed(1, this.f69830a);
            }
        }
    }

    /* renamed from: d */
    public final long mo54203d() {
        return this.f69828d.mo54191a();
    }

    /* renamed from: a */
    public final void mo54197a() {
        this.f69825a.clear();
        this.f69827c.mo54205b();
        this.f69827c.f69830a = 1000;
    }

    /* renamed from: b */
    public final void mo54201b() {
        this.f69826b = 0;
        if (!this.f69825a.isEmpty()) {
            this.f69827c.mo54204a();
        }
    }

    /* renamed from: c */
    public final void mo54202c() {
        this.f69826b++;
        if (this.f69825a.isEmpty()) {
            this.f69827c.mo54205b();
        }
    }

    /* renamed from: a */
    public final void mo54198a(long j) {
        this.f69827c.f69830a = j;
    }

    /* renamed from: a */
    public final void mo54199a(C26505b bVar) {
        C52711k.m112240b(bVar, "playTaskHelper");
        this.f69828d = bVar;
    }

    /* renamed from: a */
    public final void mo54200a(C26506c cVar) {
        C52711k.m112240b(cVar, "videoPlayTask");
        if (!this.f69825a.contains(cVar)) {
            this.f69825a.add(cVar);
        }
    }
}
