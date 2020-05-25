package com.p683ss.android.ugc.aweme.comment_sticker.view;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.comment_sticker.C25466b;
import com.p683ss.android.ugc.aweme.comment_sticker.C25467c;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.scene.C18998a;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43509at;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43577d;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2230e.C44564a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2230e.C44565b;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45405aw;
import com.p683ss.android.ugc.aweme.sticker.data.C45868a;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.comment_sticker.view.CommentStickerView */
public final class CommentStickerView extends LinearLayout implements C43509at<C44564a> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f67392a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentStickerView.class), "avatarView", "getAvatarView()Lcom/ss/android/ugc/aweme/base/ui/CircleImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentStickerView.class), "commentTextView", "getCommentTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentStickerView.class), "replyTextView", "getReplyTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentStickerView.class), "textLayout", "getTextLayout()Landroid/widget/LinearLayout;"))};

    /* renamed from: d */
    public static final C25475a f67393d = new C25475a(null);

    /* renamed from: b */
    public View f67394b;

    /* renamed from: c */
    public C25467c f67395c;

    /* renamed from: e */
    private CommentVideoModel f67396e;

    /* renamed from: f */
    private C44565b f67397f;

    /* renamed from: g */
    private long f67398g;

    /* renamed from: h */
    private boolean f67399h = true;

    /* renamed from: i */
    private long f67400i;

    /* renamed from: j */
    private SafeHandler f67401j;

    /* renamed from: k */
    private C25466b f67402k;

    /* renamed from: l */
    private final C52668f f67403l = C52732g.m112285a(new C25476b(this));

    /* renamed from: m */
    private final C52668f f67404m = C52732g.m112285a(new C25478d(this));

    /* renamed from: n */
    private final C52668f f67405n = C52732g.m112285a(new C25479e(this));

    /* renamed from: o */
    private final C52668f f67406o = C52732g.m112285a(new C25482h(this));

    /* renamed from: p */
    private boolean f67407p;

    /* renamed from: com.ss.android.ugc.aweme.comment_sticker.view.CommentStickerView$a */
    public static final class C25475a {
        private C25475a() {
        }

        public /* synthetic */ C25475a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment_sticker.view.CommentStickerView$b */
    static final class C25476b extends C52712l implements C52670a<CircleImageView> {

        /* renamed from: a */
        final /* synthetic */ CommentStickerView f67408a;

        C25476b(CommentStickerView commentStickerView) {
            this.f67408a = commentStickerView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (CircleImageView) CommentStickerView.m61983a(this.f67408a).findViewById(R.id.e2r);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment_sticker.view.CommentStickerView$c */
    public static final class C25477c implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ CommentStickerView f67409a;

        public final void onGlobalLayout() {
            boolean z;
            if (CommentStickerView.m61983a(this.f67409a).getWidth() > 0) {
                this.f67409a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                CommentStickerView commentStickerView = this.f67409a;
                int width = commentStickerView.getTextLayout().getWidth();
                View view = commentStickerView.f67394b;
                if (view == null) {
                    C52711k.m112237a("root");
                }
                int width2 = view.getWidth() - commentStickerView.getTextLayout().getWidth();
                if (commentStickerView.getCommentTextView().getWidth() >= width || commentStickerView.getReplyTextView().getWidth() >= width) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    commentStickerView.getLayoutParams().width = width2 + Math.max(commentStickerView.getCommentTextView().getWidth(), commentStickerView.getReplyTextView().getWidth());
                    commentStickerView.requestLayout();
                    commentStickerView.mo52064a();
                    return;
                }
                if (commentStickerView.getCommentTextView().getLineCount() <= 6) {
                    commentStickerView.mo52065a(15.0f, 18.0f);
                } else if (commentStickerView.getCommentTextView().getLineCount() <= 9) {
                    commentStickerView.mo52065a(13.0f, 15.0f);
                } else {
                    commentStickerView.mo52065a(11.0f, 12.0f);
                }
                commentStickerView.getCommentTextView().setMaxLines(8);
                commentStickerView.mo52064a();
            }
        }

        C25477c(CommentStickerView commentStickerView) {
            this.f67409a = commentStickerView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment_sticker.view.CommentStickerView$d */
    static final class C25478d extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ CommentStickerView f67410a;

        C25478d(CommentStickerView commentStickerView) {
            this.f67410a = commentStickerView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) CommentStickerView.m61983a(this.f67410a).findViewById(R.id.e2z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment_sticker.view.CommentStickerView$e */
    static final class C25479e extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ CommentStickerView f67411a;

        C25479e(CommentStickerView commentStickerView) {
            this.f67411a = commentStickerView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) CommentStickerView.m61983a(this.f67411a).findViewById(R.id.e30);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment_sticker.view.CommentStickerView$f */
    static final class C25480f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommentStickerView f67412a;

        C25480f(CommentStickerView commentStickerView) {
            this.f67412a = commentStickerView;
        }

        public final void run() {
            this.f67412a.mo52074d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment_sticker.view.CommentStickerView$g */
    public static final class C25481g implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ CommentStickerView f67413a;

        public final void onGlobalLayout() {
            this.f67413a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f67413a.setVisibility(0);
            C25467c cVar = this.f67413a.f67395c;
            if (cVar != null) {
                cVar.mo52061a();
            }
        }

        C25481g(CommentStickerView commentStickerView) {
            this.f67413a = commentStickerView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment_sticker.view.CommentStickerView$h */
    static final class C25482h extends C52712l implements C52670a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ CommentStickerView f67414a;

        C25482h(CommentStickerView commentStickerView) {
            this.f67414a = commentStickerView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (LinearLayout) CommentStickerView.m61983a(this.f67414a).findViewById(R.id.ezq);
        }
    }

    private final CircleImageView getAvatarView() {
        return (CircleImageView) this.f67403l.getValue();
    }

    /* access modifiers changed from: 0000 */
    public final DmtTextView getCommentTextView() {
        return (DmtTextView) this.f67404m.getValue();
    }

    public final CommentVideoModel getData() {
        return this.f67396e;
    }

    /* access modifiers changed from: 0000 */
    public final DmtTextView getReplyTextView() {
        return (DmtTextView) this.f67405n.getValue();
    }

    /* access modifiers changed from: 0000 */
    public final LinearLayout getTextLayout() {
        return (LinearLayout) this.f67406o.getValue();
    }

    /* renamed from: e */
    private void m61985e() {
        getViewTreeObserver().addOnGlobalLayoutListener(new C25477c(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo52064a() {
        getViewTreeObserver().addOnGlobalLayoutListener(new C25481g(this));
    }

    /* renamed from: d */
    public final boolean mo52074d() {
        boolean z;
        int i = 0;
        if (this.f67396e != null) {
            C25466b bVar = this.f67402k;
            if (bVar == null) {
                C52711k.m112237a("controller");
            }
            if (!bVar.mo52060a() && !this.f67407p) {
                CommentVideoModel commentVideoModel = this.f67396e;
                if (commentVideoModel == null) {
                    C52711k.m112234a();
                }
                boolean isVisibleWhen = commentVideoModel.isVisibleWhen(this.f67398g);
                if (!isVisibleWhen || 8 != getVisibility()) {
                    z = false;
                } else {
                    z = true;
                }
                View view = this;
                if (!isVisibleWhen) {
                    i = 8;
                }
                C23729p.m58264b(view, i);
                this.f67399h = isVisibleWhen;
                return z;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C44564a mo52072c() {
        CommentVideoModel commentVideoModel;
        InteractStickerStruct interactStickerStruct;
        InteractStickerStruct interactStickerStruct2;
        if (this.f67396e == null) {
            CommentVideoModel commentVideoModel2 = new CommentVideoModel(null, null, null, null, null, null, null, null, 0, null, 0, 0, 4095, null);
            this.f67396e = commentVideoModel2;
        }
        CommentVideoModel commentVideoModel3 = this.f67396e;
        if (commentVideoModel3 == null) {
            commentVideoModel = new CommentVideoModel(null, null, null, null, null, null, null, null, 0, null, 0, 0, 4095, null);
        } else {
            CommentVideoModel commentVideoModel4 = new CommentVideoModel(null, null, null, null, null, null, null, null, 0, null, 0, 0, 4095, null);
            commentVideoModel4.setStartTime(commentVideoModel3.getStartTime());
            commentVideoModel4.setEndTime(commentVideoModel3.getEndTime());
            commentVideoModel = commentVideoModel4;
        }
        C44565b bVar = this.f67397f;
        if (bVar != null) {
            interactStickerStruct = bVar.mo88731d();
        } else {
            interactStickerStruct = null;
        }
        if (interactStickerStruct == null) {
            interactStickerStruct2 = new InteractStickerStruct();
        } else {
            InteractStickerStruct interactStickerStruct3 = new InteractStickerStruct();
            interactStickerStruct3.setType(interactStickerStruct.getType());
            interactStickerStruct3.setIndex(interactStickerStruct.getIndex());
            interactStickerStruct3.setAttr(interactStickerStruct.getAttr());
            interactStickerStruct3.setTrackList(interactStickerStruct.getTrackList());
            interactStickerStruct2 = interactStickerStruct3;
        }
        return new C44564a(commentVideoModel, interactStickerStruct2);
    }

    public final void setEnableEdit(boolean z) {
        this.f67399h = z;
    }

    public final void setPlayPosition(long j) {
        this.f67398g = j;
    }

    public final void setController(C25466b bVar) {
        C52711k.m112240b(bVar, "controller");
        this.f67402k = bVar;
    }

    public final void setDumpData(C44565b bVar) {
        C52711k.m112240b(bVar, "dumpData");
        this.f67397f = bVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ View m61983a(CommentStickerView commentStickerView) {
        View view = commentStickerView.f67394b;
        if (view == null) {
            C52711k.m112237a("root");
        }
        return view;
    }

    private final void setAvatarImage(UrlModel urlModel) {
        if (urlModel != null) {
            C23515d.m57669a((RemoteImageView) getAvatarView(), urlModel);
        }
    }

    public final void setAlpha(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3137255f;
        }
        mo52066a(f, false);
    }

    private final void setCommentMsg(String str) {
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            getCommentTextView().setText(charSequence);
            C29408b.m69342a((TextView) getCommentTextView());
        }
    }

    /* renamed from: a */
    private final void m61984a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.b5h, this, true);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…icker_layout, this, true)");
        this.f67394b = inflate;
        setBackgroundResource(R.drawable.crh);
        setOrientation(0);
        setVisibility(4);
        Activity a = C18998a.m46169a(context);
        if (a != null) {
            this.f67401j = new SafeHandler((AppCompatActivity) a);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
    }

    private final void setAuthorName(String str) {
        if (!TextUtils.isEmpty(str)) {
            DmtTextView replyTextView = getReplyTextView();
            Context context = getContext();
            C52711k.m112236a((Object) context, "context");
            replyTextView.setText(context.getResources().getString(R.string.h_y, new Object[]{str}));
        }
    }

    /* renamed from: b */
    public final int mo52069b(int i) {
        if (getData() != null) {
            CommentVideoModel data = getData();
            if (data == null) {
                C52711k.m112234a();
            }
            if (data.hasTimeData()) {
                CommentVideoModel data2 = getData();
                if (data2 == null) {
                    C52711k.m112234a();
                }
                return data2.getEndTime();
            }
        }
        return i;
    }

    /* renamed from: c */
    public final int mo52071c(int i) {
        if (getData() != null) {
            CommentVideoModel data = getData();
            if (data == null) {
                C52711k.m112234a();
            }
            if (data.hasTimeData()) {
                CommentVideoModel data2 = getData();
                if (data2 == null) {
                    C52711k.m112234a();
                }
                return data2.getStartTime();
            }
        }
        return 0;
    }

    /* renamed from: d */
    public final int mo52073d(int i) {
        if (getData() != null) {
            CommentVideoModel data = getData();
            if (data == null) {
                C52711k.m112234a();
            }
            if (data.hasTimeData()) {
                CommentVideoModel data2 = getData();
                if (data2 == null) {
                    C52711k.m112234a();
                }
                return data2.getEndTime();
            }
        }
        return i;
    }

    public final void setTouching(boolean z) {
        if (z != this.f67407p) {
            this.f67407p = z;
            if (!z) {
                this.f67400i = SystemClock.elapsedRealtime();
                SafeHandler safeHandler = this.f67401j;
                if (safeHandler == null) {
                    C52711k.m112237a("handler");
                }
                safeHandler.postDelayed(new C25480f(this), 1000);
            }
        }
    }

    public CommentStickerView(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
        m61984a(context);
    }

    /* renamed from: a */
    public final int mo52063a(int i) {
        if (getData() != null) {
            CommentVideoModel data = getData();
            if (data == null) {
                C52711k.m112234a();
            }
            if (data.hasTimeData()) {
                CommentVideoModel data2 = getData();
                if (data2 == null) {
                    C52711k.m112234a();
                }
                return data2.getStartTime();
            }
        }
        return i;
    }

    /* renamed from: a */
    public final void mo52066a(float f, boolean z) {
        setAlpha(f);
    }

    public CommentStickerView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet);
        m61984a(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo52065a(float f, float f2) {
        getCommentTextView().setTextSize(0, C20141b.m49696a(getContext(), f));
        C45405aw.m98964a(getCommentTextView(), (int) C20141b.m49696a(getContext(), f2));
    }

    /* renamed from: a */
    public final void mo52067a(CommentVideoModel commentVideoModel, C25467c cVar) {
        UrlModel urlModel;
        String str;
        this.f67396e = commentVideoModel;
        this.f67395c = cVar;
        CommentVideoModel commentVideoModel2 = this.f67396e;
        String str2 = null;
        if (commentVideoModel2 != null) {
            urlModel = commentVideoModel2.getUserAvatar();
        } else {
            urlModel = null;
        }
        setAvatarImage(urlModel);
        CommentVideoModel commentVideoModel3 = this.f67396e;
        if (commentVideoModel3 != null) {
            str = commentVideoModel3.getCommentMsg();
        } else {
            str = null;
        }
        setCommentMsg(str);
        CommentVideoModel commentVideoModel4 = this.f67396e;
        if (commentVideoModel4 != null) {
            str2 = commentVideoModel4.getUserName();
        }
        setAuthorName(str2);
        m61985e();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo52068a(C45868a aVar, int i, int i2) {
        InteractStickerStruct interactStickerStruct;
        int i3;
        int i4;
        C44564a aVar2 = (C44564a) aVar;
        C52711k.m112240b(aVar2, "stickerData");
        CommentVideoModel commentVideoModel = this.f67396e;
        if (commentVideoModel != null) {
            CommentVideoModel commentVideoModel2 = aVar2.f112751a;
            if (commentVideoModel2 != null) {
                i4 = commentVideoModel2.getStartTime();
            } else {
                i4 = 0;
            }
            commentVideoModel.setStartTime(i4);
        }
        CommentVideoModel commentVideoModel3 = this.f67396e;
        if (commentVideoModel3 != null) {
            CommentVideoModel commentVideoModel4 = aVar2.f112751a;
            if (commentVideoModel4 != null) {
                i3 = commentVideoModel4.getEndTime();
            } else {
                i3 = 0;
            }
            commentVideoModel3.setEndTime(i3);
        }
        NormalTrackTimeStamp a = C43577d.m95722a(aVar2.f112752b);
        C44565b bVar = this.f67397f;
        if (bVar != null) {
            interactStickerStruct = bVar.mo88731d();
        } else {
            interactStickerStruct = null;
        }
        NormalTrackTimeStamp a2 = C43577d.m95722a(interactStickerStruct);
        if (!(a == null || a2 == null)) {
            a.setRotation(a.getRotation() - a2.getRotation());
            if (!C52711k.m112238a(a2.getScale(), 0.0f)) {
                float floatValue = a.getScale().floatValue();
                Float scale = a2.getScale();
                C52711k.m112236a((Object) scale, "newLocation.scale");
                a.setScale(Float.valueOf(floatValue / scale.floatValue()));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(a);
            String b = C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34889b(arrayList);
            InteractStickerStruct interactStickerStruct2 = aVar2.f112752b;
            if (interactStickerStruct2 != null) {
                interactStickerStruct2.setTrackList(b);
            }
            C44565b bVar2 = this.f67397f;
            if (bVar2 != null) {
                bVar2.mo88751b(false);
            }
            C44565b bVar3 = this.f67397f;
            if (bVar3 != null) {
                bVar3.mo88747a(aVar2.f112752b, Boolean.valueOf(false));
            }
            C44565b bVar4 = this.f67397f;
            if (bVar4 != null) {
                bVar4.mo88751b(true);
            }
        }
    }
}
