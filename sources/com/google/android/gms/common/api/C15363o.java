package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

/* renamed from: com.google.android.gms.common.api.o */
public final class C15363o extends UnsupportedOperationException {

    /* renamed from: a */
    private final Feature f39647a;

    public C15363o(Feature feature) {
        this.f39647a = feature;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f39647a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
