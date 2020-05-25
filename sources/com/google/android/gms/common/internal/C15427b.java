package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C15227b;
import com.google.android.gms.common.api.C15240i;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.internal.b */
public final class C15427b {
    /* renamed from: a */
    public static C15227b m32018a(Status status) {
        if (status.mo28059b()) {
            return new C15240i(status);
        }
        return new C15227b(status);
    }
}
