package com.bytedance.geckox;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.model.CheckRequestBodyModel.TargetChannel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p594a.C10039c;
import com.bytedance.geckox.p594a.p595a.C10033b;
import com.bytedance.geckox.p599d.C10064b;
import com.bytedance.geckox.p600e.C10065a;
import com.bytedance.geckox.p600e.C10092d;
import com.bytedance.geckox.p600e.C10099e;
import com.bytedance.geckox.p600e.C10100f;
import com.bytedance.geckox.p600e.C10101g;
import com.bytedance.geckox.p600e.C10102h;
import com.bytedance.geckox.p600e.C10103i;
import com.bytedance.geckox.p600e.C10104j;
import com.bytedance.geckox.p600e.p601a.p602a.C10066a;
import com.bytedance.geckox.p600e.p601a.p602a.C10067b;
import com.bytedance.geckox.p600e.p601a.p602a.C10068c;
import com.bytedance.geckox.p600e.p601a.p603b.C10069a;
import com.bytedance.geckox.p600e.p601a.p603b.C10070b;
import com.bytedance.geckox.p600e.p601a.p603b.C10071c;
import com.bytedance.geckox.p600e.p601a.p603b.C10072d;
import com.bytedance.geckox.p600e.p601a.p603b.C10073e;
import com.bytedance.geckox.p600e.p604b.p605a.C10075a;
import com.bytedance.geckox.p600e.p604b.p605a.C10076b;
import com.bytedance.geckox.p600e.p604b.p605a.C10078d;
import com.bytedance.geckox.p600e.p604b.p606b.C10079a;
import com.bytedance.geckox.p600e.p604b.p606b.C10080b;
import com.bytedance.geckox.p600e.p604b.p606b.C10081c;
import com.bytedance.geckox.p600e.p604b.p606b.C10082d;
import com.bytedance.geckox.p600e.p604b.p606b.C10084f;
import com.bytedance.geckox.p607f.C10105a;
import com.bytedance.geckox.p607f.C10106b;
import com.bytedance.geckox.p610h.C10112a;
import com.bytedance.geckox.p611i.C10117b;
import com.bytedance.geckox.p613k.C10122a;
import com.bytedance.geckox.p613k.C10122a.C101297;
import com.bytedance.geckox.p614l.p615a.C10131a;
import com.bytedance.geckox.statistic.C10136b;
import com.bytedance.geckox.statistic.model.C10150a;
import com.bytedance.geckox.utils.C10154d;
import com.bytedance.geckox.utils.C10159g;
import com.bytedance.p782n.C12378b;
import com.bytedance.p782n.C12381c;
import com.bytedance.p782n.C12382d;
import com.bytedance.p782n.C12385f;
import com.bytedance.p782n.C12388h.C12390a;
import com.bytedance.p782n.C12395l.C12397b;
import com.bytedance.p782n.p784b.C12379a;
import com.bytedance.p782n.p784b.C12380b;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.bytedance.geckox.a */
public final class C10026a {

    /* renamed from: a */
    public C10106b f27246a = new C10106b();

    /* renamed from: b */
    public C10044b f27247b;

    /* renamed from: c */
    public File f27248c;

    /* renamed from: d */
    private final List<String> f27249d = new ArrayList();

    /* renamed from: e */
    private Queue<String> f27250e = new LinkedBlockingQueue();

