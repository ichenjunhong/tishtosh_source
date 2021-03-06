package com.p683ss.android.message.p1191b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.PowerManager.WakeLock;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.message.C19408a;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.msgpack.C53798c;
import org.msgpack.packer.Packer;
import org.msgpack.template.AbstractTemplate;
import org.msgpack.template.Templates;
import org.msgpack.unpacker.Unpacker;

/* renamed from: com.ss.android.message.b.g */
public final class C19464g {

    /* renamed from: a */
    public static WakeLock f53789a;

    /* renamed from: com.ss.android.message.b.g$a */
    public static class C19465a {

        /* renamed from: a */
        public Map<String, Object> f53790a = new HashMap();
    }

    /* renamed from: com.ss.android.message.b.g$b */
    public static class C19466b extends AbstractTemplate<C19465a> {
        public final /* synthetic */ Object read(Unpacker unpacker, Object obj, boolean z) throws IOException {
            return m47643a(unpacker, (C19465a) obj, z);
        }

        /* renamed from: a */
        private static C19465a m47643a(Unpacker unpacker, C19465a aVar, boolean z) throws IOException {
            if (!z && unpacker.trySkipNil()) {
                return null;
            }
            if (aVar == null) {
                aVar = new C19465a();
            }
            int readMapBegin = unpacker.readMapBegin();
            aVar.f53790a = new HashMap();
            for (int i = 0; i < readMapBegin; i++) {
                try {
                    aVar.f53790a.put((String) unpacker.read(Templates.TString), C19464g.m47633a(unpacker.readValue()));
                } catch (UnsupportedOperationException | C53798c unused) {
                }
            }
            unpacker.readMapEnd();
            return aVar;
        }

        public final /* synthetic */ void write(Packer packer, Object obj, boolean z) throws IOException {
            C19465a aVar = (C19465a) obj;
            if (aVar != null) {
                packer.writeMapBegin(aVar.f53790a.size());
                for (Entry entry : aVar.f53790a.entrySet()) {
                    packer.write((String) entry.getKey());
                    packer.write(entry.getValue());
                }
                packer.writeMapEnd();
            } else if (!z) {
                packer.writeNil();
            } else {
                throw new NullPointerException();
            }
        }
    }

