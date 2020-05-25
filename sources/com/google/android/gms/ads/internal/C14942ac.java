package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.ads.C16117nx;
import com.google.android.gms.internal.ads.C16118ny;
import com.google.android.gms.internal.ads.C16138or;
import com.google.android.gms.internal.ads.C16382xs;
import com.google.android.gms.internal.ads.C16420zc;
import com.google.android.gms.internal.ads.C16421zd;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.ads.internal.ac */
final /* synthetic */ class C14942ac implements Runnable {

    /* renamed from: a */
    private final C15039z f38512a;

    /* renamed from: b */
    private final Runnable f38513b;

    C14942ac(C15039z zVar, Runnable runnable) {
        this.f38512a = zVar;
        this.f38513b = runnable;
    }

    public final void run() {
        C15039z zVar = this.f38512a;
        Runnable runnable = this.f38513b;
        Context context = zVar.f38854a;
        C15464q.m32132b("Adapters must be initialized on the main thread.");
        Map<String, C16118ny> map = C14963ax.m30834d().mo28595f().mo28647i().f40156b;
        if (map != null && !map.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    abv.m32795c("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            C16382xs xsVar = C16382xs.f45979j;
            if (xsVar != null) {
                Collection<C16118ny> values = map.values();
                HashMap hashMap = new HashMap();
                C14882b a = C14886d.m30544a(context);
                for (C16118ny nyVar : values) {
                    for (C16117nx nxVar : nyVar.f45294a) {
                        String str = nxVar.f45281k;
                        for (String str2 : nxVar.f45273c) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                for (Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        C16420zc a2 = xsVar.f45981l.mo31468a(str3);
                        if (a2 != null) {
                            C16138or orVar = a2.f46035a;
                            if (!orVar.mo31258g()) {
                                if (orVar.mo31264m()) {
                                    orVar.mo31241a(a, (C16421zd) a2.f46036b, (List) entry.getValue());
                                    String str4 = "Initialized rewarded video mediation adapter ";
                                    String valueOf = String.valueOf(str3);
                                    abv.m32792b(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 56);
                        sb.append("Failed to initialize rewarded video mediation adapter \"");
                        sb.append(str3);
                        sb.append("\"");
                        abv.m32795c(sb.toString(), th2);
                    }
                }
            }
        }
    }
}
