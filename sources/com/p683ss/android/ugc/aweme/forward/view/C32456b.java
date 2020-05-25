package com.p683ss.android.ugc.aweme.forward.view;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.forward.model.C32416d;
import com.p683ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.p683ss.android.ugc.aweme.forward.p1773a.C32374a;
import com.p683ss.android.ugc.aweme.forward.p1774b.C32382d;
import com.p683ss.android.ugc.aweme.forward.p1776d.C32395f;
import com.p683ss.android.ugc.aweme.forward.p1777e.C32401a;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.forward.view.b */
public final class C32456b extends BaseAwemeDetailFragment implements C32382d {

    /* renamed from: q */
    private C32395f f84529q;

    public final void aJ_() {
        super.aJ_();
        this.mEditText.performClick();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        if (this.f84529q != null) {
            this.f84529q.mo46991S_();
            this.f84529q.aq_();
        }
        C25280a.m61493a().clearAllTranslationCache();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo65726s() {
        if (getArguments() != null) {
            String string = getArguments().getString("forward_id");
            if (!TextUtils.isEmpty(string)) {
                this.f84529q = new C32395f();
                this.f84529q.mo54799a(new C32416d());
                this.f84529q.mo54800a(this);
                this.f84529q.mo44934a_(string);
            }
        }
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        super.mo47025b(exc);
        this.mEditText.performClick();
    }

    /* renamed from: a */
    public final void mo65555a(ForwardDetail forwardDetail) {
        this.f84489k = forwardDetail.getAweme();
        if (this.f84489k == null || this.f84489k.getAwemeType() != 13) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            return;
        }
        this.f84484b.f84271l = this.f84489k;
        this.f84484b.mo50303a(C32374a.m74719a(forwardDetail.getAweme(), (List<Comment>) new ArrayList<Comment>()));
        String str = this.f84486d;
        Aweme aweme = this.f84489k;
        if (aweme != null) {
            C23089d a = C23089d.m56640a();
            a.mo47830a(C32401a.m74899a(str, aweme)).mo47829a("from_group_id", aweme.getFromGroupId()).mo47829a("repost_comment_id", aweme.getForwardCommentId());
            if (!TextUtils.isEmpty(aweme.getForwardGroupId())) {
                a.mo47829a("forward_group_id", aweme.getForwardGroupId());
            }
            if (!TextUtils.isEmpty(aweme.getForwardUserId())) {
                a.mo47829a("forward_user_id", aweme.getForwardUserId());
            }
            C26890h.m65011a("enter_repost_detail", a.f61491a);
        }
        mo65727t();
        mo65728u();
    }

    /* renamed from: a */
    public final void mo47018a(List<Comment> list, boolean z) {
        boolean z2;
        super.mo47018a(list, z);
        if (getArguments() != null) {
            if (list == null || list.size() < 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getArguments().containsKey("cid")) {
                String string = getArguments().getString("cid", "");
                if (list != null) {
                    for (Comment comment : list) {
                        if (TextUtils.equals(comment.getCid(), string)) {
                            if (comment.getUser() != null) {
                                comment.getUser().getUid();
                            }
                            if (z2) {
                                mo65532d(comment);
                            } else {
                                this.f84490l = comment;
                                this.mEditText.setHint(getString(R.string.d6y, C47915gg.m103650b(comment.getUser())));
                            }
                        }
                    }
                } else if (z2) {
                    this.mEditText.performClick();
                }
            } else if (z2) {
                this.mEditText.performClick();
            }
        }
    }
}
