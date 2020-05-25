package com.facebook.fresco.animation.factory;

import android.net.Uri;
import com.facebook.common.p920d.C13691k;
import com.facebook.common.p924h.C13715a;
import com.facebook.common.time.C13737b;
import com.facebook.imagepipeline.p956a.p957a.C13913g;
import com.facebook.imagepipeline.p956a.p959c.C13925b;
import com.facebook.imagepipeline.p956a.p959c.C13926c;
import com.facebook.imagepipeline.p963c.C13946f;
import com.facebook.imagepipeline.p964d.C13971h;
import com.facebook.imagepipeline.p968h.C14038a;
import com.facebook.imagepipeline.p970j.C14040a;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p970j.C14043d;
import com.facebook.imagepipeline.p970j.C14046g;
import com.facebook.p914c.p915a.C13619c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.facebook.fresco.animation.factory.a */
public final class C13893a implements C14038a {

    /* renamed from: a */
    private final C13925b f36232a;

    /* renamed from: b */
    private final ScheduledExecutorService f36233b;

    /* renamed from: c */
    private final ExecutorService f36234c;

    /* renamed from: d */
    private final C13737b f36235d;

    /* renamed from: e */
    private final C13946f f36236e;

    /* renamed from: f */
    private final C13971h<C13619c, C14042c> f36237f;

    /* renamed from: g */
    private final C13691k<Integer> f36238g;

    /* renamed from: h */
    private final C13691k<Integer> f36239h;

    /* renamed from: com.facebook.fresco.animation.factory.a$a */
    public static class C13894a implements C13619c {

        /* renamed from: a */
        private final String f36240a;

        /* renamed from: a */
        public final String mo25470a() {
            return this.f36240a;
        }

        public final String toString() {
            return this.f36240a;
        }

        public final int hashCode() {
            if (this.f36240a != null) {
                return this.f36240a.hashCode();
            }
            return 0;
        }

        /* renamed from: a */
        public final boolean mo25471a(Uri uri) {
            return uri.toString().startsWith(this.f36240a);
        }

