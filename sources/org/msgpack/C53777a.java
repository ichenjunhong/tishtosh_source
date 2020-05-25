package org.msgpack;

import java.io.IOException;
import org.msgpack.packer.BufferPacker;
import org.msgpack.packer.MessagePackBufferPacker;
import org.msgpack.template.Template;
import org.msgpack.template.TemplateRegistry;
import org.msgpack.unpacker.BufferUnpacker;
import org.msgpack.unpacker.MessagePackBufferUnpacker;

/* renamed from: org.msgpack.a */
public final class C53777a {

    /* renamed from: b */
    private static final C53777a f133392b = new C53777a();

    /* renamed from: a */
    private TemplateRegistry f133393a = new TemplateRegistry(null);

    /* renamed from: a */
    private BufferPacker m114376a() {
        return new MessagePackBufferPacker(this);
    }

    /* renamed from: a */
    private BufferUnpacker m114377a(byte[] bArr) {
        return new MessagePackBufferUnpacker(this).wrap(bArr);
    }

    /* renamed from: a */
    public final <T> Template<T> mo113063a(Class<T> cls) {
        return this.f133393a.lookup(cls);
    }

    /* renamed from: a */
    public final <T> T mo113062a(byte[] bArr, Template<T> template) throws IOException {
        return m114375a(bArr, null, template);
    }

    /* renamed from: a */
    public final <T> byte[] mo113064a(T t, Template<T> template) throws IOException {
        BufferPacker a = m114376a();
        template.write(a, t);
        return a.toByteArray();
    }

    /* renamed from: a */
    private <T> T m114375a(byte[] bArr, T t, Template<T> template) throws IOException {
        return template.read(m114377a(bArr), null);
    }
}
