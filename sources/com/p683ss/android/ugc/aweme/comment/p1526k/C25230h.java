package com.p683ss.android.ugc.aweme.comment.p1526k;

import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.k.h */
public final class C25230h {
    /* renamed from: a */
    public static boolean m61353a() {
        if (!C25282a.m61494a().needBindMobile() || C25282a.m61494a().getBindPhoneForCommentAB() != 30) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m61352a(final Context context, final C25219b bVar) {
        if (!C25282a.m61494a().needBindMobile()) {
            bVar.mo51480a(false);
            return;
        }
        int bindPhoneForCommentAB = C25282a.m61494a().getBindPhoneForCommentAB();
        if (bindPhoneForCommentAB == 10) {
            bVar.mo51480a(false);
        } else if (bindPhoneForCommentAB == 30) {
            C25282a.m61494a().createDialogForComment(context, R.string.s_, new Runnable() {
                public final void run() {
                    bVar.mo51480a(true);
                }
            });
        } else if (bindPhoneForCommentAB != 40) {
            switch (bindPhoneForCommentAB) {
                case 20:
                    SharePrefCache.inst().setIsFirstPublishComment(false);
                    C25282a.m61494a().createDialogForComment(context, R.string.s_, new Runnable() {
                        public final void run() {
                            bVar.mo51480a(false);
                        }
                    });
                    return;
                case 21:
                    if (SharePrefCache.inst().getIsFirstPublishComment()) {
                        SharePrefCache.inst().setIsFirstPublishComment(false);
                        C25282a.m61494a().createDialogForComment(context, R.string.s_, new Runnable() {
                            public final void run() {
                                bVar.mo51480a(false);
                            }
                        });
                        return;
                    }
                    bVar.mo51480a(false);
                    return;
                default:
                    if (SharePrefCache.inst().getIsFirstPublishComment()) {
                        SharePrefCache.inst().setIsFirstPublishComment(false);
                        C25282a.m61494a().createDialogForComment(context, R.string.s_, new Runnable() {
                            public final void run() {
                                bVar.mo51480a(false);
                            }
                        });
                        return;
                    }
                    bVar.mo51480a(false);
                    return;
            }
        } else {
            C25282a.m61494a().createDialogForComment(context, R.string.s_, new Runnable() {
                public final void run() {
                    Context context = context;
                    String str = "用户拒绝绑定";
                    C10691a.m21545b(context, context.getString(R.string.a8l)).mo19066a();
                    User curUser = C20854a.m53167g().getCurUser();
                    if (curUser != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("user id = ");
                        sb.append(curUser.getUid());
                        sb.append(" first comment = ");
                        sb.append(SharePrefCache.inst().getIsFirstPublishComment());
                        sb.append(" failed reason = ");
                        sb.append(str);
                        sb.append(" bind phone = ");
                        sb.append(curUser.getBindPhone());
                        C32458a.m75150b("comment_failed", String.valueOf(sb));
                    }
                }
            });
        }
    }
}
