package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.design.widget.Snackbar.SnackbarLayout;
import android.support.p030v4.view.p041a.C1005b;
import android.support.p030v4.view.p041a.C1005b.C1006a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.utils.fd */
public final class C47881fd {
    /* renamed from: a */
    private static String m103577a(C35471h hVar) {
        String str;
        if (hVar.isMulti) {
            str = C11010c.m22280a().getString(R.string.bas, new Object[]{hVar.contact.getDisplayName()});
        } else {
            str = C11010c.m22280a().getString(R.string.bar, new Object[]{hVar.contact.getDisplayName()});
        }
        if (!MainServiceImpl.createIMainServicebyMonsterPlugin().shouldChangeToHandle("Message")) {
            return str;
        }
        IMContact iMContact = hVar.contact;
        if (!(iMContact instanceof IMUser)) {
            return str;
        }
        if (hVar.isMulti) {
            return C11010c.m22280a().getString(R.string.bas, new Object[]{((IMUser) iMContact).getDisplayId()});
        }
        return C11010c.m22280a().getString(R.string.bar, new Object[]{((IMUser) iMContact).getDisplayId()});
    }

    /* renamed from: a */
    static final /* synthetic */ Object m103576a(Snackbar snackbar, C0013i iVar) throws Exception {
        if (snackbar.mo1232c()) {
            snackbar.dismiss();
        }
        try {
            Class cls = Class.forName("android.support.design.widget.BaseTransientBottomBar$d");
            Field declaredField = cls.getDeclaredField("accessibilityManager");
            declaredField.setAccessible(true);
            if (declaredField.get(snackbar.f1592d) == null || !(declaredField.get(snackbar.f1592d) instanceof AccessibilityManager)) {
                return null;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) declaredField.get(snackbar.f1592d);
            Field declaredField2 = cls.getDeclaredField("touchExplorationStateChangeListener");
            declaredField2.setAccessible(true);
            if (declaredField2.get(snackbar.f1592d) == null || !(declaredField2.get(snackbar.f1592d) instanceof C1006a)) {
                return null;
            }
            C1005b.m2883a(accessibilityManager, (C1006a) declaredField2.get(snackbar.f1592d));
            return null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m103578a(Context context, View view, C35471h hVar) {
        if (context != null && view != null && hVar != null) {
            String a = m103577a(hVar);
            if (!TextUtils.isEmpty(a)) {
                Snackbar a2 = Snackbar.m1373a(view, "", -2);
                SnackbarLayout snackbarLayout = (SnackbarLayout) a2.f1592d;
                snackbarLayout.setPadding(0, 0, 0, 0);
                ((TextView) snackbarLayout.findViewById(R.id.cq2)).setVisibility(4);
                View inflate = LayoutInflater.from(context).inflate(R.layout.b4n, snackbarLayout);
                ((TextView) inflate.findViewById(R.id.dcu)).setText(a);
                ((ImageView) inflate.findViewById(R.id.az1)).setImageResource(R.drawable.cq6);
                inflate.setOnClickListener(new C47882fe(context, hVar, a2));
                C0013i.m12a(500).mo20a((C0011g<TResult, TContinuationResult>) new C47883ff<TResult,TContinuationResult>(a2), C0013i.f25b);
                C0013i.m12a(5000).mo20a((C0011g<TResult, TContinuationResult>) new C47884fg<TResult,TContinuationResult>(a2), C0013i.f25b);
            }
        }
    }
}
