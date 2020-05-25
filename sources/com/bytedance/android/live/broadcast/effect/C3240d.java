package com.bytedance.android.live.broadcast.effect;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.effect.p204a.C3198a.C3199a;
import com.bytedance.android.live.broadcast.effect.p205b.C3204a;
import com.bytedance.android.live.broadcast.effect.p205b.C3234b;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.C6736d;
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

/* renamed from: com.bytedance.android.live.broadcast.effect.d */
public final class C3240d extends C6736d {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f9366a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3240d.class), "beautyFragment", "getBeautyFragment()Lcom/bytedance/android/live/broadcast/effect/beauty/PreViewBeautyFragment;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3240d.class), "filterFragment", "getFilterFragment()Lcom/bytedance/android/live/broadcast/effect/beauty/PreViewFilterFragment;"))};

    /* renamed from: d */
    public static final C3242b f9367d = new C3242b(null);

    /* renamed from: b */
    public OnDismissListener f9368b;

    /* renamed from: c */
    public C3199a f9369c;

    /* renamed from: e */
    private final C52668f f9370e = C52732g.m112285a(C3243c.f9375a);

    /* renamed from: f */
    private final C52668f f9371f = C52732g.m112285a(new C3244d(this));

    /* renamed from: g */
    private C3241a f9372g;

    /* renamed from: h */
    private HashMap f9373h;

    /* renamed from: com.bytedance.android.live.broadcast.effect.d$a */
    public enum C3241a {
        BEAUTY,
        FILTER
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.d$b */
    public static final class C3242b {
        private C3242b() {
        }

        public /* synthetic */ C3242b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.d$c */
    static final class C3243c extends C52712l implements C52670a<C3204a> {

        /* renamed from: a */
        public static final C3243c f9375a = new C3243c();

        C3243c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C3204a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.d$d */
    static final class C3244d extends C52712l implements C52670a<C3234b> {

        /* renamed from: a */
        final /* synthetic */ C3240d f9376a;

        C3244d(C3240d dVar) {
            this.f9376a = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C3199a r0 = new C3199a(this) {

                /* renamed from: a */
                final /* synthetic */ C3244d f9377a;

                {
                    this.f9377a = r1;
                }

                /* renamed from: a */
                public final void mo8488a(int i) {
                    this.f9377a.f9376a.mo8576b();
                    C3199a aVar = this.f9377a.f9376a.f9369c;
                    if (aVar != null) {
                        aVar.mo8488a(i);
                    }
                }
            };
            C52711k.m112240b(r0, "onItemClickListener");
            C3234b bVar = new C3234b();
            bVar.f9347a = r0;
            return bVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.d$e */
    static final class C3246e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3240d f9378a;

        C3246e(C3240d dVar) {
            this.f9378a = dVar;
        }

        public final void onClick(View view) {
            this.f9378a.mo8575a(C3241a.BEAUTY);
            this.f9378a.mo8574a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.d$f */
    static final class C3247f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3240d f9379a;

        C3247f(C3240d dVar) {
            this.f9379a = dVar;
        }

        public final void onClick(View view) {
            this.f9379a.mo8575a(C3241a.FILTER);
            this.f9379a.mo8574a();
        }
    }

    /* renamed from: a */
    private View m8897a(int i) {
        if (this.f9373h == null) {
            this.f9373h = new HashMap();
        }
        View view = (View) this.f9373h.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f9373h.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: c */
    private final C3204a m8898c() {
        return (C3204a) this.f9370e.getValue();
    }

    /* renamed from: d */
    private final C3234b m8899d() {
        return (C3234b) this.f9371f.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f9373h != null) {
            this.f9373h.clear();
        }
    }

    /* renamed from: b */
    public final void mo8576b() {
        if (C3266p.m8943a().mo8636d()) {
            View a = m8897a((int) R.id.e8p);
            C52711k.m112236a((Object) a, "filter_dot");
            a.setVisibility(0);
            return;
        }
        View a2 = m8897a((int) R.id.e8p);
        C52711k.m112236a((Object) a2, "filter_dot");
        a2.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo8574a() {
        C3241a aVar = this.f9372g;
        if (aVar != null) {
            switch (C3250e.f9387b[aVar.ordinal()]) {
                case 1:
                    TextView textView = (TextView) m8897a((int) R.id.f1j);
                    C52711k.m112236a((Object) textView, "tv_beauty");
                    textView.setAlpha(1.0f);
                    View a = m8897a((int) R.id.edz);
                    C52711k.m112236a((Object) a, "iv_beauty_indicator");
                    a.setVisibility(0);
                    TextView textView2 = (TextView) m8897a((int) R.id.d_b);
                    C52711k.m112236a((Object) textView2, "tv_filter");
                    textView2.setAlpha(0.5f);
                    View a2 = m8897a((int) R.id.eeu);
                    C52711k.m112236a((Object) a2, "iv_filter_indicator");
                    a2.setVisibility(8);
                    return;
                case 2:
                    TextView textView3 = (TextView) m8897a((int) R.id.f1j);
                    C52711k.m112236a((Object) textView3, "tv_beauty");
                    textView3.setAlpha(0.5f);
                    View a3 = m8897a((int) R.id.edz);
                    C52711k.m112236a((Object) a3, "iv_beauty_indicator");
                    a3.setVisibility(8);
                    TextView textView4 = (TextView) m8897a((int) R.id.d_b);
                    C52711k.m112236a((Object) textView4, "tv_filter");
                    textView4.setAlpha(1.0f);
                    View a4 = m8897a((int) R.id.eeu);
                    C52711k.m112236a((Object) a4, "iv_filter_indicator");
                    a4.setVisibility(0);
                    break;
            }
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        OnDismissListener onDismissListener = this.f9368b;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, C3922z.m9899a(222.0f));
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.z7);
        setCancelable(true);
        C3266p.m8943a().mo8634c();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C52711k.m112236a((Object) onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(3);
        }
        return onCreateDialog;
    }

    /* renamed from: a */
    public final void mo8575a(C3241a aVar) {
        if (this.f9372g != aVar) {
            C0679r a = getChildFragmentManager().mo2225a();
            C52711k.m112236a((Object) a, "childFragmentManager.beginTransaction()");
            switch (C3250e.f9386a[aVar.ordinal()]) {
                case 1:
                    Fragment a2 = getChildFragmentManager().mo2224a("PreViewFilterFragment");
                    if (a2 != null) {
                        a.mo2193b(a2);
                    }
                    Fragment a3 = getChildFragmentManager().mo2224a("PreViewBeautyFragment");
                    if (a3 != null) {
                        a.mo2196c(a3);
                        break;
                    } else {
                        a.mo2176a(R.id.zr, m8898c(), "PreViewBeautyFragment");
                        break;
                    }
                case 2:
                    Fragment a4 = getChildFragmentManager().mo2224a("PreViewBeautyFragment");
                    if (a4 != null) {
                        a.mo2193b(a4);
                    }
                    Fragment a5 = getChildFragmentManager().mo2224a("PreViewFilterFragment");
                    if (a5 != null) {
                        a.mo2196c(a5);
                        break;
                    } else {
                        a.mo2176a(R.id.zr, m8899d(), "PreViewFilterFragment");
                        break;
                    }
            }
            a.mo2200e();
            this.f9372g = aVar;
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        ((ConstraintLayout) m8897a((int) R.id.e06)).setOnClickListener(new C3246e(this));
        ((ConstraintLayout) m8897a((int) R.id.e09)).setOnClickListener(new C3247f(this));
        C3241a aVar = this.f9372g;
        this.f9372g = null;
        if (aVar == null) {
            aVar = C3241a.BEAUTY;
        }
        mo8575a(aVar);
        mo8574a();
        mo8576b();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bvz, viewGroup, false);
    }
}
