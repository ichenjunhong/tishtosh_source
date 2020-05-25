package com.snapchat.kit.sdk.core.metrics.business;

import android.os.Build.VERSION;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import com.snapchat.kit.sdk.core.metrics.C18256a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent.Builder;

@SnapConnectScope
/* renamed from: com.snapchat.kit.sdk.core.metrics.business.c */
public final class C18274c implements MetricQueue<ServerEvent> {

    /* renamed from: a */
    private final C18279h f50465a;

    /* renamed from: b */
    private final C18256a<ServerEvent> f50466b;

    public final /* synthetic */ void push(Object obj) {
        String str;
        Builder newBuilder = ((ServerEvent) obj).newBuilder();
        C18279h hVar = this.f50465a;
        long j = hVar.f50473b + 1;
        hVar.f50473b = j;
        hVar.f50472a.edit().putLong("sequence_id_max", hVar.f50473b).apply();
        Builder os_type = newBuilder.sequence_id(Long.valueOf(j)).os_type("Android");
        if (VERSION.RELEASE == null) {
            str = "";
        } else {
            str = VERSION.RELEASE;
        }
        this.f50466b.push(os_type.os_version(str).build());
    }

    C18274c(C18279h hVar, C18256a<ServerEvent> aVar) {
        this.f50465a = hVar;
        this.f50466b = aVar;
    }
}
