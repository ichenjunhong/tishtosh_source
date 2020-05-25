package com.bytedance.apm.p489l;

import android.text.TextUtils;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.internal.C9069b;
import com.bytedance.apm.p480f.p482b.C9024f;
import com.bytedance.apm.p486i.C9053d;
import com.bytedance.apm.p501q.C9199p;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.l.h */
public final class C9114h extends C9081a {

    /* renamed from: t */
    private static long f24926t = 17179869184L;

    /* renamed from: a */
    public long f24927a;

    /* renamed from: b */
    public long f24928b;

    /* renamed from: g */
    public C9053d f24929g;

    /* renamed from: h */
    public String f24930h;

    /* renamed from: i */
    public String f24931i;

    /* renamed from: j */
    public String f24932j;

    /* renamed from: k */
    public String f24933k;

    /* renamed from: l */
    public long f24934l;

    /* renamed from: m */
    public long f24935m;

    /* renamed from: n */
    public long f24936n;

    /* renamed from: o */
    public long f24937o;

    /* renamed from: p */
    private boolean f24938p;

    /* renamed from: q */
    private boolean f24939q;

    /* renamed from: r */
    private int f24940r;

    /* renamed from: s */
    private long f24941s;

    /* renamed from: u */
    private boolean f24942u;

    /* renamed from: v */
    private C9199p<C9116a> f24943v;

    /* renamed from: w */
    private C9199p<C9116a> f24944w;

    /* renamed from: x */
    private C9199p<C9118c> f24945x;

    /* renamed from: com.bytedance.apm.l.h$a */
    static class C9116a implements Comparable {

        /* renamed from: a */
        public String f24951a;

        /* renamed from: b */
        public long f24952b;

        /* renamed from: c */
        private int f24953c;

        public C9116a() {
        }

        /* renamed from: a */
        public JSONObject mo16483a() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(LeakCanaryFileProvider.f132049i, this.f24951a);
                jSONObject.put("size", this.f24952b);
                if (this.f24953c > 0) {
                    jSONObject.put("num", this.f24953c);
                }
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        public int compareTo(Object obj) {
            C9116a aVar = (C9116a) obj;
            if (this.f24952b == aVar.f24952b) {
                return 0;
            }
            if (this.f24952b > aVar.f24952b) {
                return 1;
            }
            return -1;
        }

        public C9116a(String str, long j, int i) {
            this.f24951a = str;
            this.f24952b = j;
            this.f24953c = i;
        }
    }

    /* renamed from: com.bytedance.apm.l.h$b */
    class C9117b {

        /* renamed from: a */
        public String f24954a;

        /* renamed from: b */
        public C9117b f24955b;

        /* renamed from: c */
        public int f24956c;

        /* renamed from: d */
        public int f24957d;

        /* renamed from: e */
        public boolean f24958e;

        /* renamed from: f */
        public long f24959f;

        /* renamed from: h */
        private int f24961h;

        /* renamed from: i */
        private boolean f24962i;

        /* renamed from: a */
        private boolean m18085a() {
            if (this.f24961h == this.f24957d) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private void m18086b() {
            if (TextUtils.equals(this.f24954a, C9114h.this.f24930h)) {
                C9114h.this.f24934l = (long) this.f24956c;
            } else if (TextUtils.equals(this.f24954a, C9114h.this.f24932j)) {
                C9114h.this.f24935m = (long) this.f24956c;
            } else if (TextUtils.equals(this.f24954a, C9114h.this.f24931i)) {
                C9114h.this.f24936n = (long) this.f24956c;
            } else {
                if (TextUtils.equals(this.f24954a, C9114h.this.f24933k)) {
                    C9114h.this.f24937o = (long) this.f24956c;
                }
            }
        }

        private C9117b() {
        }

        /* renamed from: a */
        public final void mo16485a(long j) {
            this.f24956c = (int) (((long) this.f24956c) + j);
            this.f24961h++;
            if (this.f24955b != null && m18085a()) {
                if (this.f24962i) {
                    this.f24955b.f24962i = true;
                }
                if (((long) this.f24956c) >= C9114h.this.f24928b && !this.f24962i) {
                    C9114h.this.mo16480a(this.f24954a, (long) this.f24956c, this.f24961h, this.f24957d);
                    this.f24955b.f24962i = true;
                }
                this.f24955b.mo16485a((long) this.f24956c);
                if (this.f24958e) {
                    C9114h.this.mo16481a(this.f24954a, (long) this.f24956c, this.f24957d, this.f24959f);
                }
                m18086b();
            }
        }
    }

