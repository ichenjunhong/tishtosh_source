package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.ss.android.ugc.trill.R;
import com.twitter.sdk.android.core.C52074f;
import com.twitter.sdk.android.core.models.C52209m;

/* renamed from: com.twitter.sdk.android.tweetui.m */
final class C52305m implements OnClickListener {

    /* renamed from: a */
    final C52209m f130252a;

    /* renamed from: b */
    final C52312r f130253b;

    /* renamed from: c */
    final C52310p f130254c;

    public final void onClick(View view) {
        Context context = view.getContext();
        Resources resources = view.getResources();
        if (this.f130252a != null && this.f130252a.f129956D != null) {
            this.f130254c.mo109119a(this.f130252a);
            String string = resources.getString(R.string.f50, new Object[]{this.f130252a.f129956D.name, this.f130252a.f129956D.screenName});
            String string2 = resources.getString(R.string.f4z, new Object[]{this.f130252a.f129956D.screenName, Long.toString(this.f130252a.f129969i)});
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.SUBJECT", string);
            intent.putExtra("android.intent.extra.TEXT", string2);
            intent.setType("text/plain");
            C52074f.m111396b(context, Intent.createChooser(intent, resources.getString(R.string.f51)));
        }
    }

    C52305m(C52209m mVar, C52312r rVar) {
        this(mVar, rVar, new C52311q(rVar));
    }

    private C52305m(C52209m mVar, C52312r rVar, C52310p pVar) {
        this.f130252a = mVar;
        this.f130253b = rVar;
        this.f130254c = pVar;
    }
}
