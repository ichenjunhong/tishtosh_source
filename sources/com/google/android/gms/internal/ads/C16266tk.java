package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C14943ad;
import java.lang.ref.WeakReference;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.tk */
public final class C16266tk {
    /* access modifiers changed from: 0000 */

    /* renamed from: a */
    public final C14943ad f45610a;

    /* renamed from: b */
    private final Object f45611b = new Object();

    /* renamed from: c */
    private final Context f45612c;

    /* renamed from: d */
    private final beh f45613d;

    /* renamed from: e */
    private final abc f45614e;

    /* renamed from: f */
    private final C15806ck f45615f;

    /* renamed from: g */
    private OnGlobalLayoutListener f45616g;

    /* renamed from: h */
    private OnScrollChangedListener f45617h;

    /* renamed from: i */
    private final DisplayMetrics f45618i;

    /* renamed from: j */
    private aeh f45619j;

    /* renamed from: k */
    private int f45620k = -1;

    /* renamed from: l */
    private int f45621l = -1;

    public C16266tk(Context context, beh beh, abc abc, C15806ck ckVar, C14943ad adVar) {
        this.f45612c = context;
        this.f45613d = beh;
        this.f45614e = abc;
        this.f45615f = ckVar;
        this.f45610a = adVar;
        this.f45619j = new aeh(200);
        this.f45618i = acd.m32572a((WindowManager) context.getSystemService("window"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo31407a(ama ama, boolean z) {
        ama.mo29157a("/video", C15932ha.f45019l);
        ama.mo29157a("/videoMeta", C15932ha.f45020m);
        ama.mo29157a("/precache", (C15948hq<? super ama>) new alc<Object>());
        ama.mo29157a("/delayPageLoaded", C15932ha.f45023p);
        ama.mo29157a("/instrument", C15932ha.f45021n);
        ama.mo29157a("/log", C15932ha.f45014g);
        ama.mo29157a("/videoClicked", C15932ha.f45015h);
        ama.mo29157a("/trackActiveViewUnit", (C15948hq<? super ama>) new C16272tq<Object>(this));
        ama.mo29157a("/untrackActiveViewUnit", (C15948hq<? super ama>) new C16273tr<Object>(this));
        if (z) {
            ama.mo29157a("/open", (C15948hq<? super ama>) new C15962id<Object>(null, null));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final OnGlobalLayoutListener mo31405a(WeakReference<ama> weakReference) {
        if (this.f45616g == null) {
            this.f45616g = new C16274ts(this, weakReference);
        }
        return this.f45616g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final OnScrollChangedListener mo31408b(WeakReference<ama> weakReference) {
        if (this.f45617h == null) {
            this.f45617h = new C16275tt(this, weakReference);
        }
        return this.f45617h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final ama mo31406a() throws amk {
        return amg.m33346a(this.f45612c, anp.m33671a(), "native-video", false, false, this.f45613d, this.f45614e.f40129a.f46140k, this.f45615f, null, this.f45610a.f38505i, this.f45614e.f40137i);
    }

    /* renamed from: a */
    static /* synthetic */ void m38833a(C16266tk tkVar, WeakReference weakReference, boolean z) {
        if (weakReference != null) {
            ama ama = (ama) weakReference.get();
            if (ama != null && ama.getView() != null) {
                if (!z || tkVar.f45619j.mo28750a()) {
                    int[] iArr = new int[2];
                    ama.getView().getLocationOnScreen(iArr);
                    int b = aes.m32759b(tkVar.f45618i, iArr[0]);
                    int b2 = aes.m32759b(tkVar.f45618i, iArr[1]);
                    synchronized (tkVar.f45611b) {
                        if (!(tkVar.f45620k == b && tkVar.f45621l == b2)) {
                            tkVar.f45620k = b;
                            tkVar.f45621l = b2;
                            ama.mo29197w().mo29204a(tkVar.f45620k, tkVar.f45621l, !z);
                        }
                    }
                }
            }
        }
    }
}
