package com.p683ss.android.ugc.aweme.infoSticker;

import android.app.Application;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y.C0213c;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.ad */
public class C35557ad extends C0213c {

    /* renamed from: a */
    static volatile C35557ad f91391a;

    /* renamed from: b */
    private final InfoStickerRepository f91392b;

    private C35557ad(InfoStickerRepository infoStickerRepository) {
        this.f91392b = infoStickerRepository;
    }

    /* renamed from: a */
    public static C35557ad m80351a(Application application) {
        if (f91391a == null) {
            synchronized (C35557ad.class) {
                f91391a = new C35557ad(new InfoStickerRepository(application.getApplicationContext()));
            }
        }
        return f91391a;
    }

    /* renamed from: a */
    public final <T extends C0209x> T mo361a(Class<T> cls) {
        if (cls.isAssignableFrom(InfoStickerViewModel.class)) {
            return new InfoStickerViewModel(this.f91392b);
        }
        StringBuilder sb = new StringBuilder("Unknow ViewModel class: ");
        sb.append(cls.getName());
        throw new IllegalArgumentException(sb.toString());
    }
}
