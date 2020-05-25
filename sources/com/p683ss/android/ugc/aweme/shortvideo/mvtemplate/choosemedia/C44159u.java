package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.p1361ap.p1362a.C22795c.C22796a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.u */
final /* synthetic */ class C44159u implements C22796a {

    /* renamed from: a */
    private final C44155r f111864a;

    C44159u(C44155r rVar) {
        this.f111864a = rVar;
    }

    /* renamed from: a */
    public final void mo47278a(int i) {
        C44155r rVar = this.f111864a;
        List<MediaModel> b = rVar.f111848b.mo47272b(i);
        ArrayList arrayList = new ArrayList();
        for (MediaModel mediaModel : b) {
            if (!(mediaModel == null || mediaModel.f95383b == null || TextUtils.isEmpty(mediaModel.f95383b))) {
                String[] split = mediaModel.f95383b.split("\\.");
                if (split.length <= 0 || !split[split.length - 1].equals("gif")) {
                    arrayList.add(MyMediaModel.m96697a(mediaModel));
                }
            }
        }
        if (i == 4) {
            rVar.f111852j = false;
        } else {
            rVar.f111851e = false;
        }
        rVar.f111847a.mo90001a(arrayList, i, true, false);
    }
}
