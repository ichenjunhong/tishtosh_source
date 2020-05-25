package com.p683ss.android.ugc.aweme.comment.widget;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.comment.list.C25265n;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.p1516a.C25067d;
import com.p683ss.android.ugc.aweme.comment.p1525j.C25212a;
import com.p683ss.android.ugc.aweme.comment.p1525j.C25213b;
import com.p683ss.android.ugc.aweme.comment.p1525j.C25215c;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25225e;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25241l;
import com.p683ss.android.ugc.aweme.comment.p1528ui.C25336ae;
import com.p683ss.android.ugc.aweme.comment.p1528ui.CommentTranslationStatusView;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.widget.a */
public final class C25424a implements C0199s<C25067d>, C25265n {

    /* renamed from: a */
    private Context f67250a;

    /* renamed from: b */
    private C25336ae f67251b;

    /* renamed from: c */
    private C25336ae f67252c;

    /* renamed from: d */
    private Comment f67253d;

    /* renamed from: e */
    private CommentTranslationStatusView f67254e;

    /* renamed from: f */
    private C25212a f67255f = C25212a.m61315a();

    /* renamed from: b */
    public final void mo51560b() {
        if (this.f67253d != null) {
            C25212a aVar = this.f67255f;
            Comment comment = this.f67253d;
            aVar.mo51471a(comment, (Comment) aVar.f66797b.get(comment.getCid()), false);
            C25212a.m61315a().mo51470a(comment.getCid()).setValue(new C25067d(comment, true, null));
        }
    }

    /* renamed from: a */
    public final void mo51559a() {
        if (this.f67253d != null) {
            String appLanguage = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getAppLanguage();
            Comment comment = this.f67253d;
            C25213b bVar = new C25213b();
            String a = m61830a(comment);
            if (TextUtils.isEmpty(a)) {
                bVar = null;
            } else {
                bVar.mo51476a(a);
                if (comment.getCommentType() == 0 && !C9376b.m18558a((Collection<T>) comment.getReplyComments())) {
                    bVar.mo51476a(m61830a((Comment) comment.getReplyComments().get(0)));
                }
                bVar.f66801b = appLanguage;
            }
            if (bVar != null) {
                C25212a aVar = this.f67255f;
                Comment comment2 = this.f67253d;
                CommentTranslationStatusView commentTranslationStatusView = this.f67254e;
                Comment b = aVar.mo51474b(comment2.getCid());
                if (b != null) {
                    aVar.mo51471a(comment2, b, true);
                    C25212a.m61315a().mo51470a(comment2.getCid()).setValue(new C25067d(comment2, true, null));
                    return;
                }
                aVar.mo51472a(comment2, true);
                aVar.f66797b.put(comment2.getCid(), comment2.clone());
                commentTranslationStatusView.setLoading(true);
                C18842a.m45932a(new C25215c(comment2, bVar));
            }
        }
    }

    public C25424a(Context context) {
        this.f67250a = context;
    }

    /* renamed from: a */
    private static String m61830a(Comment comment) {
        String a = C25225e.m61335a(comment, false);
        if (TextUtils.isEmpty(a)) {
            return "";
        }
        boolean[] zArr = new boolean[a.length()];
        for (TextExtraStruct textExtraStruct : comment.getTextExtra()) {
            for (int max = Math.max(0, textExtraStruct.getStart()); max < Math.min(a.length(), textExtraStruct.getEnd()); max++) {
                zArr[max] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (!zArr[i]) {
                sb.append(a.charAt(i));
            }
        }
        return C25241l.m61363a(sb.toString().trim());
    }

    public final /* synthetic */ void onChanged(Object obj) {
        C25067d dVar = (C25067d) obj;
        if (dVar != null && dVar.f66400a != null) {
            Activity a = C23729p.m58248a(this.f67250a);
            if (a != null && !a.isFinishing()) {
                Comment comment = dVar.f66400a;
                if (dVar.f66401b) {
                    this.f67254e.setLoading(false);
                    this.f67251b.mo51881a(C25225e.m61331a(comment), C25225e.m61340b(comment));
                    List replyComments = comment.getReplyComments();
                    if (comment.getCommentType() == 0 && this.f67252c != null && !C9376b.m18558a((Collection<T>) replyComments)) {
                        Comment comment2 = (Comment) replyComments.get(0);
                        this.f67252c.mo51881a(C25225e.m61331a(comment2), C25225e.m61340b(comment2));
                    }
                    return;
                }
                Exception exc = dVar.f66402c;
                this.f67254e.setLoading(false);
                if (exc != null) {
                    C22971a.m56493a(this.f67250a, (Throwable) exc);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo52023a(Context context, Comment comment, C25336ae aeVar, C25336ae aeVar2, CommentTranslationStatusView commentTranslationStatusView) {
        if (comment == null || comment.isTranslated() || commentTranslationStatusView == null) {
            if (commentTranslationStatusView != null) {
                commentTranslationStatusView.setVisibility(8);
            }
            return;
        }
        if (this.f67253d != null) {
            this.f67255f.mo51470a(this.f67253d.getCid()).removeObserver(this);
        }
        this.f67250a = context;
        this.f67253d = comment;
        this.f67251b = aeVar;
        this.f67252c = aeVar2;
        this.f67254e = commentTranslationStatusView;
        C0184k a = this.f67251b.mo51880a();
        if (a == null) {
            this.f67255f.mo51470a(this.f67253d.getCid()).mo48248a(this, false);
        } else {
            this.f67255f.mo51470a(this.f67253d.getCid()).mo48247a(a, this, false);
        }
        this.f67254e.setLoading(this.f67255f.mo51473a(this.f67253d));
        this.f67255f.mo51473a(this.f67253d);
    }
}
