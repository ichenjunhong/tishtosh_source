package com.google.android.gms.internal.ads;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.google.android.gms.internal.ads.amq.C15587a;
import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import com.google.android.gms.internal.ads.amq.C15587a.C15591d;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class bbo {

    /* renamed from: a */
    static MessageDigest f41773a;

    /* renamed from: b */
    static CountDownLatch f41774b = new CountDownLatch(1);

    /* renamed from: c */
    private static boolean f41775c;

    /* renamed from: d */
    private static final Object f41776d = new Object();

    /* renamed from: e */
    private static final Object f41777e = new Object();

    /* renamed from: a */
    static void m35264a() {
        synchronized (f41777e) {
            if (!f41775c) {
                f41775c = true;
                new Thread(new bdk()).start();
            }
        }
    }

    /* renamed from: b */
    private static MessageDigest m35267b() {
        boolean z;
        m35264a();
        try {
            z = f41774b.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (z && f41773a != null) {
            return f41773a;
        }
        return null;
    }

    /* renamed from: a */
    static Vector<byte[]> m35263a(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + NormalGiftView.ALPHA_255) - 1) / NormalGiftView.ALPHA_255;
        Vector<byte[]> vector = new Vector<>();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 * NormalGiftView.ALPHA_255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i3, bArr.length - i3 > 255 ? i3 + NormalGiftView.ALPHA_255 : bArr.length));
                i2++;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    /* renamed from: a */
    static C15587a m35262a(C15591d dVar) {
        C15588a c = C15587a.m33511c();
        c.mo29298j((long) dVar.zzac());
        return (C15587a) ((axz) c.mo29832e());
    }

    /* renamed from: a */
    static byte[] m35266a(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArr2;
        int i = z ? 239 : NormalGiftView.ALPHA_255;
        if (bArr.length > i) {
            bArr = m35262a(C15591d.PSN_ENCODE_SIZE_FAIL).mo29580f();
        }
        if (bArr.length < i) {
            byte[] bArr3 = new byte[(i - bArr.length)];
            new SecureRandom().nextBytes(bArr3);
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr3).array();
        } else {
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).array();
        }
        if (z) {
            bArr2 = ByteBuffer.allocate(UnReadVideoExperiment.BROWSE_RECORD_LIST).put(m35265a(bArr2)).put(bArr2).array();
        }
        byte[] bArr4 = new byte[UnReadVideoExperiment.BROWSE_RECORD_LIST];
        for (bdn a : new bdl().f42085cN) {
            a.mo30065a(bArr2, bArr4);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new awd(str.getBytes("UTF-8")).mo29577a(bArr4);
        }
        return bArr4;
    }

    /* renamed from: a */
    public static byte[] m35265a(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] digest;
        synchronized (f41776d) {
            MessageDigest b = m35267b();
            if (b != null) {
                b.reset();
                b.update(bArr);
                digest = f41773a.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }
}
