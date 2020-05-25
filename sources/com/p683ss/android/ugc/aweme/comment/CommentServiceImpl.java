package com.p683ss.android.ugc.aweme.comment;

import android.app.Activity;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y.C0212b;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.graphics.Paint;
import android.os.SystemClock;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1373d.C23064c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.comment.abtest.C25070b;
import com.p683ss.android.ugc.aweme.comment.adapter.C25112e;
import com.p683ss.android.ugc.aweme.comment.adapter.C25128q;
import com.p683ss.android.ugc.aweme.comment.adapter.CommentReplyButtonViewHolder;
import com.p683ss.android.ugc.aweme.comment.adapter.CommentReplyViewHolder;
import com.p683ss.android.ugc.aweme.comment.api.C25137a;
import com.p683ss.android.ugc.aweme.comment.api.C25139b;
import com.p683ss.android.ugc.aweme.comment.api.C25142e;
import com.p683ss.android.ugc.aweme.comment.api.CommentApi;
import com.p683ss.android.ugc.aweme.comment.api.CommentViewModel;
import com.p683ss.android.ugc.aweme.comment.list.C25253b;
import com.p683ss.android.ugc.aweme.comment.list.C25256e;
import com.p683ss.android.ugc.aweme.comment.list.C25258g;
import com.p683ss.android.ugc.aweme.comment.list.C25259h;
import com.p683ss.android.ugc.aweme.comment.list.C25261j;
import com.p683ss.android.ugc.aweme.comment.list.C25262k;
import com.p683ss.android.ugc.aweme.comment.list.C25264m;
import com.p683ss.android.ugc.aweme.comment.list.C25268q;
import com.p683ss.android.ugc.aweme.comment.list.C25269r;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.p1516a.C25064a;
import com.p683ss.android.ugc.aweme.comment.p1517b.C25144a;
import com.p683ss.android.ugc.aweme.comment.p1517b.C25145b;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25147a;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25149c;
import com.p683ss.android.ugc.aweme.comment.p1520e.C25155a;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25171f;
import com.p683ss.android.ugc.aweme.comment.p1522g.C25176d;
import com.p683ss.android.ugc.aweme.comment.p1522g.C25178e;
import com.p683ss.android.ugc.aweme.comment.p1522g.C25179f;
import com.p683ss.android.ugc.aweme.comment.p1522g.C25181g;
import com.p683ss.android.ugc.aweme.comment.p1522g.C25182h;
import com.p683ss.android.ugc.aweme.comment.p1522g.C25184j;
import com.p683ss.android.ugc.aweme.comment.p1522g.C25190p;
import com.p683ss.android.ugc.aweme.comment.p1524i.C25207a;
import com.p683ss.android.ugc.aweme.comment.p1524i.C25208b;
import com.p683ss.android.ugc.aweme.comment.p1525j.C25212a;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25220c.C25222b;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25225e;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25225e.C25226a;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25225e.C25227b;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25228f;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25230h;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25243n;
import com.p683ss.android.ugc.aweme.comment.p1528ui.C25367g;
import com.p683ss.android.ugc.aweme.comment.p1528ui.CommentInputFragment;
import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.comment.services.C25284c;
import com.p683ss.android.ugc.aweme.comment.services.C25285d;
import com.p683ss.android.ugc.aweme.comment.services.CommentService;
import com.p683ss.android.ugc.aweme.commercialize.model.C26129j;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C30228f;
import com.p683ss.android.ugc.aweme.feed.adapter.C30086k;
import com.p683ss.android.ugc.aweme.feed.api.C30153k;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.feed.widget.C31244c;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.p1382aq.C23200ag;
import com.p683ss.android.ugc.aweme.p1632di.C27604ar;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.CommentServiceImpl */
public final class CommentServiceImpl implements CommentService {

    /* renamed from: com.ss.android.ugc.aweme.comment.CommentServiceImpl$a */
    public static final class C25055a implements C0212b {
        C25055a() {
        }

        /* renamed from: a */
        public final <T extends C0209x> T mo361a(Class<T> cls) {
            C52711k.m112240b(cls, "modelClass");
            return (C0209x) new CommentViewModelImpl();
        }
    }

    public static CommentService provideCommentService_Monster() {
        if (C27991b.f73423G == null) {
            synchronized (CommentService.class) {
                if (C27991b.f73423G == null) {
                    C27991b.f73423G = C27604ar.m66283b();
                }
            }
        }
        return (CommentService) C27991b.f73423G;
    }

    public final boolean isFeedHotCommentExperimentOpen() {
        return false;
    }

    public final int providerInputLayoutIdForPreLoad() {
        return R.layout.b1k;
    }

    public final void sendCollectEmojiEvent() {
        C25207a.m61279a();
    }

    public final void clearAllTranslationCache() {
        C25212a.m61315a().mo51475b();
    }

    public final boolean isBlackMode() {
        return C25112e.m61020a();
    }

    public final C25139b provideCommentBlackModeColorHelper() {
        return new C25112e();
    }

