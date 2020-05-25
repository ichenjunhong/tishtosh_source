package com.p683ss.android.ugc.playerkit.videoview.p2497c;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38869h;
import com.p683ss.android.ugc.playerkit.session.C50122a;
import com.p683ss.android.ugc.playerkit.session.C50123b;
import com.p683ss.android.ugc.playerkit.session.Session;
import com.p683ss.android.ugc.playerkit.videoview.p2496b.C50135a;
import com.p683ss.android.ugc.playerkit.videoview.p2496b.C50136b;
import com.p683ss.android.ugc.playerkit.videoview.p2496b.C50137c;
import com.p683ss.android.ugc.playerkit.videoview.p2496b.C50139e;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50145c;

/* renamed from: com.ss.android.ugc.playerkit.videoview.c.a */
public final class C50141a {

    /* renamed from: c */
    private static C50141a f125651c = new C50141a();

    /* renamed from: a */
    public C50137c f125652a;

    /* renamed from: b */
    public C50136b f125653b;

    /* renamed from: d */
    private final C50135a f125654d = new C50139e();

    /* renamed from: a */
    public static C50141a m108193a() {
        return f125651c;
    }

    private C50141a() {
    }

    /* renamed from: a */
    public final C38869h mo97941a(String str) {
        return this.f125654d.mo97929a(mo97944c(str));
    }

    /* renamed from: b */
    public final C50145c mo97943b(String str) {
        return this.f125652a.mo95136a(mo97944c(str));
    }

    /* renamed from: c */
    public C50123b mo97944c(String str) {
        C50123b bVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Session b = C50122a.m108112a().mo97901b(str);
        if (b != null) {
            if (b.state == null) {
                synchronized (this) {
                    if (b.state == null) {
                        C50123b bVar2 = new C50123b();
                        b.state = bVar2;
                        bVar = bVar2;
                    }
                }
            } else {
                bVar = b.state;
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo97942a(String str, int i, int i2) {
        C50123b c = mo97944c(str);
        if (c != null) {
            c.f125607b = i;
            c.f125608c = i2;
        }
    }
}
