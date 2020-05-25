package com.bytedance.android.live.broadcast.preview;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.bytedance.android.live.broadcast.p198b.C3076j;
import com.bytedance.android.livesdk.chatroom.model.C5728aq;
import com.bytedance.android.livesdk.p272ad.C4525b;
import java.util.Map;

/* renamed from: com.bytedance.android.live.broadcast.preview.ap */
final /* synthetic */ class C3526ap implements OnClickListener {

    /* renamed from: a */
    private final C3514al f10083a;

    C3526ap(C3514al alVar) {
        this.f10083a = alVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        C3514al alVar = this.f10083a;
        dialogInterface.dismiss();
        if (alVar.getFragmentManager() != null) {
            C5728aq aqVar = (C5728aq) C3514al.f10002a.mo34884a((String) ((Map) C4525b.f12315K.mo10345a()).get(alVar.f10057l.name()), C5728aq.class);
            if (aqVar == null) {
                i2 = -1;
            } else {
                i2 = aqVar.f15081a;
            }
            C3076j jVar = new C3076j();
            Bundle bundle = new Bundle();
            bundle.putInt("INIT_TAG_ID", i2);
            jVar.setArguments(bundle);
            jVar.f9013g = new C3538ba(alVar);
            jVar.show(alVar.getFragmentManager(), "TAG_PICKER");
            alVar.mo8897a(8);
        }
    }
}
