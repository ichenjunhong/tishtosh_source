package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.comment.C25156f;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.utils.C47918gj;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.am */
final /* synthetic */ class C25344am implements Runnable {

    /* renamed from: a */
    private final KeyboardDialogFragment f67018a;

    C25344am(KeyboardDialogFragment keyboardDialogFragment) {
        this.f67018a = keyboardDialogFragment;
    }

    public final void run() {
        KeyboardDialogFragment keyboardDialogFragment = this.f67018a;
        boolean z = false;
        if (Keva.getRepo("reply_with_video_bubble").getBoolean(C20854a.m53167g().getCurUserId(), false)) {
            return;
        }
        if (keyboardDialogFragment.f66986v == null || !keyboardDialogFragment.f66986v.isShowing()) {
            keyboardDialogFragment.f66986v = new C25360bb(keyboardDialogFragment.getActivity());
            keyboardDialogFragment.f66986v.setOutsideTouchable(true);
            keyboardDialogFragment.f66986v.setTouchable(false);
            C25360bb bbVar = keyboardDialogFragment.f66986v;
            ViewGroup viewGroup = keyboardDialogFragment.mVgCommentContainer;
            if (viewGroup != null && bbVar.f67046b != null && !bbVar.isShowing() && !bbVar.f67046b.isFinishing()) {
                int[] iArr = new int[2];
                viewGroup.getLocationOnScreen(iArr);
                bbVar.showAtLocation(viewGroup, 0, !C47918gj.m103682a(bbVar.f67046b) ? 0 : C9432q.m18670a((Context) bbVar.f67046b) - bbVar.f67047c, ((iArr[1] - bbVar.f67048d) - C11065a.m22390a((Context) bbVar.f67046b)) + ((int) C9432q.m18687b((Context) bbVar.f67046b, 5.0f)));
                bbVar.getContentView().removeCallbacks(bbVar.f67045a);
                bbVar.getContentView().postDelayed(bbVar.f67045a, 3000);
                z = true;
            }
            if (z) {
                Keva.getRepo("reply_with_video_bubble").storeBoolean(C20854a.m53167g().getCurUserId(), true);
                if (keyboardDialogFragment.f66983s != null) {
                    C25156f fVar = keyboardDialogFragment.f66983s;
                    if (fVar.f66585a.getActivity() != null && fVar.f66586b != null && fVar.f66586b.mo51788i() != null) {
                        Comment i = fVar.f66586b.mo51788i();
                        C26890h.m65011a("comment_reply_toast_show", C23089d.m56640a().mo47829a("group_id", i.getAwemeId()).mo47829a("reply_comment_id", i.getCid()).mo47829a("author_id", C20854a.m53167g().getCurUserId()).f61491a);
                    }
                }
            }
        }
    }
}
