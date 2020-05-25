package com.p683ss.android.ugc.aweme.comment.p1522g;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.comment.C25273o;
import com.p683ss.android.ugc.aweme.comment.abtest.MTCommentUsernamePromptExperiment;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.model.CommentResponse;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25162a;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25169e;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.g.n */
public final class C25188n extends C26851b<C25186l, C25196u> {

    /* renamed from: a */
    public List<Object> f66755a;

    /* renamed from: b */
    public int f66756b;

    /* renamed from: c */
    private Comment f66757c;

    public C25188n() {
        mo54799a(new C25186l());
    }

    /* renamed from: R_ */
    public final void mo44834R_() {
        super.mo44834R_();
        if (this.f70701g != null) {
            ((C25196u) this.f70701g).mo51298c(this.f66757c);
        }
    }

    /* renamed from: b */
    public final void mo44838b() {
        this.f66755a = null;
        if (!(this.f70701g == null || this.f70700f == null || ((C25186l) this.f70700f).getData() == null)) {
            Comment comment = ((CommentResponse) ((C25186l) this.f70700f).getData()).comment;
            if (MTCommentUsernamePromptExperiment.m60920a()) {
                comment.setNeedShowPrompt(true);
            }
            MainServiceImpl.createIMainServicebyMonsterPlugin().trackAppsFlyerEvent("mus_af_comment", comment.getAwemeId());
            if (this.f66756b != 1 || C9376b.m18558a((Collection<T>) comment.getReplyComments())) {
                if (this.f66756b != 2 || C9376b.m18558a((Collection<T>) comment.getReplyComments())) {
                    comment.setCommentType(this.f66756b);
                    if (comment.getReplyComments() == null) {
                        comment.setReplyComments(new ArrayList());
                    }
                } else {
                    Comment comment2 = (Comment) comment.getReplyComments().get(0);
                    comment.setReplyToReplyId(comment2.getCid());
                    if (!TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId())) {
                        comment.setReplyToUserName(C47915gg.m103650b(comment2.getUser()));
                    } else {
                        comment.setReplyToReplyId("0");
                    }
                    comment.setReplyComments(null);
                    comment.setCommentType(2);
                }
                ((C25196u) this.f70701g).mo51301d(comment);
            } else {
                Comment comment3 = (Comment) comment.getReplyComments().get(0);
                comment3.setCommentType(1);
                ArrayList arrayList = new ArrayList();
                comment.setReplyComments(null);
                comment.setCommentType(2);
                arrayList.add(comment);
                comment3.setReplyComments(arrayList);
                ((C25196u) this.f70701g).mo51301d(comment3);
            }
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f70701g != null) {
            ((C25196u) this.f70701g).mo51288a(exc, this.f66757c);
        }
    }

    /* renamed from: a_ */
    public final boolean mo44934a_(Object... objArr) {
        this.f66755a = new ArrayList();
        for (Object add : objArr) {
            this.f66755a.add(add);
        }
        return super.mo44934a_(objArr);
    }

    /* renamed from: a */
    public final boolean mo51444a(C25169e eVar) {
        this.f66757c = new Comment();
        this.f66757c.setAwemeId(eVar.f66620a);
        User curUser = C20854a.m53167g().getCurUser();
        Aweme awemeById = C23324d.m57378a().getAwemeById(eVar.f66620a);
        if (awemeById != null && TextUtils.equals(awemeById.getAuthorUid(), curUser.getUid())) {
            Context g = C11016e.m22312g();
            if (g == null) {
                g = C11010c.m22280a();
            }
            this.f66757c.setLabelText(g.getString(R.string.ma));
            this.f66757c.setLabelType(1);
        }
        this.f66757c.setUser(curUser);
        String a = C25273o.m61470a();
        this.f66757c.setFakeId(a);
        this.f66757c.setText(eVar.f66621b);
        this.f66757c.setCommentType(this.f66756b);
        this.f66757c.setReplyComments(new ArrayList());
        this.f66757c.setEmoji(eVar.f66625f);
        if (!TextUtils.isEmpty(eVar.f66624e)) {
            this.f66757c.setReplyId(eVar.f66622c);
            this.f66757c.setTextExtra(eVar.f66623d);
            this.f66757c.setReplyToReplyId(eVar.f66624e);
            C25273o.m61474b(this.f66757c, 2);
        } else if (!TextUtils.isEmpty(eVar.f66622c)) {
            this.f66757c.setReplyId(eVar.f66622c);
            this.f66757c.setTextExtra(eVar.f66623d);
            this.f66757c.setReplyToReplyId(eVar.f66622c);
            C25273o.m61474b(this.f66757c, 2);
        } else {
            this.f66757c.setReplyId(eVar.f66622c);
            this.f66757c.setTextExtra(eVar.f66623d);
            this.f66757c.setReplyToReplyId(null);
            C25273o.m61474b(this.f66757c, 1);
        }
        eVar.f66628i = a;
        C25273o.f66859b.mo51555j(this.f66757c);
        C25273o.m61472a(this.f66757c, (C25162a) eVar);
        return super.mo44934a_(eVar);
    }
}
