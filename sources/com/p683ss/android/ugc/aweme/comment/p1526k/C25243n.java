package com.p683ss.android.ugc.aweme.comment.p1526k;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.comment.list.C25269r;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p683ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.k.n */
public final class C25243n implements C25269r {

    /* renamed from: a */
    public List<Comment> f66845a;

    /* renamed from: b */
    private List<CommentReplyListItem> f66846b;

    /* renamed from: c */
    private String f66847c = "";

    /* renamed from: d */
    private int f66848d;

    /* renamed from: e */
    private Comment f66849e;

    /* renamed from: a */
    private void m61366a(Comment comment, List<Comment> list) {
    }

    /* renamed from: c */
    private void m61367c(List<Comment> list) {
    }

    /* renamed from: b */
    public final List<CommentReplyListItem> mo51520b() {
        return this.f66846b;
    }

    /* renamed from: a */
    public final List<Comment> mo51511a() {
        return this.f66845a;
    }

    /* renamed from: c */
    public final void mo51525c() {
        if (this.f66846b == null) {
            this.f66846b = new ArrayList();
        }
        if (this.f66845a == null) {
            this.f66845a = new ArrayList();
        }
        this.f66849e = null;
    }

    /* renamed from: d */
    public final void mo51527d() {
        if (this.f66846b != null) {
            this.f66846b.clear();
        }
        if (this.f66845a != null) {
            this.f66845a.clear();
        }
    }

    /* renamed from: a */
    public final void mo51512a(int i) {
        this.f66848d = i;
    }

    /* renamed from: b */
    public final void mo51523b(List<Comment> list) {
        if (this.f66845a != null) {
            this.f66845a.removeAll(list);
        }
    }

