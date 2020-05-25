package com.p683ss.android.ugc.aweme.photo;

import java.util.concurrent.Callable;
import p2628d.C52860x;

/* renamed from: com.ss.android.ugc.aweme.photo.q */
final /* synthetic */ class C38705q implements Callable {

    /* renamed from: a */
    private final PhotoModule f98452a;

    /* renamed from: b */
    private final String f98453b;

    C38705q(PhotoModule photoModule, String str) {
        this.f98452a = photoModule;
        this.f98453b = str;
    }

    public final Object call() {
        PhotoModule photoModule = this.f98452a;
        String str = this.f98453b;
        photoModule.f98318f.dismiss();
        photoModule.f98316d.mo49449a(str);
        photoModule.f98319g = false;
        return C52860x.f131107a;
    }
}
