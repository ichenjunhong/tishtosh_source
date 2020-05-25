package com.p683ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0214z;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.u */
final /* synthetic */ class C44895u implements OnClickListener {

    /* renamed from: a */
    private final C44457s f113620a;

    /* renamed from: b */
    private final String f113621b;

    C44895u(C44457s sVar, String str) {
        this.f113620a = sVar;
        this.f113621b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C44457s sVar = this.f113620a;
        String str = this.f113621b;
        C26890h.m65011a("tutorial_popup_confirm", C23089d.m56640a().mo47829a("enter_from", "video_shoot_page").f61491a);
        dialogInterface.dismiss();
        if (sVar.f112457a.f33840g_ != null) {
            Intent intent = new Intent(sVar.f112457a.mo87887i(), C39618d.f101162c.mo74161g());
            intent.setData(Uri.parse(str));
            sVar.f112457a.f33840g_.startActivity(intent);
            if (((ShortVideoContextViewModel) C0214z.m440a(sVar.f112457a.mo87882I()).mo359a(ShortVideoContextViewModel.class)).f107134a.f107120m == 0) {
                sVar.mo90339a();
            }
        }
    }
}
