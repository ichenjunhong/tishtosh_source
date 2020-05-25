package com.bytedance.ies.dmt.p664ui.p668d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.bytedance.ies.dmt.ui.d.e */
public final class C10699e {

    /* renamed from: a */
    public static final C10700a f28496a = new C10700a(null);

    /* renamed from: b */
    private Toast f28497b;

    /* renamed from: com.bytedance.ies.dmt.ui.d.e$a */
    public static final class C10700a {
        private C10700a() {
        }

        /* renamed from: a */
        public static C10699e m21571a() {
            return new C10699e();
        }

        public /* synthetic */ C10700a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public static final C10699e m21568b() {
        return C10700a.m21571a();
    }

    /* renamed from: a */
    public final void mo19075a() {
        try {
            Toast toast = this.f28497b;
            if (toast != null) {
                C10701f.m21572a(toast);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final C10699e mo19074a(Context context, CharSequence charSequence, int i) {
        if (context == null) {
            return this;
        }
        this.f28497b = new Toast(context);
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService != null) {
            View inflate = ((LayoutInflater) systemService).inflate(R.layout.l7, null);
            View findViewById = inflate.findViewById(R.id.text);
            if (findViewById != null) {
                ((TextView) findViewById).setText(charSequence);
                Toast toast = this.f28497b;
                if (toast != null) {
                    toast.setView(inflate);
                }
                Toast toast2 = this.f28497b;
                if (toast2 != null) {
                    toast2.setGravity(17, 0, 0);
                }
                return this;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new C52857u("null cannot be cast to non-null type android.view.LayoutInflater");
    }
}
