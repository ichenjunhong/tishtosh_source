package com.p683ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44378h;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45395an;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dw */
public final class C43301dw {
    /* renamed from: a */
    public static boolean m94963a(int i) {
        return i == 2;
    }

    /* renamed from: a */
    public static AVUploadSaveModel m94961a(AVUploadSaveModel aVUploadSaveModel, int i) {
        return m94962a(aVUploadSaveModel, i, false, null);
    }

    /* renamed from: b */
    private static AVUploadSaveModel m94964b(AVUploadSaveModel aVUploadSaveModel, int i) {
        aVUploadSaveModel.setWaterMark(!C39618d.f101151O.mo83117a(C40796a.ForbidLifeStoryLocalWatermark));
        aVUploadSaveModel.setSaveLocal(true);
        aVUploadSaveModel.setSaveType(i);
        return aVUploadSaveModel;
    }

    /* renamed from: a */
    public static AVUploadSaveModel m94962a(AVUploadSaveModel aVUploadSaveModel, int i, boolean z, C44378h hVar) {
        if (!C40797m.m90260o()) {
            return null;
        }
        if (aVUploadSaveModel == null) {
            aVUploadSaveModel = new AVUploadSaveModel();
        }
        if (TextUtils.isEmpty(aVUploadSaveModel.getLocalTempPath())) {
            aVUploadSaveModel.setLocalTempPath(C43308eb.m94997b());
        }
        if (i == 4) {
            return m94964b(aVUploadSaveModel, i);
        }
        aVUploadSaveModel.setWaterMark(!C39618d.f101151O.mo83117a(C40796a.ForbidLocalWatermark));
        C45395an.f114781a.mo91723a(z, aVUploadSaveModel, i, hVar);
        return aVUploadSaveModel;
    }
}
