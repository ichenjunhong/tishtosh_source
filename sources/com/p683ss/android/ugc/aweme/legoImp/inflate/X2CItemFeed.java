package com.p683ss.android.ugc.aweme.legoImp.inflate;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12208t;
import com.p100a.p102b.C2281a;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed */
public class X2CItemFeed extends X2CBaseInflate {
    protected WeakReference<Activity> mActivityWeakReference;
    private ConcurrentHashMap<Integer, View> viewCache = new ConcurrentHashMap<>();

    /* access modifiers changed from: protected */
    public int cacheCount() {
        return 2;
    }

    /* access modifiers changed from: protected */
    public int[] layoutResId() {
        return new int[]{R.layout.b5v, R.layout.b6_, R.layout.b5l, R.layout.b6x, R.layout.b6u, R.layout.b6o, R.layout.b6q, R.layout.b6r, R.layout.b6y, R.layout.b7f, R.layout.b6p, R.layout.b70, R.layout.b7h, R.layout.b6z, R.layout.b7g, R.layout.b6b, R.layout.b7i};
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$getView$0$X2CItemFeed(int i) {
        ConcurrentHashMap<Integer, View> concurrentHashMap = this.viewCache;
        Activity activity = (Activity) this.mActivityWeakReference.get();
        if (concurrentHashMap != null && activity != null) {
            concurrentHashMap.put(Integer.valueOf(i), C2281a.m6814a(activity, i, new FrameLayout(activity), false));
        }
    }

    public void inflate(Context context, Activity activity) {
        super.inflate(context, activity);
        if (this.mActivityWeakReference == null && activity != null) {
            C12208t a = C12203q.m24646a("");
            a.f32239b = activity;
            a.mo23128c();
        }
        this.mActivityWeakReference = new WeakReference<>(activity);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a1, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a8, code lost:
        if (r6.viewCache == null) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b0, code lost:
        if (r6.mActivityWeakReference.get() == r7) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b2, code lost:
        r6.viewCache.clear();
        r6.viewCache = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bb, code lost:
        if (r6.viewCache == null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bd, code lost:
        r0 = (android.view.View) r6.viewCache.get(java.lang.Integer.valueOf(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
        if (r0 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cb, code lost:
        r6.viewCache.remove(java.lang.Integer.valueOf(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d4, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        return com.p100a.p102b.C2281a.m6814a(r7, r8, new android.widget.FrameLayout(r7), false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(android.content.Context r7, int r8) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.services.IMainService r0 = com.p683ss.android.ugc.aweme.services.MainServiceImpl.createIMainServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.services.IMainService r0 = (com.p683ss.android.ugc.aweme.services.IMainService) r0
            boolean r0 = r0.isMainPage(r7)
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x0055
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.view.View> r0 = r6.viewCache
            if (r0 != 0) goto L_0x001a
            java.lang.ref.WeakReference<android.app.Activity> r0 = r6.mActivityWeakReference
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x0021
        L_0x001a:
            r6.viewCache = r1
            java.lang.ref.WeakReference<android.app.Activity> r0 = r6.mActivityWeakReference
            r0.clear()
        L_0x0021:
            boolean r0 = r7 instanceof com.p683ss.android.ugc.aweme.p1402b.C23346d
            if (r0 == 0) goto L_0x0030
            com.ss.android.ugc.aweme.b.d r7 = (com.p683ss.android.ugc.aweme.p1402b.C23346d) r7
            com.ss.android.ugc.aweme.b.c r7 = r7.getInflater()
            android.view.View r7 = r7.mo48401a(r8)
            return r7
        L_0x0030:
            boolean r0 = r6.isX2CAsyncInflateOpen()
            if (r0 != 0) goto L_0x004b
            boolean r0 = r6.isX2COpen()
            if (r0 == 0) goto L_0x003d
            goto L_0x004b
        L_0x003d:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r7)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r7)
            android.view.View r7 = r0.inflate(r8, r1, r2)
            return r7
        L_0x004b:
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r7)
            android.view.View r7 = com.p100a.p102b.C2281a.m6814a(r7, r8, r0, r2)
            return r7
        L_0x0055:
            boolean r0 = r6.isX2CAsyncInflateOpen()
            if (r0 == 0) goto L_0x00e2
            java.util.List r0 = r6.viewCaches
            monitor-enter(r0)
            java.util.List r3 = r6.viewCaches     // Catch:{ all -> 0x00df }
            int r3 = r3.size()     // Catch:{ all -> 0x00df }
            r4 = 0
        L_0x0065:
            if (r4 >= r3) goto L_0x00a5
            java.util.List r5 = r6.viewCaches     // Catch:{ all -> 0x00df }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ all -> 0x00df }
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch:{ all -> 0x00df }
            java.lang.Object r5 = r5.get(r8)     // Catch:{ all -> 0x00df }
            android.view.View r5 = (android.view.View) r5     // Catch:{ all -> 0x00df }
            if (r5 == 0) goto L_0x00a2
            java.util.List r7 = r6.viewCaches     // Catch:{ all -> 0x00df }
            java.lang.Object r7 = r7.get(r4)     // Catch:{ all -> 0x00df }
            android.util.SparseArray r7 = (android.util.SparseArray) r7     // Catch:{ all -> 0x00df }
            r7.remove(r8)     // Catch:{ all -> 0x00df }
            int r3 = r3 + -1
            if (r4 != r3) goto L_0x00a0
            java.lang.ref.WeakReference<android.app.Activity> r7 = r6.mActivityWeakReference     // Catch:{ all -> 0x00df }
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x00df }
            if (r7 == 0) goto L_0x00a0
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.view.View> r7 = r6.viewCache     // Catch:{ all -> 0x00df }
            if (r7 == 0) goto L_0x00a0
            android.os.Handler r7 = com.p683ss.android.ugc.aweme.lego.C35883b.m81030b()     // Catch:{ all -> 0x00df }
            com.ss.android.ugc.aweme.legoImp.inflate.f r1 = new com.ss.android.ugc.aweme.legoImp.inflate.f     // Catch:{ all -> 0x00df }
            r1.<init>(r6, r8)     // Catch:{ all -> 0x00df }
            r2 = 500(0x1f4, double:2.47E-321)
            r7.postDelayed(r1, r2)     // Catch:{ all -> 0x00df }
        L_0x00a0:
            monitor-exit(r0)     // Catch:{ all -> 0x00df }
            return r5
        L_0x00a2:
            int r4 = r4 + 1
            goto L_0x0065
        L_0x00a5:
            monitor-exit(r0)     // Catch:{ all -> 0x00df }
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.view.View> r0 = r6.viewCache
            if (r0 == 0) goto L_0x00b9
            java.lang.ref.WeakReference<android.app.Activity> r0 = r6.mActivityWeakReference
            java.lang.Object r0 = r0.get()
            if (r0 == r7) goto L_0x00b9
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.view.View> r0 = r6.viewCache
            r0.clear()
            r6.viewCache = r1
        L_0x00b9:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.view.View> r0 = r6.viewCache
            if (r0 == 0) goto L_0x00d5
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.view.View> r0 = r6.viewCache
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Object r0 = r0.get(r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x00d5
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.view.View> r7 = r6.viewCache
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.remove(r8)
            return r0
        L_0x00d5:
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r7)
            android.view.View r7 = com.p100a.p102b.C2281a.m6814a(r7, r8, r0, r2)
            return r7
        L_0x00df:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00df }
            throw r7
        L_0x00e2:
            boolean r0 = r6.isX2COpen()
            if (r0 == 0) goto L_0x00f2
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r7)
            android.view.View r7 = com.p100a.p102b.C2281a.m6814a(r7, r8, r0, r2)
            return r7
        L_0x00f2:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r7)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r7)
            android.view.View r7 = r0.inflate(r8, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed.getView(android.content.Context, int):android.view.View");
    }
}
