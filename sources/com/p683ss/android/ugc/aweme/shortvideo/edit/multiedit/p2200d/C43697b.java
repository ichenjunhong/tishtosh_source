package com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Bundle;
import android.os.Message;
import com.p683ss.android.vesdk.C50753r;
import dmt.p2652av.video.C52884a;
import java.nio.ByteBuffer;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.b */
final /* synthetic */ class C43697b implements C50753r {

    /* renamed from: a */
    private final C436941 f110633a;

    /* renamed from: b */
    private final String f110634b;

    C43697b(C436941 r1, String str) {
        this.f110633a = r1;
        this.f110634b = str;
    }

    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
        C436941 r7 = this.f110633a;
        String str = this.f110634b;
        C52884a.m112518a(1, "extracting_frame");
        Message message = new Message();
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
        Bundle bundle = new Bundle();
        bundle.putParcelable("bitmap", createBitmap);
        bundle.putString(LeakCanaryFileProvider.f132050j, str);
        message.what = 2;
        message.setData(bundle);
        C43693a.this.f110627a.sendMessage(message);
        return false;
    }
}
