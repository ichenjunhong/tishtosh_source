package com.p683ss.android.ugc.aweme.live;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.common.utility.C9406f;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32465c;
import com.p683ss.android.ugc.aweme.i18n.language.C33106b;

/* renamed from: com.ss.android.ugc.aweme.live.BaseLiveSdkActivity */
public class BaseLiveSdkActivity extends AmeActivity implements C9406f {

    /* renamed from: a */
    private C32465c f92239a;

    /* renamed from: b */
    private boolean f92240b;

    static {
        Live.getService();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f92239a != null) {
            this.f92239a.mo65733a();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f92239a != null) {
            this.f92239a.mo65739b();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f92239a != null) {
            this.f92239a.mo65741c();
        }
    }

    /* renamed from: a */
    private boolean mo15413a() {
        if (!isViewValid()) {
            return false;
        }
        if (this.f92239a == null) {
            this.f92239a = new C32465c(this);
            this.f92239a.f84544g = this.f92240b;
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context a = C11010c.m22280a();
        if (a != null) {
            C33106b.m76111b(a);
        }
        this.f92240b = false;
    }

    public void showCustomToast(String str) {
        if (mo15413a()) {
            this.f92239a.mo65737a(str);
        }
    }

    public void showCustomLongToast(int i, String str) {
        if (mo15413a()) {
            this.f92239a.mo65734a(i, str);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void showCustomToast(int i, String str, int i2, int i3) {
        if (mo15413a()) {
            this.f92239a.mo65735a(i, str, i2, i3);
        }
    }
}
