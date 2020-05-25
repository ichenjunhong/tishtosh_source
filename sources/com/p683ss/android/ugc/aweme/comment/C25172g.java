package com.p683ss.android.ugc.aweme.comment;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22713c;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import com.p683ss.android.ugc.aweme.views.mention.MentionEditText;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.g */
final /* synthetic */ class C25172g implements OnClickListener {

    /* renamed from: a */
    private final C25156f f66721a;

    /* renamed from: b */
    private final String f66722b;

    /* renamed from: c */
    private final String f66723c;

    C25172g(C25156f fVar, String str, String str2) {
        this.f66721a = fVar;
        this.f66722b = str;
        this.f66723c = str2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C25156f fVar = this.f66721a;
        String str = this.f66722b;
        String str2 = this.f66723c;
        Context context = fVar.f66585a != null ? fVar.f66585a.getContext() : null;
        if (context == null) {
            context = C11010c.m22280a();
        }
        if (fVar.mo51314s() && !C32800a.m75679a(view)) {
            if (C22713c.m55949a().mo47103a()) {
                C10691a.m21548c(context, (int) R.string.dvz).mo19066a();
            } else if (!fVar.mo51306g()) {
                if (!C20854a.m53167g().isLogin()) {
                    C27965f.m66720a((Activity) fVar.f66585a.getActivity(), str, "click_type_comment", C47661ab.m103163a().mo94972a("login_title", fVar.f66585a.getString(R.string.a7w)).mo94972a("group_id", str2).mo94972a("log_pb", C23198ae.m56874k(str2)).f120139a);
                } else if (C47915gg.m103651b()) {
                    C10691a.m21548c(context, (int) R.string.a2a).mo19066a();
                } else if (!fVar.mo51305f()) {
                    if (fVar.f66595k == 1) {
                        C10691a.m21548c(context, (int) R.string.a9g).mo19066a();
                    } else if (fVar.f66586b.mo51787h() != null && !C47950q.m103755d(fVar.f66586b.mo51787h())) {
                        fVar.f66591g = true;
                        if (view instanceof MentionEditText) {
                            fVar.mo51287a(((MentionEditText) view).getHint(), false);
                            return;
                        }
                        fVar.mo51248h();
                    }
                }
            }
        }
    }
}
