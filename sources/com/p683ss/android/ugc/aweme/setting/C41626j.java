package com.p683ss.android.ugc.aweme.setting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.j */
public final class C41626j {

    /* renamed from: a */
    public static int f105358a = 0;

    /* renamed from: b */
    public static int f105359b = 1;

    /* renamed from: c */
    public static int f105360c = 2;

    /* renamed from: d */
    public static int f105361d = 3;

    /* renamed from: a */
    public static boolean m91500a() {
        return ((Boolean) C23183v.m56778a().mo47892C().mo47782d()).booleanValue();
    }

    /* renamed from: b */
    public static final boolean m91502b(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return false;
        }
        if (aweme.getAuthor().getCommentSetting() == f105361d || aweme.getCommentSetting() == f105361d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m91501a(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return true;
        }
        User author = aweme.getAuthor();
        int commentSetting = author.getCommentSetting();
        if (AccountService.createIAccountServicebyMonsterPlugin().userService().isMe(author.getUid())) {
            if (commentSetting == f105361d || aweme.getCommentSetting() == f105361d) {
                return false;
            }
            return true;
        } else if (commentSetting == f105358a) {
            return true;
        } else {
            if (commentSetting == f105359b && C47950q.m103756e(aweme)) {
                return true;
            }
            if (commentSetting != f105360c || !C47950q.m103757f(aweme)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static void m91499a(Context context, int i, String str) {
        if (context != null) {
            C10643a aVar = new C10643a(context);
            aVar.mo18885a(i);
            aVar.mo18902b(str);
            aVar.mo18886a((int) R.string.vo, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            aVar.mo18897a().mo18882b().setCancelable(false);
        }
    }
}
