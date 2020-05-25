package com.twitter.sdk.android.tweetui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.twitter.sdk.android.core.C52074f;

/* renamed from: com.twitter.sdk.android.tweetui.k */
final /* synthetic */ class C52303k implements OnClickListener {

    /* renamed from: a */
    private final C52270g f130249a;

    /* renamed from: b */
    private final String f130250b;

    C52303k(C52270g gVar, String str) {
        this.f130249a = gVar;
        this.f130250b = str;
    }

    public final void onClick(View view) {
        C52270g gVar = this.f130249a;
        C52074f.m111396b(gVar.f130147d.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(this.f130250b)));
    }
}
