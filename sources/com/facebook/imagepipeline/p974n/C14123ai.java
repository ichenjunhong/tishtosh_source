package com.facebook.imagepipeline.p974n;

import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p974n.C14207t;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.n.ai */
public interface C14123ai<FETCH_STATE extends C14207t> {

    /* renamed from: com.facebook.imagepipeline.n.ai$a */
    public interface C14124a {
        /* renamed from: a */
        void mo26371a();

        /* renamed from: a */
        void mo26372a(InputStream inputStream, int i) throws IOException;

        /* renamed from: a */
        void mo26373a(Throwable th);
    }

    FETCH_STATE createFetchState(C14188k<C14044e> kVar, C14140an anVar);

    void fetch(FETCH_STATE fetch_state, C14124a aVar);

    Map<String, String> getExtraMap(FETCH_STATE fetch_state, int i);

    void onFetchCompletion(FETCH_STATE fetch_state, int i);

    boolean shouldPropagate(FETCH_STATE fetch_state);
}
