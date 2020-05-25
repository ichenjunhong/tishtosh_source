package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.j */
public final class C33656j {
    /* renamed from: a */
    public static C33656j m77094a() {
        return new C33656j();
    }

    /* renamed from: a */
    public final void mo71135a(final Activity activity, final C23371a<Boolean> aVar) {
        C23361b.m57419a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C23364b() {
            /* renamed from: a */
            public final void mo40906a(String[] strArr, int[] iArr) {
                if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                    if (aVar != null) {
                        aVar.run(Boolean.valueOf(false));
                    }
                    C33656j jVar = C33656j.this;
                    new C10643a(activity).mo18899b((int) R.string.bek).mo18900b((int) R.string.bf_, (OnClickListener) new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    }).mo18886a((int) R.string.bg3, (OnClickListener) new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).mo18897a().mo18882b();
                } else if (aVar != null) {
                    aVar.run(Boolean.valueOf(true));
                }
            }
        });
    }
}
