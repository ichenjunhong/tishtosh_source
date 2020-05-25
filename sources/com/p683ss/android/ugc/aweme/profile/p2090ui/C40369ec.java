package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.graphics.Bitmap;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ec */
final /* synthetic */ class C40369ec implements Callable {

    /* renamed from: a */
    private final UpdateAvatarDialog f103035a;

    /* renamed from: b */
    private final Bitmap f103036b;

    C40369ec(UpdateAvatarDialog updateAvatarDialog, Bitmap bitmap) {
        this.f103035a = updateAvatarDialog;
        this.f103036b = bitmap;
    }

    public final Object call() {
        return this.f103035a.mo82383a(this.f103036b);
    }
}
