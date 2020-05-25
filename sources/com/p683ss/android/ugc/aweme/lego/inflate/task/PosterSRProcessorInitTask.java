package com.p683ss.android.ugc.aweme.lego.inflate.task;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.experiment.CoverPosterProcessTypeExperiment;
import com.p683ss.android.ugc.aweme.feed.experiment.C30226f;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32811d;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.legoImp.task.C35989p;
import com.p683ss.posterprocessor2.PosterSRProcessor;
import com.p683ss.posterprocessor2.PosterSRProcessor.C51370a;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.ss.android.ugc.aweme.lego.inflate.task.PosterSRProcessorInitTask */
public final class PosterSRProcessorInitTask implements LegoTask {
    public static volatile boolean ALREADY_INITED;
    public static final C35899a Companion = new C35899a(null);
    public static volatile boolean NEED_POSTER_PROCESS;
    public static volatile int POSTER_SR_TYPE = -1;
    private boolean inited;
    private final int posterSrType;

    /* renamed from: com.ss.android.ugc.aweme.lego.inflate.task.PosterSRProcessorInitTask$a */
    public static final class C35899a {

        /* renamed from: com.ss.android.ugc.aweme.lego.inflate.task.PosterSRProcessorInitTask$a$a */
        static final class C35900a<T> implements C1710e<String> {

            /* renamed from: a */
            public static final C35900a f92120a = new C35900a();

            C35900a() {
            }

