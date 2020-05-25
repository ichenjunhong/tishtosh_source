package com.p683ss.android.ugc.aweme.p1485by;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.bridgeservice.C23981f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.main.TabChangeManager;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import org.greenrobot.eventbus.C53771m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.by.d */
public final class C24465d extends C23526a implements OnClickListener {

    /* renamed from: b */
    public static final C24466a f64845b = new C24466a(null);

    /* renamed from: a */
    public boolean f64846a = true;

    /* renamed from: c */
    private HashMap f64847c;

    /* renamed from: com.ss.android.ugc.aweme.by.d$a */
    public static final class C24466a {
        private C24466a() {
        }

        public /* synthetic */ C24466a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m59867a(String str, String str2) {
            C52711k.m112240b(str, "enterFrom");
            C52711k.m112240b(str2, "enterMethod");
            C26890h.m65011a("enter_signup_login_homepage", C23089d.m56640a().mo47829a("enter_from", str).mo47829a("enter_method", str2).f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.by.d$b */
    static final class C24467b implements C23505g {

        /* renamed from: a */
        final /* synthetic */ C24465d f64848a;

        C24467b(C24465d dVar) {
            this.f64848a = dVar;
        }

        /* renamed from: a */
        public final void mo46280a(Bundle bundle) {
        }

        /* renamed from: a */
        public final void mo46279a() {
            FragmentActivity activity = this.f64848a.getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            TabChangeManager.m82396a(activity).mo75614a("HOME");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.by.d$c */
    static final class C24468c implements OnTouchListener {

        /* renamed from: a */
        public static final C24468c f64849a = new C24468c();

        C24468c() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: a */
    private View m59863a(int i) {
        if (this.f64847c == null) {
            this.f64847c = new HashMap();
        }
        View view = (View) this.f64847c.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f64847c.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    private String m59864a() {
        if (this.f64846a) {
            return "message";
        }
        return "personal_homepage";
    }

    /* renamed from: e */
    private String m59865e() {
        if (this.f64846a) {
            return "click_message";
        }
        return "click_mine";
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f64847c != null) {
            this.f64847c.clear();
        }
    }

    @C53771m
    public final void onEvent(C24462b bVar) {
        C52711k.m112240b(bVar, "ev");
        if (!this.f64846a) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            TabChangeManager.m82396a(activity).mo75614a("HOME");
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view != null && !C32800a.m75679a(view)) {
            int id = view.getId();
            if (id == R.id.p9) {
                C27965f.m66726a((Fragment) this, m59864a(), m59865e(), (C23505g) new C24467b(this));
                C24466a.m59867a(m59864a(), m59865e());
                return;
            }
            if (id == R.id.cm4) {
                SmartRouter.buildRoute((Context) getActivity(), "aweme://setting").open();
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        view.setOnTouchListener(C24468c.f64849a);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("tab");
        } else {
            str = null;
        }
        this.f64846a = TextUtils.equals(str, "UNLOGIN_NOTIFICATION");
        C52711k.m112240b(view, "view");
        if (VERSION.SDK_INT >= 19) {
            View a = m59863a(R.id.aka);
            C52711k.m112236a((Object) a, "gap_status_bar");
            LayoutParams layoutParams = a.getLayoutParams();
            View a2 = m59863a(R.id.aka);
            C52711k.m112236a((Object) a2, "gap_status_bar");
            layoutParams.height = C11065a.m22390a(a2.getContext());
        } else {
            View a3 = m59863a(R.id.aka);
            C52711k.m112236a((Object) a3, "gap_status_bar");
            a3.setVisibility(8);
        }
        if (this.f64846a) {
            DmtTextView dmtTextView = (DmtTextView) m59863a(R.id.dhb);
            C52711k.m112236a((Object) dmtTextView, "tv_title");
            dmtTextView.setText(view.getContext().getText(R.string.aep));
            DmtTextView dmtTextView2 = (DmtTextView) m59863a(R.id.aos);
            C52711k.m112236a((Object) dmtTextView2, "hint");
            dmtTextView2.setText(view.getContext().getText(R.string.aeo));
            ((ImageView) m59863a(R.id.aro)).setImageResource(R.drawable.d5m);
        } else {
            DmtTextView dmtTextView3 = (DmtTextView) m59863a(R.id.dhb);
            C52711k.m112236a((Object) dmtTextView3, "tv_title");
            dmtTextView3.setText(view.getContext().getText(R.string.czx));
            DmtTextView dmtTextView4 = (DmtTextView) m59863a(R.id.aos);
            C52711k.m112236a((Object) dmtTextView4, "hint");
            dmtTextView4.setText(view.getContext().getText(R.string.czw));
            ((ImageView) m59863a(R.id.aro)).setImageResource(R.drawable.cqc);
            ImageView imageView = (ImageView) m59863a(R.id.cm4);
            C23981f businessBridgeService = BusinessComponentServiceUtils.getBusinessBridgeService();
            C52711k.m112236a((Object) businessBridgeService, "BusinessComponentService…etBusinessBridgeService()");
            Integer c = businessBridgeService.mo49725c();
            C52711k.m112236a((Object) c, "BusinessComponentService…e().unloginProfileMoreImg");
            imageView.setImageResource(c.intValue());
            ImageView imageView2 = (ImageView) m59863a(R.id.cm4);
            C52711k.m112236a((Object) imageView2, "setting_btn");
            imageView2.setVisibility(0);
        }
        OnClickListener onClickListener = this;
        ((DmtTextView) m59863a(R.id.p9)).setOnClickListener(onClickListener);
        ((ImageView) m59863a(R.id.cm4)).setOnClickListener(onClickListener);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.b47, viewGroup, false);
    }
}
