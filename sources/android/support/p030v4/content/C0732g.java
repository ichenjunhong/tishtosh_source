package android.support.p030v4.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: android.support.v4.content.g */
public final class C0732g {

    /* renamed from: f */
    private static final Object f2539f = new Object();

    /* renamed from: g */
    private static C0732g f2540g;

    /* renamed from: a */
    final Context f2541a;

    /* renamed from: b */
    final HashMap<BroadcastReceiver, ArrayList<C0735b>> f2542b = new HashMap<>();

    /* renamed from: c */
    final ArrayList<C0734a> f2543c = new ArrayList<>();

    /* renamed from: d */
    private final HashMap<String, ArrayList<C0735b>> f2544d = new HashMap<>();

    /* renamed from: e */
    private final Handler f2545e;

    /* renamed from: android.support.v4.content.g$a */
    static final class C0734a {

        /* renamed from: a */
        final Intent f2547a;

        /* renamed from: b */
        final ArrayList<C0735b> f2548b;

        C0734a(Intent intent, ArrayList<C0735b> arrayList) {
            this.f2547a = intent;
            this.f2548b = arrayList;
        }
    }

    /* renamed from: android.support.v4.content.g$b */
    static final class C0735b {

        /* renamed from: a */
        final IntentFilter f2549a;

        /* renamed from: b */
        final BroadcastReceiver f2550b;

        /* renamed from: c */
        boolean f2551c;

        /* renamed from: d */
        boolean f2552d;

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f2550b);
            sb.append(" filter=");
            sb.append(this.f2549a);
            if (this.f2552d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }

