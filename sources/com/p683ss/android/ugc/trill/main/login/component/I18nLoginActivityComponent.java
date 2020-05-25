package com.p683ss.android.ugc.trill.main.login.component;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.IAccountService.C20837d;
import com.p683ss.android.ugc.aweme.IAccountService.C20839f;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.base.component.BaseLoginActivityComponent;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.login.C27960d.C27961a;
import com.p683ss.android.ugc.trill.app.p2515a.C50307a;
import com.p683ss.android.ugc.trill.app.p2515a.C50308b;

/* renamed from: com.ss.android.ugc.trill.main.login.component.I18nLoginActivityComponent */
public class I18nLoginActivityComponent extends BaseLoginActivityComponent implements C23371a<Boolean>, C27961a {

    /* renamed from: a */
    public Activity f126324a;

    /* renamed from: b */
    public Fragment f126325b;

    /* renamed from: c */
    public C23505g f126326c;

    /* renamed from: d */
    public Bundle f126327d;

    /* renamed from: e */
    public String f126328e;

    /* renamed from: f */
    public String f126329f;

    /* renamed from: g */
    private Handler f126330g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private Runnable f126331h = new Runnable() {
        public final void run() {
            Activity activity;
            if (I18nLoginActivityComponent.this.f126324a != null || (I18nLoginActivityComponent.this.f126325b != null && I18nLoginActivityComponent.this.f126325b.getActivity() != null)) {
                if (I18nLoginActivityComponent.this.f126324a == null) {
                    activity = I18nLoginActivityComponent.this.f126325b.getActivity();
                } else {
                    activity = I18nLoginActivityComponent.this.f126324a;
                }
                C20854a.m53162b().showLoginAndRegisterView(new C20837d().mo44381a(activity).mo44385a(I18nLoginActivityComponent.this.f126328e).mo44386b(I18nLoginActivityComponent.this.f126329f).mo44382a(I18nLoginActivityComponent.this.f126327d).mo44384a((C20840g) new C50308b(I18nLoginActivityComponent.this.f126326c)).mo44383a((C20839f) new C50307a(I18nLoginActivityComponent.this.f126324a)).mo44380a());
            }
        }
    };

    /* renamed from: a */
    public final void mo56367a() {
        this.f126324a = null;
        this.f126325b = null;
        this.f126327d = null;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f126324a = null;
        this.f126325b = null;
        this.f126327d = null;
        this.f126326c = null;
    }

    public /* synthetic */ void run(Object obj) {
        Activity activity;
        Boolean bool = (Boolean) obj;
        if (this.f126324a != null || (this.f126325b != null && this.f126325b.getActivity() != null)) {
            if (this.f126324a == null) {
                activity = this.f126325b.getActivity();
            } else {
                activity = this.f126324a;
            }
            if (bool != null && !bool.booleanValue() && activity != null && !activity.isFinishing() && this.f126330g != null) {
                this.f126330g.removeCallbacks(this.f126331h);
                this.f126330g.post(this.f126331h);
            }
        }
    }

    /* renamed from: a */
    public final void mo48658a(Activity activity, String str, String str2, Bundle bundle, C23505g gVar) {
        if (activity != null && !activity.isFinishing()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            super.mo48658a(activity, str, str2, bundle, gVar);
            this.f126325b = null;
            this.f126324a = activity;
            this.f126327d = bundle;
            this.f126328e = str;
            this.f126329f = str2;
            this.f126326c = gVar;
            this.f126330g.removeCallbacks(this.f126331h);
            this.f126330g.post(this.f126331h);
        }
    }

    /* renamed from: a */
    public final void mo48659a(Fragment fragment, String str, String str2, Bundle bundle, C23505g gVar) {
        if (fragment != null && fragment.getActivity() != null && !fragment.getActivity().isFinishing()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            super.mo48659a(fragment, str, str2, bundle, gVar);
            this.f126325b = fragment;
            this.f126324a = fragment.getActivity();
            this.f126327d = bundle;
            this.f126328e = str;
            this.f126329f = str2;
            this.f126326c = gVar;
            this.f126330g.removeCallbacks(this.f126331h);
            this.f126330g.post(this.f126331h);
        }
    }
}
