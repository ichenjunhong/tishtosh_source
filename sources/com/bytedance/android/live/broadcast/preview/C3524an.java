package com.bytedance.android.live.broadcast.preview;

import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.broadcast.model.C3453b;
import com.bytedance.android.live.broadcast.model.C3453b.C3454a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.preview.an */
final /* synthetic */ class C3524an implements C1710e {

    /* renamed from: a */
    private final C3514al f10081a;

    C3524an(C3514al alVar) {
        this.f10081a = alVar;
    }

    public final void accept(Object obj) {
        CharSequence charSequence;
        String str;
        C3514al alVar = this.f10081a;
        C4177d dVar = (C4177d) obj;
        C3454a aVar = ((C3453b) dVar.data).f9877a;
        if (aVar != null) {
            if (aVar.f9881d) {
                charSequence = C3922z.m9903a((int) R.string.eek);
                if (charSequence == 0) {
                    return;
                }
            } else {
                int i = (int) (((aVar.f9878a - (dVar.extra.now / 1000)) + ((long) ((C3453b) dVar.data).f9877a.f9879b)) / 60);
                if (i < 60) {
                    str = C3922z.m9904a(R.plurals.u, i, Integer.valueOf(i));
                } else if (i < 1440) {
                    i /= 60;
                    str = C3922z.m9904a(R.plurals.t, i, Integer.valueOf(i));
                } else {
                    i /= 1440;
                    str = C3922z.m9904a(R.plurals.s, i, Integer.valueOf(i));
                }
                String valueOf = String.valueOf(i);
                if (str != null) {
                    String[] split = str.split(valueOf);
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ff2200")), split[0].length(), split[0].length() + valueOf.length(), 33);
                    charSequence = spannableString;
                }
            }
            new C8552a(alVar.getContext()).mo15009c(charSequence).mo15003b(0, (int) R.string.eel, (OnClickListener) new C3539bb(alVar, Uri.parse((String) LiveConfigSettingKeys.LIVE_BLOCKED_DETAIL_URL.mo9431a()).buildUpon().appendQueryParameter("id", String.valueOf(aVar.f9882e)).build().toString())).mo15001b().show();
            C8049c.m15979a().mo14203a("pm_live_take_banpopup_show", new C8059j().mo14214b("live_take").mo14218f("show").mo14213a("live_take_page"), new C8060k());
        }
    }
}
