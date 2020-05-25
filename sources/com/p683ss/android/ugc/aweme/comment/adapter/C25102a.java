package com.p683ss.android.ugc.aweme.comment.adapter;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.comment.C25152e.C25154b;
import com.p683ss.android.ugc.aweme.comment.abtest.C25070b;
import com.p683ss.android.ugc.aweme.comment.abtest.MTCommentsNegativeFeedbackExperiment;
import com.p683ss.android.ugc.aweme.comment.api.C25140c;
import com.p683ss.android.ugc.aweme.comment.api.C25141d;
import com.p683ss.android.ugc.aweme.comment.list.C25264m;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.model.CommentLikeUsersStruct;
import com.p683ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p683ss.android.ugc.aweme.comment.p1516a.C25064a;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25147a;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25171f;
import com.p683ss.android.ugc.aweme.comment.p1524i.C25207a;
import com.p683ss.android.ugc.aweme.comment.p1524i.C25208b;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25243n;
import com.p683ss.android.ugc.aweme.comment.p1528ui.C25333ac;
import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.commercialize.model.C26129j;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26428bm;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl;
import com.p683ss.android.ugc.aweme.p1308ad.p1310b.C22324a;
import com.p683ss.android.ugc.aweme.p1308ad.p1310b.C22328b;
import com.p683ss.android.ugc.aweme.p1308ad.services.p1322a.C22429c;
import com.p683ss.android.ugc.aweme.p1308ad.view.C22450d;
import com.p683ss.android.ugc.aweme.utils.C47709bb;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.a */
public final class C25102a extends C26840g<Comment> {

    /* renamed from: A */
    private final int f66499A = ((int) C9432q.m18687b(C11010c.m22280a(), 6.0f));

    /* renamed from: B */
    private final int f66500B = ((int) C9432q.m18687b(C11010c.m22280a(), 10.0f));

    /* renamed from: C */
    private final int f66501C = ((int) C9432q.m18687b(C11010c.m22280a(), 16.0f));

    /* renamed from: D */
    private HashSet<Comment> f66502D = new HashSet<>();

    /* renamed from: E */
    private C22324a f66503E = new C22324a() {
        /* renamed from: a */
        public final void mo46458a() {
            C25102a.this.f66504a.mo51262d();
        }

        /* renamed from: a */
        public final void mo46459a(View view, boolean z, String str) {
            C25102a.this.f66504a.mo51252a(view, false, str);
        }
    };

    /* renamed from: a */
    public C25147a f66504a;

    /* renamed from: b */
    public String f66505b;

    /* renamed from: c */
    public C25333ac f66506c;

    /* renamed from: d */
    public C25171f f66507d;

    /* renamed from: e */
    public String f66508e;

    /* renamed from: f */
    public C25243n f66509f;

    /* renamed from: g */
    public boolean f66510g = false;

    /* renamed from: h */
    public C22328b f66511h;

    /* renamed from: i */
    public DataCenter f66512i;

    /* renamed from: j */
    public C25154b f66513j;

    /* renamed from: k */
    private String f66514k;

    /* renamed from: l */
    private HashMap<Long, Long> f66515l = new HashMap<>();

    /* renamed from: m */
    private Aweme f66516m;

    /* renamed from: y */
    private boolean f66517y = false;

    /* renamed from: z */
    private int f66518z = 0;

    /* renamed from: c */
    private static boolean m60991c(int i) {
        return i == 1 || i == 0 || i == 10 || i == 12;
    }

    /* renamed from: a */
    public final List<Comment> mo50673a() {
        return this.f70670n;
    }

