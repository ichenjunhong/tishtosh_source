package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.api.UsedPhoneApi;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.eg */
public final class C40373eg extends C23526a {

    /* renamed from: a */
    private HashMap f103040a;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.eg$a */
    static final /* synthetic */ class C40374a extends C52710j implements C52671b<View, C52860x> {
        C40374a(C40373eg egVar) {
            super(1, egVar);
        }

        public final String getName() {
            return "onClick";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C40373eg.class);
        }

        public final String getSignature() {
            return "onClick(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            View view = (View) obj;
            C52711k.m112240b(view, "p1");
            ((C40373eg) this.receiver).mo82612a(view);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.eg$b */
    static final /* synthetic */ class C40375b extends C52710j implements C52671b<View, C52860x> {
        C40375b(C40373eg egVar) {
            super(1, egVar);
        }

        public final String getName() {
            return "onClick";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C40373eg.class);
        }

        public final String getSignature() {
            return "onClick(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            View view = (View) obj;
            C52711k.m112240b(view, "p1");
            ((C40373eg) this.receiver).mo82612a(view);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.eg$c */
    static final /* synthetic */ class C40376c extends C52710j implements C52671b<View, C52860x> {
        C40376c(C40373eg egVar) {
            super(1, egVar);
        }

        public final String getName() {
            return "onClick";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C40373eg.class);
        }

        public final String getSignature() {
            return "onClick(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            View view = (View) obj;
            C52711k.m112240b(view, "p1");
            ((C40373eg) this.receiver).mo82612a(view);
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    private View m89729a(int i) {
        if (this.f103040a == null) {
            this.f103040a = new HashMap();
        }
        View view = (View) this.f103040a.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f103040a.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f103040a != null) {
            this.f103040a.clear();
        }
    }

    /* renamed from: a */
    public final void mo82612a(View view) {
        int id = view.getId();
        if (id == R.id.ik) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        } else if (id == R.id.yn) {
            ((UsedPhoneApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(UsedPhoneApi.class)).usedPhoneConfirm(true).mo6158b();
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.onBackPressed();
            }
            C26890h.m65011a("secondhand_keep_click", C23089d.m56640a().mo47829a("enter_from", "secondhand_confirm_page").f61491a);
        } else if (id == R.id.q7) {
            ((UsedPhoneApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(UsedPhoneApi.class)).usedPhoneConfirm(false).mo6158b();
            C20854a.m53161a().bindService().modifyMobile(getActivity(), "", null, null);
            FragmentActivity activity3 = getActivity();
            if (activity3 != null) {
                activity3.onBackPressed();
            }
            C26890h.m65011a("secondhand_change_click", C23089d.m56640a().mo47829a("enter_from", "secondhand_confirm_page").f61491a);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        User curUser = g.getCurUser();
        C52711k.m112236a((Object) curUser, "AccountProxyService.userService().curUser");
        String bindPhone = curUser.getBindPhone();
        C52711k.m112236a((Object) bindPhone, "phoneNumber");
        if (C52830p.m112411b(bindPhone, "+", false, 2, null)) {
            CommonItemView commonItemView = (CommonItemView) m89729a((int) R.id.e3y);
            C52711k.m112236a((Object) commonItemView, "country_or_region");
            commonItemView.setVisibility(8);
        } else {
            CommonItemView commonItemView2 = (CommonItemView) m89729a((int) R.id.e3y);
            C52711k.m112236a((Object) commonItemView2, "country_or_region");
            commonItemView2.setVisibility(0);
            CommonItemView commonItemView3 = (CommonItemView) m89729a((int) R.id.e3y);
            StringBuilder sb = new StringBuilder();
            sb.append(getString(R.string.h4r));
            sb.append('/');
            sb.append(getString(R.string.h4m));
            commonItemView3.setLeftText(sb.toString());
        }
        ((CommonItemView) m89729a((int) R.id.eol)).setRightText(bindPhone);
        View findViewById = view.findViewById(R.id.ik);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C40377eh(new C40374a(this)));
        }
        C40373eg egVar = this;
        ((DmtTextView) m89729a((int) R.id.yn)).setOnClickListener(new C40377eh(new C40375b(egVar)));
        ((DmtTextView) m89729a((int) R.id.q7)).setOnClickListener(new C40377eh(new C40376c(egVar)));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.bp3, viewGroup, false);
        if (inflate == null) {
            C52711k.m112234a();
        }
        return inflate;
    }
}
