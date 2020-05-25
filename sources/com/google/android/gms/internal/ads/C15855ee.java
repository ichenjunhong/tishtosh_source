package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.common.util.C15524o;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.ee */
public final class C15855ee extends C15871eu implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener, C15860ej {

    /* renamed from: b */
    private static final String[] f44938b = {"2011", "1009", "3010"};

    /* renamed from: a */
    private final String f44939a;

    /* renamed from: c */
    private final Object f44940c = new Object();

    /* renamed from: d */
    private final FrameLayout f44941d;

    /* renamed from: e */
    private FrameLayout f44942e;

    /* renamed from: f */
    private View f44943f;

    /* renamed from: g */
    private Map<String, WeakReference<View>> f44944g = Collections.synchronizedMap(new HashMap());

    /* renamed from: h */
    private View f44945h;

    /* renamed from: i */
    private C15839dq f44946i;

    /* renamed from: j */
    private boolean f44947j = false;

    /* renamed from: k */
    private Point f44948k = new Point();

    /* renamed from: l */
    private Point f44949l = new Point();

    /* renamed from: m */
    private WeakReference<bvs> f44950m = new WeakReference<>(null);

    public C15855ee(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        this.f44941d = frameLayout;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f44939a = str;
        this.f44942e = frameLayout2;
        agu.m32860a((View) this.f44941d, (OnGlobalLayoutListener) this);
        agu.m32861a((View) this.f44941d, (OnScrollChangedListener) this);
        this.f44941d.setOnTouchListener(this);
        this.f44941d.setOnClickListener(this);
        if (frameLayout2 != null && C15524o.m32299g()) {
            frameLayout2.setElevation(Float.MAX_VALUE);
        }
        C15740bx.m36941a(this.f44941d.getContext());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31058a(java.lang.String r4, com.google.android.gms.p1027a.C14882b r5) {
        /*
            r3 = this;
            java.lang.Object r5 = com.google.android.gms.p1027a.C14886d.m30545a(r5)
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r0 = r3.f44940c
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r3.f44944g     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x000f:
            if (r5 != 0) goto L_0x0017
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r3.f44944g     // Catch:{ all -> 0x0040 }
            r5.remove(r4)     // Catch:{ all -> 0x0040 }
            goto L_0x003c
        L_0x0017:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r3.f44944g     // Catch:{ all -> 0x0040 }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0040 }
            r2.<init>(r5)     // Catch:{ all -> 0x0040 }
            r1.put(r4, r2)     // Catch:{ all -> 0x0040 }
            java.lang.String r1 = "1098"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x003e
            java.lang.String r1 = "3011"
            boolean r4 = r1.equals(r4)     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x0032
            goto L_0x003e
        L_0x0032:
            r5.setOnTouchListener(r3)     // Catch:{ all -> 0x0040 }
            r4 = 1
            r5.setClickable(r4)     // Catch:{ all -> 0x0040 }
            r5.setOnClickListener(r3)     // Catch:{ all -> 0x0040 }
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0040:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15855ee.mo31058a(java.lang.String, com.google.android.gms.a.b):void");
    }

    /* renamed from: a */
    public final C14882b mo31054a(String str) {
        synchronized (this.f44940c) {
            View view = null;
            if (this.f44944g == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference) this.f44944g.get(str);
            if (weakReference != null) {
                view = (View) weakReference.get();
            }
            C14882b a = C14886d.m30544a(view);
            return a;
        }
    }

    /* renamed from: a */
    private final void m37437a(View view) {
        C15839dq dqVar;
        if (this.f44946i != null) {
            if (this.f44946i instanceof C15838dp) {
                dqVar = ((C15838dp) this.f44946i).mo31026i();
            } else {
                dqVar = this.f44946i;
            }
            if (dqVar != null) {
                dqVar.mo31038c(view);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x027b, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x016b A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31056a(com.google.android.gms.p1027a.C14882b r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f44940c
            monitor-enter(r0)
            r1 = 0
            r11.m37437a(r1)     // Catch:{ all -> 0x027f }
            java.lang.Object r12 = com.google.android.gms.p1027a.C14886d.m30545a(r12)     // Catch:{ all -> 0x027f }
            boolean r2 = r12 instanceof com.google.android.gms.internal.ads.C15845dv     // Catch:{ all -> 0x027f }
            if (r2 != 0) goto L_0x0016
            java.lang.String r12 = "Not an instance of native engine. This is most likely a transient error"
            com.google.android.gms.internal.ads.abv.m32798e(r12)     // Catch:{ all -> 0x027f }
            monitor-exit(r0)     // Catch:{ all -> 0x027f }
            return
        L_0x0016:
            r2 = 1
            r11.f44947j = r2     // Catch:{ all -> 0x027f }
            com.google.android.gms.internal.ads.dv r12 = (com.google.android.gms.internal.ads.C15845dv) r12     // Catch:{ all -> 0x027f }
            com.google.android.gms.internal.ads.dq r3 = r11.f44946i     // Catch:{ all -> 0x027f }
            if (r3 == 0) goto L_0x0028
            com.google.android.gms.internal.ads.dq r3 = r11.f44946i     // Catch:{ all -> 0x027f }
            android.widget.FrameLayout r4 = r11.f44941d     // Catch:{ all -> 0x027f }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r11.f44944g     // Catch:{ all -> 0x027f }
            r3.mo31018b(r4, r5)     // Catch:{ all -> 0x027f }
        L_0x0028:
            com.google.android.gms.internal.ads.dq r3 = r11.f44946i     // Catch:{ all -> 0x027f }
            boolean r3 = r3 instanceof com.google.android.gms.internal.ads.C15845dv     // Catch:{ all -> 0x027f }
            r9 = 0
            if (r3 == 0) goto L_0x0063
            com.google.android.gms.internal.ads.dq r3 = r11.f44946i     // Catch:{ all -> 0x027f }
            com.google.android.gms.internal.ads.dv r3 = (com.google.android.gms.internal.ads.C15845dv) r3     // Catch:{ all -> 0x027f }
            if (r3 == 0) goto L_0x0063
            android.content.Context r4 = r3.mo31041p()     // Catch:{ all -> 0x027f }
            if (r4 == 0) goto L_0x0063
            com.google.android.gms.internal.ads.aad r4 = com.google.android.gms.ads.internal.C14963ax.m30849s()     // Catch:{ all -> 0x027f }
            android.widget.FrameLayout r5 = r11.f44941d     // Catch:{ all -> 0x027f }
            android.content.Context r5 = r5.getContext()     // Catch:{ all -> 0x027f }
            boolean r4 = r4.mo28557a(r5)     // Catch:{ all -> 0x027f }
            if (r4 == 0) goto L_0x0063
            com.google.android.gms.internal.ads.aac r3 = r3.mo31051q()     // Catch:{ all -> 0x027f }
            if (r3 == 0) goto L_0x0054
            r3.mo28550a(r9)     // Catch:{ all -> 0x027f }
        L_0x0054:
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.bvs> r4 = r11.f44950m     // Catch:{ all -> 0x027f }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x027f }
            com.google.android.gms.internal.ads.bvs r4 = (com.google.android.gms.internal.ads.bvs) r4     // Catch:{ all -> 0x027f }
            if (r4 == 0) goto L_0x0063
            if (r3 == 0) goto L_0x0063
            r4.mo30777b(r3)     // Catch:{ all -> 0x027f }
        L_0x0063:
            com.google.android.gms.internal.ads.dq r3 = r11.f44946i     // Catch:{ all -> 0x027f }
            boolean r3 = r3 instanceof com.google.android.gms.internal.ads.C15838dp     // Catch:{ all -> 0x027f }
            if (r3 == 0) goto L_0x007b
            com.google.android.gms.internal.ads.dq r3 = r11.f44946i     // Catch:{ all -> 0x027f }
            com.google.android.gms.internal.ads.dp r3 = (com.google.android.gms.internal.ads.C15838dp) r3     // Catch:{ all -> 0x027f }
            boolean r3 = r3.mo31025h()     // Catch:{ all -> 0x027f }
            if (r3 == 0) goto L_0x007b
            com.google.android.gms.internal.ads.dq r3 = r11.f44946i     // Catch:{ all -> 0x027f }
            com.google.android.gms.internal.ads.dp r3 = (com.google.android.gms.internal.ads.C15838dp) r3     // Catch:{ all -> 0x027f }
            r3.mo31015a(r12)     // Catch:{ all -> 0x027f }
            goto L_0x0087
        L_0x007b:
            r11.f44946i = r12     // Catch:{ all -> 0x027f }
            boolean r3 = r12 instanceof com.google.android.gms.internal.ads.C15838dp     // Catch:{ all -> 0x027f }
            if (r3 == 0) goto L_0x0087
            r3 = r12
            com.google.android.gms.internal.ads.dp r3 = (com.google.android.gms.internal.ads.C15838dp) r3     // Catch:{ all -> 0x027f }
            r3.mo31015a(r1)     // Catch:{ all -> 0x027f }
        L_0x0087:
            android.widget.FrameLayout r3 = r11.f44942e     // Catch:{ all -> 0x027f }
            if (r3 != 0) goto L_0x008d
            monitor-exit(r0)     // Catch:{ all -> 0x027f }
            return
        L_0x008d:
            android.widget.FrameLayout r3 = r11.f44942e     // Catch:{ all -> 0x027f }
            r3.setClickable(r9)     // Catch:{ all -> 0x027f }
            android.widget.FrameLayout r3 = r11.f44942e     // Catch:{ all -> 0x027f }
            r3.removeAllViews()     // Catch:{ all -> 0x027f }
            boolean r3 = r12.mo31017a()     // Catch:{ all -> 0x027f }
            if (r3 == 0) goto L_0x00cd
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r11.f44944g     // Catch:{ all -> 0x027f }
            if (r4 == 0) goto L_0x00c5
            r4 = 2
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ all -> 0x027f }
            java.lang.String r6 = "1098"
            r5[r9] = r6     // Catch:{ all -> 0x027f }
            java.lang.String r6 = "3011"
            r5[r2] = r6     // Catch:{ all -> 0x027f }
            r6 = 0
        L_0x00ad:
            if (r6 >= r4) goto L_0x00c5
            r7 = r5[r6]     // Catch:{ all -> 0x027f }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r8 = r11.f44944g     // Catch:{ all -> 0x027f }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x027f }
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7     // Catch:{ all -> 0x027f }
            if (r7 == 0) goto L_0x00c2
            java.lang.Object r4 = r7.get()     // Catch:{ all -> 0x027f }
            android.view.View r4 = (android.view.View) r4     // Catch:{ all -> 0x027f }
            goto L_0x00c6
        L_0x00c2:
            int r6 = r6 + 1
            goto L_0x00ad
        L_0x00c5:
            r4 = r1
        L_0x00c6:
            boolean r5 = r4 instanceof android.view.ViewGroup     // Catch:{ all -> 0x027f }
            if (r5 == 0) goto L_0x00cd
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch:{ all -> 0x027f }
            goto L_0x00ce
        L_0x00cd:
            r4 = r1
        L_0x00ce:
            if (r3 == 0) goto L_0x00d4
            if (r4 == 0) goto L_0x00d4
            r3 = 1
            goto L_0x00d5
        L_0x00d4:
            r3 = 0
        L_0x00d5:
            android.view.View r5 = r12.mo31009a(r11, r3)     // Catch:{ all -> 0x027f }
            r11.f44945h = r5     // Catch:{ all -> 0x027f }
            android.view.View r5 = r11.f44945h     // Catch:{ all -> 0x027f }
            r10 = -1
            if (r5 == 0) goto L_0x011c
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r11.f44944g     // Catch:{ all -> 0x027f }
            if (r5 == 0) goto L_0x00f2
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r11.f44944g     // Catch:{ all -> 0x027f }
            java.lang.String r6 = r11.f44939a     // Catch:{ all -> 0x027f }
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x027f }
            android.view.View r8 = r11.f44945h     // Catch:{ all -> 0x027f }
            r7.<init>(r8)     // Catch:{ all -> 0x027f }
            r5.put(r6, r7)     // Catch:{ all -> 0x027f }
        L_0x00f2:
            if (r3 == 0) goto L_0x00fd
            r4.removeAllViews()     // Catch:{ all -> 0x027f }
            android.view.View r3 = r11.f44945h     // Catch:{ all -> 0x027f }
            r4.addView(r3)     // Catch:{ all -> 0x027f }
            goto L_0x011c
        L_0x00fd:
            android.content.Context r3 = r12.mo31041p()     // Catch:{ all -> 0x027f }
            com.google.android.gms.ads.formats.a r4 = new com.google.android.gms.ads.formats.a     // Catch:{ all -> 0x027f }
            r4.<init>(r3)     // Catch:{ all -> 0x027f }
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x027f }
            r3.<init>(r10, r10)     // Catch:{ all -> 0x027f }
            r4.setLayoutParams(r3)     // Catch:{ all -> 0x027f }
            android.view.View r3 = r11.f44945h     // Catch:{ all -> 0x027f }
            r4.addView(r3)     // Catch:{ all -> 0x027f }
            android.widget.FrameLayout r3 = r11.f44942e     // Catch:{ all -> 0x027f }
            if (r3 == 0) goto L_0x011c
            android.widget.FrameLayout r3 = r11.f44942e     // Catch:{ all -> 0x027f }
            r3.addView(r4)     // Catch:{ all -> 0x027f }
        L_0x011c:
            android.widget.FrameLayout r4 = r11.f44941d     // Catch:{ all -> 0x027f }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r11.f44944g     // Catch:{ all -> 0x027f }
            r6 = 0
            r3 = r12
            r7 = r11
            r8 = r11
            r3.mo31014a(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x027f }
            android.view.View r3 = r11.f44943f     // Catch:{ all -> 0x027f }
            if (r3 != 0) goto L_0x0142
            android.view.View r3 = new android.view.View     // Catch:{ all -> 0x027f }
            android.widget.FrameLayout r4 = r11.f44941d     // Catch:{ all -> 0x027f }
            android.content.Context r4 = r4.getContext()     // Catch:{ all -> 0x027f }
            r3.<init>(r4)     // Catch:{ all -> 0x027f }
            r11.f44943f = r3     // Catch:{ all -> 0x027f }
            android.view.View r3 = r11.f44943f     // Catch:{ all -> 0x027f }
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x027f }
            r4.<init>(r10, r9)     // Catch:{ all -> 0x027f }
            r3.setLayoutParams(r4)     // Catch:{ all -> 0x027f }
        L_0x0142:
            android.widget.FrameLayout r3 = r11.f44941d     // Catch:{ all -> 0x027f }
            android.view.View r4 = r11.f44943f     // Catch:{ all -> 0x027f }
            android.view.ViewParent r4 = r4.getParent()     // Catch:{ all -> 0x027f }
            if (r3 == r4) goto L_0x0153
            android.widget.FrameLayout r3 = r11.f44941d     // Catch:{ all -> 0x027f }
            android.view.View r4 = r11.f44943f     // Catch:{ all -> 0x027f }
            r3.addView(r4)     // Catch:{ all -> 0x027f }
        L_0x0153:
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.C15740bx.f44401dc     // Catch:{ all -> 0x027f }
            com.google.android.gms.internal.ads.bu r4 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ all -> 0x027f }
            java.lang.Object r3 = r4.mo30717a(r3)     // Catch:{ all -> 0x027f }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x027f }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x027f }
            if (r3 != 0) goto L_0x0168
            r11.m37438a(r12)     // Catch:{ all -> 0x027f }
        L_0x0168:
            java.lang.Object r3 = r11.f44940c     // Catch:{ all -> 0x027f }
            monitor-enter(r3)     // Catch:{ all -> 0x027f }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r11.f44944g     // Catch:{ all -> 0x027c }
            com.google.android.gms.internal.ads.dt r5 = r12.f44906b     // Catch:{ all -> 0x027c }
            android.view.View r5 = r5.mo30923e()     // Catch:{ all -> 0x027c }
            if (r5 == 0) goto L_0x01e8
            java.lang.String r5 = "2"
            com.google.android.gms.internal.ads.dt r6 = r12.f44906b     // Catch:{ all -> 0x027c }
            java.lang.String r6 = r6.mo30920b()     // Catch:{ all -> 0x027c }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x027c }
            if (r5 == 0) goto L_0x01af
            com.google.android.gms.internal.ads.abh r5 = com.google.android.gms.ads.internal.C14963ax.m30834d()     // Catch:{ all -> 0x027c }
            com.google.android.gms.internal.ads.abx r5 = r5.mo28595f()     // Catch:{ all -> 0x027c }
            com.google.android.gms.internal.ads.ds r6 = r12.f44905a     // Catch:{ all -> 0x027c }
            java.lang.String r6 = r6.mo27444A()     // Catch:{ all -> 0x027c }
            com.google.android.gms.internal.ads.dt r7 = r12.f44906b     // Catch:{ all -> 0x027c }
            java.lang.String r7 = r7.mo30920b()     // Catch:{ all -> 0x027c }
            if (r4 == 0) goto L_0x01aa
            java.lang.String r8 = "2011"
            boolean r8 = r4.containsKey(r8)     // Catch:{ all -> 0x027c }
            if (r8 != 0) goto L_0x01ab
            java.lang.String r8 = "3010"
            boolean r4 = r4.containsKey(r8)     // Catch:{ all -> 0x027c }
            if (r4 == 0) goto L_0x01aa
            goto L_0x01ab
        L_0x01aa:
            r2 = 0
        L_0x01ab:
            r5.mo28627a(r6, r7, r2)     // Catch:{ all -> 0x027c }
            goto L_0x01e8
        L_0x01af:
            java.lang.String r5 = "1"
            com.google.android.gms.internal.ads.dt r6 = r12.f44906b     // Catch:{ all -> 0x027c }
            java.lang.String r6 = r6.mo30920b()     // Catch:{ all -> 0x027c }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x027c }
            if (r5 == 0) goto L_0x01e8
            com.google.android.gms.internal.ads.abh r5 = com.google.android.gms.ads.internal.C14963ax.m30834d()     // Catch:{ all -> 0x027c }
            com.google.android.gms.internal.ads.abx r5 = r5.mo28595f()     // Catch:{ all -> 0x027c }
            com.google.android.gms.internal.ads.ds r6 = r12.f44905a     // Catch:{ all -> 0x027c }
            java.lang.String r6 = r6.mo27444A()     // Catch:{ all -> 0x027c }
            com.google.android.gms.internal.ads.dt r7 = r12.f44906b     // Catch:{ all -> 0x027c }
            java.lang.String r7 = r7.mo30920b()     // Catch:{ all -> 0x027c }
            if (r4 == 0) goto L_0x01e4
            java.lang.String r8 = "1009"
            boolean r8 = r4.containsKey(r8)     // Catch:{ all -> 0x027c }
            if (r8 != 0) goto L_0x01e5
            java.lang.String r8 = "3010"
            boolean r4 = r4.containsKey(r8)     // Catch:{ all -> 0x027c }
            if (r4 == 0) goto L_0x01e4
            goto L_0x01e5
        L_0x01e4:
            r2 = 0
        L_0x01e5:
            r5.mo28627a(r6, r7, r2)     // Catch:{ all -> 0x027c }
        L_0x01e8:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r2 = r11.f44944g     // Catch:{ all -> 0x027c }
            if (r2 == 0) goto L_0x0207
            java.lang.String[] r2 = f44938b     // Catch:{ all -> 0x027c }
            int r4 = r2.length     // Catch:{ all -> 0x027c }
        L_0x01ef:
            if (r9 >= r4) goto L_0x0207
            r5 = r2[r9]     // Catch:{ all -> 0x027c }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r11.f44944g     // Catch:{ all -> 0x027c }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x027c }
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch:{ all -> 0x027c }
            if (r5 == 0) goto L_0x0204
            java.lang.Object r1 = r5.get()     // Catch:{ all -> 0x027c }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x027c }
            goto L_0x0207
        L_0x0204:
            int r9 = r9 + 1
            goto L_0x01ef
        L_0x0207:
            boolean r2 = r1 instanceof android.widget.FrameLayout     // Catch:{ all -> 0x027c }
            if (r2 != 0) goto L_0x020d
            monitor-exit(r3)     // Catch:{ all -> 0x027c }
            goto L_0x021e
        L_0x020d:
            com.google.android.gms.internal.ads.ef r2 = new com.google.android.gms.internal.ads.ef     // Catch:{ all -> 0x027c }
            r2.<init>(r11, r1)     // Catch:{ all -> 0x027c }
            boolean r4 = r12 instanceof com.google.android.gms.internal.ads.C15838dp     // Catch:{ all -> 0x027c }
            if (r4 == 0) goto L_0x021a
            r12.mo31050b(r1, r2)     // Catch:{ all -> 0x027c }
            goto L_0x021d
        L_0x021a:
            r12.mo31032a(r1, r2)     // Catch:{ all -> 0x027c }
        L_0x021d:
            monitor-exit(r3)     // Catch:{ all -> 0x027c }
        L_0x021e:
            r12.f44909e = r11     // Catch:{ all -> 0x027f }
            android.widget.FrameLayout r1 = r11.f44941d     // Catch:{ all -> 0x027f }
            com.google.android.gms.internal.ads.ds r12 = r12.f44905a     // Catch:{ all -> 0x027f }
            r12.mo27528b(r1)     // Catch:{ all -> 0x027f }
            android.widget.FrameLayout r12 = r11.f44941d     // Catch:{ all -> 0x027f }
            r11.m37437a(r12)     // Catch:{ all -> 0x027f }
            com.google.android.gms.internal.ads.dq r12 = r11.f44946i     // Catch:{ all -> 0x027f }
            android.widget.FrameLayout r1 = r11.f44941d     // Catch:{ all -> 0x027f }
            r12.mo31036b(r1)     // Catch:{ all -> 0x027f }
            com.google.android.gms.internal.ads.dq r12 = r11.f44946i     // Catch:{ all -> 0x027f }
            boolean r12 = r12 instanceof com.google.android.gms.internal.ads.C15845dv     // Catch:{ all -> 0x027f }
            if (r12 == 0) goto L_0x027a
            com.google.android.gms.internal.ads.dq r12 = r11.f44946i     // Catch:{ all -> 0x027f }
            com.google.android.gms.internal.ads.dv r12 = (com.google.android.gms.internal.ads.C15845dv) r12     // Catch:{ all -> 0x027f }
            if (r12 == 0) goto L_0x027a
            android.content.Context r1 = r12.mo31041p()     // Catch:{ all -> 0x027f }
            if (r1 == 0) goto L_0x027a
            com.google.android.gms.internal.ads.aad r1 = com.google.android.gms.ads.internal.C14963ax.m30849s()     // Catch:{ all -> 0x027f }
            android.widget.FrameLayout r2 = r11.f44941d     // Catch:{ all -> 0x027f }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x027f }
            boolean r1 = r1.mo28557a(r2)     // Catch:{ all -> 0x027f }
            if (r1 == 0) goto L_0x027a
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.bvs> r1 = r11.f44950m     // Catch:{ all -> 0x027f }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x027f }
            com.google.android.gms.internal.ads.bvs r1 = (com.google.android.gms.internal.ads.bvs) r1     // Catch:{ all -> 0x027f }
            if (r1 != 0) goto L_0x0273
            com.google.android.gms.internal.ads.bvs r1 = new com.google.android.gms.internal.ads.bvs     // Catch:{ all -> 0x027f }
            android.widget.FrameLayout r2 = r11.f44941d     // Catch:{ all -> 0x027f }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x027f }
            android.widget.FrameLayout r3 = r11.f44941d     // Catch:{ all -> 0x027f }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x027f }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x027f }
            r2.<init>(r1)     // Catch:{ all -> 0x027f }
            r11.f44950m = r2     // Catch:{ all -> 0x027f }
        L_0x0273:
            com.google.android.gms.internal.ads.aac r12 = r12.mo31051q()     // Catch:{ all -> 0x027f }
            r1.mo30776a(r12)     // Catch:{ all -> 0x027f }
        L_0x027a:
            monitor-exit(r0)     // Catch:{ all -> 0x027f }
            return
        L_0x027c:
            r12 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x027c }
            throw r12     // Catch:{ all -> 0x027f }
        L_0x027f:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x027f }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15855ee.mo31056a(com.google.android.gms.a.b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b2, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f44940c
            monitor-enter(r0)
            com.google.android.gms.internal.ads.dq r1 = r9.f44946i     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x0009:
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.C15740bx.f44401dc     // Catch:{ all -> 0x00b3 }
            com.google.android.gms.internal.ads.bu r2 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ all -> 0x00b3 }
            java.lang.Object r1 = r2.mo30717a(r1)     // Catch:{ all -> 0x00b3 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00b3 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x0028
            com.google.android.gms.internal.ads.dq r1 = r9.f44946i     // Catch:{ all -> 0x00b3 }
            boolean r1 = r1 instanceof com.google.android.gms.internal.ads.C15845dv     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x0028
            com.google.android.gms.internal.ads.dq r1 = r9.f44946i     // Catch:{ all -> 0x00b3 }
            com.google.android.gms.internal.ads.dv r1 = (com.google.android.gms.internal.ads.C15845dv) r1     // Catch:{ all -> 0x00b3 }
            r9.m37438a(r1)     // Catch:{ all -> 0x00b3 }
        L_0x0028:
            com.google.android.gms.internal.ads.dq r1 = r9.f44946i     // Catch:{ all -> 0x00b3 }
            r1.mo31021d()     // Catch:{ all -> 0x00b3 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x00b3 }
            r5.<init>()     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = "x"
            android.graphics.Point r2 = r9.f44948k     // Catch:{ all -> 0x00b3 }
            int r2 = r2.x     // Catch:{ all -> 0x00b3 }
            int r2 = r9.m37436a(r2)     // Catch:{ all -> 0x00b3 }
            float r2 = (float) r2     // Catch:{ all -> 0x00b3 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = "y"
            android.graphics.Point r2 = r9.f44948k     // Catch:{ all -> 0x00b3 }
            int r2 = r2.y     // Catch:{ all -> 0x00b3 }
            int r2 = r9.m37436a(r2)     // Catch:{ all -> 0x00b3 }
            float r2 = (float) r2     // Catch:{ all -> 0x00b3 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = "start_x"
            android.graphics.Point r2 = r9.f44949l     // Catch:{ all -> 0x00b3 }
            int r2 = r2.x     // Catch:{ all -> 0x00b3 }
            int r2 = r9.m37436a(r2)     // Catch:{ all -> 0x00b3 }
            float r2 = (float) r2     // Catch:{ all -> 0x00b3 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = "start_y"
            android.graphics.Point r2 = r9.f44949l     // Catch:{ all -> 0x00b3 }
            int r2 = r2.y     // Catch:{ all -> 0x00b3 }
            int r2 = r9.m37436a(r2)     // Catch:{ all -> 0x00b3 }
            float r2 = (float) r2     // Catch:{ all -> 0x00b3 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x00b3 }
            android.view.View r1 = r9.f44945h     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x00a8
            android.view.View r1 = r9.f44945h     // Catch:{ all -> 0x00b3 }
            boolean r1 = r1.equals(r10)     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x00a8
            com.google.android.gms.internal.ads.dq r1 = r9.f44946i     // Catch:{ all -> 0x00b3 }
            boolean r1 = r1 instanceof com.google.android.gms.internal.ads.C15838dp     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x009a
            com.google.android.gms.internal.ads.dq r1 = r9.f44946i     // Catch:{ all -> 0x00b3 }
            com.google.android.gms.internal.ads.dp r1 = (com.google.android.gms.internal.ads.C15838dp) r1     // Catch:{ all -> 0x00b3 }
            com.google.android.gms.internal.ads.dq r1 = r1.mo31026i()     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x00b1
            com.google.android.gms.internal.ads.dq r1 = r9.f44946i     // Catch:{ all -> 0x00b3 }
            com.google.android.gms.internal.ads.dp r1 = (com.google.android.gms.internal.ads.C15838dp) r1     // Catch:{ all -> 0x00b3 }
            com.google.android.gms.internal.ads.dq r2 = r1.mo31026i()     // Catch:{ all -> 0x00b3 }
            java.lang.String r4 = r9.f44939a     // Catch:{ all -> 0x00b3 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r9.f44944g     // Catch:{ all -> 0x00b3 }
            android.widget.FrameLayout r7 = r9.f44941d     // Catch:{ all -> 0x00b3 }
            r8 = 0
            r3 = r10
            r2.mo31033a(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00b3 }
            goto L_0x00b1
        L_0x009a:
            com.google.android.gms.internal.ads.dq r2 = r9.f44946i     // Catch:{ all -> 0x00b3 }
            java.lang.String r4 = r9.f44939a     // Catch:{ all -> 0x00b3 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r9.f44944g     // Catch:{ all -> 0x00b3 }
            android.widget.FrameLayout r7 = r9.f44941d     // Catch:{ all -> 0x00b3 }
            r8 = 0
            r3 = r10
            r2.mo31033a(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00b3 }
            goto L_0x00b1
        L_0x00a8:
            com.google.android.gms.internal.ads.dq r1 = r9.f44946i     // Catch:{ all -> 0x00b3 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r2 = r9.f44944g     // Catch:{ all -> 0x00b3 }
            android.widget.FrameLayout r3 = r9.f44941d     // Catch:{ all -> 0x00b3 }
            r1.mo31013a(r10, r2, r5, r3)     // Catch:{ all -> 0x00b3 }
        L_0x00b1:
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x00b3:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15855ee.onClick(android.view.View):void");
    }

    /* renamed from: a */
    private final void m37438a(C15845dv dvVar) {
        ama ama;
        if (this.f44942e != null) {
            try {
                ama = dvVar.mo31027j();
            } catch (amk e) {
                if (acm.m32637c()) {
                    abv.m32798e("Privileged processes cannot create HTML overlays.");
                } else {
                    abv.m32793b("Error obtaining overlay.", e);
                }
                ama = null;
            }
            if (ama != null) {
                this.f44942e.addView(ama.getView());
            }
        }
    }

    public final void onGlobalLayout() {
        synchronized (this.f44940c) {
            if (this.f44946i != null) {
                this.f44946i.mo31039c(this.f44941d, this.f44944g);
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.f44940c) {
            if (this.f44946i != null) {
                this.f44946i.mo31039c(this.f44941d, this.f44944g);
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f44940c) {
            if (this.f44946i == null) {
                return false;
            }
            int[] iArr = new int[2];
            this.f44941d.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.f44948k = point;
            if (motionEvent.getAction() == 0) {
                this.f44949l = point;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) point.x, (float) point.y);
            this.f44946i.mo31010a(obtain);
            obtain.recycle();
            return false;
        }
    }

    /* renamed from: a */
    public final void mo31055a() {
        synchronized (this.f44940c) {
            if (this.f44942e != null) {
                this.f44942e.removeAllViews();
            }
            this.f44942e = null;
            this.f44944g = null;
            this.f44945h = null;
            this.f44946i = null;
            this.f44948k = null;
            this.f44949l = null;
            this.f44950m = null;
            this.f44943f = null;
        }
    }

    /* renamed from: a */
    public final void mo31057a(C14882b bVar, int i) {
        if (C14963ax.m30849s().mo28557a(this.f44941d.getContext()) && this.f44950m != null) {
            bvs bvs = (bvs) this.f44950m.get();
            if (bvs != null) {
                bvs.mo30775a(4);
            }
        }
    }

    /* renamed from: b */
    public final void mo31060b(C14882b bVar) {
        this.f44946i.mo31011a((View) C14886d.m30545a(bVar));
    }

    /* renamed from: b */
    public final synchronized Map<String, WeakReference<View>> mo31059b() {
        return this.f44944g;
    }

    /* renamed from: c */
    public final View mo31061c() {
        return this.f44941d;
    }

    /* renamed from: a */
    private final int m37436a(int i) {
        return aes.m32758b(this.f44946i.mo31041p(), i);
    }
}
