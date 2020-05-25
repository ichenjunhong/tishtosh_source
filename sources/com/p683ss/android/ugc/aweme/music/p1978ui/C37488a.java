package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.C10174a;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.music.ui.a */
public final class C37488a extends C37518aw {

    /* renamed from: a */
    private Toast f95672a;

    /* renamed from: b */
    private ArrayList<Integer> f95673b = new ArrayList<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo77028a(MusicModel musicModel) {
    }

    /* renamed from: d */
    public final void mo50916d() {
        Downloader instance = Downloader.getInstance(this.f95717e.mo50821i());
        if (!C9376b.m18558a((Collection<T>) this.f95673b)) {
            Iterator it = this.f95673b.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (num != null) {
                    instance.cancel(num.intValue());
                }
            }
        }
        super.mo50916d();
    }

    public C37488a(C37625m mVar) {
        super(mVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo77029a(MusicModel musicModel, Context context) {
        boolean z;
        if (musicModel == null || musicModel.isPlayUrlValid()) {
            try {
                z = C32816h.m75716b().getShieldMusicSdk().booleanValue();
            } catch (C10174a unused) {
                z = false;
            }
            if ((!z || musicModel == null || musicModel.getMusicType() != MusicType.BAIDU) && (musicModel == null || musicModel.getMusicStatus() != 0)) {
                return true;
            }
            String offlineDesc = musicModel.getOfflineDesc();
            if (TextUtils.isEmpty(offlineDesc)) {
                offlineDesc = context.getString(R.string.ce6);
            }
            m83890a(context, offlineDesc, 0);
            return false;
        }
        m83890a(context, context.getString(R.string.ce9), 0);
        return false;
    }

    /* renamed from: a */
    private void m83890a(Context context, String str, int i) {
        if (this.f95672a != null) {
            this.f95672a.cancel();
        }
        this.f95672a = Toast.makeText(context, str, 0);
        if (this.f95672a != null) {
            this.f95672a.setGravity(17, 0, 0);
            C37527b.m83955a(this.f95672a);
        }
    }
}
