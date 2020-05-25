package com.squareup.p1094a;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;

/* renamed from: com.squareup.a.f */
final class C18372f extends C18343aa {

    /* renamed from: a */
    private static final UriMatcher f50734a;

    /* renamed from: b */
    private final Context f50735b;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f50734a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f50734a.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f50734a.addURI("com.android.contacts", "contacts/#/photo", 2);
        f50734a.addURI("com.android.contacts", "contacts/#", 3);
        f50734a.addURI("com.android.contacts", "display_photo/#", 4);
    }

    C18372f(Context context) {
        this.f50735b = context;
    }

    /* renamed from: a */
    public final boolean mo36788a(C18409y yVar) {
        Uri uri = yVar.f50842d;
        if (!C42311c.f106865i.equals(uri.getScheme()) || !Contacts.CONTENT_URI.getHost().equals(uri.getHost()) || f50734a.match(yVar.f50842d) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.squareup.p1094a.C18343aa.C18344a mo36787a(com.squareup.p1094a.C18409y r4, int r5) throws java.io.IOException {
        /*
            r3 = this;
            android.content.Context r5 = r3.f50735b
            android.content.ContentResolver r5 = r5.getContentResolver()
            android.net.Uri r4 = r4.f50842d
            android.content.UriMatcher r0 = f50734a
            int r0 = r0.match(r4)
            r1 = 0
            switch(r0) {
                case 1: goto L_0x002b;
                case 2: goto L_0x0026;
                case 3: goto L_0x0033;
                case 4: goto L_0x0026;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid uri: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L_0x0026:
            java.io.InputStream r4 = r5.openInputStream(r4)
            goto L_0x0043
        L_0x002b:
            android.net.Uri r4 = android.provider.ContactsContract.Contacts.lookupContact(r5, r4)
            if (r4 != 0) goto L_0x0033
            r4 = r1
            goto L_0x0043
        L_0x0033:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 14
            if (r0 >= r2) goto L_0x003e
            java.io.InputStream r4 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r4)
            goto L_0x0043
        L_0x003e:
            r0 = 1
            java.io.InputStream r4 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r4, r0)
        L_0x0043:
            if (r4 == 0) goto L_0x004d
            com.squareup.a.aa$a r5 = new com.squareup.a.aa$a
            com.squareup.a.v$d r0 = com.squareup.p1094a.C18396v.C18402d.DISK
            r5.<init>(r4, r0)
            return r5
        L_0x004d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.p1094a.C18372f.mo36787a(com.squareup.a.y, int):com.squareup.a.aa$a");
    }
}
