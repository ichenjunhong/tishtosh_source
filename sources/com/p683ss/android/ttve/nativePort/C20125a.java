package com.p683ss.android.ttve.nativePort;

import android.media.ImageReader;
import android.media.MediaCodec;
import android.os.HandlerThread;
import com.p683ss.android.ttve.model.VEFrame;
import com.p683ss.android.ttve.model.VEFrame.C20091a;
import com.p683ss.android.vesdk.C50753r;
import com.p683ss.android.vesdk.C50792y;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.ttve.nativePort.a */
public final class C20125a {

    /* renamed from: b */
    public static String f55334b;

    /* renamed from: c */
    public static String f55335c;

    /* renamed from: a */
    public String f55336a = "HwFrameExtractor_";

    /* renamed from: d */
    public String f55337d;

    /* renamed from: e */
    public int[] f55338e;

    /* renamed from: f */
    public int f55339f;

    /* renamed from: g */
    public int f55340g;

    /* renamed from: h */
    boolean f55341h;

    /* renamed from: i */
    public int f55342i;

    /* renamed from: j */
    C50753r f55343j;

    /* renamed from: k */
    VEFrame f55344k;

    /* renamed from: l */
    public VEFrame f55345l;

    /* renamed from: m */
    VEFrame f55346m;

    /* renamed from: n */
    public VEFrame f55347n;

    /* renamed from: o */
    public MediaCodec f55348o = null;

    /* renamed from: p */
    public long f55349p;

    /* renamed from: q */
    public int f55350q;

    /* renamed from: r */
    public int f55351r;

    /* renamed from: s */
    public int f55352s;

    /* renamed from: t */
    public HandlerThread f55353t;

    /* renamed from: u */
    public HandlerThread f55354u;

    /* renamed from: v */
    public ImageReader f55355v;

    /* renamed from: w */
    int f55356w;

    /* renamed from: x */
    boolean f55357x;

    /* renamed from: y */
    public boolean f55358y;

    /* renamed from: z */
    private long f55359z = Thread.currentThread().getId();

    /* renamed from: c */
    private void m49676c() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f55339f * this.f55340g * 4);
        allocateDirect.clear();
        this.f55344k = VEFrame.createByteBufferFrame(allocateDirect, this.f55339f, this.f55340g, 0, 0, C20091a.TEPixFmt_ARGB8);
    }

    /* renamed from: a */
    public final void mo42613a() {
        try {
            C50792y.m109909a(this.f55336a, "stop begin");
            if (this.f55355v != null) {
                this.f55348o.reset();
                this.f55348o.release();
            }
            if (this.f55355v != null) {
                this.f55355v.close();
            }
            if (this.f55354u != null) {
                this.f55354u.quitSafely();
            }
            if (this.f55353t != null) {
                this.f55353t.quitSafely();
            }
        } catch (Exception unused) {
            C50792y.m109909a(this.f55336a, "stop crash");
            mo42614b();
        }
    }

    /* renamed from: b */
    public final void mo42614b() {
        this.f55357x = true;
        String str = this.f55336a;
        StringBuilder sb = new StringBuilder("processFrameLast begin hasProcessCount:");
        sb.append(this.f55356w);
        sb.append(" ptsMsLength: ");
        sb.append(this.f55338e.length);
        C50792y.m109909a(str, sb.toString());
        while (this.f55356w < this.f55338e.length * this.f55342i) {
            String str2 = this.f55336a;
            StringBuilder sb2 = new StringBuilder("processFrameLast processing hasProcxessCount:");
            sb2.append(this.f55356w);
            sb2.append(" ptsMsLength: ");
            sb2.append(this.f55338e.length);
            C50792y.m109909a(str2, sb2.toString());
            if (!this.f55343j.processFrame(null, this.f55339f, this.f55340g, 0)) {
                String str3 = this.f55336a;
                StringBuilder sb3 = new StringBuilder("processFrameLast stop hasProcxessCount:");
                sb3.append(this.f55356w);
                sb3.append(" ptsMsLength: ");
                sb3.append(this.f55338e.length);
                C50792y.m109909a(str3, sb3.toString());
                return;
            }
            this.f55356w += this.f55342i;
        }
    }

    public C20125a(String str, int[] iArr, int i, int i2, boolean z, int i3, int i4, C50753r rVar) {
        this.f55356w = 0;
        this.f55357x = false;
        this.f55358y = false;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f55336a);
        sb.append(i4);
        sb.append("_");
        sb.append(this.f55359z);
        this.f55336a = sb.toString();
        this.f55337d = str;
        this.f55338e = iArr;
        this.f55339f = i;
        this.f55340g = i2;
        this.f55341h = false;
        this.f55342i = i3;
        this.f55343j = rVar;
        try {
            m49676c();
        } catch (OutOfMemoryError unused) {
            C50792y.m109909a(this.f55336a, "init alloc oom");
            Runtime.getRuntime().gc();
            try {
                m49676c();
            } catch (Exception unused2) {
                mo42614b();
                return;
            }
        }
        for (int i5 = 0; i5 < iArr.length; i5++) {
            iArr[i5] = iArr[i5] * 1000;
            String str2 = this.f55336a;
            StringBuilder sb2 = new StringBuilder("ptsMS: ");
            sb2.append(iArr[i5]);
            C50792y.m109909a(str2, sb2.toString());
        }
    }
}
