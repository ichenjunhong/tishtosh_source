package com.p683ss.android.ugc.aweme.discover.viewholder;

import android.graphics.Outline;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12208t;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.TagLayout;
import com.p683ss.android.ugc.aweme.base.p1420ui.TagLayout.C23640a;
import com.p683ss.android.ugc.aweme.base.utils.C23710a;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder.C28363f.C28364a;
import com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder.C28365g;
import com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder.C28365g.C28368a;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.adapter.C30009a;
import com.p683ss.android.ugc.aweme.feed.experiment.VideoShowTypeExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.image.C35482b;
import com.p683ss.android.ugc.aweme.image.C35482b.C35483a;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.search.model.SearchResultParamProvider.C41433a;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import leakcanary.internal.LeakCanaryFileProvider;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.discover.viewholder.SearchRecommendCellBViewHolder */
public class SearchRecommendCellBViewHolder extends C30009a implements OnClickListener, C28364a {

    /* renamed from: a */
    TextView f75727a;
    SmartCircleImageView authorAvatar;

    /* renamed from: b */
    TextView f75728b;

    /* renamed from: c */
    public boolean f75729c;

    /* renamed from: d */
    public boolean f75730d;

    /* renamed from: e */
    public String f75731e;

    /* renamed from: f */
    public final C28365g f75732f;

    /* renamed from: g */
    public boolean f75733g;
    LinearLayout mBottomDesc;
    ImageView mMixIcon;

    /* renamed from: o */
    private String f75734o;

    /* renamed from: p */
    private boolean f75735p;

    /* renamed from: q */
    private C24579d f75736q;

    /* renamed from: r */
    private int f75737r;

    /* renamed from: s */
    private int f75738s;
    TagLayout tagLayout;
    TextView txtAuthorName;
    TextView txtDesc;
    TextView txtLikeCount;

    public final View aP_() {
        return this.f70666l;
    }

    /* renamed from: c */
    public final void mo50308c() {
        mo60174k();
    }

    /* renamed from: h */
    public final int mo56779h() {
        return this.f75738s;
    }

    /* renamed from: m */
    public final boolean mo58502m() {
        return this.f75735p;
    }

    /* renamed from: n */
    public final void mo58503n() {
        m68239q();
    }

    /* renamed from: b */
    public final int[] mo50307b() {
        return C47788ct.m103417a(201);
    }

    public final void aO_() {
        mo54778b(false);
        aR_();
        this.f75732f.mo56782k();
    }

    /* renamed from: e */
    public final boolean mo54755e() {
        if (!this.f75730d) {
            return false;
        }
        return super.mo54755e();
    }

    /* renamed from: l */
    public final String mo58501l() {
        if (this.f70665k != null) {
            return ((Aweme) this.f70665k).getAid();
        }
        return "";
    }

    /* renamed from: o */
    public final void mo58504o() {
        if (this.f75729c) {
            C0013i.m16a((Callable<TResult>) new Callable<Object>() {
                public final Object call() throws Exception {
                    String str;
                    String str2;
                    C41440e a = C41433a.m91252a(SearchRecommendCellBViewHolder.this.itemView.getContext());
                    String str3 = "search_result_show_video";
                    C23089d a2 = C23089d.m56640a();
                    String str4 = "enter_from";
                    if (SearchRecommendCellBViewHolder.this.f75733g) {
                        str = "general_search";
                    } else {
                        str = "search_result";
                    }
                    C23089d a3 = a2.mo47829a(str4, str);
                    String str5 = "search_keyword";
                    if (a == null) {
                        str2 = "";
                    } else {
                        str2 = a.getCurrentSearchKeyword();
                    }
                    C26890h.m65011a(str3, a3.mo47829a(str5, str2).mo47829a("log_pb", C29981aa.m70153a().mo60161a(((Aweme) SearchRecommendCellBViewHolder.this.f70665k).getRequestId())).mo47829a("group_id", C23198ae.m56877m((Aweme) SearchRecommendCellBViewHolder.this.f70665k)).f61491a);
                    return null;
                }
            });
        }
    }

    /* renamed from: q */
    private void m68239q() {
        if (this.f70665k != null && ((Aweme) this.f70665k).getStatistics() != null) {
            this.txtLikeCount.setText(C33095b.m76068a(((Aweme) this.f70665k).getStatistics().getDiggCount()));
        }
    }

