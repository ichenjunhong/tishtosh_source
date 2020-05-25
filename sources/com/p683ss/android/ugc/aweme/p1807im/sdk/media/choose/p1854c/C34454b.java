package com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1854c;

import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;
import com.C2240a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34463a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34463a.C34464a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.p2629a.C52568f;
import p2628d.p2630b.C52594a;
import p2628d.p2638e.C52647c;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.c.b */
public final class C34454b {

    /* renamed from: a */
    public static final C34454b f88876a = new C34454b();

    /* renamed from: b */
    private static final String[] f88877b = {"_id", "_data", "date_added", "date_modified", "width", "height", "mime_type", "_data"};

    /* renamed from: c */
    private static final String[] f88878c = {"_id", "_data", "date_added", "date_modified", "width", "height", "mime_type", "duration", "_size", "_data"};

    /* renamed from: d */
    private static final Uri f88879d = Media.EXTERNAL_CONTENT_URI;

    /* renamed from: e */
    private static final Uri f88880e = Video.Media.EXTERNAL_CONTENT_URI;

    /* renamed from: f */
    private static final String[] f88881f = {"image/jpeg", "image/png", f88882g};

    /* renamed from: g */
    private static final String f88882g = f88882g;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.c.b$a */
    public static final class C34455a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(Long.valueOf(((C34409a) t2).getDateModify()), Long.valueOf(((C34409a) t).getDateModify()));
        }
    }

    private C34454b() {
    }

    /* renamed from: a */
    private static String m78390a(C34409a aVar) {
        String filePath = aVar.getFilePath();
        if (filePath != null) {
            CharSequence charSequence = filePath;
            String str = File.separator;
            C52711k.m112236a((Object) str, "File.separator");
            List b = C52830p.m112452b(charSequence, new String[]{str}, false, 0, 6, (Object) null);
            if (b != null) {
                if (b.size() >= 2) {
                    return (String) b.get(b.size() - 2);
                }
                return "";
            }
        }
        return "";
    }

    /* renamed from: a */
    public final List<C34463a> mo72471a(List<C34409a> list) {
        boolean z;
        if (list.isEmpty()) {
            return new ArrayList<>();
        }
        List<C34463a> arrayList = new ArrayList<>();
        Map linkedHashMap = new LinkedHashMap();
        C34463a a = C34464a.m78402a();
        linkedHashMap.put(a.f88898c, a);
        for (C34409a aVar : list) {
            String a2 = m78390a(aVar);
            CharSequence charSequence = a2;
            if (charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !C52830p.m112402a(charSequence)) {
                C34463a aVar2 = (C34463a) linkedHashMap.get(a2);
                if (aVar2 == null) {
                    aVar2 = new C34463a(a2);
                }
                if (aVar.isVideo()) {
                    aVar2.mo72476b().add(aVar);
                    a.mo72476b().add(aVar);
                } else if (aVar.isImage() || aVar.isGif()) {
                    aVar2.mo72475a().add(aVar);
                    a.mo72475a().add(aVar);
                }
                linkedHashMap.put(a2, aVar2);
            }
        }
        for (Entry value : linkedHashMap.entrySet()) {
            arrayList.add(value.getValue());
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final List<C34463a> m78393b(C34452a aVar, int i) {
        C52711k.m112240b(aVar, "imageSettings");
        return f88876a.mo72471a(m78391a(aVar, -1));
    }

    /* renamed from: a */
    public static final List<C34409a> m78391a(C34452a aVar, int i) {
        Closeable closeable;
        Throwable th;
        C34452a aVar2 = aVar;
        C52711k.m112240b(aVar2, "imageSettings");
        List<C34409a> arrayList = new ArrayList<>();
        Locale locale = Locale.getDefault();
        C52711k.m112236a((Object) locale, "Locale.getDefault()");
        int i2 = 4;
        int i3 = 0;
        int i4 = 1;
        int i5 = 2;
        int i6 = 3;
        String a = C2240a.m6773a(locale, "%s >= %d and %s >= %d", Arrays.copyOf(new Object[]{"width", Integer.valueOf(aVar2.f88873a), "height", Integer.valueOf(aVar2.f88874b)}, 4));
        C52711k.m112236a((Object) a, "java.lang.String.format(locale, format, *args)");
        StringBuilder sb = new StringBuilder("date_modified DESC LIMIT ");
        sb.append(i);
        Cursor query = C11010c.m22280a().getContentResolver().query(f88879d, f88877b, a, null, sb.toString());
        if (query != null) {
            closeable = query;
            try {
                Cursor cursor = (Cursor) closeable;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(i3);
                    String string = cursor.getString(i4);
                    long j2 = cursor.getLong(i5);
                    long j3 = cursor.getLong(i6);
                    int i7 = cursor.getInt(i2);
                    int i8 = cursor.getInt(5);
                    String string2 = cursor.getString(6);
                    String string3 = cursor.getString(7);
                    if (C52568f.m112077a((Object[]) f88881f, (Object) string2)) {
                        if (i7 >= 360) {
                            if (i8 >= 360) {
                                if ((aVar2.f88875c || !C52711k.m112239a((Object) string2, (Object) f88882g)) && C48016e.m103944b(string)) {
                                    C34409a aVar3 = new C34409a(j);
                                    aVar3.setType(0);
                                    aVar3.setFilePath(string);
                                    aVar3.setDate(j2);
                                    aVar3.setDateModify(j3);
                                    aVar3.setWidth(i7);
                                    aVar3.setHeight(i8);
                                    aVar3.setMimeType(string2);
                                    aVar3.setThumbnail(string3);
                                    arrayList.add(aVar3);
                                }
                            }
                        }
                    }
                    i2 = 4;
                    i3 = 0;
                    i4 = 1;
                    i5 = 2;
                    i6 = 3;
                }
                C52647c.m112189a(closeable, null);
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return arrayList;
        C52647c.m112189a(closeable, th);
        throw th;
    }

    /* renamed from: a */
    public static final List<C34409a> m78392a(C34456c cVar, int i) {
        Throwable th;
        Cursor cursor;
        C34456c cVar2 = cVar;
        C52711k.m112240b(cVar2, "videoSettings");
        List<C34409a> arrayList = new ArrayList<>();
        int i2 = 3;
        int i3 = 0;
        int i4 = 1;
        int i5 = 2;
        String[] strArr = {String.valueOf(cVar2.f88884a), String.valueOf(cVar2.f88885b), String.valueOf(cVar2.f88886c)};
        StringBuilder sb = new StringBuilder("date_modified DESC LIMIT ");
        sb.append(i);
        String sb2 = sb.toString();
        Cursor query = C11010c.m22280a().getContentResolver().query(f88880e, f88878c, "duration >= ? and duration <= ? and _size <= ?", strArr, sb2);
        if (query != null) {
            Closeable closeable = query;
            try {
                Cursor cursor2 = (Cursor) closeable;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(i3);
                    String string = cursor2.getString(i4);
                    long j2 = cursor2.getLong(i5);
                    long j3 = cursor2.getLong(i2);
                    int i6 = cursor2.getInt(4);
                    int i7 = cursor2.getInt(5);
                    String string2 = cursor2.getString(6);
                    long j4 = cursor2.getLong(7);
                    Closeable closeable2 = closeable;
                    try {
                        long j5 = cursor2.getLong(8);
                        List<C34409a> list = arrayList;
                        String string3 = cursor2.getString(9);
                        if (C48016e.m103944b(string)) {
                            if (C48016e.m103944b(string3)) {
                                cursor = cursor2;
                                C34409a aVar = new C34409a(j);
                                aVar.setType(1);
                                aVar.setFilePath(string);
                                aVar.setDate(j2);
                                aVar.setDateModify(j3);
                                aVar.setWidth(i6);
                                aVar.setHeight(i7);
                                aVar.setMimeType(string2);
                                aVar.setDuration(j4);
                                aVar.setFileSize(j5);
                                aVar.setThumbnail(string3);
                                arrayList = list;
                                arrayList.add(aVar);
                                closeable = closeable2;
                                cursor2 = cursor;
                                i2 = 3;
                                i3 = 0;
                                i4 = 1;
                                i5 = 2;
                            }
                        }
                        cursor = cursor2;
                        arrayList = list;
                        closeable = closeable2;
                        cursor2 = cursor;
                        i2 = 3;
                        i3 = 0;
                        i4 = 1;
                        i5 = 2;
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = closeable2;
                        th = null;
                        C52647c.m112189a(closeable, th);
                        throw th;
                    }
                }
                C52647c.m112189a(closeable, null);
            } catch (Throwable th3) {
                th = th3;
                th = null;
                C52647c.m112189a(closeable, th);
                throw th;
            }
        }
        return arrayList;
    }
}
