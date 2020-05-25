package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;

public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    /* renamed from: a */
    public Object mo28484a(String str) {
        return null;
    }

    /* renamed from: b */
    public boolean mo28485b(String str) {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i = 0;
        for (Field field : mo27875a().values()) {
            if (mo27876a(field)) {
                i = (i * 31) + mo27877b(field).hashCode();
            }
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (Field field : mo27875a().values()) {
            if (mo27876a(field)) {
                if (!fastJsonResponse.mo27876a(field) || !mo27877b(field).equals(fastJsonResponse.mo27877b(field))) {
                    return false;
                }
            } else if (fastJsonResponse.mo27876a(field)) {
                return false;
            }
        }
        return true;
    }
}
