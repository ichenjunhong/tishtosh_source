package com.p683ss.android.ugc.aweme.discover.adapter;

import android.graphics.Rect;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.discover.model.HotVideoItem;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.framework.p1782c.C32462a;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.p1323ae.p1324a.C22467b;
import com.p683ss.android.ugc.aweme.p1323ae.p1325b.C22469b;
import com.p683ss.android.ugc.aweme.p1323ae.p1327d.C22474a;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1397az.C23337c;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.setting.C41632l;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.HotVideoViewHolder */
public class HotVideoViewHolder extends C1352v {

    /* renamed from: a */
    public C27757a f72871a;

    /* renamed from: b */
    public List<HotVideoItem> f72872b;

    /* renamed from: c */
    public String f72873c;

    /* renamed from: d */
    public C22467b<Aweme> f72874d;

    /* renamed from: e */
    public List<Aweme> f72875e = new ArrayList();

    /* renamed from: f */
    private LinearLayoutManager f72876f;
    View mLeftTitleView;
    RecyclerView mRecyclerView;
    View mRightArrowView;
    View mRightTitleView;
    View mYellowDotView;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.HotVideoViewHolder$a */
    public class C27757a extends C1322a<C1352v> {

        /* renamed from: a */
        public List<HotVideoItem> f72879a;

        public final int getItemCount() {
            return this.f72879a.size();
        }

        C27757a() {
        }

        public final void onViewAttachedToWindow(C1352v vVar) {
            super.onViewAttachedToWindow(vVar);
            int adapterPosition = vVar.getAdapterPosition();
            if (!C9376b.m18558a((Collection<T>) this.f72879a) && this.f72879a.get(adapterPosition) != null && ((HotVideoItem) this.f72879a.get(adapterPosition)).getAweme() != null) {
                C26890h.m65011a("hot_search_video_keyword", new C23089d().mo47829a("group_id", ((HotVideoItem) this.f72879a.get(vVar.getAdapterPosition())).getAweme().getAid()).mo47829a("author_id", ((HotVideoItem) this.f72879a.get(vVar.getAdapterPosition())).getAweme().getAuthorUid()).mo47829a("action_type", "show").mo47829a("enter_from", "discovery").mo47826a("order", vVar.getAdapterPosition() + 1).f61491a);
            }
        }

