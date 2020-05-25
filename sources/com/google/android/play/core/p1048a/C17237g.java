package com.google.android.play.core.p1048a;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import com.google.android.play.core.common.C17314a;

/* renamed from: com.google.android.play.core.a.g */
final class C17237g implements C17314a {

    /* renamed from: a */
    private final /* synthetic */ Activity f48693a;

    C17237g(Activity activity) {
        this.f48693a = activity;
    }

    /* renamed from: a */
    public final void mo33508a(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        this.f48693a.startIntentSenderForResult(intentSender, i, null, 0, 0, 0, null);
    }
}
