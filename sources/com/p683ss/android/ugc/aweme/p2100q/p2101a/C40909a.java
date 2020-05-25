package com.p683ss.android.ugc.aweme.p2100q.p2101a;

import android.graphics.Outline;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.feed.adapter.C30009a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.q.a.a */
public final class C40909a extends C30009a {

    /* renamed from: a */
    String f104110a;

    /* renamed from: b */
    private SmartAvatarImageView f104111b;

    /* renamed from: c */
    private TextView f104112c;

    /* renamed from: d */
    private TextView f104113d;

    /* renamed from: e */
    private TextView f104114e;

    /* renamed from: f */
    private boolean f104115f;

    /* renamed from: g */
    private float f104116g;

    /* renamed from: a */
    public final void mo58496a(float f) {
    }

    /* renamed from: c */
    public final void mo50308c() {
        mo60174k();
    }

    /* renamed from: m */
    public final boolean mo58502m() {
        return this.f104115f;
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
        if (this.f70665k != null) {
            mo60174k();
            if (!TextUtils.isEmpty(((Aweme) this.f70665k).getDesc())) {
                this.f104112c.setVisibility(0);
                this.f104112c.setText(((Aweme) this.f70665k).getDesc());
            } else {
                this.f104112c.setVisibility(8);
            }
            if (((Aweme) this.f70665k).getAuthor() != null) {
                C12203q.m24645a((Object) C23608p.m57874a(((Aweme) this.f70665k).getAuthor().getAvatarThumb())).mo23125b(C47788ct.m103417a(100)).mo23124b(true).mo23118a("ContentRoamingViewHolder").mo23116a((C12197k) this.f104111b).mo23121a();
            }
            this.f104113d.setVisibility(0);
            if (((Aweme) this.f70665k).getAuthor() != null) {
                this.f104113d.setText(((Aweme) this.f70665k).getAuthor().getNickname());
            }
            this.f104114e.setText(String.valueOf(C33095b.m76068a(((Aweme) this.f70665k).getStatistics().getDiggCount())));
        }
    }

    /* renamed from: k */
    public final void mo60174k() {
        if (this.f70665k != null) {
            float f = 1.0f;
            if (((Aweme) this.f70665k).isImage()) {
                List imageInfos = ((Aweme) this.f70665k).getImageInfos();
                if (imageInfos != null && !imageInfos.isEmpty()) {
                    ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
                    if (imageInfo != null) {
                        if (imageInfo.getWidth() != 0) {
                            f = ((float) imageInfo.getHeight()) / ((float) imageInfo.getWidth());
                        }
                        LayoutParams layoutParams = (LayoutParams) this.f70666l.getLayoutParams();
                        layoutParams.height = (int) (this.f104116g * f);
                        this.f70666l.setLayoutParams(layoutParams);
                        mo54752a(imageInfo.getLabelLarge(), "ContentRoamingViewHolder");
                    }
                }
                return;
            }
            Video video = ((Aweme) this.f70665k).getVideo();
            if (video != null) {
                if (((Aweme) this.f70665k).getVideo().getWidth() != 0) {
                    f = ((float) ((Aweme) this.f70665k).getVideo().getHeight()) / ((float) ((Aweme) this.f70665k).getVideo().getWidth());
                }
                LayoutParams layoutParams2 = (LayoutParams) this.f70666l.getLayoutParams();
                layoutParams2.height = (int) (this.f104116g * f);
                this.f70666l.setLayoutParams(layoutParams2);
                if (mo54753a(video, "ContentRoamingViewHolder")) {
                    this.f70667m = true;
                } else if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().size() == 0 || TextUtils.isEmpty((CharSequence) video.getCover().getUrlList().get(0))) {
                    this.f70666l.setImageResource(R.color.a1x);
                } else {
                    mo54752a(video.getCover(), "ContentRoamingViewHolder");
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo58500d(boolean z) {
        this.f104115f = true;
    }

    /* renamed from: a */
    public final void mo83393a(Aweme aweme, int i, boolean z) {
        super.mo54774a(aweme, i);
        if (aweme != null) {
            this.f70665k = aweme;
            this.f104115f = z;
            if (this.f104115f) {
                mo50301a();
            }
        }
    }

    public C40909a(View view, String str, C24579d dVar) {
        super(view);
        this.f70666l = (SmartImageView) view.findViewById(R.id.a22);
        this.f104112c = (TextView) view.findViewById(R.id.a4e);
        this.f104111b = (SmartAvatarImageView) view.findViewById(R.id.hi);
        this.f104113d = (TextView) view.findViewById(R.id.aw5);
        this.f104114e = (TextView) view.findViewById(R.id.a0y);
        this.f70667m = true;
        this.f104110a = str;
        view.setOnClickListener(new C40911b(this, view, dVar));
        this.f104111b.setOnClickListener(new C40912c(this));
        this.f104113d.setOnClickListener(new C40913d(this));
        this.f70666l.setAnimationListener(this.f70660j);
        this.f104116g = (((float) C23724k.m58224b(this.f78369h)) - C9432q.m18687b(this.f78369h, 15.0f)) / 2.0f;
        if (VERSION.SDK_INT >= 21) {
            this.f70666l.setOutlineProvider(new ViewOutlineProvider() {
                public final void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C9432q.m18687b(C40909a.this.f78369h, 6.0f));
                }
            });
            this.f70666l.setClipToOutline(true);
        }
    }
}
