package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo;

import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0678q;
import android.support.p030v4.app.Fragment;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.l */
public final class C33661l extends C0678q {

    /* renamed from: a */
    private List<C33655i> f87287a;

    public final int getCount() {
        if (this.f87287a != null) {
            return this.f87287a.size();
        }
        return 0;
    }

    public final Fragment getItem(int i) {
        C33660k kVar = new C33660k();
        Bundle bundle = new Bundle();
        bundle.putSerializable("photo_param", (Serializable) this.f87287a.get(i));
        kVar.setArguments(bundle);
        return kVar;
    }

    public C33661l(C0654k kVar, List<C33655i> list) {
        super(kVar);
        this.f87287a = list;
    }
}
