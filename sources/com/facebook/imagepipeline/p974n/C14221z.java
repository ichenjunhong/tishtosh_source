package com.facebook.imagepipeline.p974n;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import com.facebook.common.p923g.C13711i;
import com.facebook.common.p927k.C13731f;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p975o.C14229b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.z */
public final class C14221z extends C14108ac {

    /* renamed from: a */
    private static final String[] f37119a = {"_id", "_data"};

    /* renamed from: b */
    private final ContentResolver f37120b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo26348a() {
        return "LocalContentUriFetchProducer";
    }

    /* renamed from: a */
    private C14044e m29160a(Uri uri) throws IOException {
        int i;
        Cursor query = this.f37120b.query(uri, f37119a, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (string != null) {
                FileInputStream fileInputStream = new FileInputStream(string);
                if (string == null) {
                    i = -1;
                } else {
                    i = (int) new File(string).length();
                }
                C14044e b = mo26354b(fileInputStream, i);
                query.close();
                return b;
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C14044e mo26347a(C14229b bVar) throws IOException {
        boolean z;
        InputStream inputStream;
        Uri uri = bVar.mSourceUri;
        if (!C13731f.m27780d(uri) || !"com.android.contacts".equals(uri.getAuthority()) || uri.getPath().startsWith(C13731f.f35721a.getPath())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (uri.toString().endsWith("/photo")) {
                inputStream = this.f37120b.openInputStream(uri);
            } else if (uri.toString().endsWith("/display_photo")) {
                try {
                    inputStream = this.f37120b.openAssetFileDescriptor(uri, "r").createInputStream();
                } catch (IOException unused) {
                    StringBuilder sb = new StringBuilder("Contact photo does not exist: ");
                    sb.append(uri);
                    throw new IOException(sb.toString());
                }
            } else {
                inputStream = Contacts.openContactPhotoInputStream(this.f37120b, uri);
                if (inputStream == null) {
                    StringBuilder sb2 = new StringBuilder("Contact photo does not exist: ");
                    sb2.append(uri);
                    throw new IOException(sb2.toString());
                }
            }
            return mo26354b(inputStream, -1);
        }
        if (C13731f.m27781e(uri)) {
            C14044e a = m29160a(uri);
            if (a != null) {
                return a;
            }
        }
        return mo26354b(this.f37120b.openInputStream(uri), -1);
    }

    public C14221z(Executor executor, C13711i iVar, ContentResolver contentResolver) {
        super(executor, iVar);
        this.f37120b = contentResolver;
    }
}
