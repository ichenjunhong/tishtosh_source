package com.p683ss.android.ugc.aweme.tools.mvtemplate;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.effectplatform.C29260n.C29261a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.setting.EnableMvResCheck;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48699d;
import com.p683ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.q */
public final class C47298q {

    /* renamed from: a */
    public C29252f f119395a;

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.q$a */
    public static final class C47299a implements C48699d {

        /* renamed from: a */
        final /* synthetic */ C47298q f119396a;

        /* renamed from: b */
        final /* synthetic */ C48699d f119397b;

        /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.q$a$a */
        static final class C47300a<V> implements Callable<TResult> {

            /* renamed from: a */
            final /* synthetic */ Effect f119398a;

            C47300a(Effect effect) {
                this.f119398a = effect;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() {
                try {
                    C48016e.m103942b(new File(this.f119398a.getUnzipPath()));
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder("MVRes: Invalid Res Delete Failed :");
                    sb.append(this.f119398a.getUnzipPath());
                    C45407ay.m98968a(sb.toString());
                }
                return null;
            }
        }

        /* renamed from: a */
        public final void mo8643a(Effect effect) {
            C52711k.m112240b(effect, "effect");
            C48699d dVar = this.f119397b;
            if (dVar != null) {
                dVar.mo8643a(effect);
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            Effect effect = (Effect) obj;
            C52711k.m112240b(effect, "effect");
            if (!C47298q.m102652a(effect, true)) {
                C0013i.m16a((Callable<TResult>) new C47300a<TResult>(effect));
                C48699d dVar = this.f119397b;
                if (dVar != null) {
                    dVar.mo8644a(effect, new C48649d(-10002));
                }
            } else {
                C48699d dVar2 = this.f119397b;
                if (dVar2 != null) {
                    dVar2.mo8638a(effect);
                }
            }
        }

        C47299a(C47298q qVar, C48699d dVar) {
            this.f119396a = qVar;
            this.f119397b = dVar;
        }

        /* renamed from: a */
        public final void mo8644a(Effect effect, C48649d dVar) {
            C52711k.m112240b(dVar, "e");
            C48699d dVar2 = this.f119397b;
            if (dVar2 != null) {
                dVar2.mo8644a(effect, dVar);
            }
        }

        /* renamed from: a */
        public final void mo59191a(Effect effect, int i, long j) {
            C52711k.m112240b(effect, "effect");
            C48699d dVar = this.f119397b;
            if (dVar != null) {
                dVar.mo59191a(effect, i, j);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo94580a(Effect effect) {
        if (this.f119395a == null || effect == null) {
            return false;
        }
        C29252f fVar = this.f119395a;
        if (fVar == null) {
            C52711k.m112234a();
        }
        return fVar.mo59145b(effect);
    }

    /* renamed from: a */
    public static boolean m102652a(Effect effect, boolean z) {
        if (effect == null || effect.getUnzipPath() == null) {
            return false;
        }
        String unzipPath = effect.getUnzipPath();
        if (!C48016e.m103944b(unzipPath)) {
            return false;
        }
        if (!C10193n.m20607a().mo18204a(EnableMvResCheck.class, "enable_mv_res_check", C10181b.m20511a().mo18175c().getEnableMvResCheck(), false)) {
            return z;
        }
        if (VEUtils.checkMVResourceIntegrity(unzipPath) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo94579a(Effect effect, C48699d dVar) {
        if (this.f119395a == null || effect == null) {
            dVar.mo8644a(effect, new C48649d(-10001));
        } else if (m102652a(effect, false)) {
            dVar.mo8638a(effect);
        } else {
            C29252f fVar = this.f119395a;
            if (fVar == null) {
                C52711k.m112234a();
            }
            fVar.mo59123a(effect, C29261a.m68963a("mv", new C47299a(this, dVar)));
        }
    }
}
