package com.p683ss.android.ugc.aweme.forward.p1773a;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.comment.list.C25261j;
import com.p683ss.android.ugc.aweme.comment.list.C25264m;
import com.p683ss.android.ugc.aweme.comment.list.C25267p;
import com.p683ss.android.ugc.aweme.comment.list.C25268q;
import com.p683ss.android.ugc.aweme.comment.list.C25269r;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25147a;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.feed.C30303h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31756c;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31758e;
import com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31782a;
import com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31804o;
import com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31805p;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;
import com.p683ss.android.ugc.aweme.forward.model.C32414b;
import com.p683ss.android.ugc.aweme.forward.p1779vh.BaseForwardViewHolder;
import com.p683ss.android.ugc.aweme.forward.p1779vh.C32432e;
import com.p683ss.android.ugc.aweme.forward.p1779vh.C32435h;
import com.p683ss.android.ugc.aweme.forward.p1779vh.C32436i;
import com.p683ss.android.ugc.aweme.story.api.C46628f;
import com.p683ss.android.ugc.aweme.story.api.p2334b.C46624b;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.forward.a.a */
public final class C32374a extends C26840g<C32414b> implements C0199s<C46624b>, C31756c {

    /* renamed from: A */
    private C31848j f84256A;

    /* renamed from: B */
    private RecyclerView f84257B;

    /* renamed from: C */
    private HashMap<Long, Long> f84258C = new HashMap<>();

    /* renamed from: D */
    private C46628f f84259D;

    /* renamed from: a */
    public C31758e f84260a;

    /* renamed from: b */
    public C25147a f84261b;

    /* renamed from: c */
    public C31754a f84262c;

    /* renamed from: d */
    protected C30303h f84263d;

    /* renamed from: e */
    public C31755b f84264e;

    /* renamed from: f */
    public C31782a f84265f;

    /* renamed from: g */
    public BaseForwardViewHolder f84266g;

    /* renamed from: h */
    public String f84267h;

    /* renamed from: i */
    public String f84268i;

    /* renamed from: j */
    public String f84269j;

    /* renamed from: k */
    public int f84270k;

    /* renamed from: l */
    public Aweme f84271l;

    /* renamed from: m */
    public Aweme f84272m;

    /* renamed from: y */
    public String f84273y;

    /* renamed from: z */
    public C25269r f84274z;

    /* renamed from: a */
    public final void mo65512a(Exception exc, Aweme aweme, int i) {
        if (aweme != null && this.f84265f != null) {
            this.f84265f.mo64768b(aweme);
            C22971a.m56494a(this.f84264e.mo64656c(), exc, i == 1 ? R.string.apn : R.string.f6x);
        }
    }

    /* renamed from: a */
    public final void mo65513a(boolean z) {
        if (this.f84258C != null) {
            for (Entry entry : this.f84258C.entrySet()) {
                Long l = (Long) entry.getKey();
                if (z) {
                    m74720a(l.longValue(), System.currentTimeMillis());
                } else {
                    Comment comment = new Comment();
                    comment.setCid(String.valueOf(l));
                    int indexOf = this.f70670n.indexOf(new C32414b(comment));
                    if (indexOf >= 0 && indexOf < this.f70670n.size()) {
                        m74721a(((C32414b) this.f70670n.get(indexOf)).getComment());
                    }
                    entry.setValue(Long.valueOf(0));
                }
            }
        }
    }

    public final void ba_() {
        if (this.f84265f != null) {
            this.f84265f.mo64745J();
        }
        if (this.f84266g != null) {
            this.f84266g.ba_();
        }
        mo65513a(false);
    }

    public final void bb_() {
        if (this.f84265f != null) {
            this.f84265f.mo64747L();
        }
        if (this.f84266g != null) {
            this.f84266g.bb_();
        }
        if (this.f84256A != null) {
            this.f84256A.mo64968h();
        }
        mo65513a(true);
    }

    /* renamed from: k */
    public final void mo56247k() {
        if (this.f84256A != null) {
            this.f84256A.mo64966f();
        }
        if (this.f84259D != null) {
            this.f84259D.mo93438a().removeObserver(this);
        }
    }

