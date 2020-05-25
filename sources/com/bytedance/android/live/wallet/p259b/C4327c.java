package com.bytedance.android.live.wallet.p259b;

import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.p262e.C4406a;
import com.bytedance.android.live.wallet.p262e.C4407b;
import com.bytedance.android.live.wallet.p262e.C4410c;
import com.bytedance.android.livesdkapi.host.IHostWallet.C8770a;
import com.bytedance.android.livesdkapi.host.IHostWallet.C8771b;
import com.bytedance.android.livesdkapi.host.IHostWallet.C8775f;
import com.bytedance.android.livesdkapi.host.IHostWallet.C8776g;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.android.live.wallet.b.c */
public final class C4327c {

    /* renamed from: a */
    public C8770a f11856a;

    /* renamed from: b */
    public C4331b f11857b;

    /* renamed from: c */
    public LinkedList<C4330a> f11858c;

    /* renamed from: d */
    public C4312a f11859d;

    /* renamed from: e */
    public AtomicInteger f11860e;

    /* renamed from: com.bytedance.android.live.wallet.b.c$a */
    public interface C4330a {
        /* renamed from: a */
        void mo10105a();
    }

    /* renamed from: com.bytedance.android.live.wallet.b.c$b */
    public enum C4331b {
        DISCONNECTED,
        CONNECTING,
        CONNECTED,
        CLOSED
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8770a mo10112a() {
        if (this.f11856a == null) {
            m10605b();
        }
        return this.f11856a;
    }

    /* renamed from: b */
    private void m10605b() {
        this.f11856a = ((IWalletService) C4116c.m10249a(IWalletService.class)).getBillingClient(new C8775f() {
        });
        this.f11857b = C4331b.DISCONNECTED;
        this.f11859d = new C4312a(new C4410c(), new C4407b(), new C4406a(), this);
    }

    /* renamed from: a */
    public final void mo10113a(C4330a aVar) {
        this.f11858c.remove(aVar);
    }

    /* renamed from: b */
    public final void mo10116b(C4330a aVar) {
        if (this.f11857b != C4331b.CONNECTED) {
            if (aVar != null && !this.f11858c.contains(aVar)) {
                this.f11858c.add(aVar);
            }
            m10604a(0);
        } else if (aVar != null) {
            aVar.mo10105a();
        }
    }

    /* renamed from: a */
    private void m10604a(int i) {
        if (this.f11857b == C4331b.DISCONNECTED) {
            this.f11857b = C4331b.CONNECTING;
            Iterator it = this.f11858c.iterator();
            while (it.hasNext()) {
                it.next();
            }
            if (mo10112a() != null) {
                new Object(0) {
                };
            }
        }
    }

    /* renamed from: a */
    public final void mo10114a(String str, C8771b bVar) {
        if (this.f11857b != C4331b.CONNECTED) {
            bVar.mo10107a(-1, null);
        } else {
            mo10112a();
        }
    }

    /* renamed from: a */
    public final void mo10115a(List<String> list, C8776g gVar) {
        if (this.f11857b != C4331b.CONNECTED) {
            gVar.mo10119a(-1, null);
        } else {
            mo10112a();
        }
    }
}
