package com.p683ss.android.ugc.aweme.livewallpaper.egl;

import com.p683ss.android.ugc.aweme.livewallpaper.egl.C36228n.C36231b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.s */
public final class C36236s implements C36231b {

    /* renamed from: a */
    public final int f92768a;

    /* renamed from: b */
    public final int f92769b;

    /* renamed from: c */
    public String f92770c = "TextureQueue";

    /* renamed from: d */
    private final int f92771d;

    /* renamed from: e */
    private final boolean f92772e;

    /* renamed from: f */
    private List<C36221h> f92773f;

    /* renamed from: g */
    private List<C36221h> f92774g;

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.s$a */
    static class C36237a extends C36228n implements C36231b {
        /* renamed from: e */
        public final void mo75010e() {
            super.mo75010e();
        }

        /* renamed from: a */
        public final void mo75011a(C36221h hVar) {
            this.f92739a = null;
        }

        private C36237a(int i, int i2, int i3, C36231b bVar) {
            super(i, i2, i3, bVar);
        }

        /* renamed from: a */
        public static C36221h m81838a(int i, int i2, int i3, C36231b bVar) {
            return new C36237a(i3, i, i2, bVar);
        }
    }

    /* renamed from: a */
    public final void mo75018a() {
        synchronized (this) {
            m81834a(this.f92773f);
            m81834a(this.f92774g);
            synchronized (this.f92773f) {
                for (C36221h hVar : this.f92773f) {
                    ((C36237a) hVar).mo75010e();
                }
                this.f92773f.clear();
            }
            synchronized (this.f92774g) {
                this.f92774g.clear();
                this.f92774g.notifyAll();
            }
        }
    }

    /* renamed from: a */
    private static int m81834a(List<C36221h> list) {
        int size;
        synchronized (list) {
            size = list.size();
        }
        return size;
    }

    /* renamed from: a */
    public final void mo75011a(C36221h hVar) {
        synchronized (this.f92774g) {
            this.f92774g.add(hVar);
            this.f92774g.notifyAll();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0070 */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0078  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.livewallpaper.egl.C36221h mo75017a(int r7) {
        /*
            r6 = this;
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.egl.h> r7 = r6.f92774g
            monitor-enter(r7)
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.egl.h> r0 = r6.f92774g     // Catch:{ all -> 0x008a }
            int r0 = r0.size()     // Catch:{ all -> 0x008a }
            r1 = 0
            r2 = 0
            if (r0 <= 0) goto L_0x0016
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.egl.h> r0 = r6.f92774g     // Catch:{ all -> 0x008a }
            java.lang.Object r0 = r0.remove(r2)     // Catch:{ all -> 0x008a }
            com.ss.android.ugc.aweme.livewallpaper.egl.h r0 = (com.p683ss.android.ugc.aweme.livewallpaper.egl.C36221h) r0     // Catch:{ all -> 0x008a }
            goto L_0x0017
        L_0x0016:
            r0 = r1
        L_0x0017:
            monitor-exit(r7)     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x0060
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.egl.h> r7 = r6.f92773f
            monitor-enter(r7)
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.egl.h> r3 = r6.f92773f     // Catch:{ all -> 0x005d }
            int r3 = r3.size()     // Catch:{ all -> 0x005d }
            int r4 = r6.f92771d     // Catch:{ all -> 0x005d }
            r5 = 1
            if (r3 >= r4) goto L_0x005b
            boolean r0 = r6.f92772e     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0036
            int r0 = r6.f92768a     // Catch:{ all -> 0x005d }
            int r1 = r6.f92769b     // Catch:{ all -> 0x005d }
            r3 = -1
            com.ss.android.ugc.aweme.livewallpaper.egl.h r0 = com.p683ss.android.ugc.aweme.livewallpaper.egl.C36236s.C36237a.m81838a(r0, r1, r3, r6)     // Catch:{ all -> 0x005d }
            goto L_0x0053
        L_0x0036:
            int r0 = r6.f92768a     // Catch:{ all -> 0x005d }
            int r3 = r6.f92769b     // Catch:{ all -> 0x005d }
            if (r0 != 0) goto L_0x0046
            if (r3 != 0) goto L_0x0046
            int[] r4 = new int[r5]     // Catch:{ all -> 0x005d }
            android.opengl.GLES20.glGenTextures(r5, r4, r2)     // Catch:{ all -> 0x005d }
            r4 = r4[r2]     // Catch:{ all -> 0x005d }
            goto L_0x004c
        L_0x0046:
            r4 = 6408(0x1908, float:8.98E-42)
            int r4 = com.p683ss.android.ugc.aweme.livewallpaper.egl.C36222i.m81795a(r1, r0, r3, r4)     // Catch:{ all -> 0x005d }
        L_0x004c:
            if (r4 <= 0) goto L_0x0052
            com.ss.android.ugc.aweme.livewallpaper.egl.h r1 = com.p683ss.android.ugc.aweme.livewallpaper.egl.C36236s.C36237a.m81838a(r0, r3, r4, r6)     // Catch:{ all -> 0x005d }
        L_0x0052:
            r0 = r1
        L_0x0053:
            if (r0 == 0) goto L_0x005a
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.egl.h> r1 = r6.f92773f     // Catch:{ all -> 0x005d }
            r1.add(r0)     // Catch:{ all -> 0x005d }
        L_0x005a:
            r5 = 0
        L_0x005b:
            monitor-exit(r7)     // Catch:{ all -> 0x005d }
            goto L_0x0061
        L_0x005d:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x005d }
            throw r0
        L_0x0060:
            r5 = 0
        L_0x0061:
            if (r5 == 0) goto L_0x0084
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.egl.h> r7 = r6.f92774g
            monitor-enter(r7)
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.egl.h> r1 = r6.f92774g     // Catch:{ InterruptedException -> 0x0070 }
            r3 = 1000(0x3e8, double:4.94E-321)
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x0070 }
            goto L_0x0070
        L_0x006e:
            r0 = move-exception
            goto L_0x0082
        L_0x0070:
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.egl.h> r1 = r6.f92774g     // Catch:{ all -> 0x006e }
            int r1 = r1.size()     // Catch:{ all -> 0x006e }
            if (r1 <= 0) goto L_0x0080
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.egl.h> r0 = r6.f92774g     // Catch:{ all -> 0x006e }
            java.lang.Object r0 = r0.remove(r2)     // Catch:{ all -> 0x006e }
            com.ss.android.ugc.aweme.livewallpaper.egl.h r0 = (com.p683ss.android.ugc.aweme.livewallpaper.egl.C36221h) r0     // Catch:{ all -> 0x006e }
        L_0x0080:
            monitor-exit(r7)     // Catch:{ all -> 0x006e }
            goto L_0x0084
        L_0x0082:
            monitor-exit(r7)     // Catch:{ all -> 0x006e }
            throw r0
        L_0x0084:
            if (r0 == 0) goto L_0x0089
            r0.mo74989a()
        L_0x0089:
            return r0
        L_0x008a:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x008a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.livewallpaper.egl.C36236s.mo75017a(int):com.ss.android.ugc.aweme.livewallpaper.egl.h");
    }

    public C36236s(int i, int i2, int i3, boolean z) {
        this.f92768a = i2;
        this.f92769b = i3;
        this.f92771d = i;
        this.f92772e = false;
        this.f92773f = new ArrayList();
        this.f92774g = new ArrayList();
    }
}
