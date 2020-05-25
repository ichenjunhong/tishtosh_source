package com.bytedance.android.livesdk.chatroom.p301a.p303b;

import android.graphics.Path;
import com.p683ss.ugc.live.barrage.C51594a;
import com.p683ss.ugc.live.barrage.p2602a.C51596a;
import com.p683ss.ugc.live.barrage.p2603b.C51607a;
import com.p683ss.ugc.live.barrage.view.BarrageLayout;
import java.util.ArrayList;
import java.util.Random;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.b.a */
public final class C4969a extends C51607a {

    /* renamed from: a */
    public static final C4970a f13330a = new C4970a(null);

    /* renamed from: j */
    private final ArrayList<C4971b> f13331j = new ArrayList<>();

    /* renamed from: k */
    private final Random f13332k = new Random();

    /* renamed from: l */
    private float f13333l = 1.0f;

    /* renamed from: m */
    private final BarrageLayout f13334m;

    /* renamed from: n */
    private final int f13335n = 1400;

    /* renamed from: com.bytedance.android.livesdk.chatroom.a.b.a$a */
    public static final class C4970a {
        private C4970a() {
        }

        public /* synthetic */ C4970a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo10732a() {
        mo105551d();
        for (C4971b a : this.f13331j) {
            a.mo10732a();
        }
        super.mo10732a();
    }

    /* renamed from: b */
    public final int mo10736b() {
        int b = super.mo10736b();
        for (C4971b b2 : this.f13331j) {
            b += b2.mo10736b();
        }
        return b;
    }

    /* renamed from: a */
    public final void mo10734a(C51596a aVar) {
        C52711k.m112240b(aVar, "barrage");
        mo105550c();
    }

    /* renamed from: a */
    public final void mo10733a(Path path) {
        C52711k.m112240b(path, LeakCanaryFileProvider.f132050j);
        C4971b bVar = new C4971b(this.f13334m, path, this.f13335n);
        this.f13331j.add(bVar);
        this.f13334m.m110794a(bVar, this.f13334m.f128921a.size());
    }

    public C4969a(BarrageLayout barrageLayout, int i) {
        C52711k.m112240b(barrageLayout, "barrageView");
        super(barrageLayout);
        this.f13334m = barrageLayout;
    }

    /* renamed from: a */
    public final void mo10735a(C51594a aVar, float f) {
        C52711k.m112240b(aVar, "runBarrageList");
        this.f13333l += f / ((float) this.f13335n);
        if (this.f13333l > 0.32f) {
            C51596a e = mo105552e();
            if (e != null) {
                ((C4971b) this.f13331j.get(this.f13332k.nextInt(this.f13331j.size()))).mo105547a(e, false);
            }
            this.f13333l = 0.0f;
        }
    }
}
