package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.Context;
import android.support.p030v4.view.C1028c.C1033d;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.f */
final /* synthetic */ class C45173f {

    /* renamed from: a */
    static boolean f114293a = true;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.f$a */
    static final class C45174a extends C52712l implements C52682m<View, Integer, C52860x> {

        /* renamed from: a */
        public static final C45174a f114294a = new C45174a();

        C45174a() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m98661a((View) obj, ((Number) obj2).intValue());
            return C52860x.f131107a;
        }

        /* renamed from: a */
        public static void m98661a(View view, int i) {
            if (view != null) {
                LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = i;
                    view.setLayoutParams(marginLayoutParams);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.f$b */
    static final class C45175b implements C1033d {

        /* renamed from: a */
        final /* synthetic */ Context f114295a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f114296b;

        C45175b(Context context, ViewGroup viewGroup) {
            this.f114295a = context;
            this.f114296b = viewGroup;
        }

        public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
            C52711k.m112240b(view, "view");
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.cdl);
            int c = C43303dy.m94972c(this.f114295a);
            C45174a.m98661a(view.findViewById(R.id.c6c), this.f114295a.getResources().getDimensionPixelSize(R.dimen.m0) + c);
            C45174a.m98661a(relativeLayout, this.f114295a.getResources().getDimensionPixelSize(R.dimen.lz) + c);
            C45174a.m98661a(view.findViewById(R.id.ary), c + this.f114295a.getResources().getDimensionPixelSize(R.dimen.lz));
            RecordLayout recordLayout = (RecordLayout) view.findViewById(R.id.c9_);
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.e2l);
            FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.e2j);
            ImageView imageView = (ImageView) view.findViewById(R.id.e2k);
            C52711k.m112236a((Object) recordLayout, "recordLayout");
            LayoutParams layoutParams = recordLayout.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                C52711k.m112236a((Object) frameLayout, "colorSchemeLayout");
                LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    switch (C22452a.m55492a()) {
                        case 1:
                        case 2:
                        case 4:
                        case 5:
                            layoutParams2.bottomMargin = C23728o.m58241a(33.0d) + C23728o.m58241a(40.0d);
                            layoutParams4.bottomMargin = C23728o.m58241a(33.0d) + C23728o.m58241a(40.0d);
                            break;
                        default:
                            layoutParams2.bottomMargin = C23728o.m58241a(40.0d);
                            layoutParams4.bottomMargin = C23728o.m58241a(40.0d);
                            break;
                    }
                    recordLayout.setLayoutParams(layoutParams2);
                    frameLayout.setLayoutParams(layoutParams4);
                    recordLayout.setColorSchemeBackground(frameLayout2);
                    recordLayout.setColorSchemeIcon(imageView);
                    frameLayout.bringToFront();
                    if (C45173f.f114293a) {
                        this.f114296b.addView(view);
                        return;
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }
}