    /* renamed from: b */
    public boolean mo65515b(int i) {
        int a = mo48641a(i);
        if (a == 0 || a == 1 || a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo51179a(View view) {
        if (view == null) {
            return 0;
        }
        return (int) C9432q.m18687b(view.getContext(), 75.0f);
    }

    /* renamed from: e */
    public static List<C32414b> m74722e(List<Comment> list) {
        ArrayList arrayList = new ArrayList();
        if (!C9376b.m18558a((Collection<T>) list)) {
            for (Comment bVar : list) {
                arrayList.add(new C32414b(bVar));
            }
        }
        return arrayList;
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        Comment comment;
        long j;
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof C25267p) {
            comment = ((C25267p) vVar).mo51162f();
        } else if (vVar instanceof C25264m) {
            comment = ((C25264m) vVar).mo51140c();
        } else {
            comment = null;
        }
        if (comment != null && comment.getUser() != null) {
            try {
                j = Long.parseLong(comment.getCid());
            } catch (Exception unused) {
                j = 0;
            }
            if (j != 0) {
                m74720a(j, System.currentTimeMillis());
            }
        }
    }

    public final void onViewDetachedFromWindow(C1352v vVar) {
        Comment comment;
        long j;
        super.onViewDetachedFromWindow(vVar);
        if (vVar instanceof C25268q) {
            comment = ((C25268q) vVar).mo51162f();
        } else if (vVar instanceof C25264m) {
            comment = ((C25264m) vVar).mo51140c();
        } else {
            comment = null;
        }
        if (comment != null && comment != null && comment.getUser() != null) {
            try {
                j = Long.parseLong(comment.getCid());
            } catch (Exception unused) {
                j = 0;
            }
            m74721a(comment);
            this.f84258C.remove(Long.valueOf(j));
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        C46624b bVar = (C46624b) obj;
        if (!C9376b.m18558a((Collection<T>) this.f70670n)) {
            for (C32414b aweme : this.f70670n) {
                Aweme aweme2 = aweme.getAweme();
                if (!(aweme2 == null || aweme2.getAuthor() == null || !TextUtils.equals(bVar.f117625a, aweme2.getAuthor().getUid()))) {
                    aweme2.getAuthor().setHasUnreadStory(!bVar.f117626b);
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        C32414b bVar = (C32414b) this.f70670n.get(i);
        if (bVar == null) {
            return -1;
        }
        if (bVar.getType() == 1) {
            if (bVar.getComment() != null) {
                int commentType = bVar.getComment().getCommentType();
                if (commentType == 11) {
                    return 11;
                }
                switch (commentType) {
                    case 0:
                        return 0;
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                }
            }
            return 0;
        }
        if (bVar.getType() == 0) {
            Aweme aweme = bVar.getAweme();
            if (aweme.getAwemeType() == 0 || aweme.getAwemeType() == 51 || aweme.getAwemeType() == 52 || aweme.getAwemeType() == 54 || aweme.getAwemeType() == 53 || aweme.getAwemeType() == 55 || aweme.getAwemeType() == 56) {
                return 16;
            }
            if (aweme.getAwemeType() == 2) {
                return 17;
            }
            if (aweme.getAwemeType() == 13) {
                if (aweme.getForwardItem() == null) {
                    return 20;
                }
                if (aweme.getForwardItem().getAwemeType() == 0 || aweme.getForwardItem().getAwemeType() == 51 || aweme.getForwardItem().getAwemeType() == 52 || aweme.getForwardItem().getAwemeType() == 54 || aweme.getForwardItem().getAwemeType() == 53 || aweme.getForwardItem().getAwemeType() == 55 || aweme.getAwemeType() == 56) {
                    return 18;
                }
                if (aweme.getForwardItem().getAwemeType() == 2) {
                    return 19;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    private void m74721a(Comment comment) {
        long j;
        String str;
        String str2;
        int i;
        String valueOf;
        String valueOf2;
        String str3;
        String str4;
        String str5;
        String cid;
        Comment comment2 = comment;
        if (comment2 != null && !TextUtils.isEmpty(this.f84267h)) {
            try {
                j = Long.parseLong(comment.getCid());
            } catch (Exception unused) {
                j = 0;
            }
            if (this.f84258C != null && this.f84258C.get(Long.valueOf(j)) != null && ((Long) this.f84258C.get(Long.valueOf(j))).longValue() > 10) {
                long currentTimeMillis = System.currentTimeMillis() - ((Long) this.f84258C.get(Long.valueOf(j))).longValue();
                if (currentTimeMillis > 30) {
                    String str6 = "";
                    int i2 = -1;
                    if (comment.getCommentType() == 2) {
                        String replyId = comment.getReplyId();
                        int e = this.f84274z.mo51528e(replyId);
                        String cid2 = comment.getCid();
                        List b = this.f84274z.mo51521b(String.valueOf(e));
                        if (b != null) {
                            i2 = b.indexOf(comment2);
                        }
                        str2 = replyId;
                        str = cid2;
                        i = e;
                    } else {
                        if (comment.getCommentType() == 1) {
                            cid = comment.getCid();
                            i = this.f84274z.mo51528e(cid);
                        } else {
                            cid = comment.getCid();
                            i = this.f70670n.indexOf(new C32414b(comment2)) - 1;
                        }
                        str = str6;
                        str2 = cid;
                    }
                    if (TextUtils.isEmpty(comment.getLabelText())) {
                        valueOf = "";
                    } else {
                        valueOf = String.valueOf(comment.getLabelType());
                    }
                    String str7 = valueOf;
                    if (comment.getRelationLabel() == null) {
                        valueOf2 = "";
                    } else {
                        valueOf2 = String.valueOf(comment.getRelationLabel().getType());
                    }
                    String str8 = valueOf2;
                    if (comment.getUser() == null || comment.getUser().getUid() == null) {
                        str3 = "";
                    } else {
                        str3 = comment.getUser().getUid();
                    }
                    String str9 = "";
                    if (TextUtils.equals(this.f84271l.getAid(), str3)) {
                        str5 = "creator";
                    } else if (C47915gg.m103655d(comment.getUser())) {
                        str5 = "friends";
                    } else if (C47915gg.m103663l(comment.getUser())) {
                        str5 = "following";
                    } else {
                        str4 = str9;
                        C25280a.m61493a().sendCommentDurationEvent(this.f84267h, this.f84271l.getAid(), str2, i + 1, str, i2 + 1, currentTimeMillis, "", str7, str8, str3, str4);
                    }
                    str4 = str5;
                    C25280a.m61493a().sendCommentDurationEvent(this.f84267h, this.f84271l.getAid(), str2, i + 1, str, i2 + 1, currentTimeMillis, "", str7, str8, str3, str4);
                }
            }
        }
    }

    /* renamed from: a */
    private void m74720a(long j, long j2) {
        this.f84258C.put(Long.valueOf(j), Long.valueOf(j2));
    }

    /* renamed from: a */
    public static List<C32414b> m74719a(Aweme aweme, List<Comment> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C32414b(aweme));
        if (!C9376b.m18558a((Collection<T>) list)) {
            for (Comment bVar : list) {
                arrayList.add(new C32414b(bVar));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final int mo65514b(String str, int i) {
        if (mo48636c() == 0) {
            return -1;
        }
        for (int i2 = 0; i2 < mo50673a().size(); i2++) {
            Comment comment = ((C32414b) mo50673a().get(i2)).getComment();
            if (mo48641a(i2) == i && comment != null && TextUtils.equals(comment.getCid(), str)) {
                return i2;
            }
        }
        return -1;
    }

    public C32374a(RecyclerView recyclerView, C30303h hVar) {
        C46628f fVar;
        this.f84257B = recyclerView;
        this.f84256A = new C31848j(recyclerView);
        this.f84263d = hVar;
        Object a = C27991b.m66756a(C46628f.class);
        if (a != null) {
            fVar = (C46628f) a;
        } else {
            fVar = (C46628f) C20302a.m50070a(C46628f.class).mo42947a(new C20310d()).mo42946a().mo42948b();
        }
        this.f84259D = fVar;
        if (this.f84259D != null) {
            this.f84259D.mo93438a().observe((C0184k) C23729p.m58248a(this.f84257B.getContext()), this);
        }
    }

    /* renamed from: a */
    public final int mo65511a(String str, int i) {
        if (mo48636c() == 0 || TextUtils.isEmpty(str)) {
            return -1;
        }
        for (int i2 = 0; i2 < mo50673a().size(); i2++) {
            if (mo65515b(i2)) {
                Comment comment = ((C32414b) mo50673a().get(i2)).getComment();
                if (comment != null && C9431p.m18665a(comment.getCid(), str)) {
                    if (i > 1) {
                        List list = this.f70670n;
                        list.subList(i2, Math.min(list.size(), i + i2)).clear();
                        notifyItemRangeRemoved(i2, i);
                    } else {
                        if (i2 > 0) {
                            notifyItemChanged(i2 - 1);
                        }
                        this.f70670n.remove(i2);
                        notifyItemRemoved(i2);
                    }
                    notifyItemRangeChanged(i2, mo50673a().size() - i2);
                    return i2;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        if (i == 11) {
            return (C1352v) C25280a.m61493a().providerCommentReplyButtonViewHolder(viewGroup, this.f84261b);
        }
        boolean z = true;
        switch (i) {
            case 1:
                z = false;
                break;
            case 2:
                C25264m providerCommentReplyViewHolder = C25280a.m61493a().providerCommentReplyViewHolder(viewGroup, this.f84261b);
                providerCommentReplyViewHolder.mo51141c(this.f84271l.getAuthorUid());
                providerCommentReplyViewHolder.mo51139b(this.f84271l.getAid());
                providerCommentReplyViewHolder.mo51137a(this.f84267h);
                return (C1352v) providerCommentReplyViewHolder;
            default:
                switch (i) {
                    case 16:
                        C31805p pVar = new C31805p((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false), this.f84264e, this.f84256A, this.f84262c);
                        pVar.f83026af = false;
                        this.f84265f = pVar;
                        return pVar;
                    case 17:
                        C31804o oVar = new C31804o((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false), this.f84264e, this.f84256A, this.f84262c);
                        oVar.f83026af = false;
                        this.f84265f = oVar;
                        return oVar;
                    case 18:
                        C32436i iVar = new C32436i((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false), this.f84264e, this.f84256A, this.f84260a, this.f84262c);
                        iVar.mo65667f(1);
                        this.f84266g = iVar;
                        return iVar;
                    case 19:
                        C32432e eVar = new C32432e((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false), this.f84264e, this.f84256A, this.f84260a, this.f84262c);
                        eVar.mo65667f(1);
                        this.f84266g = eVar;
                        return eVar;
                    case 20:
                        C32435h hVar = new C32435h((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false), this.f84264e, this.f84256A, this.f84260a, this.f84262c);
                        hVar.mo65667f(1);
                        this.f84266g = hVar;
                        return hVar;
                }
        }
        C25268q providerCommentViewHolderFollowFeed = C25280a.m61493a().providerCommentViewHolderFollowFeed(viewGroup, this.f84261b, C20902b.m53242a().getCurUserId());
        providerCommentViewHolderFollowFeed.mo51155a(z);
        providerCommentViewHolderFollowFeed.mo51154a(this.f84267h);
        providerCommentViewHolderFollowFeed.mo51150a(this.f84270k);
        providerCommentViewHolderFollowFeed.mo51158c(this.f84271l.getAuthorUid());
        providerCommentViewHolderFollowFeed.mo51157b(this.f84271l.getAid());
        return (C1352v) providerCommentViewHolderFollowFeed;
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        int a = mo48641a(i);
        if (a != 2) {
            if (a != 11) {
                switch (a) {
                    case 16:
                    case 17:
                        C31782a aVar = (C31782a) vVar;
                        aVar.f83012T = this.f84270k;
                        aVar.f83013U = C22858c.f61208d;
                        aVar.f83011S = this.f84267h;
                        aVar.f83028ah = this.f84273y;
                        aVar.mo64762a(((C32414b) this.f70670n.get(i)).getAweme(), new ArrayList(), null, this.f84260a);
                        aVar.f83029ai = this.f84268i;
                        aVar.f83031ak = this.f84269j;
                        aVar.mo64761a(this.f84272m);
                        return;
                    case 18:
                    case 19:
                    case 20:
                        if (((C32414b) this.f70670n.get(i)).getAweme() != null) {
                            BaseForwardViewHolder baseForwardViewHolder = (BaseForwardViewHolder) vVar;
                            baseForwardViewHolder.f84367K = this.f84267h;
                            baseForwardViewHolder.mo65657a(((C32414b) this.f70670n.get(i)).getAweme(), new ArrayList(), null, this.f84267h, this.f84268i);
                            return;
                        }
                        break;
                    default:
                        C25268q qVar = (C25268q) vVar;
                        if (mo48641a(i) != 1 || i >= mo48636c() - 1 || mo48641a(i + 1) == 1) {
                            qVar.mo51163g().setPadding(0, 0, 0, 0);
                        } else {
                            qVar.mo51163g().setPadding(0, 0, 0, C23728o.m58241a(10.0d));
                        }
                        qVar.mo51152a(((C32414b) mo50673a().get(i)).getComment());
                        break;
                }
            } else {
                ((C25261j) vVar).mo51133a((CommentReplyButtonStruct) ((C32414b) this.f70670n.get(i)).getComment());
            }
        } else if (this.f70670n.get(i) != null) {
            C25264m mVar = (C25264m) vVar;
            mVar.mo51136a(((C32414b) this.f70670n.get(i)).getComment());
            mVar.mo51137a(this.f84267h);
        }
    }

    public final void onBindViewHolder(C1352v vVar, int i, List list) {
        super.onBindViewHolder(vVar, i, list);
        if (!list.isEmpty() && (list.get(0) instanceof Integer) && ((Integer) list.get(0)).intValue() == 0) {
            if (vVar instanceof C25268q) {
                ((C25268q) vVar).mo51561k();
            } else if (vVar instanceof C25264m) {
                ((C25264m) vVar).mo51138b();
            }
        }
    }
}
