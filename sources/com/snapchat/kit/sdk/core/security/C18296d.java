package com.snapchat.kit.sdk.core.security;

import android.content.Context;
import android.security.KeyPairGeneratorSpec.Builder;
import android.util.Base64;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStore.PrivateKeyEntry;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.snapchat.kit.sdk.core.security.d */
public final class C18296d implements EncryptDecryptAlgorithm {

    /* renamed from: a */
    private final KeyPair f50508a;

    /* renamed from: com.snapchat.kit.sdk.core.security.d$a */
    public static class C18298a {

        /* renamed from: a */
        String f50509a;

        /* renamed from: b */
        String f50510b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C18298a)) {
                return false;
            }
            C18298a aVar = (C18298a) obj;
            if (!Objects.equals(this.f50509a, aVar.f50509a) || !Objects.equals(this.f50510b, aVar.f50510b)) {
                return false;
            }
            return true;
        }

        private C18298a(String str, String str2) {
            this.f50509a = str;
            this.f50510b = str2;
        }
    }

    /* renamed from: a */
    public final C18298a mo36699a() {
        RSAPublicKey rSAPublicKey = (RSAPublicKey) this.f50508a.getPublic();
        return new C18298a(rSAPublicKey.getModulus().toString(), rSAPublicKey.getPublicExponent().toString());
    }

    public final String decrypt(String str) {
        if (str == null) {
            return null;
        }
        try {
            Cipher instance = Cipher.getInstance("RSA/None/NoPadding");
            instance.init(2, this.f50508a.getPrivate());
            return new String(instance.doFinal(Base64.decode(str, 0)));
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            return null;
        }
    }

    public final String encrypt(String str) {
        if (str == null) {
            return null;
        }
        try {
            Cipher instance = Cipher.getInstance("RSA/None/NoPadding");
            instance.init(1, this.f50508a.getPublic());
            return Base64.encodeToString(instance.doFinal(str.getBytes()), 0);
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            return null;
        }
    }

    public C18296d(KeyStore keyStore, Context context, C18298a aVar) throws NoSuchAlgorithmException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException, KeyStoreException {
        this.f50508a = m44498a(keyStore, context, aVar);
    }

    /* renamed from: a */
    private static KeyPair m44498a(KeyStore keyStore, Context context, C18298a aVar) throws NoSuchAlgorithmException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException, KeyStoreException {
        if (!(aVar == null || aVar.f50509a == null || aVar.f50510b == null || !keyStore.containsAlias("SnapConnectSDK.RSA"))) {
            try {
                return new KeyPair(KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(aVar.f50509a), new BigInteger(aVar.f50510b))), ((PrivateKeyEntry) keyStore.getEntry("SnapConnectSDK.RSA", null)).getPrivateKey());
            } catch (InvalidKeySpecException unused) {
            }
        }
        Calendar instance = Calendar.getInstance();
        Date time = instance.getTime();
        instance.add(1, 1);
        Date time2 = instance.getTime();
        KeyPairGenerator instance2 = KeyPairGenerator.getInstance("RSA", keyStore.getType());
        instance2.initialize(new Builder(context).setAlias("SnapConnectSDK.RSA").setStartDate(time).setEndDate(time2).setSubject(new X500Principal("CN=SnapConnectSDK.RSA")).setSerialNumber(BigInteger.ONE).setKeySize(VideoCacheReadBuffersizeExperiment.DEFAULT).build());
        return instance2.generateKeyPair();
    }
}
