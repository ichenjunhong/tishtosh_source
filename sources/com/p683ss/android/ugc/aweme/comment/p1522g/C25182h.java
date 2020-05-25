package com.p683ss.android.ugc.aweme.comment.p1522g;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.comment.api.CommentApi;
import com.p683ss.android.ugc.aweme.comment.list.C25269r;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p683ss.android.ugc.aweme.comment.p1524i.C25209c;
import com.p683ss.android.ugc.aweme.comment.p1524i.C25209c.C25210a;
import com.p683ss.android.ugc.aweme.emoji.p1681b.C29294a;
import com.p683ss.android.ugc.aweme.net.C37776h;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.comment.g.h */
public class C25182h extends C25173a<Comment, CommentItemList> {

    /* renamed from: b */
    public String f66737b;

    /* renamed from: c */
    protected String f66738c;

    /* renamed from: d */
    public String f66739d;

    /* renamed from: e */
    public C25269r f66740e;

    /* renamed from: f */
    public long f66741f;

    /* renamed from: g */
    private int f66742g;

    /* renamed from: h */
    private boolean f66743h = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);

    /* renamed from: b */
    public final long mo51436b() {
        if (this.mData == null) {
            return 0;
        }
        return ((CommentItemList) this.mData).total;
    }

    public boolean isHasMore() {
        if (this.mData == null || !((CommentItemList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo51435a() {
        if (TextUtils.equals(this.f66738c, "v1") || TextUtils.equals(this.f66738c, "v2")) {
            return true;
        }
        return false;
    }

    public List<Comment> getItems() {
        if (this.mData == null) {
            return null;
        }
        if (((CommentItemList) this.mData).replyStyle != 2 || this.f66740e == null) {
            return ((CommentItemList) this.mData).items;
        }
        return this.f66740e.mo51511a();
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 8) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo51423a(CommentItemList commentItemList) {
        int i;
        if (this.f66737b != null) {
            this.f66724a.mo51468b(this.f66737b);
        }
        this.f66724a.mo51465a(this.f66738c);
        if (commentItemList != null) {
            this.f66724a.mo51467b(commentItemList.total);
            C25209c cVar = this.f66724a;
            if (commentItemList.items == null) {
                i = 0;
            } else {
                i = commentItemList.items.size();
            }
            cVar.mo51462a(i);
            this.f66724a.mo51463a(commentItemList.cursor);
        }
        this.f66724a.mo51466b();
    }

    public void refreshList(Object... objArr) {
        m61222a((String) objArr[1], 0, 20, objArr[2].intValue(), (String) objArr[3], (String) objArr[4], (Long) objArr[5], objArr[6].intValue(), (String) objArr[7], 0, 0);
    }

    public void loadMoreList(Object... objArr) {
        long j;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((CommentItemList) this.mData).cursor;
        }
        m61222a(str, j, 20, objArr[2].intValue(), (String) objArr[3], (String) objArr[4], (Long) objArr[5], objArr[6].intValue(), (String) objArr[7], ((CommentItemList) this.mData).hotsoonFilteredCount, ((CommentItemList) this.mData).hotsoonHasMore);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo51434a(List<Comment> list) {
        if (!C9376b.m18558a((Collection<T>) list)) {
            if (((CommentItemList) this.mData).replyStyle != 2 || this.f66740e == null) {
                for (Comment comment : list) {
                    if (!C9376b.m18558a((Collection<T>) comment.getReplyComments())) {
                        Comment comment2 = (Comment) comment.getReplyComments().get(0);
                        ArrayList arrayList = new ArrayList();
                        comment.setReplyComments(null);
                        arrayList.add(comment);
                        comment2.setReplyComments(arrayList);
                        comment = comment2;
                    }
                    comment.setNeedHint(TextUtils.equals(this.f66739d, comment.getCid()));
                    if (!((CommentItemList) this.mData).items.contains(comment)) {
                        comment.setCommentType(0);
                        ((CommentItemList) this.mData).items.add(comment);
                    }
                }
                return;
            }
            this.f66740e.mo51525c();
            this.f66740e.mo51516a(this.f66739d);
            this.f66740e.mo51512a(this.f66742g);
            if (this.mListQueryType == 1) {
                this.f66740e.mo51527d();
            }
            this.f66740e.mo51517a(list);
        }
    }

    public /* synthetic */ void handleData(Object obj) {
        boolean z;
        CommentItemList commentItemList = (CommentItemList) obj;
        C25209c cVar = this.f66724a;
        cVar.f66792a.put("Duration", String.valueOf(System.currentTimeMillis() - cVar.f66793b));
        if (commentItemList != null) {
            if (commentItemList.newInsertIds != null) {
                this.f66739d = commentItemList.newInsertIds;
            }
            this.f66724a.mo51464a((BaseResponse) commentItemList);
        }
        mo51423a(commentItemList);
        if (mo51435a() && this.f66741f != 0) {
            if (commentItemList == null) {
                C25210a.m61314a(this.f66738c, this.f66737b, this.f66741f, 102, "", "");
            } else if (C9376b.m18558a((Collection<T>) commentItemList.items)) {
                C25210a.m61314a(this.f66738c, this.f66737b, this.f66741f, BaseNotice.HASHTAG, "", "");
            }
        }
        boolean z2 = false;
        if (commentItemList == null || (C9376b.m18558a((Collection<T>) commentItemList.items) && this.mListQueryType == 4)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!(this.mData == null || commentItemList == null)) {
            ((CommentItemList) this.mData).hotsoonFilteredCount = commentItemList.hotsoonFilteredCount;
            ((CommentItemList) this.mData).hotsoonHasMore = commentItemList.hotsoonHasMore;
            ((CommentItemList) this.mData).hotsoonText = commentItemList.hotsoonText;
        }
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                List<Comment> list = commentItemList.items;
                this.mData = commentItemList;
                ((CommentItemList) this.mData).items = new ArrayList();
                mo51434a(list);
            } else if (i == 4) {
                mo51434a(commentItemList.items);
                ((CommentItemList) this.mData).total = commentItemList.total;
                ((CommentItemList) this.mData).cursor = commentItemList.cursor;
                CommentItemList commentItemList2 = (CommentItemList) this.mData;
                if (commentItemList.hasMore && ((CommentItemList) this.mData).hasMore) {
                    z2 = true;
                }
                commentItemList2.hasMore = z2;
            }
        } else if (this.mData != null) {
            if (this.mListQueryType == 1) {
                List<Comment> list2 = commentItemList.items;
                this.mData = commentItemList;
                ((CommentItemList) this.mData).items = new ArrayList();
                mo51434a(list2);
            }
            ((CommentItemList) this.mData).hasMore = false;
        }
        C29294a.f76673a.mo59241a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo51433a(String str, long j, int i, Long l, int i2, String str2, int i3, int i4) throws Exception {
        int i5;
        StringBuilder sb = new StringBuilder("CommentFetchModel: fetchList task call: aid = ");
        sb.append(this.f66737b);
        sb.append(" insertCids = ");
        sb.append(str);
        this.f66738c = "v2";
        if (C20854a.m53167g().isUidContactPermisioned()) {
            i5 = 1;
        } else {
            i5 = 2;
        }
        CommentApi.m61041a(this.f66737b, j, i, str, i5, C47945d.m103733b(), l, i2, str2, i3, i4).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
        return null;
    }

    /* renamed from: a */
    private void m61222a(String str, long j, int i, int i2, String str2, String str3, Long l, int i3, String str4, int i4, int i5) {
        int i6;
        String str5 = str3;
        this.f66737b = str;
        this.f66739d = str5;
        this.f66742g = i3;
        if (this.f66743h) {
            C25183i iVar = new C25183i(this, str3, j, 20, l, i3, str4, i4, i5);
            C0013i.m18a((Callable<TResult>) iVar, (Executor) C24076h.m58902c());
            return;
        }
        StringBuilder sb = new StringBuilder("CommentFetchModel: fetchList: aid = ");
        sb.append(this.f66737b);
        sb.append(" insertCids = ");
        sb.append(str5);
        this.f66738c = "v2";
        if (C20854a.m53167g().isUidContactPermisioned()) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        CommentApi.m61041a(this.f66737b, j, 20, str3, i6, C47945d.m103733b(), l, i3, str4, i4, i5).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
    }
}
