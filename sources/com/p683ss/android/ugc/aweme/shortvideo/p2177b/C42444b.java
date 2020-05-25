package com.p683ss.android.ugc.aweme.shortvideo.p2177b;

import android.app.Dialog;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p683ss.android.ugc.aweme.app.p1372c.C23059a;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.shortvideo.C42434ax;
import com.p683ss.android.ugc.aweme.shortvideo.C42448bd;
import com.p683ss.android.ugc.aweme.shortvideo.C42449be;
import com.p683ss.android.ugc.aweme.shortvideo.C42460bf;
import com.p683ss.android.ugc.aweme.shortvideo.C42461bg;
import com.p683ss.android.ugc.aweme.shortvideo.C42462bh;
import com.p683ss.android.ugc.aweme.shortvideo.C42562ct;
import com.p683ss.android.ugc.aweme.shortvideo.C43223dp;
import com.p683ss.android.ugc.aweme.shortvideo.C43229du;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.C43797eu;
import com.p683ss.android.ugc.aweme.shortvideo.C43801ex;
import com.p683ss.android.ugc.aweme.shortvideo.C43806fa;
import com.p683ss.android.ugc.aweme.shortvideo.C43863gb;
import com.p683ss.android.ugc.aweme.shortvideo.C44405r;
import com.p683ss.android.ugc.aweme.shortvideo.C44457s;
import com.p683ss.android.ugc.aweme.shortvideo.C45330z;
import com.p683ss.android.ugc.aweme.shortvideo.GoNextFactoryFactory;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45393am.C45394a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45412b;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.tools.C47026e;
import com.p683ss.android.ugc.aweme.tools.C47059f;
import com.p683ss.android.ugc.aweme.tools.C47066k;
import com.p683ss.android.ugc.aweme.tools.C47323n;
import com.p683ss.android.ugc.aweme.tools.C47336q;
import com.p683ss.android.ugc.aweme.tools.C47338s;
import com.p683ss.android.ugc.aweme.tools.C47346u;
import com.p683ss.android.ugc.aweme.tools.C47348w;
import com.p683ss.android.ugc.aweme.tools.C47349x;
import com.p683ss.android.ugc.aweme.tools.C47351z;
import com.p683ss.android.ugc.aweme.utils.C47716bd;
import com.p683ss.android.ugc.aweme.utils.C47858ep;
import com.ss.android.ugc.trill.R;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.C2206z;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.b.b */
public final class C42444b implements C42443a {

    /* renamed from: a */
    private boolean f107336a = true;

    /* renamed from: b */
    private final C42434ax f107337b;

    /* renamed from: c */
    private final C43806fa f107338c;

    /* renamed from: d */
    private final C44405r f107339d;

    /* renamed from: e */
    private final C43229du f107340e;

    /* renamed from: f */
    private final C43797eu f107341f;

    /* renamed from: g */
    private final C43863gb f107342g;

    /* renamed from: h */
    private final C43801ex f107343h;

    /* renamed from: i */
    private final C44457s f107344i;

    /* renamed from: j */
    private final GoNextFactoryFactory f107345j;

    /* renamed from: k */
    private final C42562ct f107346k;

    /* renamed from: a */
    public final void mo86529a() {
        this.f107336a = false;
    }

    /* renamed from: a */
    public final void mo86530a(C47026e eVar) {
        if (this.f107336a) {
            this.f107339d.onEvent(eVar);
        }
    }

    /* renamed from: a */
    public final void mo86531a(C47059f fVar) {
        if (this.f107336a) {
            this.f107344i.mo90338a(fVar);
        }
    }

    /* renamed from: a */
    public final void mo86534a(C47336q qVar) {
        if (this.f107336a) {
            this.f107342g.onEvent(qVar);
        }
    }

    /* renamed from: a */
    public final void mo86535a(C47338s sVar) {
        if (this.f107336a) {
            this.f107337b.onEvent(sVar);
        }
    }

