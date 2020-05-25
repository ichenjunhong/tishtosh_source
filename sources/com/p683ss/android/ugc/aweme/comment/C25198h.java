package com.p683ss.android.ugc.aweme.comment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.comment.p1528ui.KeyboardDialogFragment;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import com.p683ss.android.ugc.aweme.views.mention.MentionEditText;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.h */
final /* synthetic */ class C25198h implements OnClickListener {

    /* renamed from: a */
    private final C25156f f66773a;

    /* renamed from: b */
    private final String f66774b;

    /* renamed from: c */
    private final String f66775c;

    /* renamed from: d */
    private final MentionEditText f66776d;

    C25198h(C25156f fVar, String str, String str2, MentionEditText mentionEditText) {
        this.f66773a = fVar;
        this.f66774b = str;
        this.f66775c = str2;
        this.f66776d = mentionEditText;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C25156f fVar = this.f66773a;
        String str = this.f66774b;
        String str2 = this.f66775c;
        MentionEditText mentionEditText = this.f66776d;
        if (fVar.mo51314s()) {
            if (!C20854a.m53167g().isLogin()) {
                C27965f.m66720a((Activity) fVar.f66585a.getActivity(), str, "click_comment_at", C47661ab.m103163a().mo94972a("login_title", fVar.f66585a.getString(R.string.a7w)).mo94972a("group_id", str2).mo94972a("log_pb", C23198ae.m56874k(str2)).f120139a);
            } else if (!fVar.mo51305f() && fVar.f66586b.mo51787h() != null && !C47950q.m103755d(fVar.f66586b.mo51787h())) {
                fVar.f66591g = true;
                CharSequence hint = mentionEditText.getHint();
                if (fVar.mo51314s()) {
                    int t = fVar.mo51315t();
                    KeyboardDialogFragment a = KeyboardDialogFragment.m61569a(fVar.f66586b.mo51790k(), fVar.mo51307i());
                    Bundle arguments = a.getArguments();
                    if (arguments != null) {
                        arguments.putCharSequence("hint", hint);
                        arguments.putInt("maxLength", t);
                        arguments.putBoolean("showAt", true);
                        arguments.putBoolean("showEmojiPanel", false);
                        arguments.putBoolean("clickAt", true);
                    }
                    fVar.mo51282a(a, false);
                }
            }
        }
    }
}
