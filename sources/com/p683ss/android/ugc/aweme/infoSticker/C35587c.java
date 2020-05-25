package com.p683ss.android.ugc.aweme.infoSticker;

import android.arch.lifecycle.C0198r;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.c */
public final class C35587c {

    /* renamed from: a */
    private FragmentActivity f91458a;

    /* renamed from: b */
    private String f91459b;

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.c$1 */
    static /* synthetic */ class C355881 {

        /* renamed from: a */
        static final /* synthetic */ int[] f91460a = new int[C37722a.values().length];

        static {
            try {
                f91460a[C37722a.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo73988a(C35586b bVar) {
        C35635v.m80462a(this.f91458a);
        String str = this.f91459b;
        C0198r rVar = new C0198r();
        C39629l.m88232a().mo58589t().mo74186a(str, null, 0, 0, new C35640z(rVar));
        rVar.observe(this.f91458a, new C35604d(bVar));
    }

    public C35587c(FragmentActivity fragmentActivity, String str) {
        this.f91458a = fragmentActivity;
        this.f91459b = str;
    }
}
