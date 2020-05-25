package com.p683ss.android.ugc.aweme.followrequest.p1771a;

import android.app.Activity;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.AppCompatTextView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.followrequest.C32370b;
import com.p683ss.android.ugc.aweme.followrequest.p1771a.C32365c.C32366a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.followrequest.a.a */
public final class C32363a extends C26840g<User> implements C32366a {

    /* renamed from: b */
    private static final int f84240b = ((int) C9432q.m18687b(C11010c.m22280a(), 6.0f));

    /* renamed from: a */
    private C32370b f84241a;

    public C32363a(C32370b bVar) {
        this.f84241a = bVar;
    }

    /* renamed from: a_ */
    public final C1352v mo49730a_(ViewGroup viewGroup) {
        int c = C0726c.m2098c(viewGroup.getContext(), R.color.a1a);
        this.f70682s = c;
        C1352v a_ = super.mo49730a_(viewGroup);
        AppCompatTextView appCompatTextView = new AppCompatTextView(viewGroup.getContext());
        appCompatTextView.setGravity(17);
        appCompatTextView.setTextColor(c);
        appCompatTextView.setTextSize(13.0f);
        appCompatTextView.setText(R.string.bx6);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(viewGroup.getContext());
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setTextColor(c);
        appCompatTextView2.setTextSize(13.0f);
        appCompatTextView2.setText(C32364b.dle);
        DmtStatusView dmtStatusView = (DmtStatusView) a_.itemView;
        dmtStatusView.setBuilder(dmtStatusView.mo19207c().mo19231b((View) appCompatTextView2));
        return a_;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        return new C32365c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ul, viewGroup, false), (Activity) this.f84241a, this);
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        String str;
        C32365c cVar = (C32365c) vVar;
        User user = (User) this.f70670n.get(i);
        if (user != null) {
            cVar.f84243b = user;
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            cVar.f84244c.setUserData(userVerify);
            cVar.f84245d.setText(cVar.f84243b.getNickname());
            cVar.f84244c.mo48964b();
            C47916gh.m103675a(cVar.f84242a, cVar.f84243b.getCustomVerify(), cVar.f84243b.getEnterpriseVerifyReason(), cVar.f84245d);
            TextView textView = cVar.f84246e;
            StringBuilder sb = new StringBuilder("@");
            if (TextUtils.isEmpty(cVar.f84243b.getUniqueId())) {
                str = user.getShortId();
            } else {
                str = user.getUniqueId();
            }
            sb.append(str);
            textView.setText(sb.toString());
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) vVar.itemView.getLayoutParams();
        if (i == 0) {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, f84240b, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        } else {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, 0, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    /* renamed from: a */
    public final void mo65493a(User user, int i, int i2) {
        if (i >= 0 && i < this.f70670n.size()) {
            this.f70670n.remove(i);
            notifyItemRemoved(i);
            if (this.f70670n.isEmpty()) {
                this.f84241a.mo65490c();
            }
        }
    }
}
