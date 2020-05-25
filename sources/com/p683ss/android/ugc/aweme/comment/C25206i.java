package com.p683ss.android.ugc.aweme.comment;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.views.mention.MentionEditText;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.i */
final /* synthetic */ class C25206i implements OnClickListener {

    /* renamed from: a */
    private final C25156f f66784a;

    /* renamed from: b */
    private final String f66785b;

    /* renamed from: c */
    private final String f66786c;

    /* renamed from: d */
    private final MentionEditText f66787d;

    C25206i(C25156f fVar, String str, String str2, MentionEditText mentionEditText) {
        this.f66784a = fVar;
        this.f66785b = str;
        this.f66786c = str2;
        this.f66787d = mentionEditText;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C25156f fVar = this.f66784a;
        String str = this.f66785b;
        String str2 = this.f66786c;
        MentionEditText mentionEditText = this.f66787d;
        if (fVar.mo51314s()) {
            if (!C20854a.m53167g().isLogin()) {
                C27965f.m66720a((Activity) fVar.f66585a.getActivity(), str, "click_comment_emotion", C47661ab.m103163a().mo94972a("login_title", fVar.f66585a.getString(R.string.a7w)).mo94972a("group_id", str2).mo94972a("log_pb", C23198ae.m56874k(str2)).f120139a);
            } else if (!fVar.mo51305f()) {
                fVar.mo51303e();
                fVar.mo51287a(mentionEditText.getHint(), true);
            }
        }
    }
}
