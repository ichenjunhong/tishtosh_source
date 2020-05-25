package com.p683ss.android.ugc.aweme.comment;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.p1528ui.C25367g;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.l */
final /* synthetic */ class C25250l implements OnDismissListener {

    /* renamed from: a */
    private final C25156f f66855a;

    C25250l(C25156f fVar) {
        this.f66855a = fVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C25156f fVar = this.f66855a;
        if (fVar.f66585a instanceof C25367g) {
            C25367g gVar = (C25367g) fVar.f66585a;
            if (gVar.f67120p != null) {
                List a = gVar.f67120p.mo50673a();
                if (a != null) {
                    User curUser = C20854a.m53167g().getCurUser();
                    int[] iArr = {-1, -1};
                    for (int i = 0; i < a.size(); i++) {
                        User user = ((Comment) a.get(i)).getUser();
                        if (user != null && TextUtils.equals(user.getUid(), curUser.getUid())) {
                            user.setNickname(curUser.getNickname());
                            user.setAvatarThumb(curUser.getAvatarThumb());
                            if (iArr[0] == -1) {
                                iArr[0] = i;
                            }
                            iArr[1] = i;
                        }
                    }
                    if (iArr[0] >= 0) {
                        gVar.f67120p.notifyItemRangeChanged(iArr[0], (iArr[1] - iArr[0]) + 1);
                    }
                }
            }
        }
    }
}
