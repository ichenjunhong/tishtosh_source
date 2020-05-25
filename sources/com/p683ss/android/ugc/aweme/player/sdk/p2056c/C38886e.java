package com.p683ss.android.ugc.aweme.player.sdk.p2056c;

import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.p683ss.android.ugc.aweme.player.sdk.C38854a;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38856b;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38857c;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38858d;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38865f;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38866g;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38868g;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38869h;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.playerkit.p2492a.C50101a;
import com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c;
import com.p683ss.android.ugc.playerkit.p2494c.C50120i;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.c.e */
public final class C38886e implements C38869h {

    /* renamed from: a */
    private C38885d f99028a;

    /* renamed from: b */
    private C38878b f99029b;

    /* renamed from: c */
    private Surface f99030c;

    /* renamed from: d */
    private WeakReference<C38871j> f99031d;

    /* renamed from: e */
    private C50101a f99032e;

    /* renamed from: f */
    private C38856b f99033f;

    /* renamed from: g */
    private C38868g f99034g;

    /* renamed from: h */
    private C38857c f99035h;

    /* renamed from: p */
    public final void mo78920p() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if ((r2.f99023e.f98997f == null) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0083, code lost:
        if (r4 == false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0174, code lost:
        if (r2.f99023e.f98999h == false) goto L_0x0177;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x021f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78899a(com.p683ss.android.ugc.playerkit.p2494c.C50120i r10) {
        /*
            r9 = this;
            boolean r0 = com.p683ss.android.ugc.aweme.player.sdk.C38854a.f98960a
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "SimplifyAsyncPlayerV3"
            java.lang.String r1 = "prepare()"
            com.p683ss.android.ugc.aweme.player.sdk.C38854a.m86290a(r0, r1)
        L_0x000b:
            if (r10 != 0) goto L_0x000e
            return
        L_0x000e:
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.player.sdk.a.j> r0 = r9.f99031d
            r1 = 0
            if (r0 == 0) goto L_0x001c
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.player.sdk.a.j> r0 = r9.f99031d
            java.lang.Object r0 = r0.get()
            com.ss.android.ugc.aweme.player.sdk.a.j r0 = (com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j) r0
            goto L_0x001d
        L_0x001c:
            r0 = r1
        L_0x001d:
            com.ss.android.ugc.aweme.player.sdk.c.d r2 = r9.f99028a
            com.ss.android.ugc.aweme.player.sdk.c.b r3 = r2.f99023e
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x004a
            java.lang.String r3 = r10.f125572d
            com.ss.android.ugc.aweme.player.sdk.c.b r6 = r2.f99023e
            java.lang.String r6 = r6.f98992a
            boolean r3 = android.text.TextUtils.equals(r3, r6)
            if (r3 != 0) goto L_0x003c
            com.ss.android.ugc.aweme.player.sdk.c.b r3 = r2.f99023e
            com.ss.android.ugc.playerkit.c.i r3 = r3.f98997f
            if (r3 != 0) goto L_0x0039
            r3 = 1
            goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            if (r3 == 0) goto L_0x004a
        L_0x003c:
            com.ss.android.ugc.aweme.player.sdk.c.b r3 = r2.f99023e
            boolean r3 = r3.f98998g
            if (r3 != 0) goto L_0x004a
            com.ss.android.ugc.aweme.player.sdk.c.b r3 = r2.f99023e
            boolean r3 = r3.f98999h
            if (r3 != 0) goto L_0x004a
            r3 = 0
            goto L_0x004b
        L_0x004a:
            r3 = 1
        L_0x004b:
            if (r3 == 0) goto L_0x01bd
            com.ss.android.ugc.aweme.player.sdk.c.c r6 = r2.f99026h
            boolean r6 = r6.f99015e
            if (r6 == 0) goto L_0x0199
            com.ss.android.ugc.aweme.player.sdk.c.c r6 = r2.f99026h
            int r6 = r6.f99018h
            if (r6 != 0) goto L_0x0087
            boolean r6 = com.p683ss.android.ugc.aweme.player.sdk.C38854a.f98960a
            if (r6 == 0) goto L_0x0072
            java.lang.String r6 = "PlaySessionManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "startSession single session reuse enabled, mCurrentSession:"
            r7.<init>(r8)
            com.ss.android.ugc.aweme.player.sdk.c.b r8 = r2.f99023e
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.p683ss.android.ugc.aweme.player.sdk.C38854a.m86290a(r6, r7)
        L_0x0072:
            com.ss.android.ugc.aweme.player.sdk.c.b r6 = r2.f99023e
            if (r6 == 0) goto L_0x01bb
            com.ss.android.ugc.aweme.player.sdk.c.b r3 = r2.f99023e
            boolean r3 = r3.f98998g
            if (r3 != 0) goto L_0x0082
            com.ss.android.ugc.aweme.player.sdk.c.b r3 = r2.f99023e
            boolean r3 = r3.f98999h
            if (r3 == 0) goto L_0x0083
        L_0x0082:
            r4 = 1
        L_0x0083:
            if (r4 != 0) goto L_0x01c3
            goto L_0x01be
        L_0x0087:
            boolean r3 = com.p683ss.android.ugc.aweme.player.sdk.C38854a.f98960a
            if (r3 == 0) goto L_0x00af
            java.lang.String r3 = "PlaySessionManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "startSession session pool enabled, session pool size:"
            r6.<init>(r7)
            java.util.List<com.ss.android.ugc.aweme.player.sdk.c.b> r7 = r2.f99022d
            if (r7 != 0) goto L_0x009b
            java.lang.String r7 = "null"
            goto L_0x00a5
        L_0x009b:
            java.util.List<com.ss.android.ugc.aweme.player.sdk.c.b> r7 = r2.f99022d
            int r7 = r7.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
        L_0x00a5:
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.p683ss.android.ugc.aweme.player.sdk.C38854a.m86290a(r3, r6)
        L_0x00af:
            com.ss.android.ugc.aweme.player.sdk.c.b r3 = r2.f99023e
            java.util.List<com.ss.android.ugc.aweme.player.sdk.c.b> r6 = r2.f99022d
            if (r6 == 0) goto L_0x0156
            java.util.List<com.ss.android.ugc.aweme.player.sdk.c.b> r6 = r2.f99022d
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0156
            java.util.List<com.ss.android.ugc.aweme.player.sdk.c.b> r6 = r2.f99022d
            java.lang.Object r6 = r6.remove(r4)
            com.ss.android.ugc.aweme.player.sdk.c.b r6 = (com.p683ss.android.ugc.aweme.player.sdk.p2056c.C38878b) r6
            r2.f99023e = r6
            boolean r6 = com.p683ss.android.ugc.aweme.player.sdk.C38854a.f98960a
            if (r6 == 0) goto L_0x00ee
            java.lang.String r6 = "PlaySessionManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "startSession reuse session:"
            r7.<init>(r8)
            com.ss.android.ugc.aweme.player.sdk.c.b r8 = r2.f99023e
            r7.append(r8)
            java.lang.String r8 = ", session pool size:"
            r7.append(r8)
            java.util.List<com.ss.android.ugc.aweme.player.sdk.c.b> r8 = r2.f99022d
            int r8 = r8.size()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.p683ss.android.ugc.aweme.player.sdk.C38854a.m86290a(r6, r7)
        L_0x00ee:
            if (r3 == 0) goto L_0x014f
            java.util.List<com.ss.android.ugc.aweme.player.sdk.c.b> r6 = r2.f99022d
            boolean r6 = r6.contains(r3)
            if (r6 != 0) goto L_0x014f
            java.util.List<com.ss.android.ugc.aweme.player.sdk.c.b> r6 = r2.f99022d
            int r6 = r6.size()
            com.ss.android.ugc.aweme.player.sdk.c.c r7 = r2.f99026h
            int r7 = r7.f99018h
            if (r6 >= r7) goto L_0x0133
            com.p683ss.android.ugc.aweme.player.sdk.p2056c.C38885d.m86452a(r3)
            java.util.List<com.ss.android.ugc.aweme.player.sdk.c.b> r6 = r2.f99022d
            r6.add(r3)
            boolean r6 = com.p683ss.android.ugc.aweme.player.sdk.C38854a.f98960a
            if (r6 == 0) goto L_0x01c3
            java.lang.String r6 = "PlaySessionManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "startSession recycle session:"
            r7.<init>(r8)
            r7.append(r3)
            java.lang.String r3 = ", session pool size:"
            r7.append(r3)
            java.util.List<com.ss.android.ugc.aweme.player.sdk.c.b> r3 = r2.f99022d
            int r3 = r3.size()
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            com.p683ss.android.ugc.aweme.player.sdk.C38854a.m86290a(r6, r3)
            goto L_0x01c3
        L_0x0133:
            r3.mo78945c()
            boolean r6 = com.p683ss.android.ugc.aweme.player.sdk.C38854a.f98960a
            if (r6 == 0) goto L_0x01c3
            java.lang.String r6 = "PlaySessionManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "startSession pool full, release session:"
            r7.<init>(r8)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            com.p683ss.android.ugc.aweme.player.sdk.C38854a.m86290a(r6, r3)
            goto L_0x01c3
        L_0x014f:
            if (r3 == 0) goto L_0x01c3
            com.p683ss.android.ugc.aweme.player.sdk.p2056c.C38885d.m86452a(r3)
            goto L_0x01c3
        L_0x0156:
            java.util.List<com.ss.android.ugc.aweme.player.sdk.c.b> r6 = r2.f99022d
            if (r6 == 0) goto L_0x0166
            if (r3 == 0) goto L_0x0166
            java.util.List<com.ss.android.ugc.aweme.player.sdk.c.b> r4 = r2.f99022d
            r4.add(r3)
            com.p683ss.android.ugc.aweme.player.sdk.p2056c.C38885d.m86452a(r3)
        L_0x0164:
            r4 = 1
            goto L_0x0177
        L_0x0166:
            com.ss.android.ugc.aweme.player.sdk.c.b r3 = r2.f99023e
            if (r3 == 0) goto L_0x0164
            com.ss.android.ugc.aweme.player.sdk.c.b r3 = r2.f99023e
            boolean r3 = r3.f98998g
            if (r3 != 0) goto L_0x0164
            com.ss.android.ugc.aweme.player.sdk.c.b r3 = r2.f99023e
            boolean r3 = r3.f98999h
            if (r3 == 0) goto L_0x0177
            goto L_0x0164
        L_0x0177:
            boolean r3 = com.p683ss.android.ugc.aweme.player.sdk.C38854a.f98960a
            if (r3 == 0) goto L_0x01c3
            java.lang.String r3 = "PlaySessionManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "startSession pool empty, current session:"
            r6.<init>(r7)
            com.ss.android.ugc.aweme.player.sdk.c.b r7 = r2.f99023e
            r6.append(r7)
            java.lang.String r7 = ", createNewSession:"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            com.p683ss.android.ugc.aweme.player.sdk.C38854a.m86290a(r3, r6)
            goto L_0x01c3
        L_0x0199:
            boolean r4 = com.p683ss.android.ugc.aweme.player.sdk.C38854a.f98960a
            if (r4 == 0) goto L_0x01b2
            java.lang.String r4 = "PlaySessionManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "startSession session reuse not enabled release current session:"
            r6.<init>(r7)
            com.ss.android.ugc.aweme.player.sdk.c.b r7 = r2.f99023e
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.p683ss.android.ugc.aweme.player.sdk.C38854a.m86290a(r4, r6)
        L_0x01b2:
            com.ss.android.ugc.aweme.player.sdk.c.b r4 = r2.f99023e
            if (r4 == 0) goto L_0x01bb
            com.ss.android.ugc.aweme.player.sdk.c.b r4 = r2.f99023e
            r4.mo78945c()
        L_0x01bb:
            r4 = r3
            goto L_0x01c3
        L_0x01bd:
            r4 = r3
        L_0x01be:
            com.ss.android.ugc.aweme.player.sdk.c.b r3 = r2.f99023e
            com.p683ss.android.ugc.aweme.player.sdk.p2056c.C38885d.m86452a(r3)
        L_0x01c3:
            boolean r3 = com.p683ss.android.ugc.aweme.player.sdk.C38854a.f98960a
            if (r3 == 0) goto L_0x021d
            java.lang.String r3 = "PlaySessionManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "startSession createNewSession:"
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r7 = ", idle size:"
            r6.append(r7)
            java.util.List<android.os.HandlerThread> r7 = r2.f99019a
            int r7 = r7.size()
            r6.append(r7)
            java.lang.String r7 = ", working size:"
            r6.append(r7)
            java.util.List<android.os.HandlerThread> r7 = r2.f99020b
            int r7 = r7.size()
            r6.append(r7)
            java.lang.String r7 = ", session list size:"
            r6.append(r7)
            java.util.List<com.ss.android.ugc.aweme.player.sdk.c.b> r7 = r2.f99021c
            int r7 = r7.size()
            r6.append(r7)
            java.lang.String r7 = ", session pool size:"
            r6.append(r7)
            java.util.List<com.ss.android.ugc.aweme.player.sdk.c.b> r7 = r2.f99022d
            if (r7 != 0) goto L_0x0209
            java.lang.String r7 = "null"
            goto L_0x0213
        L_0x0209:
            java.util.List<com.ss.android.ugc.aweme.player.sdk.c.b> r7 = r2.f99022d
            int r7 = r7.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
        L_0x0213:
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.p683ss.android.ugc.aweme.player.sdk.C38854a.m86290a(r3, r6)
        L_0x021d:
            if (r4 != 0) goto L_0x0227
            com.ss.android.ugc.aweme.player.sdk.c.b r3 = r2.f99023e
            if (r3 != 0) goto L_0x0224
            goto L_0x0227
        L_0x0224:
            com.ss.android.ugc.aweme.player.sdk.c.b r3 = r2.f99023e
            goto L_0x022b
        L_0x0227:
            com.ss.android.ugc.aweme.player.sdk.c.b r3 = r2.mo78950a(r10)
        L_0x022b:
            r2.f99023e = r3
            com.ss.android.ugc.aweme.player.sdk.c.b r3 = r2.f99023e
            r3.mo78942a(r0)
            com.ss.android.ugc.aweme.player.sdk.c.b r0 = r2.f99023e
            r0.f98997f = r10
            if (r10 == 0) goto L_0x023c
            java.lang.String r10 = r10.f125572d
            r0.f98992a = r10
        L_0x023c:
            com.ss.android.ugc.playerkit.c.i r10 = r0.f98997f
            if (r10 == 0) goto L_0x0266
            boolean r10 = r0.f98998g
            if (r10 != 0) goto L_0x0266
            boolean r10 = r0.f98999h
            if (r10 == 0) goto L_0x0249
            goto L_0x0266
        L_0x0249:
            com.ss.android.ugc.aweme.player.sdk.c.a r10 = r0.f98994c
            r10.removeCallbacks(r1)
            com.ss.android.ugc.aweme.player.sdk.c.a r10 = r0.f98994c
            com.ss.android.ugc.playerkit.c.i r3 = r0.f98997f
            android.os.Message r10 = r10.obtainMessage(r5, r3)
            r10.sendToTarget()
            com.ss.android.ugc.playerkit.c.i r10 = r0.f98997f
            boolean r10 = r10.f125586r
            if (r10 == 0) goto L_0x0266
            r10 = 9
            java.lang.String r3 = r0.f98992a
            r0.mo78936a(r10, r3)
        L_0x0266:
            java.util.List<com.ss.android.ugc.aweme.player.sdk.c.b> r10 = r2.f99021c
            com.ss.android.ugc.aweme.player.sdk.c.b r0 = r2.f99023e
            boolean r10 = r10.contains(r0)
            if (r10 != 0) goto L_0x0277
            java.util.List<com.ss.android.ugc.aweme.player.sdk.c.b> r10 = r2.f99021c
            com.ss.android.ugc.aweme.player.sdk.c.b r0 = r2.f99023e
            r10.add(r0)
        L_0x0277:
            com.ss.android.ugc.aweme.player.sdk.c.d r10 = r9.f99028a
            com.ss.android.ugc.aweme.player.sdk.c.b r10 = r10.f99023e
            r9.f99029b = r10
            com.ss.android.ugc.aweme.player.sdk.a.c r10 = r9.f99035h
            if (r10 == 0) goto L_0x0288
            com.ss.android.ugc.aweme.player.sdk.c.b r10 = r9.f99029b
            com.ss.android.ugc.aweme.player.sdk.a.c r0 = r9.f99035h
            r10.mo78940a(r0)
        L_0x0288:
            android.view.Surface r10 = r9.f99030c
            if (r10 == 0) goto L_0x0295
            com.ss.android.ugc.aweme.player.sdk.c.b r10 = r9.f99029b
            android.view.Surface r0 = r9.f99030c
            r10.mo78938a(r0)
            r9.f99030c = r1
        L_0x0295:
            com.ss.android.ugc.playerkit.a.a r10 = r9.f99032e
            if (r10 == 0) goto L_0x02a0
            com.ss.android.ugc.aweme.player.sdk.c.b r10 = r9.f99029b
            com.ss.android.ugc.playerkit.a.a r0 = r9.f99032e
            r10.mo78943a(r0)
        L_0x02a0:
            com.ss.android.ugc.aweme.player.sdk.a.b r10 = r9.f99033f
            if (r10 == 0) goto L_0x02ab
            com.ss.android.ugc.aweme.player.sdk.c.b r10 = r9.f99029b
            com.ss.android.ugc.aweme.player.sdk.a.b r0 = r9.f99033f
            r10.mo78939a(r0)
        L_0x02ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.player.sdk.p2056c.C38886e.mo78899a(com.ss.android.ugc.playerkit.c.i):void");
    }

    /* renamed from: a */
    public final void mo78900a(String str) {
        if (C38854a.f98960a) {
            C38854a.m86290a("SimplifyAsyncPlayerV3", "resume()");
        }
        if (this.f99029b != null) {
            this.f99029b.f98994c.obtainMessage(4, str).sendToTarget();
        }
    }

    /* renamed from: a */
    public final void mo78898a(C50101a aVar) {
        this.f99032e = aVar;
        if (this.f99029b != null) {
            this.f99029b.mo78943a(aVar);
        }
    }

    /* renamed from: a */
    public final boolean mo78901a(String str, String str2) {
        return this.f99029b != null && TextUtils.equals(str, this.f99029b.f98992a);
    }

    /* renamed from: a */
    public final void mo78895a(C38858d dVar) {
        this.f99028a.f99025g = dVar;
        if (this.f99029b != null) {
            this.f99029b.f98995d.mo78895a(dVar);
        }
    }

    /* renamed from: a */
    public final void mo78897a(C38871j jVar) {
        if (this.f99029b != null) {
            this.f99029b.mo78942a(jVar);
        }
        this.f99031d = new WeakReference<>(jVar);
    }

    /* renamed from: a */
    public final void mo78896a(C38868g gVar) {
        this.f99034g = gVar;
        if (this.f99029b != null) {
            this.f99029b.mo78941a(gVar);
        }
    }

    /* renamed from: a */
    public final void mo78894a(C38857c cVar) {
        this.f99035h = cVar;
        if (this.f99029b != null) {
            this.f99029b.mo78940a(cVar);
        }
    }

    /* renamed from: h */
    public final long mo78912h() {
        if (this.f99029b != null) {
            return this.f99029b.f98995d.mo78912h();
        }
        return 0;
    }

    /* renamed from: i */
    public final long mo78913i() {
        if (this.f99029b != null) {
            return this.f99029b.f98995d.mo78913i();
        }
        return 0;
    }

    /* renamed from: k */
    public final String mo78915k() {
        if (this.f99029b != null) {
            return this.f99029b.f98995d.mo78915k();
        }
        return null;
    }

    /* renamed from: l */
    public final int mo78916l() {
        if (this.f99029b != null) {
            return this.f99029b.f98995d.mo78916l();
        }
        return 0;
    }

    /* renamed from: m */
    public final void mo78917m() {
        if (this.f99029b != null) {
            this.f99029b.f98995d.mo78917m();
        }
    }

    /* renamed from: o */
    public final void mo78919o() {
        if (this.f99029b != null) {
            this.f99029b.mo78935a();
        }
    }

    /* renamed from: q */
    public final C50116c mo78921q() {
        if (this.f99029b != null) {
            return this.f99029b.f98995d.mo78921q();
        }
        return C50116c.TT;
    }

    /* renamed from: b */
    public final void mo78902b() {
        if (C38854a.f98960a) {
            C38854a.m86290a("SimplifyAsyncPlayerV3", "render()");
        }
        if (this.f99029b != null) {
            this.f99029b.f98994c.sendEmptyMessage(8);
        }
    }

    /* renamed from: c */
    public final void mo78907c() {
        if (C38854a.f98960a) {
            C38854a.m86290a("SimplifyAsyncPlayerV3", "start()");
        }
        if (this.f99029b != null) {
            this.f99029b.f98994c.sendEmptyMessage(3);
        }
    }

    /* renamed from: d */
    public final void mo78908d() {
        if (C38854a.f98960a) {
            C38854a.m86290a("SimplifyAsyncPlayerV3", "stop()");
        }
        if (this.f99029b != null) {
            this.f99029b.mo78944b();
        }
    }

    /* renamed from: e */
    public final void mo78909e() {
        if (C38854a.f98960a) {
            C38854a.m86290a("SimplifyAsyncPlayerV3", "pause()");
        }
        if (this.f99029b != null) {
            this.f99029b.f98994c.sendEmptyMessage(5);
        }
    }

    /* renamed from: g */
    public final boolean mo78911g() {
        if (this.f99029b == null || !this.f99029b.f98995d.mo78911g()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo78914j() {
        if (this.f99029b == null || !this.f99029b.f98995d.mo78914j()) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public final void mo78918n() {
        if (this.f99029b != null) {
            C38878b bVar = this.f99029b;
            if (!bVar.f98999h && !bVar.f98998g) {
                bVar.f98994c.mo78932a(300);
                bVar.f98994c.sendEmptyMessage(12);
            }
        }
    }

    /* renamed from: r */
    public final boolean mo78922r() {
        if (this.f99029b == null || !this.f99029b.f98995d.mo78922r()) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final C38866g mo78923s() {
        if (this.f99029b == null) {
            return null;
        }
        C38878b bVar = this.f99029b;
        if (bVar.f98995d != null) {
            return bVar.f98995d.mo78923s();
        }
        return null;
    }

    /* renamed from: t */
    public final C38865f mo78924t() {
        if (this.f99029b == null) {
            return null;
        }
        C38878b bVar = this.f99029b;
        if (bVar.f98995d != null) {
            return bVar.f98995d.mo78924t();
        }
        return null;
    }

    /* renamed from: u */
    public final String mo78925u() {
        if (this.f99029b == null) {
            return null;
        }
        C38878b bVar = this.f99029b;
        if (bVar.f98995d != null) {
            return bVar.f98995d.mo78925u();
        }
        return null;
    }

    /* renamed from: v */
    public final boolean mo78926v() {
        if (this.f99029b == null || !this.f99029b.f98995d.mo78926v()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo78887a() {
        if (C38854a.f98960a) {
            C38854a.m86290a("SimplifyAsyncPlayerV3", "init()");
        }
        if (this.f99029b == null) {
            C38885d dVar = this.f99028a;
            dVar.f99023e = dVar.mo78950a((C50120i) null);
            this.f99029b = dVar.f99023e;
        }
        if (this.f99034g != null) {
            this.f99029b.mo78941a(this.f99034g);
        }
        this.f99029b.f98994c.sendEmptyMessage(16);
    }

    /* renamed from: f */
    public final void mo78910f() {
        if (C38854a.f98960a) {
            C38854a.m86290a("SimplifyAsyncPlayerV3", "release()");
        }
        C38885d dVar = this.f99028a;
        if (C38854a.f98960a) {
            StringBuilder sb = new StringBuilder("releaseSession mCurrentSession:");
            sb.append(dVar.f99023e);
            C38854a.m86290a("PlaySessionManager", sb.toString());
        }
        if (dVar.f99023e != null) {
            dVar.f99023e.mo78945c();
        }
        dVar.f99023e = null;
        for (HandlerThread handlerThread : dVar.f99019a) {
            if (VERSION.SDK_INT >= 18) {
                handlerThread.quitSafely();
            } else {
                handlerThread.quit();
            }
        }
        if (dVar.f99022d != null) {
            if (C38854a.f98960a) {
                StringBuilder sb2 = new StringBuilder("release session pool:");
                sb2.append(dVar.f99022d.size());
                C38854a.m86290a("PlaySessionManager", sb2.toString());
            }
            if (dVar.f99022d.size() > 0) {
                for (C38878b c : dVar.f99022d) {
                    c.mo78945c();
                }
            }
            dVar.f99022d.clear();
        }
        dVar.f99019a.clear();
        dVar.f99020b.clear();
        dVar.f99021c.clear();
        dVar.f99024f = true;
        this.f99029b = null;
        this.f99030c = null;
        this.f99032e = null;
        this.f99033f = null;
        this.f99034g = null;
        this.f99035h = null;
    }

    /* renamed from: a */
    public final float mo78886a(int i) {
        if (this.f99029b != null) {
            return this.f99029b.f98995d.mo78886a(i);
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final void mo78904b(Surface surface) {
        if (this.f99029b != null) {
            this.f99029b.f98995d.mo78904b(surface);
        }
    }

    /* renamed from: b */
    public final void mo78903b(int i) {
        if (this.f99029b != null) {
            C38878b bVar = this.f99029b;
            bVar.f98994c.mo78932a(i);
            bVar.f98994c.sendEmptyMessage(12);
        }
    }

    /* renamed from: a */
    public final void mo78888a(float f) {
        if (C38854a.f98960a) {
            StringBuilder sb = new StringBuilder("seekTo() progress:");
            sb.append(f);
            C38854a.m86290a("SimplifyAsyncPlayerV3", sb.toString());
        }
        if (this.f99029b != null) {
            this.f99029b.f98994c.obtainMessage(11, Float.valueOf(f)).sendToTarget();
        }
    }

    /* renamed from: b */
    public final void mo78905b(String str) {
        if (this.f99029b != null) {
            this.f99029b.f98995d.mo78905b(str);
        }
    }

    /* renamed from: b */
    public final boolean mo78906b(C38871j jVar) {
        if ((this.f99029b == null || this.f99029b.f99000i != jVar) && (this.f99031d == null || this.f99031d.get() != jVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo78891a(Surface surface) {
        if (C38854a.f98960a) {
            StringBuilder sb = new StringBuilder("setSurface(), surface = ");
            sb.append(surface);
            sb.append(", mCurrentPlaySession = ");
            sb.append(this.f99029b);
            C38854a.m86290a("SimplifyAsyncPlayerV3", sb.toString());
        }
        this.f99030c = surface;
        if (this.f99029b != null) {
            this.f99029b.mo78938a(surface);
        }
    }

    /* renamed from: a */
    public final void mo78892a(SurfaceHolder surfaceHolder) {
        if (this.f99029b != null) {
            this.f99029b.f98994c.obtainMessage(14, surfaceHolder).sendToTarget();
        }
    }

    /* renamed from: a */
    public final void mo78893a(C38856b bVar) {
        this.f99033f = bVar;
        if (this.f99029b != null) {
            this.f99029b.mo78939a(bVar);
        }
    }

    public C38886e(C50116c cVar, C38884c cVar2) {
        this.f99028a = new C38885d(cVar, cVar2);
    }

    /* renamed from: a */
    public final void mo78890a(int i, int i2) {
        if (this.f99029b != null) {
            this.f99029b.f98994c.obtainMessage(13, new Pair(Integer.valueOf(i), Integer.valueOf(i2))).sendToTarget();
        }
    }

    /* renamed from: a */
    public final void mo78889a(float f, float f2) {
        if (C38854a.f98960a) {
            StringBuilder sb = new StringBuilder("setVolume() leftVolume:");
            sb.append(f);
            sb.append(", rightVolume:");
            sb.append(f2);
            C38854a.m86290a("SimplifyAsyncPlayerV3", sb.toString());
        }
        if (this.f99029b != null) {
            this.f99029b.f98994c.obtainMessage(9, new Pair(Float.valueOf(f), Float.valueOf(f2))).sendToTarget();
        }
    }
}
