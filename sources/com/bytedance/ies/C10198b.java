package com.bytedance.ies;

import android.content.Context;
import com.google.gson.C17978g;
import com.google.gson.C18097x;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.WireTypeAdapterFactory;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import okio.Okio;

/* renamed from: com.bytedance.ies.b */
public final class C10198b<M extends Message> {

    /* renamed from: a */
    public final Context f27526a;

    /* renamed from: b */
    private final DefaultValueProtoAdapter<M> f27527b;

    /* renamed from: c */
    private final C10199a<M> f27528c;

    /* renamed from: d */
    private final C10200b f27529d = null;

    /* renamed from: e */
    private final boolean f27530e = false;

    /* renamed from: com.bytedance.ies.b$a */
    public interface C10199a<T> {
        /* renamed from: a */
        T mo18226a();
    }

    /* renamed from: com.bytedance.ies.b$b */
    public interface C10200b {
        /* renamed from: a */
        String mo18227a(Context context);
    }

    /* renamed from: a */
    private static void m20656a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static File m20654a(Context context) {
        return new File(context.getFilesDir(), "ies_settings.pb");
    }

    /* renamed from: a */
    public final M mo18225a(File file) {
        if (file.exists()) {
            M a = m20653a(file, null);
            if (a != null) {
                return a;
            }
            M m = (Message) this.f27528c.mo18226a();
            M a2 = m20653a(file, m);
            if (a2 != null) {
                return a2;
            }
            return m;
        } else if (this.f27529d == null) {
            return (Message) this.f27528c.mo18226a();
        } else {
            M m2 = (Message) this.f27528c.mo18226a();
            try {
                String a3 = this.f27529d.mo18227a(this.f27526a);
                WireTypeAdapterFactory wireTypeAdapterFactory = new WireTypeAdapterFactory();
                wireTypeAdapterFactory.registerDefaultValue(m2, null);
                M m3 = (Message) new C17978g().mo34894a((C18097x) wireTypeAdapterFactory).mo34900d().mo34884a(a3, m2.getClass());
                m20655a(this.f27526a, m3, file);
                return m3;
            } catch (Throwable unused) {
                return m2;
            }
        }
    }

    /* renamed from: a */
    private M m20653a(File file, M m) {
        FileInputStream fileInputStream;
        M m2;
        M m3 = null;
        try {
            fileInputStream = new FileInputStream(file);
            if (m != null) {
                try {
                    m2 = (Message) this.f27527b.decode(new ProtoReader(Okio.buffer(Okio.source((InputStream) fileInputStream))), m);
                } catch (Throwable th) {
                    th = th;
                    m20656a((Closeable) fileInputStream);
                    throw th;
                }
            } else {
                m2 = (Message) this.f27527b.decode((InputStream) fileInputStream);
            }
            m3 = m2;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            m20656a((Closeable) fileInputStream);
            throw th;
        }
        m20656a((Closeable) fileInputStream);
        return m3;
    }

    /* renamed from: a */
    public static void m20655a(Context context, Message message, File file) {
        FileOutputStream fileOutputStream = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                message.encode((OutputStream) fileOutputStream2);
                m20656a((Closeable) fileOutputStream2);
            } catch (FileNotFoundException unused) {
                fileOutputStream = fileOutputStream2;
                m20656a((Closeable) fileOutputStream);
            } catch (IOException unused2) {
                fileOutputStream = fileOutputStream2;
                m20656a((Closeable) fileOutputStream);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                m20656a((Closeable) fileOutputStream);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            m20656a((Closeable) fileOutputStream);
        } catch (IOException unused4) {
            m20656a((Closeable) fileOutputStream);
        } catch (Throwable th2) {
            th = th2;
            m20656a((Closeable) fileOutputStream);
            throw th;
        }
    }

    public C10198b(Context context, DefaultValueProtoAdapter<M> defaultValueProtoAdapter, C10199a<M> aVar, C10200b bVar, boolean z) {
        this.f27526a = context;
        this.f27527b = defaultValueProtoAdapter;
        this.f27528c = aVar;
    }
}
