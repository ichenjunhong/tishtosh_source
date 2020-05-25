package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.p030v4.graphics.drawable.C0810b;
import android.support.p030v4.graphics.drawable.C0812d;
import android.text.TextUtils;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43684d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43684d.C43688d;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.vesdk.C50753r;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bq */
final /* synthetic */ class C45077bq implements C50753r {

    /* renamed from: a */
    private final C45054bg f114171a;

    C45077bq(C45054bg bgVar) {
        this.f114171a = bgVar;
    }

    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
        C45054bg bgVar = this.f114171a;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
        C0810b a = C0812d.m2344a(bgVar.getResources(), createBitmap);
        a.mo2609a(C9432q.m18687b((Context) C39618d.f101160a, 4.0f));
        bgVar.f114125k.setImageDrawable(a);
        if (TextUtils.isEmpty(bgVar.f114131q.multiEditVideoRecordData.coverImagePath)) {
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = bgVar.f114131q.multiEditVideoRecordData;
            if (!C48016e.m103944b(C43684d.f110615a)) {
                new File(C43684d.f110615a).mkdirs();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C43684d.f110615a);
            sb.append(System.currentTimeMillis());
            sb.append("_cover_img.png");
            multiEditVideoStatusRecordData.coverImagePath = sb.toString();
        }
        String str = bgVar.f114131q.multiEditVideoRecordData.coverImagePath;
        C52711k.m112240b(str, "imgPath");
        if (createBitmap != null && !createBitmap.isRecycled()) {
            C0013i.m16a((Callable<TResult>) new C43688d<TResult>(str, createBitmap));
        }
        return false;
    }
}
