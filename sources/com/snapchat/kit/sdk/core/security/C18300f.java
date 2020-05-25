package com.snapchat.kit.sdk.core.security;

import android.security.keystore.KeyGenParameterSpec.Builder;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStore.SecretKeyEntry;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import javax.crypto.KeyGenerator;

/* renamed from: com.snapchat.kit.sdk.core.security.f */
public final class C18300f {
    /* renamed from: a */
    public static C18299e m44500a(KeyStore keyStore) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        try {
            if (keyStore.containsAlias("SnapConnectSDK.AES")) {
                return new C18299e(((SecretKeyEntry) keyStore.getEntry("SnapConnectSDK.AES", null)).getSecretKey(), false);
            }
        } catch (KeyStoreException | UnrecoverableEntryException unused) {
        }
        KeyGenerator instance = KeyGenerator.getInstance("AES", keyStore.getType());
        instance.init(new Builder("SnapConnectSDK.AES", 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(UnReadVideoExperiment.BROWSE_RECORD_LIST).build());
        return new C18299e(instance.generateKey(), true);
    }
}
