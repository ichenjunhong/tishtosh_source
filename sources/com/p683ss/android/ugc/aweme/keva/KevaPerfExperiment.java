package com.p683ss.android.ugc.aweme.keva;

import android.content.Context;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

@C10178a(mo18163a = "keva_perf")
/* renamed from: com.ss.android.ugc.aweme.keva.KevaPerfExperiment */
public final class KevaPerfExperiment {
    private static final String AB_TYPE_FILE_NAME = "keva_perf_ab_type";
    @C10179b(mo18165a = true)
    public static final int DOUBLE = 0;
    public static final KevaPerfExperiment INSTANCE = new KevaPerfExperiment();
    @C10179b
    public static final int KEVA = 1;
    private static final int MASK = 255;
    @C10179b
    public static final int SP_AWEME = 3;
    @C10179b
    public static final int SP_ORIGIN = 2;
    private static int abTypeValue = -1;
    private static File abTypeValueFile;

    /* renamed from: com.ss.android.ugc.aweme.keva.KevaPerfExperiment$a */
    public static final class C35803a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f91962a;

        public C35803a(Context context) {
            this.f91962a = context;
        }

        public final void run() {
            int a = C10181b.m20511a().mo18168a(KevaPerfExperiment.class, true, "keva_perf", 31744, 0);
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(KevaPerfExperiment.m80932a(this.f91962a)));
                dataOutputStream.writeInt(a);
                dataOutputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    private KevaPerfExperiment() {
    }

    /* renamed from: a */
    public static File m80932a(Context context) {
        File filesDir = context.getFilesDir();
        abTypeValueFile = new File(filesDir, AB_TYPE_FILE_NAME);
        if (filesDir.exists()) {
            filesDir.mkdir();
        }
        File file = abTypeValueFile;
        if (file != null) {
            return file;
        }
        throw new C52857u("null cannot be cast to non-null type java.io.File");
    }

    /* renamed from: a */
    public final boolean mo74472a(Context context, int i) {
        C52711k.m112240b(context, "context");
        if (abTypeValue == -1) {
            if (!m80932a(context).exists()) {
                abTypeValue = 0;
            } else {
                try {
                    DataInputStream dataInputStream = new DataInputStream(new FileInputStream(abTypeValueFile));
                    abTypeValue = dataInputStream.readInt() & 255;
                    dataInputStream.close();
                } catch (Throwable unused) {
                    abTypeValue = 0;
                }
            }
        }
        if (abTypeValue == i) {
            return true;
        }
        return false;
    }
}
