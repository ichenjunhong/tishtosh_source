package com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d;

import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34554k;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.d.f */
final /* synthetic */ class C34016f implements C0011g {

    /* renamed from: a */
    private final C34010e f87949a;

    /* renamed from: b */
    private final boolean f87950b;

    /* renamed from: c */
    private final String f87951c;

    /* renamed from: d */
    private final Map f87952d;

    /* renamed from: e */
    private final C34043n f87953e;

    C34016f(C34010e eVar, boolean z, String str, Map map, C34043n nVar) {
        this.f87949a = eVar;
        this.f87950b = z;
        this.f87951c = str;
        this.f87952d = map;
        this.f87953e = nVar;
    }

    public final Object then(C0013i iVar) {
        C34010e eVar = this.f87949a;
        boolean z = this.f87950b;
        String str = this.f87951c;
        Map map = this.f87952d;
        C34043n nVar = this.f87953e;
        if (!iVar.mo33d() || !z) {
            for (Entry entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    eVar.f87939a.remove(entry.getKey());
                }
            }
            if (iVar.mo26b() && iVar.mo34e() != null) {
                List<? extends IMUser> list = ((C34554k) iVar.mo34e()).f89081a;
                if (list != null && list.size() > 0) {
                    for (IMUser a : list) {
                        eVar.mo71959a(a);
                    }
                }
                if (nVar != null) {
                    nVar.mo71998a((C34554k) iVar.mo34e());
                }
                return list;
            }
        } else {
            eVar.mo71962a(str, map, false, nVar);
        }
        return null;
    }
}
