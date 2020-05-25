package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.eg */
public final class C15857eg extends C15876ez implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener, C15860ej {

    /* renamed from: e */
    static final String[] f44953e = {"2011", "1009", "3010"};

    /* renamed from: a */
    final Object f44954a = new Object();

    /* renamed from: b */
    final Map<String, WeakReference<View>> f44955b = new HashMap();

    /* renamed from: c */
    final Map<String, WeakReference<View>> f44956c = new HashMap();

    /* renamed from: d */
    final Map<String, WeakReference<View>> f44957d = new HashMap();

    /* renamed from: f */
    private final WeakReference<View> f44958f;

    /* renamed from: g */
    private C15839dq f44959g;

    /* renamed from: h */
    private View f44960h;

    /* renamed from: i */
    private Point f44961i = new Point();

    /* renamed from: j */
    private Point f44962j = new Point();

    /* renamed from: k */
    private WeakReference<bvs> f44963k = new WeakReference<>(null);

    public C15857eg(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        agu.m32860a(view, (OnGlobalLayoutListener) this);
        agu.m32861a(view, (OnScrollChangedListener) this);
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        this.f44958f = new WeakReference<>(view);
        for (Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.f44955b.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f44957d.putAll(this.f44955b);
        for (Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.f44956c.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
            }
        }
        this.f44957d.putAll(this.f44956c);
        C15740bx.m36941a(view.getContext());
    }

    /* renamed from: a */
    public final void mo31066a() {
        synchronized (this.f44954a) {
            this.f44960h = null;
            this.f44959g = null;
            this.f44961i = null;
            this.f44962j = null;
        }
    }

