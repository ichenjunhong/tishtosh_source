package com.p683ss.android.ugc.aweme.comment.p1522g;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1373d.C23064c;
import com.p683ss.android.ugc.aweme.comment.list.C25261j;
import com.p683ss.android.ugc.aweme.comment.list.C25262k;
import com.p683ss.android.ugc.aweme.comment.list.C25263l;
import com.p683ss.android.ugc.aweme.comment.list.C25269r;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p683ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25243n;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.feed.C30228f;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.g.p */
public final class C25190p extends C26876b<C25189o> implements C25262k, C26877c<Comment> {

    /* renamed from: a */
    public C25243n f66758a;

    /* renamed from: b */
    public String f66759b;

    /* renamed from: d */
    private C25263l f66760d;

    /* renamed from: e */
    private C25261j f66761e;

    /* renamed from: h */
    private CommentReplyButtonStruct f66762h;

    /* renamed from: i */
    private String f66763i;

    /* renamed from: j */
    private String f66764j;

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List list, boolean z) {
    }

    /* renamed from: h */
    private String m61248h() {
        if (this.f66762h != null) {
            return this.f66762h.getCid();
        }
        return "";
    }

    /* renamed from: R_ */
    public final void mo44834R_() {
        if (this.f66761e != null) {
            this.f66761e.mo51132a(3);
        }
    }

    /* renamed from: e */
    public final void mo47031e() {
        if (this.f66761e != null) {
            this.f66761e.mo51132a(3);
        }
    }

    public final void aJ_() {
        if (!(this.f66762h == null || ((C25189o) this.f70700f).getData() == null)) {
            this.f66762h.setCursor(((CommentItemList) ((C25189o) this.f70700f).getData()).cursor);
            this.f66762h.setHasMore(((C25189o) this.f70700f).isHasMore());
        }
        if (this.f66761e != null) {
            if (((C25189o) this.f70700f).isHasMore()) {
                this.f66761e.mo51132a(1);
                return;
            }
            this.f66761e.mo51132a(2);
        }
    }

    /* renamed from: a */
    public final void mo51445a(C25263l lVar) {
        this.f66760d = lVar;
    }

    public C25190p(String str) {
        this(str, "");
    }

    /* renamed from: a */
    public final void mo51446a(C25269r rVar) {
        ((C25189o) this.f70700f).f66740e = rVar;
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        C22971a.m56493a((Context) C11016e.m22312g(), (Throwable) exc);
        if (this.f66761e != null) {
            this.f66761e.mo51132a(0);
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        C22971a.m56493a((Context) C11016e.m22312g(), (Throwable) exc);
        if (this.f66761e != null) {
            this.f66761e.mo51132a(1);
        }
    }

    /* renamed from: a */
    private void m61246a(List<Comment> list) {
        List list2;
        if (this.f66758a != null) {
            list2 = this.f66758a.mo51521b(this.f66762h.getCid());
        } else {
            list2 = null;
        }
        if (list2 != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Comment comment = (Comment) it.next();
                if (comment != null && list2.contains(comment)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m61247b(int i) {
        List list;
        if (this.f66758a != null) {
            list = this.f66758a.mo51521b(this.f66762h.getCid());
        } else {
            list = null;
        }
        if (list == null || this.f66762h.getExpandSize() >= list.size()) {
            return true;
        }
        int min = Math.min(this.f66762h.getExpandSize() + 3, list.size());
        if (this.f66760d != null) {
            this.f66760d.mo51557a(m61248h(), list.subList(this.f66762h.getExpandSize(), min));
        }
        this.f66762h.setExpandSize(min);
        if (this.f66761e != null) {
            if (((long) this.f66762h.getExpandSize()) >= ((C25189o) this.f70700f).mo51436b()) {
                this.f66761e.mo51132a(2);
            } else {
                this.f66761e.mo51132a(1);
            }
        }
        return false;
    }

    public C25190p(String str, String str2) {
        mo54799a(new C25189o());
        mo54800a(this);
        this.f66763i = str2;
        this.f66764j = str;
    }

    /* renamed from: a */
    public final void mo47018a(List<Comment> list, boolean z) {
        boolean isHasMore = ((C25189o) this.f70700f).isHasMore();
        if (this.f66762h != null) {
            m61246a(list);
            this.f66762h.setReplyCommentTotal(((C25189o) this.f70700f).mo51436b());
            this.f66762h.setCursor(((CommentItemList) ((C25189o) mo54803n()).getData()).cursor);
            this.f66762h.addExpandSize(list.size());
            if (!isHasMore || ((C25189o) this.f70700f).mo51436b() <= ((long) this.f66762h.getExpandSize())) {
                isHasMore = false;
            } else {
                isHasMore = true;
            }
            this.f66762h.setHasMore(isHasMore);
        }
        if (this.f66760d != null) {
            this.f66760d.mo51557a(m61248h(), list);
        }
        if (this.f66761e != null) {
            if (isHasMore) {
                this.f66761e.mo51132a(1);
                return;
            }
            this.f66761e.mo51132a(2);
        }
    }

    /* renamed from: b */
    public final void mo47026b(List<Comment> list, boolean z) {
        boolean isHasMore = ((C25189o) this.f70700f).isHasMore();
        if (this.f66762h != null) {
            m61246a(list);
            this.f66762h.setReplyCommentTotal(((C25189o) this.f70700f).mo51436b());
            this.f66762h.setCursor(((CommentItemList) ((C25189o) mo54803n()).getData()).cursor);
            this.f66762h.addExpandSize(list.size());
            if (!isHasMore || ((C25189o) this.f70700f).mo51436b() <= ((long) this.f66762h.getExpandSize())) {
                isHasMore = false;
            } else {
                isHasMore = true;
            }
            this.f66762h.setHasMore(isHasMore);
        }
        if (this.f66760d != null) {
            this.f66760d.mo51557a(m61248h(), list);
        }
        if (this.f66761e != null) {
            if (isHasMore) {
                this.f66761e.mo51132a(1);
                return;
            }
            this.f66761e.mo51132a(2);
        }
    }

    /* renamed from: a */
    public final void mo51447a(CommentReplyButtonStruct commentReplyButtonStruct, C25261j jVar) {
        boolean z;
        String str;
        long j;
        if (!(commentReplyButtonStruct == null || jVar == null)) {
            if (this.f66761e == null || this.f66761e.mo51131a() != 3) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                this.f66762h = commentReplyButtonStruct;
                this.f66761e = jVar;
                if (commentReplyButtonStruct.getButtonStatus() == 0) {
                    if (m61247b(3)) {
                        String str2 = this.f66759b;
                        long cursor = commentReplyButtonStruct.getCursor();
                        if (cursor <= 0 || this.f66758a == null || this.f66758a.mo51519a(this.f66759b, commentReplyButtonStruct.getCommentId())) {
                            str = str2;
                            j = cursor;
                        } else {
                            str = "";
                            j = 0;
                        }
                        m61245a(1, commentReplyButtonStruct, j, str, C23064c.m56602a(this.f66763i), C30228f.m70983g());
                    }
                } else if (commentReplyButtonStruct.getButtonStatus() == 1) {
                    if (m61247b(3)) {
                        String str3 = this.f66759b;
                        if (this.f66758a != null && !this.f66758a.mo51519a(this.f66759b, commentReplyButtonStruct.getCommentId())) {
                            str3 = "";
                        }
                        CommentReplyButtonStruct commentReplyButtonStruct2 = commentReplyButtonStruct;
                        m61245a(4, commentReplyButtonStruct2, commentReplyButtonStruct.getCursor(), str3, C23064c.m56602a(this.f66763i), C30228f.m70983g());
                    }
                } else if (commentReplyButtonStruct.getButtonStatus() == 2) {
                    if (!(this.f66760d == null || this.f66762h == null || this.f66758a == null)) {
                        List b = this.f66758a.mo51521b(this.f66762h.getCid());
                        if (b != null && this.f66762h.getTopSize() >= 0 && this.f66762h.getTopSize() <= b.size() && this.f66762h.getExpandSize() <= b.size()) {
                            this.f66760d.mo51558b(m61248h(), b.subList(this.f66762h.getTopSize(), this.f66762h.getExpandSize()));
                            this.f66762h.setExpandSize(this.f66762h.getTopSize());
                        }
                    }
                    if (this.f66761e != null) {
                        this.f66761e.mo51132a(0);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m61245a(int i, CommentReplyButtonStruct commentReplyButtonStruct, long j, String str, int i2, String str2) {
        mo44934a_(Integer.valueOf(i), commentReplyButtonStruct.getCommentId(), commentReplyButtonStruct.getTopIds(), Long.valueOf(j), this.f66764j, str, Integer.valueOf(i2), str2);
    }
}
