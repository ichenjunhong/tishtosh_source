package okhttp3.internal.p2688f;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.Okio;
import okio.Sink;
import okio.Source;

/* renamed from: okhttp3.internal.f.a */
public interface C53623a {

    /* renamed from: a */
    public static final C53623a f132977a = new C53623a() {
        /* renamed from: a */
        public final Source mo111492a(File file) throws FileNotFoundException {
            return Okio.source(file);
        }

        /* renamed from: e */
        public final boolean mo111497e(File file) {
            return file.exists();
        }

        /* renamed from: f */
        public final long mo111498f(File file) {
            return file.length();
        }

        /* renamed from: b */
        public final Sink mo111494b(File file) throws FileNotFoundException {
            try {
                return Okio.sink(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return Okio.sink(file);
            }
        }

        /* renamed from: c */
        public final Sink mo111495c(File file) throws FileNotFoundException {
            try {
                return Okio.appendingSink(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return Okio.appendingSink(file);
            }
        }

        /* renamed from: d */
        public final void mo111496d(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                StringBuilder sb = new StringBuilder("failed to delete ");
                sb.append(file);
                throw new IOException(sb.toString());
            }
        }

        /* renamed from: g */
        public final void mo111499g(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        mo111499g(file2);
                    }
                    if (file2.delete()) {
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder("failed to delete ");
                        sb.append(file2);
                        throw new IOException(sb.toString());
                    }
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder("not a readable directory: ");
            sb2.append(file);
            throw new IOException(sb2.toString());
        }

        /* renamed from: a */
        public final void mo111493a(File file, File file2) throws IOException {
            mo111496d(file2);
            if (!file.renameTo(file2)) {
                StringBuilder sb = new StringBuilder("failed to rename ");
                sb.append(file);
                sb.append(" to ");
                sb.append(file2);
                throw new IOException(sb.toString());
            }
        }
    };

    /* renamed from: a */
    Source mo111492a(File file) throws FileNotFoundException;

    /* renamed from: a */
    void mo111493a(File file, File file2) throws IOException;

    /* renamed from: b */
    Sink mo111494b(File file) throws FileNotFoundException;

    /* renamed from: c */
    Sink mo111495c(File file) throws FileNotFoundException;

    /* renamed from: d */
    void mo111496d(File file) throws IOException;

    /* renamed from: e */
    boolean mo111497e(File file);

    /* renamed from: f */
    long mo111498f(File file);

    /* renamed from: g */
    void mo111499g(File file) throws IOException;
}
