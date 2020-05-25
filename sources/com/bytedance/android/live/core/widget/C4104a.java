package com.bytedance.android.live.core.widget;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.android.live.C2940a;
import com.bytedance.android.livesdk.C4494aa;
import com.bytedance.common.utility.p522b.C9379e;
import java.util.Iterator;

/* renamed from: com.bytedance.android.live.core.widget.a */
public class C4104a extends C2940a {

    /* renamed from: a */
    public boolean f11293a;

    /* renamed from: b */
    public boolean f11294b;

    /* renamed from: c */
    public boolean f11295c;

    /* renamed from: d */
    public OnDismissListener f11296d;

    /* renamed from: e */
    private C9379e<Object> f11297e = new C9379e<>();

    public void onDestroyView() {
        super.onDestroyView();
        this.f11294b = false;
    }

    public void onPause() {
        super.onPause();
        if (!this.f11297e.mo17007b()) {
            Iterator it = this.f11297e.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.f11293a = true;
        if (!this.f11297e.mo17007b()) {
            Iterator it = this.f11297e.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void onStop() {
        super.onStop();
        this.f11293a = false;
        if (!this.f11297e.mo17007b()) {
            Iterator it = this.f11297e.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo9441a() {
        if (getDialog() == null || !getDialog().isShowing()) {
            return false;
        }
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f11294b = false;
        this.f11295c = true;
        if (!this.f11297e.mo17007b()) {
            Iterator it = this.f11297e.iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.f11297e.mo17004a();
        }
        C4494aa.m10815a().mo10296c();
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        try {
            dismiss();
        } catch (IllegalStateException unused) {
            dismissAllowingStateLoss();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f11296d != null) {
            this.f11296d.onDismiss(dialogInterface);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11293a = false;
        this.f11294b = false;
        this.f11295c = false;
        C4494aa.m10815a().mo10295b();
    }

    /* renamed from: a */
    public static void m10232a(FragmentActivity fragmentActivity, C0649f fVar) {
        m10233a(fragmentActivity, fVar, fVar.getClass().getCanonicalName());
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f11294b = true;
        getDialog().setOnKeyListener(new C4105b(this));
    }

    /* renamed from: a */
    public static void m10233a(FragmentActivity fragmentActivity, C0649f fVar, String str) {
        if (fragmentActivity != null && fVar != null) {
            fVar.show(fragmentActivity.getSupportFragmentManager(), str);
        }
    }
}
