package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.api.CancelVideoMaskApi;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30336e;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47810dh;
import com.p683ss.android.ugc.aweme.utils.C47935p;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.ss.android.ugc.trill.R;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ef */
public final class C30934ef extends C31009h implements C0199s<C23274a> {

    /* renamed from: b */
    public static final C30935a f81012b = new C30935a(null);

    /* renamed from: a */
    public View f81013a;

    /* renamed from: c */
    private DmtTextView f81014c;

    /* renamed from: d */
    private DmtTextView f81015d;

    /* renamed from: e */
    private DmtTextView f81016e;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ef$a */
    public static final class C30935a {
        private C30935a() {
        }

        public /* synthetic */ C30935a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ef$b */
    public static final class C30936b implements C1674ab<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ C30934ef f81017a;

        public final void onComplete() {
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        C30936b(C30934ef efVar) {
            this.f81017a = efVar;
        }

        public final void onError(Throwable th) {
            String str;
            C52711k.m112240b(th, "e");
            if (th instanceof C23459a) {
                C23459a aVar = (C23459a) th;
                if (TextUtils.isEmpty(aVar.getErrorMsg())) {
                    str = this.f81017a.f81198r.getString(R.string.cfy);
                } else {
                    str = aVar.getErrorMsg();
                }
                C10691a.m21545b(C11010c.m22280a(), str).mo19066a();
                return;
            }
            C10691a.m21542b(C11010c.m22280a(), (int) R.string.cfy).mo19066a();
        }

        public final /* synthetic */ void onNext(Object obj) {
            BaseResponse baseResponse = (BaseResponse) obj;
            C52711k.m112240b(baseResponse, "t");
            if (baseResponse.status_code == 0) {
                Aweme aweme = this.f81017a.f81192l;
                C52711k.m112236a((Object) aweme, "mAweme");
                aweme.setVideoMaskInfo(null);
                C23324d.m57378a().updateAweme(this.f81017a.f81192l);
                View view = this.f81017a.f81013a;
                if (view != null) {
                    view.setVisibility(8);
                }
                C30934ef efVar = this.f81017a;
                C48021h M = C48121w.m104249M();
                Aweme aweme2 = efVar.f81192l;
                C52711k.m112236a((Object) aweme2, "aweme");
                M.mo95274a(aweme2.getVideo(), true);
                C47718bf.m103288a(new C30336e());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ef$c */
    static final class C30937c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C30934ef f81018a;

        C30937c(C30934ef efVar) {
            this.f81018a = efVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C30934ef efVar = this.f81018a;
            Context context = efVar.f81198r;
            C52711k.m112236a((Object) context, "mContext");
            if (!C47810dh.m103451a(context)) {
                C10691a.m21551c(efVar.f81198r, efVar.f81198r.getString(R.string.cg1)).mo19066a();
            } else if (efVar.f81192l != null) {
                Aweme aweme = efVar.f81192l;
                C52711k.m112236a((Object) aweme, "mAweme");
                if (aweme.getVideoMaskInfo() != null) {
                    Aweme aweme2 = efVar.f81192l;
                    C52711k.m112236a((Object) aweme2, "mAweme");
                    String aid = aweme2.getAid();
                    C52711k.m112236a((Object) aid, "mAweme.aid");
                    Aweme aweme3 = efVar.f81192l;
                    C52711k.m112236a((Object) aweme3, "mAweme");
                    Integer maskType = aweme3.getVideoMaskInfo().getMaskType();
                    Aweme aweme4 = efVar.f81192l;
                    C52711k.m112236a((Object) aweme4, "mAweme");
                    Integer status = aweme4.getVideoMaskInfo().getStatus();
                    C52711k.m112240b(aid, "awemeId");
                    CancelVideoMaskApi.f78668a.cancelVideoMask(aid, maskType, status).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C30936b<Object>(efVar));
                }
            }
            this.f81018a.mo63696a("showpost_click");
        }
    }

    /* renamed from: a */
    public final void mo49781a() {
    }

    /* renamed from: e */
    private static void m72459e() {
        C48121w.m104249M().mo95293z();
    }

    /* renamed from: d */
    private final void m72458d() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        if (C47935p.m103712e(this.f81192l)) {
            DmtTextView dmtTextView = this.f81014c;
            if (dmtTextView != null) {
                Aweme aweme = this.f81192l;
                C52711k.m112236a((Object) aweme, "mAweme");
                VideoMaskInfo videoMaskInfo = aweme.getVideoMaskInfo();
                if (videoMaskInfo != null) {
                    String title = videoMaskInfo.getTitle();
                    if (title != null) {
                        charSequence3 = title;
                        dmtTextView.setText(charSequence3);
                    }
                }
                charSequence3 = this.f81198r.getString(R.string.hb7);
                dmtTextView.setText(charSequence3);
            }
            DmtTextView dmtTextView2 = this.f81016e;
            if (dmtTextView2 != null) {
                Aweme aweme2 = this.f81192l;
                C52711k.m112236a((Object) aweme2, "mAweme");
                VideoMaskInfo videoMaskInfo2 = aweme2.getVideoMaskInfo();
                if (videoMaskInfo2 != null) {
                    String content = videoMaskInfo2.getContent();
                    if (content != null) {
                        charSequence2 = content;
                        dmtTextView2.setText(charSequence2);
                    }
                }
                charSequence2 = this.f81198r.getString(R.string.hb5);
                dmtTextView2.setText(charSequence2);
            }
            DmtTextView dmtTextView3 = this.f81015d;
            if (dmtTextView3 != null) {
                Aweme aweme3 = this.f81192l;
                C52711k.m112236a((Object) aweme3, "mAweme");
                VideoMaskInfo videoMaskInfo3 = aweme3.getVideoMaskInfo();
                if (videoMaskInfo3 != null) {
                    String cancelMaskLabel = videoMaskInfo3.getCancelMaskLabel();
                    if (cancelMaskLabel != null) {
                        charSequence = cancelMaskLabel;
                        dmtTextView3.setText(charSequence);
                        dmtTextView3.setOnClickListener(new C30937c(this));
                    }
                }
                charSequence = this.f81198r.getString(R.string.hb6);
                dmtTextView3.setText(charSequence);
                dmtTextView3.setOnClickListener(new C30937c(this));
            }
            View view = this.f81013a;
            if (view != null) {
                view.setVisibility(0);
            }
            mo63696a("reportlayer_show");
            return;
        }
        View view2 = this.f81013a;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    public C30934ef(View view) {
        super(view);
    }

    /* renamed from: a */
    public final void mo58323a(VideoItemParams videoItemParams) {
        super.mo58323a(videoItemParams);
        m72457b("on_viewpager_page_selected");
    }

    public final /* synthetic */ void onChanged(Object obj) {
        String str;
        C23274a aVar = (C23274a) obj;
        if (aVar != null) {
            str = aVar.f62242a;
        } else {
            str = null;
        }
        m72457b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49784a(DataCenter dataCenter) {
        DataCenter dataCenter2 = this.f81197q;
        if (dataCenter2 != null) {
            C0199s sVar = this;
            DataCenter a = dataCenter2.mo48226a("on_viewpager_page_selected", sVar);
            if (a != null) {
                a.mo48226a("startPlayAnimation", sVar);
            }
        }
    }

    /* renamed from: b */
    private final void m72457b(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1180796502) {
                if (hashCode == 307897710 && str.equals("startPlayAnimation") && C47935p.m103712e(this.f81192l)) {
                    View view = this.f81013a;
                    if (view != null && view.getVisibility() == 0) {
                        m72459e();
                    }
                }
            } else if (str.equals("on_viewpager_page_selected")) {
                m72458d();
            }
        }
    }

    /* renamed from: a */
    public final void mo63696a(String str) {
        Aweme aweme = this.f81192l;
        C52711k.m112236a((Object) aweme, "mAweme");
        Aweme aweme2 = this.f81192l;
        C52711k.m112236a((Object) aweme2, "mAweme");
        C26890h.m65011a(str, C23089d.m56640a().mo47829a("enter_from", this.f81193m).mo47829a("group_id", aweme.getAid()).mo47829a("author_id", aweme2.getAuthorUid()).f61491a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49783a(View view) {
        View view2 = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f81198r, R.layout.b79);
        C52711k.m112236a((Object) view2, "x2CItemFeed.getView(mCon…mon_feed_video_mask_view)");
        DmtTextView dmtTextView = (DmtTextView) view2.findViewById(R.id.title);
        dmtTextView.setFontType(C10751d.f28908g);
        this.f81014c = dmtTextView;
        DmtTextView dmtTextView2 = (DmtTextView) view2.findViewById(R.id.pq);
        dmtTextView2.setFontType(C10751d.f28908g);
        this.f81015d = dmtTextView2;
        this.f81016e = (DmtTextView) view2.findViewById(R.id.ze);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
        this.f81013a = view2;
        View view3 = this.f81013a;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }
}
