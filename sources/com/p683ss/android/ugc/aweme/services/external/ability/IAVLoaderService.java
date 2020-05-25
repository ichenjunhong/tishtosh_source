package com.p683ss.android.ugc.aweme.services.external.ability;

/* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVLoaderService */
public interface IAVLoaderService {

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVLoaderService$ILoaderCallback */
    public interface ILoaderCallback<T> {
        void finish(T t);
    }

    void setLoader(ILoaderCallback<Boolean> iLoaderCallback);

    void setLoaderOnly();
}
