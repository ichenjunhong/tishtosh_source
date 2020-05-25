package com.bytedance.android.live.broadcast.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.text.TextUtils;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import p064c.p065a.C1680ad;
import p064c.p065a.C2149h;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

public final class StickerImageUploader {

    /* renamed from: a */
    public C1690c f10328a;

    /* renamed from: b */
    public C1690c f10329b;

    /* renamed from: c */
    boolean f10330c;

    /* renamed from: d */
    public C3627b<C3628c> f10331d;

    interface UploadStickerImageApi {
        @C12718t(mo23886a = "/webcast/review/upload_green_screen/")
        C1680ad<C4177d<Object>> upload(@C12700b TypedOutput typedOutput, @C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "user_id") long j2);
    }

    /* renamed from: com.bytedance.android.live.broadcast.utils.StickerImageUploader$a */
    static class C3626a {

        /* renamed from: a */
        public static StickerImageUploader f10332a = new StickerImageUploader();
    }

    /* renamed from: com.bytedance.android.live.broadcast.utils.StickerImageUploader$b */
    public static class C3627b<T> {

        /* renamed from: a */
        public final List<T> f10333a = Collections.synchronizedList(new ArrayList(20));

        /* renamed from: b */
        public final int f10334b = 20;

        /* renamed from: a */
        public final T mo9006a() {
            if (this.f10333a.size() == 0) {
                return null;
            }
            return this.f10333a.remove(0);
        }

        public C3627b(int i) {
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.utils.StickerImageUploader$c */
    public static class C3628c {

        /* renamed from: a */
        String f10335a;

        /* renamed from: b */
        String f10336b;

        /* renamed from: c */
        long f10337c;

        /* renamed from: d */
        long f10338d;

        public final boolean equals(Object obj) {
            if (!(obj instanceof C3628c)) {
                return false;
            }
            return TextUtils.equals(((C3628c) obj).f10336b, this.f10336b);
        }

        public C3628c(String str, String str2, long j, long j2) {
            this.f10335a = str;
            this.f10336b = str2;
            this.f10337c = j;
            this.f10338d = j2;
        }
    }

    /* renamed from: a */
    public static StickerImageUploader m9458a() {
        return C3626a.f10332a;
    }

    private StickerImageUploader() {
        this.f10331d = new C3627b<>(20);
    }

    /* renamed from: b */
    public void mo9004b() {
        if (!this.f10330c) {
            this.f10330c = true;
            C3628c cVar = (C3628c) this.f10331d.mo9006a();
            if (cVar == null) {
                this.f10330c = false;
            } else if (!new File(cVar.f10336b).exists()) {
                this.f10330c = false;
            } else {
                this.f10329b = C2149h.m6452a((Callable<? extends T>) new C3640g<Object>(this, cVar)).mo6443a(C1667a.m5940a()).mo6452b(C2168a.m6521b()).mo6438a((C1710e<? super T>) new C3641h<Object>(this, cVar), (C1710e<? super Throwable>) new C3642i<Object>(this, cVar));
            }
        }
    }

    /* renamed from: a */
    private static Bitmap m9457a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
        int i = 90;
        while (byteArrayOutputStream.toByteArray().length / PreloadTask.BYTE_UNIT_NUMBER > 300) {
            byteArrayOutputStream.reset();
            bitmap.compress(CompressFormat.JPEG, i, byteArrayOutputStream);
            i -= 10;
        }
        return BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), null, null);
    }

    /* renamed from: a */
    public final File mo9003a(String str) {
        File file = new File(str);
        if (file.length() / 1024 < 300) {
            return file;
        }
        Options options = new Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        if (i2 > i3 && i2 > 600) {
            i = i2 / 600;
        } else if (i2 < i3 && i3 > 800) {
            i = i3 / 800;
        }
        options.inSampleSize = i;
        Bitmap a = m9457a(BitmapFactory.decodeFile(str, options));
        try {
            Context context = C8830k.m17331e().mo13039a().context();
            StringBuilder sb = new StringBuilder();
            sb.append(context.getCacheDir());
            sb.append(File.separator);
            sb.append(UUID.randomUUID().toString());
            sb.append(".jpg");
            File file2 = new File(sb.toString());
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            a.compress(CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return file2;
        } catch (Exception unused) {
            return null;
        }
    }
}
