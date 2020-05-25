package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.C15384g;
import com.google.android.gms.common.util.C15527r;
import com.p683ss.android.ugc.aweme.keva.C35807d;

public class acp extends acr {
    /* renamed from: a */
    public final boolean mo28692a(Context context, WebSettings webSettings) {
        super.mo28692a(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    /* renamed from: a */
    public final String mo28687a(Context context) {
        aem a = aem.m32734a();
        if (TextUtils.isEmpty(a.f40358a)) {
            a.f40358a = (String) aek.m32731a(context, new aen(a, C15384g.m31963c(context), context));
        }
        return a.f40358a;
    }

    /* renamed from: b */
    public final void mo28695b(Context context) {
        aem a = aem.m32734a();
        abv.m32494a("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(a.f40358a)) {
            Context c = C15384g.m31963c(context);
            if (c == null) {
                Editor putString = C35807d.m80935a(context, "admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (c == null) {
                    putString.apply();
                } else {
                    C15527r.m32307a(context, putString, "admob_user_agent");
                }
            }
            a.f40358a = defaultUserAgent;
        }
        abv.m32494a("User agent is updated.");
    }

    /* renamed from: a */
    public final Drawable mo28684a(Context context, Bitmap bitmap, boolean z, float f) {
        if (!z || f <= 0.0f || f > 25.0f) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            RenderScript create = RenderScript.create(context);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return new BitmapDrawable(context.getResources(), createBitmap);
        } catch (RuntimeException unused) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
    }
}
