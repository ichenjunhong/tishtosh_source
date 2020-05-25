package com.google.android.gms.internal.ads;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class auu {

    /* renamed from: a */
    private ECPublicKey f41387a;

    public auu(ECPublicKey eCPublicKey) {
        this.f41387a = eCPublicKey;
    }

    /* renamed from: a */
    public final auv mo29557a(String str, byte[] bArr, byte[] bArr2, int i, avb avb) throws GeneralSecurityException {
        byte[] bArr3;
        KeyPair a = auy.m34200a(this.f41387a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) a.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) a.getPrivate();
        ECPublicKey eCPublicKey2 = this.f41387a;
        try {
            ECParameterSpec params = eCPublicKey2.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (!params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            byte[] a2 = auy.m34204a(eCPrivateKey, eCPublicKey2.getW());
            EllipticCurve curve = eCPublicKey.getParams().getCurve();
            ECPoint w = eCPublicKey.getW();
            auy.m34203a(w, curve);
            int bitLength = (auy.m34199a(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
            int i2 = 1;
            switch (auz.f41399a[avb.ordinal()]) {
                case 1:
                    int i3 = (bitLength * 2) + 1;
                    bArr3 = new byte[i3];
                    byte[] byteArray = w.getAffineX().toByteArray();
                    byte[] byteArray2 = w.getAffineY().toByteArray();
                    System.arraycopy(byteArray2, 0, bArr3, i3 - byteArray2.length, byteArray2.length);
                    System.arraycopy(byteArray, 0, bArr3, (bitLength + 1) - byteArray.length, byteArray.length);
                    bArr3[0] = 4;
                    break;
                case 2:
                    int i4 = bitLength * 2;
                    bArr3 = new byte[i4];
                    byte[] byteArray3 = w.getAffineX().toByteArray();
                    if (byteArray3.length > bitLength) {
                        byteArray3 = Arrays.copyOfRange(byteArray3, byteArray3.length - bitLength, byteArray3.length);
                    }
                    byte[] byteArray4 = w.getAffineY().toByteArray();
                    if (byteArray4.length > bitLength) {
                        byteArray4 = Arrays.copyOfRange(byteArray4, byteArray4.length - bitLength, byteArray4.length);
                    }
                    System.arraycopy(byteArray4, 0, bArr3, i4 - byteArray4.length, byteArray4.length);
                    System.arraycopy(byteArray3, 0, bArr3, bitLength - byteArray3.length, byteArray3.length);
                    break;
                case 3:
                    int i5 = bitLength + 1;
                    byte[] bArr4 = new byte[i5];
                    byte[] byteArray5 = w.getAffineX().toByteArray();
                    System.arraycopy(byteArray5, 0, bArr4, i5 - byteArray5.length, byteArray5.length);
                    bArr4[0] = (byte) (w.getAffineY().testBit(0) ? 3 : 2);
                    bArr3 = bArr4;
                    break;
                default:
                    String valueOf = String.valueOf(avb);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
                    sb.append("invalid format:");
                    sb.append(valueOf);
                    throw new GeneralSecurityException(sb.toString());
            }
            byte[] a3 = aul.m34176a(bArr3, a2);
            Mac mac = (Mac) avd.f41421b.mo29568a(str);
            if (i <= mac.getMacLength() * NormalGiftView.ALPHA_255) {
                if (bArr == null || bArr.length == 0) {
                    mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
                } else {
                    mac.init(new SecretKeySpec(bArr, str));
                }
                byte[] doFinal = mac.doFinal(a3);
                byte[] bArr5 = new byte[i];
                mac.init(new SecretKeySpec(doFinal, str));
                byte[] bArr6 = new byte[0];
                int i6 = 0;
                while (true) {
                    mac.update(bArr6);
                    mac.update(bArr2);
                    mac.update((byte) i2);
                    bArr6 = mac.doFinal();
                    if (bArr6.length + i6 < i) {
                        System.arraycopy(bArr6, 0, bArr5, i6, bArr6.length);
                        i6 += bArr6.length;
                        i2++;
                    } else {
                        System.arraycopy(bArr6, 0, bArr5, i6, i - i6);
                        return new auv(bArr3, bArr5);
                    }
                }
            } else {
                throw new GeneralSecurityException("size too large");
            }
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new GeneralSecurityException(e.toString());
        }
    }
}
