package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareMiniAppContent;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.br */
public class C33796br extends C33809cc {
    public C33796br(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, BaseContent baseContent, int i) {
        int i2;
        super.mo71780a(pVar, pVar2, baseContent, i);
        ShareMiniAppContent shareMiniAppContent = (ShareMiniAppContent) baseContent;
        this.f87727w.setMaxLines(1);
        this.f87727w.setText(shareMiniAppContent.getAppName());
        this.f87728x.setVisibility(0);
        this.f87728x.setMaxLines(2);
        this.f87728x.setText(shareMiniAppContent.getTitle());
        if (shareMiniAppContent.isGame()) {
            this.f87729y.setText(R.string.bkv);
        } else {
            this.f87729y.setText(R.string.bkt);
        }
        if (!TextUtils.isEmpty(shareMiniAppContent.getImageUrl())) {
            C23515d.m57677a(this.f87726v, shareMiniAppContent.getImageUrl());
        } else {
            RemoteImageView remoteImageView = this.f87726v;
            if (shareMiniAppContent.isGame()) {
                i2 = R.drawable.dc1;
            } else {
                i2 = R.drawable.dc0;
            }
            C23515d.m57668a(remoteImageView, i2);
        }
        this.f87708j.setTag(50331648, Integer.valueOf(20));
    }
}
