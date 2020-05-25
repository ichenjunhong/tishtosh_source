package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a.C31059b;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a.C31060c;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a.C31062d;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a.C31067h;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a.C31068i;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23243m;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.b */
public final class C31094b extends LinearLayout {

    /* renamed from: a */
    public TextView f81376a = ((TextView) findViewById(R.id.c9l));

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.b$a */
    public static final class C31095a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31068i f81377a;

        /* renamed from: b */
        final /* synthetic */ C31096c f81378b;

        public C31095a(C31068i iVar, C31096c cVar) {
            this.f81377a = iVar;
            this.f81378b = cVar;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            if (this.f81377a instanceof C31059b) {
                C31059b bVar = (C31059b) this.f81377a;
                if (bVar != null) {
                    C52711k.m112236a((Object) view, "it");
                    C31096c cVar = this.f81378b;
                    C52711k.m112240b(view, "v");
                    C52711k.m112240b(cVar, "dislikeReasonVO");
                    String str2 = "block_videos";
                    C23089d a = new C23089d().mo47829a("enter_from", bVar.f81315a.f81299c);
                    String str3 = "group_id";
                    Aweme aweme = bVar.f81315a.f81298b;
                    String str4 = null;
                    if (aweme != null) {
                        str = aweme.getAid();
                    } else {
                        str = null;
                    }
                    C23089d a2 = a.mo47829a(str3, str);
                    String str5 = "author_id";
                    Aweme aweme2 = bVar.f81315a.f81298b;
                    if (aweme2 != null) {
                        str4 = aweme2.getAuthorUid();
                    }
                    C26890h.m65011a(str2, a2.mo47829a(str5, str4).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(bVar.f81315a.f81298b))).mo47829a("reason_id", cVar.f81379a).mo47829a("reason_text", cVar.f81380b).mo47829a("music_id", C23198ae.m56873k(bVar.f81315a.f81298b)).mo47829a("enter_method", "long_press").mo47829a("click_method", "button").f61491a);
                    new C23243m().mo48110a(bVar.f81315a.f81299c).mo48111b(C23198ae.m56877m(bVar.f81315a.f81298b)).mo48112c(C23198ae.m56846a(bVar.f81315a.f81298b)).mo48113d("long_press").mo48114e(C23198ae.m56857c(bVar.f81315a.f81298b)).mo48076e();
                    C31062d dVar = new C31062d();
                    dVar.mo54799a(new C31060c());
                    dVar.mo54800a(bVar);
                    dVar.mo44934a_(bVar.f81315a.f81298b, cVar.f81379a);
                    bVar.f81315a.mo63837c();
                }
            } else if (this.f81377a instanceof C31067h) {
                C31068i iVar = this.f81377a;
                if (iVar != null) {
                    C52711k.m112236a((Object) view, "it");
                    iVar.mo63839b(view);
                }
            }
        }
    }

    public C31094b(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.b63, this);
        int b = (int) C9432q.m18687b(getContext(), 16.0f);
        setPadding(b, 0, b, 0);
        setOrientation(1);
        setBackgroundResource(R.drawable.n3);
        TextView textView = this.f81376a;
        if (textView != null) {
            TextPaint paint = textView.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
        }
    }
}
