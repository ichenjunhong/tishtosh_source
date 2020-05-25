package com.facebook.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import com.C2240a;
import com.facebook.C14457k;
import com.facebook.C14533n;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

/* renamed from: com.facebook.internal.u */
public final class C14350u {

    /* renamed from: a */
    private static final String f37336a = "com.facebook.internal.u";

    /* renamed from: b */
    private static File f37337b;

    /* renamed from: com.facebook.internal.u$a */
    public static final class C14352a {

        /* renamed from: a */
        public final UUID f37338a;

        /* renamed from: b */
        public final String f37339b;

        /* renamed from: c */
        public final String f37340c;

        /* renamed from: d */
        public Bitmap f37341d;

        /* renamed from: e */
        public Uri f37342e;

        /* renamed from: f */
        public boolean f37343f;

        /* renamed from: g */
        public boolean f37344g;

        private C14352a(UUID uuid, Bitmap bitmap, Uri uri) {
            String str;
            String str2;
            boolean z;
            this.f37338a = uuid;
            this.f37341d = bitmap;
            this.f37342e = uri;
            if (uri != null) {
                String scheme = uri.getScheme();
                if (C42311c.f106865i.equalsIgnoreCase(scheme)) {
                    this.f37343f = true;
                    if (uri.getAuthority() == null || uri.getAuthority().startsWith("media")) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f37344g = z;
                } else if ("file".equalsIgnoreCase(uri.getScheme())) {
                    this.f37344g = true;
                } else if (!C14277aa.m29284b(uri)) {
                    StringBuilder sb = new StringBuilder("Unsupported scheme for media Uri : ");
                    sb.append(scheme);
                    throw new C14457k(sb.toString());
                }
            } else if (bitmap != null) {
                this.f37344g = true;
            } else {
                throw new C14457k("Cannot share media without a bitmap or Uri set");
            }
            if (!this.f37344g) {
                str = null;
            } else {
                str = UUID.randomUUID().toString();
            }
            this.f37340c = str;
            if (!this.f37344g) {
                str2 = this.f37342e.toString();
            } else {
                str2 = C2240a.m6772a("%s%s/%s/%s", new Object[]{"content://com.facebook.app.FacebookContentProvider", C14533n.m29777k(), uuid.toString(), this.f37340c});
            }
            this.f37339b = str2;
        }
    }

    private C14350u() {
    }

    /* renamed from: a */
    private static synchronized File m29421a() {
        File file;
        synchronized (C14350u.class) {
            if (f37337b == null) {
                f37337b = new File(C14533n.m29773g().getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
            }
            file = f37337b;
        }
        return file;
    }

    /* renamed from: a */
    public static void m29425a(Collection<C14352a> collection) {
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        FileOutputStream fileOutputStream2;
        if (collection != null && collection.size() != 0) {
            if (f37337b == null) {
                C14277aa.m29268a(m29421a());
            }
            m29421a().mkdirs();
            ArrayList<File> arrayList = new ArrayList<>();
            try {
                for (C14352a aVar : collection) {
                    if (aVar.f37344g) {
                        File a = m29423a(aVar.f37338a, aVar.f37340c, true);
                        arrayList.add(a);
                        if (aVar.f37341d != null) {
                            Bitmap bitmap = aVar.f37341d;
                            fileOutputStream2 = new FileOutputStream(a);
                            bitmap.compress(CompressFormat.JPEG, 100, fileOutputStream2);
                            C14277aa.m29267a((Closeable) fileOutputStream2);
                        } else if (aVar.f37342e != null) {
                            Uri uri = aVar.f37342e;
                            boolean z = aVar.f37343f;
                            fileOutputStream = new FileOutputStream(a);
                            if (!z) {
                                inputStream = new FileInputStream(uri.getPath());
                            } else {
                                inputStream = C14533n.m29773g().getContentResolver().openInputStream(uri);
                            }
                            C14277aa.m29244a(inputStream, (OutputStream) fileOutputStream);
                            C14277aa.m29267a((Closeable) fileOutputStream);
                        }
                    }
                }
            } catch (IOException e) {
                for (File delete : arrayList) {
                    try {
                        delete.delete();
                    } catch (Exception unused) {
                    }
                }
                throw new C14457k((Throwable) e);
            } catch (Throwable th) {
                C14277aa.m29267a((Closeable) fileOutputStream2);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static C14352a m29419a(UUID uuid, Bitmap bitmap) {
        C14283ab.m29306a((Object) uuid, "callId");
        C14283ab.m29306a((Object) bitmap, "attachmentBitmap");
        return new C14352a(uuid, bitmap, null);
    }

    /* renamed from: a */
    public static C14352a m29420a(UUID uuid, Uri uri) {
        C14283ab.m29306a((Object) uuid, "callId");
        C14283ab.m29306a((Object) uri, "attachmentUri");
        return new C14352a(uuid, null, uri);
    }

    /* renamed from: a */
    public static File m29422a(UUID uuid, String str) throws FileNotFoundException {
        if (C14277aa.m29276a(str) || uuid == null) {
            throw new FileNotFoundException();
        }
        try {
            return m29423a(uuid, str, false);
        } catch (IOException unused) {
            throw new FileNotFoundException();
        }
    }

    /* renamed from: a */
    public static File m29424a(UUID uuid, boolean z) {
        if (f37337b == null) {
            return null;
        }
        File file = new File(f37337b, uuid.toString());
        if (z && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    private static File m29423a(UUID uuid, String str, boolean z) throws IOException {
        File a = m29424a(uuid, z);
        if (a == null) {
            return null;
        }
        try {
            return new File(a, URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
