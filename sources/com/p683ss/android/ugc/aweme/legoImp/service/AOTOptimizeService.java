package com.p683ss.android.ugc.aweme.legoImp.service;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.FileObserver;
import com.C2240a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.newmedia.p1195a.C19540c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoService;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.legoImp.service.AOTOptimizeService */
public class AOTOptimizeService implements LegoService {
    public static boolean hasTriggerAOT;
    public C35917a profileListener;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.service.AOTOptimizeService$a */
    class C35917a extends FileObserver {

        /* renamed from: a */
        Context f92142a;

        public final void onEvent(int i, String str) {
            if (i == 2 && !AOTOptimizeService.hasTriggerAOT) {
                if (AOTOptimizeService.this.profileListener != null) {
                    AOTOptimizeService.this.profileListener.stopWatching();
                    AOTOptimizeService.this.profileListener = null;
                }
                AOTOptimizeService.this.execOptCommand(this.f92142a);
            }
        }

        C35917a(Context context, String str) {
            super(str);
            this.f92142a = context;
        }
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    private boolean isDoOptimizeEnabled() {
        if (VERSION.SDK_INT >= 24 && releaseVersionChange() && !hasTriggerAOT) {
            return true;
        }
        return false;
    }

    private void updateReleaseVersion() {
        Context a = C11010c.m22280a();
        C23859b.m58575b().mo49465a(a, "aot_release_build_version", C19540c.m47819a(a).mo40795a("release_build", "default_version"));
    }

    private boolean releaseVersionChange() {
        Context a = C11010c.m22280a();
        if (!C23859b.m58575b().mo49460a(a, "aot_release_build_version").equals(C19540c.m47819a(a).mo40795a("release_build", "default_version"))) {
            return true;
        }
        return false;
    }

    public void init(Context context) {
        startWatchingForOptimize(context);
    }

    private void execCommand(String str) throws IOException {
        Process exec = Runtime.getRuntime().exec(str);
        try {
            exec.waitFor();
            exec.exitValue();
        } catch (InterruptedException unused) {
            System.err.println("execCommand InterruptedException");
        }
    }

    private void startWatchingForOptimize(Context context) {
        if (isDoOptimizeEnabled()) {
            C32458a.m75144a("startWatchingForOptimize");
            if (this.profileListener == null) {
                this.profileListener = new C35917a(context, C2240a.m6772a("%s/%s/%s", new Object[]{"/data/misc/profiles/cur/0", context.getPackageName(), "primary.prof"}));
            }
            this.profileListener.startWatching();
        }
    }

    public void execOptCommand(Context context) {
        if (isDoOptimizeEnabled()) {
            try {
                updateReleaseVersion();
                hasTriggerAOT = true;
                StringBuilder sb = new StringBuilder("cmd package compile -m everything-profile -f ");
                sb.append(context.getPackageName());
                execCommand(sb.toString());
            } catch (IOException unused) {
                System.err.println("execOptCommand IOException");
            }
        }
    }
}
