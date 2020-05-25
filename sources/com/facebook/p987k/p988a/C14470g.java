package com.facebook.p987k.p988a;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;

/* renamed from: com.facebook.k.a.g */
final class C14470g {

    /* renamed from: a */
    public static C14470g f37579a;

    /* renamed from: b */
    private static final ThreadLocal<byte[]> f37580b = new ThreadLocal<byte[]>() {
        public final /* bridge */ /* synthetic */ Object initialValue() {
            return new byte[UnReadVideoExperiment.LIKE_USER_LIST];
        }
    };

    /* renamed from: c */
    private static long f37581c = -1;

    /* renamed from: d */
    private static C14469f f37582d = new C14469f();

    /* renamed from: e */
    private static C14459a f37583e = new C14459a();

    /* renamed from: f */
    private String f37584f;

    /* renamed from: a */
    public static synchronized C14470g m29596a() {
        C14470g gVar;
        synchronized (C14470g.class) {
            if (f37579a == null) {
                f37579a = new C14470g("/proc/net/xt_qtaguid/stats");
            }
            gVar = f37579a;
        }
        return gVar;
    }

    private C14470g(String str) {
        this.f37584f = str;
    }

    /* renamed from: a */
    public final long mo26632a(int i) {
        FileInputStream fileInputStream;
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        long j = 0;
        try {
            fileInputStream = new FileInputStream(this.f37584f);
            C14469f fVar = f37582d;
            fVar.f37575a = fileInputStream;
            fVar.f37577c = 0;
            fVar.f37576b = 0;
            byte[] bArr = (byte[]) f37580b.get();
            f37582d.mo26631a();
            while (true) {
                int a = f37582d.mo26630a(bArr);
                if (a == -1) {
                    break;
                }
                try {
                    C14459a aVar = f37583e;
                    aVar.f37551a = bArr;
                    aVar.f37552b = 0;
                    aVar.f37553c = a;
                    aVar.f37555e = false;
                    C14459a aVar2 = f37583e;
                    aVar2.mo26620a();
                    aVar2.f37554d = ' ';
                    aVar2.f37555e = true;
                    f37583e.mo26623c();
                    if (!f37583e.mo26621a("lo")) {
                        f37583e.mo26623c();
                        if (f37583e.mo26622b() == i) {
                            f37583e.mo26623c();
                            j += (long) f37583e.mo26622b();
                        }
                    }
                } catch (NumberFormatException | NoSuchElementException unused) {
                }
            }
            fileInputStream.close();
            if (f37581c == -1) {
                f37581c = j;
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return -1;
            }
            long j2 = j - f37581c;
            f37581c = j;
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return j2;
        } catch (IOException unused2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return -1;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }
}
