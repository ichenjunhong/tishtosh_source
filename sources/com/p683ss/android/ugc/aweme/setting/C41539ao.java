package com.p683ss.android.ugc.aweme.setting;

import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.detail.api.C27317a;
import com.p683ss.android.ugc.aweme.detail.api.C27318b;
import com.p683ss.android.ugc.aweme.shortvideo.AVApiImpl;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.ao */
final /* synthetic */ class C41539ao implements Callable {

    /* renamed from: a */
    static final Callable f105229a = new C41539ao();

    private C41539ao() {
    }

    public final Object call() {
        return (C27318b) AVApiImpl.createAVApibyMonsterPlugin().executeGetJSONObject(new C18922i(C27317a.f72067a).toString(), C27318b.class, null);
    }
}
