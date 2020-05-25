package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Awemenotice_apiModule_ProvideSchemaPageHelperFactory implements C52867d<SchemaPageHelper> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50186a;

    public final SchemaPageHelper get() {
        return provideInstance(this.f50186a);
    }

    public _Awemenotice_apiModule_ProvideSchemaPageHelperFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50186a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideSchemaPageHelperFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideSchemaPageHelperFactory(_awemenotice_apimodule);
    }

    public static SchemaPageHelper provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideSchemaPageHelper(_awemenotice_apimodule);
    }

    public static SchemaPageHelper proxyProvideSchemaPageHelper(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (SchemaPageHelper) C52869f.m112471a(_awemenotice_apimodule.provideSchemaPageHelper(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
