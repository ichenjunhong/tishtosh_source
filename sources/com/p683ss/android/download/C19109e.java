package com.p683ss.android.download;

import android.app.NotificationManager;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.download.C19105d.C19107b;
import com.p683ss.android.download.C19112f.C19115a;
import com.p683ss.android.download.C19112f.C19116b;
import com.p683ss.android.download.p1161b.C19096c.C19097a;
import com.p683ss.android.download.p1161b.C19099e;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.download.e */
public final class C19109e {

    /* renamed from: b */
    public static final Object f52656b = new Object();

    /* renamed from: j */
    private static C19109e f52657j;

    /* renamed from: a */
    public final Set<String> f52658a = new HashSet();

    /* renamed from: c */
    final C19099e f52659c = new C19099e();

    /* renamed from: d */
    private Map<Long, WeakHashMap<Object, Boolean>> f52660d = new ConcurrentHashMap();

    /* renamed from: e */
    private Map<Long, String> f52661e = new ConcurrentHashMap();

    /* renamed from: f */
    private Map<Long, JSONObject> f52662f = new ConcurrentHashMap();

    /* renamed from: g */
    private Map<Long, C19107b> f52663g = new ConcurrentHashMap();

    /* renamed from: h */
    private final Context f52664h;

    /* renamed from: i */
    private final NotificationManager f52665i;

    /* renamed from: k */
    private final HashMap<String, Long> f52666k = new HashMap<>();

    /* renamed from: l */
    private final C19099e f52667l = new C19099e();

    /* renamed from: a */
    private static boolean m46565a(int i) {
        return i == 1 || i == 3;
    }

    /* renamed from: b */
    private static boolean m46569b(int i) {
        return i == 1 || i == 0;
    }

