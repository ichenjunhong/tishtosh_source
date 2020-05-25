package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.provider.Settings.System;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.ScrollView;
import com.google.android.gms.ads.internal.C14963ax;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
public final class buv implements OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: b */
    private static final long f43997b = ((Long) caf.m37099d().mo30717a(C15740bx.f44299bg)).longValue();

    /* renamed from: a */
    protected final but f43998a;

    /* renamed from: c */
    private final Object f43999c = new Object();

    /* renamed from: d */
    private final WeakReference<abb> f44000d;

    /* renamed from: e */
    private WeakReference<ViewTreeObserver> f44001e;

    /* renamed from: f */
    private final bwh f44002f;

    /* renamed from: g */
    private final Context f44003g;

    /* renamed from: h */
    private final WindowManager f44004h;

    /* renamed from: i */
    private final PowerManager f44005i;

    /* renamed from: j */
    private final KeyguardManager f44006j;

    /* renamed from: k */
    private final DisplayMetrics f44007k;

    /* renamed from: l */
    private bvd f44008l;

    /* renamed from: m */
    private boolean f44009m;

    /* renamed from: n */
    private boolean f44010n = false;

    /* renamed from: o */
    private boolean f44011o = false;

    /* renamed from: p */
    private boolean f44012p;

    /* renamed from: q */
    private boolean f44013q;

    /* renamed from: r */
    private boolean f44014r;

    /* renamed from: s */
    private BroadcastReceiver f44015s;

    /* renamed from: t */
    private final HashSet<Object> f44016t = new HashSet<>();

    /* renamed from: u */
    private aeh f44017u;

    /* renamed from: v */
    private final HashSet<bvr> f44018v = new HashSet<>();

    /* renamed from: w */
    private final Rect f44019w = new Rect();

    /* renamed from: x */
    private final buz f44020x;

    /* renamed from: y */
    private float f44021y;

    public buv(Context context, zzyz zzyz, abb abb, zzbgz zzbgz, bwh bwh) {
        this.f44000d = new WeakReference<>(abb);
        this.f44002f = bwh;
        this.f44001e = new WeakReference<>(null);
        this.f44012p = true;
        this.f44014r = false;
        this.f44017u = new aeh(f43997b);
        but but = new but(UUID.randomUUID().toString(), zzbgz, zzyz.f46338a, abb.f40113k, abb.mo28583a(), zzyz.f46345h);
        this.f43998a = but;
        this.f44004h = (WindowManager) context.getSystemService("window");
        this.f44005i = (PowerManager) context.getApplicationContext().getSystemService("power");
        this.f44006j = (KeyguardManager) context.getSystemService("keyguard");
        this.f44003g = context;
        this.f44020x = new buz(this, new apf());
        this.f44003g.getContentResolver().registerContentObserver(System.CONTENT_URI, true, this.f44020x);
        this.f44007k = context.getResources().getDisplayMetrics();
        Display defaultDisplay = this.f44004h.getDefaultDisplay();
        this.f44019w.right = defaultDisplay.getWidth();
        this.f44019w.bottom = defaultDisplay.getHeight();
        mo30748a();
    }

    /* renamed from: a */
    public final void mo30748a() {
        this.f44021y = acy.m32672a(this.f44003g);
    }

    /* renamed from: b */
    public final void mo30755b() {
        synchronized (this.f43999c) {
            if (this.f44012p) {
                this.f44013q = true;
                try {
                    JSONObject j = m36831j();
                    j.put("doneReasonCode", "u");
                    m36828a(j, true);
                } catch (JSONException e) {
                    abv.m32793b("JSON failure while processing active view data.", e);
                } catch (RuntimeException e2) {
                    abv.m32793b("Failure while processing active view data.", e2);
                }
                String str = "Untracking ad unit: ";
                String valueOf = String.valueOf(this.f43998a.f43987c);
                abv.m32792b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c9, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30749a(int r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f43999c
            monitor-enter(r0)
            java.util.HashSet<com.google.android.gms.internal.ads.bvr> r1 = r7.f44018v     // Catch:{ all -> 0x00ca }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00ca }
        L_0x0009:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00ca }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001f
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00ca }
            com.google.android.gms.internal.ads.bvr r2 = (com.google.android.gms.internal.ads.bvr) r2     // Catch:{ all -> 0x00ca }
            boolean r2 = r2.mo30773a()     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x0009
            r1 = 1
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            if (r1 == 0) goto L_0x00c8
            boolean r1 = r7.f44012p     // Catch:{ all -> 0x00ca }
            if (r1 != 0) goto L_0x0028
            goto L_0x00c8
        L_0x0028:
            com.google.android.gms.internal.ads.bwh r1 = r7.f44002f     // Catch:{ all -> 0x00ca }
            android.view.View r1 = r1.mo30767a()     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x003c
            android.os.PowerManager r2 = r7.f44005i     // Catch:{ all -> 0x00ca }
            android.app.KeyguardManager r5 = r7.f44006j     // Catch:{ all -> 0x00ca }
            boolean r2 = com.google.android.gms.internal.ads.acd.m32591a(r1, r2, r5)     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r1 == 0) goto L_0x004f
            if (r2 == 0) goto L_0x004f
            android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ all -> 0x00ca }
            r5.<init>()     // Catch:{ all -> 0x00ca }
            r6 = 0
            boolean r5 = r1.getGlobalVisibleRect(r5, r6)     // Catch:{ all -> 0x00ca }
            if (r5 == 0) goto L_0x004f
            r5 = 1
            goto L_0x0050
        L_0x004f:
            r5 = 0
        L_0x0050:
            com.google.android.gms.internal.ads.bwh r6 = r7.f44002f     // Catch:{ all -> 0x00ca }
            boolean r6 = r6.mo30768b()     // Catch:{ all -> 0x00ca }
            if (r6 == 0) goto L_0x005d
            r7.mo30755b()     // Catch:{ all -> 0x00ca }
            monitor-exit(r0)     // Catch:{ all -> 0x00ca }
            return
        L_0x005d:
            if (r8 != r4) goto L_0x006d
            com.google.android.gms.internal.ads.aeh r6 = r7.f44017u     // Catch:{ all -> 0x00ca }
            boolean r6 = r6.mo28750a()     // Catch:{ all -> 0x00ca }
            if (r6 != 0) goto L_0x006d
            boolean r6 = r7.f44014r     // Catch:{ all -> 0x00ca }
            if (r5 != r6) goto L_0x006d
            monitor-exit(r0)     // Catch:{ all -> 0x00ca }
            return
        L_0x006d:
            if (r5 != 0) goto L_0x0077
            boolean r6 = r7.f44014r     // Catch:{ all -> 0x00ca }
            if (r6 != 0) goto L_0x0077
            if (r8 != r4) goto L_0x0077
            monitor-exit(r0)     // Catch:{ all -> 0x00ca }
            return
        L_0x0077:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)     // Catch:{ RuntimeException | JSONException -> 0x0085 }
            org.json.JSONObject r8 = r7.m36826a(r1, r8)     // Catch:{ RuntimeException | JSONException -> 0x0085 }
            r7.m36828a(r8, r3)     // Catch:{ RuntimeException | JSONException -> 0x0085 }
            r7.f44014r = r5     // Catch:{ RuntimeException | JSONException -> 0x0085 }
            goto L_0x008b
        L_0x0085:
            r8 = move-exception
            java.lang.String r1 = "Active view update failed."
            com.google.android.gms.internal.ads.abv.m32790a(r1, r8)     // Catch:{ all -> 0x00ca }
        L_0x008b:
            com.google.android.gms.internal.ads.bwh r8 = r7.f44002f     // Catch:{ all -> 0x00ca }
            com.google.android.gms.internal.ads.bwh r8 = r8.mo30769c()     // Catch:{ all -> 0x00ca }
            android.view.View r8 = r8.mo30767a()     // Catch:{ all -> 0x00ca }
            if (r8 == 0) goto L_0x00c3
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r7.f44001e     // Catch:{ all -> 0x00ca }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x00ca }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ all -> 0x00ca }
            android.view.ViewTreeObserver r8 = r8.getViewTreeObserver()     // Catch:{ all -> 0x00ca }
            if (r8 == r1) goto L_0x00c3
            r7.m36830i()     // Catch:{ all -> 0x00ca }
            boolean r2 = r7.f44009m     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x00b4
            if (r1 == 0) goto L_0x00bc
            boolean r1 = r1.isAlive()     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x00bc
        L_0x00b4:
            r7.f44009m = r4     // Catch:{ all -> 0x00ca }
            r8.addOnScrollChangedListener(r7)     // Catch:{ all -> 0x00ca }
            r8.addOnGlobalLayoutListener(r7)     // Catch:{ all -> 0x00ca }
        L_0x00bc:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00ca }
            r1.<init>(r8)     // Catch:{ all -> 0x00ca }
            r7.f44001e = r1     // Catch:{ all -> 0x00ca }
        L_0x00c3:
            r7.m36829h()     // Catch:{ all -> 0x00ca }
            monitor-exit(r0)     // Catch:{ all -> 0x00ca }
            return
        L_0x00c8:
            monitor-exit(r0)     // Catch:{ all -> 0x00ca }
            return
        L_0x00ca:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ca }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.buv.mo30749a(int):void");
    }

    /* renamed from: h */
    private final void m36829h() {
        if (this.f44008l != null) {
            this.f44008l.mo30741a(this);
        }
    }

    /* renamed from: c */
    public final boolean mo30759c() {
        boolean z;
        synchronized (this.f43999c) {
            z = this.f44012p;
        }
        return z;
    }

    /* renamed from: a */
    private static int m36824a(int i, DisplayMetrics displayMetrics) {
        return (int) (((float) i) / displayMetrics.density);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo30754a(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        if (TextUtils.isEmpty(str) || !str.equals(this.f43998a.f43987c)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo30757b(Map<String, String> map) {
        mo30749a(3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30753a(bvr bvr, Map<String, String> map) {
        String str = "Received request to untrack: ";
        String valueOf = String.valueOf(this.f43998a.f43987c);
        abv.m32792b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        mo30756b(bvr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo30758c(Map<String, String> map) {
        if (map.containsKey("isVisible")) {
            if (!"1".equals(map.get("isVisible"))) {
                "true".equals(map.get("isVisible"));
            }
            Iterator it = this.f44016t.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: i */
    private final void m36830i() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f44001e.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }

    /* renamed from: j */
    private final JSONObject m36831j() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("afmaVersion", this.f43998a.f43988d).put("activeViewJSON", this.f43998a.f43986b).put("timestamp", C14963ax.m30837g().mo28524b()).put("adFormat", this.f43998a.f43985a).put("hashCode", this.f43998a.f43987c).put("isMraid", this.f43998a.f43989e).put("isStopped", this.f44011o).put("isPaused", this.f44010n).put("isNative", this.f43998a.f43990f).put("isScreenOn", m36832k()).put("appMuted", C14963ax.m30835e().mo28703b()).put("appVolume", (double) C14963ax.m30835e().mo28700a()).put("deviceVolume", (double) this.f44021y);
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m36827a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }

    /* renamed from: a */
    private final void m36828a(JSONObject jSONObject, boolean z) {
        try {
            JSONObject a = m36827a(jSONObject);
            ArrayList arrayList = new ArrayList(this.f44018v);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((bvr) obj).mo30772a(a, z);
            }
        } catch (Throwable th) {
            abv.m32793b("Skipping active view message.", th);
        }
    }

    /* renamed from: a */
    public final void mo30752a(bvr bvr) {
        if (this.f44018v.isEmpty()) {
            synchronized (this.f43999c) {
                if (this.f44015s == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    this.f44015s = new bux(this);
                    C14963ax.m30847q().mo28754a(this.f44003g, this.f44015s, intentFilter);
                }
            }
            mo30749a(3);
        }
        this.f44018v.add(bvr);
        try {
            bvr.mo30772a(m36827a(m36826a(this.f44002f.mo30767a(), (Boolean) null)), false);
        } catch (JSONException e) {
            abv.m32793b("Skipping measurement update for new client.", e);
        }
    }

    /* renamed from: b */
    public final void mo30756b(bvr bvr) {
        this.f44018v.remove(bvr);
        bvr.mo30774b();
        if (this.f44018v.isEmpty()) {
            synchronized (this.f43999c) {
                m36830i();
                synchronized (this.f43999c) {
                    if (this.f44015s != null) {
                        try {
                            C14963ax.m30847q().mo28753a(this.f44003g, this.f44015s);
                        } catch (IllegalStateException e) {
                            abv.m32793b("Failed trying to unregister the receiver", e);
                        } catch (Exception e2) {
                            C14963ax.m30834d().mo28588a((Throwable) e2, "ActiveViewUnit.stopScreenStatusMonitoring");
                        }
                        this.f44015s = null;
                    }
                }
                this.f44003g.getContentResolver().unregisterContentObserver(this.f44020x);
                int i = 0;
                this.f44012p = false;
                m36829h();
                ArrayList arrayList = new ArrayList(this.f44018v);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    mo30756b((bvr) obj);
                }
            }
        }
    }

    /* renamed from: a */
    private final JSONObject m36826a(View view, Boolean bool) throws JSONException {
        if (view == null) {
            return m36831j().put("isAttachedToWindow", false).put("isScreenOn", m36832k()).put("isVisible", false);
        }
        boolean a = C14963ax.m30832b().mo28693a(view);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view.getLocationOnScreen(iArr);
            view.getLocationInWindow(iArr2);
        } catch (Exception e) {
            abv.m32793b("Failure getting view location.", e);
        }
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect2, null);
        Rect rect3 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect3);
        Rect rect4 = new Rect();
        view.getHitRect(rect4);
        JSONObject j = m36831j();
        j.put("windowVisibility", view.getWindowVisibility()).put("isAttachedToWindow", a).put("viewBox", new JSONObject().put("top", m36824a(this.f44019w.top, this.f44007k)).put("bottom", m36824a(this.f44019w.bottom, this.f44007k)).put("left", m36824a(this.f44019w.left, this.f44007k)).put("right", m36824a(this.f44019w.right, this.f44007k))).put("adBox", new JSONObject().put("top", m36824a(rect.top, this.f44007k)).put("bottom", m36824a(rect.bottom, this.f44007k)).put("left", m36824a(rect.left, this.f44007k)).put("right", m36824a(rect.right, this.f44007k))).put("globalVisibleBox", new JSONObject().put("top", m36824a(rect2.top, this.f44007k)).put("bottom", m36824a(rect2.bottom, this.f44007k)).put("left", m36824a(rect2.left, this.f44007k)).put("right", m36824a(rect2.right, this.f44007k))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", m36824a(rect3.top, this.f44007k)).put("bottom", m36824a(rect3.bottom, this.f44007k)).put("left", m36824a(rect3.left, this.f44007k)).put("right", m36824a(rect3.right, this.f44007k))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", m36824a(rect4.top, this.f44007k)).put("bottom", m36824a(rect4.bottom, this.f44007k)).put("left", m36824a(rect4.left, this.f44007k)).put("right", m36824a(rect4.right, this.f44007k))).put("screenDensity", (double) this.f44007k.density);
        if (bool == null) {
            bool = Boolean.valueOf(acd.m32591a(view, this.f44005i, this.f44006j));
        }
        j.put("isVisible", bool.booleanValue());
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44302bj)).booleanValue()) {
            JSONArray jSONArray = new JSONArray();
            List<Rect> a2 = m36825a(view);
            if (a2 != null) {
                for (Rect rect5 : a2) {
                    jSONArray.put(new JSONObject().put("top", m36824a(rect5.top, this.f44007k)).put("bottom", m36824a(rect5.bottom, this.f44007k)).put("left", m36824a(rect5.left, this.f44007k)).put("right", m36824a(rect5.right, this.f44007k)));
                }
            }
            j.put("scrollableContainerBoxes", jSONArray);
        }
        return j;
    }

    /* renamed from: k */
    private final boolean m36832k() {
        if (VERSION.SDK_INT >= 20) {
            return this.f44005i.isInteractive();
        }
        return this.f44005i.isScreenOn();
    }

    /* renamed from: a */
    private static List<Rect> m36825a(View view) {
        boolean z;
        try {
            ArrayList arrayList = new ArrayList();
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                View view2 = (View) parent;
                Rect rect = new Rect();
                if (VERSION.SDK_INT >= 16) {
                    z = view2.isScrollContainer();
                } else {
                    if (!(view2 instanceof ScrollView)) {
                        if (!(view2 instanceof ListView)) {
                            z = false;
                        }
                    }
                    z = true;
                }
                if (z && view2.getGlobalVisibleRect(rect)) {
                    arrayList.add(rect);
                }
            }
            return arrayList;
        } catch (Exception e) {
            C14963ax.m30834d().mo28588a((Throwable) e, "ActiveViewUnit.getParentScrollViewRects");
            return Collections.emptyList();
        }
    }

    public final void onScrollChanged() {
        mo30749a(1);
    }

    public final void onGlobalLayout() {
        mo30749a(2);
    }

    /* renamed from: a */
    public final void mo30751a(bvd bvd) {
        synchronized (this.f43999c) {
            this.f44008l = bvd;
        }
    }

    /* renamed from: d */
    public final void mo30760d() {
        synchronized (this.f43999c) {
            this.f44011o = true;
            mo30749a(3);
        }
    }

    /* renamed from: e */
    public final void mo30761e() {
        synchronized (this.f43999c) {
            this.f44010n = true;
            mo30749a(3);
        }
    }

    /* renamed from: f */
    public final void mo30762f() {
        synchronized (this.f43999c) {
            this.f44010n = false;
            mo30749a(3);
        }
    }

    /* renamed from: a */
    public final void mo30750a(long j) {
        this.f44017u.mo28749a(j);
    }

    /* renamed from: g */
    public final void mo30763g() {
        this.f44017u.mo28749a(f43997b);
    }
}
