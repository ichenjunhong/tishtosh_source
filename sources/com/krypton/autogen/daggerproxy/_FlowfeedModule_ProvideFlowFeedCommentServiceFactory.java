package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.flowfeed.p1758g.C31778a;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _FlowfeedModule_ProvideFlowFeedCommentServiceFactory implements C52867d<C31778a> {

    /* renamed from: a */
    private final _FlowfeedModule f50192a;

    public final C31778a get() {
        return provideInstance(this.f50192a);
    }

    public _FlowfeedModule_ProvideFlowFeedCommentServiceFactory(_FlowfeedModule _flowfeedmodule) {
        this.f50192a = _flowfeedmodule;
    }

    public static _FlowfeedModule_ProvideFlowFeedCommentServiceFactory create(_FlowfeedModule _flowfeedmodule) {
        return new _FlowfeedModule_ProvideFlowFeedCommentServiceFactory(_flowfeedmodule);
    }

    public static C31778a provideInstance(_FlowfeedModule _flowfeedmodule) {
        return proxyProvideFlowFeedCommentService(_flowfeedmodule);
    }

    public static C31778a proxyProvideFlowFeedCommentService(_FlowfeedModule _flowfeedmodule) {
        return (C31778a) C52869f.m112471a(_flowfeedmodule.provideFlowFeedCommentService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
