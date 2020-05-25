package com.p683ss.android.ugc.aweme.main;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.CookieSyncManager;
import com.p683ss.android.p1147d.C18933b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;

/* renamed from: com.ss.android.ugc.aweme.main.BaseMainHelper */
public abstract class BaseMainHelper {

    /* renamed from: a */
    protected Activity f93401a;

    /* renamed from: b */
    protected boolean f93402b;

    /* renamed from: com.ss.android.ugc.aweme.main.BaseMainHelper$1 */
    class C364491 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseMainHelper f93403a;

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f93403a.mo75393a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.BaseMainHelper$ClearCacheTask */
    class ClearCacheTask implements LegoTask {
        public C35896f process() {
            return C35894d.m81063a(this);
        }

        public C35898h type() {
            return C35898h.BOOT_FINISH;
        }

        private ClearCacheTask() {
        }

        public void run(Context context) {
            C32458a.m75144a("ClearCacheTask");
            new C18933b(context).mo38806c();
        }

        /* synthetic */ ClearCacheTask(BaseMainHelper baseMainHelper, C364491 r2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo75393a() {
        if (this.f93401a != null) {
            BusinessComponentServiceUtils.getMainHelperService().mo75660a();
            try {
                CookieSyncManager.getInstance().sync();
            } catch (Throwable unused) {
            }
        }
        this.f93402b = true;
        this.f93401a.finish();
    }
}
