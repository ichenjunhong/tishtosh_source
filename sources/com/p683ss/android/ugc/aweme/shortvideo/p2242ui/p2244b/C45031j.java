package com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b;

import android.content.Intent;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.b.j */
final /* synthetic */ class C45031j implements Runnable {

    /* renamed from: a */
    private final C45017b f114065a;

    C45031j(C45017b bVar) {
        this.f114065a = bVar;
    }

    public final void run() {
        C45017b bVar = this.f114065a;
        Intent intent = bVar.f114038p.getIntent();
        intent.putExtra("shoot_way", "restore_crash");
        intent.putExtra("restore", 2);
        intent.putExtra("creation_id", UUID.randomUUID().toString());
        bVar.mo91391an();
        bVar.f114038p.startActivity(intent);
    }
}
