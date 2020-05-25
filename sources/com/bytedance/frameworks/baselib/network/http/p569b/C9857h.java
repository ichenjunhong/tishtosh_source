package com.bytedance.frameworks.baselib.network.http.p569b;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: com.bytedance.frameworks.baselib.network.http.b.h */
public class C9857h implements Serializable {

    /* renamed from: a */
    private static final String f26834a = "h";
    private static final long serialVersionUID = 6374381323722046732L;

    /* renamed from: b */
    private transient C9849e f26835b;

    /* renamed from: c */
    private long f26836c = System.currentTimeMillis();

    public C9849e getHttpCookie() {
        return this.f26835b;
    }

    public Long getWhenCreated() {
        return Long.valueOf(this.f26836c);
    }

    public int hashCode() {
        return this.f26835b.hashCode();
    }

    public String encode() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(this);
            return m19720a(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            return null;
        }
    }

    public boolean hasExpired() {
        long j = this.f26835b.f26805e;
        if (j != -1 && (System.currentTimeMillis() - this.f26836c) / 1000 > j) {
            return true;
        }
        return false;
    }

    public C9857h(C9849e eVar) {
        this.f26835b = eVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9849e) {
            return this.f26835b.equals(obj);
        }
        if (obj instanceof C9857h) {
            return this.f26835b.equals(((C9857h) obj).f26835b);
        }
        return false;
    }

    /* renamed from: a */
    private static String m19720a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            byte b2 = b & 255;
            if (b2 < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(b2));
        }
        return sb.toString();
    }

    public static C9857h decode(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        try {
            return (C9857h) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
        } catch (IOException | ClassNotFoundException unused) {
            return null;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.f26835b.f26806f);
        objectOutputStream.writeObject(this.f26835b.f26811k);
        objectOutputStream.writeObject(this.f26835b.f26801a);
        objectOutputStream.writeObject(this.f26835b.f26802b);
        objectOutputStream.writeObject(this.f26835b.f26804d);
        objectOutputStream.writeLong(this.f26835b.f26805e);
        objectOutputStream.writeObject(this.f26835b.f26807g);
        objectOutputStream.writeObject(this.f26835b.f26808h);
        objectOutputStream.writeInt(this.f26835b.f26812l);
        objectOutputStream.writeBoolean(this.f26835b.f26809i);
        objectOutputStream.writeBoolean(this.f26835b.f26803c);
        objectOutputStream.writeBoolean(this.f26835b.f26810j);
        objectOutputStream.writeLong(this.f26836c);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f26835b = new C9849e((String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        this.f26835b.f26801a = (String) objectInputStream.readObject();
        this.f26835b.f26802b = (String) objectInputStream.readObject();
        this.f26835b.mo17684a((String) objectInputStream.readObject());
        this.f26835b.f26805e = objectInputStream.readLong();
        this.f26835b.f26807g = (String) objectInputStream.readObject();
        this.f26835b.f26808h = (String) objectInputStream.readObject();
        C9849e eVar = this.f26835b;
        int readInt = objectInputStream.readInt();
        if (readInt == 0 || readInt == 1) {
            eVar.f26812l = readInt;
            this.f26835b.f26809i = objectInputStream.readBoolean();
            this.f26835b.f26803c = objectInputStream.readBoolean();
            this.f26835b.f26810j = objectInputStream.readBoolean();
            this.f26836c = objectInputStream.readLong();
            return;
        }
        StringBuilder sb = new StringBuilder("Bad version: ");
        sb.append(readInt);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int getEffectivePort(String str, int i) {
        if (i != -1) {
            return i;
        }
        if (WebKitApi.SCHEME_HTTP.equalsIgnoreCase(str)) {
            return 80;
        }
        if (WebKitApi.SCHEME_HTTPS.equalsIgnoreCase(str)) {
            return 443;
        }
        return -1;
    }
}
