package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.C2240a;
import com.google.android.gms.ads.internal.C14963ax;
import java.util.concurrent.TimeUnit;

@C16299uq
public final class aic {

    /* renamed from: a */
    private final Context f40562a;

    /* renamed from: b */
    private final String f40563b;

    /* renamed from: c */
    private final zzbgz f40564c;

    /* renamed from: d */
    private final C15804ci f40565d;

    /* renamed from: e */
    private final C15806ck f40566e;

    /* renamed from: f */
    private final adn f40567f = new adn(new adq().mo28733a("min_1", Double.MIN_VALUE, 1.0d).mo28733a("1_5", 1.0d, 5.0d).mo28733a("5_10", 5.0d, 10.0d).mo28733a("10_20", 10.0d, 20.0d).mo28733a("20_30", 20.0d, 30.0d).mo28733a("30_max", 30.0d, Double.MAX_VALUE));

    /* renamed from: g */
    private final long[] f40568g;

    /* renamed from: h */
    private final String[] f40569h;

    /* renamed from: i */
    private boolean f40570i = false;

    /* renamed from: j */
    private boolean f40571j = false;

    /* renamed from: k */
    private boolean f40572k = false;

    /* renamed from: l */
    private boolean f40573l = false;

    /* renamed from: m */
    private boolean f40574m;

    /* renamed from: n */
    private ahk f40575n;

    /* renamed from: o */
    private boolean f40576o;

    /* renamed from: p */
    private boolean f40577p;

    /* renamed from: q */
    private long f40578q = -1;

    public aic(Context context, zzbgz zzbgz, String str, C15806ck ckVar, C15804ci ciVar) {
        this.f40562a = context;
        this.f40564c = zzbgz;
        this.f40563b = str;
        this.f40566e = ckVar;
        this.f40565d = ciVar;
        String str2 = (String) caf.m37099d().mo30717a(C15740bx.f44494x);
        if (str2 == null) {
            this.f40569h = new String[0];
            this.f40568g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.f40569h = new String[split.length];
        this.f40568g = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f40568g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                abv.m32795c("Unable to parse frame hash target time number.", e);
                this.f40568g[i] = -1;
            }
        }
    }

    /* renamed from: a */
    public final void mo28950a(ahk ahk) {
        C15799cd.m37136a(this.f40566e, this.f40565d, "vpc2");
        this.f40570i = true;
        if (this.f40566e != null) {
            this.f40566e.mo30900a("vpn", ahk.mo28841a());
        }
        this.f40575n = ahk;
    }

    /* renamed from: a */
    public final void mo28949a() {
        if (this.f40570i && !this.f40571j) {
            C15799cd.m37136a(this.f40566e, this.f40565d, "vfr2");
            this.f40571j = true;
        }
    }

    /* renamed from: b */
    public final void mo28951b() {
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44493w)).booleanValue() && !this.f40576o) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.f40563b);
            bundle.putString("player", this.f40575n.mo28841a());
            for (adp adp : this.f40567f.mo28728a()) {
                String valueOf = String.valueOf("fps_c_");
                String valueOf2 = String.valueOf(adp.f40321a);
                bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Integer.toString(adp.f40323c));
                String valueOf3 = String.valueOf("fps_p_");
                String valueOf4 = String.valueOf(adp.f40321a);
                bundle.putString(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), Double.toString(adp.f40322b));
            }
            for (int i = 0; i < this.f40568g.length; i++) {
                String str = this.f40569h[i];
                if (str != null) {
                    String valueOf5 = String.valueOf(Long.valueOf(this.f40568g[i]));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf5).length() + 3);
                    sb.append("fh_");
                    sb.append(valueOf5);
                    bundle.putString(sb.toString(), str);
                }
            }
            C14963ax.m30831a().mo28666a(this.f40562a, this.f40564c.f46237a, "gmob-apps", bundle, true);
            this.f40576o = true;
        }
    }

    /* renamed from: b */
    public final void mo28952b(ahk ahk) {
        if (this.f40572k && !this.f40573l) {
            if (abv.m32495a() && !this.f40573l) {
                abv.m32494a("VideoMetricsMixin first frame");
            }
            C15799cd.m37136a(this.f40566e, this.f40565d, "vff2");
            this.f40573l = true;
        }
        long c = C14963ax.m30837g().mo28525c();
        if (this.f40574m && this.f40577p && this.f40578q != -1) {
            double nanos = (double) TimeUnit.SECONDS.toNanos(1);
            double d = (double) (c - this.f40578q);
            Double.isNaN(nanos);
            Double.isNaN(d);
            this.f40567f.mo28729a(nanos / d);
        }
        this.f40577p = this.f40574m;
        this.f40578q = c;
        long longValue = ((Long) caf.m37099d().mo30717a(C15740bx.f44495y)).longValue();
        long currentPosition = (long) ahk.getCurrentPosition();
        int i = 0;
        while (i < this.f40569h.length) {
            if (this.f40569h[i] != null || longValue <= Math.abs(currentPosition - this.f40568g[i])) {
                ahk ahk2 = ahk;
                i++;
            } else {
                String[] strArr = this.f40569h;
                int i2 = 8;
                Bitmap bitmap = ahk.getBitmap(8, 8);
                long j = 63;
                int i3 = 0;
                long j2 = 0;
                while (i3 < i2) {
                    long j3 = j;
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j3);
                        i4++;
                        j3--;
                        i2 = 8;
                    }
                    i3++;
                    j = j3;
                    i2 = 8;
                }
                strArr[i] = C2240a.m6772a("%016X", new Object[]{Long.valueOf(j2)});
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo28953c() {
        this.f40574m = true;
        if (this.f40571j && !this.f40572k) {
            C15799cd.m37136a(this.f40566e, this.f40565d, "vfp2");
            this.f40572k = true;
        }
    }

    /* renamed from: d */
    public final void mo28954d() {
        this.f40574m = false;
    }
}
