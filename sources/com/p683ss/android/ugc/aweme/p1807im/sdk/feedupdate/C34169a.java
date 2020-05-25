package com.p683ss.android.ugc.aweme.p1807im.sdk.feedupdate;

import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.feedupdate.FeedUpdate.C34166d;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.a */
public final class C34169a {

    /* renamed from: c */
    private static C34169a f88290c = new C34169a();

    /* renamed from: a */
    public ConcurrentHashMap<String, C34172b> f88291a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public volatile boolean f88292b = false;

    /* renamed from: a */
    public static C34169a m77980a() {
        return f88290c;
    }

    /* renamed from: f */
    private void m77984f() {
        if (!this.f88292b) {
            C18842a.m45932a(new Runnable() {
                public final void run() {
                    C34169a.this.mo72161d();
                }
            });
        }
    }

    /* renamed from: e */
    private static String m77983e() {
        String currentUserID = BaseUserService.getBaseUserService_Monster().getCurrentUserID();
        StringBuilder sb = new StringBuilder("update_video_data_");
        sb.append(currentUserID);
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo72158b() {
        if (!this.f88292b) {
            this.f88292b = true;
            C18842a.m45932a(new Runnable() {
                public final void run() {
                    C34169a aVar = C34169a.this;
                    aVar.f88291a.clear();
                    ArrayList c = aVar.mo72160c();
                    if (!C23715d.m58202a((Collection<T>) c)) {
                        Iterator it = c.iterator();
                        while (it.hasNext()) {
                            C34172b bVar = (C34172b) it.next();
                            bVar.generate();
                            if (bVar.getTagCount() > 0) {
                                aVar.f88291a.put(bVar.getUid(), bVar);
                            }
                        }
                    }
                    C34169a aVar2 = C34169a.this;
                    FeedUpdate a = FeedUpdateApiManager.m77979a(0);
                    if (a != null && a.getStatusCode() == 0 && !C23715d.m58202a((Collection<T>) a.getItems())) {
                        for (C34166d dVar : a.getItems()) {
                            if (aVar2.f88291a.containsKey(String.valueOf(dVar.getUid()))) {
                                ((C34172b) aVar2.f88291a.get(String.valueOf(dVar.getUid()))).add(dVar);
                            } else {
                                C34172b bVar2 = new C34172b(dVar);
                                aVar2.f88291a.put(bVar2.getUid(), bVar2);
                            }
                        }
                    }
                    aVar2.mo72161d();
                    C34169a.this.f88292b = false;
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo72161d() {
        ArrayList arrayList = new ArrayList();
        for (Entry value : this.f88291a.entrySet()) {
            C34172b bVar = (C34172b) value.getValue();
            if (bVar.getTagCount() > 0) {
                arrayList.add(bVar);
            } else {
                this.f88291a.remove(bVar.getUid());
            }
        }
        m77982a(arrayList);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0049, code lost:
        if (r2 == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x004f, code lost:
        if (r2 != null) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x003e A[SYNTHETIC, Splitter:B:31:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0057 A[SYNTHETIC, Splitter:B:50:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<com.p683ss.android.ugc.aweme.p1807im.sdk.feedupdate.C34172b> mo72160c() {
        /*
            r5 = this;
            r0 = 0
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ Exception -> 0x0053, all -> 0x003a }
            java.lang.String r2 = m77983e()     // Catch:{ Exception -> 0x0053, all -> 0x003a }
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ Exception -> 0x0053, all -> 0x003a }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0038, all -> 0x0033 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0038, all -> 0x0033 }
            java.lang.Object r3 = r2.readObject()     // Catch:{ Exception -> 0x0055, all -> 0x002d }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ Exception -> 0x0055, all -> 0x002d }
            r2.close()     // Catch:{ Exception -> 0x0028, all -> 0x0021 }
            if (r1 == 0) goto L_0x002b
        L_0x001d:
            r1.close()     // Catch:{ Exception -> 0x002b }
            goto L_0x002b
        L_0x0021:
            r0 = move-exception
            if (r1 == 0) goto L_0x0027
            r1.close()     // Catch:{ Exception -> 0x0027 }
        L_0x0027:
            throw r0
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x001d
        L_0x002b:
            r0 = r3
            goto L_0x006b
        L_0x002d:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r0 = r2
            r2 = r4
            goto L_0x003c
        L_0x0033:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
            goto L_0x003c
        L_0x0038:
            r2 = r0
            goto L_0x0055
        L_0x003a:
            r1 = move-exception
            r2 = r0
        L_0x003c:
            if (r0 == 0) goto L_0x004f
            r0.close()     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            goto L_0x004f
        L_0x0042:
            r0 = move-exception
            if (r2 == 0) goto L_0x0048
            r2.close()     // Catch:{ Exception -> 0x0048 }
        L_0x0048:
            throw r0
        L_0x0049:
            if (r2 == 0) goto L_0x0052
        L_0x004b:
            r2.close()     // Catch:{ Exception -> 0x0052 }
            goto L_0x0052
        L_0x004f:
            if (r2 == 0) goto L_0x0052
            goto L_0x004b
        L_0x0052:
            throw r1
        L_0x0053:
            r1 = r0
            r2 = r1
        L_0x0055:
            if (r2 == 0) goto L_0x0068
            r2.close()     // Catch:{ Exception -> 0x0062, all -> 0x005b }
            goto L_0x0068
        L_0x005b:
            r0 = move-exception
            if (r1 == 0) goto L_0x0061
            r1.close()     // Catch:{ Exception -> 0x0061 }
        L_0x0061:
            throw r0
        L_0x0062:
            if (r1 == 0) goto L_0x006b
        L_0x0064:
            r1.close()     // Catch:{ Exception -> 0x006b }
            goto L_0x006b
        L_0x0068:
            if (r1 == 0) goto L_0x006b
            goto L_0x0064
        L_0x006b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.feedupdate.C34169a.mo72160c():java.util.ArrayList");
    }

    /* renamed from: a */
    public static String m77981a(int i) {
        if (i > 99) {
            return "99+";
        }
        return String.valueOf(i);
    }

    /* renamed from: b */
    public final void mo72159b(String str) {
        this.f88291a.remove(str);
        m77984f();
    }

    /* renamed from: a */
    public final int mo72157a(String str) {
        if (this.f88291a.containsKey(str)) {
            return ((C34172b) this.f88291a.get(str)).getTagCount();
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0055, code lost:
        if (r1 == null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x005b, code lost:
        if (r1 != null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x006d, code lost:
        if (r1 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0070, code lost:
        if (r1 != null) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004a A[SYNTHETIC, Splitter:B:33:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0062 A[SYNTHETIC, Splitter:B:52:0x0062] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m77982a(java.util.ArrayList<com.p683ss.android.ugc.aweme.p1807im.sdk.feedupdate.C34172b> r5) {
        /*
            r4 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = m77983e()
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0016
            boolean r0 = r0.delete()
            if (r0 != 0) goto L_0x0016
            return
        L_0x0016:
            r0 = 0
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ Exception -> 0x005f, all -> 0x0046 }
            java.lang.String r2 = m77983e()     // Catch:{ Exception -> 0x005f, all -> 0x0046 }
            r3 = 0
            java.io.FileOutputStream r1 = r1.openFileOutput(r2, r3)     // Catch:{ Exception -> 0x005f, all -> 0x0046 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x0060, all -> 0x0044 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0060, all -> 0x0044 }
            r2.writeObject(r5)     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            r2.close()     // Catch:{ Exception -> 0x003c, all -> 0x0035 }
            if (r1 == 0) goto L_0x0073
        L_0x0031:
            r1.close()     // Catch:{ Exception -> 0x0073 }
            goto L_0x0073
        L_0x0035:
            r5 = move-exception
            if (r1 == 0) goto L_0x003b
            r1.close()     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            throw r5
        L_0x003c:
            if (r1 == 0) goto L_0x0073
            goto L_0x0031
        L_0x003f:
            r5 = move-exception
            r0 = r2
            goto L_0x0048
        L_0x0042:
            r0 = r2
            goto L_0x0060
        L_0x0044:
            r5 = move-exception
            goto L_0x0048
        L_0x0046:
            r5 = move-exception
            r1 = r0
        L_0x0048:
            if (r0 == 0) goto L_0x005b
            r0.close()     // Catch:{ Exception -> 0x0055, all -> 0x004e }
            goto L_0x005b
        L_0x004e:
            r5 = move-exception
            if (r1 == 0) goto L_0x0054
            r1.close()     // Catch:{ Exception -> 0x0054 }
        L_0x0054:
            throw r5
        L_0x0055:
            if (r1 == 0) goto L_0x005e
        L_0x0057:
            r1.close()     // Catch:{ Exception -> 0x005e }
            goto L_0x005e
        L_0x005b:
            if (r1 == 0) goto L_0x005e
            goto L_0x0057
        L_0x005e:
            throw r5
        L_0x005f:
            r1 = r0
        L_0x0060:
            if (r0 == 0) goto L_0x0070
            r0.close()     // Catch:{ Exception -> 0x006d, all -> 0x0066 }
            goto L_0x0070
        L_0x0066:
            r5 = move-exception
            if (r1 == 0) goto L_0x006c
            r1.close()     // Catch:{ Exception -> 0x006c }
        L_0x006c:
            throw r5
        L_0x006d:
            if (r1 == 0) goto L_0x0073
            goto L_0x0031
        L_0x0070:
            if (r1 == 0) goto L_0x0073
            goto L_0x0031
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.feedupdate.C34169a.m77982a(java.util.ArrayList):void");
    }
}
