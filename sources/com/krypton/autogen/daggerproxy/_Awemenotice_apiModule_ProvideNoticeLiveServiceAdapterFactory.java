package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Awemenotice_apiModule_ProvideNoticeLiveServiceAdapterFactory implements C52867d<NoticeLiveServiceAdapter> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50181a;

    public final NoticeLiveServiceAdapter get() {
        return provideInstance(this.f50181a);
    }

    public _Awemenotice_apiModule_ProvideNoticeLiveServiceAdapterFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50181a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideNoticeLiveServiceAdapterFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideNoticeLiveServiceAdapterFactory(_awemenotice_apimodule);
    }

    public static NoticeLiveServiceAdapter provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideNoticeLiveServiceAdapter(_awemenotice_apimodule);
    }

    public static NoticeLiveServiceAdapter proxyProvideNoticeLiveServiceAdapter(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (NoticeLiveServiceAdapter) C52869f.m112471a(_awemenotice_apimodule.provideNoticeLiveServiceAdapter(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
