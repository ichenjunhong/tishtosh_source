package com.p683ss.android.ugc.aweme.feed.adapter;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.p1420ui.TagLayout;
import com.p683ss.android.ugc.aweme.base.p1420ui.TagLayout.C23640a;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.PoiDetailViewHolder */
public class PoiDetailViewHolder extends C30009a {

    /* renamed from: a */
    String f78256a;
    SmartCircleImageView authorAvatar;

    /* renamed from: b */
    private boolean f78257b;
    TagLayout tagLayout;
    TextView txtAuthorName;
    TextView txtDesc;
    TextView txtLikeCount;

    /* renamed from: c */
    public final void mo50308c() {
        mo60174k();
    }

    /* renamed from: m */
    public final boolean mo58502m() {
        return this.f78257b;
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
            if (TextUtils.isEmpty(((Aweme) this.f70665k).getDesc())) {
                this.txtDesc.setVisibility(8);
            } else {
                this.txtDesc.setVisibility(0);
                this.txtDesc.setText(((Aweme) this.f70665k).getDesc());
            }
            User author = ((Aweme) this.f70665k).getAuthor();
            if (author != null) {
                this.txtAuthorName.setText(author.getNickname());
                C12203q.m24645a((Object) C23608p.m57874a(author.getAvatarThumb())).mo23125b(C47788ct.m103417a(100)).mo23118a("AbsCellViewHolder").mo23116a((C12197k) this.authorAvatar).mo23121a();
            }
            this.txtLikeCount.setVisibility(8);
            this.tagLayout.setEventType(this.f78256a);
            if (((Aweme) this.f70665k).getVideoLabels() != null) {
                this.tagLayout.mo49067a((Aweme) this.f70665k, ((Aweme) this.f70665k).getVideoLabels(), new C23640a(7, 16));
            }
        }
    }

    /* renamed from: k */
    public final void mo60174k() {
        if (this.f70665k != null) {
            List imageInfos = ((Aweme) this.f70665k).getImageInfos();
            if (imageInfos == null || imageInfos.isEmpty()) {
                Video video = ((Aweme) this.f70665k).getVideo();
                if (video != null) {
                    if (mo54753a(video, "AbsCellViewHolder")) {
                        this.f70667m = true;
                        return;
                    } else if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().size() == 0 || TextUtils.isEmpty((CharSequence) video.getCover().getUrlList().get(0))) {
                        this.f70666l.setImageResource(R.color.a1x);
                        return;
                    } else {
                        mo54752a(video.getCover(), "AbsCellViewHolder");
                    }
                }
                return;
            }
            ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
            if (imageInfo != null) {
                mo54752a(imageInfo.getLabelLarge(), "AbsCellViewHolder");
            }
        }
    }

    /* renamed from: d */
    public final void mo58500d(boolean z) {
        this.f78257b = true;
    }

    /* renamed from: a */
    public final void mo58496a(float f) {
        if (this.txtDesc.getAlpha() != f) {
            this.txtDesc.setAlpha(f);
            this.txtAuthorName.setAlpha(f);
            this.txtLikeCount.setAlpha(f);
            this.authorAvatar.setAlpha(f);
            this.tagLayout.setAlpha(f);
        }
    }

    /* renamed from: a */
    public final void mo60173a(Aweme aweme, int i, boolean z) {
        super.mo54774a(aweme, i);
        if (aweme != null) {
            this.f70665k = aweme;
            this.f78257b = z;
            if (this.f78257b) {
                mo50301a();
            }
        }
    }

    public PoiDetailViewHolder(View view, String str, C24579d dVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f70666l = (SmartImageView) view.findViewById(R.id.a22);
        this.f70667m = true;
        this.f78256a = str;
        view.setOnClickListener(new C30031as(this, view, dVar));
        this.f70666l.setAnimationListener(this.f70660j);
        m70342a(this.f70666l);
    }
}
