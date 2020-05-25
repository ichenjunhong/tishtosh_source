package com.p683ss.android.ugc.aweme.base.utils;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.bytedance.common.utility.C9425l;
import com.bytedance.common.utility.C9425l.C9426a;
import com.bytedance.common.utility.C9425l.C9427b;
import com.bytedance.ies.ugc.p694a.C11010c;

/* renamed from: com.ss.android.ugc.aweme.base.utils.g */
public class C23718g implements C9427b {

    /* renamed from: a */
    private NetworkInfo f63251a;

    /* renamed from: b */
    private C9426a f63252b;

    /* renamed from: com.ss.android.ugc.aweme.base.utils.g$a */
    static class C23720a {

        /* renamed from: a */
        public static final C23718g f63253a = new C23718g();
    }

    /* renamed from: b */
    public static C23718g m58207b() {
        return C23720a.f63253a;
    }

    /* renamed from: a */
    public final C9426a mo17067a() {
        return this.f63252b;
    }

    /* renamed from: c */
    public final boolean mo49152c() {
        boolean z;
        synchronized (C23718g.class) {
            z = false;
            if (this.f63251a != null && this.f63251a.isAvailable() && 1 == this.f63251a.getType()) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: d */
    public final boolean mo49153d() {
        boolean z;
        synchronized (C23718g.class) {
            if (this.f63251a == null || !this.f63251a.isAvailable()) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    private C23718g() {
        this.f63252b = C9426a.NONE;
        try {
            this.f63251a = C23721h.m58213a((ConnectivityManager) C11010c.m22280a().getSystemService("connectivity"));
            m58208b(this.f63251a);
            C9425l.f25671a = this;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo49151a(NetworkInfo networkInfo) {
        synchronized (C23718g.class) {
            this.f63251a = networkInfo;
            m58208b(this.f63251a);
        }
    }

    /* renamed from: b */
    private void m58208b(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isAvailable()) {
            this.f63252b = C9426a.NONE;
            return;
        }
        int type = networkInfo.getType();
        if (1 == type) {
            this.f63252b = C9426a.WIFI;
        } else if (type == 0) {
            switch (((TelephonyManager) C11010c.m22280a().getSystemService("phone")).getNetworkType()) {
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    this.f63252b = C9426a.MOBILE_3G;
                    break;
                case 13:
                    break;
            }
            this.f63252b = C9426a.MOBILE_4G;
            this.f63252b = C9426a.MOBILE;
        } else {
            this.f63252b = C9426a.MOBILE;
        }
    }
}
