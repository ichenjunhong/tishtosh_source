package com.google.android.play.core.p1053e.p1055b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.p1051c.C17253ac;
import com.google.android.play.core.p1051c.C17259ai;
import com.google.android.play.core.p1051c.C17280bb;
import com.google.android.play.core.p1051c.C17291d;
import com.google.android.play.core.p1051c.C17295h;
import com.google.android.play.core.p1052d.C17315a;
import com.google.android.play.core.p1053e.C17318a;
import com.google.android.play.core.p1053e.C17338d;
import com.google.android.play.core.p1053e.C17342g;
import com.google.android.play.core.p1053e.C17343h;
import com.google.android.play.core.p1053e.C17359x;
import com.google.android.play.core.p1053e.C17361z;
import com.google.android.play.core.p1056f.C17365d;
import com.google.android.play.core.p1056f.C17368f;
import com.google.android.play.core.splitcompat.C17384b;
import com.google.android.play.core.splitcompat.C17386d;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.e.b.a */
public final class C17330a implements C17338d {

    /* renamed from: a */
    static final long f48820a = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: e */
    static final AtomicReference<C17342g> f48821e = new AtomicReference<>(C17342g.m42462a(0, 0, 0, 0, 0, new ArrayList(), new ArrayList()));

    /* renamed from: b */
    final Context f48822b;

    /* renamed from: c */
    final C17280bb<C17342g> f48823c;

    /* renamed from: d */
    final Executor f48824d;

    /* renamed from: f */
    final Set<String> f48825f;

    /* renamed from: g */
    final AtomicBoolean f48826g;

    /* renamed from: h */
    private final Handler f48827h;

    /* renamed from: i */
    private final C17291d f48828i;

    /* renamed from: j */
    private final C17361z f48829j;

    /* renamed from: k */
    private final C17259ai f48830k;

    /* renamed from: l */
    private final C17331a f48831l;

    /* renamed from: m */
    private final File f48832m;

    /* renamed from: n */
    private final Set<String> f48833n;

    /* renamed from: com.google.android.play.core.e.b.a$a */
    interface C17331a {
        C17331a() {
        }
    }

    C17330a(Context context, File file) throws IOException, NameNotFoundException {
        this(context, file, new C17359x(), new C17361z(context, context.getPackageName()), new C17259ai(context), new C17253ac(context, new C17386d(context), new C17295h()), new C17331a(), C17384b.m42579a());
    }

    private C17330a(Context context, File file, C17359x xVar, C17361z zVar, C17259ai aiVar, C17253ac acVar, C17331a aVar, Executor executor) throws IOException, NameNotFoundException {
        this.f48827h = new Handler(Looper.getMainLooper());
        this.f48825f = Collections.synchronizedSet(new HashSet());
        this.f48833n = Collections.synchronizedSet(new HashSet());
        this.f48826g = new AtomicBoolean(false);
        this.f48831l = aVar;
        this.f48823c = new C17280bb<>();
        this.f48822b = context;
        this.f48832m = file;
        this.f48829j = zVar;
        this.f48830k = aiVar;
        C17386d dVar = new C17386d(context);
        this.f48824d = executor;
        C17291d dVar2 = new C17291d(context, executor, acVar, dVar, xVar);
        this.f48828i = dVar2;
    }

