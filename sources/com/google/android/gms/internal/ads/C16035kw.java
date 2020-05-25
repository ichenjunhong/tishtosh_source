package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.common.internal.safeparcel.C15467a.C15468a;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.kw */
final class C16035kw {

    /* renamed from: a */
    final zzyv f45140a;

    /* renamed from: b */
    final String f45141b;

    /* renamed from: c */
    final int f45142c;

    /* renamed from: a */
    static C16035kw m37980a(String str) throws IOException {
        String[] split = str.split("\u0000");
        if (split.length == 3) {
            Parcel obtain = Parcel.obtain();
            try {
                String str2 = new String(Base64.decode(split[0], 0), "UTF-8");
                int parseInt = Integer.parseInt(split[1]);
                byte[] decode = Base64.decode(split[2], 0);
                obtain.unmarshall(decode, 0, decode.length);
                obtain.setDataPosition(0);
                C16035kw kwVar = new C16035kw((zzyv) zzyv.CREATOR.createFromParcel(obtain), str2, parseInt);
                obtain.recycle();
                return kwVar;
            } catch (C15468a | IllegalArgumentException | IllegalStateException e) {
                C14963ax.m30834d().mo28588a(e, "QueueSeed.decode");
                throw new IOException("Malformed QueueSeed encoding.", e);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        } else {
            throw new IOException("Incorrect field count for QueueSeed.");
        }
    }

    C16035kw(C16031ks ksVar) {
        this(ksVar.f45118b, ksVar.f45119c, ksVar.f45120d);
    }

    private C16035kw(zzyv zzyv, String str, int i) {
        this.f45140a = zzyv;
        this.f45141b = str;
        this.f45142c = i;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo31146a() {
        Parcel obtain = Parcel.obtain();
        try {
            String encodeToString = Base64.encodeToString(this.f45141b.getBytes("UTF-8"), 0);
            String num = Integer.toString(this.f45142c);
            this.f45140a.writeToParcel(obtain, 0);
            String encodeToString2 = Base64.encodeToString(obtain.marshall(), 0);
            StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 2 + String.valueOf(num).length() + String.valueOf(encodeToString2).length());
            sb.append(encodeToString);
            sb.append("\u0000");
            sb.append(num);
            sb.append("\u0000");
            sb.append(encodeToString2);
            String sb2 = sb.toString();
            obtain.recycle();
            return sb2;
        } catch (UnsupportedEncodingException unused) {
            abv.m32794c("QueueSeed encode failed because UTF-8 is not available.");
            obtain.recycle();
            return "";
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
