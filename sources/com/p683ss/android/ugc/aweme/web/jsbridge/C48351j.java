package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Environment;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import com.p683ss.android.ugc.aweme.utils.C47954t;
import java.io.File;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.j */
final /* synthetic */ class C48351j implements C0011g {

    /* renamed from: a */
    private final int f121645a;

    C48351j(int i) {
        this.f121645a = i;
    }

    public final Object then(C0013i iVar) {
        CompressFormat compressFormat;
        String str;
        int i = this.f121645a;
        if (iVar.mo34e() == null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 0);
            jSONObject.put("file_path", "");
            return jSONObject;
        }
        switch (i) {
            case 1:
                str = ".png";
                compressFormat = CompressFormat.PNG;
                break;
            case 2:
                str = ".webp";
                compressFormat = CompressFormat.WEBP;
                break;
            default:
                str = ".jpg";
                compressFormat = CompressFormat.JPEG;
                break;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
        sb.append(File.separator);
        sb.append("Camera");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("share_");
        sb3.append(System.currentTimeMillis());
        sb3.append(str);
        File file = new File(sb2, sb3.toString());
        C47723bk.m103306a(file.getAbsolutePath(), true);
        boolean a = C47954t.m103765a((Bitmap) iVar.mo34e(), file, 100, compressFormat);
        ((Bitmap) iVar.mo34e()).recycle();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", a ? 1 : 0);
        jSONObject2.put("file_path", a ? file.getAbsoluteFile() : "");
        return jSONObject2;
    }
}