    public final C25142e providerFeedHotCommentPanel() {
        return new C25155a();
    }

    public final C25269r providerReplyCommentDataManager() {
        return new C25243n();
    }

    public final boolean publishSelfSeeComment() {
        return C25230h.m61353a();
    }

    public final void setStartLoadTime() {
        C25367g.f67064x = SystemClock.uptimeMillis();
    }

    public final Collection<Integer> provideViewHolderLayoutIdsForPreload() {
        return C52575l.m112092a(Integer.valueOf(R.layout.b1u));
    }

    public final C25253b providerCommentDeletePresenter() {
        C25178e eVar = new C25178e();
        eVar.mo54799a(new C25176d());
        return eVar;
    }

    public final C25256e providerCommentDiggPresenter() {
        C25181g gVar = new C25181g();
        gVar.mo54799a(new C25179f());
        return gVar;
    }

    public final C25258g providerCommentFetchPresenter() {
        C25184j jVar = new C25184j();
        jVar.mo54799a(new C25182h());
        return jVar;
    }

    public final void sendCloseCommentTabEvent(String str) {
        C25207a.m61280a(str);
    }

    public final void setShouldSetTopWhenOpen(boolean z) {
        C25367g.f67063w = z;
    }

    public final C26129j buildCommentStruct(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        return C25228f.m61349a(aweme);
    }

    public final String getCommentCategory(Comment comment) {
        String a = C25207a.m61278a(comment);
        C52711k.m112236a((Object) a, "CommentStatistics.getCommentCategory(replyComment)");
        return a;
    }

    public final String getTextWithGifEmojiDetailTail(Comment comment) {
        C52711k.m112240b(comment, "comment");
        return C25225e.m61334a(comment, null, 1, null);
    }

    public final boolean hasTextExtra(Comment comment) {
        C52711k.m112240b(comment, "comment");
        return C25225e.m61344e(comment);
    }

    public final void hideCommentList(Context context) {
        C25367g a = C25367g.m61669a(context);
        if (a != null) {
            a.mo51943u();
        }
    }

    public final void hideCommentListImmediately(Context context) {
        C25367g a = C25367g.m61669a(context);
        if (a != null) {
            a.mo51916a(a.mo51543c());
        }
    }

    public final boolean isCommentListShowing(Context context) {
        C25367g a = C25367g.m61669a(context);
        if (a == null || !a.mo51543c()) {
            return false;
        }
        return true;
    }

    public final C25262k providerCommentReplyListPresenter(String str) {
        C52711k.m112240b(str, "itemId");
        return new C25190p(str);
    }

