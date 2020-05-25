package com.p683ss.android.deviceregister;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.deviceregister.p1154a.C19005d;
import com.p683ss.android.deviceregister.p1155b.p1156a.C19010a;

/* renamed from: com.ss.android.deviceregister.f */
public class C19037f {

    /* renamed from: a */
    public static C19010a f52411a;

    /* renamed from: b */
    public static Account f52412b;

    /* renamed from: c */
    private static String f52413c;

    /* renamed from: d */
    private static AccountManager f52414d;

    /* renamed from: e */
    private static Account f52415e;

    /* renamed from: a */
    private static boolean m46333a() {
        if (TextUtils.isEmpty(f52413c)) {
            f52413c = C19005d.m46189d();
        }
        return "local_test".equals(f52413c);
    }

    /* renamed from: b */
    public static boolean m46334b(Context context) {
        if (context == null || !m46333a()) {
            return false;
        }
        if (f52415e == null) {
            f52415e = m46335c(context);
        }
        if (f52415e == null || f52414d == null) {
            return false;
        }
        return Boolean.valueOf(f52414d.getUserData(f52415e, "new_user")).booleanValue();
    }

    /* renamed from: c */
    private static Account m46335c(Context context) {
        Account account = null;
        try {
            f52414d = AccountManager.get(context);
            String packageName = context.getPackageName();
            String string = context.getString(context.getApplicationInfo().labelRes);
            if (!TextUtils.isEmpty(string)) {
                if (!TextUtils.isEmpty(packageName)) {
                    Account[] accountsByType = f52414d.getAccountsByType(packageName);
                    int length = accountsByType.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Account account2 = accountsByType[i];
                        if (account2 != null && string.equals(account2.name)) {
                            account = account2;
                            break;
                        }
                        i++;
                    }
                    return account;
                }
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:10|(3:12|13|14)|15|16|(2:18|(1:20))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p683ss.android.deviceregister.p1155b.p1156a.C19010a m46331a(android.content.Context r6) throws java.lang.IllegalArgumentException {
        /*
            boolean r0 = com.p683ss.android.deviceregister.C19034d.f52406b
            if (r0 == 0) goto L_0x005e
            com.ss.android.deviceregister.b.a.a r0 = f52411a
            if (r0 != 0) goto L_0x005b
            java.lang.Class<com.ss.android.deviceregister.f> r0 = com.p683ss.android.deviceregister.C19037f.class
            monitor-enter(r0)
            com.ss.android.deviceregister.b.a.a r1 = f52411a     // Catch:{ all -> 0x0058 }
            if (r1 != 0) goto L_0x0056
            if (r6 == 0) goto L_0x004e
            boolean r1 = m46334b(r6)     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x0035
            java.lang.String r1 = "com.ss.android.deviceregister.newuser.DeviceParamsProvider"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0035 }
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0035 }
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x0035 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r3)     // Catch:{ Exception -> 0x0035 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0035 }
            r2[r5] = r6     // Catch:{ Exception -> 0x0035 }
            java.lang.Object r1 = r1.newInstance(r2)     // Catch:{ Exception -> 0x0035 }
            com.ss.android.deviceregister.b.a.a r1 = (com.p683ss.android.deviceregister.p1155b.p1156a.C19010a) r1     // Catch:{ Exception -> 0x0035 }
            f52411a = r1     // Catch:{ Exception -> 0x0035 }
        L_0x0035:
            com.ss.android.deviceregister.b.a.a r1 = f52411a     // Catch:{ all -> 0x0058 }
            if (r1 != 0) goto L_0x0056
            com.ss.android.deviceregister.c r1 = new com.ss.android.deviceregister.c     // Catch:{ all -> 0x0058 }
            r1.<init>(r6)     // Catch:{ all -> 0x0058 }
            f52411a = r1     // Catch:{ all -> 0x0058 }
            android.accounts.Account r6 = f52412b     // Catch:{ all -> 0x0058 }
            if (r6 == 0) goto L_0x0056
            com.ss.android.deviceregister.b.a.a r6 = f52411a     // Catch:{ all -> 0x0058 }
            com.ss.android.deviceregister.c r6 = (com.p683ss.android.deviceregister.C19029c) r6     // Catch:{ all -> 0x0058 }
            android.accounts.Account r1 = f52412b     // Catch:{ all -> 0x0058 }
            r6.mo38891a(r1)     // Catch:{ all -> 0x0058 }
            goto L_0x0056
        L_0x004e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0058 }
            java.lang.String r1 = "context == null"
            r6.<init>(r1)     // Catch:{ all -> 0x0058 }
            throw r6     // Catch:{ all -> 0x0058 }
        L_0x0056:
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            goto L_0x005b
        L_0x0058:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            throw r6
        L_0x005b:
            com.ss.android.deviceregister.b.a.a r6 = f52411a
            return r6
        L_0x005e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "please init TeaAgent first"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.deviceregister.C19037f.m46331a(android.content.Context):com.ss.android.deviceregister.b.a.a");
    }

    /* renamed from: a */
    public static void m46332a(Context context, boolean z) {
        if (context != null && m46333a()) {
            if (f52415e == null) {
                f52415e = m46335c(context);
            }
            if (f52415e != null && f52414d != null) {
                try {
                    f52414d.setUserData(f52415e, "new_user", String.valueOf(z));
                } catch (Exception unused) {
                }
            }
        }
    }
}
