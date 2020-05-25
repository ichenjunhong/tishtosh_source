package com.bytedance.android.livesdk.chatroom.p301a;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.b */
final /* synthetic */ class C4968b implements OnClickListener {

    /* renamed from: a */
    private final C4963a f13329a;

    C4968b(C4963a aVar) {
        this.f13329a = aVar;
    }

    public final void onClick(View view) {
        int i;
        C4963a aVar = this.f13329a;
        int id = view.getId();
        if (id == R.id.ayf || id == R.id.d76) {
            i = 0;
        } else if (id == R.id.aye || id == R.id.d75) {
            i = 1;
        } else if (id == R.id.ayd || id == R.id.d74) {
            i = 2;
        } else {
            return;
        }
        aVar.mo10723a(i);
        C4525b.f12328X.mo10346a(Integer.valueOf(i));
    }
}
