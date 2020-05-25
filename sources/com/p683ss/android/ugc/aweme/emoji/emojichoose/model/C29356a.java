package com.p683ss.android.ugc.aweme.emoji.emojichoose.model;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.text.TextUtils;
import com.bytedance.common.utility.p524d.C9396a;
import com.google.gson.p1076a.C17952c;
import java.io.File;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.model.a */
public final class C29356a implements Serializable {
    @C17952c(mo34828a = "animate_uri")

    /* renamed from: a */
    private String f76892a;
    @C17952c(mo34828a = "static_uri")

    /* renamed from: b */
    private String f76893b;
    @C17952c(mo34828a = "animate_type")

    /* renamed from: c */
    private String f76894c;
    @C17952c(mo34828a = "static_type")

    /* renamed from: d */
    private String f76895d;
    @C17952c(mo34828a = "width")

    /* renamed from: e */
    private int f76896e;
    @C17952c(mo34828a = "height")

    /* renamed from: f */
    private int f76897f;

    public final String getAnimateType() {
        return this.f76894c;
    }

    public final String getAnimateUrl() {
        return this.f76892a;
    }

    public final int getHeight() {
        return this.f76897f;
    }

    public final String getStaticType() {
        return this.f76895d;
    }

    public final String getStaticUrl() {
        return this.f76893b;
    }

    public final int getWidth() {
        return this.f76896e;
    }

    public final void setAnimateType(String str) {
        this.f76894c = str;
    }

    public final void setAnimateUrl(String str) {
        this.f76892a = str;
    }

    public final void setHeight(int i) {
        this.f76897f = i;
    }

    public final void setStaticType(String str) {
        this.f76895d = str;
    }

    public final void setStaticUrl(String str) {
        this.f76893b = str;
    }

    public final void setWidth(int i) {
        this.f76896e = i;
    }

    public static C29356a obtain(String str, String str2) {
        int i;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        C29356a aVar = new C29356a();
        aVar.f76892a = str2;
        aVar.f76893b = str2;
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i2 = 0;
        if (options.outWidth == 0 || options.outHeight == 0) {
            i = 0;
        } else if (options.outWidth <= 140 && options.outHeight <= 140) {
            i2 = options.outWidth;
            i = options.outHeight;
        } else if (options.outWidth >= options.outHeight) {
            i = (options.outHeight * 140) / options.outWidth;
            i2 = 140;
        } else {
            i2 = (options.outWidth * 140) / options.outHeight;
            i = 140;
        }
        aVar.f76896e = i2;
        aVar.f76897f = i;
        if (C9396a.m18582b(new File(str))) {
            aVar.f76894c = "gif";
            aVar.f76895d = "gif";
        } else {
            aVar.f76894c = "jpeg";
            aVar.f76895d = "jpeg";
        }
        return aVar;
    }
}
