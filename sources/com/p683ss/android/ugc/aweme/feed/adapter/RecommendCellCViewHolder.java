package com.p683ss.android.ugc.aweme.feed.adapter;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9432q;
import com.bytedance.lighten.loader.SmartImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.BorderLayout;
import com.p683ss.android.ugc.aweme.base.p1420ui.TagLayout;
import com.p683ss.android.ugc.aweme.base.p1420ui.TagLayout.C23640a;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.story.C46635b;
import com.p683ss.android.ugc.aweme.story.live.C46641d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.RecommendCellCViewHolder */
public class RecommendCellCViewHolder extends C30009a {

    /* renamed from: a */
    String f78259a;

    /* renamed from: b */
    private boolean f78260b;
    BorderLayout borderLayout;
    TagLayout tagLayout;
    TextView txtCommentCount;
    TextView txtDesc;
    TextView txtLikeCount;

    /* renamed from: c */
    public final void mo50308c() {
        mo60174k();
    }

    /* renamed from: m */
    public final boolean mo58502m() {
        return this.f78260b;
    }

    /* renamed from: n */
    public final void mo58503n() {
        m70177o();
    }

    /* renamed from: l */
    public final String mo58501l() {
        if (this.f70665k != null) {
            return ((Aweme) this.f70665k).getAid();
        }
        return "";
    }

    /* renamed from: o */
    private void m70177o() {
        if (this.f70665k != null && ((Aweme) this.f70665k).getStatistics() != null) {
            this.txtCommentCount.setText(C33095b.m76068a(((Aweme) this.f70665k).getStatistics().getCommentCount()));
            this.txtLikeCount.setText(C33095b.m76068a(((Aweme) this.f70665k).getStatistics().getDiggCount()));
        }
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
            if (!author.isLive() || !C46635b.m101190a()) {
                this.borderLayout.setVisibility(8);
            } else {
                this.borderLayout.setVisibility(0);
                int color = this.borderLayout.getResources().getColor(R.color.a3c);
                this.borderLayout.mo48980a(color, color);
                this.borderLayout.setSelected(true);
                C46641d.m101219b(this.f78369h, 0, author.getRequestId(), author.getUid(), author.roomId);
            }
            m70177o();
            this.tagLayout.setEventType(this.f78259a);
            if (((Aweme) this.f70665k).getVideoLabels() != null) {
                this.tagLayout.mo49067a((Aweme) this.f70665k, ((Aweme) this.f70665k).getVideoLabels(), new C23640a(7, 16));
            }
        }
    }

    /* renamed from: d */
    public final void mo58500d(boolean z) {
        this.f78260b = true;
    }

    /* renamed from: a */
    public final void mo58496a(float f) {
        if (this.txtDesc.getAlpha() != f) {
            this.txtDesc.setAlpha(f);
            this.txtLikeCount.setAlpha(f);
            this.txtCommentCount.setAlpha(f);
            this.tagLayout.setAlpha(f);
        }
    }

    /* renamed from: a */
    public final void mo60175a(Aweme aweme, int i, boolean z) {
        super.mo54774a(aweme, i);
        if (aweme != null) {
            this.f70665k = aweme;
            this.f78260b = z;
            if (this.f78260b) {
                mo50301a();
            }
        }
    }

    public RecommendCellCViewHolder(View view, String str, C24579d dVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f70666l = (SmartImageView) view.findViewById(R.id.a22);
        this.f70667m = true;
        this.f78259a = str;
        view.setOnClickListener(new C30034av(this, view, dVar));
        this.f70666l.setAnimationListener(this.f70660j);
        m70342a(this.f70666l);
        if (this.f78369h != null) {
            Drawable drawable = this.f78369h.getResources().getDrawable(R.drawable.dff);
            drawable.setBounds(0, (int) C9432q.m18687b(this.f78369h, 0.5f), (int) C9432q.m18687b(this.f78369h, 15.0f), (int) C9432q.m18687b(this.f78369h, 15.5f));
            this.txtLikeCount.setCompoundDrawables(drawable, null, null, null);
        }
    }
}
