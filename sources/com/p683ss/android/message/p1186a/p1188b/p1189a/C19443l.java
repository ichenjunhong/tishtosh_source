package com.p683ss.android.message.p1186a.p1188b.p1189a;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SelectableChannel;

/* renamed from: com.ss.android.message.a.b.a.l */
public final class C19443l extends InputStream implements ReadableByteChannel {

    /* renamed from: a */
    private C19444a f53760a;

    /* renamed from: com.ss.android.message.a.b.a.l$a */
    static class C19444a extends C19442k {

        /* renamed from: b */
        ReadableByteChannel f53761b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo40564a(ByteBuffer byteBuffer) throws IOException {
            return this.f53761b.read(byteBuffer);
        }

        C19444a(ReadableByteChannel readableByteChannel) throws IOException {
            super((SelectableChannel) readableByteChannel);
            this.f53761b = readableByteChannel;
        }
    }

    public final boolean isOpen() {
        return this.f53760a.mo40567b();
    }

    public final synchronized void close() throws IOException {
        this.f53760a.f53761b.close();
        this.f53760a.mo40565a();
    }

    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        if (read > 0) {
            return bArr[0] & 255;
        }
        if (read == -1) {
            return read;
        }
        throw new IOException("Could not read from stream");
    }

    public C19443l(Socket socket) throws IOException {
        this((ReadableByteChannel) socket.getChannel());
    }

    public final int read(ByteBuffer byteBuffer) throws IOException {
        return this.f53760a.mo40566b(byteBuffer);
    }

    private C19443l(ReadableByteChannel readableByteChannel) throws IOException {
        C19442k.m47586a((Object) readableByteChannel);
        this.f53760a = new C19444a(readableByteChannel);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return read(ByteBuffer.wrap(bArr, i, i2));
    }
}
