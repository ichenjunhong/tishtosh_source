package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class bej {

    /* renamed from: a */
    private static Cipher f42193a;

    /* renamed from: b */
    private static final Object f42194b = new Object();

    /* renamed from: c */
    private static final Object f42195c = new Object();

    public bej(SecureRandom secureRandom) {
    }

    /* renamed from: a */
    public final byte[] mo30083a(String str) throws bek {
        try {
            byte[] a = azm.m34871a(str, false);
            if (a.length == 32) {
                byte[] bArr = new byte[16];
                ByteBuffer.wrap(a, 4, 16).get(bArr);
                for (int i = 0; i < 16; i++) {
                    bArr[i] = (byte) (bArr[i] ^ 68);
                }
                return bArr;
            }
            throw new bek(this);
        } catch (IllegalArgumentException e) {
            throw new bek(this, e);
        }
    }

    /* renamed from: a */
    public final String mo30082a(byte[] bArr, byte[] bArr2) throws bek {
        byte[] doFinal;
        byte[] iv;
        if (bArr.length == 16) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f42194b) {
                    m35500a().init(1, secretKeySpec, null);
                    doFinal = m35500a().doFinal(bArr2);
                    iv = m35500a().getIV();
                }
                int length = doFinal.length + iv.length;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.put(iv).put(doFinal);
                allocate.flip();
                byte[] bArr3 = new byte[length];
                allocate.get(bArr3);
                return azm.m34870a(bArr3, false);
            } catch (NoSuchAlgorithmException e) {
                throw new bek(this, e);
            } catch (InvalidKeyException e2) {
                throw new bek(this, e2);
            } catch (IllegalBlockSizeException e3) {
                throw new bek(this, e3);
            } catch (NoSuchPaddingException e4) {
                throw new bek(this, e4);
            } catch (BadPaddingException e5) {
                throw new bek(this, e5);
            }
        } else {
            throw new bek(this);
        }
    }

    /* renamed from: a */
    public final byte[] mo30084a(byte[] bArr, String str) throws bek {
        byte[] doFinal;
        if (bArr.length == 16) {
            try {
                byte[] a = azm.m34871a(str, false);
                if (a.length > 16) {
                    ByteBuffer allocate = ByteBuffer.allocate(a.length);
                    allocate.put(a);
                    allocate.flip();
                    byte[] bArr2 = new byte[16];
                    byte[] bArr3 = new byte[(a.length - 16)];
                    allocate.get(bArr2);
                    allocate.get(bArr3);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    synchronized (f42194b) {
                        m35500a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                        doFinal = m35500a().doFinal(bArr3);
                    }
                    return doFinal;
                }
                throw new bek(this);
            } catch (NoSuchAlgorithmException e) {
                throw new bek(this, e);
            } catch (InvalidKeyException e2) {
                throw new bek(this, e2);
            } catch (IllegalBlockSizeException e3) {
                throw new bek(this, e3);
            } catch (NoSuchPaddingException e4) {
                throw new bek(this, e4);
            } catch (BadPaddingException e5) {
                throw new bek(this, e5);
            } catch (InvalidAlgorithmParameterException e6) {
                throw new bek(this, e6);
            } catch (IllegalArgumentException e7) {
                throw new bek(this, e7);
            }
        } else {
            throw new bek(this);
        }
    }

    /* renamed from: a */
    private static Cipher m35500a() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (f42195c) {
            if (f42193a == null) {
                f42193a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f42193a;
        }
        return cipher;
    }
}