    /* renamed from: a */
    public final void mo86532a(C47066k kVar) {
        C2201v vVar;
        if (this.f107336a) {
            GoNextFactoryFactory goNextFactoryFactory = this.f107345j;
            if (!goNextFactoryFactory.f106997c.mo87886M()) {
                ShortVideoContext shortVideoContext = goNextFactoryFactory.f106998d.f107134a;
                shortVideoContext.f107093as = System.currentTimeMillis();
                C47351z zVar = new C47351z();
                ((VideoRecordNewActivity) goNextFactoryFactory.f106997c.mo24477v()).f113766E.mo91354b(zVar);
                ((VideoRecordNewActivity) goNextFactoryFactory.f106997c.mo24477v()).f113766E.mo91335a(zVar);
                goNextFactoryFactory.f107001g++;
                C2201v a = C2201v.m6601a((C2205y<T>) new C42462bh<T>(shortVideoContext));
                String str = kVar.f118852d;
                if ((C47716bd.m103285a() || C47716bd.m103286b()) && !shortVideoContext.mo86362d()) {
                    vVar = C2201v.m6601a((C2205y<T>) new C42461bg<T>(goNextFactoryFactory, shortVideoContext, str)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a());
                } else {
                    vVar = C2201v.m6601a(C42460bf.f107372a);
                }
                C2201v.m6603a((C2206z<? extends T1>) a, (C2206z<? extends T2>) vVar, C42448bd.f107348a).mo6505a((C1710e<? super T>) new C42449be<Object>(goNextFactoryFactory, kVar), (C1710e<? super Throwable>) C45394a.f114780a);
            }
        }
    }

    /* renamed from: a */
    public final void mo86533a(C47323n nVar) {
        boolean z;
        if (this.f107336a) {
            GoNextFactoryFactory goNextFactoryFactory = this.f107345j;
            Boolean bool = (Boolean) goNextFactoryFactory.f106998d.mo86382a("has_go_next");
            boolean z2 = false;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            if (!z) {
                ShortVideoContext shortVideoContext = goNextFactoryFactory.f106998d.f107134a;
                if (!shortVideoContext.f107122o) {
                    long a = C43307ea.m94995a();
                    if (shortVideoContext.mo86366g()) {
                        a = shortVideoContext.f107110c;
                    }
                    if (shortVideoContext.mo86362d()) {
                        a = 3000;
                    }
                    if (shortVideoContext.mo86372m() < a) {
                        z2 = true;
                    }
                }
                if (z2) {
                    if (!goNextFactoryFactory.f106998d.f107134a.mo86365f() && !goNextFactoryFactory.f106998d.f107134a.mo86366g()) {
                        C10691a.m21548c(goNextFactoryFactory.f106997c.mo87887i(), (int) R.string.fc6).mo19066a();
                    }
                    C47858ep.m103512a("record_error", "3", "is short");
                    return;
                }
                goNextFactoryFactory.f106998d.mo86395e(true);
                C45412b.m98979a().start("av_video_edit", "showProgressDialog");
                C45330z zVar = goNextFactoryFactory.f106995a;
                Context i = goNextFactoryFactory.f106997c.mo87887i();
                C52711k.m112240b(i, "context");
                if (!C43223dp.m94850a()) {
                    C45547d b = C45547d.m99208b(i, i.getString(R.string.dj9));
                    b.setIndeterminate(true);
                    zVar.f114614a = b;
                    if (!C23059a.m56592a(i)) {
                        C23729p.m58256a((Dialog) zVar.f114614a);
                    }
                }
                VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) goNextFactoryFactory.f106997c.f33840g_;
                goNextFactoryFactory.f106999e = System.currentTimeMillis();
                videoRecordNewActivity.f113766E.mo91387a(new C47348w());
                goNextFactoryFactory.f107000f++;
            }
        }
    }

    /* renamed from: a */
    public final void mo86536a(C47346u uVar) {
        if (this.f107336a) {
            this.f107340e.onEvent(uVar);
        }
    }

    /* renamed from: a */
    public final void mo86537a(C47349x xVar) {
        if (this.f107336a) {
            this.f107341f.onEvent(xVar);
        }
    }

    /* renamed from: a */
    public final void mo86538a(C47351z zVar) {
        if (this.f107336a) {
            this.f107338c.onEvent(zVar);
            this.f107343h.onEvent(zVar);
        }
    }

    public C42444b(FragmentActivity fragmentActivity, C42562ct ctVar, ASCameraView aSCameraView) {
        this.f107337b = new C42434ax(fragmentActivity, ctVar);
        this.f107338c = new C43806fa(ctVar);
        this.f107339d = new C44405r(ctVar);
        this.f107340e = new C43229du(ctVar);
        this.f107341f = new C43797eu(ctVar);
        this.f107342g = new C43863gb(ctVar);
        this.f107343h = new C43801ex(ctVar);
        this.f107344i = new C44457s(ctVar);
        this.f107345j = new GoNextFactoryFactory(ctVar, aSCameraView);
        this.f107346k = ctVar;
    }
}