    /* renamed from: c */
    public static boolean m47642c() {
        if (22 == VERSION.SDK_INT) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m47634a() {
        if (f53789a != null) {
            f53789a.release();
            f53789a = null;
        }
    }

    /* renamed from: b */
    public static boolean m47640b() {
        String str = Build.BRAND;
        if (!TextUtils.isEmpty(str) && str.toLowerCase().contains("vivo")) {
            return true;
        }
        String str2 = Build.MODEL;
        if (!TextUtils.isEmpty(str2) && str2.toLowerCase().contains("vivo")) {
            return true;
        }
        String str3 = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str3) || !str3.toLowerCase().contains("vivo")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static RemoteException m47632a(String str) {
        RemoteException remoteException = new RemoteException();
        remoteException.initCause(new Throwable(str));
        return remoteException;
    }

    /* renamed from: a */
    public static int m47631a(byte[] bArr) {
        if (bArr == null || bArr.length > 4) {
            return DynamicTabYellowPointVersion.DEFAULT;
        }
        int length = bArr.length;
        byte b = 0;
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                b = bArr[0] & 255;
            } else if (i == 1) {
                b |= (bArr[1] << 8) & 65280;
            } else if (i == 2) {
                b |= (bArr[2] << 16) & 16711680;
            } else if (i == 3) {
                b |= (bArr[3] << 24) & -16777216;
            }
        }
        return b;
    }

    /* renamed from: b */
    public static boolean m47641b(String str) {
        if (C9431p.m18664a(str) || str.equalsIgnoreCase("unknown")) {
            return true;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = true;
                break;
            } else if (str.charAt(i) != '0') {
                break;
            } else {
                i++;
            }
        }
        return z;
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: used method not loaded: org.msgpack.unpacker.AbstractUnpacker.read(org.msgpack.template.Template):null, types can be incorrect */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:25|26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r3 = r0.read((org.msgpack.template.Template) org.msgpack.template.Templates.TLong);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0044, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0047, code lost:
        return r3;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x003e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m47633a(org.msgpack.type.Value r3) throws java.io.IOException, java.lang.UnsupportedOperationException, org.msgpack.C53798c {
        /*
            org.msgpack.unpacker.Converter r0 = new org.msgpack.unpacker.Converter
            r0.<init>(r3)
            boolean r1 = r3.isNilValue()     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x0010
            r0.close()
            r3 = 0
            return r3
        L_0x0010:
            boolean r1 = r3.isRawValue()     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x001e
            byte[] r3 = r0.readByteArray()     // Catch:{ all -> 0x009b }
            r0.close()
            return r3
        L_0x001e:
            boolean r1 = r3.isBooleanValue()     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x002e
            org.msgpack.template.Template<java.lang.Boolean> r3 = org.msgpack.template.Templates.TBoolean     // Catch:{ all -> 0x009b }
            java.lang.Object r3 = r0.read(r3)     // Catch:{ all -> 0x009b }
            r0.close()
            return r3
        L_0x002e:
            boolean r1 = r3.isIntegerValue()     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x0048
            org.msgpack.template.Template<java.lang.Integer> r3 = org.msgpack.template.Templates.TInteger     // Catch:{ c -> 0x003e }
            java.lang.Object r3 = r0.read(r3)     // Catch:{ c -> 0x003e }
            r0.close()
            return r3
        L_0x003e:
            org.msgpack.template.Template<java.lang.Long> r3 = org.msgpack.template.Templates.TLong     // Catch:{ all -> 0x009b }
            java.lang.Object r3 = r0.read(r3)     // Catch:{ all -> 0x009b }
            r0.close()
            return r3
        L_0x0048:
            boolean r1 = r3.isFloatValue()     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x0058
            org.msgpack.template.Template<java.lang.Double> r3 = org.msgpack.template.Templates.TDouble     // Catch:{ all -> 0x009b }
            java.lang.Object r3 = r0.read(r3)     // Catch:{ all -> 0x009b }
            r0.close()
            return r3
        L_0x0058:
            boolean r1 = r3.isArrayValue()     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x0087
            org.msgpack.type.ArrayValue r3 = r3.asArrayValue()     // Catch:{ all -> 0x009b }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x009b }
            int r2 = r3.size()     // Catch:{ all -> 0x009b }
            r1.<init>(r2)     // Catch:{ all -> 0x009b }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x009b }
        L_0x006f:
            boolean r2 = r3.hasNext()     // Catch:{ all -> 0x009b }
            if (r2 == 0) goto L_0x0083
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x009b }
            org.msgpack.type.Value r2 = (org.msgpack.type.Value) r2     // Catch:{ all -> 0x009b }
            java.lang.Object r2 = m47633a(r2)     // Catch:{ all -> 0x009b }
            r1.add(r2)     // Catch:{ all -> 0x009b }
            goto L_0x006f
        L_0x0083:
            r0.close()
            return r1
        L_0x0087:
            boolean r3 = r3.isMapValue()     // Catch:{ all -> 0x009b }
            if (r3 == 0) goto L_0x0093
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x009b }
            r3.<init>()     // Catch:{ all -> 0x009b }
            throw r3     // Catch:{ all -> 0x009b }
        L_0x0093:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x009b }
            java.lang.String r1 = "fatal error"
            r3.<init>(r1)     // Catch:{ all -> 0x009b }
            throw r3     // Catch:{ all -> 0x009b }
        L_0x009b:
            r3 = move-exception
            r0.close()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.message.p1191b.C19464g.m47633a(org.msgpack.type.Value):java.lang.Object");
    }

    /* renamed from: a */
    private static boolean m47637a(Context context) {
        if (VERSION.SDK_INT < 26 || C19408a.m47502b() < 26) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m47635a(Context context, Intent intent) {
        m47636a(context, intent, true);
    }

    /* renamed from: a */
    public static byte[] m47638a(int i, int i2) {
        if (i2 <= 0 || i2 > 4) {
            return null;
        }
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == 0) {
                bArr[0] = (byte) (i & NormalGiftView.ALPHA_255);
            } else if (i3 == 1) {
                bArr[1] = (byte) ((65280 & i) >> 8);
            } else if (i3 == 2) {
                bArr[2] = (byte) ((16711680 & i) >> 16);
            } else {
                bArr[3] = (byte) ((-16777216 & i) >> 24);
            }
        }
        return bArr;
    }

    /* renamed from: a */
    private static void m47636a(Context context, Intent intent, boolean z) {
        try {
            if (m47637a(context)) {
                List queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                if (queryIntentServices != null) {
                    String str = ((ResolveInfo) queryIntentServices.get(0)).serviceInfo.name;
                    if (!C9431p.m18664a(str)) {
                        intent.setComponent(new ComponentName(context, str));
                        C19467h.m47645a(context.getApplicationContext(), intent, new C19463f(intent, true, context.getApplicationContext()), 1);
                        return;
                    }
                }
            }
            C19467h.m47644a(context, intent);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static byte[] m47639a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}
