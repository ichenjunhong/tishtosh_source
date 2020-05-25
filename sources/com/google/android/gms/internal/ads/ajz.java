package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

@C16299uq
public final class ajz implements blv, brd, bth<bsr>, buk {

    /* renamed from: i */
    private static int f40742i;

    /* renamed from: j */
    private static int f40743j;

    /* renamed from: a */
    final Context f40744a;

    /* renamed from: b */
    public final ajy f40745b;

    /* renamed from: c */
    final bmm f40746c;

    /* renamed from: d */
    final aia f40747d;

    /* renamed from: e */
    public blu f40748e;

    /* renamed from: f */
    public akh f40749f;

    /* renamed from: g */
    int f40750g;

    /* renamed from: h */
    Set<WeakReference<ajt>> f40751h = new HashSet();

    /* renamed from: k */
    private final bmm f40752k;

    /* renamed from: l */
    private final bsf f40753l;

    /* renamed from: m */
    private ByteBuffer f40754m;

    /* renamed from: n */
    private boolean f40755n;

    public ajz(Context context, aia aia) {
        this.f40744a = context;
        this.f40747d = aia;
        this.f40745b = new ajy();
        bue bue = new bue(this.f40744a, bqf.f43581a, 0, acd.f40245a, this, -1);
        this.f40752k = bue;
        this.f40746c = new bnq(bqf.f43581a);
        this.f40753l = new bsc();
        if (abv.m32495a()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("ExoPlayerAdapter initialize ");
            sb.append(valueOf);
            abv.m32494a(sb.toString());
        }
        f40742i++;
        this.f40748e = new bly(new bmm[]{this.f40746c, this.f40752k}, this.f40753l, this.f40745b);
        this.f40748e.mo30365a((blv) this);
    }

    /* renamed from: a */
    public static int m33121a() {
        return f40742i;
    }

    /* renamed from: b */
    public static int m33123b() {
        return f40743j;
    }

    /* renamed from: a */
    public final void mo29058a(Uri[] uriArr, String str) {
        mo29059a(uriArr, str, ByteBuffer.allocate(0), false);
    }

    /* renamed from: a */
    public final void mo29059a(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        brg brg;
        this.f40754m = byteBuffer;
        this.f40755n = z;
        if (uriArr.length == 1) {
            brg = m33122a(uriArr[0], str);
        } else {
            brg[] brgArr = new brg[uriArr.length];
            for (int i = 0; i < uriArr.length; i++) {
                brgArr[i] = m33122a(uriArr[i], str);
            }
            brg = new brj(brgArr);
        }
        this.f40748e.mo30366a(brg);
        f40743j++;
    }

    /* renamed from: c */
    public final void mo29060c() {
        if (this.f40748e != null) {
            this.f40748e.mo30369b((blv) this);
            this.f40748e.mo30373d();
            this.f40748e = null;
            f40743j--;
        }
    }

    /* renamed from: a */
    public final void mo29053a(IOException iOException) {
        if (this.f40749f != null) {
            this.f40749f.mo29006a("onLoadError", (Exception) iOException);
        }
    }

    /* renamed from: a */
    public final void mo29050a(int i, int i2, int i3, float f) {
        if (this.f40749f != null) {
            this.f40749f.mo29005a(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo29057a(boolean z, int i) {
        if (this.f40749f != null) {
            this.f40749f.mo29008g(i);
        }
    }

    /* renamed from: a */
    public final void mo29052a(blt blt) {
        if (this.f40749f != null) {
            this.f40749f.mo29006a("onPlayerError", (Exception) blt);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo29051a(Surface surface, boolean z) {
        blx blx = new blx(this.f40752k, 1, surface);
        if (z) {
            this.f40748e.mo30370b(blx);
            return;
        }
        this.f40748e.mo30368a(blx);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo29056a(boolean z) {
        for (int i = 0; i < this.f40748e.mo30374e(); i++) {
            this.f40753l.mo30657a(i, !z);
        }
    }

    /* renamed from: a */
    private final brg m33122a(Uri uri, String str) {
        bss bss;
        bss bss2;
        if (!this.f40755n || this.f40754m.limit() <= 0) {
            if (this.f40747d.f40560i > 0) {
                bss2 = new akb(this, str);
            } else {
                bss2 = new akc(this, str);
            }
            bss akd = this.f40747d.f40561j ? new akd(this, bss2) : bss2;
            if (this.f40754m.limit() > 0) {
                byte[] bArr = new byte[this.f40754m.limit()];
                this.f40754m.get(bArr);
                akd = new ake(akd, bArr);
            }
            bss = akd;
        } else {
            byte[] bArr2 = new byte[this.f40754m.limit()];
            this.f40754m.get(bArr2);
            bss = new aka(bArr2);
        }
        brc brc = new brc(uri, bss, akf.f40765a, -1, acd.f40245a, this, null, this.f40747d.f40558g);
        return brc;
    }

    public final void finalize() throws Throwable {
        f40742i--;
        if (abv.m32495a()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("ExoPlayerAdapter finalize ");
            sb.append(valueOf);
            abv.m32494a(sb.toString());
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo29054a(Object obj, int i) {
        this.f40750g += i;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo29055a(Object obj, bsu bsu) {
        this.f40750g = 0;
    }
}