    public final void aN_() {
        boolean z;
        if (mo54780f()) {
            mo54778b(true);
            SmartImageView smartImageView = this.f70666l;
            if (smartImageView.f32279b == null || !smartImageView.f32279b.f32301b) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                aQ_();
                this.f75732f.mo56781j();
                return;
            }
            this.f75732f.f74464c = true;
        }
    }

    /* renamed from: i */
    public final boolean mo56780i() {
        if (!(this.f70666l == null || this.f70666l.getController() == null)) {
            Animatable i = this.f70666l.getController().mo25749i();
            if (i != null && i.isRunning()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    private void m68238p() {
        int i;
        if (!C26503d.m64061d((Aweme) this.f70665k)) {
            if (this.f75728b != null) {
                this.f75728b.setVisibility(8);
            }
            if (this.f75727a != null) {
                this.f75727a.setVisibility(8);
            }
            return;
        }
        AwemeRawAd awemeRawAd = ((Aweme) this.f70665k).getAwemeRawAd();
        if (this.f75728b == null) {
            ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.eyf);
            if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.bt1);
                this.f75728b = (TextView) viewStub.inflate();
            }
        }
        if (this.f75728b != null) {
            if (awemeRawAd.getLabel() == null || TextUtils.isEmpty(awemeRawAd.getLabel().getLabelName())) {
                this.f75728b.setText(R.string.dx);
            } else {
                this.f75728b.setText(awemeRawAd.getLabel().getLabelName());
            }
            TextView textView = this.f75728b;
            if (C26503d.m64064g((Aweme) this.f70665k)) {
                i = 8;
            } else {
                i = 0;
            }
            C9432q.m18691b((View) textView, i);
        }
        if (!TextUtils.isEmpty(awemeRawAd.getTopTitle())) {
            if (this.f75727a == null) {
                ViewStub viewStub2 = (ViewStub) this.itemView.findViewById(R.id.eyh);
                if (viewStub2 != null) {
                    viewStub2.setLayoutResource(R.layout.ba9);
                    this.f75727a = (TextView) viewStub2.inflate();
                    this.f75727a.setTextSize(2, 12.0f);
                    this.f75727a.setTextColor(this.f78369h.getResources().getColor(R.color.asz));
                }
            }
            if (this.f75727a != null) {
                this.f75727a.setText(awemeRawAd.getTopTitle());
                this.f75727a.setVisibility(0);
            }
        }
        if (C26503d.m64064g((Aweme) this.f70665k)) {
            C9432q.m18691b((View) this.f75727a, 8);
        }
    }

    /* renamed from: a */
    public final void mo50301a() {
        if (this.f70665k != null) {
            m68238p();
            mo60174k();
            if (TextUtils.isEmpty(((Aweme) this.f70665k).getDesc())) {
                this.txtDesc.setText("");
                if (!this.f75729c) {
                    this.txtDesc.setVisibility(8);
                }
            } else {
                if (this.mBottomDesc != null) {
                    this.mBottomDesc.setVisibility(0);
                }
                this.txtDesc.setVisibility(0);
                TextUtils.equals(this.f75734o, "search_result");
                if (((Aweme) this.f70665k).getPosition() == null || this.f75729c) {
                    this.txtDesc.setText(((Aweme) this.f70665k).getDesc());
                } else {
                    this.txtDesc.setText(C23710a.m58189a(this.f78369h, ((Aweme) this.f70665k).getDesc(), ((Aweme) this.f70665k).getPosition()));
                }
            }
            C23794bh.m58403q().mo77205a(this.f78369h, (Aweme) this.f70665k, this.txtDesc);
            User author = ((Aweme) this.f70665k).getAuthor();
            if (author != null) {
                if (!this.f75729c) {
                    this.txtAuthorName.setText(author.getNickname());
                } else if (C47915gg.m103672u(author)) {
                    this.txtAuthorName.setText(author.getUniqueId());
                } else {
                    this.txtAuthorName.setText(author.getNickname());
                }
                C12203q.m24645a((Object) C23608p.m57874a(author.getAvatarThumb())).mo23125b(C47788ct.m103417a(100)).mo23118a("AbsCellViewHolder").mo23116a((C12197k) this.authorAvatar).mo23126b();
            }
            if (!((Aweme) this.f70665k).isAwemeFromXiGua()) {
                this.txtLikeCount.setVisibility(0);
                m68239q();
            } else {
                this.txtLikeCount.setVisibility(8);
            }
            this.tagLayout.setEventType(this.f75734o);
            if (((Aweme) this.f70665k).getVideoLabels() != null) {
                this.tagLayout.mo49067a((Aweme) this.f70665k, ((Aweme) this.f70665k).getVideoLabels(), new C23640a(7, 16));
            }
            C23794bh.m58403q().mo77204a(this.f78369h, (Aweme) this.f70665k, this.mMixIcon, this.f75734o, 0);
            if (VERSION.SDK_INT >= 21 && this.f75729c && this.f75737r == 5) {
                this.itemView.setOutlineProvider(new ViewOutlineProvider() {
                    public final void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) C23728o.m58241a(2.0d));
                    }
                });
                this.itemView.setClipToOutline(true);
            }
        }
    }

    /* renamed from: d */
    public final void mo58500d(boolean z) {
        this.f75735p = true;
    }

    /* renamed from: a */
    public final void mo58497a(C28368a aVar) {
        this.f75732f.f74463b = aVar;
    }

    /* renamed from: a */
    public final void mo58496a(float f) {
        if (this.txtDesc.getAlpha() != f && !this.f75729c) {
            this.txtDesc.setAlpha(f);
            this.txtAuthorName.setAlpha(f);
            this.txtLikeCount.setAlpha(f);
            this.authorAvatar.setAlpha(f);
            this.tagLayout.setAlpha(f);
        }
    }

    public void onClick(View view) {
        String str;
        ClickInstrumentation.onClick(view);
        if (((Aweme) this.f70665k).getStatus() == null || !((Aweme) this.f70665k).getStatus().isDelete()) {
            if (this.f75736q != null) {
                this.f75736q.mo50347a(this.itemView, (Aweme) this.f70665k, this.f75734o);
            }
            if (C26503d.m64061d((Aweme) this.f70665k)) {
                AwemeRawAd awemeRawAd = ((Aweme) this.f70665k).getAwemeRawAd();
                int id = view.getId();
                if (id == R.id.a4e) {
                    str = "title";
                } else if (id == R.id.h1) {
                    str = "photo";
                } else if (id == R.id.h3) {
                    str = LeakCanaryFileProvider.f132049i;
                } else if (id == R.id.baj) {
                    str = "like";
                } else {
                    str = "image";
                }
                C25945k.m62911b().mo53138c(this.f78369h, awemeRawAd.getCreativeIdStr(), str, awemeRawAd.getLogExtra());
            }
            return;
        }
        C10691a.m21548c(this.itemView.getContext(), (int) R.string.fax).mo19066a();
    }

    /* renamed from: a */
    public final boolean mo54753a(Video video, String str) {
        if (mo54781g()) {
            if (C35482b.f91208a.mo73885a(this.f70666l, video, str, mo54755e(), this.f70659i, this.f75731e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo54752a(UrlModel urlModel, String str) {
        C12208t a = C12203q.m24645a((Object) C23608p.m57874a(urlModel));
        int[] b = mo50307b();
        if (b != null) {
            a.mo23125b(b);
        }
        a.mo23116a((C12197k) this.f70666l).mo23118a(str).mo23126b();
        if (this.f70665k != null && ((Aweme) this.f70665k).getVideo() != null) {
            ((Aweme) this.f70665k).getVideo().setCachedOuterCoverUrl(urlModel);
            ((Aweme) this.f70665k).getVideo().setCachedOuterCoverSize(b);
        }
    }

    /* renamed from: a */
    public final void mo58499a(Aweme aweme, int i, boolean z) {
        mo58498a(aweme, i, i, z);
    }

    public SearchRecommendCellBViewHolder(View view, String str, C24579d dVar) {
        this(view, str, dVar, false);
    }

    public SearchRecommendCellBViewHolder(View view, String str, C24579d dVar, boolean z) {
        super(view);
        this.f75737r = C10181b.m20511a().mo18168a(VideoShowTypeExperiment.class, true, "video_search_show_style", 31744, 0);
        this.f75738s = -1;
        this.f75730d = true;
        this.f75732f = new C28365g(this);
        this.f75729c = z;
        ButterKnife.bind((Object) this, view);
        this.f70666l = (SmartImageView) view.findViewById(R.id.a22);
        this.f70667m = true;
        this.f75734o = str;
        this.f75736q = dVar;
        view.setOnClickListener(this);
        this.f70666l.setAnimationListener(this.f70660j);
        this.f70659i = new C35483a() {
            /* renamed from: a */
            public final void mo58506a(SmartImageView smartImageView) {
                SearchRecommendCellBViewHolder.this.f75732f.mo56783l();
            }
        };
        if (this.f78369h != null && !this.f75729c) {
            Drawable drawable = this.f78369h.getResources().getDrawable(R.drawable.dff);
            drawable.setBounds(0, (int) C9432q.m18687b(this.f78369h, 0.5f), (int) C9432q.m18687b(this.f78369h, 15.0f), (int) C9432q.m18687b(this.f78369h, 15.5f));
            this.txtLikeCount.setCompoundDrawables(drawable, null, null, null);
        }
    }

    /* renamed from: a */
    public final void mo58498a(Aweme aweme, int i, int i2, boolean z) {
        super.mo54774a(aweme, i);
        if (aweme != null) {
            this.f70665k = aweme;
            this.f75735p = z;
            this.f75738s = i2;
            this.f75732f.mo56782k();
            float f = 0.75f;
            if (TextUtils.isEmpty(((Aweme) this.f70665k).getDesc()) && (!C23794bh.m58403q().mo77207a() || !((Aweme) this.f70665k).isMixAweme())) {
                switch (this.f75737r) {
                    case 4:
                        f = 0.59f;
                        break;
                    case 5:
                        f = 0.63f;
                        break;
                }
            }
            if (!this.f75729c || !(this.f75737r == 4 || this.f75737r == 5)) {
                m70342a(this.f70666l);
            } else {
                m70343a(this.f70666l, f);
            }
            if (this.f75735p) {
                mo50301a();
            }
        }
    }
}
