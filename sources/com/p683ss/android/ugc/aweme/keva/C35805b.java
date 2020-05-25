package com.p683ss.android.ugc.aweme.keva;

import android.content.Context;
import com.bytedance.keva.Keva;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.keva.b */
final /* synthetic */ class C35805b implements Runnable {

    /* renamed from: a */
    private final Context f91964a;

    C35805b(Context context) {
        this.f91964a = context;
    }

    public final void run() {
        Context context = this.f91964a;
        if (KevaPerfExperiment.INSTANCE.mo74472a(context, 1)) {
            File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
            if (file.exists()) {
                for (String file2 : file.list()) {
                    File file3 = new File(file, file2);
                    String name = file3.getName();
                    if (name.endsWith(".xml") && Keva.isRepoPorted(name.substring(0, name.length() - 4)) && file3.exists()) {
                        file3.delete();
                    }
                }
            }
        } else if (KevaPerfExperiment.INSTANCE.mo74472a(context, 2) || KevaPerfExperiment.INSTANCE.mo74472a(context, 3)) {
            File filesDir = context.getFilesDir();
            if (filesDir == null) {
                filesDir = new File(context.getApplicationInfo().dataDir, "files");
            }
            if (filesDir.exists()) {
                File file4 = new File(filesDir, "keva/internal_repo/aweme_ported_sp_repo");
                if (file4.exists()) {
                    for (String file5 : file4.list()) {
                        new File(file5).delete();
                    }
                    file4.delete();
                }
            }
        }
    }
}
