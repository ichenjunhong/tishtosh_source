package com.p683ss.android.ugc.aweme.sticker.types.unlock;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.unlock.e */
public final class C46607e {

    /* renamed from: a */
    Context f117587a;

    /* renamed from: b */
    public String f117588b;

    /* renamed from: c */
    SharedPreferences f117589c;

    /* renamed from: d */
    public Editor f117590d = this.f117589c.edit();

    /* renamed from: e */
    public Set<String> f117591e = this.f117589c.getStringSet("remindedIds", new HashSet());

    public C46607e(Context context, String str) {
        this.f117587a = context;
        this.f117588b = str;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("STICKER_RELATED");
        this.f117589c = C35807d.m80935a(context, sb.toString(), 0);
    }
}
