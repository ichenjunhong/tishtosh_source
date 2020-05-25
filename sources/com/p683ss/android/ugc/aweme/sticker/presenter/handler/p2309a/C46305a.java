package com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2309a;

import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46340k;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46340k.C46341a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46317c;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.a.a */
public final class C46305a implements C46341a {

    /* renamed from: a */
    private int f116839a;

    /* renamed from: b */
    private final List<C46340k> f116840b;

    /* renamed from: c */
    private final int f116841c;

    /* renamed from: a */
    public final C46316b mo93036a(C46317c cVar) {
        boolean z;
        boolean z2;
        C52711k.m112240b(cVar, "session");
        boolean z3 = false;
        if (this.f116841c < this.f116840b.size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f116839a++;
            if (this.f116839a <= 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C46305a aVar = new C46305a(this.f116840b, this.f116841c + 1);
                C46340k kVar = (C46340k) this.f116840b.get(this.f116841c);
                C46316b a = kVar.mo93033a(cVar, aVar);
                if (this.f116841c + 1 >= this.f116840b.size() || aVar.f116839a > 0) {
                    z3 = true;
                }
                if (z3) {
                    return a;
                }
                StringBuilder sb = new StringBuilder("handler:");
                sb.append(kVar);
                sb.append(" must call proceed() at least once");
                throw new IllegalStateException(sb.toString().toString());
            }
            StringBuilder sb2 = new StringBuilder("handler:");
            sb2.append((C46340k) this.f116840b.get(this.f116841c - 1));
            sb2.append(" must called useSticker() exactly once");
            throw new IllegalStateException(sb2.toString().toString());
        }
        throw new IllegalStateException("chain response beyond handlers size".toString());
    }

    public C46305a(List<? extends C46340k> list, int i) {
        C52711k.m112240b(list, "handlerList");
        this.f116840b = list;
        this.f116841c = i;
    }
}
