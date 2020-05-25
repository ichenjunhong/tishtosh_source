package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.api.internal.g */
public interface C15335g {
    /* renamed from: a */
    Activity mo28246a();

    /* renamed from: a */
    <T extends LifecycleCallback> T mo28247a(String str, Class<T> cls);

    /* renamed from: a */
    void mo28248a(String str, LifecycleCallback lifecycleCallback);

    void startActivityForResult(Intent intent, int i);
}
