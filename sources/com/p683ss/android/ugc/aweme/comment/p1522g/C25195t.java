package com.p683ss.android.ugc.aweme.comment.p1522g;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.comment.C25273o;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.model.ForwardPublishModel;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25162a;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25166c;
import com.p683ss.android.ugc.aweme.comment.p1527l.C25251a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.g.t */
public final class C25195t extends C26851b<ForwardPublishModel, C25251a> {

    /* renamed from: a */
    public int f66770a;

    /* renamed from: b */
    public List<Object> f66771b;

    /* renamed from: c */
    private Comment f66772c;

    public C25195t() {
        mo54799a(new ForwardPublishModel());
    }

    /* renamed from: R_ */
    public final void mo44834R_() {
        super.mo44834R_();
        if (this.f70701g != null) {
            ((C25251a) this.f70701g).mo51304e(this.f66772c);
        }
    }

    /* renamed from: b */
    public final void mo44838b() {
        super.mo44838b();
        this.f66771b = null;
        if (!(this.f70701g == null || this.f70700f == null || ((ForwardPublishModel) this.f70700f).getData() == null)) {
            Comment comment = ((ForwardDetail) ((ForwardPublishModel) this.f70700f).getData()).getComment();
            if (comment == null) {
                ((C25251a) this.f70701g).mo51284a((ForwardDetail) ((ForwardPublishModel) this.f70700f).getData());
            } else if (this.f66770a == 1 && !C9376b.m18558a((Collection<T>) comment.getReplyComments())) {
                Comment comment2 = (Comment) comment.getReplyComments().get(0);
                comment2.setCommentType(1);
                ArrayList arrayList = new ArrayList();
                comment.setReplyComments(null);
                comment.setCommentType(2);
                arrayList.add(comment);
                comment2.setReplyComments(arrayList);
                ((ForwardDetail) ((ForwardPublishModel) this.f70700f).getData()).setComment(comment2);
                ((C25251a) this.f70701g).mo51284a((ForwardDetail) ((ForwardPublishModel) this.f70700f).getData());
            } else if (this.f66770a != 2 || C9376b.m18558a((Collection<T>) comment.getReplyComments())) {
                comment.setCommentType(this.f66770a);
                ((C25251a) this.f70701g).mo51284a((ForwardDetail) ((ForwardPublishModel) this.f70700f).getData());
            } else {
                Comment comment3 = (Comment) comment.getReplyComments().get(0);
                comment.setReplyToReplyId(comment3.getCid());
                if (!TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId())) {
                    comment.setReplyToUserName(C47915gg.m103650b(comment3.getUser()));
                } else {
                    comment.setReplyToReplyId("0");
                }
                comment.setReplyComments(null);
                comment.setCommentType(2);
                ((C25251a) this.f70701g).mo51284a((ForwardDetail) ((ForwardPublishModel) this.f70700f).getData());
            }
        }
    }

    /* renamed from: a_ */
    public final boolean mo44934a_(Object... objArr) {
        this.f66771b = new ArrayList();
        for (Object add : objArr) {
            this.f66771b.add(add);
        }
        return super.mo44934a_(objArr);
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        super.mo44840c_(exc);
        if (this.f70701g != null) {
            ((C25251a) this.f70701g).mo51295b(exc, this.f66772c);
        }
    }

    /* renamed from: a */
    public final boolean mo51449a(C25166c cVar) {
        Context context;
        this.f66772c = new Comment();
        this.f66772c.setText(cVar.f66621b);
        User curUser = C20854a.m53167g().getCurUser();
        Aweme awemeById = C23324d.m57378a().getAwemeById(cVar.f66620a);
        if (awemeById != null && TextUtils.equals(awemeById.getAuthorUid(), curUser.getUid())) {
            if (C11016e.m22312g() == null) {
                context = C11010c.m22280a();
            } else {
                context = C11016e.m22312g();
            }
            this.f66772c.setLabelText(context.getString(R.string.ma));
            this.f66772c.setLabelType(1);
        }
        this.f66772c.setUser(curUser);
        String a = C25273o.m61470a();
        this.f66772c.setFakeId(a);
        String str = cVar.f66678k;
        Comment comment = this.f66772c;
        if (TextUtils.isEmpty(str)) {
            str = a;
        }
        comment.setForwardId(str);
        String str2 = cVar.f66622c;
        this.f66772c.setReplyId(str2);
        this.f66772c.setTextExtra(cVar.f66623d);
        String str3 = cVar.f66624e;
        Comment comment2 = this.f66772c;
        if (str3 != null) {
            str2 = str3;
        }
        comment2.setReplyToReplyId(str2);
        this.f66772c.setCommentType(this.f66770a);
        this.f66772c.setReplyComments(new ArrayList());
        this.f66772c.setEmoji(cVar.f66625f);
        cVar.f66628i = a;
        C25273o.f66859b.mo51555j(this.f66772c);
        C25273o.m61474b(this.f66772c, 3);
        C25273o.m61472a(this.f66772c, (C25162a) cVar);
        return super.mo44934a_(cVar);
    }
}
