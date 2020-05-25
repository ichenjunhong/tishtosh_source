package com.p683ss.android.ugc.aweme.comment.p1525j;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import com.p683ss.android.ugc.aweme.base.livedata.C23552a;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.p1516a.C25067d;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.comment.j.a */
public class C25212a {

    /* renamed from: c */
    private static C25212a f66795c;

    /* renamed from: a */
    HashMap<String, Comment> f66796a = new HashMap<>();

    /* renamed from: b */
    public HashMap<String, Comment> f66797b = new HashMap<>();

    /* renamed from: d */
    private Set<String> f66798d = new HashSet();

    /* renamed from: e */
    private Set<String> f66799e = new HashSet();

    private C25212a() {
    }

    /* renamed from: a */
    public static C25212a m61315a() {
        if (f66795c == null) {
            synchronized (C25212a.class) {
                if (f66795c == null) {
                    f66795c = new C25212a();
                }
            }
        }
        return f66795c;
    }

    /* renamed from: b */
    public final void mo51475b() {
        for (String str : this.f66799e) {
            if (!TextUtils.isEmpty(str)) {
                C23552a.m57751a().mo48725b(str);
            }
        }
        this.f66799e.clear();
        this.f66796a.clear();
        this.f66797b.clear();
    }

    /* renamed from: a */
    public final C23275b<C25067d> mo51470a(String str) {
        this.f66799e.add(str);
        return C23552a.m57751a().mo48724a(str, C25067d.class);
    }

    /* renamed from: b */
    public final Comment mo51474b(String str) {
        return (Comment) this.f66796a.get(str);
    }

    /* renamed from: a */
    public final boolean mo51473a(Comment comment) {
        return this.f66798d.contains(comment.getCid());
    }

    /* renamed from: a */
    public final void mo51472a(Comment comment, boolean z) {
        if (z) {
            this.f66798d.add(comment.getCid());
        } else {
            this.f66798d.remove(comment.getCid());
        }
    }

    /* renamed from: a */
    public void mo51471a(Comment comment, Comment comment2, boolean z) {
        while (comment != null && comment2 != null) {
            comment.setTranslated(z);
            comment.setText(comment2.getText());
            comment.setTextExtra(comment2.getTextExtra());
            if (comment.getCommentType() == 0 && !C9376b.m18558a((Collection<T>) comment.getReplyComments()) && !C9376b.m18558a((Collection<T>) comment2.getReplyComments())) {
                comment = (Comment) comment.getReplyComments().get(0);
                comment2 = (Comment) comment2.getReplyComments().get(0);
            } else {
                return;
            }
        }
    }
}
