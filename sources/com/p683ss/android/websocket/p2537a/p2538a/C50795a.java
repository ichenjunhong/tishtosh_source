package com.p683ss.android.websocket.p2537a.p2538a;

import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.websocket.p2537a.C50794a;
import com.p683ss.android.websocket.p2537a.C50810c;
import com.p683ss.android.websocket.p2537a.p2538a.C50800c.C50802a;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.C53500ac;
import okhttp3.C53504ad;
import okhttp3.C53506ae;
import okhttp3.C53678w;
import okhttp3.internal.C53548b;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;

/* renamed from: com.ss.android.websocket.a.a.a */
public abstract class C50795a implements C50794a {

    /* renamed from: c */
    public final C50804d f127608c;

    /* renamed from: d */
    public boolean f127609d;

    /* renamed from: e */
    private final C50800c f127610e;

    /* renamed from: f */
    private final C50810c f127611f;

    /* renamed from: g */
    private volatile boolean f127612g;

    /* renamed from: h */
    private boolean f127613h;

    /* renamed from: i */
    private final AtomicBoolean f127614i = new AtomicBoolean();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo99495a() throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo99496a(IOException iOException);

    /* renamed from: b */
    public final boolean mo99498b() {
        C53678w wVar;
        try {
            C50800c cVar = this.f127610e;
            cVar.mo99504a();
            if (cVar.f127633j) {
                cVar.mo99505b();
            } else {
                switch (cVar.f127629f) {
                    case 1:
                        wVar = C50794a.f127606a;
                        break;
                    case 2:
                        wVar = C50794a.f127607b;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Unknown opcode: ");
                        sb.append(Integer.toHexString(cVar.f127629f));
                        throw new ProtocolException(sb.toString());
                }
                C508011 r5 = new C53506ae(wVar, Okio.buffer(cVar.f127626c)) {

                    /* renamed from: a */
                    final /* synthetic */ C53678w f127638a;

                    /* renamed from: b */
                    final /* synthetic */ BufferedSource f127639b;

                    public final long contentLength() {
                        return -1;
                    }

                    public final C53678w contentType() {
                        return this.f127638a;
                    }

                    public final BufferedSource source() {
                        return this.f127639b;
                    }

                    {
                        this.f127638a = r2;
                        this.f127639b = r3;
                    }
                };
                cVar.f127628e = false;
                cVar.f127625b.mo99500a((C53506ae) r5);
                if (!cVar.f127628e) {
                    throw new IllegalStateException("Listener failed to call close on message payload.");
                }
            }
            if (!this.f127609d) {
                return true;
            }
            return false;
        } catch (IOException e) {
            if (!this.f127612g && (e instanceof ProtocolException)) {
                try {
                    this.f127608c.mo99508a((int) BaseNotice.CHECK_PROFILE, (String) null);
                } catch (IOException unused) {
                }
            }
            if (this.f127614i.compareAndSet(false, true)) {
                mo99496a(e);
            }
            this.f127611f.mo99514a(e, (C53504ad) null);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo99494a(Buffer buffer) throws IOException {
        if (this.f127612g) {
            throw new IllegalStateException("closed");
        } else if (!this.f127613h) {
            try {
                this.f127608c.mo99509a(buffer);
            } catch (IOException e) {
                this.f127613h = true;
                throw e;
            }
        } else {
            throw new IllegalStateException("must call close()");
        }
    }

    /* renamed from: a */
    public final void mo99493a(C53500ac acVar) throws IOException {
        int i;
        if (acVar == null) {
            throw new NullPointerException("message == null");
        } else if (this.f127612g) {
            throw new IllegalStateException("closed");
        } else if (!this.f127613h) {
            C53678w contentType = acVar.contentType();
            if (contentType != null) {
                String str = contentType.f133166b;
                if (C50794a.f127606a.f133166b.equals(str)) {
                    i = 1;
                } else if (C50794a.f127607b.f133166b.equals(str)) {
                    i = 2;
                } else {
                    StringBuilder sb = new StringBuilder("Unknown message content type: ");
                    sb.append(contentType.f133165a);
                    sb.append("/");
                    sb.append(contentType.f133166b);
                    sb.append(". Must use WebSocket.TEXT or WebSocket.BINARY.");
                    throw new IllegalArgumentException(sb.toString());
                }
                C50804d dVar = this.f127608c;
                long contentLength = acVar.contentLength();
                if (!dVar.f127646d) {
                    dVar.f127646d = true;
                    dVar.f127645c.f127652a = i;
                    dVar.f127645c.f127653b = contentLength;
                    dVar.f127645c.f127654c = true;
                    dVar.f127645c.f127655d = false;
                    BufferedSink buffer = Okio.buffer((Sink) dVar.f127645c);
                    try {
                        acVar.writeTo(buffer);
                        buffer.close();
                    } catch (IOException e) {
                        this.f127613h = true;
                        throw e;
                    }
                } else {
                    throw new IllegalStateException("Another message writer is active. Did you call close()?");
                }
            } else {
                throw new IllegalArgumentException("Message content type was null. Must use WebSocket.TEXT or WebSocket.BINARY.");
            }
        } else {
            throw new IllegalStateException("must call close()");
        }
    }

    /* renamed from: b */
    public final void mo99497b(int i, String str) {
        if (!this.f127612g) {
            try {
                this.f127608c.mo99508a(i, str);
            } catch (IOException unused) {
            }
        }
        if (this.f127614i.compareAndSet(false, true)) {
            try {
                mo99495a();
            } catch (IOException unused2) {
            }
        }
        this.f127611f.mo99512a(i, str);
    }

    /* renamed from: a */
    public final void mo99492a(int i, String str) throws IOException {
        if (!this.f127612g) {
            this.f127612g = true;
            try {
                this.f127608c.mo99508a(1000, str);
            } catch (IOException e) {
                if (this.f127614i.compareAndSet(false, true)) {
                    mo99496a(e);
                }
                throw e;
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public C50795a(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink, Random random, final Executor executor, final C50810c cVar, final String str) {
        this.f127611f = cVar;
        this.f127608c = new C50804d(true, bufferedSink, random);
        this.f127610e = new C50800c(true, bufferedSource, new C50802a() {
            /* renamed from: a */
            public final void mo99500a(C53506ae aeVar) throws IOException {
                cVar.mo99515a(aeVar);
            }

            /* renamed from: b */
            public final void mo99502b(Buffer buffer) {
                cVar.mo99516a(buffer);
            }

            /* renamed from: a */
            public final void mo99501a(final Buffer buffer) {
                executor.execute(new C53548b("OkHttp %s WebSocket Pong Reply", new Object[]{str}) {
                    /* renamed from: a */
                    public final void mo99503a() {
                        try {
                            C50795a.this.f127608c.mo99510b(buffer);
                        } catch (IOException unused) {
                        }
                    }
                });
            }

            /* renamed from: a */
            public final void mo99499a(int i, String str) {
                C50795a.this.f127609d = true;
                Executor executor = executor;
                final int i2 = i;
                final String str2 = str;
                C507982 r2 = new C53548b("OkHttp %s WebSocket Close Reply", new Object[]{str}) {
                    /* renamed from: a */
                    public final void mo99503a() {
                        C50795a.this.mo99497b(i2, str2);
                    }
                };
                executor.execute(r2);
            }
        });
    }
}
