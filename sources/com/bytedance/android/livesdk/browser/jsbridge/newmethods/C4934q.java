package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.media.MediaMetadataRetriever;
import com.bytedance.common.utility.BitmapUtils;
import java.io.File;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.q */
final /* synthetic */ class C4934q implements C2205y {

    /* renamed from: a */
    private final C4921p f13264a;

    /* renamed from: b */
    private final String f13265b;

    C4934q(C4921p pVar, String str) {
        this.f13264a = pVar;
        this.f13265b = str;
    }

    public final void subscribe(C2204x xVar) {
        String str;
        String str2;
        C4921p pVar = this.f13264a;
        String str3 = this.f13265b;
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str3);
            boolean saveBitmapToSD = BitmapUtils.saveBitmapToSD(mediaMetadataRetriever.getFrameAtTime(), pVar.f13223a, "firstFrame.temp");
            str2 = "";
            if (saveBitmapToSD) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(pVar.f13223a);
                    sb.append(File.separator);
                    sb.append("firstFrame.temp");
                    str = sb.toString();
                } catch (Exception unused) {
                }
                xVar.mo6282a(str);
            }
        } catch (Exception unused2) {
            str2 = null;
        }
        str = str2;
        xVar.mo6282a(str);
    }
}
