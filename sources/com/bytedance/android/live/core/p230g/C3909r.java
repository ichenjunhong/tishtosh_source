package com.bytedance.android.live.core.p230g;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p230g.C3899m.C3903b;
import com.bytedance.android.live.core.p230g.p231a.C3848a;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.p522b.C9376b;
import com.facebook.drawee.p936c.C13791d;
import java.util.Collection;

/* renamed from: com.bytedance.android.live.core.g.r */
public final class C3909r {

    /* renamed from: com.bytedance.android.live.core.g.r$a */
    public interface C3910a {
        /* renamed from: a */
        void mo9270a(ImageModel imageModel);

        /* renamed from: a */
        void mo9271a(ImageModel imageModel, int i, int i2, boolean z);

        /* renamed from: a */
        void mo9272a(ImageModel imageModel, Exception exc);
    }

    /* renamed from: com.bytedance.android.live.core.g.r$b */
    public interface C3911b {
        /* renamed from: a */
        void mo9273a(Bitmap bitmap);
    }

    /* renamed from: a */
    private static boolean m9882a(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                return (VERSION.SDK_INT < 17 || !activity.isDestroyed()) && !activity.isFinishing();
            } else if ((context instanceof Application) || !(context instanceof ContextWrapper)) {
                return true;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m9881a(ImageView imageView, ImageModel imageModel, C3910a aVar) {
        m9884b(imageView, imageModel, -1, -1, 0, aVar);
    }

    /* renamed from: a */
    private static String m9873a(ImageModel imageModel) {
        if (imageModel == null || C9414h.m18630a(imageModel.getUrls())) {
            return "";
        }
        return (String) imageModel.getUrls().get(0);
    }

    /* renamed from: b */
    public static void m9883b(ImageView imageView, ImageModel imageModel) {
        if (imageModel != null && !C9376b.m18558a((Collection<T>) imageModel.getUrls())) {
            m9876a(imageView, imageModel, 0);
        }
    }

    /* renamed from: a */
    public static void m9875a(ImageView imageView, ImageModel imageModel) {
        if (m9882a(imageView.getContext())) {
            C3848a.m9760a(imageView.getContext()).mo9223a(imageModel).mo9217a().mo9222a(ScaleType.CENTER_CROP).mo9224a((C13791d) new C3903b(null, null)).mo9227a(imageView);
        }
    }

    /* renamed from: a */
    public static void m9876a(ImageView imageView, ImageModel imageModel, int i) {
        m9884b(imageView, imageModel, -1, -1, i, null);
    }

    /* renamed from: a */
    public static void m9874a(ImageView imageView, int i, int i2, int i3) {
        if (m9882a(imageView.getContext())) {
            C3848a.m9760a(imageView.getContext()).mo9221a(new Builder().scheme("res").path(String.valueOf(i)).build()).mo9217a().mo9222a(ScaleType.CENTER_CROP).mo9224a((C13791d) new C3903b(null, null)).mo9227a(imageView);
        }
    }

    /* renamed from: a */
    public static void m9879a(ImageView imageView, ImageModel imageModel, int i, int i2, C3910a aVar) {
        if (imageModel != null && !C9376b.m18558a((Collection<T>) imageModel.getUrls()) && m9882a(imageView.getContext())) {
            m9884b(imageView, imageModel, i, i2, -1, null);
        }
    }

    /* renamed from: b */
    public static void m9884b(ImageView imageView, ImageModel imageModel, int i, int i2, int i3, C3910a aVar) {
        m9880a(imageView, imageModel, i, i2, false, i3, aVar);
    }

    /* renamed from: a */
    public static void m9878a(ImageView imageView, ImageModel imageModel, int i, int i2, int i3, C3910a aVar) {
        if (m9882a(imageView.getContext())) {
            C3848a a = C3848a.m9760a(imageView.getContext()).mo9223a(imageModel).mo9217a().mo9222a(ScaleType.CENTER_CROP);
            if (i > 0 && i2 > 0) {
                a.mo9220a(i, i2);
            }
            if (i3 > 0) {
                a.mo9218a(i3);
            }
            a.mo9224a((C13791d) new C3903b(null, null));
            a.mo9227a(imageView);
        }
    }

    /* renamed from: a */
    public static void m9880a(ImageView imageView, ImageModel imageModel, int i, int i2, boolean z, int i3, C3910a aVar) {
        if (imageModel == null) {
            if (aVar != null) {
                aVar.mo9272a(imageModel, new IllegalArgumentException("imageModel == null"));
            }
        } else if (C9376b.m18558a((Collection<T>) imageModel.getUrls())) {
            if (aVar != null) {
                aVar.mo9272a(imageModel, new IllegalArgumentException("CollectionUtils.isEmpty(imageModel.urls)"));
            }
        } else if (!m9882a(imageView.getContext())) {
            if (aVar != null) {
                aVar.mo9272a(imageModel, new IllegalArgumentException("!isActivityOK(view.getContext())"));
            }
        } else {
            C3848a a = C3848a.m9760a(imageView.getContext()).mo9225a(m9873a(imageModel)).mo9223a(imageModel).mo9222a(ScaleType.CENTER_CROP);
            if (i > 0 && i2 > 0) {
                a.mo9220a(i, i2);
            }
            if (i3 > 0) {
                a.mo9218a(i3);
            }
            if (z) {
                a.mo9226a(true);
            }
            a.mo9224a((C13791d) new C3903b(imageModel, aVar));
            a.mo9227a(imageView);
        }
    }

    /* renamed from: a */
    public static void m9877a(ImageView imageView, ImageModel imageModel, int i, int i2, int i3, int i4, float f, C3910a aVar) {
        if (m9882a(imageView.getContext())) {
            C3848a a = C3848a.m9760a(imageView.getContext()).mo9223a(imageModel).mo9217a().mo9219a(i4, f).mo9222a(ScaleType.CENTER_CROP);
            if (i3 > 0) {
                a.mo9218a(i3);
            }
            if (aVar != null) {
                a.mo9224a((C13791d) new C3903b(imageModel, aVar));
            } else {
                a.mo9224a((C13791d) new C3903b(null, null));
            }
            a.mo9227a(imageView);
        }
    }
}
