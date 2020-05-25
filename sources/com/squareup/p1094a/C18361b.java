package com.squareup.p1094a;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.p1094a.C18343aa.C18344a;
import com.squareup.p1094a.C18396v.C18402d;
import java.io.IOException;

/* renamed from: com.squareup.a.b */
final class C18361b extends C18343aa {

    /* renamed from: a */
    private static final int f50703a = 22;

    /* renamed from: b */
    private final AssetManager f50704b;

    public C18361b(Context context) {
        this.f50704b = context.getAssets();
    }

    /* renamed from: a */
    public final boolean mo36788a(C18409y yVar) {
        Uri uri = yVar.f50842d;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C18344a mo36787a(C18409y yVar, int i) throws IOException {
        return new C18344a(this.f50704b.open(yVar.f50842d.toString().substring(f50703a)), C18402d.DISK);
    }
}
