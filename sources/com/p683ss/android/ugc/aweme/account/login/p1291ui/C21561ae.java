package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.mobilelib.present.CommonPresent;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.C21055ac;
import com.p683ss.android.ugc.aweme.account.login.C21459s;
import com.p683ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.p683ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21091a;
import com.p683ss.android.ugc.aweme.account.loginsetting.C22047d.C22048a;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.views.AutoRTLImageView;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.ae */
public final class C21561ae extends C21542a<Object> implements C21055ac, C21091a {

    /* renamed from: a */
    ThirdPartyLoginView f58494a;

    /* renamed from: l */
    boolean f58495l = true;

    /* renamed from: m */
    public boolean f58496m = true;

    /* renamed from: n */
    private HashMap f58497n;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.ae$a */
    static final class C21562a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21561ae f58498a;

        /* renamed from: b */
        final /* synthetic */ TPLoginMethod f58499b;

        C21562a(C21561ae aeVar, TPLoginMethod tPLoginMethod) {
            this.f58498a = aeVar;
            this.f58499b = tPLoginMethod;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f58499b.getPlatform();
            Activity activity = this.f58498a.getActivity();
            new C22048a(this) {

                /* renamed from: a */
                final /* synthetic */ C21562a f58500a;

                {
                    this.f58500a = r1;
                }

                /* renamed from: a */
                public final void mo45830a() {
                    C21561ae aeVar = this.f58500a.f58498a;
                    TPLoginMethod tPLoginMethod = this.f58500a.f58499b;
                    aeVar.f58495l = false;
                    if (aeVar.f58494a != null) {
                        tPLoginMethod.getPlatform();
                    }
                    Intent intent = new Intent(aeVar.getContext(), AuthorizeActivity.class);
                    Bundle arguments = aeVar.getArguments();
                    if (arguments != null) {
                        intent.putExtras(arguments);
                    }
                    intent.putExtra("platform", tPLoginMethod.getPlatform());
                    intent.putExtra("is_login", true);
                    aeVar.startActivityForResult(intent, 1001);
                }
            }.mo45830a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.ae$b */
    static final class C21564b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21561ae f58501a;

        C21564b(C21561ae aeVar) {
            this.f58501a = aeVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26890h.m65011a("switch_login_account", new C20856a().mo44776a("enter_method", this.f58501a.f58455e).mo44776a("enter_from", this.f58501a.f58454d).f56798a);
            this.f58501a.f58496m = false;
            FragmentActivity activity = this.f58501a.getActivity();
            if (activity != null) {
                activity.finish();
            }
            C23826bi.m58470k().retryLogin(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.ae$c */
    static final class C21565c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21561ae f58502a;

        C21565c(C21561ae aeVar) {
            this.f58502a = aeVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f58502a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: a */
    private View m54242a(int i) {
        if (this.f58497n == null) {
            this.f58497n = new HashMap();
        }
        View view = (View) this.f58497n.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f58497n.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final boolean aj_() {
        return false;
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ CommonPresent mo45812g() {
        return null;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f58497n != null) {
            this.f58497n.clear();
        }
    }

    public final boolean ai_() {
        int i;
        if (this.f58495l && !C23826bi.m58466g()) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                i = arguments.getInt("bundle_flow_type", C21459s.f58206p);
            } else {
                i = C21459s.f58206p;
            }
            if (i == C21459s.f58210t) {
                return true;
            }
        }
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        TPLoginMethod tPLoginMethod;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        this.f58494a = new ThirdPartyLoginView(getContext());
        Bundle arguments = getArguments();
        if (arguments != null) {
            tPLoginMethod = (TPLoginMethod) arguments.getParcelable("bundle_login_method");
        } else {
            tPLoginMethod = null;
        }
        if (tPLoginMethod == null) {
            C52711k.m112234a();
        }
        C23515d.m57677a((RemoteImageView) (AvatarImageView) m54242a(R.id.hi), tPLoginMethod.getUserInfo().getAvatarUrl());
        DmtTextView dmtTextView = (DmtTextView) m54242a(R.id.dm2);
        C52711k.m112236a((Object) dmtTextView, "userName");
        dmtTextView.setText(tPLoginMethod.getUserInfo().getUserName());
        ((DmtTextView) m54242a(R.id.biz)).setOnClickListener(new C21562a(this, tPLoginMethod));
        ((DmtTextView) m54242a(R.id.cvx)).setOnClickListener(new C21564b(this));
        ((AutoRTLImageView) m54242a(R.id.ue)).setOnClickListener(new C21565c(this));
        ThirdPartyLoginView thirdPartyLoginView = this.f58494a;
        if (thirdPartyLoginView != null) {
            thirdPartyLoginView.setEventType(this.f58454d);
        }
        ThirdPartyLoginView thirdPartyLoginView2 = this.f58494a;
        if (thirdPartyLoginView2 != null) {
            thirdPartyLoginView2.setPosition(this.f58455e);
        }
        ThirdPartyLoginView thirdPartyLoginView3 = this.f58494a;
        if (thirdPartyLoginView3 != null) {
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                arguments2 = new Bundle();
            }
            thirdPartyLoginView3.setBundle(arguments2);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.ayz, viewGroup, false);
    }
}
