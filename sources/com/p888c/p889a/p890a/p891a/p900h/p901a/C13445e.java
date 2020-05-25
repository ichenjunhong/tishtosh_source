package com.p888c.p889a.p890a.p891a.p900h.p901a;

import com.p888c.p889a.p890a.p891a.p893b.C13404l;
import com.p888c.p889a.p890a.p891a.p895c.C13406a;
import com.p888c.p889a.p890a.p891a.p895c.C13412e;
import com.p888c.p889a.p890a.p891a.p899g.C13430a;
import com.p888c.p889a.p890a.p891a.p899g.C13430a.C13431a;
import com.p888c.p889a.p890a.p891a.p900h.p901a.C13440b.C13442b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.h.a.e */
public final class C13445e extends C13439a {
    public C13445e(C13442b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void onPostExecute(String str) {
        C13406a a = C13406a.m27022a();
        if (a != null) {
            for (C13404l lVar : a.mo25106b()) {
                if (this.f35009a.contains(lVar.mo25101d())) {
                    C13430a c = lVar.mo25100c();
                    if (this.f35011c >= c.f34985d && c.f34984c != C13431a.AD_STATE_NOTVISIBLE) {
                        c.f34984c = C13431a.AD_STATE_NOTVISIBLE;
                        C13412e.m27034a().mo25117b(c.mo25132c(), str);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f35010b.toString();
    }
}
