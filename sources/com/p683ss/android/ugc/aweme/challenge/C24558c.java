package com.p683ss.android.ugc.aweme.challenge;

import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.C22570am;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.discover.mob.C28381ab;
import com.p683ss.android.ugc.aweme.discover.mob.C28390aj;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.festival.christmas.C31361b;
import com.p683ss.android.ugc.aweme.profile.p2090ui.HeaderDetailActivity;
import com.p683ss.android.ugc.aweme.utils.C47668ai;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.c */
public final class C24558c implements C22570am {
    /* renamed from: a */
    public final void mo46911a(ImageView imageView) {
        imageView.setImageResource(R.drawable.a5w);
    }

    /* renamed from: a */
    public final void mo46908a(Activity activity, Bundle bundle) {
        HeaderDetailActivity.m89055a(activity, bundle);
    }

    /* renamed from: a */
    public final void mo46909a(Context context, String str) {
        C31361b.m73110a(context, str);
    }

    /* renamed from: a */
    public final void mo46912a(String str, String str2, String str3, boolean z) {
        String str4;
        C28390aj ajVar = C28390aj.f74551a;
        C52711k.m112240b(str, "event");
        C52711k.m112240b(str2, "enterFrom");
        C52711k.m112240b(str3, "tagId");
        if (z) {
            str4 = C28381ab.m67359d().mo56813a(2);
        } else {
            str4 = C28381ab.m67359d().mo56813a(3);
        }
        Map<String, String> map = C23089d.m56640a().mo47829a("enter_from", str2).mo47829a("tag_id", str3).mo47829a("log_pb", C29981aa.m70153a().mo60161a(str4)).mo47829a("search_result_id", C28381ab.m67354b()).f61491a;
        C52711k.m112236a((Object) map, "EventMapBuilder.newBuild…               .builder()");
        C28390aj.m67374a(str, map);
    }

    /* renamed from: a */
    public final void mo46910a(ViewGroup viewGroup, ImageView imageView, TextView textView, int i, int i2, boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter) {
        C47668ai.m103180a(viewGroup, imageView, textView, i, i2, z, z2, animatorListenerAdapter);
    }
}
