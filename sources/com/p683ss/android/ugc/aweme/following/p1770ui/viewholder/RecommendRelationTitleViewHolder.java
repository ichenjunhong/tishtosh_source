package com.p683ss.android.ugc.aweme.following.p1770ui.viewholder;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.experiment.EnablePrivacyReminderExperiment;
import com.p683ss.android.ugc.aweme.following.p1768a.C32003j;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationTitleViewHolder */
public final class RecommendRelationTitleViewHolder extends JediSimpleViewHolder<C32003j> {

    /* renamed from: f */
    public final View f84091f;

    /* renamed from: g */
    private final View f84092g;

    /* renamed from: j */
    private final TextView f84093j;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationTitleViewHolder$a */
    static final class C32273a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendRelationTitleViewHolder f84094a;

        C32273a(RecommendRelationTitleViewHolder recommendRelationTitleViewHolder) {
            this.f84094a = recommendRelationTitleViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Map hashMap = new HashMap();
            hashMap.put("enter_from", "find_friends");
            C26890h.m65011a("click_privacy_tips", hashMap);
            SharePrefCache inst = SharePrefCache.inst();
            C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
            C23051bf privacyReminderH5Url = inst.getPrivacyReminderH5Url();
            C52711k.m112236a((Object) privacyReminderH5Url, "SharePrefCache.inst().privacyReminderH5Url");
            String str = (String) privacyReminderH5Url.mo47782d();
            if (!TextUtils.isEmpty(str)) {
                Intent intent = new Intent(this.f84094a.f84091f.getContext(), CrossPlatformActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", true);
                intent.putExtra("hide_nav_bar", false);
                intent.putExtra("use_webview_title", true);
                intent.putExtras(bundle);
                intent.setData(Uri.parse(str));
                this.f84094a.f84091f.getContext().startActivity(intent);
            }
        }
    }

    public RecommendRelationTitleViewHolder(View view) {
        C52711k.m112240b(view, "view");
        super(view);
        View findViewById = this.itemView.findViewById(R.id.a6f);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.divide_line)");
        this.f84092g = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.dkz);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.txt_tips)");
        this.f84093j = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.c4y);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.privacy_reminder_image)");
        this.f84091f = findViewById3;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo22662a(Object obj) {
        C32003j jVar = (C32003j) obj;
        C52711k.m112240b(jVar, "item");
        this.f84093j.setText(jVar.f83562b);
        this.f84092g.setVisibility(8);
        if (!C10181b.m20511a().mo18172a(EnablePrivacyReminderExperiment.class, true, "enable_privacy_reminder", 31744, false) || jVar.f83561a != 4) {
            this.f84091f.setVisibility(8);
            return;
        }
        this.f84091f.setVisibility(0);
        this.f84092g.setVisibility(0);
        this.f84091f.setOnClickListener(new C32273a(this));
    }
}
