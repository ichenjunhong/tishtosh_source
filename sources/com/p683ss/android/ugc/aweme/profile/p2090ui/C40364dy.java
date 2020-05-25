package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.graphics.BitmapFactory;
import com.p683ss.android.ugc.aweme.profile.util.C40567r;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.dy */
final /* synthetic */ class C40364dy implements Callable {

    /* renamed from: a */
    private final UpdateAvatarDialog f103030a;

    C40364dy(UpdateAvatarDialog updateAvatarDialog) {
        this.f103030a = updateAvatarDialog;
    }

    public final Object call() {
        return this.f103030a.mo82383a(BitmapFactory.decodeFile(C40567r.m89999a().getAbsolutePath()));
    }
}
