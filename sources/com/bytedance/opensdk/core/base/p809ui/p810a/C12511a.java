package com.bytedance.opensdk.core.base.p809ui.p810a;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.C0654k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.opensdk.core.base.ui.a.a */
public abstract class C12511a extends C0649f {

    /* renamed from: b */
    public static final C12512a f32853b = new C12512a(null);

    /* renamed from: a */
    private final int f32854a;

    /* renamed from: c */
    private boolean f32855c;

    /* renamed from: d */
    private boolean f32856d;

    /* renamed from: e */
    private HashMap f32857e;

    /* renamed from: com.bytedance.opensdk.core.base.ui.a.a$a */
    public static final class C12512a {
        private C12512a() {
        }

        public /* synthetic */ C12512a(C52707g gVar) {
            this();
        }
    }

    public C12511a() {
        this(false, false, 3, null);
    }

    /* renamed from: a */
    public int mo23560a() {
        return this.f32854a;
    }

    /* renamed from: a */
    public View mo23561a(int i) {
        if (this.f32857e == null) {
            this.f32857e = new HashMap();
        }
        View view = (View) this.f32857e.get(Integer.valueOf(R.id.a5c));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(R.id.a5c);
            this.f32857e.put(Integer.valueOf(R.id.a5c), view);
        }
        return view;
    }

    /* renamed from: a */
    public abstract View mo23562a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* renamed from: b */
    public void mo23563b() {
        if (this.f32857e != null) {
            this.f32857e.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo23563b();
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        dialog.setCancelable(this.f32855c);
        dialog.setCanceledOnTouchOutside(this.f32856d);
        Window window = dialog.getWindow();
        if (window != null) {
            LayoutParams attributes = window.getAttributes();
            attributes.width = -2;
            attributes.height = -2;
            attributes.gravity = 17;
            window.setAttributes(attributes);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f32855c = bundle.getBoolean("riki_", this.f32855c);
            this.f32856d = bundle.getBoolean("riki_", this.f32856d);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C52711k.m112240b(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("riki_", this.f32855c);
        bundle.putBoolean("pudge_", this.f32856d);
    }

    public void show(C0654k kVar, String str) {
        try {
            super.show(kVar, str);
        } catch (Exception unused) {
        }
    }

    private C12511a(boolean z, boolean z2) {
        this.f32855c = z;
        this.f32856d = z2;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        getDialog().requestWindowFeature(1);
        if (mo23560a() != 0) {
            Dialog dialog = getDialog();
            C52711k.m112236a((Object) dialog, "dialog");
            Window window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(mo23560a());
            }
        }
        return mo23562a(layoutInflater, viewGroup);
    }

    public /* synthetic */ C12511a(boolean z, boolean z2, int i, C52707g gVar) {
        this(false, false);
    }
}