    /* renamed from: a */
    public final void mo51185a(Aweme aweme) {
        this.f66516m = aweme;
        if (this.f66516m != null && this.f66516m.isAd()) {
            AwemeRawAd awemeRawAd = this.f66516m.getAwemeRawAd();
            C26129j commentArea = awemeRawAd.getCommentArea();
            this.f66517y = awemeRawAd.isCommentAreaSwitch();
            if (commentArea != null) {
                this.f66518z = commentArea.getShowButtonNumber();
            }
        }
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        int itemViewType = getItemViewType(i);
        if (this.f66517y && this.f66506c != null && this.f66518z > 0 && i == this.f66518z) {
            this.f66506c.mo51889s();
        }
        if (itemViewType != 2) {
            switch (itemViewType) {
                case 10:
                    C22429c cVar = new C22429c();
                    cVar.f60427e = (C26129j) mo50673a().get(i);
                    cVar.f60428f = m60990b(i);
                    cVar.f60429g = this.f66505b;
                    ((C22450d) vVar).mo46525a(C11010c.m22280a(), cVar);
                    return;
                case 11:
                    ((CommentReplyButtonViewHolder) vVar).mo51133a((CommentReplyButtonStruct) this.f70670n.get(i));
                    return;
                case 12:
                    C22429c cVar2 = new C22429c();
                    cVar2.f60423a = C26428bm.m63902a(this.f66516m);
                    cVar2.f60424b = this.f66516m;
                    cVar2.f60426d = this.f66512i;
                    cVar2.f60425c = this.f66511h;
                    ((C22450d) vVar).mo46525a(C11010c.m22280a(), cVar2);
                    return;
                default:
                    switch (itemViewType) {
                        case 220:
                            ((C25140c) vVar).mo51200a((CommentLikeUsersStruct) this.f70670n.get(i));
                            return;
                        case 221:
                            ((C25141d) vVar).mo51206a((CommentLikeUsersStruct) this.f70670n.get(i));
                            return;
                        default:
                            ((CommentViewHolder) vVar).mo51153a((Comment) this.f70670n.get(i), m60990b(i));
                            if (vVar instanceof CommentViewHolderNewStyle) {
                                ((CommentViewHolderNewStyle) vVar).mo51154a(this.f66505b);
                            }
                            return;
                    }
            }
        } else {
            C25264m mVar = (C25264m) vVar;
            mVar.mo51136a((Comment) this.f70670n.get(i));
            mVar.mo51137a(this.f66505b);
        }
    }

