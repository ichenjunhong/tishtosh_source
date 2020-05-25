package com.p683ss.android.ugc.aweme.base.p1420ui.anchor;

import android.app.Activity;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.feed.model.AnchorInfo;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.e */
public final class C23659e extends C23649b {

    /* renamed from: s */
    public static final C23660a f63084s = new C23660a(null);

    /* renamed from: a */
    public final Activity f63085a;

    /* renamed from: b */
    public final String f63086b;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.e$a */
    public static final class C23660a {
        private C23660a() {
        }

        public /* synthetic */ C23660a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo49074a() {
    }

    /* renamed from: b */
    public final void mo49077b() {
    }

    /* renamed from: e */
    public final int mo49083e() {
        return R.drawable.cvl;
    }

    /* renamed from: a */
    public final void mo49076a(Aweme aweme, JSONObject jSONObject) {
        String str;
        super.mo49076a(aweme, jSONObject);
        DmtTextView dmtTextView = this.f63058d;
        if (aweme != null) {
            AnchorInfo anchorInfo = aweme.getAnchorInfo();
            if (anchorInfo != null) {
                str = anchorInfo.getTitle();
                dmtTextView.setText(str);
            }
        }
        str = null;
        dmtTextView.setText(str);
    }

    public C23659e(ViewGroup viewGroup, Activity activity, String str) {
        C52711k.m112240b(viewGroup, "parent");
        super(viewGroup);
        this.f63085a = activity;
        this.f63086b = str;
    }
}
