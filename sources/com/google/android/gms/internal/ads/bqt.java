package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.p683ss.android.medialib.camera.ImageFrame;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import java.io.IOException;
import java.nio.ByteBuffer;

final class bqt implements bom, bre, brq, btd<bqz> {

    /* renamed from: A */
    private final Runnable f43594A;

    /* renamed from: B */
    private boolean f43595B;

    /* renamed from: C */
    private boolean f43596C;

    /* renamed from: D */
    private int f43597D;

    /* renamed from: E */
    private long f43598E;

    /* renamed from: F */
    private long f43599F;

    /* renamed from: G */
    private long f43600G;

    /* renamed from: H */
    private int f43601H;

    /* renamed from: a */
    final brd f43602a;

    /* renamed from: b */
    final brh f43603b;

    /* renamed from: c */
    final String f43604c = null;

    /* renamed from: d */
    final long f43605d;

    /* renamed from: e */
    final btc f43606e;

    /* renamed from: f */
    final bra f43607f;

    /* renamed from: g */
    final btk f43608g;

    /* renamed from: h */
    final Runnable f43609h;

    /* renamed from: i */
    final Handler f43610i;
    /* access modifiers changed from: 0000 */

    /* renamed from: j */
    public final SparseArray<bro> f43611j;

    /* renamed from: k */
    brf f43612k;

    /* renamed from: l */
    bor f43613l;

    /* renamed from: m */
    boolean f43614m;

    /* renamed from: n */
    boolean f43615n;

    /* renamed from: o */
    brx f43616o;

    /* renamed from: p */
    long f43617p;

    /* renamed from: q */
    boolean[] f43618q;

    /* renamed from: r */
    boolean[] f43619r;

    /* renamed from: s */
    boolean f43620s;

    /* renamed from: t */
    boolean f43621t;

    /* renamed from: u */
    boolean f43622u;

    /* renamed from: v */
    private final Uri f43623v;

    /* renamed from: w */
    private final bsr f43624w;

    /* renamed from: x */
    private final int f43625x;

    /* renamed from: y */
    private final Handler f43626y;

    /* renamed from: z */
    private final bsp f43627z;

    public bqt(Uri uri, bsr bsr, bok[] bokArr, int i, Handler handler, brd brd, brh brh, bsp bsp, String str, int i2) {
        this.f43623v = uri;
        this.f43624w = bsr;
        this.f43625x = i;
        this.f43626y = handler;
        this.f43602a = brd;
        this.f43603b = brh;
        this.f43627z = bsp;
        this.f43605d = (long) i2;
        this.f43606e = new btc("Loader:ExtractorMediaPeriod");
        this.f43607f = new bra(bokArr, this);
        this.f43608g = new btk();
        this.f43594A = new bqu(this);
        this.f43609h = new bqw(this);
        this.f43610i = new Handler();
        this.f43600G = -9223372036854775807L;
        this.f43611j = new SparseArray<>();
        this.f43598E = -1;
    }

    /* renamed from: a */
    public final void mo30577a(brf brf, long j) {
        this.f43612k = brf;
        this.f43608g.mo30684a();
        m36491f();
    }

    /* renamed from: b */
    public final brx mo30582b() {
        return this.f43616o;
    }

