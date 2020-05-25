package com.p683ss.android.ugc.effectmanager.p2430a;

import android.content.Context;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.link.model.host.Host;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.a.a */
public final class C48565a {

    /* renamed from: a */
    public C48890g f122047a;

    /* renamed from: b */
    public final Context mo96085b() {
        return this.f122047a.f122950C;
    }

    /* renamed from: a */
    public final String mo96084a() {
        boolean z;
        List<Host> list = this.f122047a.f122951D;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        return ((Host) list.get(0)).getItemName();
    }

    public C48565a(C48890g gVar) {
        this.f122047a = gVar;
    }
}
