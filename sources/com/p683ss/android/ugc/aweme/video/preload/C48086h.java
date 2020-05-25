package com.p683ss.android.ugc.aweme.video.preload;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.bytedance.p829r.C12662c;
import com.bytedance.p829r.C12665e;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1340am.C22572b;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayeAbUserHttp2Exp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayerAbUseLastIf403Exp;
import com.p683ss.android.ugc.aweme.setting.model.MLModel;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import com.p683ss.android.ugc.aweme.video.C47985af;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.video.experiment.C48017a;
import com.p683ss.android.ugc.aweme.video.experiment.GatherModeExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.PlayUse2UrlExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.UsePrivateCachePathExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.UseTTNetExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.UseVideoCacheHttpDnsExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.VideoCacheMaxCacheSizeExperiment;
import com.p683ss.android.ugc.aweme.video.p2394c.C48005c;
import com.p683ss.android.ugc.aweme.video.preload.experiment.CheckVideoCacheRequestHeaderExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.PlayerPreloadLazyGetUrlsExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.PreloadLocalCachePathVideoPlayExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheAutoAdjustPreloadMaxExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheWriteAsynchronousExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoDownloadSpeedCostTimeExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoNetworkSpeedAlgorithmExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoSpeedQueueSizeExperiment;
import com.p683ss.android.ugc.p2454f.C48918e;
import com.p683ss.android.ugc.playerkit.C50100a;
import com.p683ss.android.ugc.playerkit.p2493b.C50107b;
import com.p683ss.android.ugc.playerkit.session.C50122a;
import com.toutiao.proxyserver.C51802ac;
import com.toutiao.proxyserver.C51841g;
import com.toutiao.proxyserver.C51843h;
import com.toutiao.proxyserver.C51843h.C51853a;
import com.toutiao.proxyserver.C51864l;
import com.toutiao.proxyserver.C51865m;
import com.toutiao.proxyserver.C51866n;
import com.toutiao.proxyserver.C51880o;
import com.toutiao.proxyserver.C51881p;
import com.toutiao.proxyserver.C51882q;
import com.toutiao.proxyserver.C51883r;
import com.toutiao.proxyserver.C51895s;
import com.toutiao.proxyserver.C51897t;
import com.toutiao.proxyserver.C51914w;
import com.toutiao.proxyserver.p2609a.C51796a;
import com.toutiao.proxyserver.p2609a.C51797b;
import com.toutiao.proxyserver.p2609a.C51798c;
import com.toutiao.proxyserver.p2610b.C51807a;
import com.toutiao.proxyserver.p2610b.C51808b;
import com.toutiao.proxyserver.p2610b.C51809c;
import com.toutiao.proxyserver.p2612d.C51818a;
import com.toutiao.proxyserver.p2612d.C51819b;
import com.toutiao.proxyserver.p2612d.C51820c;
import com.toutiao.proxyserver.p2613e.C51826c;
import com.toutiao.proxyserver.p2614f.C51835a;
import com.toutiao.proxyserver.p2614f.C51838d;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.C1663a;
import p064c.p065a.C1675ac;
import p064c.p065a.C2177l;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p093k.C2168a;
import p064c.p065a.p094l.C2180b;
import p064c.p065a.p095m.C2191a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.video.preload.h */
public class C48086h implements C48073c {

    /* renamed from: a */
    public static final boolean f120852a = false;

    /* renamed from: b */
    public static final String f120853b = "h";

    /* renamed from: n */
    private static File f120854n;

    /* renamed from: q */
    private static File f120855q;

    /* renamed from: c */
    public C2180b<Integer> f120856c;

    /* renamed from: d */
    public boolean f120857d;

    /* renamed from: e */
    public Map<String, C48083f> f120858e;

    /* renamed from: f */
    public Map<String, List<C48083f>> f120859f;

    /* renamed from: g */
    public HashMap<String, List<C51797b>> f120860g;

    /* renamed from: h */
    HashMap<String, List<C47985af>> f120861h;

    /* renamed from: i */
    public HashMap<String, C51796a> f120862i;

    /* renamed from: j */
    public WeakReference<Object> f120863j;

    /* renamed from: k */
    public WeakReference<C48072b> f120864k;

    /* renamed from: l */
    public int f120865l;

    /* renamed from: m */
    public C47985af f120866m;

    /* renamed from: o */
    private C48101a f120867o;

    /* renamed from: p */
    private long f120868p;

    /* renamed from: com.ss.android.ugc.aweme.video.preload.h$a */
    class C48101a extends Thread {

        /* renamed from: a */
        public Queue<C48104a> f120889a = new LinkedBlockingQueue();

        /* renamed from: b */
        public Queue<C48104a> f120890b = new LinkedBlockingQueue();

        /* renamed from: d */
        private boolean f120892d = true;

        /* renamed from: e */
        private final Queue<C48104a> f120893e = new ArrayBlockingQueue(10);

        /* renamed from: f */
        private C2180b<C48104a> f120894f;

        /* renamed from: g */
        private C1675ac f120895g;

        /* renamed from: h */
        private HandlerThread f120896h = new HandlerThread("preload-schedule-thread");

        /* renamed from: com.ss.android.ugc.aweme.video.preload.h$a$a */
        class C48104a {

            /* renamed from: a */
            public int f120903a;

            /* renamed from: b */
            public String f120904b;

            /* renamed from: c */
            public String[] f120905c;

            /* renamed from: d */
            public int f120906d = -1;

            /* renamed from: e */
            public int f120907e = -1;

            /* renamed from: f */
            public boolean f120908f;

            /* renamed from: g */
            public C51881p f120909g;

            /* renamed from: h */
            public VideoUrlModel f120910h;

            C48104a() {
            }
        }

