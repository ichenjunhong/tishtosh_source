package com.p683ss.android.ugc.aweme.forward.model;

import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.forward.model.b */
public final class C32414b implements Serializable {

    /* renamed from: a */
    private int f84346a;

    /* renamed from: b */
    private Aweme f84347b;

    /* renamed from: c */
    private Comment f84348c;

    public final Aweme getAweme() {
        return this.f84347b;
    }

    public final Comment getComment() {
        return this.f84348c;
    }

    public final int getType() {
        return this.f84346a;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final void setAweme(Aweme aweme) {
        this.f84347b = aweme;
    }

    public final void setComment(Comment comment) {
        this.f84348c = comment;
    }

    public final void setType(int i) {
        this.f84346a = i;
    }

    public C32414b(int i) {
        this.f84346a = i;
    }

    public C32414b(Comment comment) {
        this.f84346a = 1;
        this.f84348c = comment;
    }

    public C32414b(Aweme aweme) {
        this.f84347b = aweme;
    }

    public final boolean equals(Object obj) {
        if (this.f84346a != 1 || this.f84348c == null || !(obj instanceof C32414b)) {
            return super.equals(obj);
        }
        return this.f84348c.equals(((C32414b) obj).getComment());
    }
}
