package com.bytedance.sdk.account.bdplatform.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.sdk.account.bdplatform.p854a.C13041d;
import com.bytedance.sdk.account.p849b.p850a.C13024a;
import com.bytedance.sdk.account.p849b.p850a.C13025b;
import com.bytedance.sdk.account.p849b.p851b.C13026a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.account.bdplatform.impl.b */
final class C13064b implements C13041d {

    /* renamed from: a */
    private Context f34124a;

    /* renamed from: b */
    private List<C13025b> f34125b;

    public C13064b(Context context) {
        this(context, null);
    }

    private C13064b(Context context, List<C13025b> list) {
        this.f34125b = new ArrayList();
        this.f34124a = context;
        this.f34125b.add(new C13026a());
    }

    /* renamed from: a */
    public final boolean mo24709a(Intent intent, C13024a aVar) {
        if (aVar == null) {
            return false;
        }
        if (intent == null) {
            aVar.onErrorIntent(intent);
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            aVar.onErrorIntent(intent);
            return false;
        }
        int i = extras.getInt("_bytedance_params_type");
        for (C13025b a : this.f34125b) {
            if (a.mo24667a(i, extras, aVar)) {
                return true;
            }
        }
        aVar.onErrorIntent(intent);
        return false;
    }
}
