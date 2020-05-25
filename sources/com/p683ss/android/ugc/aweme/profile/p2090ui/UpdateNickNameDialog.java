package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.account.views.C22313c;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.C24631ae;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.util.C40534ah;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.ss.android.ugc.trill.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UpdateNickNameDialog */
public class UpdateNickNameDialog extends UpdateUserInfoDialog {
    TextView mPolicyDes;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo82390d() {
        return R.layout.kv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo42942b() {
        super.mo42942b();
        String string = C11010c.m22280a().getString(R.string.dc6);
        String e = m89389e();
        int indexOf = e.indexOf(string);
        Spannable newSpannable = Factory.getInstance().newSpannable(e);
        newSpannable.setSpan(new C22313c(C23723j.m58216a(R.color.a3c), C23723j.m58216a(R.color.jb)) {
            public final void onClick(View view) {
                C41302w.m91042a().mo83861a((String) SharePrefCache.inst().getJudgementClauseScheme().mo47782d());
            }
        }, indexOf, string.length() + indexOf, 17);
        this.mPolicyDes.setMovementMethod(C24631ae.m60124a());
        this.mPolicyDes.setText(newSpannable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo82389c() {
        String str;
        if (this.mNickNameEditText == null || this.mNickNameEditText.getText() == null) {
            str = "";
        } else {
            str = this.mNickNameEditText.getText().toString();
        }
        if (!(m89388b(str) || this.f102596c == null || this.f102595b == null)) {
            if (!TextUtils.equals(str, C20902b.m53242a().getCurUser().getNickname())) {
                this.f102595b.f101356a = str;
            }
            Map a = this.f102595b.mo80822a();
            a.put("target_user", "1");
            this.f102596c.mo81853a(a);
            C26890h.m65011a("profile_update_alert_finish", C23089d.m56640a().mo47829a("type", C40534ah.m89941a(2)).f61491a);
        }
    }
}