        public C13894a(int i) {
            StringBuilder sb = new StringBuilder("anim://");
            sb.append(i);
            this.f36240a = sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C13894a aVar = (C13894a) obj;
            if (this.f36240a != null) {
                return this.f36240a.equals(aVar.f36240a);
            }
            if (aVar.f36240a == null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo25692a(C14042c cVar) {
        return cVar instanceof C14040a;
    }

    /* renamed from: a */
    private C13926c m28299a(C13913g gVar) {
        C13926c cVar = new C13926c(new C13894a(gVar.hashCode()), this.f36237f);
        int c = gVar.mo26087c();
        if (c > 0) {
            for (int i = 0; i < c; i++) {
                if (gVar.mo26086b(i)) {
                    C13715a aVar = null;
                    try {
                        C13715a a = C13715a.m27746a(new C14043d(gVar.mo26084a(i), C14046g.f36711a, 0));
                        try {
                            cVar.mo26094a(i, a);
                            C13715a.m27752c(a);
                        } catch (Throwable th) {
                            th = th;
                            aVar = a;
                            C13715a.m27752c(aVar);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C13715a.m27752c(aVar);
                        throw th;
                    }
                }
            }
        }
        return cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005b, code lost:
        r1 = ((java.lang.Integer) r10.f36239h.mo23157b()).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0068, code lost:
        if (r1 <= 0) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006a, code lost:
        r3 = new com.facebook.fresco.animation.p948b.p950b.C13872d(r1);
        r8 = r3;
        r9 = new com.facebook.fresco.animation.p948b.p950b.C13870c(r10.f36236e, r7, r11.f36693a.f36393h, r10.f36234c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007f, code lost:
        r8 = null;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0081, code lost:
        r3 = new com.facebook.fresco.animation.p948b.C13863a(r10.f36236e, r5, new com.facebook.fresco.animation.p948b.p951c.C13874a(r2), r7, r8, r9);
        r3.f36159b = r11.f36693a.f36393h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a7, code lost:
        return new com.facebook.fresco.animation.p952c.C13877a(new com.facebook.fresco.animation.p947a.C13859c(r3, r3, r10.f36235d, r10.f36233b), r11.f36693a.f36396k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0032, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004e, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004f, code lost:
        r7 = new com.facebook.fresco.animation.p948b.p951c.C13875b(r5, r2);
        r1 = r11.f36693a.f36388c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0058, code lost:
        if (r1 <= 0) goto L_0x005b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ android.graphics.drawable.Drawable mo25693b(com.facebook.imagepipeline.p970j.C14042c r11) {
        /*
            r10 = this;
            com.facebook.imagepipeline.j.a r11 = (com.facebook.imagepipeline.p970j.C14040a) r11
            com.facebook.fresco.animation.c.a r0 = new com.facebook.fresco.animation.c.a
            com.facebook.imagepipeline.a.a.g r1 = r11.mo26254d()
            com.facebook.imagepipeline.a.a.e r2 = r1.f36300a
            android.graphics.Rect r3 = new android.graphics.Rect
            int r4 = r2.getWidth()
            int r2 = r2.getHeight()
            r5 = 0
            r3.<init>(r5, r5, r4, r2)
            com.facebook.imagepipeline.a.c.b r2 = r10.f36232a
            com.facebook.imagepipeline.a.a.a r2 = r2.mo26050a(r1, r3)
            com.facebook.common.d.k<java.lang.Integer> r3 = r10.f36238g
            java.lang.Object r3 = r3.mo23157b()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            switch(r3) {
                case 1: goto L_0x0044;
                case 2: goto L_0x003a;
                case 3: goto L_0x0034;
                default: goto L_0x002d;
            }
        L_0x002d:
            com.facebook.fresco.animation.b.a.c r1 = new com.facebook.fresco.animation.b.a.c
            r1.<init>()
        L_0x0032:
            r5 = r1
            goto L_0x004f
        L_0x0034:
            com.facebook.fresco.animation.b.a.b r1 = new com.facebook.fresco.animation.b.a.b
            r1.<init>()
            goto L_0x0032
        L_0x003a:
            com.facebook.fresco.animation.b.a.a r3 = new com.facebook.fresco.animation.b.a.a
            com.facebook.imagepipeline.a.c.c r1 = r10.m28299a(r1)
            r3.<init>(r1, r5)
            goto L_0x004e
        L_0x0044:
            com.facebook.fresco.animation.b.a.a r3 = new com.facebook.fresco.animation.b.a.a
            com.facebook.imagepipeline.a.c.c r1 = r10.m28299a(r1)
            r4 = 1
            r3.<init>(r1, r4)
        L_0x004e:
            r5 = r3
        L_0x004f:
            com.facebook.fresco.animation.b.c.b r7 = new com.facebook.fresco.animation.b.c.b
            r7.<init>(r5, r2)
            com.facebook.imagepipeline.common.b r1 = r11.f36693a
            int r1 = r1.f36388c
            if (r1 <= 0) goto L_0x005b
            goto L_0x0067
        L_0x005b:
            com.facebook.common.d.k<java.lang.Integer> r1 = r10.f36239h
            java.lang.Object r1 = r1.mo23157b()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
        L_0x0067:
            r3 = 0
            if (r1 <= 0) goto L_0x007f
            com.facebook.fresco.animation.b.b.d r3 = new com.facebook.fresco.animation.b.b.d
            r3.<init>(r1)
            com.facebook.imagepipeline.common.b r1 = r11.f36693a
            android.graphics.Bitmap$Config r1 = r1.f36393h
            com.facebook.fresco.animation.b.b.c r4 = new com.facebook.fresco.animation.b.b.c
            com.facebook.imagepipeline.c.f r6 = r10.f36236e
            java.util.concurrent.ExecutorService r8 = r10.f36234c
            r4.<init>(r6, r7, r1, r8)
            r8 = r3
            r9 = r4
            goto L_0x0081
        L_0x007f:
            r8 = r3
            r9 = r8
        L_0x0081:
            com.facebook.fresco.animation.b.a r1 = new com.facebook.fresco.animation.b.a
            com.facebook.imagepipeline.c.f r4 = r10.f36236e
            com.facebook.fresco.animation.b.c.a r6 = new com.facebook.fresco.animation.b.c.a
            r6.<init>(r2)
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            com.facebook.imagepipeline.common.b r2 = r11.f36693a
            android.graphics.Bitmap$Config r2 = r2.f36393h
            r1.f36159b = r2
            com.facebook.common.time.b r2 = r10.f36235d
            java.util.concurrent.ScheduledExecutorService r3 = r10.f36233b
            r4 = r1
            com.facebook.fresco.animation.a.c$a r4 = (com.facebook.fresco.animation.p947a.C13859c.C13861a) r4
            com.facebook.fresco.animation.a.c r5 = new com.facebook.fresco.animation.a.c
            r5.<init>(r1, r4, r2, r3)
            com.facebook.imagepipeline.common.b r11 = r11.f36693a
            java.lang.Object r11 = r11.f36396k
            r0.<init>(r5, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fresco.animation.factory.C13893a.mo25693b(com.facebook.imagepipeline.j.c):android.graphics.drawable.Drawable");
    }

    public C13893a(C13925b bVar, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, C13737b bVar2, C13946f fVar, C13971h<C13619c, C14042c> hVar, C13691k<Integer> kVar, C13691k<Integer> kVar2) {
        this.f36232a = bVar;
        this.f36233b = scheduledExecutorService;
        this.f36234c = executorService;
        this.f36235d = bVar2;
        this.f36236e = fVar;
        this.f36237f = hVar;
        this.f36238g = kVar;
        this.f36239h = kVar2;
    }
}
