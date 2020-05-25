package com.p888c.p889a.p890a.p891a.p896d;

import android.view.View;
import com.p888c.p889a.p890a.p891a.p893b.C13404l;
import com.p888c.p889a.p890a.p891a.p895c.C13406a;
import com.p888c.p889a.p890a.p891a.p896d.C13416a.C13417a;
import com.p888c.p889a.p890a.p891a.p897e.C13422b;
import com.p888c.p889a.p890a.p891a.p897e.C13427f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.d.c */
public final class C13419c implements C13416a {

    /* renamed from: a */
    private final C13416a f34975a;

    public C13419c(C13416a aVar) {
        this.f34975a = aVar;
    }

    /* renamed from: a */
    public final JSONObject mo25121a(View view) {
        return C13422b.m27058a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public final void mo25122a(View view, JSONObject jSONObject, C13417a aVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        C13406a a = C13406a.m27022a();
        if (a != null) {
            Collection<C13404l> c = a.mo25107c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C13404l e : c) {
                View e2 = e.mo25102e();
                if (e2 != null && C13427f.m27077b(e2)) {
                    View rootView = e2.getRootView();
                    if (rootView != null && !identityHashMap.containsKey(rootView)) {
                        identityHashMap.put(rootView, rootView);
                        float a2 = C13427f.m27076a(rootView);
                        int size = arrayList.size();
                        while (size > 0 && C13427f.m27076a((View) arrayList.get(size - 1)) > a2) {
                            size--;
                        }
                        arrayList.add(size, rootView);
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVar.mo25123a((View) it.next(), this.f34975a, jSONObject);
        }
    }
}
