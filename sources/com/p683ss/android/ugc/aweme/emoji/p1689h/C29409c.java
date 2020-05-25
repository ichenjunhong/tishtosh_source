package com.p683ss.android.ugc.aweme.emoji.p1689h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29286b;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29406a;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.h.c */
public final class C29409c extends C29286b {

    /* renamed from: b */
    protected int f77023b;

    /* renamed from: c */
    private Context f77024c;

    /* renamed from: d */
    private C29406a f77025d;

    /* renamed from: a */
    public final int mo59213a() {
        return -1;
    }

    /* renamed from: g */
    public final int mo59221g() {
        return 20;
    }

    /* renamed from: j */
    public final int mo59224j() {
        m69346m();
        return this.f77023b;
    }

    /* renamed from: m */
    private void m69346m() {
        if (this.f77023b == 0) {
            this.f77023b = this.f77025d.mo59398a();
        }
    }

    /* renamed from: c */
    public final Drawable mo59217c() {
        return this.f77025d.mo59399a(this.f77024c);
    }

    /* renamed from: f */
    public final int mo59220f() {
        m69346m();
        if (this.f77023b == 0) {
            return 1;
        }
        return ((this.f77023b - 1) / 20) + 1;
    }

    /* renamed from: k */
    public final String mo59225k() {
        return String.valueOf(mo59223i());
    }

    /* renamed from: l */
    public final List<C29285a> mo59226l() {
        return this.f77025d.mo59401a(0, this.f77025d.mo59398a());
    }

    public C29409c(Context context) {
        this.f77025d = C29406a.m69329b(context);
        this.f77024c = context;
    }

    /* renamed from: b */
    public final List<C29285a> mo59216b(int i) {
        List<C29285a> a = this.f77025d.mo59401a(i * 20, 20);
        C29285a aVar = new C29285a();
        aVar.f76665a = R.drawable.y2;
        a.add(aVar);
        return a;
    }
}
