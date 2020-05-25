package com.p683ss.android.ugc.aweme.app.debug;

import com.p683ss.android.ugc.aweme.setting.p2133b.C41576h;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.app.debug.a */
public final class C23074a implements Serializable {
    public String category;

    public final ArrayList<C41576h> getExtraInfoDelegates() {
        return (ArrayList) C41576h.f105290a.get(this.category);
    }

    public final C23074a setCategory(String str) {
        this.category = str;
        return this;
    }
}
