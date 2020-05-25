package com.p683ss.android.sdk.activity;

import android.content.res.Resources;
import android.os.Bundle;
import com.bytedance.common.utility.C9406f;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p683ss.android.sdk.C19715a;
import com.p683ss.android.ugc.aweme.base.activity.C23424c;
import com.p683ss.android.ugc.aweme.base.p1418i.C23548d;

/* renamed from: com.ss.android.sdk.activity.SSActivity */
public class SSActivity extends AbsActivity implements C9406f {

    /* renamed from: a */
    private C19715a f54326a;

    /* renamed from: b */
    private boolean f54327b;

    /* renamed from: c */
    private Resources f54328c;

    /* renamed from: d */
    private int f54329d = -1;

    /* renamed from: e */
    private int f54330e = -1;

    /* renamed from: k */
    protected int f54331k;

    /* renamed from: l */
    public boolean f54332l = true;

    public void overridePendingTransition(int i, int i2) {
    }

    public void onStart() {
        super.onStart();
        this.f54332l = false;
    }

    public void finish() {
        super.finish();
        C23424c.m57557b(this, this.f54331k);
    }

    public void onResume() {
        this.f54332l = true;
        super.onResume();
        if (this.f54326a != null) {
            this.f54326a.f54280f = false;
        }
    }

    /* renamed from: a */
    private void mo47309a() {
        if (this.f54326a == null) {
            this.f54326a = new C19715a(this);
            this.f54326a.mo41117a(this.f54327b);
        }
    }

    public Resources getResources() {
        if (!C23548d.m57745a(this, this.f54332l)) {
            return super.getResources();
        }
        if (this.f54328c == null) {
            this.f54328c = new C23548d(super.getResources().getAssets(), super.getResources().getDisplayMetrics(), super.getResources().getConfiguration());
        }
        return this.f54328c;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f54326a != null) {
            C19715a aVar = this.f54326a;
            if (!aVar.f54279e && !aVar.f54280f) {
                aVar.f54282h.removeCallbacks(aVar.f54283i);
                aVar.mo41115a();
                aVar.f54279e = true;
            }
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f54326a != null) {
            C19715a aVar = this.f54326a;
            if (!aVar.f54279e && !aVar.f54280f) {
                aVar.f54282h.removeCallbacks(aVar.f54283i);
                aVar.mo41115a();
                aVar.f54280f = true;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f54327b = false;
        C23424c.m57556a(this, this.f54331k);
    }

    public void showCustomToast(String str) {
        if (isViewValid()) {
            mo47309a();
            this.f54326a.mo41116a(null, 0, 0, str, 2000, 48);
        }
    }

    /* renamed from: a */
    public void mo41130a(int i, int i2) {
        super.overridePendingTransition(i, i2);
    }

    public void showCustomLongToast(int i, String str) {
        if (isViewValid()) {
            mo47309a();
            this.f54326a.mo41116a(null, i, 0, str, 3500, 17);
        }
    }

    public void showCustomToast(int i, String str, int i2, int i3) {
        if (isViewValid()) {
            mo47309a();
            this.f54326a.mo41116a(null, i, 0, str, i2, i3);
        }
    }
}
