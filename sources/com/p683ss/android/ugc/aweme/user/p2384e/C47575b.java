package com.p683ss.android.ugc.aweme.user.p2384e;

import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.friends.api.UploadContactsApi;
import com.p683ss.android.ugc.aweme.utils.C47673an;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.user.e.b */
final /* synthetic */ class C47575b implements Callable {

    /* renamed from: a */
    static final Callable f120027a = new C47575b();

    private C47575b() {
    }

    public final Object call() {
        List a = C47673an.m103183a(C11010c.m22280a());
        if (C9376b.m18558a((Collection<T>) a)) {
            return null;
        }
        return UploadContactsApi.m75335a(a, 1);
    }
}
