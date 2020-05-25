package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48685j.C48686a;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48650e;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48653h;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48679o;
import com.p683ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48704i;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.c */
public final class C48774c extends C48653h<List<? extends Effect>> implements C48686a {

    /* renamed from: d */
    final C48620c f122506d;

    /* renamed from: e */
    final C48890g f122507e;

    /* renamed from: f */
    public final Queue<Effect> f122508f;

    /* renamed from: g */
    public final List<Effect> f122509g = new ArrayList();

    /* renamed from: h */
    Handler f122510h;

    /* renamed from: i */
    final C48565a f122511i;

    /* renamed from: j */
    final DownloadEffectExtra f122512j;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.c$a */
    public static final class C48775a implements C48705j {

        /* renamed from: a */
        final /* synthetic */ C48774c f122513a;

        /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.c$a$a */
        static final class C48776a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C48775a f122514a;

            /* renamed from: b */
            final /* synthetic */ C48649d f122515b;

            C48776a(C48775a aVar, C48649d dVar) {
                this.f122514a = aVar;
                this.f122515b = dVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                if (this.f122514a.f122513a.f122286b instanceof C48704i) {
                    C48650e<T> eVar = this.f122514a.f122513a.f122286b;
                    if (eVar != null) {
                        ((C48704i) eVar).mo77143a(this.f122515b);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener");
                    }
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.c$a$b */
        static final class C48777b extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C48775a f122516a;

            C48777b(C48775a aVar) {
                this.f122516a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                if (this.f122516a.f122513a.f122286b instanceof C48704i) {
                    C48650e<T> eVar = this.f122516a.f122513a.f122286b;
                    if (eVar != null) {
                        eVar.mo8638a(this.f122516a.f122513a.f122509g);
                    }
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: a */
        public final void mo8643a(Effect effect) {
        }

        C48775a(C48774c cVar) {
            this.f122513a = cVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            Effect effect = (Effect) obj;
            if (effect != null) {
                this.f122513a.f122509g.add(effect);
            }
            if (!this.f122513a.f122508f.isEmpty()) {
                Effect effect2 = (Effect) this.f122513a.f122508f.poll();
                if (effect2 != null) {
                    this.f122513a.mo96325a(effect2);
                }
            } else {
                this.f122513a.mo96235a((C52670a<C52860x>) new C48777b<C52860x>(this));
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                }
            }
        }

        /* renamed from: a */
        public final void mo8644a(Effect effect, C48649d dVar) {
            C52711k.m112240b(dVar, "e");
            this.f122513a.mo96235a((C52670a<C52860x>) new C48776a<C52860x>(this, dVar));
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                myLooper.quit();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.c$b */
    static final class C48778b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48774c f122517a;

        C48778b(C48774c cVar) {
            this.f122517a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C48650e<T> eVar = this.f122517a.f122286b;
            if (eVar != null) {
                eVar.mo8638a(this.f122517a.f122509g);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.c$c */
    static final class C48779c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C48774c f122518a;

        /* renamed from: b */
        final /* synthetic */ Effect f122519b;

        C48779c(C48774c cVar, Effect effect) {
            this.f122518a = cVar;
            this.f122519b = effect;
        }

        public final void run() {
            C48774c cVar = this.f122518a;
            Effect effect = this.f122519b;
            if (TextUtils.isEmpty(effect.getZipPath()) || TextUtils.isEmpty(effect.getUnzipPath())) {
                StringBuilder sb = new StringBuilder();
                sb.append(cVar.f122507e.f122964j.toString());
                sb.append(File.separator);
                sb.append(effect.getId());
                sb.append(".zip");
                effect.setZipPath(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cVar.f122507e.f122964j.toString());
                sb2.append(File.separator);
                sb2.append(effect.getId());
                effect.setUnzipPath(sb2.toString());
            }
            C48620c cVar2 = cVar.f122506d;
            String id = effect.getId();
            C52711k.m112236a((Object) id, "effect.id");
            if (!cVar2.mo96155d(id)) {
                try {
                    C48780d dVar = new C48780d(effect, cVar.f122511i, C48679o.m105350a(), cVar.f122510h, cVar.f122512j);
                    dVar.mo96232a((C48650e<T>) new C48775a<T>(cVar));
                } catch (RuntimeException e) {
                    throw e;
                }
            } else {
                cVar.f122509g.add(effect);
                if (!cVar.f122508f.isEmpty()) {
                    Effect effect2 = (Effect) cVar.f122508f.poll();
                    if (effect2 != null) {
                        cVar.mo96325a(effect2);
                    }
                } else {
                    cVar.mo96235a((C52670a<C52860x>) new C48778b<C52860x>(cVar));
                    Looper myLooper = Looper.myLooper();
                    if (myLooper != null) {
                        myLooper.quit();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo96274a(Message message) {
        C52711k.m112240b(message, "msg");
    }

    /* renamed from: h */
    public final void mo96236h() {
        if (this.f122286b instanceof C48704i) {
            C48650e<T> eVar = this.f122286b;
            if (eVar != null) {
                ((C48704i) eVar).mo77143a(new C48649d(10001));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r0 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        r0.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        r0 = java.lang.Thread.currentThread();
        p2628d.p2639f.p2641b.C52711k.m112236a((java.lang.Object) r0, "Thread.currentThread()");
        m105512a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96229e() {
        /*
            r3 = this;
            android.os.Looper.prepare()
            android.os.Looper r0 = android.os.Looper.myLooper()
            com.ss.android.ugc.effectmanager.common.j r1 = new com.ss.android.ugc.effectmanager.common.j     // Catch:{ Throwable -> 0x0048, all -> 0x0035 }
            r2 = r3
            com.ss.android.ugc.effectmanager.common.j$a r2 = (com.p683ss.android.ugc.effectmanager.common.C48685j.C48686a) r2     // Catch:{ Throwable -> 0x0048, all -> 0x0035 }
            r1.<init>(r0, r2)     // Catch:{ Throwable -> 0x0048, all -> 0x0035 }
            android.os.Handler r1 = (android.os.Handler) r1     // Catch:{ Throwable -> 0x0048, all -> 0x0035 }
            r3.f122510h = r1     // Catch:{ Throwable -> 0x0048, all -> 0x0035 }
            java.util.Queue<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = r3.f122508f     // Catch:{ Throwable -> 0x0048, all -> 0x0035 }
            java.lang.Object r1 = r1.poll()     // Catch:{ Throwable -> 0x0048, all -> 0x0035 }
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r1     // Catch:{ Throwable -> 0x0048, all -> 0x0035 }
            if (r1 == 0) goto L_0x0023
            r3.mo96325a(r1)     // Catch:{ Throwable -> 0x0048, all -> 0x0035 }
            android.os.Looper.loop()     // Catch:{ Throwable -> 0x0048, all -> 0x0035 }
        L_0x0023:
            if (r0 == 0) goto L_0x0028
        L_0x0025:
            r0.quit()
        L_0x0028:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "Thread.currentThread()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            m105512a(r0)
            return
        L_0x0035:
            r1 = move-exception
            if (r0 == 0) goto L_0x003b
            r0.quit()
        L_0x003b:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r2 = "Thread.currentThread()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            m105512a(r0)
            throw r1
        L_0x0048:
            if (r0 == 0) goto L_0x0028
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48774c.mo96229e():void");
    }

    /* renamed from: a */
    public final void mo96325a(Effect effect) {
        C52711k.m112240b(effect, "effect");
        Handler handler = this.f122510h;
        if (handler != null) {
            handler.post(new C48779c(this, effect));
        }
    }

    /* renamed from: a */
    private static void m105512a(Thread thread) {
        Field field;
        try {
            if (VERSION.SDK_INT >= 24) {
                field = Thread.class.getDeclaredField("threadLocals");
            } else {
                field = Thread.class.getDeclaredField("localValues");
            }
            if (field != null) {
                field.setAccessible(true);
            }
            if (field != null) {
                field.set(thread, null);
            }
        } catch (Exception unused) {
        }
    }

    public C48774c(C48565a aVar, List<? extends Effect> list, String str, Handler handler, DownloadEffectExtra downloadEffectExtra) {
        C52711k.m112240b(aVar, "mEffectContext");
        C52711k.m112240b(list, "effectList");
        C52711k.m112240b(str, "taskFlag");
        super(handler, str);
        this.f122511i = aVar;
        this.f122512j = downloadEffectExtra;
        C48890g gVar = this.f122511i.f122047a;
        C52711k.m112236a((Object) gVar, "mEffectContext.effectConfiguration");
        C48620c cVar = gVar.f122972r;
        C52711k.m112236a((Object) cVar, "mEffectContext.effectConfiguration.cache");
        this.f122506d = cVar;
        C48890g gVar2 = this.f122511i.f122047a;
        C52711k.m112236a((Object) gVar2, "mEffectContext.effectConfiguration");
        this.f122507e = gVar2;
        this.f122508f = new ArrayDeque(list);
    }
}
