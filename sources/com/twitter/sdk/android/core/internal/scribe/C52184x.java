package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.twitter.sdk.android.core.internal.C52115h;
import java.io.IOException;
import java.util.UUID;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.x */
final class C52184x extends C52161g<C52181v> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo108885b() {
        UUID randomUUID = UUID.randomUUID();
        StringBuilder sb = new StringBuilder("se");
        sb.append("_");
        sb.append(randomUUID.toString());
        sb.append("_");
        sb.append(this.f129839c.mo108816a());
        sb.append(".tap");
        return sb.toString();
    }

    C52184x(Context context, C52160f<C52181v> fVar, C52115h hVar, C52178s sVar, int i) throws IOException {
        super(context, fVar, hVar, sVar, i);
    }
}
