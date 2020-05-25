package com.bytedance.common.wschannel.channel.p530a.p531a.p532a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import okhttp3.C53504ad;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.a.a */
public class C9463a implements C9465c {

    /* renamed from: a */
    private final Context f25755a;

    /* renamed from: b */
    private int f25756b;

    /* renamed from: c */
    public void mo17152c() {
        this.f25756b = 0;
    }

    /* renamed from: b */
    public final long mo17151b() {
        return (long) ((Math.random() * 4500.0d) + 500.0d);
    }

    /* renamed from: a */
    public long mo17149a() {
        if (!m18769a(this.f25755a)) {
            return -1;
        }
        this.f25756b++;
        double min = (double) Math.min(((long) (1 << this.f25756b)) * 5000, 120000);
        double random = Math.random() * 10.0d * 1000.0d;
        Double.isNaN(min);
        return (long) (min + random);
    }

    C9463a(Context context) {
        this.f25755a = context;
    }

    /* renamed from: a */
    private static boolean m18769a(Context context) {
        try {
            NetworkInfo a = C9464b.m18774a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a == null || !a.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final long mo17150a(C53504ad adVar) {
        long a = mo17149a();
        if (a == -1) {
            return -1;
        }
        if (adVar != null) {
            try {
                if (!adVar.mo111275a()) {
                    int i = adVar.f132400c;
                    if (i == 414 || i == 511 || i == 512) {
                        String b = adVar.mo111276b("Handshake-Options");
                        if (b != null) {
                            String[] split = b.split(";");
                            int length = split.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    break;
                                }
                                String str = split[i2];
                                if (!TextUtils.isEmpty(str)) {
                                    String[] split2 = str.split("=");
                                    if ("reconnect-interval".equals(split2[0])) {
                                        try {
                                            a = 1000 * Long.parseLong(split2[1]);
                                            break;
                                        } catch (NumberFormatException unused) {
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                i2++;
                            }
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
        return a;
    }
}
