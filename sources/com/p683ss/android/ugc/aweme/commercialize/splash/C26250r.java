package com.p683ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import android.view.View;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18615m;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18615m.C18616a;
import com.p683ss.android.p1103ad.splash.core.p1117f.C18629a;
import com.p683ss.android.p1103ad.splash.p1111c.C18559a;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.commerce.p1530b.C25502f;
import com.p888c.p889a.p890a.p891a.C13383a;
import com.p888c.p889a.p890a.p891a.p893b.C13390a;
import com.p888c.p889a.p890a.p891a.p893b.C13394b;
import com.p888c.p889a.p890a.p891a.p893b.C13395c;
import com.p888c.p889a.p890a.p891a.p893b.C13396d;
import com.p888c.p889a.p890a.p891a.p893b.C13398f;
import com.p888c.p889a.p890a.p891a.p893b.C13400h;
import com.p888c.p889a.p890a.p891a.p893b.C13401i;
import com.p888c.p889a.p890a.p891a.p893b.C13402j;
import com.p888c.p889a.p890a.p891a.p893b.C13403k;
import com.p888c.p889a.p890a.p891a.p893b.p894a.C13391a;
import com.p888c.p889a.p890a.p891a.p893b.p894a.C13392b;
import com.p888c.p889a.p890a.p891a.p893b.p894a.C13393c;
import com.p888c.p889a.p890a.p891a.p897e.C13426e;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.r */
public final class C26250r implements C18629a {

    /* renamed from: a */
    private C26251a f69301a;

    /* renamed from: b */
    private Context f69302b;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.splash.r$a */
    static class C26251a {

        /* renamed from: a */
        final boolean f69303a;

        /* renamed from: b */
        C13394b f69304b;

        /* renamed from: c */
        C13391a f69305c;

        /* renamed from: a */
        public final void mo53906a() {
            if (this.f69304b != null) {
                this.f69304b.mo25091b();
                this.f69304b = null;
            }
        }

        C26251a(C18559a aVar) {
            C13398f fVar;
            this.f69303a = aVar.mo37866y();
            if (aVar.mo37859K() != null) {
                try {
                    C13402j a = C13402j.m27009a("Bytedance", "16.0.41");
                    String a2 = C25502f.m62030a(AwemeApplication.m56199a());
                    C18615m K = aVar.mo37859K();
                    ArrayList arrayList = new ArrayList();
                    for (C18616a aVar2 : K.f51398a) {
                        arrayList.add(C13403k.m27010a(aVar2.f51399a, new URL(aVar2.f51400b), aVar2.f51401c));
                    }
                    C13396d a3 = C13396d.m27006a(a, a2, arrayList, null);
                    if (aVar.mo37866y()) {
                        fVar = C13398f.VIDEO;
                    } else {
                        fVar = C13398f.NATIVE_DISPLAY;
                    }
                    C13400h hVar = C13400h.BEGIN_TO_RENDER;
                    C13401i iVar = C13401i.NATIVE;
                    this.f69304b = C13394b.m26999a(C13395c.m27004a(fVar, hVar, iVar, iVar, false), a3);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo38040c() {
        if (this.f69301a != null) {
            this.f69301a.mo53906a();
            this.f69301a = null;
        }
    }

    /* renamed from: a */
    public final void mo38033a() {
        if (this.f69301a != null) {
            C26251a aVar = this.f69301a;
            if (aVar.f69304b != null && aVar.f69305c != null) {
                aVar.f69305c.mo25086d();
            }
        }
    }

    /* renamed from: b */
    public final void mo38038b() {
        if (this.f69301a != null) {
            C26251a aVar = this.f69301a;
            if (aVar.f69304b != null && aVar.f69305c != null) {
                C13391a aVar2 = aVar.f69305c;
                C13426e.m27073b(aVar2.f34901a);
                aVar2.f34901a.mo25100c().mo25129a("skipped");
            }
        }
    }

    public C26250r(Context context) {
        if (context != null) {
            this.f69302b = context.getApplicationContext();
        }
    }

    /* renamed from: a */
    public final void mo38037a(C18559a aVar) {
        Context context = this.f69302b;
        if (!C13383a.m26982a()) {
            C13383a.m26981a(context);
        }
        if (C13383a.m26982a()) {
            if (this.f69301a != null) {
                mo38040c();
            }
            this.f69301a = new C26251a(aVar);
        }
    }

    /* renamed from: b */
    public final void mo38039b(long j, long j2) {
        if (this.f69301a != null) {
            C26251a aVar = this.f69301a;
            if (aVar.f69304b != null && aVar.f69305c != null) {
                aVar.f69305c.mo25084b();
            }
        }
    }

    /* renamed from: c */
    public final void mo38041c(long j, long j2) {
        if (this.f69301a != null) {
            C26251a aVar = this.f69301a;
            if (aVar.f69304b != null && aVar.f69305c != null) {
                aVar.f69305c.mo25085c();
            }
        }
    }

    /* renamed from: a */
    public final void mo38035a(long j, long j2) {
        if (this.f69301a != null) {
            C26251a aVar = this.f69301a;
            if (aVar.f69304b != null && aVar.f69305c != null) {
                aVar.f69305c.mo25082a();
            }
        }
    }

    /* renamed from: a */
    public final void mo38036a(View view, List<View> list) {
        if (this.f69301a != null) {
            C26251a aVar = this.f69301a;
            if (aVar.f69304b != null) {
                aVar.f69304b.mo25090a(view);
                if (list != null) {
                    for (View b : list) {
                        aVar.f69304b.mo25092b(b);
                    }
                }
                if (aVar.f69303a) {
                    aVar.f69305c = C13391a.m26991a(aVar.f69304b);
                }
                aVar.f69304b.mo25089a();
                C13390a a = C13390a.m26988a(aVar.f69304b);
                if (aVar.f69303a) {
                    a.mo25081a(C13393c.m26997a(true, C13392b.STANDALONE));
                }
                a.mo25080a();
            }
        }
    }

    /* renamed from: a */
    public final void mo38034a(long j, float f, float f2) {
        float f3;
        if (this.f69301a != null) {
            if (f2 != 0.0f) {
                f3 = f / f2;
            } else {
                f3 = 0.0f;
            }
            float max = Math.max(Math.min(f3, 1.0f), 0.0f);
            C26251a aVar = this.f69301a;
            if (aVar.f69304b != null && aVar.f69305c != null) {
                aVar.f69305c.mo25083a((float) j, max);
            }
        }
    }
}