    public final CommentViewModel getCommentViewModel(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "activity");
        C0209x a = C0214z.m441a(fragmentActivity, (C0212b) new C25055a()).mo359a(CommentViewModelImpl.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…iewModelImpl::class.java)");
        return (CommentViewModel) a;
    }

    public final String getDisplayText(C26129j jVar) {
        C52711k.m112240b(jVar, "commentStruct");
        C52711k.m112240b(jVar, "$this$getDisplayText");
        StringBuilder sb = new StringBuilder(jVar.getCommentInfo());
        sb.append(" [label]");
        sb.append(" ");
        sb.append(C25225e.m61338a(jVar));
        String sb2 = sb.toString();
        C52711k.m112236a((Object) sb2, "builder.toString()");
        return sb2;
    }

    public final List<TextExtraStruct> getDisplayTextExtra(C26129j jVar) {
        C31244c cVar;
        C26129j jVar2 = jVar;
        C52711k.m112240b(jVar2, "commentStruct");
        C52711k.m112240b(jVar2, "$this$getDisplayTextExtra");
        ArrayList arrayList = new ArrayList();
        int length = jVar.getCommentInfo().length() + 1;
        int i = length + 7;
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        textExtraStruct.setType(TextExtraStruct.TYPE_CUSTOM);
        if (C25112e.m61020a()) {
            cVar = new C31244c(C11010c.m22280a(), C11010c.m22280a().getString(R.string.g3g), "#FFFFFFFF", R.drawable.dg7, "#80FFFFFF", "#58161823", 10, 17);
        } else {
            cVar = new C31244c(C11010c.m22280a(), C11010c.m22280a().getString(R.string.g3g), "#FFFFFFFF", R.drawable.dg7, "#80FFFFFF", "#58161823", 10, 17);
        }
        textExtraStruct.setCustomSpan(cVar);
        textExtraStruct.setStart(length);
        textExtraStruct.setEnd(i);
        arrayList.add(textExtraStruct);
        int i2 = i + 1;
        int length2 = i + C25225e.m61338a(jVar).length();
        TextExtraStruct textExtraStruct2 = new TextExtraStruct();
        textExtraStruct2.setType(TextExtraStruct.TYPE_CUSTOM);
        textExtraStruct2.setCustomSpan(new C25222b(C23728o.m58241a(13.0d), C11010c.m22280a().getResources().getColor(R.color.jl)));
        textExtraStruct2.setStart(i2);
        textExtraStruct2.setEnd(length2);
        arrayList.add(textExtraStruct2);
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p683ss.android.ugc.aweme.model.TextExtraStruct> getDispalyTextExtraForMoment(com.p683ss.android.ugc.aweme.comment.model.Comment r10) {
        /*
            r9 = this;
            java.lang.String r0 = "comment"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            java.lang.String r0 = "$this$getDispalyTextExtraForMoment"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            java.util.List r0 = r10.getTextExtra()
            if (r0 == 0) goto L_0x0040
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r10.getTextExtra()
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.List r0 = (java.util.List) r0
            java.util.List r1 = r10.getTextExtra()
            java.util.Iterator r1 = r1.iterator()
        L_0x0027:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.model.TextExtraStruct r2 = (com.p683ss.android.ugc.aweme.model.TextExtraStruct) r2
            com.ss.android.ugc.aweme.model.TextExtraStruct r2 = r2.clone()
            java.lang.String r3 = "textExtraStruct.clone()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r0.add(r2)
            goto L_0x0027
        L_0x0040:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
        L_0x0047:
            java.lang.String r1 = r10.getForwardId()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x00b1
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r4 = 2132544845(0x7f1c0d4d, float:2.0742863E38)
            java.lang.String r1 = r1.getString(r4)
            java.lang.String r4 = r10.getText()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x0071
            int r4 = r4.length()
            if (r4 != 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r4 = 0
            goto L_0x0072
        L_0x0071:
            r4 = 1
        L_0x0072:
            if (r4 != 0) goto L_0x0085
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = " • "
            r4.append(r1)
            java.lang.String r1 = r4.toString()
        L_0x0085:
            int r1 = r1.length()
            java.util.Iterator r4 = r0.iterator()
        L_0x008d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b1
            java.lang.Object r5 = r4.next()
            com.ss.android.ugc.aweme.model.TextExtraStruct r5 = (com.p683ss.android.ugc.aweme.model.TextExtraStruct) r5
            int r6 = r5.getStart()
            int r6 = r6 + r1
            r5.setStart(r6)
            int r6 = r5.getEnd()
            int r6 = r6 + r1
            r5.setEnd(r6)
            java.lang.String r6 = r5.getUserId()
            r5.setUserId(r6)
            goto L_0x008d
        L_0x00b1:
            com.ss.android.ugc.aweme.profile.model.User r1 = r10.getUser()
            if (r1 == 0) goto L_0x01ea
            com.p683ss.android.ugc.aweme.comment.p1526k.C25225e.m61342c(r10)
            java.util.Iterator r1 = r0.iterator()
        L_0x00be:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00e7
            java.lang.Object r4 = r1.next()
            com.ss.android.ugc.aweme.model.TextExtraStruct r4 = (com.p683ss.android.ugc.aweme.model.TextExtraStruct) r4
            int r5 = r4.getStart()
            java.lang.String r6 = r10.mUserNamePrefix
            int r6 = r6.length()
            int r5 = r5 + r6
            r4.setStart(r5)
            int r5 = r4.getEnd()
            java.lang.String r6 = r10.mUserNamePrefix
            int r6 = r6.length()
            int r5 = r5 + r6
            r4.setEnd(r5)
            goto L_0x00be
        L_0x00e7:
            com.ss.android.ugc.aweme.profile.model.User r1 = r10.getUser()
            java.lang.String r1 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103653c(r1)
            int r1 = r1.length()
            int r4 = r10.offset
            int r1 = r1 - r4
            int r4 = r10.getLabelType()
            if (r4 <= 0) goto L_0x0126
            java.lang.String r4 = r10.getLabelText()
            int r4 = r4.length()
            int r4 = r4 + r1
            com.ss.android.ugc.aweme.model.TextExtraStruct r5 = new com.ss.android.ugc.aweme.model.TextExtraStruct
            r5.<init>()
            r6 = 65281(0xff01, float:9.1478E-41)
            r5.setType(r6)
            com.ss.android.ugc.aweme.comment.k.c$a r6 = new com.ss.android.ugc.aweme.comment.k.c$a
            int r7 = r10.getLabelType()
            r6.<init>(r7)
            r5.setCustomSpan(r6)
            r5.setStart(r1)
            r5.setEnd(r4)
            r0.add(r5)
            goto L_0x0127
        L_0x0126:
            r4 = r1
        L_0x0127:
            java.util.List r5 = r10.getReplyComments()
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = com.bytedance.common.utility.p522b.C9376b.m18558a(r5)
            if (r5 != 0) goto L_0x0164
            java.util.List r5 = r10.getReplyComments()
            java.lang.String r6 = "replyComments"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.lang.Object r5 = p2628d.p2629a.C52575l.m112137e(r5)
            if (r5 == 0) goto L_0x0164
            java.util.List r5 = r10.getReplyComments()
            java.lang.String r6 = "replyComments"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.lang.Object r5 = p2628d.p2629a.C52575l.m112137e(r5)
            java.lang.String r6 = "replyComments.first()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            com.ss.android.ugc.aweme.comment.model.Comment r5 = (com.p683ss.android.ugc.aweme.comment.model.Comment) r5
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getUser()
            java.lang.String r6 = "replyComments.first().user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.lang.String r5 = r5.getUid()
            goto L_0x0166
        L_0x0164:
            java.lang.String r5 = ""
        L_0x0166:
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0173
            java.lang.String r5 = r10.getReplyToUserId()
        L_0x0173:
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r7 = 2131821041(0x7f1101f1, float:1.9274814E38)
            r8 = 65282(0xff02, float:9.148E-41)
            if (r6 != 0) goto L_0x01b1
            com.ss.android.ugc.aweme.model.TextExtraStruct r6 = new com.ss.android.ugc.aweme.model.TextExtraStruct
            r6.<init>()
            r6.setType(r8)
            int r4 = r4 + 3
            r6.setStart(r4)
            java.lang.String r4 = r10.mUserNamePrefix
            int r4 = r4.length()
            r6.setEnd(r4)
            r6.setUserId(r5)
            r6.setBoldText(r3)
            android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getColor(r7)
            r6.setColor(r4)
            r0.add(r6)
            goto L_0x01b7
        L_0x01b1:
            java.lang.String r1 = r10.mUserNamePrefix
            int r1 = r1.length()
        L_0x01b7:
            com.ss.android.ugc.aweme.model.TextExtraStruct r4 = new com.ss.android.ugc.aweme.model.TextExtraStruct
            r4.<init>()
            r4.setType(r8)
            r4.setStart(r2)
            r4.setEnd(r1)
            com.ss.android.ugc.aweme.profile.model.User r10 = r10.getUser()
            java.lang.String r1 = "user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r1)
            java.lang.String r10 = r10.getUid()
            r4.setUserId(r10)
            r4.setBoldText(r3)
            android.content.Context r10 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r10 = r10.getResources()
            int r10 = r10.getColor(r7)
            r4.setColor(r10)
            r0.add(r4)
        L_0x01ea:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.CommentServiceImpl.getDispalyTextExtraForMoment(com.ss.android.ugc.aweme.comment.model.Comment):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p683ss.android.ugc.aweme.model.TextExtraStruct> getDisplayTextExtraForIns(com.p683ss.android.ugc.aweme.comment.model.Comment r10) {
        /*
            r9 = this;
            java.lang.String r0 = "comment"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            java.lang.String r0 = "$this$getDisplayTextExtraForIns"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            java.util.List r0 = r10.getTextExtra()
            if (r0 == 0) goto L_0x0040
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r10.getTextExtra()
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.List r0 = (java.util.List) r0
            java.util.List r1 = r10.getTextExtra()
            java.util.Iterator r1 = r1.iterator()
        L_0x0027:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.model.TextExtraStruct r2 = (com.p683ss.android.ugc.aweme.model.TextExtraStruct) r2
            com.ss.android.ugc.aweme.model.TextExtraStruct r2 = r2.clone()
            java.lang.String r3 = "textExtraStruct.clone()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r0.add(r2)
            goto L_0x0027
        L_0x0040:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
        L_0x0047:
            java.lang.String r1 = r10.getForwardId()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x00b1
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r4 = 2132544845(0x7f1c0d4d, float:2.0742863E38)
            java.lang.String r1 = r1.getString(r4)
            java.lang.String r4 = r10.getText()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x0071
            int r4 = r4.length()
            if (r4 != 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r4 = 0
            goto L_0x0072
        L_0x0071:
            r4 = 1
        L_0x0072:
            if (r4 != 0) goto L_0x0085
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = " • "
            r4.append(r1)
            java.lang.String r1 = r4.toString()
        L_0x0085:
            int r1 = r1.length()
            java.util.Iterator r4 = r0.iterator()
        L_0x008d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b1
            java.lang.Object r5 = r4.next()
            com.ss.android.ugc.aweme.model.TextExtraStruct r5 = (com.p683ss.android.ugc.aweme.model.TextExtraStruct) r5
            int r6 = r5.getStart()
            int r6 = r6 + r1
            r5.setStart(r6)
            int r6 = r5.getEnd()
            int r6 = r6 + r1
            r5.setEnd(r6)
            java.lang.String r6 = r5.getUserId()
            r5.setUserId(r6)
            goto L_0x008d
        L_0x00b1:
            com.ss.android.ugc.aweme.profile.model.User r1 = r10.getUser()
            if (r1 == 0) goto L_0x01ec
            com.p683ss.android.ugc.aweme.comment.p1526k.C25225e.m61342c(r10)
            java.util.Iterator r1 = r0.iterator()
        L_0x00be:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00e9
            java.lang.Object r4 = r1.next()
            com.ss.android.ugc.aweme.model.TextExtraStruct r4 = (com.p683ss.android.ugc.aweme.model.TextExtraStruct) r4
            int r5 = r4.getStart()
            java.lang.String r6 = r10.mUserNamePrefix
            int r6 = r6.length()
            int r5 = r5 + r6
            int r5 = r5 + r3
            r4.setStart(r5)
            int r5 = r4.getEnd()
            java.lang.String r6 = r10.mUserNamePrefix
            int r6 = r6.length()
            int r5 = r5 + r6
            int r5 = r5 + r3
            r4.setEnd(r5)
            goto L_0x00be
        L_0x00e9:
            com.ss.android.ugc.aweme.profile.model.User r1 = r10.getUser()
            java.lang.String r1 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103642a(r1)
            int r1 = r1.length()
            int r4 = r10.offset
            int r1 = r1 - r4
            int r4 = r10.getLabelType()
            if (r4 <= 0) goto L_0x0128
            java.lang.String r4 = r10.getLabelText()
            int r4 = r4.length()
            int r4 = r4 + r1
            com.ss.android.ugc.aweme.model.TextExtraStruct r5 = new com.ss.android.ugc.aweme.model.TextExtraStruct
            r5.<init>()
            r6 = 65281(0xff01, float:9.1478E-41)
            r5.setType(r6)
            com.ss.android.ugc.aweme.comment.k.c$a r6 = new com.ss.android.ugc.aweme.comment.k.c$a
            int r7 = r10.getLabelType()
            r6.<init>(r7)
            r5.setCustomSpan(r6)
            r5.setStart(r1)
            r5.setEnd(r4)
            r0.add(r5)
            goto L_0x0129
        L_0x0128:
            r4 = r1
        L_0x0129:
            java.util.List r5 = r10.getReplyComments()
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = com.bytedance.common.utility.p522b.C9376b.m18558a(r5)
            if (r5 != 0) goto L_0x0166
            java.util.List r5 = r10.getReplyComments()
            java.lang.String r6 = "replyComments"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.lang.Object r5 = p2628d.p2629a.C52575l.m112137e(r5)
            if (r5 == 0) goto L_0x0166
            java.util.List r5 = r10.getReplyComments()
            java.lang.String r6 = "replyComments"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.lang.Object r5 = p2628d.p2629a.C52575l.m112137e(r5)
            java.lang.String r6 = "replyComments.first()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            com.ss.android.ugc.aweme.comment.model.Comment r5 = (com.p683ss.android.ugc.aweme.comment.model.Comment) r5
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getUser()
            java.lang.String r6 = "replyComments.first().user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.lang.String r5 = r5.getUid()
            goto L_0x0168
        L_0x0166:
            java.lang.String r5 = ""
        L_0x0168:
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0175
            java.lang.String r5 = r10.getReplyToUserId()
        L_0x0175:
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r7 = 2131821041(0x7f1101f1, float:1.9274814E38)
            r8 = 65282(0xff02, float:9.148E-41)
            if (r6 != 0) goto L_0x01b3
            com.ss.android.ugc.aweme.model.TextExtraStruct r6 = new com.ss.android.ugc.aweme.model.TextExtraStruct
            r6.<init>()
            r6.setType(r8)
            int r4 = r4 + 3
            r6.setStart(r4)
            java.lang.String r4 = r10.mUserNamePrefix
            int r4 = r4.length()
            r6.setEnd(r4)
            r6.setUserId(r5)
            r6.setBoldText(r3)
            android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getColor(r7)
            r6.setColor(r4)
            r0.add(r6)
            goto L_0x01b9
        L_0x01b3:
            java.lang.String r1 = r10.mUserNamePrefix
            int r1 = r1.length()
        L_0x01b9:
            com.ss.android.ugc.aweme.model.TextExtraStruct r4 = new com.ss.android.ugc.aweme.model.TextExtraStruct
            r4.<init>()
            r4.setType(r8)
            r4.setStart(r2)
            r4.setEnd(r1)
            com.ss.android.ugc.aweme.profile.model.User r10 = r10.getUser()
            java.lang.String r1 = "user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r1)
            java.lang.String r10 = r10.getUid()
            r4.setUserId(r10)
            r4.setBoldText(r3)
            android.content.Context r10 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r10 = r10.getResources()
            int r10 = r10.getColor(r7)
            r4.setColor(r10)
            r0.add(r4)
        L_0x01ec:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.CommentServiceImpl.getDisplayTextExtraForIns(com.ss.android.ugc.aweme.comment.model.Comment):java.util.List");
    }

    public final void updateDigg(Comment comment, String str) {
        C25070b.m60929a(comment, str);
    }

    public final String getTextWithGifEmojiDetailTail(Comment comment, String str) {
        C52711k.m112240b(comment, "comment");
        C52711k.m112240b(str, "text");
        return C25225e.m61333a(comment, str);
    }

    public final C25261j providerCommentReplyButtonViewHolder(ViewGroup viewGroup, C25147a aVar) {
        C52711k.m112240b(viewGroup, "itemView");
        C52711k.m112240b(aVar, "listener");
        return new CommentReplyButtonViewHolder(viewGroup, aVar);
    }

    public final C25264m providerCommentReplyViewHolder(ViewGroup viewGroup, C25147a aVar) {
        C52711k.m112240b(viewGroup, "itemView");
        C52711k.m112240b(aVar, "listener");
        return new CommentReplyViewHolder(viewGroup, aVar);
    }

    public final void handleCommentInputPublishSuccess(Context context, Comment comment) {
        Comment comment2;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(comment, "comment");
        C25367g a = C25367g.m61669a(context);
        if (a == null || !TextUtils.equals(comment.getAwemeId(), a.mo51940q())) {
            C47718bf.m103288a(new C25064a(3, new Object[]{comment.getAwemeId(), comment.clone()}));
            return;
        }
        int[] t = a.mo51942t();
        a.f67124t.mo51963a(comment, t[0], t[1]);
        a.mo51914a(1);
        Object[] objArr = new Object[2];
        objArr[0] = a.mo51940q();
        if (comment == null) {
            comment2 = null;
        } else {
            comment2 = comment.clone();
        }
        objArr[1] = comment2;
        C47718bf.m103288a(new C25064a(3, objArr));
    }

    public final List<TextExtraStruct> getSearchCommentTextExtra(C26129j jVar, C52670a<C52860x> aVar) {
        C31244c cVar;
        C26129j jVar2 = jVar;
        C52670a<C52860x> aVar2 = aVar;
        C52711k.m112240b(jVar2, "commentStruct");
        C52711k.m112240b(aVar2, "onLinkTagClick");
        C52711k.m112240b(jVar2, "$this$getSearchCommentTextExtra");
        C52711k.m112240b(aVar2, "onLinkTagClick");
        ArrayList arrayList = new ArrayList();
        int length = jVar.getCommentInfo().length() + 1;
        int i = length + 7;
        C25227b bVar = new C25227b(aVar2);
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        textExtraStruct.setType(TextExtraStruct.TYPE_CUSTOM);
        textExtraStruct.setCustomSpan(bVar);
        textExtraStruct.setStart(length);
        textExtraStruct.setEnd(i);
        if (C25112e.m61020a()) {
            cVar = new C31244c(C11010c.m22280a(), jVar.getTagText(), "#FF161823", R.drawable.dg7, "#FF161823", "#57FFFFFF", 10, 17);
        } else {
            cVar = new C31244c(C11010c.m22280a(), jVar.getTagText(), "#FFFFFF", R.drawable.dg7, "#FFFFFF", "#57161823", 10, 17);
        }
        cVar.f81805a = C9432q.m18687b(C11010c.m22280a(), 0.5f);
        TextExtraStruct textExtraStruct2 = new TextExtraStruct();
        textExtraStruct2.setType(TextExtraStruct.TYPE_CUSTOM);
        textExtraStruct2.setCustomSpan(cVar);
        textExtraStruct2.setStart(length);
        textExtraStruct2.setEnd(i);
        arrayList.add(textExtraStruct);
        arrayList.add(textExtraStruct2);
        int i2 = i + 1;
        int length2 = i + C25225e.m61338a(jVar).length();
        TextExtraStruct textExtraStruct3 = new TextExtraStruct();
        textExtraStruct3.setType(TextExtraStruct.TYPE_CUSTOM);
        textExtraStruct3.setCustomSpan(new C25222b(C23728o.m58241a(13.0d), C11010c.m22280a().getResources().getColor(R.color.jl)));
        textExtraStruct3.setStart(i2);
        textExtraStruct3.setEnd(length2);
        arrayList.add(textExtraStruct3);
        return arrayList;
    }

    public final void sendHideAllReplyEvent(String str, String str2, String str3) {
        C25207a.m61294b(str, str2, str3);
    }

    public final void sendShowMoreReplyEvent(String str, String str2, String str3) {
        C25207a.m61296c(str, str2, str3);
    }

    public final C25259h showCommentList(Activity activity, Aweme aweme, C25171f fVar) {
        C52711k.m112240b(fVar, "pageParam");
        return C25367g.m61668a(activity, aweme, fVar);
    }

    public final C25145b providerCommentInputManager(Fragment fragment, int i, C25285d dVar) {
        C52711k.m112240b(fragment, "fragment");
        C52711k.m112240b(dVar, "service");
        return new C25156f(fragment, i, dVar);
    }

    public final C25268q providerCommentViewHolderFollowFeed(ViewGroup viewGroup, C25147a aVar, String str) {
        C52711k.m112240b(viewGroup, "itemView");
        C52711k.m112240b(aVar, "listener");
        C52711k.m112240b(str, "authorUid");
        return new C25128q(viewGroup, aVar, str);
    }

    public final String getDisplayTextForIns(Comment comment, Paint paint, int i) {
        C52711k.m112240b(comment, "comment");
        C52711k.m112240b(paint, "paint");
        C52711k.m112240b(comment, "$this$getDisplayTextForIns");
        C52711k.m112240b(paint, "paint");
        StringBuilder sb = new StringBuilder();
        sb.append(C25225e.m61339b(comment, paint, i));
        sb.append("：");
        sb.append(C25225e.m61343d(comment));
        return sb.toString();
    }

    public final String getDisplayTextForMoment(Comment comment, Paint paint, int i) {
        C52711k.m112240b(comment, "comment");
        C52711k.m112240b(paint, "paint");
        C52711k.m112240b(comment, "$this$getDisplayTextForMoment");
        C52711k.m112240b(paint, "paint");
        StringBuilder sb = new StringBuilder();
        sb.append(C25225e.m61332a(comment, paint, i));
        sb.append(C25225e.m61343d(comment));
        return sb.toString();
    }

    public final List<TextExtraStruct> getDisplayLinkTextExtra(Context context, Aweme aweme, C26129j jVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(jVar, "commentStruct");
        C52711k.m112240b(jVar, "$this$getDisplayLinkTextExtra");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aweme, "aweme");
        ArrayList arrayList = new ArrayList();
        int length = jVar.getCommentInfo().length() + 1;
        int i = length + 7;
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        textExtraStruct.setType(TextExtraStruct.TYPE_CUSTOM);
        textExtraStruct.setCustomSpan(C25282a.m61494a().getLinkTagSpan(context, aweme));
        textExtraStruct.setStart(length);
        textExtraStruct.setEnd(i);
        arrayList.add(textExtraStruct);
        int i2 = i + 1;
        int length2 = i + C25225e.m61338a(jVar).length();
        TextExtraStruct textExtraStruct2 = new TextExtraStruct();
        textExtraStruct2.setType(TextExtraStruct.TYPE_CUSTOM);
        textExtraStruct2.setCustomSpan(new C25222b(C23728o.m58241a(13.0d), C0726c.m2098c(C11010c.m22280a(), R.color.jl)));
        textExtraStruct2.setStart(i2);
        textExtraStruct2.setEnd(length2);
        arrayList.add(textExtraStruct2);
        return arrayList;
    }

    public final List<TextExtraStruct> getNewDisplayTextExtra(C26129j jVar, AwemeRawAd awemeRawAd, C52670a<C52860x> aVar) {
        String str;
        C26129j jVar2 = jVar;
        C52670a<C52860x> aVar2 = aVar;
        C52711k.m112240b(jVar2, "commentStruct");
        C52711k.m112240b(aVar2, "onLinkTagClick");
        C52711k.m112240b(jVar2, "$this$getNewDisplayTextExtra");
        C52711k.m112240b(aVar2, "onLinkTagClick");
        ArrayList arrayList = new ArrayList();
        int length = jVar.getCommentInfo().length() + 1;
        int i = length + 7;
        C25226a aVar3 = new C25226a(aVar2);
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        textExtraStruct.setType(TextExtraStruct.TYPE_CUSTOM);
        textExtraStruct.setCustomSpan(aVar3);
        textExtraStruct.setStart(length);
        textExtraStruct.setEnd(i);
        if (awemeRawAd != null) {
            str = awemeRawAd.getButtonText();
        } else {
            str = null;
        }
        if (str != null) {
            TextExtraStruct textExtraStruct2 = new TextExtraStruct();
            textExtraStruct2.setType(TextExtraStruct.TYPE_CUSTOM);
            C31244c cVar = new C31244c(C11010c.m22280a(), awemeRawAd.getButtonText(), "#80161823", R.drawable.cj6, "#80161823", "#0F161823", C23728o.m58244b((double) C23728o.m58246c(12.0d)), 15);
            cVar.f81805a = C9432q.m18687b(C11010c.m22280a(), -2.38f);
            textExtraStruct2.setCustomSpan(cVar);
            textExtraStruct2.setStart(length);
            textExtraStruct2.setEnd(i);
            arrayList.add(textExtraStruct2);
        }
        arrayList.add(textExtraStruct);
        int i2 = i + 1;
        int length2 = i + C25225e.m61338a(jVar).length();
        TextExtraStruct textExtraStruct3 = new TextExtraStruct();
        textExtraStruct3.setType(TextExtraStruct.TYPE_CUSTOM);
        textExtraStruct3.setCustomSpan(new C25222b(C23728o.m58241a(13.0d), C11010c.m22280a().getResources().getColor(R.color.jl)));
        textExtraStruct3.setStart(i2);
        textExtraStruct3.setEnd(length2);
        arrayList.add(textExtraStruct3);
        return arrayList;
    }

    public final void sendCloseTextEvent(String str, Aweme aweme, long j, String str2) {
        C25207a.m61281a(str, aweme, j, str2);
    }

    public final void sendCopyCommentEvent(String str, String str2, String str3, Aweme aweme) {
        C25207a.m61288a(str, str2, str3, aweme);
    }

    public final void sendEmojiToKeyboardEvent(String str, String str2, String str3, String str4) {
        C25207a.m61289a(str, str2, str3, str4);
    }

    public final void sendEnterTextEvent(String str, Aweme aweme, String str2, String str3) {
        C25207a.m61283a(str, aweme, str2, str3);
    }

    public final boolean handleException(Context context, Exception exc, int i, boolean z) {
        return C25137a.m61052a(context, exc, i, z);
    }

    public final void sendReportCommentEvent(String str, Aweme aweme, String str2, String str3, String str4) {
        C52711k.m112240b(aweme, "aweme");
        C25207a.m61284a(str, aweme, str2, str3, str4);
    }

    public final C30153k providerFeedHotCommentManager(ViewGroup viewGroup, View view, View view2, DataCenter dataCenter, int i) {
        C52711k.m112240b(dataCenter, "dataCenter");
        C30086k kVar = new C30086k(viewGroup, view, view2, dataCenter, i);
        return kVar;
    }

    public final void sendCommentEvent(String str, Aweme aweme, JSONObject jSONObject, boolean z, String str2) {
        int i;
        if (str.equals("opus")) {
            if (z) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
        }
        String str3 = str;
        C26890h.m65006a(C11010c.m22280a(), "comment", str3, aweme.getAid(), 0, C23794bh.m58391e().mo65592a(jSONObject, aweme, str2));
        User author = aweme.getAuthor();
        String str4 = "comment";
        C23089d a = C23089d.m56640a().mo47829a("enter_from", str).mo47829a("group_id", aweme.getAid());
        String str5 = "follow_status";
        if (author != null) {
            i = author.getFollowStatus();
        } else {
            i = 0;
        }
        C26890h.m65011a(str4, a.mo47826a(str5, i).f61491a);
    }

    public final void sendEmojiClickEvent(String str, int i, String str2, String str3, String str4) {
        String str5 = "comment_panel";
        if (i == 2) {
            String str6 = str2;
            String str7 = str3;
            C26890h.m65006a(C11010c.m22280a(), "emoji_shortcut_click", str6, str7, 0, C23088c.m56631a().mo47824a("group_id", str3).mo47824a("enter_from", str2).mo47824a("author_id", str4).mo47824a("enter_method", str5).mo47825b());
            C26890h.m65011a("emoji_shortcut_click", C23089d.m56640a().mo47829a("enter_from", str2).mo47829a("group_id", str3).mo47829a("author_id", str4).mo47829a("enter_method", str5).f61491a);
        }
    }

    public final C25144a showInputFragment(View view, C0654k kVar, String str, C25284c cVar, C25149c cVar2) {
        CommentInputFragment commentInputFragment;
        if (view == null || kVar == null) {
            commentInputFragment = null;
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.et7);
            Fragment a = kVar.mo2224a("comment_input_tag");
            if (a != null) {
                if (viewGroup2 != null) {
                    commentInputFragment = (CommentInputFragment) a;
                } else {
                    kVar.mo2225a().mo2177a(a).mo2195c();
                }
            }
            if (viewGroup2 == null) {
                RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext());
                relativeLayout.setId(R.id.et7);
                viewGroup.addView(relativeLayout, new LayoutParams(-1, -1));
            }
            CommentInputFragment commentInputFragment2 = new CommentInputFragment();
            kVar.mo2225a().mo2176a(R.id.et7, commentInputFragment2, "comment_input_tag").mo2195c();
            commentInputFragment = commentInputFragment2;
        }
        if (commentInputFragment != null) {
            commentInputFragment.f66906e = str;
            commentInputFragment.f66903b = cVar;
            commentInputFragment.f66905d = cVar2;
        }
        return commentInputFragment;
    }

    public final void sendLikeCommentResultEvent(String str, Aweme aweme, String str2, boolean z, String str3, String str4) {
        C25207a.m61286a(str, aweme, str2, z, str3, str4, false);
    }

    public final void sendEnterCommentEvent(String str, Aweme aweme, String str2, int i, String str3, String str4) {
        C25207a.m61282a(str, aweme, str2, i, str3, str4, "", "", "", "", "", "", "", "", "", null);
    }

    public final void sendPostCommentEvent(Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7) {
        String str8 = str2;
        String str9 = str;
        C23200ag w = new C23200ag().mo47964c(str).mo47960a(str2).mo47962b(str2).mo47975w(str7);
        Aweme aweme2 = aweme;
        String str10 = str3;
        String str11 = str4;
        ((C23200ag) ((C23200ag) ((C23200ag) w.mo47954f(aweme).mo48098a(Boolean.valueOf(C31190f.m72834b(aweme)))).mo47965d(str3).mo47972t("").mo47971s("").mo47970h("").mo48100j("")).mo48101k("")).mo47968f(str4).mo47969g(str5).mo47961a(false).mo47967e(str6).mo47959a(0).mo47963b(false).mo47973u("").mo47974v("").mo48076e();
    }

    public final void fetchPreloadCommentList(String str, long j, int i, int i2, String str2, String str3, int i3, int i4, boolean z, String str4, String str5) {
        CommentApi.m61041a(str, j, i, str3, C47945d.m103731a(), C47945d.m103733b(), null, C23064c.m56602a(str5), C30228f.m70983g(), 0, 0);
    }

    public final void sendCommentDurationEvent(String str, String str2, String str3, int i, String str4, int i2, long j, String str5, String str6, String str7, String str8, String str9) {
        C25208b.m61300a(str, str2, str3, i, str4, i2, j, str5, 0, str6, str7, str8, str9);
    }
}
