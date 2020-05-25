package com.p683ss.android.ugc.aweme.p1435bh;

import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import com.p683ss.android.ugc.aweme.shortvideo.C43856fy;
import com.p683ss.android.ugc.aweme.shortvideo.C44334o;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44366c;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44366c.C44368b;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44366c.C44369c;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44377g;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44392m;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44392m.C44393a;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44398o;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44398o.C44399a;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bh.d */
public final class C23802d extends C44377g {

    /* renamed from: a */
    public final C44334o<C42421al> f63417a;

    /* renamed from: b */
    private final C23825h f63418b = new C23825h("PublishScheduler-PublishCallbackWrapper");

    public C23802d(C44334o<C42421al> oVar) {
        C52711k.m112240b(oVar, "callBack");
        this.f63417a = oVar;
    }

    /* renamed from: a */
    public final void mo49383a(int i, Object obj) {
        if (!(obj instanceof Boolean)) {
            this.f63418b.mo49410a("onProgress extra not boolean");
        } else {
            this.f63417a.onProgressUpdate(i, ((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: a */
    public final void mo49384a(C44366c cVar, Object obj) {
        C52711k.m112240b(cVar, "result");
        if (!(cVar instanceof C44369c)) {
            if (cVar instanceof C44368b) {
                C44368b bVar = (C44368b) cVar;
                if (bVar.f112279a.f112310d == null || !(bVar.f112279a.f112311e instanceof Boolean)) {
                    this.f63418b.mo49410a("onFinish  null error / extra not boolean");
                } else {
                    C44334o<C42421al> oVar = this.f63417a;
                    C43856fy fyVar = new C43856fy(bVar.f112279a.f112310d, bVar.f112279a.f112309c);
                    Object obj2 = bVar.f112279a.f112311e;
                    if (obj2 != null) {
                        fyVar.setRecover(((Boolean) obj2).booleanValue());
                        oVar.onError(fyVar);
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type kotlin.Boolean");
                }
            }
        } else if (!(obj instanceof Boolean)) {
            this.f63418b.mo49410a("onFinish extra not boolean");
        } else {
            this.f63417a.onSuccess(((C44369c) cVar).f112280a, ((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: a */
    public final void mo49385a(String str, C44398o oVar, Object obj) {
        C52711k.m112240b(str, "stage");
        C52711k.m112240b(oVar, "state");
        if (C52711k.m112239a((Object) str, (Object) "STAGE_SYNTHETIC") && (oVar instanceof C44399a)) {
            C44399a aVar = (C44399a) oVar;
            if (aVar.f112337a instanceof C44393a) {
                C44392m mVar = aVar.f112337a;
                if (mVar == null) {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.publish.Result.Success");
                } else if (((C44393a) mVar).f112328a instanceof String) {
                    C44334o<C42421al> oVar2 = this.f63417a;
                    C44392m mVar2 = aVar.f112337a;
                    if (mVar2 != null) {
                        Object obj2 = ((C44393a) mVar2).f112328a;
                        if (obj2 != null) {
                            oVar2.onSynthetiseSuccess((String) obj2);
                            return;
                        }
                        throw new C52857u("null cannot be cast to non-null type kotlin.String");
                    }
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.publish.Result.Success");
                }
            }
        }
    }
}
