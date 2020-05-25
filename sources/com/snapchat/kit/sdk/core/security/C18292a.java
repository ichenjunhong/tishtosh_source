package com.snapchat.kit.sdk.core.security;

import android.util.Base64;
import com.google.gson.C17971f;
import com.google.gson.C18086p;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: com.snapchat.kit.sdk.core.security.a */
public final class C18292a implements EncryptDecryptAlgorithm {

    /* renamed from: a */
    private final SecretKey f50503a;

    /* renamed from: b */
    private final C17971f f50504b;

    /* renamed from: com.snapchat.kit.sdk.core.security.a$a */
    static class C18293a {

        /* renamed from: a */
        String f50505a;

        /* renamed from: b */
        String f50506b;

        C18293a(String str, String str2) {
            this.f50505a = str;
            this.f50506b = str2;
        }
    }

    public final String encrypt(String str) {
        if (str == null) {
            return null;
        }
        try {
            C17971f fVar = this.f50504b;
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.f50503a);
            return fVar.mo34889b(new C18293a(Base64.encodeToString(instance.getIV(), 0), Base64.encodeToString(instance.doFinal(str.getBytes()), 0)));
        } catch (C18086p | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            return null;
        }
    }

    public final String decrypt(String str) {
        C18293a aVar;
        try {
            aVar = (C18293a) this.f50504b.mo34884a(str, C18293a.class);
        } catch (C18086p unused) {
            aVar = null;
        }
        if (aVar == null || aVar.f50506b == null || aVar.f50505a == null) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(aVar.f50505a, 0);
            byte[] decode2 = Base64.decode(aVar.f50506b, 0);
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, this.f50503a, new GCMParameterSpec(128, decode));
            return new String(instance.doFinal(decode2));
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused2) {
            return null;
        }
    }

    public C18292a(SecretKey secretKey, C17971f fVar) {
        this.f50503a = secretKey;
        this.f50504b = fVar;
    }
}
