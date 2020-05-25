package com.bytedance.polaris.p826d;

import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.bytedance.polaris.p821a.C12563i;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.polaris.d.f */
public final class C12634f {

    /* renamed from: b */
    public static Runnable f33203b = new Runnable() {
        public final void run() {
            C12634f a = C12634f.m25386a();
            while (true) {
                try {
                    String b = a.mo23733b();
                    if (!TextUtils.isEmpty(b)) {
                        if (C12650p.m25425c(b)) {
                            if (C12563i.m25225g() == null) {
                                break;
                            }
                            String substring = b.substring(b.lastIndexOf(ClassUtils.PACKAGE_SEPARATOR) + 1);
                            C12625a aVar = new C12625a(C12563i.m25215a());
                            String a2 = C9395d.m18571a(b);
                            String b2 = aVar.mo23728b(a2, substring);
                            String a3 = C12625a.m25360a(a2, substring);
                            String a4 = aVar.mo23726a(a3);
                            if (C12625a.m25361a() && !new File(b2).isFile() && C12563i.m25225g() != null) {
                                C12563i.m25225g().mo23616a(b, 5120000, a4, a3);
                            }
                            a.mo23734b(b);
                        }
                    } else {
                        break;
                    }
                } catch (Throwable unused) {
                }
            }
            a.f33205a = false;
        }
    };

    /* renamed from: c */
    private static final C12649o<C12634f> f33204c = new C12649o<C12634f>() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ Object mo23595a() {
            return new C12634f();
        }
    };

    /* renamed from: a */
    public volatile boolean f33205a;

    /* renamed from: d */
    private List<String> f33206d = new ArrayList();

    /* renamed from: a */
    public static C12634f m25386a() {
        return (C12634f) f33204c.mo23740b();
    }

    /* renamed from: b */
    public final synchronized String mo23733b() {
        if (this.f33206d != null) {
            if (!this.f33206d.isEmpty()) {
                return (String) this.f33206d.get(0);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo23731a(java.util.List<java.lang.String> r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x002d
            int r0 = r3.size()     // Catch:{ all -> 0x002a }
            if (r0 > 0) goto L_0x000a
            goto L_0x002d
        L_0x000a:
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x002a }
        L_0x000e:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x002a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x002a }
            java.util.List<java.lang.String> r1 = r2.f33206d     // Catch:{ all -> 0x002a }
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x000e
            java.util.List<java.lang.String> r1 = r2.f33206d     // Catch:{ all -> 0x002a }
            r1.add(r0)     // Catch:{ all -> 0x002a }
            goto L_0x000e
        L_0x0028:
            monitor-exit(r2)
            return
        L_0x002a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x002d:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.p826d.C12634f.mo23731a(java.util.List):void");
    }

    /* renamed from: b */
    public final synchronized void mo23734b(String str) {
        if (this.f33206d != null) {
            this.f33206d.remove(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0020, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo23732a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0021 }
            r1 = 0
            if (r0 == 0) goto L_0x000a
            monitor-exit(r2)
            return r1
        L_0x000a:
            java.util.List<java.lang.String> r0 = r2.f33206d     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001f
            java.util.List<java.lang.String> r0 = r2.f33206d     // Catch:{ all -> 0x0021 }
            int r0 = r0.size()     // Catch:{ all -> 0x0021 }
            if (r0 > 0) goto L_0x0017
            goto L_0x001f
        L_0x0017:
            java.util.List<java.lang.String> r0 = r2.f33206d     // Catch:{ all -> 0x0021 }
            boolean r3 = r0.contains(r3)     // Catch:{ all -> 0x0021 }
            monitor-exit(r2)
            return r3
        L_0x001f:
            monitor-exit(r2)
            return r1
        L_0x0021:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.p826d.C12634f.mo23732a(java.lang.String):boolean");
    }
}
