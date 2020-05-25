package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

@C16299uq
public abstract class ahk extends TextureView implements aif {

    /* renamed from: b */
    protected final ahu f40482b = new ahu();

    /* renamed from: c */
    protected final aie f40483c;

    public ahk(Context context) {
        super(context);
        this.f40483c = new aie(context, this);
    }

    /* renamed from: a */
    public abstract String mo28841a();

    /* renamed from: a */
    public abstract void mo28842a(float f, float f2);

    /* renamed from: a */
    public abstract void mo28843a(int i);

    /* renamed from: a */
    public abstract void mo28844a(ahi ahi);

    /* renamed from: b */
    public abstract void mo28845b();

    /* renamed from: b */
    public void mo28889b(int i) {
    }

    /* renamed from: c */
    public abstract void mo28846c();

    /* renamed from: c */
    public void mo28890c(int i) {
    }

    /* renamed from: d */
    public abstract void mo28847d();

    /* renamed from: d */
    public void mo28891d(int i) {
    }

    /* renamed from: e */
    public abstract void mo28848e();

    /* renamed from: e */
    public void mo28892e(int i) {
    }

    /* renamed from: f */
    public void mo28893f(int i) {
    }

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void setVideoPath(String str);

    /* renamed from: a */
    public void mo28888a(String str, String[] strArr) {
        setVideoPath(str);
    }
}
