package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C14457k;
import com.facebook.C14529m;
import com.facebook.C14533n;
import com.facebook.login.C14503a;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.internal.v */
public final class C14353v {

    /* renamed from: a */
    public static final List<C14359e> f37345a = m29446c();

    /* renamed from: b */
    public static final AtomicBoolean f37346b = new AtomicBoolean(false);

    /* renamed from: c */
    private static final String f37347c = "com.facebook.internal.v";

    /* renamed from: d */
    private static final List<C14359e> f37348d;

    /* renamed from: e */
    private static final Map<String, List<C14359e>> f37349e;

    /* renamed from: f */
    private static final List<Integer> f37350f = Arrays.asList(new Integer[]{Integer.valueOf(20170417), Integer.valueOf(20160327), Integer.valueOf(20141218), Integer.valueOf(20141107), Integer.valueOf(20141028), Integer.valueOf(20141001), Integer.valueOf(20140701), Integer.valueOf(20140324), Integer.valueOf(20140204), Integer.valueOf(20131107), Integer.valueOf(20130618), Integer.valueOf(20130502), Integer.valueOf(20121101)});

    /* renamed from: com.facebook.internal.v$a */
    static class C14355a extends C14359e {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final String mo26553a() {
            return "com.facebook.arstudio.player";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final String mo26554b() {
            return null;
        }

        private C14355a() {
            super();
        }
    }

    /* renamed from: com.facebook.internal.v$b */
    static class C14356b extends C14359e {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final String mo26553a() {
            return "com.facebook.lite";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final String mo26554b() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        private C14356b() {
            super();
        }
    }

    /* renamed from: com.facebook.internal.v$c */
    static class C14357c extends C14359e {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final String mo26553a() {
            return "com.facebook.katana";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final String mo26554b() {
            return "com.facebook.katana.ProxyAuth";
        }

        private C14357c() {
            super();
        }
    }

    /* renamed from: com.facebook.internal.v$d */
    static class C14358d extends C14359e {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final String mo26553a() {
            return "com.facebook.orca";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final String mo26554b() {
            return null;
        }

        private C14358d() {
            super();
        }
    }

    /* renamed from: com.facebook.internal.v$e */
    static abstract class C14359e {

        /* renamed from: a */
        private TreeSet<Integer> f37351a;

        private C14359e() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract String mo26553a();

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract String mo26554b();

        /* renamed from: c */
        public final TreeSet<Integer> mo26556c() {
            if (this.f37351a == null || this.f37351a.isEmpty()) {
                mo26555a(false);
            }
            return this.f37351a;
        }

        /* renamed from: a */
        public final synchronized void mo26555a(boolean z) {
            if (!z) {
                try {
                    if (this.f37351a != null) {
                        if (this.f37351a.isEmpty()) {
                        }
                    }
                } finally {
                }
            }
            this.f37351a = C14353v.m29439a(this);
        }
    }

    /* renamed from: com.facebook.internal.v$f */
    public static class C14360f {

        /* renamed from: a */
        public C14359e f37352a;

        /* renamed from: b */
        public int f37353b;

        private C14360f() {
        }

        /* renamed from: a */
        public static C14360f m29461a() {
            C14360f fVar = new C14360f();
            fVar.f37353b = -1;
            return fVar;
        }

        /* renamed from: a */
        public static C14360f m29462a(C14359e eVar, int i) {
            C14360f fVar = new C14360f();
            fVar.f37352a = eVar;
            fVar.f37353b = i;
            return fVar;
        }
    }

    /* renamed from: com.facebook.internal.v$g */
    static class C14361g extends C14359e {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final String mo26553a() {
            return "com.facebook.wakizashi";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final String mo26554b() {
            return "com.facebook.katana.ProxyAuth";
        }

        private C14361g() {
            super();
        }
    }

    /* renamed from: a */
    public static boolean m29441a(int i) {
        return f37350f.contains(Integer.valueOf(i)) && i >= 20140701;
    }

    /* renamed from: a */
    public static void m29440a(Intent intent, String str, String str2, int i, Bundle bundle) {
        String k = C14533n.m29777k();
        String l = C14533n.m29778l();
        intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", k);
        if (m29441a(i)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", str);
            C14277aa.m29265a(bundle2, "app_name", l);
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle);
            return;
        }
        intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
        if (!C14277aa.m29276a(l)) {
            intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", l);
        }
        intent.putExtras(bundle);
    }

