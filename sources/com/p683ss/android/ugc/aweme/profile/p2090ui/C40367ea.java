package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.graphics.Bitmap;
import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23522b;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ea */
final /* synthetic */ class C40367ea implements C23522b {

    /* renamed from: a */
    private final UpdateAvatarDialog f103033a;

    C40367ea(UpdateAvatarDialog updateAvatarDialog) {
        this.f103033a = updateAvatarDialog;
    }

    /* renamed from: a */
    public final void mo48682a(Object obj) {
        UpdateAvatarDialog updateAvatarDialog = this.f103033a;
        C0013i.m16a((Callable<TResult>) new C40369ec<TResult>(updateAvatarDialog, (Bitmap) obj)).mo20a((C0011g<TResult, TContinuationResult>) new C40370ed<TResult,TContinuationResult>(updateAvatarDialog), C0013i.f25b);
    }
}