    /* renamed from: a */
    public final void mo51187a(String str) {
        if (mo48636c() != 0) {
            int i = 0;
            while (i < this.f70670n.size()) {
                Comment comment = (Comment) this.f70670n.get(i);
                if (comment == null || !C9431p.m18665a(comment.getCid(), str)) {
                    i++;
                } else if (comment.getUserBuried()) {
                    comment.setUserBuried(false);
                    return;
                } else {
                    comment.setUserBuried(true);
                    if (comment.isUserDigged()) {
                        C25070b.m60929a(comment, this.f66507d.getAuthorUid());
                        notifyItemChanged(i, Integer.valueOf(0));
                        C47718bf.m103288a(new C25064a(2, new Object[]{this.f66507d.getAid(), comment}));
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo51184a(Comment comment, String str, String str2) {
        String cid;
        int indexOf;
        String str3;
        String str4;
        Comment comment2 = comment;
        if (comment2 != null) {
            int i = -1;
            if (comment.getCommentType() == 2) {
                cid = comment.getReplyId();
                indexOf = this.f66509f.mo51528e(cid);
                List b = this.f66509f.mo51521b(String.valueOf(indexOf));
                if (b != null) {
                    i = b.indexOf(comment2);
                }
            } else if (comment.getCommentType() == 1) {
                cid = comment.getCid();
                indexOf = this.f66509f.mo51528e(cid);
            } else {
                cid = comment.getCid();
                indexOf = this.f70670n.indexOf(comment2);
            }
            String str5 = cid;
            String str6 = (TextUtils.isEmpty(comment.getReplyToReplyCommentId()) || TextUtils.equals(comment.getReplyToReplyCommentId(), "0")) ? (TextUtils.isEmpty(comment.getReplyId()) || TextUtils.equals(comment.getReplyId(), "0")) ? "original" : "reply" : "reply_to_reply";
            String str7 = str6;
            String uid = (comment.getUser() == null || comment.getUser().getUid() == null) ? "" : comment.getUser().getUid();
            if (TextUtils.equals("reply_via_video", str)) {
                C25207a.m61290a(str2, this.f66507d.getAid(), comment.getCid(), uid, str5, indexOf + 1, i + 1, str7);
                return;
            }
            String aid = (comment.getAliasAweme() == null || comment.getAliasAweme().getAid() == null) ? "" : comment.getAliasAweme().getAid();
            if (TextUtils.equals("click_comment_chain", this.f66505b) || TextUtils.equals("click_comment_bubble", this.f66505b)) {
                str4 = this.f66505b;
                if (TextUtils.isEmpty(this.f66507d.getEnterMethod())) {
                    str3 = this.f66505b;
                } else {
                    str3 = this.f66507d.getEnterMethod();
                }
            } else if (TextUtils.equals("message", this.f66505b) || TextUtils.equals("push", this.f66505b)) {
                str4 = TextUtils.equals("message", this.f66505b) ? "notification" : this.f66505b;
                str3 = this.f66505b;
            } else {
                str4 = "click_comment_button";
                str3 = this.f66505b;
            }
            C25207a.m61291a(str4, this.f66507d.getAid(), comment.getCid(), uid, str5, indexOf + 1, i + 1, str7, str3, aid);
        }
    }

    /* renamed from: a */
    public final void mo51188a(boolean z) {
        if (this.f66515l != null) {
            for (Entry entry : this.f66515l.entrySet()) {
                Long l = (Long) entry.getKey();
                Comment comment = null;
                Comment comment2 = new Comment();
                comment2.setCid(String.valueOf(l));
                int indexOf = this.f70670n.indexOf(comment2);
                if (indexOf >= 0) {
                    comment = (Comment) this.f70670n.get(indexOf);
                }
                if (comment != null) {
                    if (z) {
                        m60988a(l.longValue(), System.currentTimeMillis());
                        if (comment.isAuthorDigged()) {
                            C25207a.m61295b(this.f66505b, this.f66507d.getAid(), this.f66507d.getAuthorUid(), comment.getCid());
                        }
                    } else {
                        m60989a((Comment) this.f70670n.get(indexOf));
                        entry.setValue(Long.valueOf(0));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo51186a(Comment comment, int i) {
        if (comment != null) {
            List j = m60993j();
            this.f70670n.add(i, comment);
            C47709bb.m103255a(this, j, this.f70670n);
        }
    }

    /* renamed from: g */
    private boolean m60992g() {
        if (!MTCommentsNegativeFeedbackExperiment.m60923a() || (this.f66516m != null && this.f66516m.isAd())) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private List<Comment> m60993j() {
        if (this.f70670n == null) {
            this.f70670n = new ArrayList();
        }
        return new ArrayList(this.f70670n);
    }

    /* renamed from: a */
    public final int mo51179a(View view) {
        return (int) C9432q.m18687b(view.getContext(), 45.0f);
    }

    /* renamed from: b */
    private Rect m60990b(int i) {
        int i2;
        if (m60992g()) {
            return new Rect(-1, -1, -1, -1);
        }
        int i3 = this.f66500B;
        int a = mo48641a(i);
        if (i >= mo48636c() - 1) {
            i2 = -1;
        } else {
            i2 = mo48641a(i + 1);
        }
        if (m60991c(a) && !m60991c(i2)) {
            i3 = this.f66499A;
        }
        return new Rect(-1, this.f66500B, -1, i3);
    }

    /* renamed from: c */
    public final void mo51189c(List<Comment> list) {
        if (!C9376b.m18558a((Collection<T>) list)) {
            List j = m60993j();
            this.f70670n.addAll(list);
            C47709bb.m103255a(this, j, this.f70670n);
        }
    }

    public final void onViewDetachedFromWindow(C1352v vVar) {
        Comment comment;
        long j;
        super.onViewDetachedFromWindow(vVar);
        if (vVar instanceof CommentViewHolder) {
            comment = ((CommentViewHolder) vVar).f66445a;
        } else if (vVar instanceof CommentReplyViewHolder) {
            comment = ((CommentReplyViewHolder) vVar).f66410b;
        } else {
            comment = null;
        }
        if (comment != null && comment != null && comment.getUser() != null) {
            try {
                j = Long.parseLong(comment.getCid());
            } catch (Exception unused) {
                j = 0;
            }
            m60989a(comment);
            this.f66515l.remove(Long.valueOf(j));
        }
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        if (mo50673a() != null) {
            switch (((Comment) mo50673a().get(i)).getCommentType()) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 10:
                    return 10;
                case 11:
                    return 11;
                case 12:
                    return 12;
                case 220:
                    return 220;
                case 221:
                    return 221;
            }
        }
        return super.mo48641a(i);
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        Comment comment;
        long j;
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof CommentViewHolder) {
            CommentViewHolder commentViewHolder = (CommentViewHolder) vVar;
            if (!(commentViewHolder.f66445a == null || !commentViewHolder.f66445a.isNeedHint() || commentViewHolder.mBgView == null)) {
                commentViewHolder.mBgView.postDelayed(new C25126o(commentViewHolder), 150);
            }
            if (!(commentViewHolder.f66445a == null || !commentViewHolder.f66445a.isNeedShowPrompt() || commentViewHolder.mInvalidUsernamePrompt == null)) {
                commentViewHolder.mInvalidUsernamePrompt.postDelayed(new C25127p(commentViewHolder), 400);
            }
            comment = commentViewHolder.f66445a;
        } else if (vVar instanceof CommentReplyViewHolder) {
            CommentReplyViewHolder commentReplyViewHolder = (CommentReplyViewHolder) vVar;
            if (!(commentReplyViewHolder.f66410b == null || !commentReplyViewHolder.f66410b.isNeedHint() || commentReplyViewHolder.mBgView == null)) {
                commentReplyViewHolder.mBgView.postDelayed(new C25120k(commentReplyViewHolder), 150);
            }
            if (!(commentReplyViewHolder.f66410b == null || !commentReplyViewHolder.f66410b.isNeedShowPrompt() || commentReplyViewHolder.mInvalidUsernamePrompt == null)) {
                commentReplyViewHolder.mInvalidUsernamePrompt.postDelayed(new C25121l(commentReplyViewHolder), 400);
            }
            comment = commentReplyViewHolder.f66410b;
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
                m60988a(j, System.currentTimeMillis());
            }
            if (comment.isAuthorDigged()) {
                C25207a.m61295b(this.f66505b, this.f66507d.getAid(), this.f66507d.getAuthorUid(), comment.getCid());
            }
            if (comment.getAliasAweme() != null) {
                mo51184a(comment, "video_comment_show", this.f66505b);
            }
        }
    }

    /* renamed from: a */
    private void m60989a(Comment comment) {
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
        if (comment2 != null && !TextUtils.isEmpty(this.f66505b)) {
            try {
                j = Long.parseLong(comment.getCid());
            } catch (Exception unused) {
                j = 0;
            }
            if (this.f66515l != null && this.f66515l.get(Long.valueOf(j)) != null && ((Long) this.f66515l.get(Long.valueOf(j))).longValue() > 10) {
                long currentTimeMillis = System.currentTimeMillis() - ((Long) this.f66515l.get(Long.valueOf(j))).longValue();
                if (currentTimeMillis > 30) {
                    String str6 = "";
                    int i2 = -1;
                    if (comment.getCommentType() == 2) {
                        String replyId = comment.getReplyId();
                        int e = this.f66509f.mo51528e(replyId);
                        String cid2 = comment.getCid();
                        List b = this.f66509f.mo51521b(String.valueOf(e));
                        if (b != null) {
                            i2 = b.indexOf(comment2);
                        }
                        str2 = replyId;
                        str = cid2;
                        i = e;
                    } else {
                        if (comment.getCommentType() == 1) {
                            cid = comment.getCid();
                            i = this.f66509f.mo51528e(cid);
                        } else {
                            cid = comment.getCid();
                            i = this.f70670n.indexOf(comment2);
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
                    if (TextUtils.equals(this.f66507d.getAuthorUid(), str3)) {
                        str5 = "creator";
                    } else if (comment.getUser().getFollowStatus() == 2) {
                        str5 = "friends";
                    } else if (comment.getUser().getFollowStatus() == 1) {
                        str5 = "following";
                    } else {
                        str4 = str9;
                        String str10 = this.f66505b;
                        C25208b.m61300a(str10, this.f66507d.getAid(), str2, i + 1, str, i2 + 1, currentTimeMillis, this.f66508e, this.f66507d.getIsLongItem(), str7, str8, str3, str4);
                    }
                    str4 = str5;
                    String str102 = this.f66505b;
                    C25208b.m61300a(str102, this.f66507d.getAid(), str2, i + 1, str, i2 + 1, currentTimeMillis, this.f66508e, this.f66507d.getIsLongItem(), str7, str8, str3, str4);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo51182a(C1352v vVar) {
        super.mo51182a(vVar);
        vVar.itemView.setPadding(this.f66501C, vVar.itemView.getPaddingTop(), this.f66501C, vVar.itemView.getPaddingBottom());
    }

    /* renamed from: a */
    private void m60988a(long j, long j2) {
        this.f66515l.put(Long.valueOf(j), Long.valueOf(j2));
    }

    /* renamed from: a */
    public final int mo51180a(String str, int i) {
        if (mo48636c() == 0) {
            return -1;
        }
        for (int i2 = 0; i2 < mo50673a().size(); i2++) {
            Comment comment = (Comment) mo50673a().get(i2);
            if (comment != null && comment.getCommentType() == i && C9431p.m18665a(comment.getCid(), str)) {
                return i2;
            }
        }
        return -1;
    }

    public C25102a(C25147a aVar, C25171f fVar) {
        this.f66504a = aVar;
        this.f66507d = fVar;
        this.f66514k = fVar.getAuthorUid();
        mo54792d(R.string.an1);
    }

    /* renamed from: a */
    public void mo51181a(int i, int i2) {
        if (i >= 0 && i < this.f70670n.size()) {
            List j = m60993j();
            if (i2 > 1) {
                List list = this.f70670n;
                list.subList(i, Math.min(list.size(), i2 + i)).clear();
            } else {
                this.f70670n.remove(i);
            }
            C47709bb.m103255a(this, j, this.f70670n);
        }
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        boolean z;
        int i2;
        CommentReplyViewHolder commentReplyViewHolder;
        switch (i) {
            case 1:
                z = false;
                break;
            case 2:
                if (m60992g()) {
                    commentReplyViewHolder = new CommentReplyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b1r, viewGroup, false), this.f66504a);
                } else {
                    commentReplyViewHolder = new CommentReplyViewHolder(viewGroup, this.f66504a);
                }
                commentReplyViewHolder.mo51141c(this.f66507d.getAuthorUid());
                commentReplyViewHolder.mo51139b(this.f66507d.getAid());
                commentReplyViewHolder.mo51137a(this.f66505b);
                commentReplyViewHolder.f66417i = this.f66513j;
                commentReplyViewHolder.f66413e = this;
                return commentReplyViewHolder;
            case 10:
                C22429c cVar = new C22429c();
                cVar.f60430h = UnReadVideoExperiment.BROWSE_RECORD_LIST;
                cVar.f60429g = this.f66505b;
                cVar.f60431i = this.f66503E;
                return AdServiceImpl.createIAdServicebyMonsterPlugin().getViewHolderForType(viewGroup.getContext(), cVar);
            case 11:
                return new CommentReplyButtonViewHolder(viewGroup, this.f66504a);
            case 12:
                C22429c cVar2 = new C22429c();
                cVar2.f60423a = C26428bm.m63902a(this.f66516m);
                cVar2.f60430h = 258;
                cVar2.f60429g = this.f66505b;
                cVar2.f60431i = this.f66503E;
                return AdServiceImpl.createIAdServicebyMonsterPlugin().getViewHolderForType(viewGroup.getContext(), cVar2);
            case 220:
                return C25282a.m61494a().getICommentLikeUsersHolder(viewGroup);
            case 221:
                C25122m mVar = new C25122m(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b1z, viewGroup, false), this.f66504a);
                mVar.f66552c = this.f66507d.getEventType();
                mVar.f66554e = this.f66507d.getAuthorUid();
                mVar.f66553d = this.f66507d.getPageType();
                return mVar;
            default:
                z = true;
                break;
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (m60992g()) {
            i2 = R.layout.b1s;
        } else {
            i2 = R.layout.b1o;
        }
        CommentViewHolderNewStyle commentViewHolderNewStyle = new CommentViewHolderNewStyle(from.inflate(i2, viewGroup, false), this.f66504a, this.f66514k);
        commentViewHolderNewStyle.mo51155a(z);
        commentViewHolderNewStyle.mo51158c(this.f66507d.getAuthorUid());
        commentViewHolderNewStyle.mo51157b(this.f66507d.getAid());
        commentViewHolderNewStyle.mo51150a(this.f66507d.getPageType());
        commentViewHolderNewStyle.mo51154a(this.f66505b);
        commentViewHolderNewStyle.f66463k = this.f66513j;
        commentViewHolderNewStyle.f66464l = this;
        return commentViewHolderNewStyle;
    }

    public final void onBindViewHolder(C1352v vVar, int i, List list) {
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            mo51182a(vVar);
        } else if (list.isEmpty()) {
            mo48222a(vVar, i);
        } else {
            int intValue = ((Integer) list.get(0)).intValue();
            if (intValue == 0) {
                if (vVar instanceof CommentViewHolderNewStyle) {
                    CommentViewHolderNewStyle commentViewHolderNewStyle = (CommentViewHolderNewStyle) vVar;
                    commentViewHolderNewStyle.mo51171k();
                    commentViewHolderNewStyle.mo51154a(this.f66505b);
                }
                if (vVar instanceof CommentReplyViewHolder) {
                    C25264m mVar = (C25264m) vVar;
                    mVar.mo51138b();
                    mVar.mo51137a(this.f66505b);
                }
            } else if (intValue == 1) {
                if (vVar instanceof CommentViewHolderNewStyle) {
                    ((CommentViewHolderNewStyle) vVar).mo51160d();
                }
                if (vVar instanceof C25264m) {
                    ((C25264m) vVar).mo51135a();
                }
            }
        }
    }
}
