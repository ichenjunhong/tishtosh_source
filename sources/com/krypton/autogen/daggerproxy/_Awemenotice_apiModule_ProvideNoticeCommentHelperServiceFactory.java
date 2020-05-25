package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Awemenotice_apiModule_ProvideNoticeCommentHelperServiceFactory implements C52867d<NoticeCommentHelperService> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50177a;

    public final NoticeCommentHelperService get() {
        return provideInstance(this.f50177a);
    }

    public _Awemenotice_apiModule_ProvideNoticeCommentHelperServiceFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50177a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideNoticeCommentHelperServiceFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideNoticeCommentHelperServiceFactory(_awemenotice_apimodule);
    }

    public static NoticeCommentHelperService provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideNoticeCommentHelperService(_awemenotice_apimodule);
    }

    public static NoticeCommentHelperService proxyProvideNoticeCommentHelperService(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (NoticeCommentHelperService) C52869f.m112471a(_awemenotice_apimodule.provideNoticeCommentHelperService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