    /* renamed from: b */
    private boolean m20176b() {
        List<String> list = this.f27247b.f27286g;
        List<String> list2 = this.f27247b.f27285f;
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
            return false;
        }
        for (String str : list2) {
            boolean z = false;
            for (String equals : list) {
                if (TextUtils.equals(str, equals)) {
                    z = true;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo17998a() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f27247b.f27285f);
        String b = C10064b.m20295a().f27360a.mo34889b(new C10131a(arrayList));
        if ((this.f27247b.f27283d == null || !this.f27247b.f27283d.mo18100a()) && this.f27250e.size() < 10) {
            this.f27250e.add(b);
        }
    }

    /* renamed from: b */
    public static void m20175b(List<Pair<String, C10112a>> list) {
        if (list != null) {
            for (Pair pair : list) {
                try {
                    ((C10112a) pair.second).mo18090a();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static C10026a m20173a(C10044b bVar) {
        if (bVar != null) {
            List<String> list = bVar.f27285f;
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("access key empty");
            }
            Context context = bVar.f27280a;
            if (context != null) {
                C10159g.f27495a = context;
            }
            return new C10026a(bVar);
        }
        throw new IllegalArgumentException("config == null");
    }

    /* renamed from: a */
    private boolean m20174a(Map<String, List<TargetChannel>> map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        List<String> list = this.f27247b.f27285f;
        for (Entry entry : map.entrySet()) {
            boolean z = false;
            for (String equals : list) {
                if (TextUtils.equals(equals, (CharSequence) entry.getKey())) {
                    z = true;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    private C10026a(C10044b bVar) {
        this.f27247b = bVar;
        this.f27248c = bVar.f27293n;
        this.f27248c.mkdirs();
        C10044b bVar2 = this.f27247b;
        mo17999a(C10100f.class, C10136b.m20427a(bVar2));
        mo17999a(C10099e.class, C10136b.m20427a(bVar2));
        mo17999a(C10071c.class, C10136b.m20429b(bVar2.f27280a));
        mo17999a(C10070b.class, C10136b.m20425a());
        mo17999a(C10072d.class, C10136b.m20428b());
        mo17999a(C10069a.class, C10136b.m20430c());
        mo17999a(C10073e.class, (C12379a) new C12379a() {
            /* renamed from: b */
            public final <T> void mo18098b(C12378b<T> bVar, C12382d dVar) {
                super.mo18098b(bVar, dVar);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) ((Pair) bVar.mo23392b(C10103i.class)).second).getChannel());
                a.f27472k = true;
                a.f27476o = SystemClock.uptimeMillis();
            }

            /* renamed from: a */
            public final <T> void mo18096a(C12378b<T> bVar, C12382d dVar, Throwable th) {
                super.mo18096a(bVar, dVar, th);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) ((Pair) bVar.mo23392b(C10103i.class)).second).getChannel());
                a.f27472k = false;
                a.f27482u = th.getMessage();
                a.f27476o = SystemClock.uptimeMillis();
            }
        });
        mo17999a(C10067b.class, C10136b.m20426a(bVar2.f27280a));
        mo17999a(C10066a.class, C10136b.m20431d());
        mo17999a(C10068c.class, (C12379a) new C12379a() {
            /* renamed from: b */
            public final <T> void mo18098b(C12378b<T> bVar, C12382d dVar) {
                super.mo18098b(bVar, dVar);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) ((Pair) bVar.mo23392b(C10102h.class)).second).getChannel());
                a.f27459D = true;
                a.f27456A = SystemClock.uptimeMillis();
            }

            /* renamed from: a */
            public final <T> void mo18096a(C12378b<T> bVar, C12382d dVar, Throwable th) {
                super.mo18096a(bVar, dVar, th);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) ((Pair) bVar.mo23392b(C10102h.class)).second).getChannel());
                a.f27459D = false;
                a.f27456A = SystemClock.uptimeMillis();
                a.f27461F = th.getMessage();
            }
        });
        mo17999a(C10081c.class, C10136b.m20429b(bVar2.f27280a));
        mo17999a(C10080b.class, C10136b.m20425a());
        mo17999a(C10082d.class, C10136b.m20428b());
        mo17999a(C10079a.class, C10136b.m20430c());
        mo17999a(C10084f.class, (C12379a) new C12379a() {
            /* renamed from: b */
            public final <T> void mo18098b(C12378b<T> bVar, C12382d dVar) {
                super.mo18098b(bVar, dVar);
            }

            /* renamed from: a */
            public final <T> void mo18097a(C12378b<T> bVar, C12382d dVar) {
                super.mo18097a(bVar, dVar);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) ((Pair) bVar.mo23392b(C10103i.class)).second).getChannel());
                a.f27472k = true;
                a.f27476o = SystemClock.uptimeMillis();
            }

            /* renamed from: b */
            public final <T> void mo18149b(C12378b<T> bVar, C12382d dVar, Throwable th) {
                super.mo18149b(bVar, dVar, th);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) ((Pair) bVar.mo23392b(C10103i.class)).second).getChannel());
                a.f27472k = false;
                a.f27476o = SystemClock.uptimeMillis();
                a.f27461F = th.getMessage();
            }

            /* renamed from: a */
            public final <T> void mo18096a(C12378b<T> bVar, C12382d dVar, Throwable th) {
                super.mo18096a(bVar, dVar, th);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) ((Pair) bVar.mo23392b(C10103i.class)).second).getChannel());
                a.f27472k = false;
                a.f27476o = SystemClock.uptimeMillis();
                a.f27482u = th.getMessage();
            }
        });
        mo17999a(C10076b.class, C10136b.m20426a(bVar2.f27280a));
        mo17999a(C10075a.class, C10136b.m20431d());
        mo17999a(C10078d.class, (C12379a) new C12379a() {
            /* renamed from: a */
            public final <T> void mo18097a(C12378b<T> bVar, C12382d dVar) {
                super.mo18097a(bVar, dVar);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) ((Pair) bVar.mo23392b(C10102h.class)).second).getChannel());
                a.f27459D = true;
                a.f27456A = SystemClock.uptimeMillis();
            }

            /* renamed from: b */
            public final <T> void mo18149b(C12378b<T> bVar, C12382d dVar, Throwable th) {
                super.mo18149b(bVar, dVar, th);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) ((Pair) bVar.mo23392b(C10102h.class)).second).getChannel());
                a.f27459D = false;
                a.f27456A = SystemClock.uptimeMillis();
                a.f27461F = th.getMessage();
            }

            /* renamed from: a */
            public final <T> void mo18096a(C12378b<T> bVar, C12382d dVar, Throwable th) {
                super.mo18096a(bVar, dVar, th);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) ((Pair) bVar.mo23392b(C10102h.class)).second).getChannel());
                a.f27459D = false;
                a.f27456A = SystemClock.uptimeMillis();
                a.f27461F = th.getMessage();
            }
        });
        C10044b bVar3 = this.f27247b;
        try {
            Method declaredMethod = Class.forName("com.bytedance.geckox.b.b").getDeclaredMethod("debug", new Class[]{C10026a.class, C10044b.class});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, new Object[]{this, bVar3});
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo18002a(List<Pair<String, C10112a>> list) {
        if (list != null && !list.isEmpty()) {
            File file = new File(this.f27248c, this.f27247b.mo18019a());
            for (Pair pair : list) {
                C10039c.m20200a(new File(file, (String) pair.first).getAbsolutePath());
            }
        }
    }

    /* renamed from: a */
    public final void mo17999a(Class<? extends C12382d<?, ?>> cls, C12379a aVar) {
        this.f27246a.mo18083a(cls, aVar);
    }

    /* renamed from: a */
    public final void mo18000a(String str, C10105a aVar) {
        mo18001a(str, null, null, aVar);
    }

    /* renamed from: a */
    public final void mo18003a(final List<String> list, final C10105a aVar) {
        this.f27247b.f27282c.execute(new Runnable(null) {
            /* JADX WARNING: Removed duplicated region for block: B:33:0x01e5  */
            /* JADX WARNING: Removed duplicated region for block: B:41:0x01fb  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r16 = this;
                    r1 = r16
                    java.lang.String r0 = "gecko-debug-tag"
                    r2 = 2
                    java.lang.Object[] r3 = new java.lang.Object[r2]
                    java.lang.String r4 = "准备检查更新..."
                    r5 = 0
                    r3[r5] = r4
                    java.util.List r4 = r4
                    r6 = 1
                    r3[r6] = r4
                    com.bytedance.geckox.p611i.C10117b.m20388a(r0, r3)
                    com.bytedance.geckox.a r0 = com.bytedance.geckox.C10026a.this
                    com.bytedance.geckox.b r0 = r0.f27247b
                    com.bytedance.geckox.a.a.a r0 = r0.f27287h
                    if (r0 == 0) goto L_0x003b
                    com.bytedance.geckox.a r0 = com.bytedance.geckox.C10026a.this
                    com.bytedance.geckox.b r0 = r0.f27247b
                    com.bytedance.geckox.a.a.a r0 = r0.f27287h
                    com.bytedance.geckox.a.a.b r0 = r0.f27269b
                    com.bytedance.geckox.a r4 = com.bytedance.geckox.C10026a.this
                    com.bytedance.geckox.b r4 = r4.f27247b
                    com.bytedance.geckox.a.a.a r4 = r4.f27287h
                    com.bytedance.geckox.a r7 = com.bytedance.geckox.C10026a.this
                    com.bytedance.geckox.b r7 = r7.f27247b
                    java.io.File r7 = r7.f27293n
                    com.bytedance.geckox.a r8 = com.bytedance.geckox.C10026a.this
                    com.bytedance.geckox.b r8 = r8.f27247b
                    java.util.List<java.lang.String> r8 = r8.f27285f
                    r0.mo18010a(r4, r7, r8)
                    r4 = r0
                    goto L_0x003c
                L_0x003b:
                    r4 = 0
                L_0x003c:
                    com.bytedance.geckox.a r0 = com.bytedance.geckox.C10026a.this     // Catch:{ Exception -> 0x01f4, all -> 0x01dd }
                    java.util.List r7 = r4     // Catch:{ Exception -> 0x01f4, all -> 0x01dd }
                    com.bytedance.geckox.f.a r8 = r5     // Catch:{ Exception -> 0x01f4, all -> 0x01dd }
                    java.util.List r7 = r0.mo18005b(r7, r8)     // Catch:{ Exception -> 0x01f4, all -> 0x01dd }
                    boolean r0 = r7.isEmpty()     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    if (r0 == 0) goto L_0x0060
                    com.bytedance.geckox.C10026a.m20175b(r7)
                    if (r4 == 0) goto L_0x0054
                    r4.mo18009a()
                L_0x0054:
                    java.lang.String r0 = "gecko-debug-tag"
                    java.lang.Object[] r2 = new java.lang.Object[r6]
                    java.lang.String r3 = "所有channel更新结束"
                    r2[r5] = r3
                    com.bytedance.geckox.p611i.C10117b.m20388a(r0, r2)
                    return
                L_0x0060:
                    java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    int r8 = r7.size()     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r0.<init>(r8)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.util.Iterator r8 = r7.iterator()     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                L_0x006d:
                    boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    if (r9 == 0) goto L_0x007f
                    java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    android.util.Pair r9 = (android.util.Pair) r9     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.lang.Object r9 = r9.first     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r0.add(r9)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    goto L_0x006d
                L_0x007f:
                    java.lang.String r8 = "gecko-debug-tag"
                    java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.lang.String r10 = "待更新channel:"
                    r9[r5] = r10     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r9[r6] = r0     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.geckox.p611i.C10117b.m20388a(r8, r9)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.geckox.f.a r8 = r5     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.geckox.a r9 = com.bytedance.geckox.C10026a.this     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.io.File r9 = r9.f27248c     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.geckox.a r10 = com.bytedance.geckox.C10026a.this     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.geckox.b r10 = r10.f27247b     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.geckox.a r11 = com.bytedance.geckox.C10026a.this     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.geckox.f.b r11 = r11.f27246a     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.util.Map r12 = null     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r13.<init>()     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h$a r14 = com.bytedance.p782n.C12388h.C12390a.m24949a()     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.lang.Class<com.bytedance.geckox.e.e> r15 = com.bytedance.geckox.p600e.C10099e.class
                    com.bytedance.n.h$a r14 = r14.mo23400a(r15)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.lang.Object[] r15 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r15[r5] = r9     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.util.List<java.lang.String> r3 = r10.f27285f     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.lang.Object r3 = r3.get(r5)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r15[r6] = r3     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h$a r3 = r14.mo23401a(r15)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.lang.Class<com.bytedance.geckox.e.e> r14 = com.bytedance.geckox.p600e.C10099e.class
                    com.bytedance.n.b.a r14 = r11.mo18082a(r14)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h$a r3 = r3.mo23399a(r14)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h r3 = r3.mo23402b()     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r13.add(r3)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h$a r3 = com.bytedance.p782n.C12388h.C12390a.m24949a()     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.lang.Class<com.bytedance.geckox.e.c> r14 = com.bytedance.geckox.p600e.C10085c.class
                    com.bytedance.n.h$a r3 = r3.mo23400a(r14)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r14 = 3
                    java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r14[r5] = r10     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r14[r6] = r12     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r14[r2] = r8     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h$a r3 = r3.mo23401a(r14)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.b.b r12 = new com.bytedance.n.b.b     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.b.a[] r14 = new com.bytedance.p782n.p784b.C12379a[r2]     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.lang.String r15 = r10.mo18019a()     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    if (r8 != 0) goto L_0x00ef
                    r2 = 0
                    goto L_0x00f4
                L_0x00ef:
                    com.bytedance.geckox.k.a$6 r2 = new com.bytedance.geckox.k.a$6     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r2.<init>(r15, r8)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                L_0x00f4:
                    r14[r5] = r2     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.lang.Class<com.bytedance.geckox.e.c> r2 = com.bytedance.geckox.p600e.C10085c.class
                    com.bytedance.n.b.a r2 = r11.mo18082a(r2)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r14[r6] = r2     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r12.<init>(r14)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h$a r2 = r3.mo23399a(r12)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h r2 = r2.mo23402b()     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r13.add(r2)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h$a r2 = com.bytedance.p782n.C12388h.C12390a.m24949a()     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.lang.Class<com.bytedance.geckox.e.g> r3 = com.bytedance.geckox.p600e.C10101g.class
                    com.bytedance.n.h$a r2 = r2.mo23400a(r3)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.util.concurrent.Executor r12 = r10.f27281b     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r3[r5] = r12     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h$a r2 = r2.mo23401a(r3)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.b.a r3 = com.bytedance.geckox.p613k.C10122a.m20395a(r8)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h$a r2 = r2.mo23399a(r3)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h r2 = r2.mo23402b()     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r13.add(r2)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.l$b r2 = new com.bytedance.n.l$b     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r2.<init>()     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.lang.String r3 = "branch_zip"
                    com.bytedance.n.l$a r3 = r2.mo23406a(r3)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h r12 = com.bytedance.geckox.p613k.C10122a.m20399b(r8, r9, r10, r11)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.l$a r3 = r3.mo23403a(r12)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h$a r12 = com.bytedance.p782n.C12388h.C12390a.m24949a()     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.lang.Class<com.bytedance.n.f> r14 = com.bytedance.p782n.C12385f.class
                    com.bytedance.n.h$a r12 = r12.mo23400a(r14)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h r12 = r12.mo23402b()     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r3.mo23403a(r12)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.lang.String r3 = "branch_single_file"
                    com.bytedance.n.l$a r3 = r2.mo23406a(r3)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h r12 = com.bytedance.geckox.p613k.C10122a.m20396a(r8, r9, r10, r11)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.l$a r3 = r3.mo23403a(r12)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h$a r12 = com.bytedance.p782n.C12388h.C12390a.m24949a()     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.lang.Class<com.bytedance.n.f> r14 = com.bytedance.p782n.C12385f.class
                    com.bytedance.n.h$a r12 = r12.mo23400a(r14)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h r12 = r12.mo23402b()     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r3.mo23403a(r12)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.lang.String r3 = "branch_myarchive_file"
                    com.bytedance.n.l$a r3 = r2.mo23406a(r3)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h r9 = com.bytedance.geckox.p613k.C10122a.m20402c(r8, r9, r10, r11)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.l$a r3 = r3.mo23403a(r9)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h$a r9 = com.bytedance.p782n.C12388h.C12390a.m24949a()     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.lang.Class<com.bytedance.n.f> r10 = com.bytedance.p782n.C12385f.class
                    com.bytedance.n.h$a r9 = r9.mo23400a(r10)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h r9 = r9.mo23402b()     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r3.mo23403a(r9)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.lang.Class<com.bytedance.geckox.e.a> r3 = com.bytedance.geckox.p600e.C10065a.class
                    com.bytedance.n.h r2 = r2.mo23405a(r3)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r13.add(r2)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h$a r2 = com.bytedance.p782n.C12388h.C12390a.m24949a()     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.lang.Class<com.bytedance.geckox.e.j> r3 = com.bytedance.geckox.p600e.C10104j.class
                    com.bytedance.n.h$a r2 = r2.mo23400a(r3)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.b.a r3 = com.bytedance.geckox.p613k.C10122a.m20398b(r8)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h$a r2 = r2.mo23399a(r3)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.n.h r2 = r2.mo23402b()     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r13.add(r2)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r2 = 0
                    com.bytedance.n.b r2 = com.bytedance.p782n.C12381c.m24938a(r13, r2)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.lang.Object r0 = r2.mo23391a(r0)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.lang.String r2 = "gecko-debug-tag"
                    r3 = 2
                    java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    java.lang.String r8 = "更新结束"
                    r3[r5] = r8     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    r3[r6] = r0     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.geckox.p611i.C10117b.m20388a(r2, r3)     // Catch:{ Exception -> 0x01f6, all -> 0x01db }
                    com.bytedance.geckox.C10026a.m20175b(r7)
                    if (r4 == 0) goto L_0x01d2
                    r4.mo18009a()
                L_0x01d2:
                    java.lang.String r0 = "gecko-debug-tag"
                    java.lang.Object[] r2 = new java.lang.Object[r6]
                    java.lang.String r3 = "所有channel更新结束"
                    r2[r5] = r3
                    goto L_0x0206
                L_0x01db:
                    r0 = move-exception
                    goto L_0x01e0
                L_0x01dd:
                    r0 = move-exception
                    r2 = 0
                    r7 = r2
                L_0x01e0:
                    com.bytedance.geckox.C10026a.m20175b(r7)
                    if (r4 == 0) goto L_0x01e8
                    r4.mo18009a()
                L_0x01e8:
                    java.lang.Object[] r2 = new java.lang.Object[r6]
                    java.lang.String r3 = "所有channel更新结束"
                    r2[r5] = r3
                    java.lang.String r3 = "gecko-debug-tag"
                    com.bytedance.geckox.p611i.C10117b.m20388a(r3, r2)
                    throw r0
                L_0x01f4:
                    r2 = 0
                    r7 = r2
                L_0x01f6:
                    com.bytedance.geckox.C10026a.m20175b(r7)
                    if (r4 == 0) goto L_0x01fe
                    r4.mo18009a()
                L_0x01fe:
                    java.lang.String r0 = "gecko-debug-tag"
                    java.lang.Object[] r2 = new java.lang.Object[r6]
                    java.lang.String r3 = "所有channel更新结束"
                    r2[r5] = r3
                L_0x0206:
                    com.bytedance.geckox.p611i.C10117b.m20388a(r0, r2)
                    com.bytedance.geckox.a r0 = com.bytedance.geckox.C10026a.this
                    r0.mo18002a(r7)
                    com.bytedance.geckox.a r0 = com.bytedance.geckox.C10026a.this
                    r0.mo17998a()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.C10026a.C100271.run():void");
            }
        });
    }

    /* renamed from: b */
    public final List<Pair<String, C10112a>> mo18005b(List<String> list, C10105a aVar) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        File file = new File(this.f27248c, this.f27247b.mo18019a());
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                File file2 = new File(file, str);
                if (file2.isFile()) {
                    C10154d.m20480a(file2);
                }
                if (!file2.mkdirs()) {
                    if (!file2.isDirectory()) {
                        StringBuilder sb = new StringBuilder("can not create channel dir:");
                        sb.append(file2.getAbsolutePath());
                        throw new RuntimeException(sb.toString());
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(file2.getAbsolutePath());
                sb2.append(File.separator);
                sb2.append("update.lock");
                C10112a a = C10112a.m20382a(sb2.toString());
                if (a != null) {
                    arrayList.add(new Pair(str, a));
                }
            } catch (Exception e) {
                if (aVar != null) {
                    aVar.mo18076a(str, (Throwable) e);
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo18004a(Map<String, List<TargetChannel>> map, C10105a aVar) {
        mo18001a("default", null, map, aVar);
    }

    /* renamed from: a */
    public final void mo18001a(String str, Map<String, Map<String, Object>> map, Map<String, List<TargetChannel>> map2, C10105a aVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("groupType == null");
        } else if (!m20176b()) {
            throw new IllegalArgumentException("deployments keys not in local keys");
        } else if (m20174a(map2)) {
            Executor executor = this.f27247b.f27282c;
            final String str2 = str;
            final C10105a aVar2 = aVar;
            final Map<String, List<TargetChannel>> map3 = map2;
            C100282 r0 = new Runnable(null) {
                public final void run() {
                    C10033b bVar;
                    Object[] objArr;
                    String str;
                    C101297 r12;
                    C10117b.m20388a("gecko-debug-tag", "准备检查更新...", str2);
                    if (C10026a.this.f27247b.f27287h != null) {
                        C10033b bVar2 = C10026a.this.f27247b.f27287h.f27269b;
                        bVar2.mo18010a(C10026a.this.f27247b.f27287h, C10026a.this.f27247b.f27293n, C10026a.this.f27247b.f27285f);
                        bVar = bVar2;
                    } else {
                        bVar = null;
                    }
                    try {
                        C10105a aVar = aVar2;
                        File file = C10026a.this.f27248c;
                        C10044b bVar3 = C10026a.this.f27247b;
                        C10106b bVar4 = C10026a.this.f27246a;
                        Map map = null;
                        Map map2 = map3;
                        String str2 = str2;
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(C12390a.m24949a().mo23400a(C10100f.class).mo23401a(file, bVar3.f27286g).mo23399a(bVar4.mo18082a(C10100f.class)).mo23402b());
                        C12390a a = C12390a.m24949a().mo23400a(C10092d.class).mo23401a(bVar3, map, map2, aVar, str2);
                        C12379a[] aVarArr = new C12379a[2];
                        if (aVar == null) {
                            r12 = null;
                        } else {
                            r12 = new C12379a(aVar) {

                                /* renamed from: a */
                                final /* synthetic */ C10105a f27427a;

                                {
                                    this.f27427a = r1;
                                }

                                /* renamed from: b */
                                public final <T> void mo18098b(C12378b<T> bVar, C12382d dVar) {
                                    super.mo18098b(bVar, dVar);
                                    List<UpdatePackage> list = (List) bVar.mo23392b(C10092d.class);
                                    Map map = (Map) bVar.mo23390a(C10092d.class);
                                    HashMap hashMap = new HashMap();
                                    for (UpdatePackage updatePackage : list) {
                                        String accessKey = updatePackage.getAccessKey();
                                        List list2 = (List) hashMap.get(accessKey);
                                        if (list2 == null) {
                                            list2 = new ArrayList();
                                        }
                                        list2.add(updatePackage);
                                        hashMap.put(accessKey, list2);
                                    }
                                    this.f27427a.mo18078a(map, (Map<String, List<UpdatePackage>>) hashMap);
                                }

                                /* renamed from: a */
                                public final <T> void mo18096a(C12378b<T> bVar, C12382d dVar, Throwable th) {
                                    super.mo18096a(bVar, dVar, th);
                                    this.f27427a.mo18077a((Map) bVar.mo23390a(C10092d.class), th);
                                }
                            };
                        }
                        aVarArr[0] = r12;
                        aVarArr[1] = bVar4.mo18082a(C10092d.class);
                        arrayList.add(a.mo23399a((C12379a) new C12380b(aVarArr)).mo23402b());
                        arrayList.add(C12390a.m24949a().mo23400a(C10101g.class).mo23401a(bVar3.f27281b).mo23399a(C10122a.m20395a(aVar)).mo23402b());
                        C12397b bVar5 = new C12397b();
                        bVar5.mo23406a("branch_zip").mo23403a(C10122a.m20399b(aVar, file, bVar3, bVar4)).mo23403a(C12390a.m24949a().mo23400a(C12385f.class).mo23402b());
                        bVar5.mo23406a("branch_single_file").mo23403a(C10122a.m20396a(aVar, file, bVar3, bVar4)).mo23403a(C12390a.m24949a().mo23400a(C12385f.class).mo23402b());
                        bVar5.mo23406a("branch_myarchive_file").mo23403a(C10122a.m20402c(aVar, file, bVar3, bVar4)).mo23403a(C12390a.m24949a().mo23400a(C12385f.class).mo23402b());
                        arrayList.add(bVar5.mo23405a(C10065a.class));
                        arrayList.add(C12390a.m24949a().mo23400a(C10104j.class).mo23399a(C10122a.m20398b(aVar)).mo23402b());
                        C10117b.m20388a("gecko-debug-tag", "更新结束", C12381c.m24938a(arrayList, null).mo23391a(str2));
                        if (bVar != null) {
                            bVar.mo18009a();
                        }
                        str = "gecko-debug-tag";
                        objArr = new Object[]{"所有channel更新结束"};
                    } catch (Exception unused) {
                        if (bVar != null) {
                            bVar.mo18009a();
                        }
                        str = "gecko-debug-tag";
                        objArr = new Object[]{"所有channel更新结束"};
                    } catch (Throwable th) {
                        if (bVar != null) {
                            bVar.mo18009a();
                        }
                        C10117b.m20388a("gecko-debug-tag", "所有channel更新结束");
                        throw th;
                    }
                    C10117b.m20388a(str, objArr);
                    C10026a.this.mo17998a();
                }
            };
            executor.execute(r0);
        } else {
            throw new IllegalArgumentException("target keys not in deployments keys");
        }
    }
}
