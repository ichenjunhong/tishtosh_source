package com.p683ss.android.ugc.aweme.p2375u.p2376a;

import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import java.util.HashMap;
import java.util.List;
import p2628d.p2650m.C52820l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.u.a.a */
public final class C47405a {

    /* renamed from: a */
    public static final C47405a f119624a = new C47405a();

    /* renamed from: b */
    private static HashMap<String, C47406b> f119625b = new HashMap<>();

    private C47405a() {
    }

    /* renamed from: a */
    public static boolean m102783a(String str) {
        boolean z = false;
        if (str != null) {
            CharSequence charSequence = str;
            if (C52830p.m112456b(charSequence, (CharSequence) " ", false, 2, (Object) null)) {
                List split = new C52820l(" ").split(charSequence, 0);
                if (split.size() >= 2) {
                    String str2 = (String) split.get(0);
                    List subList = split.subList(1, split.size());
                    if (f119625b.containsKey(str2)) {
                        C47406b bVar = (C47406b) f119625b.get(str2);
                        if (bVar != null) {
                            z = bVar.mo94687a(subList);
                        }
                    }
                }
            }
        }
        if (z) {
            C10691a.m21537a(C11010c.m22280a(), "command executed ok").mo19066a();
        } else {
            C10691a.m21545b(C11010c.m22280a(), "command executed fail").mo19066a();
        }
        return z;
    }
}
