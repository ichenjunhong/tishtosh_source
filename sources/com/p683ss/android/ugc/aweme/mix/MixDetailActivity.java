package com.p683ss.android.ugc.aweme.mix;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31216x;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.mix.MixDetailActivity */
public final class MixDetailActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C36988a f94482a = new C36988a(null);

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailActivity$a */
    public static final class C36988a {
        private C36988a() {
        }

        public /* synthetic */ C36988a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m83211a(Context context, String str, String str2, String str3, String str4, String str5, Bundle bundle, String str6, Long l, Aweme aweme) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(str, "mixId");
            C52711k.m112240b(str2, "authorUid");
            C52711k.m112240b(str3, "authorSuid");
            C52711k.m112240b(str4, "eventType");
            C52711k.m112240b(str5, "enterMethod");
            C52711k.m112240b(bundle, "extras");
            C31216x.m72903a(aweme, str, str2, str4, str5);
            Intent intent = new Intent(context, MixDetailActivity.class);
            bundle.putString("mix_id", str);
            bundle.putString("event_type", str4);
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("mix_from_order", str6);
            }
            if (l != null && l.longValue() > 0) {
                bundle.putLong("mix_enter_episode_num", l.longValue());
            }
            if (aweme != null) {
                bundle.putString("feed_aweme_id", aweme.getAid());
            }
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }

    public final int getStatusBarColor() {
        return getResources().getColor(R.color.arz);
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        super.onCreate(bundle);
        setContentView((int) R.layout.cr);
        String stringExtra = getIntent().getStringExtra("mix_id");
        String stringExtra2 = getIntent().getStringExtra("uid");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        String stringExtra3 = getIntent().getStringExtra("event_type");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        String stringExtra4 = getIntent().getStringExtra("mix_from_order");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        long longExtra = getIntent().getLongExtra("mix_enter_episode_num", 0);
        String stringExtra5 = getIntent().getStringExtra("extra_search_result_id");
        String stringExtra6 = getIntent().getStringExtra("extra_list_item_id");
        String stringExtra7 = getIntent().getStringExtra("impr_id");
        String stringExtra8 = getIntent().getStringExtra("feed_aweme_id");
        C52711k.m112236a((Object) stringExtra, "mixId");
        Long valueOf = Long.valueOf(longExtra);
        C52711k.m112240b(stringExtra, "mixId");
        C52711k.m112240b(stringExtra2, "uid");
        C52711k.m112240b(stringExtra3, "eventType");
        C52711k.m112240b(stringExtra4, "orderFrom");
        C37032j jVar = new C37032j();
        Bundle bundle2 = new Bundle();
        bundle2.putString("mix_id", stringExtra);
        bundle2.putString("uid", stringExtra2);
        bundle2.putString("event_type", stringExtra3);
        bundle2.putString("mix_from_order", stringExtra4);
        bundle2.putString("feed_aweme_id", stringExtra8);
        if (valueOf != null) {
            bundle2.putLong("mix_enter_episode_num", valueOf.longValue());
        }
        CharSequence charSequence = stringExtra5;
        boolean z3 = false;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            bundle2.putString("extra_search_result_id", stringExtra5);
        }
        CharSequence charSequence2 = stringExtra6;
        if (charSequence2 == null || charSequence2.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            bundle2.putString("extra_list_item_id", stringExtra6);
        }
        CharSequence charSequence3 = stringExtra7;
        if (charSequence3 == null || charSequence3.length() == 0) {
            z3 = true;
        }
        if (!z3) {
            bundle2.putString("impr_id", stringExtra7);
        }
        jVar.setArguments(bundle2);
        getSupportFragmentManager().mo2225a().mo2175a((int) R.id.ajf, (Fragment) jVar).mo2189b();
    }
}
