package com.facebook.imagepipeline.p974n;

import com.facebook.imagepipeline.p974n.C14207t;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.n.c */
public abstract class C14176c<FETCH_STATE extends C14207t> implements C14123ai<FETCH_STATE> {
    public Map<String, String> getExtraMap(FETCH_STATE fetch_state, int i) {
        return null;
    }

    public void onFetchCompletion(FETCH_STATE fetch_state, int i) {
    }

    public boolean shouldPropagate(FETCH_STATE fetch_state) {
        return true;
    }
}
