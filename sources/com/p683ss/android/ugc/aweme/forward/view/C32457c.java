package com.p683ss.android.ugc.aweme.forward.view;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.forward.p1773a.C32374a;
import com.p683ss.android.ugc.aweme.forward.p1777e.C32401a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.forward.view.c */
public final class C32457c extends BaseAwemeDetailFragment {

    /* renamed from: q */
    public String f84530q;

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo65726s() {
        if (getArguments() != null) {
            Aweme aweme = (Aweme) getArguments().getSerializable("forward_item");
            if (aweme != null && aweme.getForwardItem() != null) {
                this.f84530q = getArguments().getString("share_id");
                this.f84484b.f84273y = this.f84530q;
                this.f84484b.f84272m = aweme;
                this.f84489k = aweme.getForwardItem();
                Aweme awemeById = C23324d.m57378a().getAwemeById(this.f84489k.getAid());
                if (awemeById != null) {
                    this.f84489k.setStatistics(awemeById.getStatistics());
                    this.f84489k.setUserDigg(awemeById.getUserDigg());
                    this.f84489k.setStatus(awemeById.getStatus());
                    this.f84489k.setRepostFromGroupId(aweme.getAid());
                    this.f84489k.setRepostFromUserId(aweme.getAuthorUid());
                }
                this.f84484b.f84271l = this.f84489k;
                this.f84484b.mo50303a(C32374a.m74719a(this.f84489k, (List<Comment>) new ArrayList<Comment>()));
                C26890h.m65011a("enter_repost_detail", C23089d.m56640a().mo47829a("repost_comment_id", aweme.getForwardCommentId()).mo47829a("from_group_id", aweme.getFromGroupId()).mo47830a(C32401a.m74899a(this.f84486d, aweme)).f61491a);
                mo65727t();
                mo65728u();
            }
        }
    }
}
