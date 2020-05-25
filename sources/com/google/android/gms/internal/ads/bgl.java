package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;

final class bgl implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bgk f42313a;

    bgl(bgk bgk) {
        this.f42313a = bgk;
    }

    public final void run() {
        bgk bgk = this.f42313a;
        try {
            Class loadClass = bgk.f42306a.f42218c.loadClass(bgk.mo30127a(bgk.f42306a.f42220e, bgk.f42307b));
            if (loadClass != null) {
                bgk.f42309d = loadClass.getMethod(bgk.mo30127a(bgk.f42306a.f42220e, bgk.f42308c), bgk.f42310e);
                if (bgk.f42309d == null) {
                    bgk.f42311f.countDown();
                } else {
                    bgk.f42311f.countDown();
                }
            }
        } catch (bek unused) {
        } catch (UnsupportedEncodingException unused2) {
        } catch (ClassNotFoundException unused3) {
        } catch (NoSuchMethodException unused4) {
        } catch (NullPointerException unused5) {
        } finally {
            bgk.f42311f.countDown();
        }
    }
}