        public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new HotVideoItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b9q, viewGroup, false), HotVideoViewHolder.this.f72873c, HotVideoViewHolder.this.f72874d);
        }

        public final void onBindViewHolder(C1352v vVar, int i) {
            boolean z;
            boolean z2;
            HotVideoItemViewHolder hotVideoItemViewHolder = (HotVideoItemViewHolder) vVar;
            HotVideoItem hotVideoItem = (HotVideoItem) this.f72879a.get(i);
            if (hotVideoItem != null) {
                hotVideoItemViewHolder.f72868b = hotVideoItem.getAweme();
                if (hotVideoItemViewHolder.f72868b != null) {
                    if (C23337c.m57398a() || !C32462a.m75159a(hotVideoItemViewHolder.itemView.getContext()) || !C41632l.m91511a(hotVideoItemViewHolder.itemView.getContext())) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        Video video = hotVideoItemViewHolder.f72868b.getVideo();
                        if (video == null || video.getDynamicCover() == null || TextUtils.isEmpty(video.getDynamicCover().getUri()) || video.getDynamicCover().getUrlList() == null || video.getDynamicCover().getUrlList().isEmpty()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            hotVideoItemViewHolder.mCover.mo48930a(hotVideoItemViewHolder.f72868b.getVideo().getDynamicCover());
                            C23515d.m57672a((RemoteImageView) hotVideoItemViewHolder.mCover, hotVideoItemViewHolder.f72868b.getVideo().getDynamicCover(), hotVideoItemViewHolder.mCover.getControllerListener());
                            hotVideoItemViewHolder.mCover.setUserVisibleHint(true);
                            hotVideoItemViewHolder.mCover.setAttached(true);
                            TextView textView = hotVideoItemViewHolder.mRank;
                            int i2 = i + 1;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" T");
                            spannableStringBuilder.setSpan(new C22474a(i2, "", 4), 0, 2, 33);
                            textView.setMovementMethod(LinkMovementMethod.getInstance());
                            textView.setText(spannableStringBuilder);
                            String a = C33095b.m76068a(hotVideoItem.getHotValue());
                            hotVideoItemViewHolder.mText.setText(hotVideoItemViewHolder.itemView.getContext().getString(R.string.e1f, new Object[]{a}));
                            hotVideoItemViewHolder.itemView.setOnClickListener(new C27931v(hotVideoItemViewHolder, i, hotVideoItem));
                        }
                    }
                    C23515d.m57669a((RemoteImageView) hotVideoItemViewHolder.mCover, hotVideoItemViewHolder.f72868b.getVideo().getCover());
                    TextView textView2 = hotVideoItemViewHolder.mRank;
                    int i22 = i + 1;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(" T");
                    spannableStringBuilder2.setSpan(new C22474a(i22, "", 4), 0, 2, 33);
                    textView2.setMovementMethod(LinkMovementMethod.getInstance());
                    textView2.setText(spannableStringBuilder2);
                    String a2 = C33095b.m76068a(hotVideoItem.getHotValue());
                    hotVideoItemViewHolder.mText.setText(hotVideoItemViewHolder.itemView.getContext().getString(R.string.e1f, new Object[]{a2}));
                    hotVideoItemViewHolder.itemView.setOnClickListener(new C27931v(hotVideoItemViewHolder, i, hotVideoItem));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo56188a() {
        C23794bh.m58407u();
        this.itemView.getContext();
        if (this.mYellowDotView != null && this.mYellowDotView.isShown()) {
            SharePrefCache.inst().getIsShowRankingIndicator().mo47776a(Boolean.valueOf(false));
            mo56190b();
        }
    }

    /* renamed from: b */
    public void mo56190b() {
        C23729p.m58257a(this.mYellowDotView, 8);
        LayoutParams layoutParams = (LayoutParams) this.mRightArrowView.getLayoutParams();
        layoutParams.leftMargin = (int) C9432q.m18687b(this.itemView.getContext(), 5.0f);
        this.mRightArrowView.setLayoutParams(layoutParams);
    }

    public HotVideoViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f72872b = new ArrayList();
        this.f72876f = new WrapLinearLayoutManager(this.itemView.getContext(), 0, false);
        this.mRecyclerView.setLayoutManager(this.f72876f);
        this.mRecyclerView.mo4798a((C1331h) new C1331h() {
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
                super.getItemOffsets(rect, view, recyclerView, sVar);
                rect.right = C23728o.m58241a(6.0d);
                if (recyclerView.getLayoutManager() != null && RecyclerView.m4275f(view) == recyclerView.getLayoutManager().mo5013A() - 1) {
                    rect.right = 0;
                }
            }
        });
        this.f72871a = new C27757a();
        this.mRecyclerView.setAdapter(this.f72871a);
        this.mLeftTitleView.setOnClickListener(new C27932w(this));
        this.mRightTitleView.setOnClickListener(new C27933x(this));
        this.f72874d = new C22467b<Aweme>() {
            /* renamed from: a */
            public final /* synthetic */ void mo46755a(Object obj, int i) {
                Aweme aweme = (Aweme) obj;
                int i2 = i + 1;
                String str = "click";
                if (aweme != null) {
                    C23089d a = new C23089d().mo47829a("group_id", aweme.getAid()).mo47829a("author_id", aweme.getAuthorUid()).mo47829a("action_type", str).mo47826a("order", i2);
                    if (TextUtils.equals("click", str)) {
                        a.mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(aweme)));
                        C26890h.m65012a("hot_search_video_keyword", C23198ae.m56851a(a.f61491a));
                    } else {
                        C26890h.m65011a("hot_search_video_keyword", a.f61491a);
                    }
                }
                C22469b bVar = new C22469b();
                List<Aweme> list = HotVideoViewHolder.this.f72875e;
                if (list != null) {
                    bVar.f60524b.addAll(list);
                }
                C31213v.m72896a((C26875a) bVar);
                C41302w a2 = C41302w.m91042a();
                StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                sb.append(aweme.getAid());
                a2.mo83861a(C41311y.m91065a(sb.toString()).mo83870a("refer", "discovery_hot_search_video").mo83870a("video_from", "from_hot_search_aweme").mo83871a());
            }
        };
    }

    /* renamed from: a */
    public final void mo56189a(boolean z) {
        if (this.mRecyclerView != null && this.f72876f != null) {
            int l = this.f72876f.mo4751l();
            for (int j = this.f72876f.mo4749j(); j <= l; j++) {
                C1352v f = this.mRecyclerView.mo4847f(j);
                if (f != null) {
                    HotVideoItemViewHolder hotVideoItemViewHolder = (HotVideoItemViewHolder) f;
                    if (z) {
                        hotVideoItemViewHolder.mCover.mo48931b();
                    } else {
                        hotVideoItemViewHolder.mCover.mo48932c();
                    }
                }
            }
        }
    }
}
