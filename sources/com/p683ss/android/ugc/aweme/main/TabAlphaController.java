package com.p683ss.android.ugc.aweme.main;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.main.TabAlphaController */
public class TabAlphaController extends Handler implements C0183j {

    /* renamed from: c */
    private static final String[] f93531c = {"SM-G9500", "SM-G9550", "SM-G9600", "SM-G9608", "SM-G9650", "SM-N9500"};

    /* renamed from: d */
    private static TabAlphaController f93532d;

    /* renamed from: a */
    View f93533a;

    /* renamed from: b */
    public boolean f93534b;

    /* renamed from: e */
    private boolean f93535e;

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void onPause() {
        mo75604a(false);
    }

    /* renamed from: a */
    public static TabAlphaController m82394a() {
        if (f93532d == null) {
            f93532d = new TabAlphaController();
        }
        return f93532d;
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        if (hasMessages(1)) {
            removeMessages(1);
        }
        this.f93533a = null;
    }

    private TabAlphaController() {
        if (TextUtils.equals("samsung", Build.BRAND.toLowerCase())) {
            for (String equals : f93531c) {
                if (TextUtils.equals(equals, Build.MODEL)) {
                    this.f93535e = true;
                    return;
                }
            }
        }
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume(C0184k kVar) {
        mo75604a(true);
    }

    public void handleMessage(Message message) {
        if (message.what == 1 && this.f93533a != null && !this.f93534b) {
            this.f93533a.setAlpha(this.f93533a.getAlpha() / 2.0f);
            this.f93534b = true;
        }
    }

    /* renamed from: a */
    public final void mo75604a(boolean z) {
        if (this.f93533a != null && this.f93535e) {
            if (!z || this.f93534b) {
                if (hasMessages(1)) {
                    removeMessages(1);
                }
            } else if (!hasMessages(1)) {
                sendEmptyMessageDelayed(1, 1200000);
            }
        }
    }
}
