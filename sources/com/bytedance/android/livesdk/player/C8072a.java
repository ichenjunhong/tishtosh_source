package com.bytedance.android.livesdk.player;

import android.content.Context;
import com.bytedance.android.live.livepullstream.p249a.C4134a;
import com.bytedance.android.live.livepullstream.p249a.C4134a.C4135a;
import com.bytedance.android.live.livepullstream.p250b.C4141b.C4144b;
import com.bytedance.android.live.livepullstream.p250b.C4141b.C4144b.C4145a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.depend.p436d.C8626b;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.ies.p672e.C10753b;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.android.livesdk.player.a */
public final class C8072a implements C4134a {

    /* renamed from: a */
    static String f22053a;

    /* renamed from: b */
    WeakReference<C4135a> f22054b;

    /* renamed from: com.bytedance.android.livesdk.player.a$a */
    public static final class C8073a implements C4144b<C4134a> {
        /* renamed from: a */
        public final C4145a<C4134a> mo9533a(C4145a<C4134a> aVar) {
            return aVar.mo9535a(new C8072a()).mo9534a();
        }
    }

    /* renamed from: a */
    public final String mo9523a() {
        if (f22053a != null) {
            return f22053a;
        }
        Context context = ((IHostContext) C4116c.m10249a(IHostContext.class)).context();
        if (context != null) {
            f22053a = C10753b.m21793a(context).mo19442a("hardware_info_cpu_soc", (String) null);
        }
        return f22053a;
    }

    /* renamed from: a */
    public final void mo9524a(C4135a aVar) {
        this.f22054b = new WeakReference<>(aVar);
        C8626b.m17014a().mo15106a((Callable) new C8077b(this));
    }
}
