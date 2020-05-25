package com.p683ss.android.ugc.aweme.p1389au;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity.C44037b;
import com.p683ss.android.ugc.aweme.sticker.C46409q;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.au.b */
public final class C23293b implements C46409q {
    /* renamed from: a */
    public final Intent mo48309a(Activity activity, Intent intent) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(intent, "intent");
        intent.setClass(activity, VECutVideoActivity.class);
        return intent;
    }

    /* renamed from: a */
    public final void mo48310a(Activity activity, Bundle bundle, int i, int i2) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(bundle, "bundle");
        C44037b.m96620a(activity, bundle, i, i2);
    }

    /* renamed from: b */
    public final Intent mo48311b(Activity activity, Bundle bundle, int i, int i2) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(bundle, "bundle");
        Intent intent = new Intent(activity, MvChoosePhotoActivity.class);
        intent.putExtras(bundle);
        intent.putExtra("key_choose_request_code", i);
        intent.putExtra("key_start_activity_request_code", i2);
        return intent;
    }
}
