package com.p683ss.android.ugc.aweme.profile.adapter;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.common.p1589a.C26833a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.n */
public final class C39753n extends C26833a {

    /* renamed from: a */
    Context f101484a;

    /* renamed from: b */
    public String f101485b;

    /* renamed from: c */
    View f101486c;

    /* renamed from: d */
    View f101487d;

    /* renamed from: e */
    ImageView f101488e;

    /* renamed from: f */
    TextView f101489f;

    /* renamed from: g */
    DmtTextView f101490g;

    /* renamed from: h */
    ViewGroup f101491h;

    /* renamed from: o */
    View f101492o;

    /* renamed from: c */
    public final void mo50308c() {
        mo50301a();
    }

    /* renamed from: b */
    public final int[] mo50307b() {
        return C47788ct.m103417a(200);
    }

    /* renamed from: a */
    public final void mo50301a() {
        if (this.f70665k != null) {
            List imageInfos = ((Aweme) this.f70665k).getImageInfos();
            if (imageInfos != null && !imageInfos.isEmpty()) {
                ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
                if (imageInfo != null) {
                    C12203q.m24645a((Object) C23608p.m57874a(imageInfo.getLabelThumb())).mo23125b(mo50307b()).mo23116a((C12197k) this.f70666l).mo23111a(this.f70666l.getWidth(), this.f70666l.getHeight()).mo23118a("ImageViewHolder").mo23121a();
                }
            }
        }
    }

    public C39753n(View view, String str, final C24579d dVar) {
        super(view);
        this.f101484a = view.getContext();
        this.f101485b = str;
        this.f101486c = view.findViewById(R.id.yw);
        this.f101487d = view.findViewById(R.id.eqi);
        this.f70666l = (SmartImageView) view.findViewById(R.id.a22);
        this.f101489f = (TextView) view.findViewById(R.id.ddq);
        this.f101488e = (ImageView) view.findViewById(R.id.dpi);
        this.f101490g = (DmtTextView) view.findViewById(R.id.dhp);
        this.f101491h = (ViewGroup) view.findViewById(R.id.ebu);
        this.f70666l.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!(C39753n.this.f70665k == null || dVar == null)) {
                    dVar.mo50347a(view, (Aweme) C39753n.this.f70665k, C39753n.this.f101485b);
                }
            }
        });
        this.f70666l.setAnimationListener(this.f70660j);
        this.f101492o = view.findViewById(R.id.ehs);
    }
}
