package com.p683ss.android.ugc.aweme.p1149d.p1150a;

import android.os.Handler;
import com.bytedance.apm.C8936b;
import com.bytedance.apm.p465a.C8919d;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.agilelogger.C18778a;
import com.p683ss.android.agilelogger.C18783b;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.d.a.a */
public final class C18964a {

    /* renamed from: a */
    public static final C18964a f52261a = new C18964a();

    /* renamed from: b */
    private static ArrayList<String> f52262b;

    /* renamed from: c */
    private static HashMap<String, ArrayList<C18967b>> f52263c = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.d.a.a$a */
    static final class C18965a implements Runnable {

        /* renamed from: a */
        public static final C18965a f52264a = new C18965a();

        C18965a() {
        }

        public final void run() {
            String str;
            long currentTimeMillis = (System.currentTimeMillis() / 1000) - 10800;
            long currentTimeMillis2 = System.currentTimeMillis() / 1000;
            C18783b bVar = C18778a.f51915b;
            if (bVar != null) {
                str = bVar.f51932d;
            } else {
                str = null;
            }
            C8936b.m17653a(str, currentTimeMillis, currentTimeMillis2, "Network", (C8919d) C189661.f52265a);
        }
    }

    private C18964a() {
    }

    static {
        List list;
        f52262b = new ArrayList<>();
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            list = b.getApiAlogWhiteList();
        } catch (Exception unused) {
            list = null;
        }
        if (C9376b.m18558a((Collection<T>) list)) {
            Collection collection = f52262b;
            String[] stringArray = C11010c.m22280a().getResources().getStringArray(R.array.b5);
            C52711k.m112236a((Object) stringArray, "AppContextManager.getApp…gacy_api_alog_white_list)");
            C52575l.m112109a(collection, (Object[]) stringArray);
        } else if (list != null) {
            f52262b = (ArrayList) list;
        } else {
            throw new C52857u("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.String> /* = java.util.ArrayList<kotlin.String> */");
        }
    }

    /* renamed from: a */
    public static void m46136a() {
        try {
            for (Entry value : f52263c.entrySet()) {
                ArrayList<C18967b> arrayList = (ArrayList) value.getValue();
                if (!C9376b.m18558a((Collection<T>) arrayList)) {
                    for (C18967b bVar : arrayList) {
                        C18778a.m45848b("Network", bVar.toString());
                    }
                }
            }
            f52263c.clear();
            new Handler().postDelayed(C18965a.f52264a, 60000);
        } catch (Exception unused) {
        }
    }
}