    /* renamed from: a */
    public final long mo30575a(bsi[] bsiArr, boolean[] zArr, brr[] brrArr, boolean[] zArr2, long j) {
        bti.m36701b(this.f43615n);
        for (int i = 0; i < bsiArr.length; i++) {
            if (brrArr[i] != null && (bsiArr[i] == null || !zArr[i])) {
                int i2 = brrArr[i].f43647a;
                bti.m36701b(this.f43618q[i2]);
                this.f43597D--;
                this.f43618q[i2] = false;
                ((bro) this.f43611j.valueAt(i2)).mo30619b();
                brrArr[i] = null;
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < bsiArr.length; i3++) {
            if (brrArr[i3] == null && bsiArr[i3] != null) {
                bsi bsi = bsiArr[i3];
                bti.m36701b(bsi.mo30645b() == 1);
                bti.m36701b(bsi.mo30646b(0) == 0);
                int a = this.f43616o.mo30639a(bsi.mo30643a());
                bti.m36701b(!this.f43618q[a]);
                this.f43597D++;
                this.f43618q[a] = true;
                brrArr[i3] = new brb(this, a);
                zArr2[i3] = true;
                z = true;
            }
        }
        if (!this.f43595B) {
            int size = this.f43611j.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.f43618q[i4]) {
                    ((bro) this.f43611j.valueAt(i4)).mo30619b();
                }
            }
        }
        if (this.f43597D == 0) {
            this.f43596C = false;
            if (this.f43606e.mo30678a()) {
                this.f43606e.mo30679b();
            }
        } else if (!this.f43595B ? j != 0 : z) {
            j = mo30581b(j);
            for (int i5 = 0; i5 < brrArr.length; i5++) {
                if (brrArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.f43595B = true;
        return j;
    }

    /* renamed from: a */
    public final boolean mo30572a(long j) {
        if (this.f43621t || (this.f43615n && this.f43597D == 0)) {
            return false;
        }
        boolean a = this.f43608g.mo30684a();
        if (!this.f43606e.mo30678a()) {
            m36491f();
            a = true;
        }
        return a;
    }

    /* renamed from: K_ */
    public final long mo30571K_() {
        if (this.f43597D == 0) {
            return Long.MIN_VALUE;
        }
        return mo30584d();
    }

    /* renamed from: c */
    public final long mo30583c() {
        if (!this.f43596C) {
            return -9223372036854775807L;
        }
        this.f43596C = false;
        return this.f43599F;
    }

    /* renamed from: d */
    public final long mo30584d() {
        long j;
        if (this.f43621t) {
            return Long.MIN_VALUE;
        }
        if (mo30585e()) {
            return this.f43600G;
        }
        if (this.f43620s) {
            j = Long.MAX_VALUE;
            int size = this.f43611j.size();
            for (int i = 0; i < size; i++) {
                if (this.f43619r[i]) {
                    j = Math.min(j, ((bro) this.f43611j.valueAt(i)).mo30621d());
                }
            }
        } else {
            j = m36493h();
        }
        return j == Long.MIN_VALUE ? this.f43599F : j;
    }

    /* renamed from: b */
    public final long mo30581b(long j) {
        if (!this.f43613l.mo30494a()) {
            j = 0;
        }
        this.f43599F = j;
        int size = this.f43611j.size();
        boolean z = !mo30585e();
        int i = 0;
        while (z && i < size) {
            if (this.f43618q[i]) {
                z = ((bro) this.f43611j.valueAt(i)).mo30618a(j, false);
            }
            i++;
        }
        if (!z) {
            this.f43600G = j;
            this.f43621t = false;
            if (this.f43606e.mo30678a()) {
                this.f43606e.mo30679b();
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    ((bro) this.f43611j.valueAt(i2)).mo30617a(this.f43618q[i2]);
                }
            }
        }
        this.f43596C = false;
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo30573a(int i, bmh bmh, boc boc, boolean z) {
        if (this.f43596C || mo30585e()) {
            return -3;
        }
        bro bro = (bro) this.f43611j.valueAt(i);
        boolean z2 = this.f43621t;
        long j = this.f43599F;
        switch (bro.f43701c.mo30602a(bmh, boc, z, z2, bro.f43705g, bro.f43702d)) {
            case -5:
                bro.f43705g = bmh.f42966a;
                return -5;
            case -4:
                if (!boc.mo30481c()) {
                    if (boc.f43183d < j) {
                        boc.f43156a |= DynamicTabYellowPointVersion.DEFAULT;
                    }
                    if (boc.mo30485e()) {
                        brn brn = bro.f43702d;
                        long j2 = brn.f43696b;
                        int i2 = 1;
                        bro.f43703e.mo30691a(1);
                        bro.mo30616a(j2, bro.f43703e.f43867a, 1);
                        long j3 = j2 + 1;
                        byte b = bro.f43703e.f43867a[0];
                        boolean z3 = (b & 128) != 0;
                        byte b2 = b & Byte.MAX_VALUE;
                        if (boc.f43181b.f43157a == null) {
                            boc.f43181b.f43157a = new byte[16];
                        }
                        bro.mo30616a(j3, boc.f43181b.f43157a, (int) b2);
                        long j4 = j3 + ((long) b2);
                        if (z3) {
                            bro.f43703e.mo30691a(2);
                            bro.mo30616a(j4, bro.f43703e.f43867a, 2);
                            j4 += 2;
                            i2 = bro.f43703e.mo30700e();
                        }
                        int[] iArr = boc.f43181b.f43160d;
                        if (iArr == null || iArr.length < i2) {
                            iArr = new int[i2];
                        }
                        int[] iArr2 = boc.f43181b.f43161e;
                        if (iArr2 == null || iArr2.length < i2) {
                            iArr2 = new int[i2];
                        }
                        if (z3) {
                            int i3 = i2 * 6;
                            bro.f43703e.mo30691a(i3);
                            bro.mo30616a(j4, bro.f43703e.f43867a, i3);
                            j4 += (long) i3;
                            bro.f43703e.mo30697c(0);
                            for (int i4 = 0; i4 < i2; i4++) {
                                iArr[i4] = bro.f43703e.mo30700e();
                                iArr2[i4] = bro.f43703e.mo30705i();
                            }
                        } else {
                            iArr[0] = 0;
                            iArr2[0] = brn.f43695a - ((int) (j4 - brn.f43696b));
                        }
                        bou bou = brn.f43698d;
                        bnx bnx = boc.f43181b;
                        byte[] bArr = bou.f43205b;
                        byte[] bArr2 = boc.f43181b.f43157a;
                        int i5 = bou.f43204a;
                        bnx.f43162f = i2;
                        bnx.f43160d = iArr;
                        bnx.f43161e = iArr2;
                        bnx.f43158b = bArr;
                        bnx.f43157a = bArr2;
                        bnx.f43159c = i5;
                        bnx.f43163g = 0;
                        bnx.f43164h = 0;
                        if (btw.f43878a >= 16) {
                            bnx.f43165i.numSubSamples = bnx.f43162f;
                            bnx.f43165i.numBytesOfClearData = bnx.f43160d;
                            bnx.f43165i.numBytesOfEncryptedData = bnx.f43161e;
                            bnx.f43165i.key = bnx.f43158b;
                            bnx.f43165i.iv = bnx.f43157a;
                            bnx.f43165i.mode = bnx.f43159c;
                            if (btw.f43878a >= 24) {
                                boa boa = bnx.f43166j;
                                boa.f43173b.set(0, 0);
                                boa.f43172a.setPattern(boa.f43173b);
                            }
                        }
                        int i6 = (int) (j4 - brn.f43696b);
                        brn.f43696b += (long) i6;
                        brn.f43695a -= i6;
                    }
                    int i7 = bro.f43702d.f43695a;
                    if (boc.f43182c == null) {
                        boc.f43182c = boc.mo30484b(i7);
                    } else {
                        int capacity = boc.f43182c.capacity();
                        int position = boc.f43182c.position();
                        int i8 = i7 + position;
                        if (capacity < i8) {
                            ByteBuffer b3 = boc.mo30484b(i8);
                            if (position > 0) {
                                boc.f43182c.position(0);
                                boc.f43182c.limit(position);
                                b3.put(boc.f43182c);
                            }
                            boc.f43182c = b3;
                        }
                    }
                    long j5 = bro.f43702d.f43696b;
                    ByteBuffer byteBuffer = boc.f43182c;
                    int i9 = bro.f43702d.f43695a;
                    bro.mo30615a(j5);
                    while (i9 > 0) {
                        int i10 = (int) (j5 - bro.f43704f.f43713a);
                        int min = Math.min(i9, bro.f43700b - i10);
                        bso bso = bro.f43704f.f43716d;
                        byteBuffer.put(bso.f43783a, bso.mo30664a(i10), min);
                        j5 += (long) min;
                        i9 -= min;
                        if (j5 == bro.f43704f.f43714b) {
                            bro.f43699a.mo30666a(bso);
                            bro.f43704f = bro.f43704f.mo30622a();
                        }
                    }
                    bro.mo30615a(bro.f43702d.f43697c);
                }
                return -4;
            case ImageFrame.NV21 /*-3*/:
                return -3;
            default:
                throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30576a(int i, long j) {
        bro bro = (bro) this.f43611j.valueAt(i);
        if (!this.f43621t || j <= bro.mo30621d()) {
            bro.mo30618a(j, true);
            return;
        }
        long g = bro.f43701c.mo30613g();
        if (g != -1) {
            bro.mo30615a(g);
        }
    }

    /* renamed from: a */
    public final bot mo30510a(int i, int i2) {
        bro bro = (bro) this.f43611j.get(i);
        if (bro != null) {
            return bro;
        }
        bro bro2 = new bro(this.f43627z);
        bro2.f43706h = this;
        this.f43611j.put(i, bro2);
        return bro2;
    }

    /* renamed from: a */
    public final void mo30511a() {
        this.f43614m = true;
        this.f43610i.post(this.f43594A);
    }

    /* renamed from: a */
    public final void mo30512a(bor bor) {
        this.f43613l = bor;
        this.f43610i.post(this.f43594A);
    }

    /* renamed from: a */
    public final void mo30580a(zzlg zzlg) {
        this.f43610i.post(this.f43594A);
    }

    /* renamed from: a */
    private final void m36490a(bqz bqz) {
        if (this.f43598E == -1) {
            this.f43598E = bqz.f43634a;
        }
    }

    /* renamed from: f */
    private final void m36491f() {
        bqz bqz = new bqz(this, this.f43623v, this.f43624w, this.f43607f, this.f43608g);
        if (this.f43615n) {
            bti.m36701b(mo30585e());
            if (this.f43617p == -9223372036854775807L || this.f43600G < this.f43617p) {
                bqz.mo30591a(this.f43613l.mo30493a(this.f43600G), this.f43600G);
                this.f43600G = -9223372036854775807L;
            } else {
                this.f43621t = true;
                this.f43600G = -9223372036854775807L;
                return;
            }
        }
        this.f43601H = m36492g();
        int i = this.f43625x;
        if (i == -1) {
            i = (this.f43615n && this.f43598E == -1 && (this.f43613l == null || this.f43613l.mo30495b() == -9223372036854775807L)) ? 6 : 3;
        }
        this.f43606e.mo30677a(bqz, this, i);
    }

    /* renamed from: g */
    private final int m36492g() {
        int i = 0;
        for (int i2 = 0; i2 < this.f43611j.size(); i2++) {
            i += ((bro) this.f43611j.valueAt(i2)).mo30614a();
        }
        return i;
    }

    /* renamed from: h */
    private final long m36493h() {
        int size = this.f43611j.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((bro) this.f43611j.valueAt(i)).mo30621d());
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo30585e() {
        return this.f43600G != -9223372036854775807L;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo30574a(btf btf, long j, long j2, IOException iOException) {
        bqz bqz = (bqz) btf;
        m36490a(bqz);
        if (!(this.f43626y == null || this.f43602a == null)) {
            this.f43626y.post(new bqy(this, iOException));
        }
        if (iOException instanceof bry) {
            return 3;
        }
        boolean z = m36492g() > this.f43601H;
        if (this.f43598E == -1 && (this.f43613l == null || this.f43613l.mo30495b() == -9223372036854775807L)) {
            this.f43599F = 0;
            this.f43596C = this.f43615n;
            int size = this.f43611j.size();
            for (int i = 0; i < size; i++) {
                ((bro) this.f43611j.valueAt(i)).mo30617a(!this.f43615n || this.f43618q[i]);
            }
            bqz.mo30591a(0, 0);
        }
        this.f43601H = m36492g();
        return z ? 1 : 0;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo30579a(btf btf, long j, long j2, boolean z) {
        m36490a((bqz) btf);
        if (!z && this.f43597D > 0) {
            int size = this.f43611j.size();
            for (int i = 0; i < size; i++) {
                ((bro) this.f43611j.valueAt(i)).mo30617a(this.f43618q[i]);
            }
            this.f43612k.mo30386a(this);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo30578a(btf btf, long j, long j2) {
        m36490a((bqz) btf);
        this.f43621t = true;
        if (this.f43617p == -9223372036854775807L) {
            long h = m36493h();
            this.f43617p = h == Long.MIN_VALUE ? 0 : h + 10000;
            this.f43603b.mo30384a(new bru(this.f43617p, this.f43613l.mo30494a()), null);
        }
        this.f43612k.mo30386a(this);
    }
}
