package com.p683ss.android.ugc.aweme.utils;

import android.os.Process;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.io.Closeable;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.utils.aq */
public final class C47678aq {

    /* renamed from: a */
    public static C47681a f120160a;

    /* renamed from: b */
    public static Integer f120161b;

    /* renamed from: com.ss.android.ugc.aweme.utils.aq$a */
    public static class C47681a {

        /* renamed from: a */
        public double f120163a;

        /* renamed from: b */
        public double f120164b;
    }

    /* renamed from: a */
    public static Integer m103191a() {
        return f120161b;
    }

    /* renamed from: b */
    public static C47681a m103194b() {
        RandomAccessFile randomAccessFile;
        double d;
        RandomAccessFile randomAccessFile2;
        C47681a aVar = new C47681a();
        RandomAccessFile randomAccessFile3 = null;
        try {
            String valueOf = String.valueOf(Process.myPid());
            randomAccessFile = new RandomAccessFile("/proc/stat", "r");
            try {
                String[] split = randomAccessFile.readLine().split(" ");
                d = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
                for (int i = 2; i < split.length; i++) {
                    d += Double.parseDouble(split[i]);
                }
                StringBuilder sb = new StringBuilder("/proc/");
                sb.append(valueOf);
                sb.append("/stat");
                randomAccessFile2 = new RandomAccessFile(sb.toString(), "r");
            } catch (Throwable th) {
                th = th;
                m103192a((Closeable) randomAccessFile);
                m103192a((Closeable) randomAccessFile3);
                throw th;
            }
            try {
                String[] split2 = randomAccessFile2.readLine().split(" ");
                double parseDouble = Double.parseDouble(split2[13]);
                double parseDouble2 = Double.parseDouble(split2[14]);
                aVar.f120163a = parseDouble + parseDouble2 + Double.parseDouble(split2[15]) + Double.parseDouble(split2[16]);
                aVar.f120164b = d;
                m103192a((Closeable) randomAccessFile);
                m103192a((Closeable) randomAccessFile2);
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile3 = randomAccessFile2;
                m103192a((Closeable) randomAccessFile);
                m103192a((Closeable) randomAccessFile3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
            m103192a((Closeable) randomAccessFile);
            m103192a((Closeable) randomAccessFile3);
            throw th;
        }
        return aVar;
    }

    /* renamed from: a */
    private static void m103192a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m103193a(final boolean z) {
        C0013i.m16a((Callable<TResult>) new Callable<C47681a>() {
            public final /* synthetic */ Object call() throws Exception {
                return C47678aq.m103194b();
            }
        }).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<C47681a, Void>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                if (iVar.mo34e() != null) {
                    if (!(!z || C47678aq.f120160a == null || ((C47681a) iVar.mo34e()).f120164b == C47678aq.f120160a.f120164b)) {
                        C47678aq.f120161b = Integer.valueOf((int) (((((C47681a) iVar.mo34e()).f120163a - C47678aq.f120160a.f120163a) * 100.0d) / (((C47681a) iVar.mo34e()).f120164b - C47678aq.f120160a.f120164b)));
                    }
                    C47678aq.f120160a = (C47681a) iVar.mo34e();
                }
                return null;
            }
        }, C0013i.f25b);
    }
}
