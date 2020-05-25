package android.support.p030v4.p036d;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.support.p030v4.content.p035a.C0712c;
import android.support.p030v4.graphics.C0807c;
import android.support.p030v4.graphics.C0828i;
import android.support.p030v4.p036d.C0755c.C0760a;
import android.support.p030v4.p038f.C0786h;
import android.support.p030v4.p038f.C0799m;
import android.support.p030v4.p038f.C0800n;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.ttm.player.MediaPlayer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.d.b */
public final class C0747b {

    /* renamed from: a */
    static final C0786h<String, Typeface> f2577a = new C0786h<>(16);

    /* renamed from: b */
    static final Object f2578b = new Object();

    /* renamed from: c */
    static final C0800n<String, ArrayList<C0760a<C0754c>>> f2579c = new C0800n<>();

    /* renamed from: d */
    private static final C0755c f2580d = new C0755c("fonts", 10, 10000);

    /* renamed from: e */
    private static final Comparator<byte[]> f2581e = new Comparator<byte[]>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] != bArr2[i]) {
                    return bArr[i] - bArr2[i];
                }
            }
            return 0;
        }
    };

    /* renamed from: android.support.v4.d.b$a */
    public static class C0752a {

        /* renamed from: a */
        public final int f2589a;

        /* renamed from: b */
        public final C0753b[] f2590b;

        public C0752a(int i, C0753b[] bVarArr) {
            this.f2589a = i;
            this.f2590b = bVarArr;
        }
    }

    /* renamed from: android.support.v4.d.b$b */
    public static class C0753b {

        /* renamed from: a */
        public final Uri f2591a;

        /* renamed from: b */
        public final int f2592b;

        /* renamed from: c */
        public final int f2593c;

        /* renamed from: d */
        public final boolean f2594d;

        /* renamed from: e */
        public final int f2595e;

        public C0753b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f2591a = (Uri) C0799m.m2267a(uri);
            this.f2592b = i;
            this.f2593c = i2;
            this.f2594d = z;
            this.f2595e = i3;
        }
    }

    /* renamed from: android.support.v4.d.b$c */
    static final class C0754c {

        /* renamed from: a */
        final Typeface f2596a;

        /* renamed from: b */
        final int f2597b;

        C0754c(Typeface typeface, int i) {
            this.f2596a = typeface;
            this.f2597b = i;
        }
    }

    /* renamed from: a */
    private static List<byte[]> m2146a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m2148a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m2147a(Context context, C0753b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C0753b bVar : bVarArr) {
            if (bVar.f2595e == 0) {
                Uri uri = bVar.f2591a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, C0828i.m2388a(context, cancellationSignal, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    static C0754c m2145a(Context context, C0746a aVar, int i) {
        List<List<byte[]>> list;
        C0752a aVar2;
        try {
            PackageManager packageManager = context.getPackageManager();
            Resources resources = context.getResources();
            String str = aVar.f2571a;
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                StringBuilder sb = new StringBuilder("No package found for authority: ");
                sb.append(str);
                throw new NameNotFoundException(sb.toString());
            } else if (resolveContentProvider.packageName.equals(aVar.f2572b)) {
                List a = m2146a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(a, f2581e);
                if (aVar.f2574d != null) {
                    list = aVar.f2574d;
                } else {
                    list = C0712c.m2065a(resources, aVar.f2575e);
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= list.size()) {
                        resolveContentProvider = null;
                        break;
                    }
                    ArrayList arrayList = new ArrayList((Collection) list.get(i2));
                    Collections.sort(arrayList, f2581e);
                    if (m2148a(a, arrayList)) {
                        break;
                    }
                    i2++;
                }
                if (resolveContentProvider == null) {
                    aVar2 = new C0752a(1, null);
                } else {
                    aVar2 = new C0752a(0, m2149a(context, aVar, resolveContentProvider.authority, null));
                }
                int i3 = -3;
                if (aVar2.f2589a == 0) {
                    Typeface a2 = C0807c.f2735a.mo2604a(context, (CancellationSignal) null, aVar2.f2590b, i);
                    if (a2 != null) {
                        i3 = 0;
                    }
                    return new C0754c(a2, i3);
                }
                if (aVar2.f2589a == 1) {
                    i3 = -2;
                }
                return new C0754c(null, i3);
            } else {
                StringBuilder sb2 = new StringBuilder("Found content provider ");
                sb2.append(str);
                sb2.append(", but package was not ");
                sb2.append(aVar.f2572b);
                throw new NameNotFoundException(sb2.toString());
            }
        } catch (NameNotFoundException unused) {
            return new C0754c(null, -1);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static C0753b[] m2149a(Context context, C0746a aVar, String str, CancellationSignal cancellationSignal) {
        Cursor query;
        int i;
        int i2;
        Uri withAppendedId;
        int i3;
        boolean z;
        C0746a aVar2 = aVar;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Builder().scheme(C42311c.f106865i).authority(str2).build();
        Uri build2 = new Builder().scheme(C42311c.f106865i).authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            if (VERSION.SDK_INT > 16) {
                Uri uri = build;
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                query = context.getContentResolver().query(uri, strArr, "query = ?", new String[]{aVar2.f2573c}, null, cancellationSignal);
            } else {
                Uri uri2 = build;
                String[] strArr2 = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                query = context.getContentResolver().query(uri2, strArr2, "query = ?", new String[]{aVar2.f2573c}, null);
            }
            Cursor cursor2 = query;
            if (cursor2 != null && cursor2.getCount() > 0) {
                int columnIndex = cursor2.getColumnIndex("result_code");
                arrayList = new ArrayList();
                int columnIndex2 = cursor2.getColumnIndex("_id");
                int columnIndex3 = cursor2.getColumnIndex("file_id");
                int columnIndex4 = cursor2.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor2.getColumnIndex("font_weight");
                int columnIndex6 = cursor2.getColumnIndex("font_italic");
                while (cursor2.moveToNext()) {
                    if (columnIndex != -1) {
                        i = cursor2.getInt(columnIndex);
                    } else {
                        i = 0;
                    }
                    if (columnIndex4 != -1) {
                        i2 = cursor2.getInt(columnIndex4);
                    } else {
                        i2 = 0;
                    }
                    if (columnIndex3 == -1) {
                        withAppendedId = ContentUris.withAppendedId(build, cursor2.getLong(columnIndex2));
                    } else {
                        withAppendedId = ContentUris.withAppendedId(build2, cursor2.getLong(columnIndex3));
                    }
                    Uri uri3 = withAppendedId;
                    if (columnIndex5 != -1) {
                        i3 = cursor2.getInt(columnIndex5);
                    } else {
                        i3 = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
                    }
                    if (columnIndex6 == -1 || cursor2.getInt(columnIndex6) != 1) {
                        z = false;
                    } else {
                        z = true;
                    }
                    C0753b bVar = new C0753b(uri3, i2, i3, z, i);
                    arrayList.add(bVar);
                }
            }
            if (cursor2 != null) {
                cursor2.close();
            }
            return (C0753b[]) arrayList.toArray(new C0753b[0]);
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        r3 = f2580d;
        r3.mo2421a(new android.support.p030v4.p036d.C0755c.C07572(r1, new android.os.Handler(), new android.support.p030v4.p036d.C0747b.C07503()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009e, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m2144a(final android.content.Context r2, final android.support.p030v4.p036d.C0746a r3, final android.support.p030v4.content.p035a.C0720f.C0721a r4, final android.os.Handler r5, boolean r6, int r7, final int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.f2576f
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.support.v4.f.h<java.lang.String, android.graphics.Typeface> r1 = f2577a
            java.lang.Object r1 = r1.mo2501a(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0026
            if (r4 == 0) goto L_0x0025
            r4.mo2382a(r1)
        L_0x0025:
            return r1
        L_0x0026:
            if (r6 == 0) goto L_0x0043
            r1 = -1
            if (r7 != r1) goto L_0x0043
            android.support.v4.d.b$c r2 = m2145a(r2, r3, r8)
            if (r4 == 0) goto L_0x0040
            int r3 = r2.f2597b
            if (r3 != 0) goto L_0x003b
            android.graphics.Typeface r3 = r2.f2596a
            r4.mo2383a(r3, r5)
            goto L_0x0040
        L_0x003b:
            int r3 = r2.f2597b
            r4.mo2381a(r3, r5)
        L_0x0040:
            android.graphics.Typeface r2 = r2.f2596a
            return r2
        L_0x0043:
            android.support.v4.d.b$1 r1 = new android.support.v4.d.b$1
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0057
            android.support.v4.d.c r3 = f2580d     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.Object r3 = r3.mo2420a(r1, r7)     // Catch:{ InterruptedException -> 0x0056 }
            android.support.v4.d.b$c r3 = (android.support.p030v4.p036d.C0747b.C0754c) r3     // Catch:{ InterruptedException -> 0x0056 }
            android.graphics.Typeface r3 = r3.f2596a     // Catch:{ InterruptedException -> 0x0056 }
            return r3
        L_0x0056:
            return r2
        L_0x0057:
            if (r4 != 0) goto L_0x005b
            r3 = r2
            goto L_0x0060
        L_0x005b:
            android.support.v4.d.b$2 r3 = new android.support.v4.d.b$2
            r3.<init>(r4, r5)
        L_0x0060:
            java.lang.Object r4 = f2578b
            monitor-enter(r4)
            android.support.v4.f.n<java.lang.String, java.util.ArrayList<android.support.v4.d.c$a<android.support.v4.d.b$c>>> r5 = f2579c     // Catch:{ all -> 0x009f }
            boolean r5 = r5.containsKey(r0)     // Catch:{ all -> 0x009f }
            if (r5 == 0) goto L_0x007a
            if (r3 == 0) goto L_0x0078
            android.support.v4.f.n<java.lang.String, java.util.ArrayList<android.support.v4.d.c$a<android.support.v4.d.b$c>>> r5 = f2579c     // Catch:{ all -> 0x009f }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x009f }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x009f }
            r5.add(r3)     // Catch:{ all -> 0x009f }
        L_0x0078:
            monitor-exit(r4)     // Catch:{ all -> 0x009f }
            return r2
        L_0x007a:
            if (r3 == 0) goto L_0x0089
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x009f }
            r5.<init>()     // Catch:{ all -> 0x009f }
            r5.add(r3)     // Catch:{ all -> 0x009f }
            android.support.v4.f.n<java.lang.String, java.util.ArrayList<android.support.v4.d.c$a<android.support.v4.d.b$c>>> r3 = f2579c     // Catch:{ all -> 0x009f }
            r3.put(r0, r5)     // Catch:{ all -> 0x009f }
        L_0x0089:
            monitor-exit(r4)     // Catch:{ all -> 0x009f }
            android.support.v4.d.c r3 = f2580d
            android.support.v4.d.b$3 r4 = new android.support.v4.d.b$3
            r4.<init>(r0)
            android.os.Handler r5 = new android.os.Handler
            r5.<init>()
            android.support.v4.d.c$2 r6 = new android.support.v4.d.c$2
            r6.<init>(r1, r5, r4)
            r3.mo2421a(r6)
            return r2
        L_0x009f:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x009f }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.p036d.C0747b.m2144a(android.content.Context, android.support.v4.d.a, android.support.v4.content.a.f$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }
}
