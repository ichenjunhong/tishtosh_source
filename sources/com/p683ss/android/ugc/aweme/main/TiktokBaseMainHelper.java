package com.p683ss.android.ugc.aweme.main;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Process;
import android.webkit.CookieSyncManager;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.p1147d.C18933b;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p1807im.C33200k;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.main.TiktokBaseMainHelper */
public abstract class TiktokBaseMainHelper {

    /* renamed from: a */
    private static boolean f93546a;

    /* renamed from: b */
    protected Activity f93547b;

    /* renamed from: c */
    protected NotificationManager f93548c;

    /* renamed from: d */
    protected boolean f93549d;

    /* renamed from: e */
    protected boolean f93550e;

    /* renamed from: f */
    protected boolean f93551f;

    /* renamed from: g */
    protected final Handler f93552g = new Handler();

    /* renamed from: h */
    protected long f93553h = 0;

    /* renamed from: com.ss.android.ugc.aweme.main.TiktokBaseMainHelper$1 */
    class C364821 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TiktokBaseMainHelper f93554a;

        public final void run() {
            BusinessComponentServiceUtils.getMainHelperService().mo75662c();
            AppLog.onQuit();
            this.f93554a.mo75623e();
            Process.killProcess(Process.myPid());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.TiktokBaseMainHelper$AppStartJobTask */
    class AppStartJobTask implements LegoTask {
        public C35896f process() {
            return C35894d.m81063a(this);
        }

        public C35898h type() {
            return C35898h.BOOT_FINISH;
        }

        private AppStartJobTask() {
        }

        public void run(Context context) {
            new C18933b(TiktokBaseMainHelper.this.f93547b).mo38806c();
            C33200k.m76277a(false);
        }

        /* synthetic */ AppStartJobTask(TiktokBaseMainHelper tiktokBaseMainHelper, C364821 r2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo75620b() {
        BusinessComponentServiceUtils.getMainHelperService().mo75660a();
        try {
            CookieSyncManager.getInstance().sync();
        } catch (Throwable unused) {
        }
        this.f93551f = true;
        this.f93547b.finish();
    }

    /* renamed from: c */
    public final void mo75621c() {
        if (!this.f93549d && !this.f93550e) {
            C35857a.m81001b().mo74526a(new AppStartJobTask(this, null)).mo74527a();
        }
    }

    /* renamed from: e */
    public final void mo75623e() {
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setAction("com.ss.android.newmedia.killApplication");
        this.f93547b.sendBroadcast(intent);
    }

    /* renamed from: d */
    public final boolean mo75622d() {
        if (f93546a) {
            mo75620b();
            return true;
        } else if (System.currentTimeMillis() - this.f93553h <= 2000) {
            mo75620b();
            this.f93553h = 0;
            return true;
        } else {
            this.f93553h = System.currentTimeMillis();
            C9432q.m18689b((Context) this.f93547b, (int) R.string.pl, 48);
            return false;
        }
    }

    protected TiktokBaseMainHelper(Activity activity) {
        this.f93547b = activity;
        this.f93548c = (NotificationManager) activity.getSystemService("notification");
        this.f93549d = false;
        this.f93550e = false;
    }
}