    /* renamed from: a */
    public final void mo31067a(C14882b bVar) {
        int i;
        View view;
        synchronized (this.f44954a) {
            ViewGroup viewGroup = null;
            m37450a((View) null);
            Object a = C14886d.m30545a(bVar);
            if (!(a instanceof C15845dv)) {
                abv.m32798e("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            C15845dv dvVar = (C15845dv) a;
            if (!dvVar.mo31020c()) {
                abv.m32794c("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                return;
            }
            View view2 = (View) this.f44958f.get();
            if (!(this.f44959g == null || view2 == null)) {
                this.f44959g.mo31018b(view2, this.f44957d);
            }
            synchronized (this.f44954a) {
                i = 0;
                if (this.f44959g instanceof C15845dv) {
                    C15845dv dvVar2 = (C15845dv) this.f44959g;
                    View view3 = (View) this.f44958f.get();
                    if (!(dvVar2 == null || dvVar2.mo31041p() == null || view3 == null || !C14963ax.m30849s().mo28557a(view3.getContext()))) {
                        aac q = dvVar2.mo31051q();
                        if (q != null) {
                            q.mo28550a(false);
                        }
                        bvs bvs = (bvs) this.f44963k.get();
                        if (!(bvs == null || q == null)) {
                            bvs.mo30777b((bvw) q);
                        }
                    }
                }
            }
            if (!(this.f44959g instanceof C15838dp) || !((C15838dp) this.f44959g).mo31025h()) {
                this.f44959g = dvVar;
                if (dvVar instanceof C15838dp) {
                    ((C15838dp) dvVar).mo31015a((C15839dq) null);
                }
            } else {
                ((C15838dp) this.f44959g).mo31015a((C15839dq) dvVar);
            }
            String[] strArr = {"1098", "3011"};
            while (true) {
                if (i >= 2) {
                    view = null;
                    break;
                }
                WeakReference weakReference = (WeakReference) this.f44957d.get(strArr[i]);
                if (weakReference != null) {
                    view = (View) weakReference.get();
                    break;
                }
                i++;
            }
            if (view == null) {
                abv.m32798e("Ad choices asset view is not provided.");
            } else {
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                }
                if (viewGroup != null) {
                    this.f44960h = dvVar.mo31009a((OnClickListener) this, true);
                    if (this.f44960h != null) {
                        this.f44957d.put("1007", new WeakReference(this.f44960h));
                        this.f44955b.put("1007", new WeakReference(this.f44960h));
                        viewGroup.removeAllViews();
                        viewGroup.addView(this.f44960h);
                    }
                }
            }
            dvVar.mo31014a(view2, this.f44955b, this.f44956c, (OnTouchListener) this, (OnClickListener) this);
            acd.f40245a.post(new C15858eh(this, dvVar));
            m37450a(view2);
            this.f44959g.mo31036b(view2);
            synchronized (this.f44954a) {
                if (this.f44959g instanceof C15845dv) {
                    C15845dv dvVar3 = (C15845dv) this.f44959g;
                    View view4 = (View) this.f44958f.get();
                    if (!(dvVar3 == null || dvVar3.mo31041p() == null || view4 == null || !C14963ax.m30849s().mo28557a(view4.getContext()))) {
                        bvs bvs2 = (bvs) this.f44963k.get();
                        if (bvs2 == null) {
                            bvs2 = new bvs(view4.getContext(), view4);
                            this.f44963k = new WeakReference<>(bvs2);
                        }
                        bvs2.mo30776a((bvw) dvVar3.mo31051q());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo31068b(C14882b bVar) {
        synchronized (this.f44954a) {
            this.f44959g.mo31011a((View) C14886d.m30545a(bVar));
        }
    }

    /* renamed from: a */
    private final void m37450a(View view) {
        C15839dq dqVar;
        synchronized (this.f44954a) {
            if (this.f44959g != null) {
                if (this.f44959g instanceof C15838dp) {
                    dqVar = ((C15838dp) this.f44959g).mo31026i();
                } else {
                    dqVar = this.f44959g;
                }
                if (dqVar != null) {
                    dqVar.mo31038c(view);
                }
            }
        }
    }

    public final void onGlobalLayout() {
        synchronized (this.f44954a) {
            if (this.f44959g != null) {
                View view = (View) this.f44958f.get();
                if (view != null) {
                    this.f44959g.mo31039c(view, this.f44957d);
                }
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.f44954a) {
            if (this.f44959g != null) {
                View view = (View) this.f44958f.get();
                if (view != null) {
                    this.f44959g.mo31039c(view, this.f44957d);
                }
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f44954a) {
            if (this.f44959g == null) {
                return false;
            }
            View view2 = (View) this.f44958f.get();
            if (view2 == null) {
                return false;
            }
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.f44961i = point;
            if (motionEvent.getAction() == 0) {
                this.f44962j = point;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) point.x, (float) point.y);
            this.f44959g.mo31010a(obtain);
            obtain.recycle();
            return false;
        }
    }

    /* renamed from: b */
    public final synchronized Map<String, WeakReference<View>> mo31059b() {
        return this.f44957d;
    }

    /* renamed from: c */
    public final View mo31061c() {
        return (View) this.f44958f.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0095, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f44954a
            monitor-enter(r0)
            com.google.android.gms.internal.ads.dq r1 = r9.f44959g     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return
        L_0x0009:
            java.lang.ref.WeakReference<android.view.View> r1 = r9.f44958f     // Catch:{ all -> 0x0096 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0096 }
            r7 = r1
            android.view.View r7 = (android.view.View) r7     // Catch:{ all -> 0x0096 }
            if (r7 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return
        L_0x0016:
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x0096 }
            r5.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = "x"
            android.graphics.Point r2 = r9.f44961i     // Catch:{ all -> 0x0096 }
            int r2 = r2.x     // Catch:{ all -> 0x0096 }
            int r2 = r9.m37449a(r2)     // Catch:{ all -> 0x0096 }
            float r2 = (float) r2     // Catch:{ all -> 0x0096 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = "y"
            android.graphics.Point r2 = r9.f44961i     // Catch:{ all -> 0x0096 }
            int r2 = r2.y     // Catch:{ all -> 0x0096 }
            int r2 = r9.m37449a(r2)     // Catch:{ all -> 0x0096 }
            float r2 = (float) r2     // Catch:{ all -> 0x0096 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = "start_x"
            android.graphics.Point r2 = r9.f44962j     // Catch:{ all -> 0x0096 }
            int r2 = r2.x     // Catch:{ all -> 0x0096 }
            int r2 = r9.m37449a(r2)     // Catch:{ all -> 0x0096 }
            float r2 = (float) r2     // Catch:{ all -> 0x0096 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = "start_y"
            android.graphics.Point r2 = r9.f44962j     // Catch:{ all -> 0x0096 }
            int r2 = r2.y     // Catch:{ all -> 0x0096 }
            int r2 = r9.m37449a(r2)     // Catch:{ all -> 0x0096 }
            float r2 = (float) r2     // Catch:{ all -> 0x0096 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0096 }
            android.view.View r1 = r9.f44960h     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x008d
            android.view.View r1 = r9.f44960h     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.equals(r10)     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x008d
            com.google.android.gms.internal.ads.dq r1 = r9.f44959g     // Catch:{ all -> 0x0096 }
            boolean r1 = r1 instanceof com.google.android.gms.internal.ads.C15838dp     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x0081
            com.google.android.gms.internal.ads.dq r1 = r9.f44959g     // Catch:{ all -> 0x0096 }
            com.google.android.gms.internal.ads.dp r1 = (com.google.android.gms.internal.ads.C15838dp) r1     // Catch:{ all -> 0x0096 }
            com.google.android.gms.internal.ads.dq r1 = r1.mo31026i()     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x0094
            com.google.android.gms.internal.ads.dq r1 = r9.f44959g     // Catch:{ all -> 0x0096 }
            com.google.android.gms.internal.ads.dp r1 = (com.google.android.gms.internal.ads.C15838dp) r1     // Catch:{ all -> 0x0096 }
            com.google.android.gms.internal.ads.dq r2 = r1.mo31026i()     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r9.f44957d     // Catch:{ all -> 0x0096 }
            r8 = 0
            r3 = r10
            r2.mo31033a(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0096 }
            goto L_0x0094
        L_0x0081:
            com.google.android.gms.internal.ads.dq r2 = r9.f44959g     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r9.f44957d     // Catch:{ all -> 0x0096 }
            r8 = 0
            r3 = r10
            r2.mo31033a(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0096 }
            goto L_0x0094
        L_0x008d:
            com.google.android.gms.internal.ads.dq r1 = r9.f44959g     // Catch:{ all -> 0x0096 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r2 = r9.f44957d     // Catch:{ all -> 0x0096 }
            r1.mo31013a(r10, r2, r5, r7)     // Catch:{ all -> 0x0096 }
        L_0x0094:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return
        L_0x0096:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15857eg.onClick(android.view.View):void");
    }

    /* renamed from: a */
    private final int m37449a(int i) {
        int b;
        synchronized (this.f44954a) {
            b = aes.m32758b(this.f44959g.mo31041p(), i);
        }
        return b;
    }
}
