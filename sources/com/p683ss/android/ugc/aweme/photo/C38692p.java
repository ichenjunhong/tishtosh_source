package com.p683ss.android.ugc.aweme.photo;

import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.photo.p */
public final /* synthetic */ class C38692p implements C52671b {

    /* renamed from: a */
    private final PhotoModule f98412a;

    /* renamed from: b */
    private final String f98413b;

    public C38692p(PhotoModule photoModule, String str) {
        this.f98412a = photoModule;
        this.f98413b = str;
    }

    public final Object invoke(Object obj) {
        Integer num = (Integer) obj;
        C0013i.m18a((Callable<TResult>) new C38705q<TResult>(this.f98412a, this.f98413b), C0013i.f25b);
        return C52860x.f131107a;
    }
}
