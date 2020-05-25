package com.p683ss.android.ugc.aweme.effectplatform;

import com.p683ss.android.ugc.aweme.out.AVServiceImpl;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener;
import com.p683ss.android.ugc.aweme.services.IInternalAVService;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.p */
public final class C29264p implements C29253g {

    /* renamed from: a */
    private List<String> f76627a = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.p$a */
    public static final class C29265a implements IFetchResourcesListener {

        /* renamed from: a */
        final /* synthetic */ IFetchResourcesListener f76628a;

        C29265a(IFetchResourcesListener iFetchResourcesListener) {
            this.f76628a = iFetchResourcesListener;
        }

        public final void onFailed(Exception exc) {
            C52711k.m112240b(exc, "e");
            IFetchResourcesListener iFetchResourcesListener = this.f76628a;
            if (iFetchResourcesListener != null) {
                iFetchResourcesListener.onFailed(exc);
            }
        }

        public final void onSuccess(String[] strArr) {
            C52711k.m112240b(strArr, "requirements");
            IFetchResourcesListener iFetchResourcesListener = this.f76628a;
            if (iFetchResourcesListener != null) {
                iFetchResourcesListener.onSuccess(strArr);
            }
        }
    }

    /* renamed from: a */
    public final C29253g mo59193a() {
        C29264p pVar = this;
        if (C39618d.f101152P.mo83104b(C40790a.ShowAutoImproveButtonInEditPage) == 1) {
            pVar.f76627a.add("hdrnet");
            pVar.f76627a.add("HdrColorCard");
        }
        return this;
    }

    /* renamed from: a */
    public final void mo59188a(IFetchResourcesListener iFetchResourcesListener) {
        if (!this.f76627a.isEmpty()) {
            IInternalAVService createIInternalAVServicebyMonsterPlugin = AVServiceImpl.createIInternalAVServicebyMonsterPlugin();
            Object[] array = this.f76627a.toArray(new String[0]);
            if (array != null) {
                createIInternalAVServicebyMonsterPlugin.fetchResourcesNeededByRequirements((String[]) array, new C29265a(iFetchResourcesListener));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
