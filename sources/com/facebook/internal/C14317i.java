package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.FragmentActivity;
import com.C2240a;
import com.facebook.C14457k;
import com.facebook.C14533n;
import com.facebook.internal.C14284ac.C14289a;
import com.facebook.internal.C14284ac.C14291c;

/* renamed from: com.facebook.internal.i */
public final class C14317i extends C0649f {

    /* renamed from: a */
    public Dialog f37260a;

    public final void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    public final void onResume() {
        super.onResume();
        if (this.f37260a instanceof C14284ac) {
            ((C14284ac) this.f37260a).mo26485a();
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f37260a == null) {
            mo26535a(null, null);
            this.mShowsDialog = false;
        }
        return this.f37260a;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.f37260a instanceof C14284ac) && isResumed()) {
            ((C14284ac) this.f37260a).mo26485a();
        }
    }

    public final void onCreate(Bundle bundle) {
        C14284ac acVar;
        super.onCreate(bundle);
        if (this.f37260a == null) {
            FragmentActivity activity = getActivity();
            Bundle d = C14353v.m29447d(activity.getIntent());
            if (!d.getBoolean("is_fallback", false)) {
                String string = d.getString("action");
                Bundle bundle2 = d.getBundle("params");
                if (C14277aa.m29276a(string)) {
                    activity.finish();
                    return;
                }
                acVar = new C14289a(activity, string, bundle2).mo26501a(new C14291c() {
                    /* renamed from: a */
                    public final void mo26509a(Bundle bundle, C14457k kVar) {
                        C14317i.this.mo26535a(bundle, kVar);
                    }
                }).mo26502a();
            } else {
                String string2 = d.getString("url");
                if (C14277aa.m29276a(string2)) {
                    activity.finish();
                    return;
                }
                acVar = C14325l.m29378a(activity, string2, C2240a.m6772a("fb%s://bridge/", new Object[]{C14533n.m29777k()}));
                acVar.f37207c = new C14291c() {
                    /* renamed from: a */
                    public final void mo26509a(Bundle bundle, C14457k kVar) {
                        FragmentActivity activity = C14317i.this.getActivity();
                        Intent intent = new Intent();
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        intent.putExtras(bundle);
                        activity.setResult(-1, intent);
                        activity.finish();
                    }
                };
            }
            this.f37260a = acVar;
        }
    }

    /* renamed from: a */
    public final void mo26535a(Bundle bundle, C14457k kVar) {
        int i;
        FragmentActivity activity = getActivity();
        Intent a = C14353v.m29433a(activity.getIntent(), bundle, kVar);
        if (kVar == null) {
            i = -1;
        } else {
            i = 0;
        }
        activity.setResult(i, a);
        activity.finish();
    }
}