    /* renamed from: a */
    static String m42426a(File file) {
        if (file.getName().endsWith(".apk")) {
            return file.getName().substring(0, file.getName().length() - 4).replace("base-", "config.").replace("-", ".config.").replace(".config.master", "");
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    /* renamed from: a */
    static String m42427a(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    /* renamed from: a */
    private final void m42428a(int i, int i2) {
        m42429a(i, i2, null, null, null, null);
    }

    /* renamed from: a */
    private final void m42429a(int i, int i2, Long l, Long l2, List<String> list, Integer num) {
        C17342g gVar = (C17342g) f48821e.get();
        f48821e.set(C17342g.m42462a((num == null ? Integer.valueOf(gVar.mo33633a()) : num).intValue(), i, i2, (l == null ? Long.valueOf(gVar.mo33636d()) : l).longValue(), (l2 == null ? Long.valueOf(gVar.mo33637e()) : l2).longValue(), list == null ? gVar.mo33640h() : list, new ArrayList(mo33621b())));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m42432b(int i, int i2) {
        m42428a(i, i2);
        m42434c();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m42433b(int i, int i2, Long l, Long l2, List<String> list, Integer num) {
        m42429a(i, 0, l, l2, list, num);
        m42434c();
    }

    /* renamed from: c */
    private final void m42434c() {
        this.f48827h.post(new C17333c(this));
    }

    /* renamed from: a */
    public final C17365d<Void> mo33615a(int i) {
        int b = ((C17342g) f48821e.get()).mo33634b();
        if (i != ((C17342g) f48821e.get()).mo33633a() || b != 1) {
            return C17368f.m42533a((Exception) new C17318a(-3));
        }
        m42432b(7, ((C17342g) f48821e.get()).mo33635c());
        return C17368f.m42534a(null);
    }

    /* renamed from: a */
    public final Set<String> mo33617a() {
        return new HashSet(this.f48833n);
    }

    /* renamed from: a */
    public final void mo33618a(C17343h hVar) {
        this.f48823c.mo33582a((C17315a<StateT>) hVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33623a(List<Intent> list, List<String> list2, long j, boolean z) {
        C17291d dVar = this.f48828i;
        C17335e eVar = new C17335e(this, list2, j, z, list);
        dVar.mo33593b(list, eVar);
    }

    /* renamed from: a */
    public final boolean mo33619a(C17342g gVar, Activity activity, int i) throws SendIntentException {
        return false;
    }

    /* renamed from: b */
    public final C17365d<C17342g> mo33620b(int i) {
        return C17368f.m42534a((C17342g) f48821e.get());
    }

    /* renamed from: b */
    public final Set<String> mo33621b() {
        return new HashSet(this.f48825f);
    }

    /* renamed from: b */
    public final void mo33622b(C17343h hVar) {
        this.f48823c.mo33584b(hVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01dc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.p1056f.C17365d<java.lang.Integer> mo33616a(com.google.android.play.core.p1053e.C17340f r22) {
        /*
            r21 = this;
            r7 = r21
            r8 = r22
            java.util.concurrent.atomic.AtomicReference<com.google.android.play.core.e.g> r0 = f48821e
            java.lang.Object r0 = r0.get()
            com.google.android.play.core.e.g r0 = (com.google.android.play.core.p1053e.C17342g) r0
            int r0 = r0.mo33634b()
            r9 = 6
            r11 = 1
            if (r0 == 0) goto L_0x001f
            r1 = 5
            if (r0 == r1) goto L_0x001f
            if (r0 == r9) goto L_0x001f
            r1 = 7
            if (r0 != r1) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            r12 = -1
            if (r0 != 0) goto L_0x0030
            r7.m42428a(r9, r12)
            com.google.android.play.core.e.a r0 = new com.google.android.play.core.e.a
            r0.<init>(r12)
            com.google.android.play.core.f.d r0 = com.google.android.play.core.p1056f.C17368f.m42533a(r0)
            return r0
        L_0x0030:
            java.util.concurrent.atomic.AtomicReference<com.google.android.play.core.e.g> r0 = f48821e
            java.lang.Object r0 = r0.get()
            com.google.android.play.core.e.g r0 = (com.google.android.play.core.p1053e.C17342g) r0
            int r0 = r0.mo33633a()
            int r13 = r0 + 1
            r1 = 0
            r2 = 0
            r14 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r14)
            r4 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r0 = r21
            r0.m42433b(r1, r2, r3, r4, r5, r6)
            r1 = 1
            java.lang.Long r3 = java.lang.Long.valueOf(r14)
            java.util.List<java.lang.String> r5 = r8.f48846a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r0.m42433b(r1, r2, r3, r4, r5, r6)
            java.util.List<java.util.Locale> r0 = r8.f48847b
            java.util.Iterator r0 = r0.iterator()
        L_0x0069:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x007f
            java.lang.Object r1 = r0.next()
            java.util.Locale r1 = (java.util.Locale) r1
            java.util.Set<java.lang.String> r2 = r7.f48833n
            java.lang.String r1 = r1.getLanguage()
            r2.add(r1)
            goto L_0x0069
        L_0x007f:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.io.File r1 = r7.f48832m
            java.io.File[] r1 = r1.listFiles()
            if (r1 != 0) goto L_0x009f
            r0 = -5
            r7.m42432b(r9, r0)
            com.google.android.play.core.e.a r1 = new com.google.android.play.core.e.a
            r1.<init>(r0)
            com.google.android.play.core.f.d r0 = com.google.android.play.core.p1056f.C17368f.m42533a(r1)
            return r0
        L_0x009f:
            int r2 = r1.length
            r4 = r14
            r3 = 0
        L_0x00a2:
            if (r3 >= r2) goto L_0x01fb
            r14 = r1[r3]
            java.lang.String r15 = m42426a(r14)
            java.lang.String r9 = m42427a(r15)
            java.util.List<java.lang.String> r12 = r8.f48846a
            boolean r9 = r12.contains(r9)
            if (r9 == 0) goto L_0x017d
            java.lang.String r9 = m42427a(r15)
            java.util.HashSet r12 = new java.util.HashSet
            com.google.android.play.core.c.ai r10 = r7.f48830k
            java.util.List r10 = r10.mo33544a()
            r12.<init>(r10)
            com.google.android.play.core.e.z r10 = r7.f48829j
            com.google.android.play.core.e.t r10 = r10.mo33655c()
            r17 = r1
            java.lang.String[] r1 = new java.lang.String[r11]
            r16 = 0
            r1[r16] = r9
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.Map r1 = r10.mo33650a(r1)
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.Collection r10 = r1.values()
            java.util.Iterator r10 = r10.iterator()
        L_0x00e8:
            boolean r18 = r10.hasNext()
            if (r18 == 0) goto L_0x00fb
            java.lang.Object r18 = r10.next()
            r11 = r18
            java.util.Set r11 = (java.util.Set) r11
            r9.addAll(r11)
            r11 = 1
            goto L_0x00e8
        L_0x00fb:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.util.Iterator r11 = r12.iterator()
        L_0x0104:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0133
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            r19 = r2
            java.lang.String r2 = "_"
            boolean r2 = r12.contains(r2)
            if (r2 == 0) goto L_0x0127
            java.lang.String r2 = "_"
            r20 = r11
            r11 = -1
            java.lang.String[] r2 = r12.split(r2, r11)
            r12 = 0
            r2 = r2[r12]
            goto L_0x012b
        L_0x0127:
            r20 = r11
            r11 = -1
            r2 = r12
        L_0x012b:
            r10.add(r2)
            r2 = r19
            r11 = r20
            goto L_0x0104
        L_0x0133:
            r19 = r2
            r11 = -1
            java.util.Set<java.lang.String> r2 = r7.f48833n
            r10.addAll(r2)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0148:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L_0x0169
            java.lang.Object r12 = r1.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r11 = r12.getKey()
            boolean r11 = r10.contains(r11)
            if (r11 == 0) goto L_0x0167
            java.lang.Object r11 = r12.getValue()
            java.util.Collection r11 = (java.util.Collection) r11
            r2.addAll(r11)
        L_0x0167:
            r11 = -1
            goto L_0x0148
        L_0x0169:
            boolean r1 = r9.contains(r15)
            if (r1 == 0) goto L_0x0178
            boolean r1 = r2.contains(r15)
            if (r1 == 0) goto L_0x0176
            goto L_0x0178
        L_0x0176:
            r1 = 0
            goto L_0x0179
        L_0x0178:
            r1 = 1
        L_0x0179:
            if (r1 == 0) goto L_0x0181
            r1 = 1
            goto L_0x0182
        L_0x017d:
            r17 = r1
            r19 = r2
        L_0x0181:
            r1 = 0
        L_0x0182:
            if (r1 != 0) goto L_0x01dc
            java.util.List<java.util.Locale> r1 = r8.f48847b
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Set<java.lang.String> r9 = r7.f48825f
            r2.<init>(r9)
            r9 = 2
            java.lang.String[] r9 = new java.lang.String[r9]
            java.lang.String r10 = ""
            r16 = 0
            r9[r16] = r10
            java.lang.String r10 = "base"
            r12 = 1
            r9[r12] = r10
            java.util.List r9 = java.util.Arrays.asList(r9)
            r2.addAll(r9)
            com.google.android.play.core.e.z r9 = r7.f48829j
            com.google.android.play.core.e.t r9 = r9.mo33655c()
            java.util.Map r2 = r9.mo33650a(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x01b0:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x01d8
            java.lang.Object r9 = r1.next()
            java.util.Locale r9 = (java.util.Locale) r9
            java.lang.String r10 = r9.getLanguage()
            boolean r10 = r2.containsKey(r10)
            if (r10 == 0) goto L_0x01b0
            java.lang.String r9 = r9.getLanguage()
            java.lang.Object r9 = r2.get(r9)
            java.util.Set r9 = (java.util.Set) r9
            boolean r9 = r9.contains(r15)
            if (r9 == 0) goto L_0x01b0
            r1 = 1
            goto L_0x01d9
        L_0x01d8:
            r1 = 0
        L_0x01d9:
            if (r1 == 0) goto L_0x01ee
            goto L_0x01df
        L_0x01dc:
            r12 = 1
            r16 = 0
        L_0x01df:
            long r1 = r14.getTotalSpace()
            long r4 = r4 + r1
            java.lang.String r1 = m42426a(r14)
            r0.add(r1)
            r6.add(r14)
        L_0x01ee:
            int r3 = r3 + 1
            r1 = r17
            r2 = r19
            r9 = 6
            r11 = 1
            r12 = -1
            r14 = 0
            goto L_0x00a2
        L_0x01fb:
            java.util.HashSet r1 = new java.util.HashSet
            java.util.List<java.lang.String> r2 = r8.f48846a
            r1.<init>(r2)
            boolean r0 = r0.containsAll(r1)
            if (r0 != 0) goto L_0x0217
            r0 = -2
            r1 = 6
            r7.m42432b(r1, r0)
            com.google.android.play.core.e.a r1 = new com.google.android.play.core.e.a
            r1.<init>(r0)
            com.google.android.play.core.f.d r0 = com.google.android.play.core.p1056f.C17368f.m42533a(r1)
            return r0
        L_0x0217:
            r1 = 1
            r2 = 0
            r9 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.util.List<java.lang.String> r5 = r8.f48846a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            r0 = r21
            r9 = r6
            r6 = r8
            r0.m42433b(r1, r2, r3, r4, r5, r6)
            java.util.concurrent.Executor r0 = r7.f48824d
            com.google.android.play.core.e.b.d r1 = new com.google.android.play.core.e.b.d
            r1.<init>(r7, r9)
            r0.execute(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            com.google.android.play.core.f.d r0 = com.google.android.play.core.p1056f.C17368f.m42534a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p1053e.p1055b.C17330a.mo33616a(com.google.android.play.core.e.f):com.google.android.play.core.f.d");
    }
}
