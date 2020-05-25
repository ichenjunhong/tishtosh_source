package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.content.Context;
import android.graphics.Rect;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.comment.C25273o;
import com.p683ss.android.ugc.aweme.comment.abtest.C25070b;
import com.p683ss.android.ugc.aweme.comment.adapter.C25102a;
import com.p683ss.android.ugc.aweme.comment.list.C25252a;
import com.p683ss.android.ugc.aweme.comment.list.C25254c;
import com.p683ss.android.ugc.aweme.comment.list.C25257f;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import com.p683ss.android.ugc.aweme.comment.p1516a.C25064a;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25243n;
import com.p683ss.android.ugc.aweme.comment.viewmodel.UnReadVideoCommentListViewModel;
import com.p683ss.android.ugc.aweme.comment.widget.CommentNestedLayout;
import com.p683ss.android.ugc.aweme.commercialize.model.C26129j;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27718c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47849eh;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.z */
public class C25393z implements C25252a, C25254c, C25257f, C26846a, C26877c<Comment> {

    /* renamed from: a */
    public String f67168a;

    /* renamed from: b */
    DmtStatusView f67169b;

    /* renamed from: c */
    RecyclerView f67170c;

    /* renamed from: d */
    C25243n f67171d;

    /* renamed from: e */
    private Context f67172e;

    /* renamed from: f */
    private CommentNestedLayout f67173f;

    /* renamed from: g */
    private int f67174g;

    /* renamed from: h */
    private UnReadVideoCommentListViewModel f67175h;

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    public final void ar_() {
    }

    /* renamed from: c */
    public final void mo47029c(List<Comment> list, boolean z) {
    }

    /* renamed from: a */
    public final void mo47018a(List<Comment> list, boolean z) {
        C25102a aVar = (C25102a) mo51968b();
        if (aVar != null) {
            aVar.mo54798c(true);
            if (z) {
                aVar.ao_();
            } else if (!aVar.f66510g) {
                aVar.mo54798c(false);
            } else {
                aVar.an_();
            }
            aVar.mo50303a(list);
            this.f67170c.setVisibility(0);
            this.f67169b.mo19209d();
        }
    }

