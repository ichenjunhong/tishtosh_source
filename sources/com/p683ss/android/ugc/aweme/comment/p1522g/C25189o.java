package com.p683ss.android.ugc.aweme.comment.p1522g;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.comment.api.CommentApi;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p683ss.android.ugc.aweme.net.C37776h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p001a.C0011g;

/* renamed from: com.ss.android.ugc.aweme.comment.g.o */
public final class C25189o extends C25182h {
    public final List<Comment> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((CommentItemList) this.mData).items;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 8) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51434a(List<Comment> list) {
        if (!C9376b.m18558a((Collection<T>) list)) {
            ((CommentItemList) this.mData).replyStyle = 2;
            if (this.mListQueryType == 4) {
                ((CommentItemList) this.mData).items = new ArrayList();
            }
            for (Comment comment : list) {
                comment.setCommentType(2);
                ((CommentItemList) this.mData).items.add(comment);
            }
        }
    }

    public final void loadMoreList(Object... objArr) {
        String valueOf;
        if (objArr[5] == null) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(objArr[5]);
        }
        m61243a(String.valueOf(objArr[1]), objArr[3].longValue(), 3, String.valueOf(objArr[2]), String.valueOf(objArr[4]), valueOf, objArr[6].intValue(), (String) objArr[7]);
    }

    public final void refreshList(Object... objArr) {
        String valueOf;
        if (objArr[5] == null) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(objArr[5]);
        }
        m61243a(String.valueOf(objArr[1]), objArr[3].longValue(), 3, String.valueOf(objArr[2]), String.valueOf(objArr[4]), valueOf, objArr[6].intValue(), (String) objArr[7]);
    }

    /* renamed from: a */
    private void m61243a(String str, long j, int i, String str2, String str3, String str4, int i2, String str5) {
        this.f66738c = "reply";
        StringBuilder sb = new StringBuilder("CommentReplyListModel: fetchList: aid = ");
        sb.append(this.f66737b);
        sb.append(" commentId = ");
        String str6 = str;
        sb.append(str);
        CommentApi.m61042a(str, j, 3, str2, str3, str4, i2, str5).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
    }
}