            public final /* synthetic */ void accept(Object obj) {
                String str = (String) obj;
                PosterSRProcessorInitTask.NEED_POSTER_PROCESS = false;
                PosterSRProcessor.f128456b.lock();
                if (C51370a.NN == PosterSRProcessor.f128460f && PosterSRProcessor.f128457c) {
                    PosterSRProcessor.nativeReleasePosterNNSRInstance(PosterSRProcessor.f128459e);
                    PosterSRProcessor.f128459e = 0;
                    PosterSRProcessor.f128457c = false;
                } else if (C51370a.VASR == PosterSRProcessor.f128460f) {
                    PosterSRProcessor.nativeReleasePosterASR();
                }
                PosterSRProcessor.f128460f = C51370a.NONE;
                PosterSRProcessor.f128456b.unlock();
                C35899a.m81068a(false);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.lego.inflate.task.PosterSRProcessorInitTask$a$b */
        static final class C35901b<T> implements C1710e<Throwable> {

            /* renamed from: a */
            public static final C35901b f92121a = new C35901b();

            C35901b() {
            }

            public final /* synthetic */ void accept(Object obj) {
                C32458a.m75148a((Throwable) obj);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.lego.inflate.task.PosterSRProcessorInitTask$a$c */
        static final class C35902c implements C32811d {

            /* renamed from: a */
            public static final C35902c f92122a = new C35902c();

            C35902c() {
            }

            public final void change(IESSettingsProxy iESSettingsProxy) {
                C52711k.m112240b(iESSettingsProxy, "settings");
                int i = 0;
                try {
                    Integer posterSrType = iESSettingsProxy.getPosterSrType();
                    if (posterSrType != null) {
                        i = posterSrType.intValue();
                    }
                } catch (Exception unused) {
                }
                StringBuilder sb = new StringBuilder("setting update type->");
                sb.append(i);
                C32458a.m75141a(4, "PosterSR", sb.toString());
                if (i == -1) {
                    StringBuilder sb2 = new StringBuilder("don't init cause cpu ");
                    sb2.append(C35989p.m81164a());
                    sb2.append(" is in black list");
                    C32458a.m75141a(4, "PosterSR", sb2.toString());
                    return;
                }
                C35899a.m81067a(i);
                PosterSRProcessorInitTask.Companion.mo74573c();
            }
        }

        private C35899a() {
        }

        /* renamed from: b */
        public static int m81070b() {
            return PosterSRProcessorInitTask.POSTER_SR_TYPE;
        }

        /* renamed from: a */
        public static boolean m81069a() {
            return PosterSRProcessorInitTask.ALREADY_INITED;
        }

        /* renamed from: c */
        public final void mo74573c() {
            if (m81070b() != -1 && !m81069a()) {
                if (m81070b() == 1 || C30226f.m70972a()) {
                    C35857a.m81001b().mo74526a(new PosterSRProcessorInitTask(m81070b())).mo74527a();
                } else {
                    C32458a.m75141a(4, "PosterSR", "not in whiteList and ab,so we shouldn't do posterSR");
                }
            }
        }

        /* renamed from: a */
        public static void m81067a(int i) {
            PosterSRProcessorInitTask.POSTER_SR_TYPE = i;
        }

        public /* synthetic */ C35899a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m81068a(boolean z) {
            PosterSRProcessorInitTask.ALREADY_INITED = z;
        }

        /* renamed from: a */
        public static String m81066a(C51370a aVar) {
            C52711k.m112240b(aVar, "type");
            switch (C35905a.f92130a[aVar.ordinal()]) {
                case 1:
                    return "NN";
                case 2:
                    return "VASR";
                default:
                    return "UNKNOWN";
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.inflate.task.PosterSRProcessorInitTask$b */
    static final class C35903b<T> implements C2205y<T> {

        /* renamed from: a */
        final /* synthetic */ PosterSRProcessorInitTask f92123a;

        /* renamed from: b */
        final /* synthetic */ Context f92124b;

        /* renamed from: c */
        final /* synthetic */ C52727e f92125c;

        /* renamed from: d */
        final /* synthetic */ long f92126d;

        C35903b(PosterSRProcessorInitTask posterSRProcessorInitTask, Context context, C52727e eVar, long j) {
            this.f92123a = posterSRProcessorInitTask;
            this.f92124b = context;
            this.f92125c = eVar;
            this.f92126d = j;
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x0100 A[Catch:{ Throwable -> 0x017c }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0116 A[Catch:{ Throwable -> 0x017c }] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x011e A[Catch:{ Throwable -> 0x017c }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void subscribe(p064c.p065a.C2204x<java.lang.Integer> r10) {
            /*
                r9 = this;
                java.lang.String r0 = "e"
                p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
                java.lang.String r0 = "PosterSR"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "start to init:"
                r1.<init>(r2)
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r2 = 4
                com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r2, r0, r1)
                android.content.Context r0 = r9.f92124b     // Catch:{ Throwable -> 0x017c }
                d.f.b.v$e r1 = r9.f92125c     // Catch:{ Throwable -> 0x017c }
                T r1 = r1.element     // Catch:{ Throwable -> 0x017c }
                com.ss.posterprocessor2.PosterSRProcessor$a r1 = (com.p683ss.posterprocessor2.PosterSRProcessor.C51370a) r1     // Catch:{ Throwable -> 0x017c }
                java.util.concurrent.locks.Lock r2 = com.p683ss.posterprocessor2.PosterSRProcessor.f128456b     // Catch:{ Throwable -> 0x017c }
                r2.lock()     // Catch:{ Throwable -> 0x017c }
                com.p683ss.posterprocessor2.PosterSRProcessor.f128460f = r1     // Catch:{ Throwable -> 0x017c }
                com.ss.posterprocessor2.PosterSRProcessor$a r2 = com.p683ss.posterprocessor2.PosterSRProcessor.C51370a.NN     // Catch:{ Throwable -> 0x017c }
                r3 = 1
                r4 = 0
                if (r2 != r1) goto L_0x00df
                boolean r2 = com.p683ss.posterprocessor2.PosterSRProcessor.f128457c     // Catch:{ Throwable -> 0x017c }
                if (r2 != 0) goto L_0x00df
                long r5 = com.p683ss.posterprocessor2.PosterSRProcessor.f128459e     // Catch:{ Throwable -> 0x017c }
                r7 = 0
                int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r2 != 0) goto L_0x00df
                com.p683ss.posterprocessor2.PosterSRProcessor.f128457c = r3     // Catch:{ Throwable -> 0x017c }
                com.p683ss.posterprocessor2.PosterSRProcessor.f128460f = r1     // Catch:{ Throwable -> 0x017c }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x017c }
                r1.<init>()     // Catch:{ Throwable -> 0x017c }
                r2 = 0
                java.io.File r2 = r0.getExternalFilesDir(r2)     // Catch:{ Throwable -> 0x017c }
                java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x017c }
                r1.append(r2)     // Catch:{ Throwable -> 0x017c }
                java.lang.String r2 = "/posternnarchs/"
                r1.append(r2)     // Catch:{ Throwable -> 0x017c }
                java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x017c }
                com.p683ss.posterprocessor2.PosterSRProcessor.f128461g = r1     // Catch:{ Throwable -> 0x017c }
                java.lang.String r1 = "arch"
                com.p683ss.posterprocessor2.PosterSRProcessor.f128462h = r1     // Catch:{ Throwable -> 0x017c }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x017c }
                r1.<init>()     // Catch:{ Throwable -> 0x017c }
                java.lang.String r2 = com.p683ss.posterprocessor2.PosterSRProcessor.f128462h     // Catch:{ Throwable -> 0x017c }
                r1.append(r2)     // Catch:{ Throwable -> 0x017c }
                java.lang.String r2 = "12.bytenn"
                r1.append(r2)     // Catch:{ Throwable -> 0x017c }
                java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x017c }
                com.p683ss.posterprocessor2.PosterSRProcessor.m110480a(r0, r1)     // Catch:{ Throwable -> 0x017c }
                long r0 = com.p683ss.posterprocessor2.PosterSRProcessor.nativeCreatePosterNNSRInstance()     // Catch:{ Throwable -> 0x017c }
                com.p683ss.posterprocessor2.PosterSRProcessor.f128459e = r0     // Catch:{ Throwable -> 0x017c }
                long r0 = com.p683ss.posterprocessor2.PosterSRProcessor.f128459e     // Catch:{ Throwable -> 0x017c }
                int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x008b
                com.p683ss.posterprocessor2.PosterSRProcessor.f128457c = r4     // Catch:{ Throwable -> 0x017c }
                com.ss.posterprocessor2.PosterSRProcessor$a r0 = com.p683ss.posterprocessor2.PosterSRProcessor.C51370a.VASR     // Catch:{ Throwable -> 0x017c }
                com.p683ss.posterprocessor2.PosterSRProcessor.f128460f = r0     // Catch:{ Throwable -> 0x017c }
                goto L_0x00df
            L_0x008b:
                long r0 = com.p683ss.posterprocessor2.PosterSRProcessor.f128459e     // Catch:{ Throwable -> 0x017c }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x017c }
                r2.<init>()     // Catch:{ Throwable -> 0x017c }
                java.lang.String r5 = com.p683ss.posterprocessor2.PosterSRProcessor.f128461g     // Catch:{ Throwable -> 0x017c }
                r2.append(r5)     // Catch:{ Throwable -> 0x017c }
                java.lang.String r5 = com.p683ss.posterprocessor2.PosterSRProcessor.f128462h     // Catch:{ Throwable -> 0x017c }
                r2.append(r5)     // Catch:{ Throwable -> 0x017c }
                java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x017c }
                r5 = 360(0x168, float:5.04E-43)
                r6 = 640(0x280, float:8.97E-43)
                int r0 = com.p683ss.posterprocessor2.PosterSRProcessor.nativeInitPosterNNSR(r0, r2, r5, r6)     // Catch:{ Throwable -> 0x017c }
                if (r0 == 0) goto L_0x00b8
                long r0 = com.p683ss.posterprocessor2.PosterSRProcessor.f128459e     // Catch:{ Throwable -> 0x017c }
                com.p683ss.posterprocessor2.PosterSRProcessor.nativeReleasePosterNNSRInstance(r0)     // Catch:{ Throwable -> 0x017c }
                com.p683ss.posterprocessor2.PosterSRProcessor.f128459e = r7     // Catch:{ Throwable -> 0x017c }
                com.p683ss.posterprocessor2.PosterSRProcessor.f128457c = r4     // Catch:{ Throwable -> 0x017c }
                com.ss.posterprocessor2.PosterSRProcessor$a r0 = com.p683ss.posterprocessor2.PosterSRProcessor.C51370a.VASR     // Catch:{ Throwable -> 0x017c }
                com.p683ss.posterprocessor2.PosterSRProcessor.f128460f = r0     // Catch:{ Throwable -> 0x017c }
                goto L_0x00df
            L_0x00b8:
                long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x017c }
                long r5 = com.p683ss.posterprocessor2.PosterSRProcessor.f128459e     // Catch:{ Throwable -> 0x017c }
                com.p683ss.posterprocessor2.PosterSRProcessor.nativedoSpeedTest(r5)     // Catch:{ Throwable -> 0x017c }
                long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x017c }
                r2 = 0
                long r5 = r5 - r0
                long r0 = com.p683ss.posterprocessor2.PosterSRProcessor.f128458d     // Catch:{ Throwable -> 0x017c }
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 < 0) goto L_0x00cf
                r0 = 0
                goto L_0x00d0
            L_0x00cf:
                r0 = 1
            L_0x00d0:
                if (r0 != 0) goto L_0x00df
                long r0 = com.p683ss.posterprocessor2.PosterSRProcessor.f128459e     // Catch:{ Throwable -> 0x017c }
                com.p683ss.posterprocessor2.PosterSRProcessor.nativeReleasePosterNNSRInstance(r0)     // Catch:{ Throwable -> 0x017c }
                com.p683ss.posterprocessor2.PosterSRProcessor.f128459e = r7     // Catch:{ Throwable -> 0x017c }
                com.p683ss.posterprocessor2.PosterSRProcessor.f128457c = r4     // Catch:{ Throwable -> 0x017c }
                com.ss.posterprocessor2.PosterSRProcessor$a r0 = com.p683ss.posterprocessor2.PosterSRProcessor.C51370a.VASR     // Catch:{ Throwable -> 0x017c }
                com.p683ss.posterprocessor2.PosterSRProcessor.f128460f = r0     // Catch:{ Throwable -> 0x017c }
            L_0x00df:
                com.ss.posterprocessor2.PosterSRProcessor$a r0 = com.p683ss.posterprocessor2.PosterSRProcessor.C51370a.VASR     // Catch:{ Throwable -> 0x017c }
                com.ss.posterprocessor2.PosterSRProcessor$a r1 = com.p683ss.posterprocessor2.PosterSRProcessor.f128460f     // Catch:{ Throwable -> 0x017c }
                if (r0 != r1) goto L_0x010e
                long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x017c }
                int r2 = com.p683ss.posterprocessor2.PosterSRProcessor.nativedoASRSpeedTest()     // Catch:{ Throwable -> 0x017c }
                if (r2 == 0) goto L_0x00f1
            L_0x00ef:
                r3 = 0
                goto L_0x00fe
            L_0x00f1:
                long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x017c }
                r2 = 0
                long r5 = r5 - r0
                long r0 = com.p683ss.posterprocessor2.PosterSRProcessor.f128458d     // Catch:{ Throwable -> 0x017c }
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 < 0) goto L_0x00fe
                goto L_0x00ef
            L_0x00fe:
                if (r3 != 0) goto L_0x010e
                com.ss.posterprocessor2.PosterSRProcessor$a r0 = com.p683ss.posterprocessor2.PosterSRProcessor.C51370a.NONE     // Catch:{ Throwable -> 0x017c }
                com.p683ss.posterprocessor2.PosterSRProcessor.f128460f = r0     // Catch:{ Throwable -> 0x017c }
                com.p683ss.posterprocessor2.PosterSRProcessor.nativeReleasePosterASR()     // Catch:{ Throwable -> 0x017c }
                java.util.concurrent.locks.Lock r0 = com.p683ss.posterprocessor2.PosterSRProcessor.f128456b     // Catch:{ Throwable -> 0x017c }
                r0.unlock()     // Catch:{ Throwable -> 0x017c }
                r0 = -4
                goto L_0x0114
            L_0x010e:
                java.util.concurrent.locks.Lock r0 = com.p683ss.posterprocessor2.PosterSRProcessor.f128456b     // Catch:{ Throwable -> 0x017c }
                r0.unlock()     // Catch:{ Throwable -> 0x017c }
                r0 = 0
            L_0x0114:
                if (r0 != 0) goto L_0x011e
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x017c }
                r10.mo6282a(r0)     // Catch:{ Throwable -> 0x017c }
                goto L_0x0180
            L_0x011e:
                d.f.b.v$e r1 = r9.f92125c     // Catch:{ Throwable -> 0x017c }
                T r1 = r1.element     // Catch:{ Throwable -> 0x017c }
                com.ss.posterprocessor2.PosterSRProcessor$a r1 = (com.p683ss.posterprocessor2.PosterSRProcessor.C51370a) r1     // Catch:{ Throwable -> 0x017c }
                com.ss.posterprocessor2.PosterSRProcessor$a r2 = com.p683ss.posterprocessor2.PosterSRProcessor.C51370a.NN     // Catch:{ Throwable -> 0x017c }
                if (r1 != r2) goto L_0x0163
                boolean r1 = com.p683ss.android.ugc.aweme.feed.experiment.C30226f.m70972a()     // Catch:{ Throwable -> 0x017c }
                if (r1 == 0) goto L_0x0163
                com.ss.android.ugc.aweme.lego.inflate.task.PosterSRProcessorInitTask r1 = r9.f92123a     // Catch:{ Throwable -> 0x017c }
                long r2 = r9.f92126d     // Catch:{ Throwable -> 0x017c }
                d.f.b.v$e r5 = r9.f92125c     // Catch:{ Throwable -> 0x017c }
                T r5 = r5.element     // Catch:{ Throwable -> 0x017c }
                com.ss.posterprocessor2.PosterSRProcessor$a r5 = (com.p683ss.posterprocessor2.PosterSRProcessor.C51370a) r5     // Catch:{ Throwable -> 0x017c }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x017c }
                java.lang.String r7 = "NN fail:"
                r6.<init>(r7)     // Catch:{ Throwable -> 0x017c }
                r6.append(r0)     // Catch:{ Throwable -> 0x017c }
                java.lang.String r0 = r6.toString()     // Catch:{ Throwable -> 0x017c }
                r1.reportFailEvent(r2, r5, r0)     // Catch:{ Throwable -> 0x017c }
                com.p683ss.android.ugc.aweme.lego.inflate.task.PosterSRProcessorInitTask.C35899a.m81067a(r4)     // Catch:{ Throwable -> 0x017c }
                com.ss.android.ugc.aweme.lego.a$f r0 = com.p683ss.android.ugc.aweme.lego.C35857a.m81001b()     // Catch:{ Throwable -> 0x017c }
                com.ss.android.ugc.aweme.lego.inflate.task.PosterSRProcessorInitTask r1 = new com.ss.android.ugc.aweme.lego.inflate.task.PosterSRProcessorInitTask     // Catch:{ Throwable -> 0x017c }
                int r2 = com.p683ss.android.ugc.aweme.lego.inflate.task.PosterSRProcessorInitTask.C35899a.m81070b()     // Catch:{ Throwable -> 0x017c }
                r1.<init>(r2)     // Catch:{ Throwable -> 0x017c }
                com.ss.android.ugc.aweme.lego.LegoTask r1 = (com.p683ss.android.ugc.aweme.lego.LegoTask) r1     // Catch:{ Throwable -> 0x017c }
                com.ss.android.ugc.aweme.lego.a$f r0 = r0.mo74526a(r1)     // Catch:{ Throwable -> 0x017c }
                r0.mo74527a()     // Catch:{ Throwable -> 0x017c }
                goto L_0x0180
            L_0x0163:
                com.ss.android.ugc.aweme.lego.inflate.task.b r1 = new com.ss.android.ugc.aweme.lego.inflate.task.b     // Catch:{ Throwable -> 0x017c }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x017c }
                java.lang.String r3 = "init error,errorCode->"
                r2.<init>(r3)     // Catch:{ Throwable -> 0x017c }
                r2.append(r0)     // Catch:{ Throwable -> 0x017c }
                java.lang.String r0 = r2.toString()     // Catch:{ Throwable -> 0x017c }
                r1.<init>(r0)     // Catch:{ Throwable -> 0x017c }
                java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ Throwable -> 0x017c }
                r10.mo6274a(r1)     // Catch:{ Throwable -> 0x017c }
                goto L_0x0180
            L_0x017c:
                r0 = move-exception
                r10.mo6274a(r0)
            L_0x0180:
                r10.mo6273a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.lego.inflate.task.PosterSRProcessorInitTask.C35903b.subscribe(c.a.x):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.inflate.task.PosterSRProcessorInitTask$c */
    public static final class C35904c implements C1674ab<Integer> {

        /* renamed from: a */
        final /* synthetic */ PosterSRProcessorInitTask f92127a;

        /* renamed from: b */
        final /* synthetic */ long f92128b;

        /* renamed from: c */
        final /* synthetic */ C52727e f92129c;

        public final void onComplete() {
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            StringBuilder sb = new StringBuilder("init error,some error,");
            sb.append(th);
            C32458a.m75141a(6, "PosterSR", sb.toString());
            String stackTraceString = Log.getStackTraceString(th);
            if (stackTraceString.length() > 500) {
                C52711k.m112236a((Object) stackTraceString, "stackTraceString");
                if (stackTraceString != null) {
                    stackTraceString = stackTraceString.substring(0, 500);
                    C52711k.m112236a((Object) stackTraceString, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.String");
                }
            }
            PosterSRProcessorInitTask posterSRProcessorInitTask = this.f92127a;
            long j = this.f92128b;
            C51370a aVar = (C51370a) this.f92129c.element;
            C52711k.m112236a((Object) stackTraceString, "stackTraceString");
            posterSRProcessorInitTask.reportFailEvent(j, aVar, stackTraceString);
        }

        public final /* synthetic */ void onNext(Object obj) {
            int intValue = ((Number) obj).intValue();
            boolean z = true;
            C35899a.m81068a(true);
            if (intValue != 0) {
                z = false;
            }
            PosterSRProcessorInitTask.NEED_POSTER_PROCESS = z;
            if (!z) {
                StringBuilder sb = new StringBuilder("init error,errorCode->");
                sb.append(intValue);
                C32458a.m75141a(4, "PosterSR", sb.toString());
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f92128b;
            StringBuilder sb2 = new StringBuilder("PosterSRProcessorInitTask->init end->");
            sb2.append(PosterSRProcessorInitTask.NEED_POSTER_PROCESS);
            sb2.append(",init time->");
            sb2.append(elapsedRealtime);
            C32458a.m75141a(4, "PosterSR", sb2.toString());
            C51370a a = PosterSRProcessor.m110479a();
            C52711k.m112236a((Object) a, "PosterSRProcessor.getInitProcessorType()");
            C26890h.m65011a("cover_image_init", new C23089d().mo47827a("init_duration", elapsedRealtime).mo47829a("init_status", "success").mo47829a("cpu_model", C35989p.m81164a()).mo47829a("init_model", C35899a.m81066a(a)).f61491a);
        }

        C35904c(PosterSRProcessorInitTask posterSRProcessorInitTask, long j, C52727e eVar) {
            this.f92127a = posterSRProcessorInitTask;
            this.f92128b = j;
            this.f92129c = eVar;
        }
    }

    public static final String getModelName(C51370a aVar) {
        return C35899a.m81066a(aVar);
    }

    private static final void maybeInit() {
        Companion.mo74573c();
    }

    public final boolean getInited() {
        return this.inited;
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public static final void hotStartInit() {
        Companion.mo74573c();
    }

    public static final C32811d watcher() {
        return C35902c.f92122a;
    }

    public static final void destroy() {
        C35899a aVar = Companion;
        if (!C35899a.m81069a()) {
            C32458a.m75141a(4, "PosterSR", "postSR not init,so do nothing");
        } else {
            C2201v.m6614b("").mo6514a(C2168a.m6521b()).mo6505a((C1710e<? super T>) C35900a.f92120a, (C1710e<? super Throwable>) C35901b.f92121a);
        }
    }

    public final void setInited(boolean z) {
        this.inited = z;
    }

    public PosterSRProcessorInitTask(int i) {
        this.posterSrType = i;
    }

    public final void run(Context context) {
        T t;
        C52711k.m112240b(context, "context");
        if (this.posterSrType == -1) {
            C32458a.m75141a(6, "PosterSR", "return cause blackList,should never be here");
            return;
        }
        StringBuilder sb = new StringBuilder("PosterSRProcessorInitTask->init start.");
        sb.append(Thread.currentThread());
        C32458a.m75141a(4, "PosterSR", sb.toString());
        C52727e eVar = new C52727e();
        if (this.posterSrType != 1) {
            t = C51370a.VASR;
        } else {
            t = C51370a.NN;
        }
        eVar.element = t;
        if (C10181b.m20511a().mo18168a(CoverPosterProcessTypeExperiment.class, true, "cover_poster_model_type", 31744, 1) != 1) {
            C32458a.m75141a(4, "PosterSR", "超分兜底开关，close");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C35903b bVar = new C35903b(this, context, eVar, elapsedRealtime);
        C2201v.m6601a((C2205y<T>) bVar).mo6314a((C1674ab<? super T>) new C35904c<Object>(this, elapsedRealtime, eVar));
    }

    public final void reportFailEvent(long j, C51370a aVar, String str) {
        C26890h.m65011a("cover_image_init", new C23089d().mo47827a("init_duration", SystemClock.elapsedRealtime() - j).mo47829a("init_status", "fail").mo47829a("cpu_model", C35989p.m81164a()).mo47829a("init_model", C35899a.m81066a(aVar)).mo47829a("error_stack", str).f61491a);
    }
}
