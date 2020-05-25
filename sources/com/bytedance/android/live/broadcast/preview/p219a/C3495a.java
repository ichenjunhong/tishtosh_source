package com.bytedance.android.live.broadcast.preview.p219a;

import com.bytedance.android.livesdkapi.C8747h;
import com.bytedance.android.livesdkapi.C8747h.C8748a;
import com.bytedance.android.livesdkapi.C8747h.C8749b;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.live.broadcast.preview.a.a */
public final class C3495a implements C8748a {

    /* renamed from: a */
    private int f9969a;

    /* renamed from: b */
    private ArrayList<C8747h> f9970b;

    /* renamed from: c */
    private C8749b f9971c;

    /* renamed from: b */
    public final C8749b mo8889b() {
        return this.f9971c;
    }

    /* renamed from: a */
    public final void mo8888a() {
        if (this.f9969a <= this.f9970b.size()) {
            ((C8747h) this.f9970b.get(this.f9969a)).mo8890a(new C3495a(this.f9969a + 1, this.f9970b, this.f9971c));
        }
    }

    public C3495a(int i, ArrayList<C8747h> arrayList, C8749b bVar) {
        this.f9969a = i;
        this.f9970b = arrayList;
        this.f9971c = bVar;
    }
}