    /* renamed from: a */
    public final void mo51539a(Object... objArr) {
        C25102a aVar = (C25102a) mo51968b();
        if (aVar != null) {
            String str = objArr[0];
            if (aVar.mo48636c() != 0) {
                int i = 0;
                while (i < aVar.f70670n.size()) {
                    Comment comment = (Comment) aVar.f70670n.get(i);
                    if (comment == null || !C9431p.m18665a(comment.getCid(), str)) {
                        i++;
                    } else {
                        if (comment.getUserBuried() && !comment.isUserDigged()) {
                            comment.setUserBuried(false);
                        }
                        C25070b.m60929a(comment, aVar.f66507d.getAuthorUid());
                        aVar.notifyItemChanged(i, Integer.valueOf(0));
                        C47718bf.m103288a(new C25064a(2, new Object[]{aVar.f66507d.getAid(), comment}));
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo51967a(boolean z, Comment comment) {
        int i;
        if (!z || comment != null) {
            if (z) {
                Rect c = m61791c(comment);
                if (c != null) {
                    int[] iArr = new int[2];
                    this.f67170c.getLocationOnScreen(iArr);
                    i = c.top - iArr[1];
                    int max = Math.max(0, (this.f67170c.computeVerticalScrollRange() - this.f67170c.computeVerticalScrollOffset()) - this.f67170c.getHeight());
                    if (i > max) {
                        this.f67170c.animate().translationY((float) (max - i)).setDuration(300).start();
                        i = max;
                    }
                } else {
                    i = 0;
                }
                this.f67174g = i;
            } else {
                this.f67170c.animate().translationY(0.0f).setDuration(300).start();
                i = -this.f67174g;
                this.f67174g = 0;
            }
            if (this.f67170c != null) {
                this.f67170c.mo4795a(0, i);
            }
        }
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        this.f67170c.setVisibility(0);
        this.f67169b.mo19212f();
    }

    public final void aJ_() {
        mo51966a((List<Comment>) new ArrayList<Comment>());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C1322a mo51968b() {
        C27718c cVar = (C27718c) this.f67170c.getAdapter();
        if (cVar == null) {
            return null;
        }
        return cVar.f72753e;
    }

    /* renamed from: e */
    public final void mo47031e() {
        C25102a aVar = (C25102a) mo51968b();
        if (aVar != null) {
            aVar.am_();
        }
    }

    /* renamed from: c */
    private int m61790c() {
        C27718c cVar = (C27718c) this.f67170c.getAdapter();
        if (cVar == null) {
            return 0;
        }
        return cVar.mo56147b().size();
    }

    /* renamed from: c */
    private Rect m61791c(Comment comment) {
        if (comment == null) {
            return null;
        }
        C1352v d = m61793d(comment);
        if (d != null) {
            return C47849eh.m103494a(d);
        }
        return null;
    }

    /* renamed from: d */
    public final void mo51534d(Exception exc) {
        C22971a.m56494a(this.f67172e, exc, R.string.aod);
    }

    /* renamed from: a */
    static List<Comment> m61787a(C25102a aVar) {
        ArrayList arrayList = new ArrayList();
        List a = aVar.mo50673a();
        if (!C9376b.m18558a((Collection<T>) a)) {
            arrayList.addAll(a);
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m61789b(List<Comment> list) {
        if (C9376b.m18558a((Collection<T>) list)) {
            return false;
        }
        Comment comment = (Comment) list.get(0);
        if (comment == null || comment.getCommentType() != 220) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m61792c(List<Comment> list) {
        for (int i = 0; i < list.size(); i++) {
            if (((Comment) list.get(i)).getCommentType() == 221) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo51962a(Comment comment) {
        int h = C25273o.f66859b.mo51553h(comment);
        C1322a b = mo51968b();
        if (h >= 0 && b != null) {
            b.notifyItemChanged(h, Integer.valueOf(1));
        }
    }

    /* renamed from: d */
    private C1352v m61793d(Comment comment) {
        List list;
        int i;
        C0794k a = C47849eh.m103495a(this.f67170c);
        if (a.f2711a == null || a.f2712b == null) {
            return null;
        }
        if (comment.getCommentType() == 0) {
            C1322a b = mo51968b();
            if (b instanceof C25102a) {
                list = ((C25102a) b).mo50673a();
            } else {
                list = null;
            }
        } else {
            list = this.f67171d.mo51511a();
        }
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        int intValue = ((Integer) a.f2711a).intValue();
        while (intValue <= ((Integer) a.f2712b).intValue() && intValue < i && intValue >= 0) {
            Comment comment2 = (Comment) list.get(intValue);
            if (comment2 != null && comment2.getCid() != null && TextUtils.equals(comment2.getCid(), comment.getCid())) {
                return this.f67170c.mo4847f(intValue + m61790c());
            }
            intValue++;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        mo51965a(exc, (List<Comment>) new ArrayList<Comment>());
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        C25102a aVar = (C25102a) mo51968b();
        if (aVar != null) {
            aVar.co_();
        }
    }

    /* renamed from: a */
    public final void mo51535a(String str) {
        C25102a aVar = (C25102a) mo51968b();
        if (aVar != null) {
            int d = this.f67171d.mo51526d(str);
            int c = aVar.mo48636c();
            if (c != 0 && !TextUtils.isEmpty(str)) {
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= c) {
                        break;
                    }
                    Comment comment = (Comment) aVar.f70670n.get(i2);
                    if (comment != null && C9431p.m18665a(comment.getCid(), str)) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
                aVar.mo51181a(i, d);
            }
            if (aVar.mo48636c() == 0) {
                aVar.mo54798c(false);
                aVar.notifyItemRemoved(0);
                this.f67169b.mo19213g();
            }
            C47718bf.m103288a(new C25064a(4, this.f67168a));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo51969b(Comment comment) {
        int i;
        int i2;
        C25102a aVar = (C25102a) mo51968b();
        if (aVar != null) {
            List<Comment> a = aVar.mo50673a();
            int i3 = 2;
            int i4 = 0;
            if (C9376b.m18558a((Collection<T>) a)) {
                if (this.f67171d.mo51520b() == null) {
                    this.f67171d.mo51525c();
                    this.f67171d.f66845a = a;
                }
                this.f67171d.mo51514a(0, comment);
                aVar.mo51186a(comment, 0);
                this.f67170c.setVisibility(0);
                this.f67169b.mo19209d();
            } else if (a.size() == 2 && m61789b(a) && m61792c(a)) {
                if (this.f67171d.mo51520b() == null) {
                    this.f67171d.mo51525c();
                    this.f67171d.f66845a = a;
                }
                this.f67171d.mo51514a(0, comment);
                aVar.mo51186a(comment, 2);
                this.f67169b.mo19209d();
                C25273o.f66859b.mo51545a(comment, i3);
            } else if (a.size() != 1 || (!m61789b(a) && !m61792c(a))) {
                if (comment.getCommentType() == 2) {
                    String replyToReplyCommentId = comment.getReplyToReplyCommentId();
                    if (TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId())) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                    int a2 = aVar.mo51180a(replyToReplyCommentId, i2);
                    if (a2 >= 0) {
                        int i5 = a2 + 1;
                        while (true) {
                            if (i5 >= aVar.mo50673a().size()) {
                                i5 = -1;
                                break;
                            } else if (aVar.getItemViewType(i5) != 2) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (i5 < 0) {
                            i5 = aVar.mo50673a().size();
                        }
                        this.f67171d.mo51518a(comment.getReplyId(), (i5 - aVar.mo51180a(comment.getReplyId(), 1)) - 1, comment);
                        aVar.mo51186a(comment, i5);
                        this.f67170c.mo4814b(m61790c() + i5 + 1);
                        i3 = i5;
                    }
                } else {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f67170c.getLayoutManager();
                    if (linearLayoutManager == null) {
                        i = -1;
                    } else {
                        i = linearLayoutManager.mo4749j();
                    }
                    Rect rect = null;
                    if (i != -1) {
                        View c = linearLayoutManager.mo4736c(i);
                        if (c != null) {
                            rect = new Rect();
                            c.getHitRect(rect);
                        }
                    }
                    if (!(i == -1 || rect == null)) {
                        linearLayoutManager.mo4721a(i + 1, rect.top);
                    }
                    this.f67170c.mo4814b(0);
                    this.f67171d.mo51514a(0, comment);
                    if (a.get(0) instanceof C26129j) {
                        i4 = 1;
                    }
                    if (m61789b(a) && i4 == 0) {
                        i4++;
                    }
                    if (m61792c(a)) {
                        i4++;
                    }
                    i3 = i4;
                    aVar.mo51186a(comment, i3);
                }
                C25273o.f66859b.mo51545a(comment, i3);
            } else {
                if (this.f67171d.mo51520b() == null) {
                    this.f67171d.mo51525c();
                    this.f67171d.f66845a = a;
                }
                this.f67171d.mo51514a(0, comment);
                aVar.mo51186a(comment, 1);
                this.f67169b.mo19209d();
                i3 = 1;
                C25273o.f66859b.mo51545a(comment, i3);
            }
            i3 = 0;
            C25273o.f66859b.mo51545a(comment, i3);
        }
    }

    /* renamed from: a */
    public final void mo51966a(List<Comment> list) {
        C25102a aVar = (C25102a) mo51968b();
        if (aVar != null) {
            int i = 0;
            aVar.mo54798c(false);
            aVar.mo50303a(list);
            this.f67169b.mo19213g();
            RecyclerView recyclerView = this.f67170c;
            if (!m61789b(list) && !m61792c(list)) {
                i = 8;
            }
            recyclerView.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final void mo51965a(Exception exc, List<Comment> list) {
        C25102a aVar = (C25102a) mo51968b();
        if (aVar != null) {
            if (aVar.f70699x) {
                aVar.mo54798c(false);
            }
            aVar.mo50303a(list);
            if (exc instanceof C23459a) {
                this.f67169b.mo19213g();
                this.f67170c.setVisibility(8);
                if (((C23459a) exc).getErrorCode() == 14) {
                    C22971a.m56493a(this.f67172e, (Throwable) exc);
                }
            } else {
                this.f67169b.mo19214h();
                this.f67170c.setVisibility(8);
            }
        }
    }

    /* renamed from: b */
    public final void mo47026b(List<Comment> list, boolean z) {
        C25102a aVar = (C25102a) mo51968b();
        if (aVar != null) {
            aVar.mo54798c(true);
            if (list == null || list.isEmpty()) {
                z = false;
            }
            if (z) {
                aVar.ao_();
            } else if (!aVar.f66510g) {
                aVar.mo54798c(false);
            } else {
                aVar.an_();
            }
            aVar.mo50304b(list);
        }
    }

    /* renamed from: a */
    public final void mo51538a(String str, Exception exc) {
        C25102a aVar = (C25102a) mo51968b();
        if (aVar != null) {
            List a = this.f67171d.mo51511a();
            if (a != null) {
                int i = R.string.apn;
                int i2 = 0;
                while (true) {
                    if (i2 >= a.size()) {
                        break;
                    }
                    Comment comment = (Comment) a.get(i2);
                    if (TextUtils.equals(str, comment.getCid())) {
                        if (comment.isUserDigged()) {
                            i = R.string.f6x;
                        }
                        aVar.notifyItemChanged(i2);
                    } else {
                        i2++;
                    }
                }
                C22971a.m56494a(this.f67172e, exc, i);
            }
        }
    }

    /* renamed from: a */
    public final void mo51963a(Comment comment, int i, int i2) {
        mo51964a(comment, i, i2, false);
    }

    /* renamed from: b */
    static boolean m61788b(Comment comment, int i, int i2) {
        int h = C25273o.f66859b.mo51553h(comment);
        if (h != -1 && i >= 0 && i2 >= 0 && h >= i && h <= i2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo51533a(String str, String str2, String str3, String str4) {
        C25102a aVar = (C25102a) mo51968b();
        if (aVar != null) {
            aVar.mo51187a(str);
        }
    }

    /* renamed from: a */
    public final void mo51964a(Comment comment, int i, int i2, boolean z) {
        int i3;
        int i4;
        if (comment != null) {
            if (!C25273o.f66859b.mo51547a(comment)) {
                mo51969b(comment);
            }
            C25273o.f66859b.mo51555j(comment);
            C25273o.f66859b.mo51551f(comment);
            int h = C25273o.f66859b.mo51553h(comment);
            C1322a b = mo51968b();
            if (b instanceof C25102a) {
                C25102a aVar = (C25102a) b;
                List a = aVar.mo50673a();
                if (a != null && h >= 0 && h <= a.size() - 1) {
                    a.set(h, comment);
                    aVar.notifyItemChanged(h);
                }
            }
            List a2 = this.f67171d.mo51511a();
            if (a2 != null) {
                int i5 = 0;
                while (true) {
                    if (i5 >= a2.size()) {
                        break;
                    } else if (TextUtils.equals(((Comment) a2.get(i5)).getFakeId(), comment.getFakeId())) {
                        a2.set(i5, comment);
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            List b2 = this.f67171d.mo51520b();
            if (b2 != null) {
                Iterator it = b2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CommentReplyListItem commentReplyListItem = (CommentReplyListItem) it.next();
                    if (TextUtils.equals(commentReplyListItem.mComment.getFakeId(), comment.getFakeId())) {
                        commentReplyListItem.mComment = comment;
                    } else if (TextUtils.equals(commentReplyListItem.mComment.getCid(), comment.getReplyId())) {
                        List<Comment> list = commentReplyListItem.mReplyComments;
                        if (list == null) {
                            i4 = 0;
                        } else {
                            i4 = list.size();
                        }
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i4) {
                                break;
                            } else if (TextUtils.equals(((Comment) list.get(i6)).getFakeId(), comment.getFakeId())) {
                                list.set(i6, comment);
                                break;
                            } else {
                                i6++;
                            }
                        }
                    }
                }
            }
            if (m61788b(comment, i, i2)) {
                Context context = this.f67170c.getContext();
                if (z) {
                    i3 = R.string.b66;
                } else {
                    i3 = R.string.a9j;
                }
                C10691a.m21533a(context, i3).mo19066a();
            }
            C25273o.f66859b.mo51552g(comment);
            this.f67170c.setVisibility(0);
            C23324d.m57378a().increaseCommentCount(this.f67168a);
            this.f67169b.mo19209d();
        }
    }

    public C25393z(Context context, DmtStatusView dmtStatusView, RecyclerView recyclerView, C25243n nVar, CommentNestedLayout commentNestedLayout) {
        this.f67172e = context;
        this.f67169b = dmtStatusView;
        this.f67170c = recyclerView;
        this.f67171d = nVar;
        this.f67173f = commentNestedLayout;
        this.f67175h = UnReadVideoCommentListViewModel.m61819a((FragmentActivity) context, C25393z.class.getSimpleName());
    }
}
