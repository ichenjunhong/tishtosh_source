package com.p683ss.android.ugc.aweme.greenscreen;

import android.content.Context;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.greenscreen.e */
public final class C32889e {
    /* renamed from: a */
    public static final String m75773a(Effect effect) {
        C52711k.m112240b(effect, "$this$greenScreenImageSuffix");
        String extra = effect.getExtra();
        if (extra == null) {
            return "";
        }
        C52711k.m112236a((Object) extra, "this.extra ?: return \"\"");
        if (!C52830p.m112456b((CharSequence) extra, (CharSequence) "green_screen_picture", false, 2, (Object) null)) {
            return "";
        }
        String str = "";
        try {
            String string = new JSONObject(extra).getString("green_screen_picture");
            C52711k.m112236a((Object) string, "jsonObject.getString(IMAGE_SUFFIX_KEY)");
            return string;
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static final boolean m75775a(Context context) {
        C52711k.m112240b(context, "context");
        if (C39629l.m88232a().mo58572c().mo49434a(context) == 0) {
            return true;
        }
        C50275d.m108530a(context, (int) R.string.co0).mo98174a();
        return false;
    }

    /* renamed from: a */
    public static final String m75774a(Effect effect, String str) {
        C52711k.m112240b(effect, "$this$greenScreenImageUrl");
        return C52711k.m112231a(str, (Object) m75773a(effect));
    }
}