        C0735b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f2549a = intentFilter;
            this.f2550b = broadcastReceiver;
        }
    }

    /* renamed from: a */
    public static C0732g m2130a(Context context) {
        C0732g gVar;
        synchronized (f2539f) {
            if (f2540g == null) {
                f2540g = new C0732g(context.getApplicationContext());
            }
            gVar = f2540g;
        }
        return gVar;
    }

    private C0732g(Context context) {
        this.f2541a = context;
        this.f2545e = new Handler(context.getMainLooper()) {
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
                r2 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
                if (r2 >= r1.length) goto L_0x000b;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
                r3 = r1[r2];
                r4 = r3.f2548b.size();
                r5 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
                if (r5 >= r4) goto L_0x004d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
                r6 = (android.support.p030v4.content.C0732g.C0735b) r3.f2548b.get(r5);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
                if (r6.f2552d != false) goto L_0x004a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
                r6.f2550b.onReceive(r10.f2541a, r3.f2547a);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
                r5 = r5 + 1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
                r2 = r2 + 1;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void handleMessage(android.os.Message r10) {
                /*
                    r9 = this;
                    int r0 = r10.what
                    r1 = 1
                    if (r0 == r1) goto L_0x0009
                    super.handleMessage(r10)
                    goto L_0x0017
                L_0x0009:
                    android.support.v4.content.g r10 = android.support.p030v4.content.C0732g.this
                L_0x000b:
                    java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.support.v4.content.g$b>> r0 = r10.f2542b
                    monitor-enter(r0)
                    java.util.ArrayList<android.support.v4.content.g$a> r1 = r10.f2543c     // Catch:{ all -> 0x0050 }
                    int r1 = r1.size()     // Catch:{ all -> 0x0050 }
                    if (r1 > 0) goto L_0x0018
                    monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                L_0x0017:
                    return
                L_0x0018:
                    android.support.v4.content.g$a[] r1 = new android.support.p030v4.content.C0732g.C0734a[r1]     // Catch:{ all -> 0x0050 }
                    java.util.ArrayList<android.support.v4.content.g$a> r2 = r10.f2543c     // Catch:{ all -> 0x0050 }
                    r2.toArray(r1)     // Catch:{ all -> 0x0050 }
                    java.util.ArrayList<android.support.v4.content.g$a> r2 = r10.f2543c     // Catch:{ all -> 0x0050 }
                    r2.clear()     // Catch:{ all -> 0x0050 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                    r0 = 0
                    r2 = 0
                L_0x0027:
                    int r3 = r1.length
                    if (r2 >= r3) goto L_0x000b
                    r3 = r1[r2]
                    java.util.ArrayList<android.support.v4.content.g$b> r4 = r3.f2548b
                    int r4 = r4.size()
                    r5 = 0
                L_0x0033:
                    if (r5 >= r4) goto L_0x004d
                    java.util.ArrayList<android.support.v4.content.g$b> r6 = r3.f2548b
                    java.lang.Object r6 = r6.get(r5)
                    android.support.v4.content.g$b r6 = (android.support.p030v4.content.C0732g.C0735b) r6
                    boolean r7 = r6.f2552d
                    if (r7 != 0) goto L_0x004a
                    android.content.BroadcastReceiver r6 = r6.f2550b
                    android.content.Context r7 = r10.f2541a
                    android.content.Intent r8 = r3.f2547a
                    r6.onReceive(r7, r8)
                L_0x004a:
                    int r5 = r5 + 1
                    goto L_0x0033
                L_0x004d:
                    int r2 = r2 + 1
                    goto L_0x0027
                L_0x0050:
                    r10 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                    throw r10
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.content.C0732g.C07331.handleMessage(android.os.Message):void");
            }
        };
    }

    /* renamed from: a */
    public final void mo2402a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f2542b) {
            ArrayList arrayList = (ArrayList) this.f2542b.remove(broadcastReceiver);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C0735b bVar = (C0735b) arrayList.get(size);
                    bVar.f2552d = true;
                    for (int i = 0; i < bVar.f2549a.countActions(); i++) {
                        String action = bVar.f2549a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) this.f2544d.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                C0735b bVar2 = (C0735b) arrayList2.get(size2);
                                if (bVar2.f2550b == broadcastReceiver) {
                                    bVar2.f2552d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f2544d.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c2, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c5, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2404a(android.content.Intent r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.support.v4.content.g$b>> r2 = r1.f2542b
            monitor-enter(r2)
            java.lang.String r10 = r23.getAction()     // Catch:{ all -> 0x00c6 }
            android.content.Context r3 = r1.f2541a     // Catch:{ all -> 0x00c6 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x00c6 }
            java.lang.String r11 = r0.resolveTypeIfNeeded(r3)     // Catch:{ all -> 0x00c6 }
            android.net.Uri r12 = r23.getData()     // Catch:{ all -> 0x00c6 }
            java.lang.String r13 = r23.getScheme()     // Catch:{ all -> 0x00c6 }
            java.util.Set r14 = r23.getCategories()     // Catch:{ all -> 0x00c6 }
            int r3 = r23.getFlags()     // Catch:{ all -> 0x00c6 }
            r3 = r3 & 8
            r9 = 1
            if (r3 == 0) goto L_0x002d
            r16 = 1
            goto L_0x002f
        L_0x002d:
            r16 = 0
        L_0x002f:
            java.util.HashMap<java.lang.String, java.util.ArrayList<android.support.v4.content.g$b>> r3 = r1.f2544d     // Catch:{ all -> 0x00c6 }
            java.lang.String r4 = r23.getAction()     // Catch:{ all -> 0x00c6 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x00c6 }
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x00c6 }
            if (r8 == 0) goto L_0x00c3
            r3 = 0
            r6 = r3
            r7 = 0
        L_0x0041:
            int r3 = r8.size()     // Catch:{ all -> 0x00c6 }
            if (r7 >= r3) goto L_0x0093
            java.lang.Object r3 = r8.get(r7)     // Catch:{ all -> 0x00c6 }
            r5 = r3
            android.support.v4.content.g$b r5 = (android.support.p030v4.content.C0732g.C0735b) r5     // Catch:{ all -> 0x00c6 }
            boolean r3 = r5.f2551c     // Catch:{ all -> 0x00c6 }
            if (r3 == 0) goto L_0x005d
            r19 = r7
            r20 = r8
            r18 = r10
            r21 = r11
            r11 = 1
            r10 = r6
            goto L_0x0088
        L_0x005d:
            android.content.IntentFilter r3 = r5.f2549a     // Catch:{ all -> 0x00c6 }
            java.lang.String r17 = "LocalBroadcastManager"
            r4 = r10
            r15 = r5
            r5 = r11
            r18 = r10
            r10 = r6
            r6 = r13
            r19 = r7
            r7 = r12
            r20 = r8
            r8 = r14
            r21 = r11
            r11 = 1
            r9 = r17
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00c6 }
            if (r3 < 0) goto L_0x0088
            if (r10 != 0) goto L_0x0081
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x00c6 }
            r6.<init>()     // Catch:{ all -> 0x00c6 }
            goto L_0x0082
        L_0x0081:
            r6 = r10
        L_0x0082:
            r6.add(r15)     // Catch:{ all -> 0x00c6 }
            r15.f2551c = r11     // Catch:{ all -> 0x00c6 }
            goto L_0x0089
        L_0x0088:
            r6 = r10
        L_0x0089:
            int r7 = r19 + 1
            r10 = r18
            r8 = r20
            r11 = r21
            r9 = 1
            goto L_0x0041
        L_0x0093:
            r10 = r6
            r11 = 1
            if (r10 == 0) goto L_0x00c3
            r3 = 0
        L_0x0098:
            int r4 = r10.size()     // Catch:{ all -> 0x00c6 }
            if (r3 >= r4) goto L_0x00aa
            java.lang.Object r4 = r10.get(r3)     // Catch:{ all -> 0x00c6 }
            android.support.v4.content.g$b r4 = (android.support.p030v4.content.C0732g.C0735b) r4     // Catch:{ all -> 0x00c6 }
            r5 = 0
            r4.f2551c = r5     // Catch:{ all -> 0x00c6 }
            int r3 = r3 + 1
            goto L_0x0098
        L_0x00aa:
            java.util.ArrayList<android.support.v4.content.g$a> r3 = r1.f2543c     // Catch:{ all -> 0x00c6 }
            android.support.v4.content.g$a r4 = new android.support.v4.content.g$a     // Catch:{ all -> 0x00c6 }
            r4.<init>(r0, r10)     // Catch:{ all -> 0x00c6 }
            r3.add(r4)     // Catch:{ all -> 0x00c6 }
            android.os.Handler r0 = r1.f2545e     // Catch:{ all -> 0x00c6 }
            boolean r0 = r0.hasMessages(r11)     // Catch:{ all -> 0x00c6 }
            if (r0 != 0) goto L_0x00c1
            android.os.Handler r0 = r1.f2545e     // Catch:{ all -> 0x00c6 }
            r0.sendEmptyMessage(r11)     // Catch:{ all -> 0x00c6 }
        L_0x00c1:
            monitor-exit(r2)     // Catch:{ all -> 0x00c6 }
            return r11
        L_0x00c3:
            monitor-exit(r2)     // Catch:{ all -> 0x00c6 }
            r0 = 0
            return r0
        L_0x00c6:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00c6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.content.C0732g.mo2404a(android.content.Intent):boolean");
    }

    /* renamed from: a */
    public final void mo2403a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f2542b) {
            C0735b bVar = new C0735b(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) this.f2542b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f2542b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(bVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.f2544d.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f2544d.put(action, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }
}