    /* renamed from: a */
    public static C14457k m29438a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_type");
        if (string == null) {
            string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        }
        String string2 = bundle.getString("error_description");
        if (string2 == null) {
            string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        }
        if (string == null || !string.equalsIgnoreCase("UserCanceled")) {
            return new C14457k(string2);
        }
        return new C14529m(string2);
    }

    /* renamed from: a */
    public static Bundle m29435a(C14457k kVar) {
        if (kVar == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("error_description", kVar.toString());
        if (kVar instanceof C14529m) {
            bundle.putString("error_type", "UserCanceled");
        }
        return bundle;
    }

    /* renamed from: a */
    public static C14360f m29436a(String str, int[] iArr) {
        return m29437a((List) f37349e.get(str), iArr);
    }

    /* renamed from: a */
    public static C14360f m29437a(List<C14359e> list, int[] iArr) {
        m29444b();
        if (list == null) {
            return C14360f.m29461a();
        }
        for (C14359e eVar : list) {
            int a = m29428a(eVar.mo26556c(), m29426a(), iArr);
            if (a != -1) {
                return C14360f.m29462a(eVar, a);
            }
        }
        return C14360f.m29461a();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static TreeSet<Integer> m29439a(C14359e eVar) {
        ProviderInfo providerInfo;
        TreeSet<Integer> treeSet = new TreeSet<>();
        ContentResolver contentResolver = C14533n.m29773g().getContentResolver();
        String[] strArr = {C42311c.f106863g};
        StringBuilder sb = new StringBuilder("content://");
        sb.append(eVar.mo26553a());
        sb.append(".provider.PlatformProvider/versions");
        Uri parse = Uri.parse(sb.toString());
        Cursor cursor = null;
        try {
            PackageManager packageManager = C14533n.m29773g().getPackageManager();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(eVar.mo26553a());
            sb2.append(".provider.PlatformProvider");
            try {
                providerInfo = packageManager.resolveContentProvider(sb2.toString(), 0);
            } catch (RuntimeException unused) {
                providerInfo = null;
            }
            if (providerInfo != null) {
                try {
                    cursor = contentResolver.query(parse, strArr, null, null, null);
                } catch (IllegalArgumentException | NullPointerException | SecurityException unused2) {
                }
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        treeSet.add(Integer.valueOf(cursor.getInt(cursor.getColumnIndex(C42311c.f106863g))));
                    }
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return treeSet;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static final int m29426a() {
        return ((Integer) f37350f.get(0)).intValue();
    }

    /* renamed from: b */
    public static void m29444b() {
        if (f37346b.compareAndSet(false, true)) {
            C14533n.m29771e().execute(new Runnable() {
                public final void run() {
                    try {
                        for (C14359e a : C14353v.f37345a) {
                            a.mo26555a(true);
                        }
                    } finally {
                        C14353v.f37346b.set(false);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    private static List<C14359e> m29446c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C14357c());
        arrayList.add(new C14361g());
        return arrayList;
    }

    static {
        ArrayList arrayList = new ArrayList(m29446c());
        arrayList.add(0, new C14355a());
        f37348d = arrayList;
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C14358d());
        hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", f37345a);
        hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", f37345a);
        hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", f37345a);
        hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", f37345a);
        hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList2);
        hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList2);
        hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f37348d);
        hashMap.put("com.facebook.platform.action.request.SHARE_STORY", f37345a);
        f37349e = hashMap;
    }

    /* renamed from: a */
    public static int m29427a(Intent intent) {
        return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
    }

    /* renamed from: c */
    public static Bundle m29445c(Intent intent) {
        if (!m29441a(m29427a(intent))) {
            return null;
        }
        return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
    }

    /* renamed from: d */
    public static Bundle m29447d(Intent intent) {
        if (!m29441a(m29427a(intent))) {
            return intent.getExtras();
        }
        return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
    }

    /* renamed from: e */
    public static boolean m29448e(Intent intent) {
        Bundle c = m29445c(intent);
        if (c != null) {
            return c.containsKey("error");
        }
        return intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
    }

    /* renamed from: a */
    public static Intent m29429a(Context context) {
        Intent intent;
        Iterator it = f37345a.iterator();
        do {
            intent = null;
            if (!it.hasNext()) {
                return null;
            }
            Intent addCategory = new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(((C14359e) it.next()).mo26553a()).addCategory("android.intent.category.DEFAULT");
            if (addCategory != null) {
                ResolveInfo resolveService = context.getPackageManager().resolveService(addCategory, 0);
                if (resolveService != null && C14324k.m29377a(context, resolveService.serviceInfo.packageName)) {
                    intent = addCategory;
                    continue;
                }
            }
        } while (intent == null);
        return intent;
    }

    /* renamed from: b */
    public static UUID m29443b(Intent intent) {
        String str;
        UUID uuid;
        if (intent == null) {
            return null;
        }
        if (m29441a(m29427a(intent))) {
            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            if (bundleExtra != null) {
                str = bundleExtra.getString("action_id");
            } else {
                str = null;
            }
        } else {
            str = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        }
        if (str != null) {
            try {
                uuid = UUID.fromString(str);
            } catch (IllegalArgumentException unused) {
            }
            return uuid;
        }
        uuid = null;
        return uuid;
    }

    /* renamed from: a */
    private static Intent m29430a(Context context, Intent intent, C14359e eVar) {
        if (intent == null) {
            return null;
        }
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
        if (resolveActivity != null && C14324k.m29377a(context, resolveActivity.activityInfo.packageName)) {
            return intent;
        }
        return null;
    }

    /* renamed from: a */
    private static int m29428a(TreeSet<Integer> treeSet, int i, int[] iArr) {
        int length = iArr.length - 1;
        Iterator descendingIterator = treeSet.descendingIterator();
        int i2 = length;
        int i3 = -1;
        while (descendingIterator.hasNext()) {
            int intValue = ((Integer) descendingIterator.next()).intValue();
            i3 = Math.max(i3, intValue);
            while (i2 >= 0 && iArr[i2] > intValue) {
                i2--;
            }
            if (i2 < 0) {
                return -1;
            }
            if (iArr[i2] == intValue) {
                if (i2 % 2 == 0) {
                    return Math.min(i3, i);
                }
                return -1;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static Intent m29433a(Intent intent, Bundle bundle, C14457k kVar) {
        UUID b = m29443b(intent);
        if (b == null) {
            return null;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m29427a(intent));
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", b.toString());
        if (kVar != null) {
            bundle2.putBundle("error", m29435a(kVar));
        }
        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
        if (bundle != null) {
            intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
        }
        return intent2;
    }

    /* renamed from: a */
    public static Intent m29431a(Context context, String str, String str2, C14360f fVar, Bundle bundle) {
        if (fVar == null) {
            return null;
        }
        C14359e eVar = fVar.f37352a;
        if (eVar == null) {
            return null;
        }
        Intent a = m29430a(context, new Intent().setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(eVar.mo26553a()).addCategory("android.intent.category.DEFAULT"), eVar);
        if (a == null) {
            return null;
        }
        m29440a(a, str, str2, fVar.f37353b, bundle);
        return a;
    }

    /* renamed from: b */
    public static Intent m29442b(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, C14503a aVar, String str3, String str4) {
        for (C14359e eVar : f37345a) {
            Context context2 = context;
            Intent a = m29430a(context, m29434a(eVar, str, collection, str2, z, z2, aVar, str3, str4), eVar);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Intent m29432a(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, C14503a aVar, String str3, String str4) {
        C14356b bVar = new C14356b();
        Context context2 = context;
        return m29430a(context, m29434a((C14359e) bVar, str, collection, str2, z, z2, aVar, str3, str4), (C14359e) bVar);
    }

    /* renamed from: a */
    private static Intent m29434a(C14359e eVar, String str, Collection<String> collection, String str2, boolean z, boolean z2, C14503a aVar, String str3, String str4) {
        String b = eVar.mo26554b();
        if (b == null) {
            return null;
        }
        Intent putExtra = new Intent().setClassName(eVar.mo26553a(), b).putExtra("client_id", str);
        putExtra.putExtra("facebook_sdk_version", C14533n.m29775i());
        if (!C14277aa.m29277a(collection)) {
            putExtra.putExtra("scope", TextUtils.join(",", collection));
        }
        if (!C14277aa.m29276a(str2)) {
            putExtra.putExtra("e2e", str2);
        }
        putExtra.putExtra("state", str3);
        putExtra.putExtra("response_type", "token,signed_request");
        putExtra.putExtra("return_scopes", "true");
        if (z2) {
            putExtra.putExtra("default_audience", aVar.getNativeProtocolAudience());
        }
        putExtra.putExtra("legacy_override", C14533n.m29774h());
        putExtra.putExtra("auth_type", str4);
        return putExtra;
    }
}
