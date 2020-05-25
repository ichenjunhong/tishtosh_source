package com.bytedance.ies.common.push.account;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import com.bytedance.ies.common.push.p660a.C10620a;

/* renamed from: com.bytedance.ies.common.push.account.c */
public final class C10626c extends AbstractThreadedSyncAdapter {
    public C10626c(Context context, boolean z) {
        super(context, true);
    }

    public final void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        if (getContext() != null) {
            C10620a aVar = C10620a.f28146a;
            Context context = getContext();
            if (aVar.f28147b != null) {
                aVar.f28147b.mo18841a(context);
            }
        }
    }
}