        /* renamed from: a */
        private static void m104181a() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:3|4|(2:8|(2:9|(3:11|(2:13|72)(2:14|73)|70)(1:71)))(0)|77|(4:17|(4:19|20|59|76)(1:75)|74|15)|60|61|62|63) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x01a8 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r10 = this;
            L_0x0000:
                boolean r0 = r10.f120892d
                if (r0 == 0) goto L_0x01ae
                monitor-enter(r10)
                java.util.Queue<com.ss.android.ugc.aweme.video.preload.h$a$a> r0 = r10.f120890b     // Catch:{ all -> 0x01ab }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01ab }
                r1 = 0
                r2 = 0
                if (r0 != 0) goto L_0x0061
                boolean r0 = com.p683ss.android.ugc.aweme.video.preload.C48106i.m104190a()     // Catch:{ all -> 0x01ab }
                if (r0 == 0) goto L_0x0061
                m104181a()     // Catch:{ all -> 0x01ab }
            L_0x0018:
                java.util.Queue<com.ss.android.ugc.aweme.video.preload.h$a$a> r0 = r10.f120890b     // Catch:{ all -> 0x01ab }
                java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x01ab }
                com.ss.android.ugc.aweme.video.preload.h$a$a r0 = (com.p683ss.android.ugc.aweme.video.preload.C48086h.C48101a.C48104a) r0     // Catch:{ all -> 0x01ab }
                if (r0 == 0) goto L_0x0061
                com.ss.android.ugc.aweme.video.preload.h r3 = com.p683ss.android.ugc.aweme.video.preload.C48086h.this     // Catch:{ all -> 0x01ab }
                boolean r3 = r3.f120857d     // Catch:{ all -> 0x01ab }
                if (r3 == 0) goto L_0x0037
                com.ss.android.ugc.aweme.feed.model.VideoUrlModel r3 = r0.f120910h     // Catch:{ all -> 0x01ab }
                int r4 = r0.f120906d     // Catch:{ all -> 0x01ab }
                com.ss.android.ugc.aweme.video.preload.h$a$2 r5 = new com.ss.android.ugc.aweme.video.preload.h$a$2     // Catch:{ all -> 0x01ab }
                r5.<init>(r3, r4)     // Catch:{ all -> 0x01ab }
                r0.f120909g = r5     // Catch:{ all -> 0x01ab }
                r10.m104182b(r0)     // Catch:{ all -> 0x01ab }
                goto L_0x0018
            L_0x0037:
                com.ss.android.ugc.playerkit.videoview.c.a r3 = com.p683ss.android.ugc.playerkit.videoview.p2497c.C50141a.m108193a()     // Catch:{ all -> 0x01ab }
                com.ss.android.ugc.aweme.feed.model.VideoUrlModel r4 = r0.f120910h     // Catch:{ all -> 0x01ab }
                java.lang.String r4 = r4.getBitRatedRatioUri()     // Catch:{ all -> 0x01ab }
                com.ss.android.ugc.playerkit.videoview.d.c r3 = r3.mo97943b(r4)     // Catch:{ all -> 0x01ab }
                com.ss.android.ugc.aweme.feed.model.VideoUrlModel r4 = r0.f120910h     // Catch:{ all -> 0x01ab }
                com.ss.android.ugc.playerkit.c.a r5 = com.p683ss.android.ugc.playerkit.p2494c.C50109a.m108068s()     // Catch:{ all -> 0x01ab }
                com.ss.android.ugc.playerkit.c.e$c r5 = r5.mo95420a()     // Catch:{ all -> 0x01ab }
                com.ss.android.ugc.playerkit.videoview.a.a r3 = r3.mo97946b(r4, r5, r2)     // Catch:{ all -> 0x01ab }
                java.lang.String[] r4 = r3.f125637a     // Catch:{ all -> 0x01ab }
                r0.f120905c = r4     // Catch:{ all -> 0x01ab }
                java.lang.String r3 = r3.f125639c     // Catch:{ all -> 0x01ab }
                r0.f120904b = r3     // Catch:{ all -> 0x01ab }
                r0.f120910h = r1     // Catch:{ all -> 0x01ab }
                r10.m104182b(r0)     // Catch:{ all -> 0x01ab }
                goto L_0x0018
            L_0x0061:
                java.util.Queue<com.ss.android.ugc.aweme.video.preload.h$a$a> r0 = r10.f120889a     // Catch:{ all -> 0x01ab }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01ab }
                if (r0 != 0) goto L_0x01a5
                java.util.Queue<com.ss.android.ugc.aweme.video.preload.h$a$a> r0 = r10.f120889a     // Catch:{ all -> 0x01ab }
                java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x01ab }
                com.ss.android.ugc.aweme.video.preload.h$a$a r0 = (com.p683ss.android.ugc.aweme.video.preload.C48086h.C48101a.C48104a) r0     // Catch:{ all -> 0x01ab }
                if (r0 == 0) goto L_0x0061
                int r3 = r0.f120903a     // Catch:{ all -> 0x01ab }
                switch(r3) {
                    case 0: goto L_0x00e3;
                    case 1: goto L_0x00d8;
                    case 2: goto L_0x00cf;
                    case 3: goto L_0x0085;
                    case 4: goto L_0x007a;
                    default: goto L_0x0078;
                }     // Catch:{ all -> 0x01ab }
            L_0x0078:
                goto L_0x018e
            L_0x007a:
                com.toutiao.proxyserver.r r3 = com.toutiao.proxyserver.C51883r.m111260a()     // Catch:{ all -> 0x01ab }
                r3.mo107392b()     // Catch:{ all -> 0x01ab }
                r10.f120892d = r2     // Catch:{ all -> 0x01ab }
                goto L_0x018e
            L_0x0085:
                com.toutiao.proxyserver.r r3 = com.toutiao.proxyserver.C51883r.m111260a()     // Catch:{ all -> 0x01ab }
                r3.mo107392b()     // Catch:{ all -> 0x01ab }
                com.toutiao.proxyserver.g r3 = com.toutiao.proxyserver.C51895s.m111283f()     // Catch:{ all -> 0x01ab }
                if (r3 == 0) goto L_0x009e
                com.toutiao.proxyserver.g r3 = com.toutiao.proxyserver.C51895s.m111283f()     // Catch:{ all -> 0x01ab }
                com.toutiao.proxyserver.g$1 r4 = new com.toutiao.proxyserver.g$1     // Catch:{ all -> 0x01ab }
                r4.<init>()     // Catch:{ all -> 0x01ab }
                com.toutiao.proxyserver.p2614f.C51838d.m111177a(r4)     // Catch:{ all -> 0x01ab }
            L_0x009e:
                com.toutiao.proxyserver.h r3 = com.toutiao.proxyserver.C51895s.m111282e()     // Catch:{ all -> 0x01ab }
                if (r3 == 0) goto L_0x018e
                com.toutiao.proxyserver.h r3 = com.toutiao.proxyserver.C51895s.m111282e()     // Catch:{ all -> 0x01ab }
                com.toutiao.proxyserver.r r4 = com.toutiao.proxyserver.C51883r.m111260a()     // Catch:{ all -> 0x01ab }
                r4.mo107392b()     // Catch:{ all -> 0x01ab }
                android.content.Context r4 = com.toutiao.proxyserver.C51895s.m111276a()     // Catch:{ all -> 0x01ab }
                if (r4 == 0) goto L_0x00bc
                com.toutiao.proxyserver.b.c r4 = com.toutiao.proxyserver.p2610b.C51809c.m111118a(r4)     // Catch:{ all -> 0x01ab }
                r4.mo107301b(r2)     // Catch:{ all -> 0x01ab }
            L_0x00bc:
                android.os.Handler r4 = r3.f129343i     // Catch:{ all -> 0x01ab }
                java.lang.Runnable r5 = r3.f129342h     // Catch:{ all -> 0x01ab }
                r4.removeCallbacks(r5)     // Catch:{ all -> 0x01ab }
                java.util.concurrent.Executor r4 = r3.f129341g     // Catch:{ all -> 0x01ab }
                com.toutiao.proxyserver.h$6 r5 = new com.toutiao.proxyserver.h$6     // Catch:{ all -> 0x01ab }
                r5.<init>()     // Catch:{ all -> 0x01ab }
                r4.execute(r5)     // Catch:{ all -> 0x01ab }
                goto L_0x018e
            L_0x00cf:
                com.toutiao.proxyserver.r r3 = com.toutiao.proxyserver.C51883r.m111260a()     // Catch:{ all -> 0x01ab }
                r3.mo107392b()     // Catch:{ all -> 0x01ab }
                goto L_0x018e
            L_0x00d8:
                com.toutiao.proxyserver.r r3 = com.toutiao.proxyserver.C51883r.m111260a()     // Catch:{ all -> 0x01ab }
                java.lang.String r4 = r0.f120904b     // Catch:{ all -> 0x01ab }
                r3.mo107391a(r2, r4)     // Catch:{ all -> 0x01ab }
                goto L_0x018e
            L_0x00e3:
                com.toutiao.proxyserver.p r3 = r0.f120909g     // Catch:{ all -> 0x01ab }
                if (r3 != 0) goto L_0x0163
                java.lang.String[] r3 = r0.f120905c     // Catch:{ all -> 0x01ab }
                if (r3 == 0) goto L_0x018e
                java.lang.String[] r3 = r0.f120905c     // Catch:{ all -> 0x01ab }
                int r3 = r3.length     // Catch:{ all -> 0x01ab }
                if (r3 <= 0) goto L_0x018e
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x01ab }
                r3.<init>()     // Catch:{ all -> 0x01ab }
                java.lang.String[] r4 = r0.f120905c     // Catch:{ all -> 0x01ab }
                int r5 = r4.length     // Catch:{ all -> 0x01ab }
                r6 = 0
            L_0x00f9:
                if (r6 >= r5) goto L_0x0109
                r7 = r4[r6]     // Catch:{ all -> 0x01ab }
                boolean r8 = com.toutiao.proxyserver.p2614f.C51838d.m111182a(r7)     // Catch:{ all -> 0x01ab }
                if (r8 == 0) goto L_0x0106
                r3.add(r7)     // Catch:{ all -> 0x01ab }
            L_0x0106:
                int r6 = r6 + 1
                goto L_0x00f9
            L_0x0109:
                int r4 = r3.size()     // Catch:{ all -> 0x01ab }
                java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x01ab }
                java.lang.Object[] r3 = r3.toArray(r4)     // Catch:{ all -> 0x01ab }
                r9 = r3
                java.lang.String[] r9 = (java.lang.String[]) r9     // Catch:{ all -> 0x01ab }
                int r3 = r0.f120906d     // Catch:{ all -> 0x01ab }
                if (r3 >= 0) goto L_0x012a
                com.toutiao.proxyserver.r r4 = com.toutiao.proxyserver.C51883r.m111260a()     // Catch:{ all -> 0x01ab }
                java.lang.String r7 = r0.f120904b     // Catch:{ all -> 0x01ab }
                r5 = 0
                com.toutiao.proxyserver.q r3 = com.toutiao.proxyserver.C51883r.f129431g     // Catch:{ all -> 0x01ab }
                int r6 = r3.f129429b     // Catch:{ all -> 0x01ab }
                r8 = 0
                r4.mo107390a(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x01ab }
                goto L_0x018e
            L_0x012a:
                com.bytedance.ies.abmock.b r3 = com.bytedance.ies.abmock.C10181b.m20511a()     // Catch:{ all -> 0x01ab }
                java.lang.Class<com.ss.android.ugc.aweme.player.ab.abs.PlayerAbPreloadSizeOffsetThresholdExp> r4 = com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayerAbPreloadSizeOffsetThresholdExp.class
                r5 = 1
                java.lang.String r6 = "player_preload_size_offset_threshold"
                r7 = 31744(0x7c00, float:4.4483E-41)
                r8 = 0
                int r3 = r3.mo18168a(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x01ab }
                int r4 = r0.f120907e     // Catch:{ all -> 0x01ab }
                int r5 = r0.f120906d     // Catch:{ all -> 0x01ab }
                if (r4 <= r5) goto L_0x014b
                int r4 = r0.f120907e     // Catch:{ all -> 0x01ab }
                int r5 = r0.f120906d     // Catch:{ all -> 0x01ab }
                int r4 = r4 - r5
                if (r4 > r3) goto L_0x014b
                int r3 = r0.f120907e     // Catch:{ all -> 0x01ab }
                r0.f120906d = r3     // Catch:{ all -> 0x01ab }
            L_0x014b:
                com.toutiao.proxyserver.r r3 = com.toutiao.proxyserver.C51883r.m111260a()     // Catch:{ all -> 0x01ab }
                com.toutiao.proxyserver.r$a r3 = r3.mo107396g()     // Catch:{ all -> 0x01ab }
                java.lang.String r4 = r0.f120904b     // Catch:{ all -> 0x01ab }
                r3.f129457a = r4     // Catch:{ all -> 0x01ab }
                int r4 = r0.f120906d     // Catch:{ all -> 0x01ab }
                com.toutiao.proxyserver.r$a r3 = r3.mo107405a(r4)     // Catch:{ all -> 0x01ab }
                r3.f129458b = r9     // Catch:{ all -> 0x01ab }
                r3.mo107406a()     // Catch:{ all -> 0x01ab }
                goto L_0x018e
            L_0x0163:
                int r3 = r0.f120906d     // Catch:{ all -> 0x01ab }
                if (r3 >= 0) goto L_0x0179
                com.toutiao.proxyserver.r r4 = com.toutiao.proxyserver.C51883r.m111260a()     // Catch:{ all -> 0x01ab }
                java.lang.String r7 = r0.f120904b     // Catch:{ all -> 0x01ab }
                com.toutiao.proxyserver.p r9 = r0.f120909g     // Catch:{ all -> 0x01ab }
                r5 = 0
                com.toutiao.proxyserver.q r3 = com.toutiao.proxyserver.C51883r.f129431g     // Catch:{ all -> 0x01ab }
                int r6 = r3.f129429b     // Catch:{ all -> 0x01ab }
                r8 = 0
                r4.mo107389a(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x01ab }
                goto L_0x018e
            L_0x0179:
                com.toutiao.proxyserver.r r3 = com.toutiao.proxyserver.C51883r.m111260a()     // Catch:{ all -> 0x01ab }
                com.toutiao.proxyserver.r$a r3 = r3.mo107396g()     // Catch:{ all -> 0x01ab }
                int r4 = r0.f120906d     // Catch:{ all -> 0x01ab }
                com.toutiao.proxyserver.r$a r3 = r3.mo107405a(r4)     // Catch:{ all -> 0x01ab }
                com.toutiao.proxyserver.p r4 = r0.f120909g     // Catch:{ all -> 0x01ab }
                r3.f129459c = r4     // Catch:{ all -> 0x01ab }
                r3.mo107406a()     // Catch:{ all -> 0x01ab }
            L_0x018e:
                m104181a()     // Catch:{ all -> 0x01ab }
                r0.f120905c = r1     // Catch:{ all -> 0x01ab }
                r0.f120904b = r1     // Catch:{ all -> 0x01ab }
                r3 = -1
                r0.f120903a = r3     // Catch:{ all -> 0x01ab }
                r0.f120910h = r1     // Catch:{ all -> 0x01ab }
                r0.f120906d = r3     // Catch:{ all -> 0x01ab }
                r0.f120908f = r2     // Catch:{ all -> 0x01ab }
                java.util.Queue<com.ss.android.ugc.aweme.video.preload.h$a$a> r3 = r10.f120893e     // Catch:{ all -> 0x01ab }
                r3.offer(r0)     // Catch:{ all -> 0x01ab }
                goto L_0x0061
            L_0x01a5:
                r10.wait()     // Catch:{ InterruptedException -> 0x01a8 }
            L_0x01a8:
                monitor-exit(r10)     // Catch:{ all -> 0x01ab }
                goto L_0x0000
            L_0x01ab:
                r0 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x01ab }
                throw r0
            L_0x01ae:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.video.preload.C48086h.C48101a.run():void");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo95400a(C48104a aVar) {
            this.f120894f.onNext(aVar);
        }

        /* renamed from: b */
        private void m104182b(C48104a aVar) {
            m104181a();
            if (aVar != null) {
                this.f120889a.offer(aVar);
                notify();
            }
        }

        /* renamed from: a */
        public final void mo95399a(int i) {
            C48104a a = m104180a((String) null, i, (String[]) null);
            a.f120908f = true;
            this.f120894f.onNext(a);
        }

        C48101a() {
            this.f120896h.start();
            this.f120895g = C1667a.m5941a(this.f120896h.getLooper());
            this.f120894f = C2180b.m6534l();
            this.f120894f.mo6508a(C1663a.LATEST).mo6443a(this.f120895g).mo6449a((C2177l<? super T>) new C2191a<C48104a>(C48086h.this) {
                public final void onComplete() {
                }

                public final void onError(Throwable th) {
                    C9220a.m18311a(th);
                }

                public final /* synthetic */ void onNext(Object obj) {
                    C48104a aVar = (C48104a) obj;
                    synchronized (C48101a.this) {
                        if (!aVar.f120908f) {
                            C48101a.this.f120890b.add(aVar);
                        } else {
                            C48101a.this.f120890b.clear();
                            C48101a.this.f120889a.clear();
                            C48101a.this.f120889a.offer(aVar);
                        }
                        C48101a.this.notify();
                    }
                }
            });
        }

        /* renamed from: a */
        private C48104a m104180a(String str, int i, String[] strArr) {
            C48104a aVar = (C48104a) this.f120893e.poll();
            if (aVar == null) {
                aVar = new C48104a();
            }
            aVar.f120904b = null;
            aVar.f120903a = i;
            aVar.f120905c = null;
            return aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C48104a mo95398a(int i, VideoUrlModel videoUrlModel, int i2) {
            C48104a aVar = (C48104a) this.f120893e.poll();
            if (aVar == null) {
                aVar = new C48104a();
            }
            aVar.f120903a = i;
            aVar.f120910h = videoUrlModel;
            aVar.f120906d = i2;
            if (videoUrlModel != null) {
                aVar.f120907e = (int) videoUrlModel.getSize();
            }
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.h$b */
    static class C48105b {

        /* renamed from: a */
        public static final C48086h f120912a = new C48086h();
    }

    /* renamed from: e */
    public final File mo95355e() {
        return f120854n;
    }

    /* renamed from: b */
    public final void mo95348b() {
        if (mo95343a()) {
            this.f120867o.mo95399a(2);
        }
    }

    /* renamed from: c */
    public final void mo95350c() {
        if (mo95343a()) {
            this.f120867o.mo95399a(3);
        }
    }

    /* renamed from: d */
    public final String mo95352d() {
        if (C51895s.f129475j) {
            return "ttnet";
        }
        return "okhttp";
    }

    private C48086h() {
        this.f120858e = new LinkedHashMap<String, C48083f>() {
            /* access modifiers changed from: protected */
            public final boolean removeEldestEntry(Entry entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.f120859f = new LinkedHashMap<String, List<C48083f>>() {
            /* access modifiers changed from: protected */
            public final boolean removeEldestEntry(Entry entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.f120860g = new LinkedHashMap<String, List<C51797b>>() {
            /* access modifiers changed from: protected */
            public final boolean removeEldestEntry(Entry entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.f120861h = new LinkedHashMap<String, List<C47985af>>() {
            /* access modifiers changed from: protected */
            public final boolean removeEldestEntry(Entry entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.f120862i = new LinkedHashMap<String, C51796a>() {
            /* access modifiers changed from: protected */
            public final boolean removeEldestEntry(Entry entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.f120865l = 0;
        this.f120868p = 0;
        this.f120866m = null;
    }

    /* renamed from: f */
    private static C51843h m104145f() {
        long j;
        C51843h hVar;
        Context a = C11010c.m22280a();
        if (a == null) {
            return null;
        }
        File a2 = m104143a(a);
        if (a2 == null) {
            return null;
        }
        long j2 = 104857600;
        int a3 = C10181b.m20511a().mo18168a(VideoCacheMaxCacheSizeExperiment.class, true, "player_cache_max_size", 31744, -1);
        if (a3 > VideoCacheMaxCacheSizeExperiment.MIN_SIZE) {
            j2 = (long) (a3 * VideoCacheMaxCacheSizeExperiment.UNIT_CONVERSION);
        }
        if (VERSION.SDK_INT >= 23) {
            j = j2;
        } else {
            j = (C47723bk.m103305a() * 1048576) / 8;
        }
        if (C12662c.m25456a() && f120855q != null) {
            j = f120855q.getFreeSpace() / 8;
        }
        if (j <= j2) {
            if (j < 10485760) {
                j2 = 10485760;
            } else {
                j2 = j;
            }
        }
        f120854n = a2;
        try {
            hVar = new C51843h(a2);
            try {
                hVar.f129339e = j2;
                hVar.mo107332a();
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            hVar = null;
        }
        return hVar;
    }

    /* renamed from: a */
    public final boolean mo95343a() {
        boolean z;
        boolean z2;
        if (this.f120867o != null) {
            return true;
        }
        C51843h f = m104145f();
        if (f == null) {
            return false;
        }
        this.f120857d = C10181b.m20511a().mo18172a(PlayerPreloadLazyGetUrlsExperiment.class, true, "player_preload_lazy_get_urls", 31744, true);
        int a = C10181b.m20511a().mo18168a(VideoSpeedQueueSizeExperiment.class, true, "video_speed_queue_size", 31744, 10);
        if (C48918e.f123069c != a && a > 0) {
            C48918e.f123069c = a;
            C48918e.m105713a().mo96743a(a);
        }
        C51882q.f129428a = 1;
        C51883r.f129431g.f129430c = new LinkedBlockingQueue();
        C51895s.f129490y = false;
        C51895s.f129478m = 10;
        C51895s.f129489x = C10181b.m20511a().mo18172a(VideoCacheWriteAsynchronousExperiment.class, true, "video_cache_write_asynchronous", 31744, false);
        C51895s.f129486u = 1;
        C51895s.f129488w = C10181b.m20511a().mo18172a(UseVideoCacheHttpDnsExperiment.class, true, "use_video_cache_http_dns", 31744, false);
        C51895s.f129476k = C48005c.m103857a();
        C51895s.f129485t = C48005c.m103858b();
        C51895s.f129479n = C10181b.m20511a().mo18172a(CheckVideoCacheRequestHeaderExperiment.class, true, "check_video_cache_request_header", 31744, true);
        C51895s.f129480o = C10181b.m20511a().mo18172a(PreloadLocalCachePathVideoPlayExperiment.class, true, "is_preload_local_cache_path_video_play_enable", 31744, false);
        C51895s.f129483r = C10181b.m20511a().mo18172a(VideoCacheAutoAdjustPreloadMaxExperiment.class, true, "is_video_cache_auto_adust_preload_max", 31744, true);
        C51895s.f129477l = C10181b.m20511a().mo18168a(VideoCacheReadBuffersizeExperiment.class, true, "video_cache_read_buffersize", 31744, (int) VideoCacheReadBuffersizeExperiment.DEFAULT);
        C51895s.f129481p = C10181b.m20511a().mo18172a(PlayerAbUseLastIf403Exp.class, true, "player_use_last_url_if_403", 31744, true);
        if (C10181b.m20511a().mo18168a(PlayUse2UrlExperiment.class, true, "player_play_use_2_cdn_url", 31744, 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        C51895s.f129482q = z;
        if (C10181b.m20511a().mo18168a(PlayeAbUserHttp2Exp.class, true, "player_use_http2", 31744, 0) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C51895s.f129484s = z2;
        C51826c.f129309b = 300;
        if (C10181b.m20511a().mo18168a(GatherModeExperiment.class, true, "gather_mode", 31744, 0) != 0 || C10181b.m20511a().mo18168a(UseTTNetExperiment.class, true, "use_ttnet", 31744, 0) == 1) {
            C51895s.f129475j = true;
        } else {
            C51895s.f129475j = false;
        }
        C51820c.f129298a = new C51818a() {
            /* renamed from: a */
            public final void mo95394a(String str, String str2, String str3) {
                JSONObject a = C48086h.m104144a(str, str2, str3);
                if (a != null) {
                    C22572b.m55734b("VideoCache", a);
                }
            }

            /* renamed from: b */
            public final void mo95395b(String str, String str2, String str3) {
                JSONObject a = C48086h.m104144a(str, str2, str3);
                if (a != null) {
                    String str4 = "VideoCache";
                    C52711k.m112240b(str4, "eventName");
                    C52711k.m112240b(a, "msg");
                    if (C48017a.m103959a()) {
                        String a2 = C22572b.m55730a(str4, a);
                        if (!TextUtils.isEmpty(a2)) {
                            C52711k.m112240b(a2, "msg");
                            if (C48017a.m103959a()) {
                                C32458a.m75141a(4, C22572b.f60696a, a2);
                            }
                        }
                    }
                }
            }

            /* renamed from: c */
            public final void mo95396c(String str, String str2, String str3) {
                JSONObject a = C48086h.m104144a(str, str2, str3);
                if (a != null) {
                    String str4 = "VideoCache";
                    C52711k.m112240b(str4, "eventName");
                    C52711k.m112240b(a, "msg");
                    if (C48017a.m103959a()) {
                        String a2 = C22572b.m55730a(str4, a);
                        if (!TextUtils.isEmpty(a2)) {
                            C52711k.m112240b(a2, "msg");
                            if (C48017a.m103959a()) {
                                C32458a.m75141a(5, C22572b.f60696a, a2);
                            }
                        }
                    }
                }
            }

            /* renamed from: d */
            public final void mo95397d(String str, String str2, String str3) {
                JSONObject a = C48086h.m104144a(str, str2, str3);
                if (a != null) {
                    String str4 = "VideoCache";
                    C52711k.m112240b(str4, "eventName");
                    C52711k.m112240b(a, "msg");
                    if (C48017a.m103959a()) {
                        String a2 = C22572b.m55730a(str4, a);
                        if (!TextUtils.isEmpty(a2)) {
                            C52711k.m112240b(a2, "msg");
                            if (C48017a.m103959a()) {
                                C32458a.m75141a(6, C22572b.f60696a, a2);
                            }
                        }
                    }
                }
            }
        };
        C51895s.f129487v = new C51819b() {
            /* renamed from: a */
            public final void mo95377a(String str, long j, String str2) {
                C50100a.m108056a().mo97881a(C50122a.m108112a().mo97900b().uri, str, j);
            }
        };
        C51820c.f129299b = true;
        C51895s.f129473h = new C51865m() {
            /* renamed from: a */
            public final void mo95378a(int i, String str, String str2) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("video_cache_error_code", i);
                    String str3 = "video_cache_msg";
                    if (str.length() > 1500) {
                        str = str.substring(0, 1500);
                    }
                    jSONObject.put(str3, str);
                    jSONObject.put("video_cache_use_ttnet", C51895s.f129475j);
                    C50107b.m108066a(str2, i, jSONObject.toString());
                    C23131p.m57779a("video_cache_error_report", jSONObject);
                } catch (Exception unused) {
                }
            }
        };
        C51895s.f129474i = new C51864l() {
            /* renamed from: a */
            public final void mo95379a(int i, String str) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", i);
                    jSONObject.put("url", str);
                    C23131p.m56692a("aweme_media_play_video_data_download", "aweme_media_play_video_data_download", jSONObject);
                } catch (Exception unused) {
                }
            }
        };
        C51895s.f129472g = new C51866n() {
            /* renamed from: a */
            public final void mo95380a(C51796a aVar) {
                if (aVar.f129238a != null && aVar.f129241d >= 0 && aVar.f129240c > 0) {
                    C48086h.this.f120862i.put(aVar.f129238a, aVar);
                }
            }
        };
        C51895s.f129471f = new C51880o() {
            /* renamed from: a */
            public final void mo95384a(final JSONObject jSONObject) {
                C18842a.m45932a(new Runnable() {
                    public final void run() {
                        try {
                            C23131p.m57779a("aweme_play_416", C48005c.m103856a(jSONObject));
                        } catch (JSONException unused) {
                        }
                    }
                });
            }

            /* renamed from: a */
            public final void mo95381a(C51797b bVar) {
                if (bVar != null && bVar.f129242a != null && bVar.f129245d >= 0 && bVar.f129244c > 0) {
                    if (C48086h.this.f120866m == null || !TextUtils.equals(C48086h.this.f120866m.f120620a, bVar.f129242a)) {
                        C48086h hVar = C48086h.this;
                        C48086h hVar2 = C48086h.this;
                        String str = bVar.f129242a;
                        C47985af afVar = null;
                        if (!TextUtils.isEmpty(str)) {
                            List list = (List) hVar2.f120861h.get(str);
                            if (list != null && list.size() > 0) {
                                afVar = (C47985af) list.get(list.size() - 1);
                            }
                        }
                        hVar.f120866m = afVar;
                    }
                    C47985af afVar2 = C48086h.this.f120866m;
                    C52711k.m112240b(bVar, "info");
                    if (afVar2.f120622c == null) {
                        afVar2.f120622c = new ArrayList<>();
                    }
                    ArrayList<C51797b> arrayList = afVar2.f120622c;
                    if (arrayList != null) {
                        arrayList.add(bVar);
                    }
                    List list2 = (List) C48086h.this.f120860g.get(bVar.f129242a);
                    if (list2 == null) {
                        list2 = new ArrayList();
                        C48086h.this.f120860g.put(bVar.f129242a, list2);
                    }
                    list2.add(bVar);
                }
            }

            /* renamed from: a */
            public final void mo95382a(C51798c cVar) {
                if (cVar != null && !TextUtils.isEmpty(cVar.f129246a)) {
                    C48083f fVar = new C48083f(cVar);
                    C48086h.this.f120858e.put(cVar.f129246a, fVar);
                    List list = (List) C48086h.this.f120859f.get(cVar.f129246a);
                    if (list == null && !TextUtils.isEmpty(fVar.f120833a)) {
                        list = new ArrayList();
                        C48086h.this.f120859f.put(fVar.f120833a, list);
                    }
                    if (list != null && list.size() < 10) {
                        list.add(fVar);
                    }
                    C48086h hVar = C48086h.this;
                    if (cVar != null && !TextUtils.isEmpty(cVar.f129246a)) {
                        List list2 = (List) hVar.f120861h.get(cVar.f129246a);
                        if (list2 == null) {
                            list2 = new ArrayList();
                            hVar.f120861h.put(cVar.f129246a, list2);
                        }
                        C47985af afVar = new C47985af();
                        String str = cVar.f129246a;
                        C52711k.m112240b(str, "<set-?>");
                        afVar.f120620a = str;
                        afVar.f120621b = (long) (list2.size() + 1);
                        list2.add(afVar);
                        hVar.f120866m = afVar;
                    }
                }
            }

            /* renamed from: a */
            public final void mo95383a(String str, String str2) {
                if (C48086h.this.f120863j != null) {
                    C48086h.this.f120863j.get();
                }
            }

            /* renamed from: a */
            public final void mo95385a(boolean z, String str, int i, int i2) {
                if (C48086h.this.f120864k != null) {
                    C48072b bVar = (C48072b) C48086h.this.f120864k.get();
                    if (bVar != null) {
                        bVar.mo62821a(str, (long) i, (long) i2);
                    }
                }
            }

            /* renamed from: a */
            public final void mo95387a(boolean z, String str, int i, long j, long j2) {
                long j3;
                int i2;
                int i3 = i;
                if (i3 > 0) {
                    if (j <= 0 || C10181b.m20511a().mo18168a(VideoNetworkSpeedAlgorithmExperiment.class, true, "video_network_speed_algorithm", 31744, 0) != 2) {
                        if (C10181b.m20511a().mo18168a(VideoDownloadSpeedCostTimeExperiment.class, true, "video_download_speed_cost_time", 31744, 0) == 1) {
                            j3 = j;
                        } else {
                            j3 = j2;
                        }
                        if (j3 > 0) {
                            double d = (double) i3;
                            Double.isNaN(d);
                            double d2 = 8.0d * d;
                            double d3 = (double) j3;
                            Double.isNaN(d3);
                            C48918e.m105713a().mo96742a(d2 / (d3 / 1000.0d), d, j3);
                            MLModel a = C23794bh.m58396j().mo76387a();
                            if (a != null) {
                                if (C48086h.this.f120856c == null) {
                                    C48086h hVar = C48086h.this;
                                    if (a == null || a.params == null || a.params.length <= 0) {
                                        i2 = 500;
                                    } else {
                                        i2 = a.params[0];
                                    }
                                    hVar.f120865l = i2;
                                    C48086h hVar2 = C48086h.this;
                                    hVar2.f120856c = C2180b.m6534l();
                                    hVar2.f120856c.mo6508a(C1663a.LATEST).mo6442a((long) hVar2.f120865l, TimeUnit.MILLISECONDS, C2168a.m6523d(), true).mo6449a((C2177l<? super T>) new C2191a<Integer>() {
                                        public final void onComplete() {
                                        }

                                        public final void onError(Throwable th) {
                                            C9220a.m18311a(th);
                                        }

                                        public final /* synthetic */ void onNext(Object obj) {
                                            Integer num = (Integer) obj;
                                            C48918e.m105713a().mo96745c();
                                        }
                                    });
                                }
                                C48086h.this.f120856c.onNext(Integer.valueOf(i));
                            }
                        }
                    } else {
                        C48918e.m105713a().mo96747e();
                    }
                }
            }

            /* renamed from: a */
            public final void mo95386a(boolean z, String str, int i, int i2, String str2, String str3) {
                final boolean z2 = z;
                final String str4 = str;
                final int i3 = i;
                final int i4 = i2;
                final String str5 = str3;
                C480942 r0 = new Runnable() {
                    public final void run() {
                        C23088c cVar = new C23088c();
                        cVar.mo47819a("disableAutoDiskCacheManagement", Boolean.valueOf(z2));
                        cVar.mo47824a("key", str4);
                        cVar.mo47822a("oldContentLength", Integer.valueOf(i3));
                        cVar.mo47822a("newContentLength", Integer.valueOf(i4));
                        cVar.mo47824a("previousInfo", str5);
                        C48005c.m103855a(cVar);
                        C23131p.m57779a("aweme_play_content_length_not_match", cVar.mo47825b());
                    }
                };
                C18842a.m45932a(r0);
            }
        };
        C51897t a2 = C51897t.m111286a();
        if (a2.f129505n.compareAndSet(false, true)) {
            new Thread(a2.f129504m).start();
        }
        try {
            this.f120867o = new C48101a();
            this.f120867o.start();
            Context a3 = C11010c.m22280a();
            if (f == null || a3 == null) {
                throw new IllegalArgumentException("DiskLruCache and Context can't be null !!!");
            }
            C51895s.f129469d = a3.getApplicationContext();
            if (C51895s.f129467b == null) {
                C51841g gVar = C51895s.f129466a;
                if (gVar != null) {
                    if (gVar.f129333a.getAbsolutePath().equals(f.f129335a.getAbsolutePath())) {
                        throw new IllegalArgumentException("DiskLruCache 和 DiskCache 不能使用相同的目录");
                    }
                }
                C51895s.f129467b = f;
                C51895s.f129468c = C51809c.m111118a(a3);
                C51843h hVar = C51895s.f129467b;
                hVar.f129338d.add(new C51853a() {
                    /* renamed from: a */
                    public final void mo107344a(String str) {
                        StringBuilder sb = new StringBuilder("new cache created: ");
                        sb.append(str);
                        C51820c.m111141b("TAG_PROXY_DiskLruCache", sb.toString());
                    }

                    /* renamed from: a */
                    public final void mo107345a(Set<String> set) {
                        C51809c cVar = C51895s.f129468c;
                        if (set != null && !set.isEmpty()) {
                            String[] strArr = new String[(set.size() + 1)];
                            int i = -1;
                            Map map = (Map) cVar.f129278a.get(0);
                            for (String str : set) {
                                if (map != null) {
                                    map.remove(str);
                                }
                                i++;
                                strArr[i] = str;
                            }
                            strArr[i + 1] = "0";
                            try {
                                StringBuilder sb = new StringBuilder("key IN(");
                                sb.append(C51809c.m111119a(strArr.length - 1));
                                sb.append(") AND flag");
                                sb.append("=?");
                                cVar.f129279b.getWritableDatabase().delete("video_http_header_t", sb.toString(), strArr);
                            } catch (Throwable unused) {
                            }
                        }
                        StringBuilder sb2 = new StringBuilder("cache file removed, ");
                        sb2.append(set);
                        C51820c.m111141b("TAG_PROXY_DiskLruCache", sb2.toString());
                        if (set != null) {
                            for (String str2 : set) {
                                C51802ac a = C51802ac.m111110a();
                                String str3 = (String) a.f129267b.get(str2);
                                if (!(str3 == null || str3 == null)) {
                                    a.f129266a.remove(str3);
                                }
                            }
                        }
                    }
                });
                C51897t a4 = C51897t.m111286a();
                a4.f129498g = f;
                a4.f129497f = C51895s.f129468c;
                C51883r a5 = C51883r.m111260a();
                a5.f129436d = f;
                a5.f129435c = C51895s.f129468c;
            }
            int i = VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
            if (C51895s.f129475j) {
                i = C10181b.m20511a().mo18168a(VideoCacheTTnetPreloadTimeoutExperiment.class, true, "videocache_ttnet_preload_timeout", 31744, (int) VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT);
            }
            C51883r a6 = C51883r.m111260a();
            a6.f129439h = (long) i;
            a6.f129440i = 30000;
            a6.f129441j = 30000;
            int i2 = 10000;
            if (C51895s.f129475j) {
                i2 = C10181b.m20511a().mo18168a(VideoCacheTTnetProxyTimeoutExperiment.class, true, "videocache_ttnet_proxy_timeout", 31744, 10000);
            }
            C51897t a7 = C51897t.m111286a();
            a7.f129501j = (long) i2;
            a7.f129502k = 10000;
            a7.f129503l = 10000;
            return true;
        } catch (Exception e) {
            C32458a.m75143a(e);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo95342a(C48072b bVar) {
        this.f120864k = new WeakReference<>(bVar);
    }

    /* renamed from: c */
    public final boolean mo95351c(VideoUrlModel videoUrlModel) {
        return mo95345a(videoUrlModel, -1);
    }

    /* renamed from: f */
    public final C48083f mo95356f(VideoUrlModel videoUrlModel) {
        try {
            return (C48083f) this.f120858e.get(videoUrlModel.getBitRatedRatioUri());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: g */
    public final List<C48083f> mo95357g(VideoUrlModel videoUrlModel) {
        return (List) this.f120859f.get(videoUrlModel.getBitRatedRatioUri());
    }

    /* renamed from: h */
    public final List<C47985af> mo95358h(VideoUrlModel videoUrlModel) {
        return (List) this.f120861h.get(videoUrlModel.getBitRatedRatioUri());
    }

    /* renamed from: b */
    public final int mo95346b(VideoUrlModel videoUrlModel) {
        if (videoUrlModel != null) {
            return (int) C51802ac.m111110a().mo107296a(videoUrlModel.getBitRatedRatioUri());
        }
        return 0;
    }

    /* renamed from: d */
    public final void mo95353d(VideoUrlModel videoUrlModel) {
        if (mo95343a()) {
            C48101a aVar = this.f120867o;
            aVar.mo95400a(aVar.mo95398a(1, videoUrlModel, -1));
        }
    }

    /* renamed from: a */
    public final long mo95340a(String str) {
        C51843h hVar = C51883r.m111260a().f129436d;
        if (hVar == null || TextUtils.isEmpty(str)) {
            return 0;
        }
        File e = hVar.mo107310e(C51835a.m111161a(str));
        if (e != null) {
            long length = e.length();
            if (length > 0) {
                return length;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final long mo95347b(String str) {
        C51809c cVar = C51883r.m111260a().f129435c;
        if (cVar == null || TextUtils.isEmpty(str)) {
            return 0;
        }
        C51807a a = cVar.mo107300a(C51835a.m111161a(str), C51808b.m111116a(false));
        if (a == null) {
            return 0;
        }
        return (long) a.f129274c;
    }

    /* renamed from: a */
    public static File m104143a(Context context) {
        File file;
        if (f120855q != null) {
            return f120855q;
        }
        boolean z = true;
        try {
            if (C10181b.m20511a().mo18168a(UsePrivateCachePathExperiment.class, true, "player_cache_use_private_path", 31744, 1) != 1) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (!C48016e.m103957g() || z) {
            file = context.getCacheDir();
            if (C12662c.m25456a()) {
                file = C12662c.m25458b(context, C12665e.PREFER_PRIVATE);
            }
        } else {
            file = C48016e.m103941b(context);
            if (C12662c.m25456a()) {
                file = C12662c.m25458b(context, C12665e.PREFER_EXTERNAL);
            }
        }
        if (file == null) {
            return null;
        }
        File file2 = new File(file, "cache");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        f120855q = file2;
        return file2;
    }

    /* renamed from: b */
    public final void mo95349b(C48072b bVar) {
        if (this.f120864k != null && this.f120864k.get() == bVar) {
            this.f120864k = null;
        }
    }

    /* renamed from: e */
    public final C48075e mo95354e(VideoUrlModel videoUrlModel) {
        try {
            List<C51797b> list = (List) this.f120860g.get(videoUrlModel.getBitRatedRatioUri());
            if (list != null && list.size() > 0) {
                C48075e eVar = new C48075e();
                eVar.f120803c = list.size();
                for (C51797b bVar : list) {
                    if (bVar != null) {
                        eVar.f120801a += bVar.f129245d;
                        eVar.f120802b += bVar.f129244c;
                    }
                }
                return eVar;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo95344a(VideoUrlModel videoUrlModel) {
        if (videoUrlModel == null || C51802ac.m111110a().mo107296a(videoUrlModel.getBitRatedRatioUri()) <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo95345a(VideoUrlModel videoUrlModel, int i) {
        if (!mo95343a()) {
            return false;
        }
        C48101a aVar = this.f120867o;
        aVar.mo95400a(aVar.mo95398a(0, videoUrlModel, i));
        return true;
    }

    /* renamed from: a */
    public static JSONObject m104144a(String str, String str2, String str3) {
        if (!C48017a.m103959a()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tag", str);
            jSONObject.put("msg", str2);
            jSONObject.put("vid", str3);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo95341a(VideoUrlModel videoUrlModel, String str, String[] strArr) {
        if (C48071a.m104097a()) {
            String a = C48071a.m104096a(videoUrlModel.getSourceId());
            if (C48071a.m104098b(a)) {
                return a;
            }
        }
        C51897t a2 = C51897t.m111286a();
        String str2 = null;
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            return null;
        }
        C51843h hVar = a2.f129498g;
        if (hVar == null || a2.f129497f == null) {
            return strArr[0];
        }
        String a3 = C51835a.m111161a(str);
        C51802ac.m111110a().mo107298a(str, a3);
        if (C51895s.f129480o) {
            File d = hVar.mo107309d(a3);
            if (d.exists() && d.isFile()) {
                C51807a a4 = a2.f129497f.mo107300a(a3, C51808b.m111116a(false));
                if (a4 != null && d.length() >= ((long) a4.f129274c)) {
                    if (C51895s.f129471f != null) {
                        C51838d.m111186b((Runnable) new Runnable(str, a4, false) {

                            /* renamed from: a */
                            final /* synthetic */ String f129512a;

                            /* renamed from: b */
                            final /* synthetic */ C51807a f129513b;

                            /* renamed from: c */
                            final /* synthetic */ boolean f129514c;

                            public final void run() {
                                C51895s.f129471f.mo95385a(this.f129514c, this.f129512a, this.f129513b.f129274c, this.f129513b.f129274c);
                                C51802ac.m111110a().mo107297a(this.f129512a, (long) this.f129513b.f129274c);
                            }

                            {
                                this.f129512a = r2;
                                this.f129513b = r3;
                                this.f129514c = r4;
                            }
                        });
                    }
                    return d.getAbsolutePath();
                }
            }
        }
        List a5 = C51838d.m111172a(strArr);
        if (a2.f129495c.get() == 1 && a5 != null) {
            StringBuilder sb = new StringBuilder(UnReadVideoExperiment.LIKE_USER_LIST);
            String str3 = null;
            while (true) {
                if (str3 != null) {
                    if (a5.size() == 1) {
                        break;
                    }
                    a5.remove(a5.size() - 1);
                }
                str3 = C51914w.m111313a(sb, str, a3, a5);
                if (str3.length() <= 3072) {
                    str2 = str3;
                    break;
                }
            }
            if (str2 != null) {
                StringBuilder sb2 = new StringBuilder("http://127.0.0.1:");
                sb2.append(a2.f129494b);
                sb2.append("?");
                sb2.append(str2);
                return sb2.toString();
            }
        }
        return strArr[0];
    }
}
