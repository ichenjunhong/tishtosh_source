package com.p683ss.android.ugc.aweme.p1807im.sdk.group.view;

import android.content.Context;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.a */
public final class C34303a {

    /* renamed from: a */
    public static final C34304a f88571a = new C34304a(null);

    /* renamed from: b */
    private int f88572b = 1;

    /* renamed from: c */
    private final DmtTextView f88573c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.a$a */
    public static final class C34304a {
        private C34304a() {
        }

        public /* synthetic */ C34304a(C52707g gVar) {
            this();
        }
    }

    public C34303a(DmtTextView dmtTextView) {
        C52711k.m112240b(dmtTextView, "confirmButton");
        this.f88573c = dmtTextView;
    }

    /* renamed from: a */
    public static int m78208a(Integer num) {
        if ((num != null && num.intValue() == 7515) || ((num != null && num.intValue() == 7516) || (num != null && num.intValue() == 7517))) {
            return 2;
        }
        if (num != null && num.intValue() == 7519) {
            return 3;
        }
        if (num != null && num.intValue() == 7507) {
            return 4;
        }
        if (num != null && num.intValue() == 7520) {
            return 8;
        }
        if ((num != null && num.intValue() == 7521) || (num != null && num.intValue() == 7522)) {
            return 7;
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo72330a(int i) {
        this.f88572b = i;
        switch (this.f88572b) {
            case 0:
                DmtTextView dmtTextView = this.f88573c;
                dmtTextView.setAlpha(0.5f);
                dmtTextView.setEnabled(false);
                Context context = dmtTextView.getContext();
                C52711k.m112236a((Object) context, "context");
                dmtTextView.setText(context.getResources().getString(R.string.bi9));
                return;
            case 1:
                DmtTextView dmtTextView2 = this.f88573c;
                dmtTextView2.setAlpha(1.0f);
                dmtTextView2.setEnabled(true);
                Context context2 = dmtTextView2.getContext();
                C52711k.m112236a((Object) context2, "context");
                dmtTextView2.setText(context2.getResources().getString(R.string.bi7));
                return;
            case 2:
                DmtTextView dmtTextView3 = this.f88573c;
                dmtTextView3.setAlpha(0.5f);
                dmtTextView3.setEnabled(false);
                Context context3 = dmtTextView3.getContext();
                C52711k.m112236a((Object) context3, "context");
                dmtTextView3.setText(context3.getResources().getString(R.string.bi8));
                return;
            case 3:
                DmtTextView dmtTextView4 = this.f88573c;
                dmtTextView4.setAlpha(0.5f);
                dmtTextView4.setEnabled(false);
                Context context4 = dmtTextView4.getContext();
                C52711k.m112236a((Object) context4, "context");
                dmtTextView4.setText(context4.getResources().getString(R.string.bi6));
                return;
            case 4:
                DmtTextView dmtTextView5 = this.f88573c;
                dmtTextView5.setAlpha(0.5f);
                dmtTextView5.setEnabled(false);
                Context context5 = dmtTextView5.getContext();
                C52711k.m112236a((Object) context5, "context");
                dmtTextView5.setText(context5.getResources().getString(R.string.bi5));
                return;
            case 5:
                DmtTextView dmtTextView6 = this.f88573c;
                dmtTextView6.setAlpha(0.5f);
                dmtTextView6.setEnabled(false);
                Context context6 = dmtTextView6.getContext();
                C52711k.m112236a((Object) context6, "context");
                dmtTextView6.setText(context6.getResources().getString(R.string.bia));
                return;
            case 6:
                DmtTextView dmtTextView7 = this.f88573c;
                dmtTextView7.setAlpha(1.0f);
                dmtTextView7.setEnabled(true);
                Context context7 = dmtTextView7.getContext();
                C52711k.m112236a((Object) context7, "context");
                dmtTextView7.setText(context7.getResources().getString(R.string.bi_));
                break;
            case 7:
            case 8:
                DmtTextView dmtTextView8 = this.f88573c;
                dmtTextView8.setAlpha(0.5f);
                dmtTextView8.setEnabled(false);
                Context context8 = dmtTextView8.getContext();
                C52711k.m112236a((Object) context8, "context");
                dmtTextView8.setText(context8.getResources().getString(R.string.blt));
                return;
        }
    }
}
