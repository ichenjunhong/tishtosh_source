package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.flowfeed.p1758g.C31780c;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _FlowfeedModule_ProvideFlowFeedItemInteractServiceFactory implements C52867d<C31780c> {

    /* renamed from: a */
    private final _FlowfeedModule f50194a;

    public final C31780c get() {
        return provideInstance(this.f50194a);
    }

    public _FlowfeedModule_ProvideFlowFeedItemInteractServiceFactory(_FlowfeedModule _flowfeedmodule) {
        this.f50194a = _flowfeedmodule;
    }

    public static _FlowfeedModule_ProvideFlowFeedItemInteractServiceFactory create(_FlowfeedModule _flowfeedmodule) {
        return new _FlowfeedModule_ProvideFlowFeedItemInteractServiceFactory(_flowfeedmodule);
    }

    public static C31780c provideInstance(_FlowfeedModule _flowfeedmodule) {
        return proxyProvideFlowFeedItemInteractService(_flowfeedmodule);
    }

    public static C31780c proxyProvideFlowFeedItemInteractService(_FlowfeedModule _flowfeedmodule) {
        return (C31780c) C52869f.m112471a(_flowfeedmodule.provideFlowFeedItemInteractService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
