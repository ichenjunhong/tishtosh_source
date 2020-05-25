package com.p683ss.android.ugc.aweme.adaptation;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptActivity */
public abstract class BaseScreenAdaptActivity extends AmeActivity {

    /* renamed from: b */
    private boolean f60452b = true;

    /* renamed from: c */
    private boolean f60453c = true;

    /* renamed from: d */
    private View f60454d;

    /* renamed from: e */
    private int f60455e;

    /* renamed from: f */
    private OnLayoutChangeListener f60456f = new C22463g(this);

    /* renamed from: f_ */
    public boolean f60457f_ = true;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo46737a(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo46739a(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo46740b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo46741b(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo46742c() {
        return true;
    }

    public final void cb_() {
        mo46740b();
        mo78592d();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f60454d != null) {
            this.f60454d.removeOnLayoutChangeListener(this.f60456f);
            this.f60456f = null;
        }
    }

    /* renamed from: d */
    private void mo78592d() {
        switch (C22452a.m55492a()) {
            case 1:
            case 4:
                mo46739a(true);
                mo46741b(true);
                return;
            case 2:
            case 5:
                mo46739a(false);
                mo46741b(true);
                return;
            case 3:
            case 6:
                mo46739a(true);
                mo46741b(false);
                return;
            default:
                mo46739a(false);
                mo46741b(false);
                return;
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f60453c) {
            this.f60453c = false;
            this.f60455e = C43303dy.m94973d(this);
            if (this.f60455e != C22452a.m55495b()) {
                C22452a.m55493a(this.f60455e);
            }
            cb_();
            if (this.f60457f_) {
                this.f60454d.addOnLayoutChangeListener(this.f60456f);
                return;
            }
            this.f60454d.removeOnLayoutChangeListener(this.f60456f);
        }
    }

    public void onStart() {
        super.onStart();
        if (this.f60452b) {
            this.f60452b = false;
            getWindow().clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            C43303dy.m94968a((Activity) this);
            if (VERSION.SDK_INT >= 21) {
                getWindow().setNavigationBarColor(-16777216);
            }
            getWindow().getDecorView().setBackgroundColor(-16777216);
            mo46737a(C43303dy.m94972c(this), C22452a.m55497c());
            this.f60454d = findViewById(16908290);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f60457f_ = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo46738a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 != i8 && mo46742c()) {
            int d = C43303dy.m94973d(this);
            if (this.f60455e != d) {
                this.f60455e = d;
                C22452a.m55493a(d);
                cb_();
            }
        }
    }
}
