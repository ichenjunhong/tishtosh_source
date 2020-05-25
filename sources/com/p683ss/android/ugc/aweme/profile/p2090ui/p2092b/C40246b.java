package com.p683ss.android.ugc.aweme.profile.p2090ui.p2092b;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.EnterpriseTransformLayout;
import com.p683ss.android.ugc.aweme.profile.p2090ui.I18nBaseUserProfileFragment;
import com.p683ss.android.ugc.aweme.translation.p2373ui.TranslationStatusView;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.b.b */
public final class C40246b extends I18nBaseUserProfileFragment {

    /* renamed from: aG */
    private View f102784aG;

    /* renamed from: aH */
    private View f102785aH;

    /* renamed from: aI */
    private HashMap f102786aI;

    /* renamed from: K */
    public final void mo82484K() {
        if (this.f102786aI != null) {
            this.f102786aI.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo82484K();
    }

    /* renamed from: o */
    public final void mo82456o() {
        super.mo82456o();
        TranslationStatusView translationStatusView = this.f102721V;
        if (translationStatusView != null) {
            translationStatusView.mo94641a();
        }
    }

    /* renamed from: d */
    public final void mo81903d(User user) {
        super.mo81903d(user);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f102715P;
        if (enterpriseTransformLayout != null) {
            enterpriseTransformLayout.mo82121a();
        }
    }

    /* renamed from: m */
    public final void mo82209m(int i) {
        super.mo82209m(i);
        if (i == 0) {
            View view = this.f102785aH;
            if (view != null) {
                view.setBackgroundResource(R.drawable.b88);
            }
        } else if (i == 2) {
            View view2 = this.f102785aH;
            if (view2 != null) {
                view2.setBackgroundResource(R.drawable.dn2);
            }
        }
    }

    /* renamed from: b */
    public final void mo81896b(String str) {
        super.mo81896b(str);
        if (this.f103081w != null) {
            Context context = getContext();
            User user = this.f103081w;
            C52711k.m112236a((Object) user, "mUser");
            String customVerify = user.getCustomVerify();
            User user2 = this.f103081w;
            C52711k.m112236a((Object) user2, "mUser");
            C47916gh.m103675a(context, customVerify, user2.getEnterpriseVerifyReason(), this.f103076r);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        this.f102784aG = view.findViewById(R.id.f09);
        this.f102785aH = view.findViewById(R.id.ekb);
    }
}
