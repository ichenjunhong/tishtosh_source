package com.bytedance.android.livesdk;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.android.livesdkapi.p458l.C8833a;

/* renamed from: com.bytedance.android.livesdk.d */
public class C6736d extends C0649f {

    /* renamed from: j */
    public boolean f18412j;

    public void dismiss() {
        dismissAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo11100h() {
        return false;
    }

    public void onDestroyView() {
        this.f18412j = false;
        super.onDestroyView();
    }

    /* renamed from: g */
    public final boolean mo12851g() {
        if (getDialog() == null || !getDialog().isShowing()) {
            return false;
        }
        return true;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f18412j) {
            dismissAllowingStateLoss();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f18412j = false;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C4494aa.m10815a().mo10296c();
        C4642b.m11130a().mo10429c();
        super.onDismiss(dialogInterface);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f18412j = true;
        getDialog().setOnKeyListener(new C6750e(this));
    }

    public int show(C0679r rVar, String str) {
        C4494aa.m10815a().mo10295b();
        C4642b.m11130a().mo10428b();
        C8833a.m17340a((Object) this, "mDismissed", (Object) Boolean.valueOf(false));
        C8833a.m17340a((Object) this, "mShownByMe", (Object) Boolean.valueOf(true));
        rVar.mo2178a((Fragment) this, str);
        C8833a.m17340a((Object) this, "mViewDestroyed", (Object) Boolean.valueOf(false));
        int c = rVar.mo2195c();
        C8833a.m17340a((Object) this, "mBackStackId", (Object) Integer.valueOf(c));
        return c;
    }

    public void showNow(C0654k kVar, String str) {
        C4494aa.m10815a().mo10295b();
        C4642b.m11130a().mo10428b();
        C8833a.m17340a((Object) this, "mDismissed", (Object) Boolean.valueOf(false));
        C8833a.m17340a((Object) this, "mShownByMe", (Object) Boolean.valueOf(true));
        C0679r a = kVar.mo2225a();
        a.mo2178a((Fragment) this, str);
        a.mo2200e();
    }

    public void show(C0654k kVar, String str) {
        C4494aa.m10815a().mo10295b();
        C4642b.m11130a().mo10428b();
        C8833a.m17340a((Object) this, "mDismissed", (Object) Boolean.valueOf(false));
        C8833a.m17340a((Object) this, "mShownByMe", (Object) Boolean.valueOf(true));
        C0679r a = kVar.mo2225a();
        a.mo2178a((Fragment) this, str);
        a.mo2195c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo12850a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (4 != i || 1 != keyEvent.getAction()) {
            return false;
        }
        mo11100h();
        return false;
    }
}
