package com.p683ss.android.ugc.aweme.router;

import com.p683ss.android.common.util.C18922i;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.router.y */
public final class C41311y {

    /* renamed from: a */
    private C18922i f104769a;

    /* renamed from: a */
    public final String mo83871a() {
        return this.f104769a.mo38774a();
    }

    /* renamed from: a */
    public static C41311y m91065a(String str) {
        return new C41311y(str);
    }

    private C41311y(String str) {
        this.f104769a = new C18922i(str);
    }

    /* renamed from: a */
    public final C41311y mo83868a(String str, int i) {
        this.f104769a.mo38776a(str, i);
        C41302w.m91042a().f104758d.mo83855b(str);
        return this;
    }

    /* renamed from: a */
    public final C41311y mo83869a(String str, long j) {
        this.f104769a.mo38777a(str, j);
        C41300u uVar = C41302w.m91042a().f104758d;
        if (uVar.f104742b == null) {
            uVar.f104742b = new ArrayList<>();
        }
        uVar.f104742b.add(str);
        return this;
    }

    /* renamed from: a */
    public final C41311y mo83870a(String str, String str2) {
        this.f104769a.mo38778a(str, str2);
        C41302w.m91042a().f104758d.mo83854a(str);
        return this;
    }
}
