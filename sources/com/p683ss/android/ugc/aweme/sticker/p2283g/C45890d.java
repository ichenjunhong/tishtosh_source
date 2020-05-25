package com.p683ss.android.ugc.aweme.sticker.p2283g;

import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52730y;

/* renamed from: com.ss.android.ugc.aweme.sticker.g.d */
public final class C45890d {
    /* renamed from: a */
    public static final void m99781a(String str, Map<String, String> map) {
        C52711k.m112240b(str, "$this$mob");
        C52711k.m112240b(map, "params");
        C47702b bVar = C47702b.f120193a;
        C42438az a = C42438az.m93209a();
        for (Entry entry : map.entrySet()) {
            a.mo86526a((String) entry.getKey(), (String) entry.getValue());
        }
        bVar.mo94984a(str, a.f107329a);
    }

    /* renamed from: a */
    public static final HashMap<String, String> m99780a(ShortVideoContext shortVideoContext, C52847n<String, String>... nVarArr) {
        C52711k.m112240b(shortVideoContext, "$this$asMobParam");
        C52711k.m112240b(nVarArr, "extras");
        C52730y yVar = new C52730y(5);
        yVar.mo110332b(C52856t.m112465a("enter_from", "video_shoot_page"));
        yVar.mo110332b(C52856t.m112465a("creation_id", shortVideoContext.f107131x));
        yVar.mo110332b(C52856t.m112465a("shoot_way", shortVideoContext.f107132y));
        yVar.mo110332b(C52856t.m112465a("draft_id", String.valueOf(shortVideoContext.f107022A)));
        yVar.mo110330a((Object) nVarArr);
        return C52550ab.m112057c((C52847n[]) yVar.mo110331a((Object[]) new C52847n[yVar.mo110329a()]));
    }
}
