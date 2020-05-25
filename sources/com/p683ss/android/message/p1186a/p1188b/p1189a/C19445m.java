package com.p683ss.android.message.p1186a.p1188b.p1189a;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;
import java.nio.channels.WritableByteChannel;

/* renamed from: com.ss.android.message.a.b.a.m */
public final class C19445m extends OutputStream implements WritableByteChannel {

    /* renamed from: a */
    private C19446a f53762a;

    /* renamed from: com.ss.android.message.a.b.a.m$a */
    static class C19446a extends C19442k {

        /* renamed from: b */
        WritableByteChannel f53763b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo40564a(ByteBuffer byteBuffer) throws IOException {
            return this.f53763b.write(byteBuffer);
        }

        C19446a(WritableByteChannel writableByteChannel) throws IOException {
            super((SelectableChannel) writableByteChannel);
            this.f53763b = writableByteChannel;
        }
    }

    public final boolean isOpen() {
        return this.f53762a.mo40567b();
    }

    public final synchronized void close() throws IOException {
        this.f53762a.f53763b.close();
        this.f53762a.mo40565a();
    }

    public C19445m(Socket socket) throws IOException {
        this((WritableByteChannel) socket.getChannel());
    }

    public final int write(ByteBuffer byteBuffer) throws IOException {
        return this.f53762a.mo40566b(byteBuffer);
    }

    private C19445m(WritableByteChannel writableByteChannel) throws IOException {
        C19442k.m47586a((Object) writableByteChannel);
        this.f53762a = new C19446a(writableByteChannel);
    }

    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        while (wrap.hasRemaining()) {
            try {
                if (write(wrap) < 0) {
                    throw new IOException("The stream is closed");
                }
            } catch (IOException e) {
                if (wrap.capacity() > wrap.remaining()) {
                    this.f53762a.mo40565a();
                }
                throw e;
            }
        }
    }
}
