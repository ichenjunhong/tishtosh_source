package com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1856e;

import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.viewmodel.MediaChooseViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1851c.C34413b;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.e.b */
public final class C34475b extends C34477c {

    /* renamed from: b */
    public static final C34476a f88914b = new C34476a(null);

    /* renamed from: l */
    private DmtTextView f88915l;

    /* renamed from: m */
    private final boolean f88916m = true;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.e.b$a */
    public static final class C34476a {
        private C34476a() {
        }

        public /* synthetic */ C34476a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo70628b() {
        super.mo70628b();
        Object a = mo70624a((int) R.id.d9m);
        C52711k.m112236a(a, "findViewById(R.id.tv_duration)");
        this.f88915l = (DmtTextView) a;
    }

    /* renamed from: a */
    private static String m78405a(long j) {
        if (j > 9) {
            return String.valueOf(j);
        }
        StringBuilder sb = new StringBuilder("0");
        sb.append(j);
        return sb.toString();
    }

    public C34475b(View view, MediaChooseViewModel mediaChooseViewModel) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(mediaChooseViewModel, "viewModel");
        super(view, mediaChooseViewModel);
    }

    /* renamed from: a */
    public final void mo72500a(C34409a aVar, int i, int i2) {
        C52711k.m112240b(aVar, "data");
        if (aVar.isVideo()) {
            super.mo72500a(aVar, i, i2);
            C34413b.f88804a.mo72446a(mo72501e(), aVar, i, i2, this.f88916m);
            if (aVar.getDuration() >= 0) {
                long duration = aVar.getDuration() / 1000;
                long j = duration / 3600;
                long j2 = duration - (3600 * j);
                long j3 = j2 / 60;
                long j4 = j2 - (60 * j3);
                if (j4 <= 0) {
                    j4 = 1;
                }
                String str = "";
                if (j > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(m78405a(j));
                    sb.append(':');
                    str = sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(m78405a(j3));
                sb2.append(':');
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb3);
                sb4.append(m78405a(j4));
                String sb5 = sb4.toString();
                DmtTextView dmtTextView = this.f88915l;
                if (dmtTextView == null) {
                    C52711k.m112237a("tvDuration");
                }
                dmtTextView.setText(sb5);
            }
        }
    }
}
