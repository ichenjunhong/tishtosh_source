package com.p683ss.android.ugc.aweme.shortvideo.util;

import com.p683ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44378h;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.an */
public final class C45395an {

    /* renamed from: a */
    public static final C45396a f114781a = new C45396a(null);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.an$a */
    public static final class C45396a {
        private C45396a() {
        }

        /* renamed from: a */
        private static boolean m98952a(int i) {
            return i != 0;
        }

        public /* synthetic */ C45396a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo91723a(boolean z, AVUploadSaveModel aVUploadSaveModel, int i, C44378h hVar) {
            boolean z2;
            if (z) {
                if (aVUploadSaveModel != null) {
                    if (m98952a(i) || (hVar != null && hVar.mo90243a())) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    aVUploadSaveModel.setSaveLocal(z2);
                }
                if (aVUploadSaveModel != null) {
                    aVUploadSaveModel.setSaveType(i);
                }
                return;
            }
            if (aVUploadSaveModel != null) {
                aVUploadSaveModel.setSaveLocal(m98952a(i));
            }
            if (aVUploadSaveModel != null) {
                aVUploadSaveModel.setSaveType(i);
            }
        }
    }
}
