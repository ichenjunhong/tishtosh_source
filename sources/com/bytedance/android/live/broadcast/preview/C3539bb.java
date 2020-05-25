package com.bytedance.android.live.broadcast.preview;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p030v4.app.C0654k;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.p683ss.ttm.player.MediaPlayer;

/* renamed from: com.bytedance.android.live.broadcast.preview.bb */
final /* synthetic */ class C3539bb implements OnClickListener {

    /* renamed from: a */
    private final C3514al f10095a;

    /* renamed from: b */
    private final String f10096b;

    C3539bb(C3514al alVar, String str) {
        this.f10095a = alVar;
        this.f10096b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C3514al alVar = this.f10095a;
        C4104a a = ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10487a(C4704c.m11226a(this.f10096b).mo10510a(300).mo10514b((int) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL));
        C0654k fragmentManager = alVar.getFragmentManager();
        if (!(fragmentManager == null || a == null)) {
            a.show(fragmentManager, a.getClass().getCanonicalName());
        }
        dialogInterface.dismiss();
    }
}
