package com.p683ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.view.View.OnClickListener;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.p683ss.android.ugc.aweme.shortvideo.widget.RecordLayout.C45583b;
import com.p683ss.android.ugc.aweme.tools.C47351z;
import com.p683ss.android.ugc.aweme.utils.C47858ep;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.do */
public final class C43221do {
    public C43221do(FragmentActivity fragmentActivity, C45004a aVar, RecordLayout recordLayout, OnClickListener onClickListener) {
        final C45004a aVar2 = aVar;
        final FragmentActivity fragmentActivity2 = fragmentActivity;
        final OnClickListener onClickListener2 = onClickListener;
        final RecordLayout recordLayout2 = recordLayout;
        C432221 r0 = new C45583b() {
            /* renamed from: a */
            public final boolean mo87877a() {
                return false;
            }

            /* renamed from: d */
            public final void mo87880d() {
                onClickListener2.onClick(recordLayout2);
            }

            /* renamed from: c */
            public final void mo87879c() {
                C47351z zVar = new C47351z();
                aVar2.mo91335a(zVar);
                aVar2.mo91354b(zVar);
            }

            /* renamed from: e */
            public final void mo87881e() {
                recordLayout2.setCurrentScaleMode(0);
                aVar2.mo91342ab();
            }

            /* renamed from: b */
            public final void mo87878b() {
                if (C47858ep.m103515a()) {
                    C47858ep.f120420a = false;
                    C47858ep.m103507a("record_start");
                }
                aVar2.mo91358c(0);
            }

            /* renamed from: a */
            public final void mo87875a(float f) {
                recordLayout2.setHasBeenMoveScaled(true);
                aVar2.mo91351b(f, recordLayout2.getY());
            }

            /* renamed from: a */
            public final void mo87876a(int i) {
                if (!((ShortVideoContextViewModel) C0214z.m440a(fragmentActivity2).mo359a(ShortVideoContextViewModel.class)).mo86389b()) {
                    aVar2.mo91359d(i);
                }
            }
        };
        recordLayout.setRecordListener(r0);
    }
}
