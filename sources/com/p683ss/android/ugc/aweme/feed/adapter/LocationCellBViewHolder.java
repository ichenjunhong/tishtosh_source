package com.p683ss.android.ugc.aweme.feed.adapter;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.TagLayout;
import com.p683ss.android.ugc.aweme.base.p1420ui.TagLayout.C23640a;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.LocationCellBViewHolder */
public class LocationCellBViewHolder extends C30009a {

    /* renamed from: a */
    String f78253a;

    /* renamed from: b */
    private boolean f78254b;
    SmartAvatarImageView mAvHeadView;
    TextView mTvLocation;
    TextView mTvName;
    TagLayout tagLayout;
    TextView txtDistance;

    /* renamed from: c */
    public final void mo50308c() {
        mo60174k();
    }

    /* renamed from: m */
    public final boolean mo58502m() {
        return this.f78254b;
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
            C12203q.m24645a((Object) C23608p.m57874a(((Aweme) this.f70665k).getAuthor().getAvatarThumb())).mo23125b(C47788ct.m103417a(100)).mo23124b(true).mo23118a("AbsCellViewHolder").mo23116a((C12197k) this.mAvHeadView).mo23121a();
            this.tagLayout.setEventType(this.f78253a);
            if (((Aweme) this.f70665k).getVideoLabels() != null) {
                this.tagLayout.mo49067a((Aweme) this.f70665k, ((Aweme) this.f70665k).getVideoLabels(), new C23640a(7, 16));
            }
            this.mTvName.setVisibility(0);
            this.mTvName.setText(((Aweme) this.f70665k).getAuthor().getNickname());
            PoiStruct poiStruct = ((Aweme) this.f70665k).getPoiStruct();
            if (poiStruct == null) {
                if (TextUtils.isEmpty(((Aweme) this.f70665k).getDistance())) {
                    this.txtDistance.setVisibility(8);
                } else {
                    this.txtDistance.setVisibility(0);
                    this.txtDistance.setText(((Aweme) this.f70665k).getDistance());
                }
                this.mTvLocation.setVisibility(8);
                return;
            }
            this.txtDistance.setVisibility(8);
            this.mTvLocation.setVisibility(0);
            this.mTvLocation.setText(poiStruct.poiName);
        }
    }

    /* renamed from: d */
    public final void mo58500d(boolean z) {
        this.f78254b = true;
    }

    /* renamed from: a */
    public final void mo58496a(float f) {
        if (this.mTvName.getAlpha() != f) {
            float max = Math.max(0.0f, Math.min(f, 1.0f));
            this.mAvHeadView.setAlpha(max);
            this.mTvLocation.setAlpha(max);
            this.mTvName.setAlpha(max);
            this.txtDistance.setAlpha(max);
            this.tagLayout.setAlpha(max);
        }
    }

    /* renamed from: a */
    public final void mo60172a(Aweme aweme, int i, boolean z) {
        super.mo54774a(aweme, i);
        if (aweme != null) {
            this.f70665k = aweme;
            this.f78254b = z;
            if (this.f78254b) {
                mo50301a();
            }
        }
    }

    public LocationCellBViewHolder(View view, String str, C24579d dVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f70666l = (SmartImageView) view.findViewById(R.id.a22);
        this.f70667m = true;
        this.f78253a = str;
        view.setOnClickListener(new C30027ao(this, view, dVar));
        this.f70666l.setAnimationListener(this.f70660j);
        m70342a(this.f70666l);
    }
}
