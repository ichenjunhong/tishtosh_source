package com.squareup.p1094a;

import android.content.Context;
import android.media.ExifInterface;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.squareup.p1094a.C18343aa.C18344a;
import com.squareup.p1094a.C18396v.C18402d;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.a.m */
final class C18385m extends C18373g {
    C18385m(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final boolean mo36788a(C18409y yVar) {
        return "file".equals(yVar.f50842d.getScheme());
    }

    /* renamed from: a */
    public final C18344a mo36787a(C18409y yVar, int i) throws IOException {
        int i2;
        InputStream b = mo36821b(yVar);
        C18402d dVar = C18402d.DISK;
        int attributeInt = new ExifInterface(yVar.f50842d.getPath()).getAttributeInt("Orientation", 1);
        if (attributeInt == 3) {
            i2 = NormalGiftView.ALPHA_180;
        } else if (attributeInt == 6) {
            i2 = 90;
        } else if (attributeInt != 8) {
            i2 = 0;
        } else {
            i2 = 270;
        }
        return new C18344a(null, b, dVar, i2);
    }
}
