package com.p683ss.android.ugc.aweme.choosemusic.viewholder;

import android.text.TextUtils;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12208t;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.d */
final /* synthetic */ class C25024d implements Runnable {

    /* renamed from: a */
    private final MusicModel f66270a;

    /* renamed from: b */
    private final SmartImageView f66271b;

    C25024d(MusicModel musicModel, SmartImageView smartImageView) {
        this.f66270a = musicModel;
        this.f66271b = smartImageView;
    }

    public final void run() {
        MusicModel musicModel = this.f66270a;
        SmartImageView smartImageView = this.f66271b;
        if (musicModel != null) {
            C12208t tVar = null;
            if (musicModel.getMusic() != null) {
                if (musicModel.getMusic().getCoverMedium() != null) {
                    tVar = C12203q.m24645a((Object) C23608p.m57874a(musicModel.getMusic().getCoverMedium()));
                } else if (musicModel.getMusic().getCoverLarge() != null) {
                    tVar = C12203q.m24645a((Object) C23608p.m57874a(musicModel.getMusic().getCoverLarge()));
                }
            }
            if (tVar == null) {
                if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
                    tVar = C12203q.m24646a(musicModel.getPicPremium());
                } else if (!TextUtils.isEmpty(musicModel.getPicBig())) {
                    tVar = C12203q.m24646a(musicModel.getPicBig());
                } else {
                    tVar = C12203q.m24642a((int) R.drawable.a35);
                }
            }
            if (smartImageView.getMeasuredHeight() > 0 && smartImageView.getMeasuredWidth() > 0) {
                tVar.mo23111a(smartImageView.getMeasuredWidth(), smartImageView.getMeasuredHeight());
            }
            tVar.mo23125b(C47788ct.m103417a(301)).mo23118a("MusicItem").mo23116a((C12197k) smartImageView).mo23121a();
        }
    }
}
