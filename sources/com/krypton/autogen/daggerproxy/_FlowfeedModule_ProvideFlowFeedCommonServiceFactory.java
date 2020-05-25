package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.flowfeed.p1758g.C31779b;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _FlowfeedModule_ProvideFlowFeedCommonServiceFactory implements C52867d<C31779b> {

    /* renamed from: a */
    private final _FlowfeedModule f50193a;

    public final C31779b get() {
        return provideInstance(this.f50193a);
    }

    public _FlowfeedModule_ProvideFlowFeedCommonServiceFactory(_FlowfeedModule _flowfeedmodule) {
        this.f50193a = _flowfeedmodule;
    }

    public static _FlowfeedModule_ProvideFlowFeedCommonServiceFactory create(_FlowfeedModule _flowfeedmodule) {
        return new _FlowfeedModule_ProvideFlowFeedCommonServiceFactory(_flowfeedmodule);
    }

    public static C31779b provideInstance(_FlowfeedModule _flowfeedmodule) {
        return proxyProvideFlowFeedCommonService(_flowfeedmodule);
    }

    public static C31779b proxyProvideFlowFeedCommonService(_FlowfeedModule _flowfeedmodule) {
        return (C31779b) C52869f.m112471a(_flowfeedmodule.provideFlowFeedCommonService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
