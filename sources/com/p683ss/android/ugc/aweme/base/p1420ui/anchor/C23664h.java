package com.p683ss.android.ugc.aweme.base.p1420ui.anchor;

import android.app.Activity;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Anchor;
import com.p683ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.h */
public final class C23664h extends C23649b {

    /* renamed from: a */
    public final Activity f63093a;

    /* renamed from: b */
    public final String f63094b;

    /* renamed from: s */
    private String f63095s;

    /* renamed from: a */
    public final void mo49074a() {
        boolean z;
        String str;
        CharSequence charSequence = this.f63095s;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (z) {
            C36811b bVar = C36811b.f94082a;
            Aweme aweme = this.f63071q;
            if (aweme != null) {
                Anchor anchor = aweme.getAnchor();
                if (anchor != null) {
                    AnchorCommonStruct anchorInfo = anchor.getAnchorInfo();
                    if (anchorInfo != null) {
                        str = anchorInfo.getUrl();
                        this.f63095s = bVar.mo75997b(str);
                    }
                }
            }
            str = null;
            this.f63095s = bVar.mo75997b(str);
        }
        String str3 = "mp_show";
        C23089d a = C23089d.m56640a().mo47829a("mp_id", this.f63095s).mo47829a("enter_from", "homepage_hot").mo47829a("position", "in_video_tag").mo47829a("_param_for_special", "game_station").mo47829a("params_for_special", "game_platform").mo47829a("target_app_id", "2210");
        String str4 = "group_id";
        Aweme aweme2 = this.f63071q;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        }
        C26890h.m65011a(str3, a.mo47829a(str4, str2).f61491a);
    }

    /* renamed from: b */
    public final void mo49077b() {
        boolean z;
        String str;
        CharSequence charSequence = this.f63095s;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (z) {
            C36811b bVar = C36811b.f94082a;
            Aweme aweme = this.f63071q;
            if (aweme != null) {
                Anchor anchor = aweme.getAnchor();
                if (anchor != null) {
                    AnchorCommonStruct anchorInfo = anchor.getAnchorInfo();
                    if (anchorInfo != null) {
                        str = anchorInfo.getUrl();
                        this.f63095s = bVar.mo75997b(str);
                    }
                }
            }
            str = null;
            this.f63095s = bVar.mo75997b(str);
        }
        String str3 = "mp_click";
        C23089d a = C23089d.m56640a().mo47829a("mp_id", this.f63095s).mo47829a("enter_from", "homepage_hot").mo47829a("position", "in_video_tag").mo47829a("_param_for_special", "game_station").mo47829a("params_for_special", "game_platform").mo47829a("target_app_id", "2210");
        String str4 = "group_id";
        Aweme aweme2 = this.f63071q;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        }
        C26890h.m65011a(str3, a.mo47829a(str4, str2).f61491a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49075a(android.view.View r1) {
        /*
            r0 = this;
            super.mo49075a(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f63071q
            if (r1 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.feed.model.Anchor r1 = r1.getAnchor()
            if (r1 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r1 = r1.getAnchorInfo()
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = r1.getUrl()
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            if (r1 == 0) goto L_0x001e
            com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b.m82843a(r1)
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23664h.mo49075a(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo49076a(Aweme aweme, JSONObject jSONObject) {
        String str;
        super.mo49076a(aweme, jSONObject);
        this.f63057c.setImageResource(R.drawable.d08);
        DmtTextView dmtTextView = this.f63058d;
        if (aweme != null) {
            Anchor anchor = aweme.getAnchor();
            if (anchor != null) {
                AnchorCommonStruct anchorInfo = anchor.getAnchorInfo();
                if (anchorInfo != null) {
                    str = anchorInfo.getKeyword();
                    dmtTextView.setText(str);
                }
            }
        }
        str = null;
        dmtTextView.setText(str);
    }

    public C23664h(ViewGroup viewGroup, Activity activity, String str) {
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(str, "eventType");
        super(viewGroup);
        this.f63093a = activity;
        this.f63094b = str;
    }
}
