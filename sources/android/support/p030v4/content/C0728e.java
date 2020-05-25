package android.support.p030v4.content;

import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

/* renamed from: android.support.v4.content.e */
final class C0728e {
    /* renamed from: a */
    static int m2110a(FileProvider fileProvider, Uri uri, String str, String[] strArr) {
        FileProvider fileProvider2 = fileProvider;
        synchronized (fileProvider2) {
            Object obj = fileProvider.mLazyProviderInfo;
            if (obj != null && (obj instanceof ProviderInfo)) {
                try {
                    fileProvider2.attachInfo(fileProvider2.getContext(), (ProviderInfo) obj);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
        }
        return fileProvider.delete$___twin___(uri, str, strArr);
    }

    /* renamed from: a */
    static Cursor m2111a(FileProvider fileProvider, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        FileProvider fileProvider2 = fileProvider;
        synchronized (fileProvider2) {
            Object obj = fileProvider.mLazyProviderInfo;
            if (obj != null && (obj instanceof ProviderInfo)) {
                try {
                    fileProvider2.attachInfo(fileProvider2.getContext(), (ProviderInfo) obj);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
        }
        return fileProvider.query$___twin___(uri, strArr, str, strArr2, str2);
    }

    /* renamed from: a */
    static ParcelFileDescriptor m2112a(FileProvider fileProvider, Uri uri, String str) throws FileNotFoundException {
        FileProvider fileProvider2 = fileProvider;
        synchronized (fileProvider2) {
            Object obj = fileProvider.mLazyProviderInfo;
            if (obj != null && (obj instanceof ProviderInfo)) {
                try {
                    fileProvider2.attachInfo(fileProvider2.getContext(), (ProviderInfo) obj);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
        }
        return fileProvider.openFile$___twin___(uri, str);
    }

    /* renamed from: a */
    static String m2113a(FileProvider fileProvider, Uri uri) {
        FileProvider fileProvider2 = fileProvider;
        synchronized (fileProvider2) {
            Object obj = fileProvider.mLazyProviderInfo;
            if (obj != null && (obj instanceof ProviderInfo)) {
                try {
                    fileProvider2.attachInfo(fileProvider2.getContext(), (ProviderInfo) obj);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
        }
        return fileProvider.getType$___twin___(uri);
    }
}
