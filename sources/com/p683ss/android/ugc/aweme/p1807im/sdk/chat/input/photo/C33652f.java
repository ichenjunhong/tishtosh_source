package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.RelationSelectActivity;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.f */
final /* synthetic */ class C33652f implements OnClickListener {

    /* renamed from: a */
    private final C336332 f87270a;

    C33652f(C336332 r1) {
        this.f87270a = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C336332 r3 = this.f87270a;
        switch (i) {
            case 0:
                PhotoDetailActivity photoDetailActivity = PhotoDetailActivity.this;
                Bundle bundle = new Bundle();
                if (photoDetailActivity.f87180g.getMsgType() == 27) {
                    if (photoDetailActivity.f87184k != null) {
                        bundle.putParcelable("share_package", photoDetailActivity.f87184k.generateSharePackage());
                        bundle.putSerializable("share_content", photoDetailActivity.f87184k);
                    }
                    return;
                } else if (photoDetailActivity.f87180g.getMsgType() == 2) {
                    if (photoDetailActivity.f87183j != null) {
                        bundle.putParcelable("share_package", photoDetailActivity.f87183j.generateSharePackage());
                        bundle.putSerializable("share_content", photoDetailActivity.f87183j);
                    }
                    return;
                }
                RelationSelectActivity.m78822a((Context) photoDetailActivity, bundle, null);
                return;
            case 1:
                PhotoDetailActivity.this.mo71086c();
                break;
        }
    }
}
