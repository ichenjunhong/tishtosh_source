package com.p683ss.android.ugc.aweme.feed.adapter;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12200n;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.p769c.C12168c;
import com.bytedance.lighten.p766a.p769c.C12175j;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.TagLayout;
import com.p683ss.android.ugc.aweme.base.p1420ui.TagLayout.C23640a;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.p1397az.C23337c;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.TimeLineViewHolder */
public class TimeLineViewHolder extends C30009a {

    /* renamed from: a */
    public String f78262a;

    /* renamed from: b */
    private boolean f78263b;
    SmartAvatarImageView mAvHeadView;
    TextView mDescribeView;
    TextView mTvLocation;
    TextView mTvName;
    TagLayout tagLayout;
    TextView txtDistance;

    /* renamed from: c */
    public final void mo50308c() {
    }

    /* renamed from: m */
    public final boolean mo58502m() {
        return this.f78263b;
    }

    /* renamed from: n */
    public final void mo58503n() {
    }

    /* renamed from: l */
    public final String mo58501l() {
        if (this.f70665k != null) {
            return ((Aweme) this.f70665k).getAid();
        }
        return "";
    }

    /* renamed from: a */
    public final void mo50301a() {
        List list;
        if (this.f70665k != null) {
            Video video = ((Aweme) this.f70665k).getVideo();
            if (video != null) {
                if (!m70186a(video)) {
                    C12203q.m24645a((Object) C23608p.m57874a(video.getDynamicCover())).mo23118a("TimeLineViewHolder").mo23124b(true).mo23116a((C12197k) this.f70666l).mo23122a((C12175j) new C12168c() {
                        /* renamed from: a */
                        public final void mo23095a(Uri uri, View view, Throwable th) {
                        }

                        /* renamed from: a */
                        public final void mo23094a(Uri uri, View view, C12200n nVar, Animatable animatable) {
                            TimeLineViewHolder.this.f70666l.setUserVisibleHint(true);
                            TimeLineViewHolder.this.f70666l.mo23137b();
                        }
                    });
                } else {
                    C12203q.m24645a((Object) C23608p.m57874a(video.getOriginCover())).mo23118a("TimeLineViewHolder").mo23111a(this.f70666l.getWidth(), this.f70666l.getHeight()).mo23116a((C12197k) this.f70666l).mo23121a();
                }
            }
            if (!TextUtils.isEmpty(((Aweme) this.f70665k).getDesc())) {
                this.mDescribeView.setVisibility(0);
                this.mDescribeView.setText(((Aweme) this.f70665k).getDesc());
            } else {
                this.mDescribeView.setVisibility(8);
            }
            if (((Aweme) this.f70665k).getAuthor() != null) {
                C12203q.m24645a((Object) C23608p.m57874a(((Aweme) this.f70665k).getAuthor().getAvatarThumb())).mo23125b(C47788ct.m103417a(100)).mo23124b(true).mo23118a("TimeLineViewHolder").mo23116a((C12197k) this.mAvHeadView).mo23121a();
            }
            this.tagLayout.setEventType(this.f78262a);
            if (((Aweme) this.f70665k).getVideoLabels() != null) {
                TagLayout tagLayout2 = this.tagLayout;
                Aweme aweme = (Aweme) this.f70665k;
                if (((Aweme) this.f70665k).getVideoLabels().size() > 0) {
                    list = ((Aweme) this.f70665k).getVideoLabels().subList(0, 1);
                } else {
                    list = ((Aweme) this.f70665k).getVideoLabels();
                }
                tagLayout2.mo49068b(aweme, list, new C23640a(7, 16));
            }
            PoiStruct poiStruct = ((Aweme) this.f70665k).getPoiStruct();
            if (poiStruct == null) {
                this.mTvName.setVisibility(0);
                if (((Aweme) this.f70665k).getAuthor() != null) {
                    this.mTvName.setText(((Aweme) this.f70665k).getAuthor().getNickname());
                }
                if (TextUtils.isEmpty(((Aweme) this.f70665k).getDistance())) {
                    this.txtDistance.setVisibility(8);
                } else {
                    this.txtDistance.setVisibility(0);
                    this.txtDistance.setText(((Aweme) this.f70665k).getDistance());
                }
                this.mTvLocation.setVisibility(8);
                return;
            }
            this.mTvName.setVisibility(8);
            this.txtDistance.setVisibility(8);
            this.mTvLocation.setVisibility(0);
            this.mTvLocation.setText(poiStruct.poiName);
        }
    }

    /* renamed from: d */
    public final void mo58500d(boolean z) {
        this.f78263b = true;
    }

    /* renamed from: a */
    private static boolean m70186a(Video video) {
        if (!C23337c.m57398a() && video != null && video.getDynamicCover() != null && !TextUtils.isEmpty(video.getDynamicCover().getUri()) && video.getDynamicCover().getUrlList() != null && !video.getDynamicCover().getUrlList().isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo58496a(float f) {
        if (this.mDescribeView.getAlpha() != f) {
            float max = Math.max(0.0f, Math.min(f, 1.0f));
            this.mDescribeView.setAlpha(max);
            this.mAvHeadView.setAlpha(max);
            this.mTvLocation.setAlpha(max);
            this.mTvName.setAlpha(max);
            this.txtDistance.setAlpha(max);
            this.tagLayout.setAlpha(max);
        }
    }

    /* renamed from: a */
    public final void mo60176a(Aweme aweme, int i, boolean z) {
        super.mo54774a(aweme, i);
        if (aweme != null) {
            this.f70665k = aweme;
            this.f78263b = z;
            if (this.f78263b) {
                mo50301a();
            }
        }
    }

    public TimeLineViewHolder(final View view, String str, final C24579d dVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f70666l = (SmartImageView) view.findViewById(R.id.a22);
        this.f70667m = true;
        this.f78262a = str;
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (((Aweme) TimeLineViewHolder.this.f70665k).getStatus() == null || !((Aweme) TimeLineViewHolder.this.f70665k).getStatus().isDelete()) {
                    if (dVar != null) {
                        dVar.mo50347a(view, (Aweme) TimeLineViewHolder.this.f70665k, TimeLineViewHolder.this.f78262a);
                    }
                    return;
                }
                C10691a.m21548c(view.getContext(), (int) R.string.fax).mo19066a();
            }
        });
        this.f70666l.setAnimationListener(this.f70660j);
        m70342a(this.f70666l);
    }
}