    /* renamed from: a */
    public final void mo39041a() {
        synchronized (f52656b) {
            Iterator it = this.f52658a.iterator();
            while (it.hasNext()) {
                this.f52665i.cancel((String) it.next(), 0);
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public final void mo39042a(long j, long j2) {
        synchronized (this.f52659c) {
            if (j2 != 0) {
                try {
                    this.f52659c.mo39020a(j, j2);
                    this.f52667l.mo39020a(j, SystemClock.elapsedRealtime());
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                this.f52659c.mo39019a(j);
                this.f52667l.mo39019a(j);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x0313 A[Catch:{ all -> 0x026f }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0501 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016d A[Catch:{ all -> 0x026f }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0271 A[Catch:{ all -> 0x026f }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0286 A[Catch:{ all -> 0x026f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39046a(java.util.Collection<com.p683ss.android.download.C19101c> r36) {
        /*
            r35 = this;
            r1 = r35
            java.util.HashMap<java.lang.String, java.lang.Long> r2 = r1.f52666k
            monitor-enter(r2)
            boolean r0 = com.p683ss.android.download.C19129n.m46626a()     // Catch:{ all -> 0x056b }
            if (r0 != 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x056b }
            return
        L_0x000d:
            android.content.Context r0 = r1.f52664h     // Catch:{ all -> 0x056b }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x056b }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x056b }
            r3.<init>()     // Catch:{ all -> 0x056b }
            java.util.Iterator r4 = r36.iterator()     // Catch:{ all -> 0x056b }
        L_0x001c:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x056b }
            r6 = 3
            r7 = 0
            if (r5 == 0) goto L_0x0041
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x056b }
            com.ss.android.download.c r5 = (com.p683ss.android.download.C19101c) r5     // Catch:{ all -> 0x056b }
            java.lang.String r9 = m46567b(r5)     // Catch:{ all -> 0x056b }
            if (r9 == 0) goto L_0x0035
            r3.put(r9, r5)     // Catch:{ all -> 0x056b }
            goto L_0x001c
        L_0x0035:
            int r9 = r5.f52615j     // Catch:{ all -> 0x056b }
            boolean r9 = com.p683ss.android.download.p1161b.C19096c.C19097a.m46515c(r9)     // Catch:{ all -> 0x056b }
            if (r9 == 0) goto L_0x001c
            r1.m46564a(r5, r6, r7)     // Catch:{ all -> 0x056b }
            goto L_0x001c
        L_0x0041:
            java.util.Set r4 = r3.keySet()     // Catch:{ all -> 0x056b }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x056b }
        L_0x0049:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x056b }
            r9 = 0
            if (r5 == 0) goto L_0x0524
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x056b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x056b }
            r10 = 58
            int r10 = r5.indexOf(r10)     // Catch:{ all -> 0x056b }
            java.lang.String r10 = r5.substring(r9, r10)     // Catch:{ all -> 0x056b }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ all -> 0x056b }
            java.lang.Object r11 = r3.get(r5)     // Catch:{ all -> 0x056b }
            com.ss.android.download.c r11 = (com.p683ss.android.download.C19101c) r11     // Catch:{ all -> 0x056b }
            android.support.v4.app.aa$d r12 = new android.support.v4.app.aa$d     // Catch:{ all -> 0x056b }
            android.content.Context r13 = r1.f52664h     // Catch:{ all -> 0x056b }
            r12.<init>(r13)     // Catch:{ all -> 0x056b }
            java.util.HashMap<java.lang.String, java.lang.Long> r13 = r1.f52666k     // Catch:{ all -> 0x056b }
            boolean r13 = r13.containsKey(r5)     // Catch:{ all -> 0x056b }
            if (r13 == 0) goto L_0x0086
            java.util.HashMap<java.lang.String, java.lang.Long> r13 = r1.f52666k     // Catch:{ all -> 0x056b }
            java.lang.Object r13 = r13.get(r5)     // Catch:{ all -> 0x056b }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x056b }
            long r13 = r13.longValue()     // Catch:{ all -> 0x056b }
            goto L_0x0093
        L_0x0086:
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x056b }
            java.util.HashMap<java.lang.String, java.lang.Long> r15 = r1.f52666k     // Catch:{ all -> 0x056b }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x056b }
            r15.put(r5, r9)     // Catch:{ all -> 0x056b }
        L_0x0093:
            r9 = 2
            r15 = 1
            if (r10 != r15) goto L_0x009e
            r17 = 17301633(0x1080081, float:2.4979616E-38)
            r18 = 17301633(0x1080081, float:2.4979616E-38)
            goto L_0x00b8
        L_0x009e:
            if (r10 != r9) goto L_0x00aa
            r17 = 17301642(0x108008a, float:2.4979642E-38)
            r1.m46564a(r11, r9, r7)     // Catch:{ all -> 0x056b }
            r18 = 17301642(0x108008a, float:2.4979642E-38)
            goto L_0x00b8
        L_0x00aa:
            if (r10 != r6) goto L_0x00b6
            r17 = 17301634(0x1080082, float:2.497962E-38)
            r1.m46564a(r11, r6, r7)     // Catch:{ all -> 0x056b }
            r18 = 17301634(0x1080082, float:2.497962E-38)
            goto L_0x00b8
        L_0x00b6:
            r18 = 0
        L_0x00b8:
            if (r10 == r15) goto L_0x011a
            if (r10 != r9) goto L_0x00bd
            goto L_0x011a
        L_0x00bd:
            if (r10 != r6) goto L_0x0118
            android.net.Uri r8 = com.p683ss.android.download.p1161b.C19096c.C19097a.f52584a     // Catch:{ all -> 0x056b }
            r21 = r10
            long r9 = r11.f52606a     // Catch:{ all -> 0x056b }
            android.net.Uri r8 = android.content.ContentUris.withAppendedId(r8, r9)     // Catch:{ all -> 0x056b }
            r12.mo2126b(r15)     // Catch:{ all -> 0x056b }
            int r9 = r11.f52615j     // Catch:{ all -> 0x056b }
            boolean r9 = com.p683ss.android.download.p1161b.C19096c.C19097a.m46514b(r9)     // Catch:{ all -> 0x056b }
            if (r9 != 0) goto L_0x00de
            boolean r9 = m46571c(r11)     // Catch:{ all -> 0x056b }
            if (r9 == 0) goto L_0x00db
            goto L_0x00de
        L_0x00db:
            java.lang.String r9 = "android.ss.intent.action.DOWNLOAD_OPEN"
            goto L_0x00e0
        L_0x00de:
            java.lang.String r9 = "android.ss.intent.action.DOWNLOAD_DELETE"
        L_0x00e0:
            android.content.Intent r10 = new android.content.Intent     // Catch:{ all -> 0x056b }
            android.content.Context r6 = r1.f52664h     // Catch:{ all -> 0x056b }
            java.lang.Class<com.ss.android.download.DownloadHandlerService> r15 = com.p683ss.android.download.DownloadHandlerService.class
            r10.<init>(r9, r8, r6, r15)     // Catch:{ all -> 0x056b }
            java.lang.String r6 = "extra_click_download_ids"
            r22 = r8
            long r7 = r11.f52606a     // Catch:{ all -> 0x056b }
            r10.putExtra(r6, r7)     // Catch:{ all -> 0x056b }
            android.content.Context r6 = r1.f52664h     // Catch:{ all -> 0x056b }
            r7 = 0
            r8 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r6 = android.app.PendingIntent.getService(r6, r7, r10, r8)     // Catch:{ all -> 0x056b }
            r12.mo2114a(r6)     // Catch:{ all -> 0x056b }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x056b }
            java.lang.String r7 = "android.ss.intent.action.DOWNLOAD_HIDE"
            android.content.Context r8 = r1.f52664h     // Catch:{ all -> 0x056b }
            java.lang.Class<com.ss.android.download.DownloadHandlerService> r9 = com.p683ss.android.download.DownloadHandlerService.class
            r10 = r22
            r6.<init>(r7, r10, r8, r9)     // Catch:{ all -> 0x056b }
            android.content.Context r7 = r1.f52664h     // Catch:{ all -> 0x056b }
            r8 = 0
            android.app.PendingIntent r6 = android.app.PendingIntent.getService(r7, r8, r6, r8)     // Catch:{ all -> 0x056b }
            r12.mo2124b(r6)     // Catch:{ all -> 0x056b }
            r6 = r21
            goto L_0x0147
        L_0x0118:
            r6 = r10
            goto L_0x0147
        L_0x011a:
            r21 = r10
            android.net.Uri r6 = com.p683ss.android.download.p1161b.C19096c.C19097a.f52584a     // Catch:{ all -> 0x056b }
            long r7 = r11.f52606a     // Catch:{ all -> 0x056b }
            android.net.Uri r6 = android.content.ContentUris.withAppendedId(r6, r7)     // Catch:{ all -> 0x056b }
            android.content.Intent r7 = new android.content.Intent     // Catch:{ all -> 0x056b }
            java.lang.String r8 = "android.ss.intent.action.DOWNLOAD_DELETE"
            android.content.Context r9 = r1.f52664h     // Catch:{ all -> 0x056b }
            java.lang.Class<com.ss.android.download.DownloadHandlerService> r10 = com.p683ss.android.download.DownloadHandlerService.class
            r7.<init>(r8, r6, r9, r10)     // Catch:{ all -> 0x056b }
            android.content.Context r6 = r1.f52664h     // Catch:{ all -> 0x056b }
            r8 = 0
            r9 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r6 = android.app.PendingIntent.getService(r6, r8, r7, r9)     // Catch:{ all -> 0x056b }
            r12.mo2114a(r6)     // Catch:{ all -> 0x056b }
            r6 = r21
            r7 = 1
            if (r6 != r7) goto L_0x0144
            r12.mo2120a(r7)     // Catch:{ all -> 0x056b }
            goto L_0x0147
        L_0x0144:
            r12.mo2126b(r7)     // Catch:{ all -> 0x056b }
        L_0x0147:
            android.net.Uri r7 = com.p683ss.android.download.p1161b.C19096c.C19097a.f52584a     // Catch:{ all -> 0x056b }
            long r8 = r11.f52606a     // Catch:{ all -> 0x056b }
            android.net.Uri r7 = android.content.ContentUris.withAppendedId(r7, r8)     // Catch:{ all -> 0x056b }
            java.lang.String r8 = "android.ss.intent.action.DOWNLOAD_CLICK"
            android.content.Intent r9 = new android.content.Intent     // Catch:{ all -> 0x056b }
            android.content.Context r10 = r1.f52664h     // Catch:{ all -> 0x056b }
            java.lang.Class<com.ss.android.download.DownloadHandlerService> r15 = com.p683ss.android.download.DownloadHandlerService.class
            r9.<init>(r8, r7, r10, r15)     // Catch:{ all -> 0x056b }
            java.lang.String r7 = "extra_click_download_ids"
            r23 = r3
            r24 = r4
            long r3 = r11.f52606a     // Catch:{ all -> 0x056b }
            r9.putExtra(r7, r3)     // Catch:{ all -> 0x056b }
            java.lang.String r3 = "extra_notification_tag"
            r9.putExtra(r3, r5)     // Catch:{ all -> 0x056b }
            r4 = 1
            if (r6 != r4) goto L_0x0271
            com.ss.android.download.b.e r4 = r1.f52659c     // Catch:{ all -> 0x056b }
            monitor-enter(r4)     // Catch:{ all -> 0x056b }
            long r7 = r11.f52624s     // Catch:{ all -> 0x026a }
            r25 = -1
            int r10 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r10 == 0) goto L_0x01a4
            long r7 = r11.f52625t     // Catch:{ all -> 0x026a }
            r10 = 0
            r19 = 0
            long r7 = r7 + r19
            r28 = r4
            long r3 = r11.f52624s     // Catch:{ all -> 0x026f }
            r10 = 0
            long r3 = r3 + r19
            com.ss.android.download.b.e r10 = r1.f52659c     // Catch:{ all -> 0x026f }
            r29 = r3
            long r3 = r11.f52606a     // Catch:{ all -> 0x026f }
            long[] r15 = r10.f52591a     // Catch:{ all -> 0x026f }
            r31 = r7
            int r7 = r10.f52593c     // Catch:{ all -> 0x026f }
            int r3 = com.p683ss.android.download.p1161b.C19095b.m46512a(r15, r7, r3)     // Catch:{ all -> 0x026f }
            if (r3 >= 0) goto L_0x019b
            r7 = 0
            goto L_0x019f
        L_0x019b:
            long[] r4 = r10.f52592b     // Catch:{ all -> 0x026f }
            r7 = r4[r3]     // Catch:{ all -> 0x026f }
        L_0x019f:
            r3 = 0
            r3 = 0
            long r7 = r7 + r3
            goto L_0x01ac
        L_0x01a4:
            r28 = r4
            r7 = 0
            r29 = 0
            r31 = 0
        L_0x01ac:
            monitor-exit(r28)     // Catch:{ all -> 0x026f }
            r3 = 0
            int r10 = (r29 > r3 ? 1 : (r29 == r3 ? 0 : -1))
            if (r10 <= 0) goto L_0x025a
            r3 = 100
            long r3 = r3 * r31
            long r3 = r3 / r29
            int r3 = (int) r3     // Catch:{ all -> 0x056b }
            r4 = 2132544198(0x7f1c0ac6, float:2.074155E38)
            r10 = 1
            java.lang.Object[] r15 = new java.lang.Object[r10]     // Catch:{ all -> 0x056b }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x056b }
            r16 = 0
            r15[r16] = r10     // Catch:{ all -> 0x056b }
            java.lang.String r4 = r0.getString(r4, r15)     // Catch:{ all -> 0x056b }
            r19 = 0
            int r10 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r10 <= 0) goto L_0x0250
            long r29 = r29 - r31
            r25 = 1000(0x3e8, double:4.94E-321)
            long r29 = r29 * r25
            long r29 = r29 / r7
            r15 = 1
            java.lang.Object[] r10 = new java.lang.Object[r15]     // Catch:{ all -> 0x056b }
            r27 = 3600000(0x36ee80, double:1.7786363E-317)
            int r17 = (r29 > r27 ? 1 : (r29 == r27 ? 0 : -1))
            if (r17 < 0) goto L_0x0202
            r25 = 1800000(0x1b7740, double:8.89318E-318)
            long r29 = r29 + r25
            r33 = r3
            r34 = r4
            long r3 = r29 / r27
            int r3 = (int) r3     // Catch:{ all -> 0x056b }
            java.lang.Object[] r4 = new java.lang.Object[r15]     // Catch:{ all -> 0x056b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x056b }
            r15 = 0
            r4[r15] = r3     // Catch:{ all -> 0x056b }
            r3 = 2132544251(0x7f1c0afb, float:2.0741658E38)
            java.lang.String r3 = r0.getString(r3, r4)     // Catch:{ all -> 0x056b }
        L_0x0200:
            r15 = 0
            goto L_0x0241
        L_0x0202:
            r33 = r3
            r34 = r4
            r3 = 60000(0xea60, double:2.9644E-319)
            int r15 = (r29 > r3 ? 1 : (r29 == r3 ? 0 : -1))
            if (r15 < 0) goto L_0x0229
            r3 = 30000(0x7530, double:1.4822E-319)
            long r29 = r29 + r3
            r3 = 60000(0xea60, double:2.9644E-319)
            long r3 = r29 / r3
            int r3 = (int) r3     // Catch:{ all -> 0x056b }
            r15 = 1
            java.lang.Object[] r4 = new java.lang.Object[r15]     // Catch:{ all -> 0x056b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x056b }
            r15 = 0
            r4[r15] = r3     // Catch:{ all -> 0x056b }
            r3 = 2132544252(0x7f1c0afc, float:2.074166E38)
            java.lang.String r3 = r0.getString(r3, r4)     // Catch:{ all -> 0x056b }
            goto L_0x0200
        L_0x0229:
            r3 = 500(0x1f4, double:2.47E-321)
            long r29 = r29 + r3
            long r3 = r29 / r25
            int r3 = (int) r3     // Catch:{ all -> 0x056b }
            r15 = 1
            java.lang.Object[] r4 = new java.lang.Object[r15]     // Catch:{ all -> 0x056b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x056b }
            r15 = 0
            r4[r15] = r3     // Catch:{ all -> 0x056b }
            r3 = 2132544253(0x7f1c0afd, float:2.0741662E38)
            java.lang.String r3 = r0.getString(r3, r4)     // Catch:{ all -> 0x056b }
        L_0x0241:
            r10[r15] = r3     // Catch:{ all -> 0x056b }
            r3 = 2132544199(0x7f1c0ac7, float:2.0741553E38)
            java.lang.String r3 = r0.getString(r3, r10)     // Catch:{ all -> 0x056b }
            r27 = r3
            r3 = r34
            r4 = 1
            goto L_0x0262
        L_0x0250:
            r33 = r3
            r34 = r4
            r3 = r34
            r4 = 1
            r27 = 0
            goto L_0x0262
        L_0x025a:
            r19 = 0
            r3 = 0
            r4 = 1
            r27 = 0
            r33 = 0
        L_0x0262:
            r1.m46564a(r11, r4, r7)     // Catch:{ all -> 0x056b }
            r4 = r27
            r7 = r33
            goto L_0x0276
        L_0x026a:
            r0 = move-exception
            r28 = r4
        L_0x026d:
            monitor-exit(r28)     // Catch:{ all -> 0x026f }
            throw r0     // Catch:{ all -> 0x056b }
        L_0x026f:
            r0 = move-exception
            goto L_0x026d
        L_0x0271:
            r19 = 0
            r3 = 0
            r4 = 0
            r7 = 0
        L_0x0276:
            r12.mo2113a(r13)     // Catch:{ all -> 0x056b }
            r8 = r18
            r12.mo2111a(r8)     // Catch:{ all -> 0x056b }
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x056b }
            r13 = 100
            r14 = 8
            if (r10 > r14) goto L_0x0313
            java.lang.CharSequence r8 = m46561a(r0, r11)     // Catch:{ all -> 0x056b }
            r12.mo2118a(r8)     // Catch:{ all -> 0x056b }
            r12.mo2125b(r3)     // Catch:{ all -> 0x056b }
            r3 = 1
            if (r6 != r3) goto L_0x02a9
            java.lang.String r3 = r11.f52595B     // Catch:{ all -> 0x056b }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x056b }
            if (r3 != 0) goto L_0x02a1
            java.lang.String r3 = r11.f52595B     // Catch:{ all -> 0x056b }
            r12.mo2129c(r3)     // Catch:{ all -> 0x056b }
            goto L_0x02a4
        L_0x02a1:
            r12.mo2129c(r4)     // Catch:{ all -> 0x056b }
        L_0x02a4:
            r3 = 0
            r12.mo2112a(r13, r7, r3)     // Catch:{ all -> 0x056b }
            goto L_0x030c
        L_0x02a9:
            r3 = 2
            if (r6 != r3) goto L_0x02b7
            r3 = 2132547164(0x7f1c165c, float:2.0747566E38)
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x056b }
            r12.mo2125b(r3)     // Catch:{ all -> 0x056b }
            goto L_0x030c
        L_0x02b7:
            r3 = 3
            if (r6 != r3) goto L_0x030c
            int r3 = r11.f52615j     // Catch:{ all -> 0x056b }
            boolean r3 = com.p683ss.android.download.p1161b.C19096c.C19097a.m46514b(r3)     // Catch:{ all -> 0x056b }
            if (r3 != 0) goto L_0x02f1
            boolean r3 = m46571c(r11)     // Catch:{ all -> 0x056b }
            if (r3 == 0) goto L_0x02c9
            goto L_0x02f1
        L_0x02c9:
            int r3 = r11.f52615j     // Catch:{ all -> 0x056b }
            boolean r3 = com.p683ss.android.download.p1161b.C19096c.C19097a.m46513a(r3)     // Catch:{ all -> 0x056b }
            if (r3 == 0) goto L_0x030c
            android.content.Context r3 = r1.f52664h     // Catch:{ all -> 0x056b }
            java.lang.String r4 = r11.f52610e     // Catch:{ all -> 0x056b }
            boolean r3 = com.p683ss.android.download.p1161b.C19100f.m46523a(r3, r4)     // Catch:{ all -> 0x056b }
            if (r3 == 0) goto L_0x02e6
            r3 = 2132547116(0x7f1c162c, float:2.074747E38)
            java.lang.CharSequence r3 = r0.getText(r3)     // Catch:{ all -> 0x056b }
            r12.mo2125b(r3)     // Catch:{ all -> 0x056b }
            goto L_0x030c
        L_0x02e6:
            r3 = 2132547115(0x7f1c162b, float:2.0747467E38)
            java.lang.CharSequence r3 = r0.getText(r3)     // Catch:{ all -> 0x056b }
            r12.mo2125b(r3)     // Catch:{ all -> 0x056b }
            goto L_0x030c
        L_0x02f1:
            boolean r3 = m46571c(r11)     // Catch:{ all -> 0x056b }
            if (r3 == 0) goto L_0x0302
            r3 = 2132547124(0x7f1c1634, float:2.0747485E38)
            java.lang.CharSequence r3 = r0.getText(r3)     // Catch:{ all -> 0x056b }
            r12.mo2125b(r3)     // Catch:{ all -> 0x056b }
            goto L_0x030c
        L_0x0302:
            r3 = 2132547118(0x7f1c162e, float:2.0747473E38)
            java.lang.CharSequence r3 = r0.getText(r3)     // Catch:{ all -> 0x056b }
            r12.mo2125b(r3)     // Catch:{ all -> 0x056b }
        L_0x030c:
            android.app.Notification r3 = r12.mo2122b()     // Catch:{ all -> 0x056b }
            r15 = 3
            goto L_0x04fe
        L_0x0313:
            android.widget.RemoteViews r3 = new android.widget.RemoteViews     // Catch:{ all -> 0x056b }
            android.content.Context r4 = r1.f52664h     // Catch:{ all -> 0x056b }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x056b }
            r10 = 2132214504(0x7f1702e8, float:2.0072852E38)
            r3.<init>(r4, r10)     // Catch:{ all -> 0x056b }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x056b }
            r10 = 20
            if (r4 <= r10) goto L_0x0344
            android.content.Context r4 = r1.f52664h     // Catch:{ Throwable -> 0x0344 }
            boolean r4 = com.bytedance.ies.uikit.p699c.C11088a.m22439a(r4)     // Catch:{ Throwable -> 0x0344 }
            if (r4 == 0) goto L_0x0344
            r4 = 2132022394(0x7f14147a, float:1.9683206E38)
            java.lang.String r10 = "setBackgroundColor"
            android.content.Context r15 = r1.f52664h     // Catch:{ Throwable -> 0x0344 }
            android.content.res.Resources r15 = r15.getResources()     // Catch:{ Throwable -> 0x0344 }
            r14 = 2131821670(0x7f110466, float:1.927609E38)
            int r14 = r15.getColor(r14)     // Catch:{ Throwable -> 0x0344 }
            r3.setInt(r4, r10, r14)     // Catch:{ Throwable -> 0x0344 }
        L_0x0344:
            r4 = 2132018670(0x7f1405ee, float:1.9675653E38)
            r10 = 0
            r3.setProgressBar(r4, r13, r7, r10)     // Catch:{ all -> 0x056b }
            r7 = 2132019564(0x7f14096c, float:1.9677466E38)
            r3.setImageViewResource(r7, r8)     // Catch:{ all -> 0x056b }
            android.content.Context r7 = r1.f52664h     // Catch:{ all -> 0x056b }
            r8 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r7 = android.app.PendingIntent.getService(r7, r10, r9, r8)     // Catch:{ all -> 0x056b }
            r8 = 2132017180(0x7f14001c, float:1.9672631E38)
            r3.setOnClickPendingIntent(r8, r7)     // Catch:{ all -> 0x056b }
            r7 = 2132018494(0x7f14053e, float:1.9675296E38)
            java.lang.CharSequence r9 = m46561a(r0, r11)     // Catch:{ all -> 0x056b }
            r3.setTextViewText(r7, r9)     // Catch:{ all -> 0x056b }
            java.lang.String r7 = ""
            java.lang.String r9 = ""
            java.lang.String r10 = ""
            r13 = 2132018678(0x7f1405f6, float:1.967567E38)
            r14 = 2132018675(0x7f1405f3, float:1.9675663E38)
            r15 = 1
            if (r6 != r15) goto L_0x03da
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x056b }
            r6.<init>()     // Catch:{ all -> 0x056b }
            long r9 = r11.f52625t     // Catch:{ all -> 0x056b }
            java.lang.String r7 = com.bytedance.common.utility.C9431p.m18661a(r9)     // Catch:{ all -> 0x056b }
            r6.append(r7)     // Catch:{ all -> 0x056b }
            java.lang.String r7 = "/"
            r6.append(r7)     // Catch:{ all -> 0x056b }
            long r9 = r11.f52624s     // Catch:{ all -> 0x056b }
            java.lang.String r7 = com.bytedance.common.utility.C9431p.m18661a(r9)     // Catch:{ all -> 0x056b }
            r6.append(r7)     // Catch:{ all -> 0x056b }
            java.lang.String r7 = r6.toString()     // Catch:{ all -> 0x056b }
            android.content.Context r6 = r1.f52664h     // Catch:{ all -> 0x056b }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x056b }
            r9 = 2132547125(0x7f1c1635, float:2.0747487E38)
            java.lang.String r9 = r6.getString(r9)     // Catch:{ all -> 0x056b }
            android.content.Context r6 = r1.f52664h     // Catch:{ all -> 0x056b }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x056b }
            r10 = 2132547121(0x7f1c1631, float:2.074748E38)
            java.lang.String r10 = r6.getString(r10)     // Catch:{ all -> 0x056b }
            r6 = 0
            r3.setViewVisibility(r4, r6)     // Catch:{ all -> 0x056b }
            r4 = 8
            r3.setViewVisibility(r14, r4)     // Catch:{ all -> 0x056b }
            r3.setViewVisibility(r13, r6)     // Catch:{ all -> 0x056b }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x056b }
            r6 = 11
            if (r4 < r6) goto L_0x03d2
            long r13 = r11.f52606a     // Catch:{ all -> 0x056b }
            boolean r4 = r1.mo39047a(r13)     // Catch:{ all -> 0x056b }
            if (r4 == 0) goto L_0x03cd
            goto L_0x03d2
        L_0x03cd:
            r4 = 0
            r3.setViewVisibility(r8, r4)     // Catch:{ all -> 0x056b }
            goto L_0x03d7
        L_0x03d2:
            r4 = 8
            r3.setViewVisibility(r8, r4)     // Catch:{ all -> 0x056b }
        L_0x03d7:
            r15 = 3
            goto L_0x04dc
        L_0x03da:
            r15 = 2
            if (r6 != r15) goto L_0x043d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x056b }
            r6.<init>()     // Catch:{ all -> 0x056b }
            long r9 = r11.f52625t     // Catch:{ all -> 0x056b }
            java.lang.String r7 = com.bytedance.common.utility.C9431p.m18661a(r9)     // Catch:{ all -> 0x056b }
            r6.append(r7)     // Catch:{ all -> 0x056b }
            java.lang.String r7 = "/"
            r6.append(r7)     // Catch:{ all -> 0x056b }
            long r9 = r11.f52624s     // Catch:{ all -> 0x056b }
            java.lang.String r7 = com.bytedance.common.utility.C9431p.m18661a(r9)     // Catch:{ all -> 0x056b }
            r6.append(r7)     // Catch:{ all -> 0x056b }
            java.lang.String r7 = r6.toString()     // Catch:{ all -> 0x056b }
            android.content.Context r6 = r1.f52664h     // Catch:{ all -> 0x056b }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x056b }
            r9 = 2132547121(0x7f1c1631, float:2.074748E38)
            java.lang.String r9 = r6.getString(r9)     // Catch:{ all -> 0x056b }
            android.content.Context r6 = r1.f52664h     // Catch:{ all -> 0x056b }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x056b }
            r10 = 2132547123(0x7f1c1633, float:2.0747483E38)
            java.lang.String r10 = r6.getString(r10)     // Catch:{ all -> 0x056b }
            r6 = 8
            r3.setViewVisibility(r4, r6)     // Catch:{ all -> 0x056b }
            r3.setViewVisibility(r14, r6)     // Catch:{ all -> 0x056b }
            r4 = 0
            r3.setViewVisibility(r13, r4)     // Catch:{ all -> 0x056b }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x056b }
            r6 = 11
            if (r4 < r6) goto L_0x0437
            long r13 = r11.f52606a     // Catch:{ all -> 0x056b }
            boolean r4 = r1.mo39047a(r13)     // Catch:{ all -> 0x056b }
            if (r4 == 0) goto L_0x0432
            goto L_0x0437
        L_0x0432:
            r4 = 0
            r3.setViewVisibility(r8, r4)     // Catch:{ all -> 0x056b }
            goto L_0x03d7
        L_0x0437:
            r4 = 8
            r3.setViewVisibility(r8, r4)     // Catch:{ all -> 0x056b }
            goto L_0x03d7
        L_0x043d:
            r15 = 3
            if (r6 != r15) goto L_0x04dc
            int r6 = r11.f52615j     // Catch:{ all -> 0x056b }
            boolean r6 = com.p683ss.android.download.p1161b.C19096c.C19097a.m46514b(r6)     // Catch:{ all -> 0x056b }
            if (r6 != 0) goto L_0x0493
            boolean r6 = m46571c(r11)     // Catch:{ all -> 0x056b }
            if (r6 == 0) goto L_0x044f
            goto L_0x0493
        L_0x044f:
            int r6 = r11.f52615j     // Catch:{ all -> 0x056b }
            boolean r6 = com.p683ss.android.download.p1161b.C19096c.C19097a.m46513a(r6)     // Catch:{ all -> 0x056b }
            if (r6 == 0) goto L_0x0490
            long r6 = r11.f52624s     // Catch:{ all -> 0x056b }
            java.lang.String r6 = com.bytedance.common.utility.C9431p.m18661a(r6)     // Catch:{ all -> 0x056b }
            android.content.Context r7 = r1.f52664h     // Catch:{ all -> 0x056b }
            java.lang.String r9 = r11.f52610e     // Catch:{ all -> 0x056b }
            boolean r7 = com.p683ss.android.download.p1161b.C19100f.m46523a(r7, r9)     // Catch:{ all -> 0x056b }
            if (r7 == 0) goto L_0x0475
            android.content.Context r7 = r1.f52664h     // Catch:{ all -> 0x056b }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ all -> 0x056b }
            r9 = 2132547116(0x7f1c162c, float:2.074747E38)
            java.lang.String r7 = r7.getString(r9)     // Catch:{ all -> 0x056b }
            goto L_0x0482
        L_0x0475:
            android.content.Context r7 = r1.f52664h     // Catch:{ all -> 0x056b }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ all -> 0x056b }
            r9 = 2132547115(0x7f1c162b, float:2.0747467E38)
            java.lang.String r7 = r7.getString(r9)     // Catch:{ all -> 0x056b }
        L_0x0482:
            android.content.Context r9 = r1.f52664h     // Catch:{ all -> 0x056b }
            android.content.res.Resources r9 = r9.getResources()     // Catch:{ all -> 0x056b }
            r10 = 2132547119(0x7f1c162f, float:2.0747475E38)
            java.lang.String r9 = r9.getString(r10)     // Catch:{ all -> 0x056b }
            goto L_0x04cb
        L_0x0490:
            r6 = 8
            goto L_0x04cf
        L_0x0493:
            java.lang.String r6 = ""
            r7 = 2132018676(0x7f1405f4, float:1.9675665E38)
            r9 = 8
            r3.setViewVisibility(r7, r9)     // Catch:{ all -> 0x056b }
            boolean r7 = m46571c(r11)     // Catch:{ all -> 0x056b }
            if (r7 == 0) goto L_0x04b1
            android.content.Context r7 = r1.f52664h     // Catch:{ all -> 0x056b }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ all -> 0x056b }
            r9 = 2132547124(0x7f1c1634, float:2.0747485E38)
            java.lang.String r7 = r7.getString(r9)     // Catch:{ all -> 0x056b }
            goto L_0x04be
        L_0x04b1:
            android.content.Context r7 = r1.f52664h     // Catch:{ all -> 0x056b }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ all -> 0x056b }
            r9 = 2132547118(0x7f1c162e, float:2.0747473E38)
            java.lang.String r7 = r7.getString(r9)     // Catch:{ all -> 0x056b }
        L_0x04be:
            android.content.Context r9 = r1.f52664h     // Catch:{ all -> 0x056b }
            android.content.res.Resources r9 = r9.getResources()     // Catch:{ all -> 0x056b }
            r10 = 2132547122(0x7f1c1632, float:2.0747481E38)
            java.lang.String r9 = r9.getString(r10)     // Catch:{ all -> 0x056b }
        L_0x04cb:
            r10 = r9
            r9 = r7
            r7 = r6
            goto L_0x0490
        L_0x04cf:
            r3.setViewVisibility(r4, r6)     // Catch:{ all -> 0x056b }
            r4 = 0
            r3.setViewVisibility(r14, r4)     // Catch:{ all -> 0x056b }
            r3.setViewVisibility(r13, r6)     // Catch:{ all -> 0x056b }
            r3.setViewVisibility(r8, r6)     // Catch:{ all -> 0x056b }
        L_0x04dc:
            r4 = 2132018672(0x7f1405f0, float:1.9675657E38)
            r3.setTextViewText(r4, r7)     // Catch:{ all -> 0x056b }
            r4 = 2132018673(0x7f1405f1, float:1.967566E38)
            r3.setTextViewText(r4, r9)     // Catch:{ all -> 0x056b }
            r4 = 2132018676(0x7f1405f4, float:1.9675665E38)
            r3.setTextViewText(r4, r7)     // Catch:{ all -> 0x056b }
            r4 = 2132018677(0x7f1405f5, float:1.9675667E38)
            r3.setTextViewText(r4, r9)     // Catch:{ all -> 0x056b }
            r3.setTextViewText(r8, r10)     // Catch:{ all -> 0x056b }
            android.app.Notification r4 = r12.mo2122b()     // Catch:{ all -> 0x056b }
            r4.contentView = r3     // Catch:{ all -> 0x056b }
            r3 = r4
        L_0x04fe:
            java.lang.Object r4 = f52656b     // Catch:{ all -> 0x056b }
            monitor-enter(r4)     // Catch:{ all -> 0x056b }
            java.util.Set<java.lang.String> r6 = r1.f52658a     // Catch:{ all -> 0x0521 }
            boolean r6 = r6.contains(r5)     // Catch:{ all -> 0x0521 }
            if (r6 != 0) goto L_0x0511
            java.util.Set<java.lang.String> r6 = r1.f52658a     // Catch:{ all -> 0x0521 }
            r6.add(r5)     // Catch:{ all -> 0x0521 }
            r35.m46568b()     // Catch:{ all -> 0x0521 }
        L_0x0511:
            monitor-exit(r4)     // Catch:{ all -> 0x0521 }
            android.app.NotificationManager r4 = r1.f52665i     // Catch:{ Throwable -> 0x0518 }
            r6 = 0
            r4.notify(r5, r6, r3)     // Catch:{ Throwable -> 0x0518 }
        L_0x0518:
            r7 = r19
            r3 = r23
            r4 = r24
            r6 = 3
            goto L_0x0049
        L_0x0521:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0521 }
            throw r0     // Catch:{ all -> 0x056b }
        L_0x0524:
            r23 = r3
            java.util.HashMap<java.lang.String, java.lang.Long> r0 = r1.f52666k     // Catch:{ all -> 0x056b }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x056b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x056b }
        L_0x0530:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x056b }
            if (r3 == 0) goto L_0x0569
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x056b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x056b }
            r4 = r23
            boolean r5 = r4.containsKey(r3)     // Catch:{ all -> 0x056b }
            if (r5 != 0) goto L_0x0565
            android.app.NotificationManager r5 = r1.f52665i     // Catch:{ all -> 0x056b }
            r6 = 0
            r5.cancel(r3, r6)     // Catch:{ all -> 0x056b }
            java.lang.Object r5 = f52656b     // Catch:{ all -> 0x056b }
            monitor-enter(r5)     // Catch:{ all -> 0x056b }
            java.util.Set<java.lang.String> r7 = r1.f52658a     // Catch:{ all -> 0x0562 }
            boolean r7 = r7.contains(r3)     // Catch:{ all -> 0x0562 }
            if (r7 == 0) goto L_0x055d
            java.util.Set<java.lang.String> r7 = r1.f52658a     // Catch:{ all -> 0x0562 }
            r7.remove(r3)     // Catch:{ all -> 0x0562 }
            r35.m46568b()     // Catch:{ all -> 0x0562 }
        L_0x055d:
            monitor-exit(r5)     // Catch:{ all -> 0x0562 }
            r0.remove()     // Catch:{ all -> 0x056b }
            goto L_0x0566
        L_0x0562:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0562 }
            throw r0     // Catch:{ all -> 0x056b }
        L_0x0565:
            r6 = 0
        L_0x0566:
            r23 = r4
            goto L_0x0530
        L_0x0569:
            monitor-exit(r2)     // Catch:{ all -> 0x056b }
            return
        L_0x056b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x056b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.download.C19109e.mo39046a(java.util.Collection):void");
    }

    /* renamed from: a */
    public final void mo39045a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f52665i.cancel(str, 0);
            synchronized (f52656b) {
                if (this.f52658a.contains(str)) {
                    this.f52658a.remove(str);
                    m46568b();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo39044a(C19101c cVar) {
        if (cVar.f52628w && mo39047a(cVar.f52606a)) {
            cVar.f52615j = 490;
            m46564a(cVar, 3, 0);
        }
    }

    /* renamed from: a */
    public final boolean mo39047a(long j) {
        JSONObject jSONObject = (JSONObject) this.f52662f.get(Long.valueOf(j));
        if (jSONObject != null && jSONObject.optBoolean("bind_app", false)) {
            return true;
        }
        String str = (String) this.f52661e.get(Long.valueOf(j));
        if (C9431p.m18664a(str)) {
            return false;
        }
        String[] split = str.split("##");
        return split != null && split.length > 0 && "bind_app".equals(split[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39043a(Context context, long j) {
        boolean a = C19117g.m46591a(context).mo39054a(ContentUris.withAppendedId(C19097a.f52584a, j), (String[]) null, (String) null, (String[]) null, (String) null);
        try {
            a = a.moveToFirst();
            if (a) {
                int a2 = m46559a(a, "status");
                int a3 = m46559a(a, "visibility");
                if (a != null) {
                    try {
                        a.close();
                    } catch (Exception unused) {
                    }
                }
                m46563a(context, j, a2, a3);
                m46562a(j, a2, a3);
                return;
            }
            if (a != null) {
                try {
                    a.close();
                } catch (Exception unused2) {
                }
            }
        } catch (Exception unused3) {
            if (a != null) {
                try {
                    a.close();
                } catch (Exception unused4) {
                }
            }
        } finally {
            if (a != null) {
                try {
                    a.close();
                } catch (Exception unused5) {
                }
            }
        }
    }

    /* renamed from: b */
    private void m46568b() {
        if (this.f52658a != null) {
            try {
                StringBuilder sb = new StringBuilder();
                synchronized (f52656b) {
                    int i = 0;
                    for (String str : this.f52658a) {
                        if (i != this.f52658a.size() - 1) {
                            sb.append(str);
                            sb.append("|");
                        } else {
                            sb.append(str);
                        }
                        i++;
                    }
                }
                final String sb2 = sb.toString();
                C19112f.m46585a(this.f52664h, (C19116b) new C19116b() {
                    /* renamed from: a */
                    public final void mo39048a(Editor editor) {
                        editor.putString("notifs_string", sb2);
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private static boolean m46571c(C19101c cVar) {
        return m46566a(cVar.f52615j, cVar.f52613h);
    }

    /* renamed from: f */
    private static boolean m46574f(C19101c cVar) {
        return m46570b(cVar.f52615j, cVar.f52613h);
    }

    /* renamed from: a */
    public static synchronized C19109e m46560a(Context context) {
        C19109e eVar;
        synchronized (C19109e.class) {
            if (f52657j == null) {
                f52657j = new C19109e(context);
            }
            eVar = f52657j;
        }
        return eVar;
    }

    /* renamed from: d */
    private static boolean m46572d(C19101c cVar) {
        if (cVar.f52615j != 192 || !m46569b(cVar.f52613h)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m46573e(C19101c cVar) {
        if ((cVar.f52615j == 196 || cVar.f52615j == 193 || cVar.f52615j == 194 || cVar.f52615j == 195) && m46569b(cVar.f52613h)) {
            return true;
        }
        return false;
    }

    private C19109e(Context context) {
        this.f52664h = context.getApplicationContext();
        this.f52665i = (NotificationManager) this.f52664h.getSystemService("notification");
        try {
            C19112f.m46584a(this.f52664h, (C19115a) new C19115a() {
                /* renamed from: a */
                public final void mo39049a(SharedPreferences sharedPreferences) {
                    String[] split = sharedPreferences.getString("notifs_string", "").split("\\|");
                    if (split != null) {
                        synchronized (C19109e.f52656b) {
                            for (int i = 0; i < split.length; i++) {
                                if (TextUtils.isEmpty(split[i])) {
                                    C19109e.this.f52658a.add(split[i]);
                                }
                            }
                        }
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    static String m46567b(C19101c cVar) {
        if (m46573e(cVar)) {
            StringBuilder sb = new StringBuilder("2:");
            sb.append(cVar.f52606a);
            return sb.toString();
        } else if (m46572d(cVar)) {
            StringBuilder sb2 = new StringBuilder("1:");
            sb2.append(cVar.f52606a);
            return sb2.toString();
        } else if (!m46571c(cVar) && !m46574f(cVar)) {
            return null;
        } else {
            StringBuilder sb3 = new StringBuilder("3:");
            sb3.append(cVar.f52606a);
            return sb3.toString();
        }
    }

    /* renamed from: a */
    public static int m46559a(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str));
    }

    /* renamed from: b */
    private static boolean m46570b(int i, int i2) {
        if (!C19097a.m46515c(i) || !m46565a(i2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static CharSequence m46561a(Resources resources, C19101c cVar) {
        if (!TextUtils.isEmpty(cVar.f52594A)) {
            return cVar.f52594A;
        }
        return resources.getString(R.string.atj);
    }

    /* renamed from: a */
    private static boolean m46566a(int i, int i2) {
        if ((i == 199 || i == 198) && m46565a(i2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m46562a(long j, int i, int i2) {
        if (m46570b(i, i2)) {
            StringBuilder sb = new StringBuilder("3:");
            sb.append(j);
            mo39045a(sb.toString());
        }
    }

    /* renamed from: a */
    private void m46564a(C19101c cVar, int i, long j) {
        if (this.f52660d.get(Long.valueOf(cVar.f52606a)) != null) {
            Map map = (Map) this.f52660d.get(Long.valueOf(cVar.f52606a));
            C19107b bVar = (C19107b) this.f52663g.get(Long.valueOf(cVar.f52606a));
            if (bVar == null) {
                C19105d a = C19105d.m46543a(this.f52664h);
                a.getClass();
                bVar = new C19107b();
                this.f52663g.put(Long.valueOf(cVar.f52606a), bVar);
            }
            bVar.f52644a = cVar.f52606a;
            bVar.f52645b = C19105d.m46542a(cVar.f52615j);
            bVar.f52646c = cVar.f52624s;
            bVar.f52647d = cVar.f52625t;
            bVar.f52648e = cVar.f52610e;
            if (map != null) {
                try {
                    if (!map.isEmpty()) {
                        Iterator it = map.keySet().iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private static void m46563a(Context context, long j, int i, int i2) {
        if (m46570b(i, i2) || m46566a(i, i2)) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("visibility", Integer.valueOf(200));
            contentValues.put("visibility", Integer.valueOf(0));
            C19117g.m46591a(context).mo39052a(ContentUris.withAppendedId(C19097a.f52584a, j), contentValues, (String) null, (String[]) null);
        }
    }
}
