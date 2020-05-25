package leakcanary.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52722v.C52725c;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2650m.C52830p;

public final class LeakCanaryFileProvider extends ContentProvider {

    /* renamed from: a */
    public static final String f132041a = f132041a;

    /* renamed from: b */
    public static final String f132042b = f132042b;

    /* renamed from: c */
    public static final String f132043c = f132043c;

    /* renamed from: d */
    public static final String f132044d = f132044d;

    /* renamed from: e */
    public static final String f132045e = f132045e;

    /* renamed from: f */
    public static final String f132046f = f132046f;

    /* renamed from: g */
    public static final String f132047g = f132047g;

    /* renamed from: h */
    public static final String f132048h = f132048h;

    /* renamed from: i */
    public static final String f132049i = f132049i;

    /* renamed from: j */
    public static final String f132050j = f132050j;

    /* renamed from: k */
    public static final File f132051k = new File("/");

    /* renamed from: l */
    public static final HashMap<String, C53391b> f132052l = new HashMap<>();

    /* renamed from: m */
    public static final C53389a f132053m = new C53389a(null);

    /* renamed from: o */
    private static final String[] f132054o = {"_display_name", "_size"};

    /* renamed from: n */
    private C53391b f132055n;

    /* renamed from: leakcanary.internal.LeakCanaryFileProvider$a */
    public static final class C53389a {

        /* renamed from: leakcanary.internal.LeakCanaryFileProvider$a$a */
        static final class C53390a extends C52712l implements C52670a<Integer> {

            /* renamed from: a */
            final /* synthetic */ C52725c f132056a;

            /* renamed from: b */
            final /* synthetic */ XmlResourceParser f132057b;

            C53390a(C52725c cVar, XmlResourceParser xmlResourceParser) {
                this.f132056a = cVar;
                this.f132057b = xmlResourceParser;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                this.f132056a.element = this.f132057b.next();
                return Integer.valueOf(this.f132056a.element);
            }
        }

        private C53389a() {
        }

        public /* synthetic */ C53389a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        private static File m113458a(File file, String... strArr) {
            File file2 = file;
            int i = 0;
            while (i <= 0) {
                i++;
                file2 = new File(file2, strArr[0]);
            }
            return file2;
        }

