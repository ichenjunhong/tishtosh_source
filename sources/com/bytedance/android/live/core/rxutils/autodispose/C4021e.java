package com.bytedance.android.live.core.rxutils.autodispose;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.android.live.core.rxutils.C4056e;
import com.bytedance.android.live.core.rxutils.autodispose.p241a.C3999c;
import java.util.concurrent.Callable;
import p064c.p065a.C1673aa;
import p064c.p065a.C1674ab;
import p064c.p065a.C1680ad;
import p064c.p065a.C1686aj;
import p064c.p065a.C1687b;
import p064c.p065a.C2142f;
import p064c.p065a.C2149h;
import p064c.p065a.C2190m;
import p064c.p065a.C2193n;
import p064c.p065a.C2199t;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p072e.p074b.C1745b;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.e */
public final class C4021e {
    /* renamed from: a */
    public static <T> C4034m<T> m10136a(C0184k kVar) {
        if (kVar == null) {
            return m10141a(C4029h.f11162a);
        }
        return m10141a((C4004ae) C3991a.m10107a(kVar, C0177a.ON_DESTROY));
    }

    /* renamed from: b */
    static final /* synthetic */ C2142f m10143b(C4004ae aeVar) throws Exception {
        try {
            return aeVar.mo9398c();
        } catch (C4003ad e) {
            C1710e a = C4039r.m10168a();
            if (a == null) {
                return C1687b.m5988a((Throwable) e);
            }
            a.accept(e);
            return C1687b.m5986a();
        }
    }

    /* renamed from: c */
    static final /* synthetic */ C2142f m10144c(C4004ae aeVar) throws Exception {
        try {
            return aeVar.mo9398c();
        } catch (C4003ad e) {
            C1710e a = C4039r.m10168a();
            if (a == null) {
                return C1687b.m5988a((Throwable) e);
            }
            a.accept(e);
            return C1687b.m5986a();
        }
    }

    /* renamed from: a */
    public static <T> C4034m<T> m10137a(Fragment fragment) {
        if (fragment == null) {
            return m10141a(C4028g.f11161a);
        }
        return m10141a((C4004ae) C3991a.m10107a((C0184k) fragment, C0177a.ON_DESTROY));
    }

    /* renamed from: a */
    public static <T> C4034m<T> m10138a(FragmentActivity fragmentActivity) {
        if (fragmentActivity == null) {
            return m10141a(C4027f.f11160a);
        }
        return m10141a((C4004ae) C3991a.m10107a((C0184k) fragmentActivity, C0177a.ON_DESTROY));
    }

    /* renamed from: a */
    public static <T> C4034m<T> m10139a(View view) {
        if (view == null) {
            return m10141a(C4030i.f11163a);
        }
        if (view != null) {
            return m10141a((C4004ae) new C3999c(view));
        }
        throw new NullPointerException("view == null");
    }

    /* renamed from: a */
    public static <T> C4034m<T> m10141a(C4004ae aeVar) {
        C4041t.m10170a(aeVar, "provider == null");
        return m10140a((C2142f) C1687b.m5989a((Callable<? extends C2142f>) new C4031j<Object>(aeVar)), null);
    }

    /* renamed from: a */
    private static <T> C4034m<T> m10140a(final C2142f fVar, final C4056e<T> eVar) {
        C4041t.m10170a(fVar, "scope == null");
        return new C4034m<T>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo6163a(final C1680ad adVar) {
                if (eVar != null) {
                    adVar = adVar.mo6149a((C1686aj<? super T, ? extends R>) eVar);
                }
                return new C4005af<T>() {
                    /* renamed from: a */
                    public final C1690c mo9409a(C1710e<? super T> eVar) {
                        return new C4040s(adVar, fVar).mo6162d(eVar);
                    }

                    /* renamed from: a */
                    public final C1690c mo9410a(C1710e<? super T> eVar, C1710e<? super Throwable> eVar2) {
                        return new C4040s(adVar, fVar).mo6152a(eVar, eVar2);
                    }
                };
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo6457a(final C2149h hVar) {
                if (eVar != null) {
                    hVar = C2149h.m6453a(((C2190m) C1745b.m6050a(eVar, "composer is null")).mo6480a(hVar));
                }
                return new C4000aa<T>() {
                    /* renamed from: a */
                    public final C1690c mo9402a(C1710e<? super T> eVar) {
                        return new C4036o(hVar, fVar).mo6450b(eVar);
                    }
                };
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo6497a(final C2193n nVar) {
                if (eVar != null) {
                    nVar = nVar.mo6489a((C2199t<? super T, ? extends R>) eVar);
                }
                return new C4001ab<T>() {
                    /* renamed from: a */
                    public final C1690c mo9403a(C1710e<? super T> eVar, C1710e<? super Throwable> eVar2) {
                        return new C4037p(nVar, fVar).mo6481a(eVar, eVar2, C1723a.f5844c);
                    }
                };
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo6553a(final C2201v vVar) {
                if (eVar != null) {
                    vVar = vVar.mo6513a((C1673aa<? super T, ? extends R>) eVar);
                }
                return new C4002ac<T>() {
                    /* renamed from: a */
                    public final C1690c mo9404a() {
                        return new C4038q(vVar, fVar).mo6551j();
                    }

                    /* renamed from: a */
                    public final C1690c mo9405a(C1710e<? super T> eVar) {
                        return new C4038q(vVar, fVar).mo6545f(eVar);
                    }

                    /* renamed from: a */
                    public final void mo9407a(C1674ab<? super T> abVar) {
                        new C4038q(vVar, fVar).mo6314a(abVar);
                    }

                    /* renamed from: a */
                    public final C1690c mo9406a(C1710e<? super T> eVar, C1710e<? super Throwable> eVar2) {
                        return new C4038q(vVar, fVar).mo6505a(eVar, eVar2);
                    }
                };
            }
        };
    }

    /* renamed from: a */
    public static <T> C4034m<T> m10142a(C4004ae aeVar, C4056e<T> eVar) {
        C4041t.m10170a(aeVar, "provider == null");
        return m10140a((C2142f) C1687b.m5989a((Callable<? extends C2142f>) new C4032k<Object>(aeVar)), eVar);
    }
}