    /* renamed from: b */
    public final List<Comment> mo51521b(String str) {
        try {
            if (C9376b.m18558a((Collection<T>) this.f66846b)) {
                return null;
            }
            return ((CommentReplyListItem) this.f66846b.get(Integer.parseInt(str))).mReplyComments;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    private CommentReplyListItem m61368f(String str) {
        if (this.f66846b == null) {
            return null;
        }
        for (CommentReplyListItem commentReplyListItem : this.f66846b) {
            if (commentReplyListItem.mComment != null && TextUtils.equals(commentReplyListItem.mComment.getCid(), str)) {
                return commentReplyListItem;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final int mo51528e(String str) {
        if (this.f66846b == null) {
            return -1;
        }
        for (int i = 0; i < this.f66846b.size(); i++) {
            CommentReplyListItem commentReplyListItem = (CommentReplyListItem) this.f66846b.get(i);
            if (commentReplyListItem != null && commentReplyListItem.mComment != null && TextUtils.equals(commentReplyListItem.mComment.getCid(), str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo51516a(String str) {
        if (str == null) {
            str = "";
        }
        this.f66847c = str;
    }

    /* renamed from: c */
    public final int mo51524c(String str) {
        int size;
        int i = 0;
        if (!C9376b.m18558a((Collection<T>) this.f66845a)) {
            for (int i2 = 0; i2 < this.f66845a.size(); i2++) {
                Comment comment = (Comment) this.f66845a.get(i2);
                if (TextUtils.equals(comment.getFakeId(), str)) {
                    if (comment.getCommentType() == 2) {
                        CommentReplyListItem f = m61368f(comment.getReplyId());
                        if (f != null) {
                            int indexOf = f.mReplyComments.indexOf(comment);
                            if (f.mButtonStruct != null) {
                                if (indexOf < f.mButtonStruct.getTopSize()) {
                                    f.mButtonStruct.setTopSize(f.mButtonStruct.getTopSize() - 1);
                                }
                                f.mButtonStruct.setExpandSize(f.mButtonStruct.getExpandSize() - 1);
                                f.mButtonStruct.setReplyCommentTotal(f.mComment.getReplyCommentTotal() - 1);
                                if (comment.getReplyCommentTotal() <= ((long) f.mButtonStruct.getTopSize())) {
                                    f.mButtonStruct.setStatus(4);
                                }
                            }
                            f.mComment.setReplyCommentTotal(f.mComment.getReplyCommentTotal() - 1);
                            f.mReplyComments.remove(comment);
                            return 1;
                        }
                    } else if (comment.getCommentType() == 1) {
                        CommentReplyListItem f2 = m61368f(comment.getCid());
                        if (f2 != null) {
                            if (f2.mButtonStruct != null) {
                                size = f2.mButtonStruct.getExpandSize() + 2;
                            } else {
                                size = f2.mReplyComments.size() + 1;
                            }
                            i = size;
                            this.f66846b.remove(f2);
                        }
                        return i;
                    }
                }
            }
        }
        return 0;
    }

    /* renamed from: d */
    public final int mo51526d(String str) {
        int size;
        int i = 0;
        if (!C9376b.m18558a((Collection<T>) this.f66845a)) {
            for (int i2 = 0; i2 < this.f66845a.size(); i2++) {
                Comment comment = (Comment) this.f66845a.get(i2);
                if (TextUtils.equals(comment.getCid(), str)) {
                    if (comment.getCommentType() == 2) {
                        CommentReplyListItem f = m61368f(comment.getReplyId());
                        if (f != null) {
                            int indexOf = f.mReplyComments.indexOf(comment);
                            if (f.mButtonStruct != null) {
                                if (indexOf < f.mButtonStruct.getTopSize()) {
                                    f.mButtonStruct.setTopSize(f.mButtonStruct.getTopSize() - 1);
                                }
                                f.mButtonStruct.setExpandSize(f.mButtonStruct.getExpandSize() - 1);
                                f.mButtonStruct.setReplyCommentTotal(f.mComment.getReplyCommentTotal() - 1);
                                if (comment.getReplyCommentTotal() <= ((long) f.mButtonStruct.getTopSize())) {
                                    f.mButtonStruct.setStatus(4);
                                }
                            }
                            f.mComment.setReplyCommentTotal(f.mComment.getReplyCommentTotal() - 1);
                            f.mReplyComments.remove(comment);
                            return 1;
                        }
                    } else if (comment.getCommentType() == 1) {
                        CommentReplyListItem f2 = m61368f(comment.getCid());
                        if (f2 != null) {
                            if (f2.mButtonStruct != null) {
                                size = f2.mButtonStruct.getExpandSize() + 2;
                            } else {
                                size = f2.mReplyComments.size() + 1;
                            }
                            i = size;
                            this.f66846b.remove(f2);
                        }
                        return i;
                    }
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo51517a(List<Comment> list) {
        int i;
        if (list != null && this.f66846b != null && this.f66845a != null) {
            for (Comment comment : list) {
                CommentReplyListItem commentReplyListItem = new CommentReplyListItem();
                comment.setCommentType(1);
                comment.setNeedHint(TextUtils.equals(this.f66847c, comment.getCid()));
                if (TextUtils.equals(this.f66847c, comment.getCid())) {
                    this.f66849e = comment;
                }
                commentReplyListItem.mComment = comment;
                if (!this.f66846b.contains(commentReplyListItem)) {
                    this.f66846b.add(commentReplyListItem);
                    this.f66845a.add(comment);
                    List replyComments = comment.getReplyComments();
                    if (replyComments == null) {
                        i = 0;
                    } else {
                        i = replyComments.size();
                    }
                    if (i > 0) {
                        for (Comment comment2 : comment.getReplyComments()) {
                            comment2.setCommentType(2);
                            comment2.setNeedHint(TextUtils.equals(this.f66847c, comment2.getCid()));
                            if (TextUtils.equals(this.f66847c, comment2.getCid())) {
                                this.f66849e = comment2;
                            }
                            if (!commentReplyListItem.mReplyComments.contains(comment2)) {
                                commentReplyListItem.mReplyComments.add(comment2);
                                this.f66845a.add(comment2);
                            }
                        }
                        m61366a(comment, comment.getReplyComments());
                    }
                    if (comment.getReplyCommentTotal() - ((long) i) > 0) {
                        CommentReplyButtonStruct commentReplyButtonStruct = new CommentReplyButtonStruct(comment, this.f66846b.size() - 1, true);
                        commentReplyListItem.mButtonStruct = commentReplyButtonStruct;
                        this.f66845a.add(commentReplyButtonStruct);
                    }
                }
            }
            m61367c(this.f66845a);
        }
    }

    /* renamed from: a */
    public final void mo51513a(int i, int i2) {
        if (this.f66845a != null) {
            this.f66845a.subList(Math.max(0, i), Math.min(this.f66845a.size(), i2)).clear();
        }
    }

    /* renamed from: a */
    public final void mo51514a(int i, Comment comment) {
        if (this.f66846b != null && comment != null) {
            CommentReplyListItem commentReplyListItem = new CommentReplyListItem();
            commentReplyListItem.mComment = comment;
            commentReplyListItem.mReplyComments = comment.getReplyComments();
            this.f66846b.add(Math.min(0, this.f66846b.size()), commentReplyListItem);
        }
    }

    /* renamed from: b */
    public final void mo51522b(int i, Comment comment) {
        if (this.f66845a != null && comment != null && i >= 0) {
            List<Comment> list = this.f66845a;
            list.add(Math.min(i, list.size()), comment);
        }
    }

    /* renamed from: a */
    public final void mo51515a(int i, List<Comment> list) {
        if (i >= 0 && list != null && !C9376b.m18558a((Collection<T>) this.f66845a)) {
            Comment comment = (Comment) this.f66845a.get(i);
            if (comment instanceof CommentReplyButtonStruct) {
                this.f66845a.addAll(i, list);
                try {
                    CommentReplyListItem commentReplyListItem = (CommentReplyListItem) this.f66846b.get(Integer.valueOf(comment.getCid()).intValue());
                    if (!commentReplyListItem.mReplyComments.containsAll(list)) {
                        commentReplyListItem.mReplyComments.addAll(list);
                    }
                    m61367c(list);
                    m61366a(commentReplyListItem.mComment, list);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo51519a(String str, String str2) {
        if (this.f66846b == null) {
            return false;
        }
        for (CommentReplyListItem commentReplyListItem : this.f66846b) {
            Comment comment = commentReplyListItem.mComment;
            if (comment != null && TextUtils.equals(comment.getCid(), str2)) {
                List<Comment> list = commentReplyListItem.mReplyComments;
                if (list == null) {
                    return false;
                }
                for (Comment cid : list) {
                    if (TextUtils.equals(cid.getCid(), str)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo51518a(String str, int i, Comment comment) {
        CommentReplyListItem f = m61368f(str);
        if (f == null || i < 0) {
            return false;
        }
        if (f.mButtonStruct != null) {
            f.mButtonStruct.addExpandSize(1);
            f.mButtonStruct.setReplyCommentTotal(f.mButtonStruct.getReplyCommentTotal() + 1);
        }
        if (f.mReplyComments == null) {
            f.mReplyComments = new ArrayList();
        }
        List<Comment> list = f.mReplyComments;
        list.add(Math.min(i, list.size()), comment);
        f.mComment.setReplyCommentTotal(f.mComment.getReplyCommentTotal() + 1);
        if (f.mButtonStruct != null) {
            return true;
        }
        return false;
    }
}