    /* renamed from: com.bytedance.apm.l.h$c */
    static class C9118c extends C9116a {

        /* renamed from: c */
        public long f24963c;

        /* renamed from: d */
        private String f24964d;

        /* renamed from: e */
        private int f24965e;

        /* renamed from: f */
        private long f24966f;

        /* renamed from: a */
        public final JSONObject mo16483a() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(LeakCanaryFileProvider.f132049i, this.f24964d);
                jSONObject.put("size", this.f24963c);
                if (this.f24965e > 0) {
                    jSONObject.put("num", this.f24965e);
                }
                jSONObject.put("outdate_interval", this.f24966f);
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        public final int compareTo(Object obj) {
            C9118c cVar = (C9118c) obj;
            if (this.f24966f == cVar.f24966f) {
                return 0;
            }
            if (this.f24966f > cVar.f24966f) {
                return 1;
            }
            return -1;
        }

        public C9118c(String str, long j, int i, long j2) {
            this.f24964d = str;
            this.f24963c = j;
            this.f24965e = i;
            this.f24966f = j2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo16222c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final long mo16223d() {
        return 120000;
    }

    public C9114h() {
        this.f24927a = 524288000;
        this.f24928b = 524288000;
        this.f24940r = 20;
        this.f24941s = 2592000000L;
        this.f24812e = "disk";
    }

    /* renamed from: a */
    private void m18074a() {
        int i;
        String[] strArr;
        String[] strArr2 = {this.f24930h, this.f24932j};
        int i2 = 0;
        for (int i3 = 2; i2 < i3; i3 = 2) {
            String str = strArr2[i2];
            File file = new File(str);
            C9117b bVar = new C9117b();
            bVar.f24954a = str;
            bVar.f24955b = new C9117b();
            File[] listFiles = file.listFiles();
            if (!(listFiles == null || listFiles.length == 0)) {
                bVar.f24957d = listFiles.length;
                LinkedList linkedList = new LinkedList();
                linkedList.offer(bVar);
                while (!linkedList.isEmpty()) {
                    int size = linkedList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        C9117b bVar2 = (C9117b) linkedList.poll();
                        if (bVar2 != null) {
                            String str2 = bVar2.f24954a;
                            File file2 = new File(str2);
                            strArr = strArr2;
                            if (file2.isFile()) {
                                long length = file2.length();
                                if (length > 0) {
                                    m18076a(str2, length);
                                }
                                if (bVar2.f24955b != null) {
                                    bVar2.f24955b.mo16485a(length);
                                    if (!bVar2.f24955b.f24958e) {
                                        long b = m18077b(file2.lastModified());
                                        if (b > 0) {
                                            i = i4;
                                            mo16481a(str2, length, 0, b);
                                        }
                                    }
                                }
                                i = i4;
                            } else {
                                i = i4;
                                File[] listFiles2 = file2.listFiles();
                                if (listFiles2 == null || listFiles2.length == 0) {
                                    bVar2.f24955b.mo16485a(0);
                                    i4 = i + 1;
                                    strArr2 = strArr;
                                } else {
                                    bVar2.f24957d = listFiles2.length;
                                    for (File file3 : listFiles2) {
                                        C9117b bVar3 = new C9117b();
                                        bVar3.f24955b = bVar2;
                                        bVar3.f24954a = file3.getAbsolutePath();
                                        if (file3.isDirectory() && !bVar2.f24958e) {
                                            long b2 = m18077b(file3.lastModified());
                                            if (b2 > 0) {
                                                bVar3.f24958e = true;
                                                bVar3.f24959f = b2;
                                                linkedList.offer(bVar3);
                                            }
                                        }
                                        linkedList.offer(bVar3);
                                    }
                                }
                            }
                        } else {
                            i = i4;
                            strArr = strArr2;
                        }
                        i4 = i + 1;
                        strArr2 = strArr;
                    }
                }
            }
            i2++;
            strArr2 = strArr2;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16225f() {
        /*
            r15 = this;
            boolean r0 = r15.f24811d
            boolean r1 = r15.f24938p
            if (r1 != 0) goto L_0x00df
            if (r0 != 0) goto L_0x000a
            goto L_0x00df
        L_0x000a:
            java.lang.String r0 = r15.f24930h
            r1 = 1
            if (r0 != 0) goto L_0x0054
            android.content.Context r0 = com.bytedance.apm.C8976c.m17736a()
            java.lang.String r2 = r0.getPackageName()     // Catch:{ Exception -> 0x0052 }
            java.io.File r3 = r0.getFilesDir()     // Catch:{ Exception -> 0x0052 }
            java.lang.String r3 = r3.getParent()     // Catch:{ Exception -> 0x0052 }
            r15.f24930h = r3     // Catch:{ Exception -> 0x0052 }
            java.io.File r3 = r0.getCacheDir()     // Catch:{ Exception -> 0x0052 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0052 }
            r15.f24931i = r3     // Catch:{ Exception -> 0x0052 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0052 }
            r3.<init>()     // Catch:{ Exception -> 0x0052 }
            java.io.File r4 = com.bytedance.apm.p501q.C9183e.m18228a()     // Catch:{ Exception -> 0x0052 }
            r3.append(r4)     // Catch:{ Exception -> 0x0052 }
            java.lang.String r4 = "/Android/data/"
            r3.append(r4)     // Catch:{ Exception -> 0x0052 }
            r3.append(r2)     // Catch:{ Exception -> 0x0052 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0052 }
            r15.f24932j = r2     // Catch:{ Exception -> 0x0052 }
            java.io.File r0 = r0.getExternalCacheDir()     // Catch:{ Exception -> 0x0052 }
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x0052 }
            r15.f24933k = r0     // Catch:{ Exception -> 0x0052 }
            goto L_0x0054
        L_0x0052:
            r15.f24942u = r1
        L_0x0054:
            boolean r0 = r15.f24942u
            if (r0 == 0) goto L_0x005b
            r15.f24938p = r1
            return
        L_0x005b:
            boolean r0 = r15.f24939q
            if (r0 == 0) goto L_0x00a7
            r15.m18074a()     // Catch:{ Throwable -> 0x00c7 }
            long r2 = r15.f24934l     // Catch:{ Throwable -> 0x00c7 }
            long r4 = r15.f24935m     // Catch:{ Throwable -> 0x00c7 }
            r0 = 0
            long r7 = r2 + r4
            long r2 = r15.f24936n     // Catch:{ Throwable -> 0x00c7 }
            long r4 = r15.f24937o     // Catch:{ Throwable -> 0x00c7 }
            r0 = 0
            long r9 = r2 + r4
            java.io.File r0 = android.os.Environment.getDataDirectory()     // Catch:{ Throwable -> 0x00c7 }
            long r2 = r0.getTotalSpace()     // Catch:{ Throwable -> 0x00c7 }
            java.io.File r0 = android.os.Environment.getRootDirectory()     // Catch:{ Throwable -> 0x00c7 }
            long r4 = r0.getTotalSpace()     // Catch:{ Throwable -> 0x00c7 }
            r0 = 0
            long r11 = r2 + r4
            java.io.File r0 = android.os.Environment.getDataDirectory()     // Catch:{ Throwable -> 0x00c7 }
            long r13 = r0.getFreeSpace()     // Catch:{ Throwable -> 0x00c7 }
            r6 = r15
            r6.m18075a(r7, r9, r11, r13)     // Catch:{ Throwable -> 0x00c7 }
            com.bytedance.apm.internal.b r0 = com.bytedance.apm.internal.C9069b.m17971a()     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r2 = "check_disk_last_time"
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00c7 }
            android.content.SharedPreferences r0 = r0.f24779a     // Catch:{ Throwable -> 0x00c7 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Throwable -> 0x00c7 }
            android.content.SharedPreferences$Editor r0 = r0.putLong(r2, r3)     // Catch:{ Throwable -> 0x00c7 }
            r0.apply()     // Catch:{ Throwable -> 0x00c7 }
            goto L_0x00c7
        L_0x00a7:
            android.content.Context r0 = com.bytedance.apm.C8976c.m17736a()     // Catch:{  }
            long r3 = com.bytedance.apm.p501q.C9180b.m18216b(r0)     // Catch:{  }
            android.content.Context r0 = com.bytedance.apm.C8976c.m17736a()     // Catch:{  }
            long r5 = com.bytedance.apm.p501q.C9180b.m18219c(r0)     // Catch:{  }
            long r7 = com.bytedance.apm.p501q.C9180b.m18224f()     // Catch:{  }
            java.io.File r0 = android.os.Environment.getDataDirectory()     // Catch:{  }
            long r9 = r0.getFreeSpace()     // Catch:{  }
            r2 = r15
            r2.m18075a(r3, r5, r7, r9)     // Catch:{  }
        L_0x00c7:
            r15.f24938p = r1
            r15.mo16447h()
            com.bytedance.apm.core.ActivityLifeObserver r0 = com.bytedance.apm.core.ActivityLifeObserver.getInstance()
            r0.unregister(r15)
            java.lang.Class<com.bytedance.services.slardar.config.IConfigManager> r0 = com.bytedance.services.slardar.config.IConfigManager.class
            java.lang.Object r0 = com.bytedance.news.common.service.manager.C12401c.m24975a(r0)
            com.bytedance.services.slardar.config.IConfigManager r0 = (com.bytedance.services.slardar.config.IConfigManager) r0
            r0.unregisterConfigListener(r15)
            return
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p489l.C9114h.mo16225f():void");
    }

    /* renamed from: b */
    private long m18077b(long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis < this.f24941s || currentTimeMillis >= 62899200000L) {
            return 0;
        }
        return currentTimeMillis;
    }

    /* renamed from: a */
    private static List<String> m18073a(C9199p<? extends C9116a> pVar) {
        if (pVar == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (C9116a aVar : pVar.mo16563a()) {
            linkedList.add(aVar.f24951a);
        }
        return linkedList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16219a(JSONObject jSONObject) {
        this.f24939q = jSONObject.optBoolean("dump_switch", false);
        if (this.f24939q) {
            long currentTimeMillis = System.currentTimeMillis() - C9069b.m17971a().f24779a.getLong("check_disk_last_time", 0);
            if (currentTimeMillis < FbUploadTokenTime.group0 && currentTimeMillis > 0) {
                this.f24938p = true;
            }
            if (jSONObject.optInt("dump_threshold") > 0) {
                this.f24927a = ((long) jSONObject.optInt("dump_threshold")) * 1024 * 1024;
            }
            if (jSONObject.optInt("abnormal_folder_size") > 0) {
                this.f24928b = ((long) jSONObject.optInt("abnormal_folder_size")) * 1024 * 1024;
            }
            if (jSONObject.optInt("outdated_days") > 0) {
                this.f24940r = jSONObject.optInt("outdated_days");
            }
            if (jSONObject.optInt("dump_top_count") > 0) {
                this.f24941s = ((long) jSONObject.optInt("dump_top_count")) * FbUploadTokenTime.group0;
            }
        }
    }

    /* renamed from: a */
    private void m18076a(String str, long j) {
        if (C8976c.m17751g()) {
            StringBuilder sb = new StringBuilder("appendExceptionFileQueue: path: ");
            sb.append(str);
            sb.append(", size: ");
            sb.append(j);
            String[] strArr = {sb.toString()};
        }
        if (j <= f24926t) {
            if (this.f24943v == null) {
                this.f24943v = new C9199p<>(this.f24940r);
            }
            this.f24943v.mo16564a(new C9116a(str, j, 1));
        }
    }

    /* renamed from: a */
    public final void mo16480a(String str, long j, int i, int i2) {
        if (j <= f24926t) {
            if (this.f24944w == null) {
                this.f24944w = new C9199p<>(this.f24940r);
            }
            this.f24944w.mo16564a(new C9116a(str, j, i2));
        }
    }

    /* renamed from: a */
    private void m18075a(long j, long j2, long j3, long j4) {
        long j5;
        long j6;
        long j7 = j;
        long j8 = j2;
        long j9 = j3;
        long j10 = j4;
        try {
            if (C8976c.m17751g()) {
                StringBuilder sb = new StringBuilder("disk: data: ");
                sb.append(j7);
                sb.append(" , cache: ");
                sb.append(j8);
                sb.append(" , total: ");
                sb.append(j9);
                sb.append(" , free: ");
                sb.append(j10);
                String[] strArr = {sb.toString()};
            }
            if (j7 > f24926t) {
                j5 = f24926t;
            } else {
                j5 = j7;
            }
            if (j8 > f24926t) {
                j6 = f24926t;
            } else {
                j6 = j8;
            }
            JSONObject jSONObject = new JSONObject();
            if (j7 > 0) {
                jSONObject.put("data", j5);
            }
            if (j8 > 0) {
                jSONObject.put("cache", j6);
            }
            if (j9 > 0) {
                jSONObject.put("total", j9);
            }
            if (j10 > 0) {
                jSONObject.put("rom_free", j10);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (this.f24939q && j5 > this.f24927a) {
                if (this.f24943v != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (C9116a a : this.f24943v.mo16563a()) {
                        JSONObject a2 = a.mo16483a();
                        if (a2 != null) {
                            jSONArray.put(a2);
                        }
                    }
                    jSONObject2.put("top_usage", jSONArray);
                }
                if (this.f24944w != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (C9116a a3 : this.f24944w.mo16563a()) {
                        JSONObject a4 = a3.mo16483a();
                        if (a4 != null) {
                            jSONArray2.put(a4);
                        }
                    }
                    jSONObject2.put("exception_folders", jSONArray2);
                }
                if (this.f24945x != null) {
                    JSONArray jSONArray3 = new JSONArray();
                    for (C9118c a5 : this.f24945x.mo16563a()) {
                        JSONObject a6 = a5.mo16483a();
                        if (a6 != null) {
                            jSONArray3.put(a6);
                        }
                    }
                    jSONObject2.put("outdated_files", jSONArray3);
                }
                if (this.f24929g != null) {
                    List a7 = m18073a(this.f24943v);
                    List a8 = m18073a(this.f24944w);
                    List a9 = m18073a(this.f24945x);
                    ApmDelegate a10 = ApmDelegate.m17947a();
                    final long j11 = j5;
                    final List list = a7;
                    final List list2 = a8;
                    final List list3 = a9;
                    C91151 r18 = new Runnable() {
                        public final void run() {
                        }
                    };
                    a10.mo16430a((Runnable) r18);
                }
                this.f24943v = null;
                this.f24944w = null;
                this.f24945x = null;
            }
            C9024f fVar = new C9024f("disk", "storageUsed", false, jSONObject, null, jSONObject2);
            m17983a(fVar);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo16481a(String str, long j, int i, long j2) {
        if (C8976c.m17751g()) {
            StringBuilder sb = new StringBuilder("appendutdatedFileQueue: path: ");
            sb.append(str);
            sb.append(", size: ");
            sb.append(j);
            String[] strArr = {sb.toString()};
        }
        if (j >= 102400 && j <= f24926t) {
            if (this.f24945x == null) {
                this.f24945x = new C9199p<>(this.f24940r);
            }
            C9199p<C9118c> pVar = this.f24945x;
            C9118c cVar = new C9118c(str, j, i, j2);
            pVar.mo16564a(cVar);
        }
    }
}
