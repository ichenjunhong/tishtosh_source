package com.bytedance.android.livesdk.chatroom.p310f;

import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p230g.C3899m;
import com.bytedance.android.live.core.p230g.C3909r;
import com.bytedance.android.live.core.p230g.C3909r.C3910a;
import com.bytedance.android.live.core.p230g.p231a.C3853c;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.common.utility.C9431p;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.facebook.imagepipeline.p975o.C14234d;
import java.util.ArrayList;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;

/* renamed from: com.bytedance.android.livesdk.chatroom.f.c */
public final class C5213c {
    /* renamed from: a */
    public static void m11822a(HSImageView hSImageView, String str) {
        C3899m.m9860a(hSImageView, str);
    }

    /* renamed from: a */
    public static void m11823a(HSImageView hSImageView, String str, C14234d dVar) {
        C3899m.m9861a(hSImageView, str, dVar);
    }

    /* renamed from: a */
    public static C2201v<Bitmap> m11812a(ImageModel imageModel) {
        return C2201v.m6601a((C2205y<T>) new C5215d<T>(imageModel));
    }

    /* renamed from: b */
    public static C14229b[] m11827b(ImageModel imageModel) {
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C3853c cVar = new C3853c();
        for (String str : imageModel.getUrls()) {
            if (!C9431p.m18664a(str)) {
                C14232c a = C14232c.m29169a(Uri.parse(str));
                cVar.mo9234a(a);
                arrayList.add(a.mo26449a());
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (C14229b[]) arrayList.toArray(new C14229b[arrayList.size()]);
    }

    /* renamed from: b */
    public static void m11824b(ImageView imageView, ImageModel imageModel) {
        C3909r.m9875a(imageView, imageModel);
    }

    /* renamed from: a */
    public static void m11813a(ImageView imageView, int i) {
        C3909r.m9874a(imageView, i, -1, -1);
    }

    /* renamed from: a */
    public static void m11814a(ImageView imageView, ImageModel imageModel) {
        m11825b(imageView, imageModel, 0);
    }

    /* renamed from: a */
    public static void m11820a(HSImageView hSImageView, ImageModel imageModel) {
        C3899m.m9868b(hSImageView, imageModel);
    }

    /* renamed from: a */
    public static void m11819a(ImageView imageView, ImageModel imageModel, C3910a aVar) {
        C3909r.m9881a(imageView, imageModel, aVar);
    }

    /* renamed from: b */
    private static void m11825b(ImageView imageView, ImageModel imageModel, int i) {
        C3909r.m9876a(imageView, imageModel, 0);
    }

    /* renamed from: a */
    public static void m11815a(ImageView imageView, ImageModel imageModel, int i) {
        C3909r.m9878a(imageView, imageModel, 0, 0, i, null);
    }

    /* renamed from: a */
    public static void m11821a(HSImageView hSImageView, ImageModel imageModel, C14234d dVar) {
        C3899m.m9859a(hSImageView, imageModel, dVar);
    }

    /* renamed from: a */
    public static void m11816a(ImageView imageView, ImageModel imageModel, int i, int i2) {
        C3909r.m9879a(imageView, imageModel, i, i2, null);
    }

    /* renamed from: b */
    public static void m11826b(ImageView imageView, ImageModel imageModel, int i, int i2, int i3) {
        C3909r.m9878a(imageView, imageModel, i, i2, i3, null);
    }

    /* renamed from: a */
    public static void m11818a(ImageView imageView, ImageModel imageModel, int i, int i2, int i3) {
        C3909r.m9884b(imageView, imageModel, i, i2, i3, null);
    }

    /* renamed from: a */
    public static void m11817a(ImageView imageView, ImageModel imageModel, int i, int i2, float f, C3910a aVar) {
        C3909r.m9877a(imageView, imageModel, 0, 0, i, i2, f, null);
    }
}
