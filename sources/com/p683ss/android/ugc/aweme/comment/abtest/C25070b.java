package com.p683ss.android.ugc.aweme.comment.abtest;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.comment.model.Comment;

/* renamed from: com.ss.android.ugc.aweme.comment.abtest.b */
public final class C25070b {
    /* renamed from: a */
    public static void m60929a(Comment comment, String str) {
        boolean z = false;
        if (comment.getUserDigged() == 1) {
            comment.setUserDigged(0);
            comment.setDiggCount(comment.getDiggCount() - 1);
        } else {
            comment.setUserDigged(1);
            comment.setDiggCount(comment.getDiggCount() + 1);
        }
        if (TextUtils.equals(str, C20854a.m53167g().getCurUserId()) && comment.getLabelType() != 1) {
            if (comment.getUserDigged() == 1) {
                z = true;
            }
            comment.setAuthorDigged(z);
        }
    }
}