        /* renamed from: a */
        public static C53391b m113459a(Context context, String str) {
            boolean z;
            File[] fileArr;
            boolean z2;
            File[] fileArr2;
            boolean z3;
            C52727e eVar = new C52727e();
            synchronized (LeakCanaryFileProvider.f132052l) {
                eVar.element = (C53391b) LeakCanaryFileProvider.f132052l.get(str);
                if (((C53391b) eVar.element) == null) {
                    try {
                        C53389a aVar = LeakCanaryFileProvider.f132053m;
                        T cVar = new C53392c(str);
                        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
                        if (resolveContentProvider == null) {
                            C52711k.m112234a();
                        }
                        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), LeakCanaryFileProvider.f132041a);
                        if (loadXmlMetaData != null) {
                            C52725c cVar2 = new C52725c();
                            cVar2.element = 0;
                            while (((Number) new C53390a(cVar2, loadXmlMetaData).invoke()).intValue() != 1) {
                                if (cVar2.element == 2) {
                                    String name = loadXmlMetaData.getName();
                                    File file = null;
                                    String attributeValue = loadXmlMetaData.getAttributeValue(null, LeakCanaryFileProvider.f132049i);
                                    String attributeValue2 = loadXmlMetaData.getAttributeValue(null, LeakCanaryFileProvider.f132050j);
                                    if (C52711k.m112239a((Object) LeakCanaryFileProvider.f132042b, (Object) name)) {
                                        file = LeakCanaryFileProvider.f132051k;
                                    } else if (C52711k.m112239a((Object) LeakCanaryFileProvider.f132043c, (Object) name)) {
                                        file = context.getFilesDir();
                                    } else if (C52711k.m112239a((Object) LeakCanaryFileProvider.f132044d, (Object) name)) {
                                        file = context.getCacheDir();
                                    } else if (C52711k.m112239a((Object) LeakCanaryFileProvider.f132045e, (Object) name)) {
                                        file = Environment.getExternalStorageDirectory();
                                    } else if (C52711k.m112239a((Object) LeakCanaryFileProvider.f132046f, (Object) name)) {
                                        if (VERSION.SDK_INT >= 19) {
                                            fileArr2 = context.getExternalFilesDirs(null);
                                            C52711k.m112236a((Object) fileArr2, "context.getExternalFilesDirs(type)");
                                        } else {
                                            fileArr2 = new File[1];
                                            File externalFilesDir = context.getExternalFilesDir(null);
                                            if (externalFilesDir == null) {
                                                C52711k.m112234a();
                                            }
                                            C52711k.m112236a((Object) externalFilesDir, "context.getExternalFilesDir(type)!!");
                                            fileArr2[0] = externalFilesDir;
                                        }
                                        if (fileArr2.length == 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (!z3) {
                                            file = fileArr2[0];
                                        }
                                    } else if (C52711k.m112239a((Object) LeakCanaryFileProvider.f132047g, (Object) name)) {
                                        if (VERSION.SDK_INT >= 19) {
                                            fileArr = context.getExternalCacheDirs();
                                            C52711k.m112236a((Object) fileArr, "context.externalCacheDirs");
                                        } else {
                                            fileArr = new File[1];
                                            File externalCacheDir = context.getExternalCacheDir();
                                            if (externalCacheDir == null) {
                                                C52711k.m112234a();
                                            }
                                            C52711k.m112236a((Object) externalCacheDir, "context.externalCacheDir!!");
                                            fileArr[0] = externalCacheDir;
                                        }
                                        if (fileArr.length == 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (!z2) {
                                            file = fileArr[0];
                                        }
                                    } else if (VERSION.SDK_INT >= 21 && C52711k.m112239a((Object) LeakCanaryFileProvider.f132048h, (Object) name)) {
                                        File[] externalMediaDirs = context.getExternalMediaDirs();
                                        C52711k.m112236a((Object) externalMediaDirs, "externalMediaDirs");
                                        if (externalMediaDirs.length == 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (!z) {
                                            file = externalMediaDirs[0];
                                        }
                                    }
                                    if (file != null) {
                                        C52711k.m112236a((Object) attributeValue, LeakCanaryFileProvider.f132049i);
                                        C52711k.m112236a((Object) attributeValue2, LeakCanaryFileProvider.f132050j);
                                        cVar.mo111012a(attributeValue, m113458a(file, attributeValue2));
                                    }
                                }
                            }
                            eVar.element = (C53391b) cVar;
                            Map map = LeakCanaryFileProvider.f132052l;
                            C53391b bVar = (C53391b) eVar.element;
                            if (bVar == null) {
                                C52711k.m112234a();
                            }
                            map.put(str, bVar);
                        } else {
                            StringBuilder sb = new StringBuilder("Missing ");
                            sb.append(LeakCanaryFileProvider.f132041a);
                            sb.append(" meta-data");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } catch (IOException e) {
                        StringBuilder sb2 = new StringBuilder("Failed to parse ");
                        sb2.append(LeakCanaryFileProvider.f132041a);
                        sb2.append(" meta-data");
                        throw new IllegalArgumentException(sb2.toString(), e);
                    } catch (XmlPullParserException e2) {
                        StringBuilder sb3 = new StringBuilder("Failed to parse ");
                        sb3.append(LeakCanaryFileProvider.f132041a);
                        sb3.append(" meta-data");
                        throw new IllegalArgumentException(sb3.toString(), e2);
                    }
                }
            }
            return (C53391b) eVar.element;
        }
    }

    /* renamed from: leakcanary.internal.LeakCanaryFileProvider$b */
    public interface C53391b {
        /* renamed from: a */
        File mo111011a(Uri uri);
    }

    /* renamed from: leakcanary.internal.LeakCanaryFileProvider$c */
    public static final class C53392c implements C53391b {

        /* renamed from: a */
        private final HashMap<String, File> f132058a = new HashMap<>();

        /* renamed from: b */
        private final String f132059b;

        public C53392c(String str) {
            C52711k.m112240b(str, "mAuthority");
            this.f132059b = str;
        }

        /* renamed from: a */
        public final File mo111011a(Uri uri) {
            C52711k.m112240b(uri, "uri");
            String encodedPath = uri.getEncodedPath();
            if (encodedPath == null) {
                C52711k.m112234a();
            }
            int a = C52830p.m112415a((CharSequence) encodedPath, '/', 1, false, 4, (Object) null);
            String substring = encodedPath.substring(1, a);
            C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String decode = Uri.decode(substring);
            String substring2 = encodedPath.substring(a + 1);
            C52711k.m112236a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
            String decode2 = Uri.decode(substring2);
            File file = (File) this.f132058a.get(decode);
            if (file != null) {
                C52711k.m112236a((Object) file, "mRoots[tag] ?: throw Ill…onfigured root for $uri\")");
                if (decode2 == null) {
                    C52711k.m112234a();
                }
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    C52711k.m112236a((Object) canonicalFile, "file.canonicalFile");
                    String path = canonicalFile.getPath();
                    C52711k.m112236a((Object) path, "file.path");
                    String path2 = file.getPath();
                    C52711k.m112236a((Object) path2, "root.path");
                    if (C52830p.m112410b(path, path2, false)) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    StringBuilder sb = new StringBuilder("Failed to resolve canonical path for ");
                    sb.append(file2);
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                StringBuilder sb2 = new StringBuilder("Unable to find configured root for ");
                sb2.append(uri);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        /* renamed from: a */
        public final void mo111012a(String str, File file) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
            C52711k.m112240b(file, "root");
            if (!TextUtils.isEmpty(str)) {
                Map map = this.f132058a;
                try {
                    File canonicalFile = file.getCanonicalFile();
                    C52711k.m112236a((Object) canonicalFile, "try {\n        // Resolve…oot\", e\n        )\n      }");
                    map.put(str, canonicalFile);
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Failed to resolve canonical path for ");
                    sb.append(file);
                    throw new IllegalArgumentException(sb.toString(), e);
                }
            } else {
                throw new IllegalArgumentException("Name must not be empty");
            }
        }
    }

    public final boolean onCreate() {
        return true;
    }

    public final String getType(Uri uri) {
        C52711k.m112240b(uri, "uri");
        C53391b bVar = this.f132055n;
        if (bVar == null) {
            C52711k.m112234a();
        }
        File a = bVar.mo111011a(uri);
        String name = a.getName();
        C52711k.m112236a((Object) name, "file.name");
        int b = C52830p.m112443b((CharSequence) name, '.', C52830p.m112461f(name), false);
        if (b >= 0) {
            String name2 = a.getName();
            C52711k.m112236a((Object) name2, "file.name");
            int i = b + 1;
            if (name2 != null) {
                String substring = name2.substring(i);
                C52711k.m112236a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(substring);
                if (mimeTypeFromExtension != null) {
                    return mimeTypeFromExtension;
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type java.lang.String");
            }
        }
        return "application/octet-stream";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        C52711k.m112240b(uri, "uri");
        throw new UnsupportedOperationException("No external inserts");
    }

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(providerInfo, "info");
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            String str = providerInfo.authority;
            C52711k.m112236a((Object) str, "info.authority");
            this.f132055n = C53389a.m113459a(context, str);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        int i;
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(str, "mode");
        C53391b bVar = this.f132055n;
        if (bVar == null) {
            C52711k.m112234a();
        }
        File a = bVar.mo111011a(uri);
        if (C52711k.m112239a((Object) "r", (Object) str)) {
            i = 268435456;
        } else if (C52711k.m112239a((Object) "w", (Object) str) || C52711k.m112239a((Object) "wt", (Object) str)) {
            i = 738197504;
        } else if (C52711k.m112239a((Object) "wa", (Object) str)) {
            i = 704643072;
        } else if (C52711k.m112239a((Object) "rw", (Object) str)) {
            i = 939524096;
        } else if (C52711k.m112239a((Object) "rwt", (Object) str)) {
            i = 1006632960;
        } else {
            StringBuilder sb = new StringBuilder("Invalid mode: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        return ParcelFileDescriptor.open(a, i);
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        C52711k.m112240b(uri, "uri");
        C53391b bVar = this.f132055n;
        if (bVar == null) {
            C52711k.m112234a();
        }
        if (bVar.mo111011a(uri).delete()) {
            return 1;
        }
        return 0;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C52711k.m112240b(uri, "uri");
        throw new UnsupportedOperationException("No external updates");
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        C52711k.m112240b(uri, "uri");
        if (strArr == null) {
            strArr = f132054o;
        }
        C53391b bVar = this.f132055n;
        if (bVar == null) {
            C52711k.m112234a();
        }
        File a = bVar.mo111011a(uri);
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if (C52711k.m112239a((Object) "_display_name", (Object) str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = a.getName();
            } else if (C52711k.m112239a((Object) "_size", (Object) str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(a.length());
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }
}
