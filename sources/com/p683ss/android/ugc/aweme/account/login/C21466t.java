package com.p683ss.android.ugc.aweme.account.login;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.t */
public final class C21466t extends C23526a {

    /* renamed from: a */
    public C21357j f58239a;

    /* renamed from: b */
    private HashMap f58240b;

    public final void onDestroyView() {
        C21357j jVar = this.f58239a;
        if (jVar != null) {
            Dialog dialog = jVar.f58001d;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
        super.onDestroyView();
        if (this.f58240b != null) {
            this.f58240b.clear();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) activity, "activity!!");
        Activity activity2 = activity;
        Bundle arguments = getArguments();
        if (arguments == null) {
            C52711k.m112234a();
        }
        Bundle bundle2 = arguments.getBundle("sign_up_data");
        Bundle arguments2 = getArguments();
        if (arguments2 == null) {
            C52711k.m112234a();
        }
        this.f58239a = new C21357j(activity2, view, bundle2, arguments2.getBoolean("view_type"));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.az8, viewGroup, false);
    }
}
