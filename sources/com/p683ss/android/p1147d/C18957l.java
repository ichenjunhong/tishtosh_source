package com.p683ss.android.p1147d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.p524d.C9396a;
import com.p683ss.android.common.util.C18915b;
import com.p683ss.android.common.util.C18919f;
import com.p683ss.android.download.p1160a.C19084c;
import com.p683ss.android.download.p1160a.C19084c.C19085a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import p2699pl.droidsonroids.gif.C53874a;

/* renamed from: com.ss.android.d.l */
public final class C18957l {

    /* renamed from: a */
    C19085a<String, String, String, Void, Object> f52245a;

    /* renamed from: b */
    public C19084c<String, String, String, Void, Object> f52246b;

    /* renamed from: c */
    final Context f52247c;

    /* renamed from: d */
    public final C18919f f52248d;

    /* renamed from: e */
    final C18915b<String> f52249e;

    /* renamed from: f */
    final C18933b f52250f;

    /* renamed from: g */
    public final C18959a f52251g;

    /* renamed from: h */
    public boolean f52252h;

    /* renamed from: com.ss.android.d.l$a */
    public interface C18959a {
        /* renamed from: a */
        void mo38833a(String str, Object obj);
    }

    /* renamed from: b */
    private static C53874a m46130b(String str) {
        try {
            return new C53874a(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Bitmap m46129a(String str) {
        try {
            Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(str, -1);
            if (bitmapFromSD == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapFromSD.compress(CompressFormat.JPEG, 80, byteArrayOutputStream);
            bitmapFromSD.recycle();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            Options options = new Options();
            options.inPurgeable = true;
            options.inPreferredConfig = Config.RGB_565;
            return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Object mo38830a(String str, String str2, String str3) {
        try {
            String c = this.f52250f.mo38805c(str);
            String e = this.f52250f.mo38808e(str);
            File file = new File(c);
            File file2 = new File(c);
            boolean z = false;
            if (file.isFile() || file2.isFile()) {
                z = true;
            }
            if (!z) {
                String a = this.f52250f.mo38800a(str);
                String b = C18933b.m46092b(str);
                String str4 = str2;
                String str5 = str3;
                z = C18943e.m46110a(this.f52247c, -1, str4, str5, a, this.f52250f.mo38807d(str), b, this.f52249e, this.f52248d);
            }
            if (z) {
                File file3 = new File(c);
                if (!file3.isFile()) {
                    file3 = new File(e);
                    c = e;
                }
                if (!file3.isFile() || !C9396a.m18582b(file3)) {
                    return m46129a(c);
                }
                return m46130b(c);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public C18957l(Context context, C18919f fVar, C18933b bVar, C18915b<String> bVar2, C18959a aVar) {
        this(context, fVar, bVar, bVar2, aVar, 16, 2);
    }

    private C18957l(Context context, C18919f fVar, C18933b bVar, C18915b<String> bVar2, C18959a aVar, int i, int i2) {
        this.f52247c = context.getApplicationContext();
        this.f52248d = fVar;
        this.f52250f = bVar;
        this.f52251g = aVar;
        this.f52249e = bVar2;
        this.f52245a = new C19085a<String, String, String, Void, Object>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo38831a(Object obj, Object obj2, Object obj3) {
                return C18957l.this.mo38830a((String) obj, (String) obj2, (String) obj3);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo38832a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                String str = (String) obj;
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                Void voidR = (Void) obj4;
                C18957l lVar = C18957l.this;
                if (lVar.f52252h && lVar.f52251g != null) {
                    lVar.f52251g.mo38833a(str2, obj5);
                }
            }
        };
        this.f52246b = new C19084c<>(16, 2, this.f52245a);
        this.f52252h = true;
    }
}
