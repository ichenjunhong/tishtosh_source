package com.linecorp.p1083a.p1084a.p1085a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.Base64;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.linecorp.a.a.a.b */
public final class C18188b {

    /* renamed from: a */
    private final Object f50214a = new Object();

    /* renamed from: b */
    private final String f50215b;

    /* renamed from: c */
    private final int f50216c;

    /* renamed from: d */
    private final SecureRandom f50217d;

    /* renamed from: e */
    private final SecretKeyFactory f50218e;

    /* renamed from: f */
    private final Cipher f50219f;

    /* renamed from: g */
    private final Mac f50220g;

    /* renamed from: h */
    private C18189a f50221h;

    /* renamed from: com.linecorp.a.a.a.b$a */
    static class C18189a {

        /* renamed from: a */
        final SecretKey f50222a;

        /* renamed from: b */
        final SecretKey f50223b;

        C18189a(SecretKey secretKey, SecretKey secretKey2) {
            this.f50222a = secretKey;
            this.f50223b = secretKey2;
        }
    }

    /* renamed from: a */
    public final void mo36243a(Context context) {
        synchronized (this.f50214a) {
            if (this.f50221h == null) {
                this.f50221h = m44385b(context);
            }
        }
    }

    public C18188b(String str) {
        this.f50215b = str;
        this.f50216c = 5000;
        try {
            this.f50217d = new SecureRandom();
            this.f50218e = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            this.f50219f = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f50220g = Mac.getInstance("HmacSHA256");
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private C18189a m44385b(Context context) {
        byte[] bArr;
        String string = Secure.getString(context.getContentResolver(), "android_id");
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MODEL);
        sb.append(Build.MANUFACTURER);
        sb.append(Build.SERIAL);
        sb.append(string);
        sb.append(context.getPackageName());
        String sb2 = sb.toString();
        SharedPreferences a = C35807d.m80935a(context, this.f50215b, 0);
        String string2 = a.getString("salt", null);
        if (!TextUtils.isEmpty(string2)) {
            bArr = Base64.decode(string2, 0);
        } else {
            byte[] bArr2 = new byte[16];
            this.f50217d.nextBytes(bArr2);
            a.edit().putString("salt", Base64.encodeToString(bArr2, 0)).apply();
            bArr = bArr2;
        }
        try {
            byte[] encoded = this.f50218e.generateSecret(new PBEKeySpec(sb2.toCharArray(), bArr, this.f50216c, UnReadVideoExperiment.LIKE_USER_LIST)).getEncoded();
            return new C18189a(new SecretKeySpec(Arrays.copyOfRange(encoded, 0, 32), "AES"), new SecretKeySpec(Arrays.copyOfRange(encoded, 32, encoded.length), "HmacSHA256"));
        } catch (InvalidKeySpecException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final String mo36242a(Context context, String str) {
        String encodeToString;
        synchronized (this.f50214a) {
            mo36243a(context);
            try {
                byte[] bArr = new byte[this.f50219f.getBlockSize()];
                this.f50217d.nextBytes(bArr);
                this.f50219f.init(1, this.f50221h.f50222a, new IvParameterSpec(bArr));
                byte[] doFinal = this.f50219f.doFinal(str.getBytes("UTF-8"));
                byte[] bArr2 = new byte[(bArr.length + doFinal.length + 32)];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                int length = bArr.length + 0;
                System.arraycopy(doFinal, 0, bArr2, length, doFinal.length);
                this.f50220g.init(this.f50221h.f50223b);
                this.f50220g.update(bArr2, 0, bArr.length + doFinal.length);
                byte[] doFinal2 = this.f50220g.doFinal();
                System.arraycopy(doFinal2, 0, bArr2, length + doFinal.length, doFinal2.length);
                encodeToString = Base64.encodeToString(bArr2, 0);
            } catch (BadPaddingException e) {
                throw new C18187a((Throwable) e);
            } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | IllegalBlockSizeException e2) {
                throw new RuntimeException(e2);
            }
        }
        return encodeToString;
    }
}
