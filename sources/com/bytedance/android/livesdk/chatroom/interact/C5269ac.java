package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.android.live.core.p230g.C3920x;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import java.util.concurrent.TimeUnit;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.ac */
public final class C5269ac {

    /* renamed from: a */
    String f14107a;

    /* renamed from: b */
    String f14108b;

    /* renamed from: c */
    float f14109c;

    /* renamed from: d */
    long f14110d;

    /* renamed from: e */
    int f14111e;

    /* renamed from: f */
    int f14112f;

    /* renamed from: g */
    int f14113g;

    /* renamed from: h */
    int f14114h;

    /* renamed from: i */
    private C1690c f14115i;

    /* renamed from: b */
    public final void mo11119b() {
        if (this.f14115i != null && !this.f14115i.isDisposed()) {
            this.f14115i.dispose();
        }
    }

    /* renamed from: a */
    public final void mo11118a() {
        this.f14109c = ((float) C3920x.m9896a()) / 1024.0f;
        this.f14115i = C4585b.m11020a(5000, TimeUnit.MILLISECONDS).mo6514a(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) new C5270ad<Object,Object>(this)).mo6520a(C5271ae.f14117a).mo6514a(C1667a.m5940a()).mo6505a(C5272af.f14118a, C5273ag.f14119a);
    }

    public C5269ac(String str, String str2, long j, int i, int i2, int i3, int i4) {
        this.f14107a = str;
        this.f14108b = str2;
        this.f14110d = j;
        this.f14111e = i;
        this.f14112f = i2;
        this.f14113g = i3;
        this.f14114h = i4;
    }
}
