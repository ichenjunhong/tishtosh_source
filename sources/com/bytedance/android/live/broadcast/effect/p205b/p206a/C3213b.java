package com.bytedance.android.live.broadcast.effect.p205b.p206a;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.android.live.broadcast.effect.p205b.p206a.C3216c.C3217a;
import com.bytedance.android.live.broadcast.effect.p208d.C3248a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.C6736d;
import com.bytedance.android.livesdk.widget.AdjustPercentBar;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.bytedance.android.live.broadcast.effect.b.a.b */
public final class C3213b extends C6736d {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f9306a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3213b.class), "layoutHeight", "getLayoutHeight()I"))};

    /* renamed from: d */
    public static final C3214a f9307d = new C3214a(null);

    /* renamed from: b */
    public OnDismissListener f9308b;

    /* renamed from: c */
    public boolean f9309c;

    /* renamed from: e */
    private final C52668f f9310e = C52732g.m112285a(new C3215b(this));

    /* renamed from: f */
    private HashMap f9311f;

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.b$a */
    public static final class C3214a {
        private C3214a() {
        }

        public /* synthetic */ C3214a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.b$b */
    static final class C3215b extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C3213b f9312a;

        C3215b(C3213b bVar) {
            this.f9312a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            float f;
            if (this.f9312a.f9309c) {
                f = 220.0f;
            } else {
                f = 238.0f;
            }
            return Integer.valueOf(C3922z.m9899a(f));
        }
    }

    /* renamed from: a */
    private final int m8854a() {
        return ((Number) this.f9310e.getValue()).intValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f9311f != null) {
            this.f9311f.clear();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.z7);
        setCancelable(true);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, m8854a());
            }
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f9308b != null) {
            OnDismissListener onDismissListener = this.f9308b;
            if (onDismissListener == null) {
                C52711k.m112234a();
            }
            onDismissListener.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C52711k.m112236a((Object) onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, m8854a());
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(3);
        }
        return onCreateDialog;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        AdjustPercentBar adjustPercentBar;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        if (this.f9309c) {
            C3217a aVar = C3216c.f9314i;
            C3248a aVar2 = new C3248a(null, null, 0, 0, 15, null);
            C3216c a = C3217a.m8861a(aVar2);
            getChildFragmentManager().mo2225a().mo2175a((int) R.id.cpl, (Fragment) a).mo2200e();
            View view3 = getView();
            if (view3 != null) {
                ViewGroup viewGroup = (ViewGroup) view3.findViewById(R.id.cpm);
                if (viewGroup != null) {
                    viewGroup.addView(a.mo8564c());
                }
            }
            View view4 = getView();
            if (view4 != null) {
                ViewGroup viewGroup2 = (ViewGroup) view4.findViewById(R.id.cpn);
                if (viewGroup2 != null) {
                    viewGroup2.addView(a.mo8563b());
                }
            }
            return;
        }
        View view5 = getView();
        if (view5 != null) {
            view2 = view5.findViewById(R.id.cpm);
        } else {
            view2 = null;
        }
        View view6 = getView();
        if (view6 != null) {
            adjustPercentBar = (AdjustPercentBar) view6.findViewById(R.id.cpn);
        } else {
            adjustPercentBar = null;
        }
        C3248a aVar3 = new C3248a(view2, adjustPercentBar, 0, 0, 12, null);
        getChildFragmentManager().mo2225a().mo2175a((int) R.id.cpl, (Fragment) C3217a.m8861a(aVar3)).mo2200e();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        C52711k.m112240b(layoutInflater, "inflater");
        if (this.f9309c) {
            i = R.layout.ahi;
        } else {
            i = R.layout.ahe;
        }
        return layoutInflater.inflate(i, viewGroup, false);
    }
}
