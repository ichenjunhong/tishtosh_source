package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

public final class Okio {
    public static final Sink sink(File file) throws FileNotFoundException {
        return sink$default(file, false, 1, null);
    }

    public static final Sink blackhole() {
        return new BlackholeSink();
    }

    public static final BufferedSink buffer(Sink sink) {
        C52711k.m112240b(sink, "$receiver");
        return new RealBufferedSink(sink);
    }

    public static final Sink appendingSink(File file) throws FileNotFoundException {
        C52711k.m112240b(file, "$receiver");
        return sink((OutputStream) new FileOutputStream(file, true));
    }

    public static final BufferedSource buffer(Source source) {
        C52711k.m112240b(source, "$receiver");
        return new RealBufferedSource(source);
    }

    public static final Source source(File file) throws FileNotFoundException {
        C52711k.m112240b(file, "$receiver");
        return source((InputStream) new FileInputStream(file));
    }

    public static final boolean isAndroidGetsocknameError(AssertionError assertionError) {
        boolean z;
        C52711k.m112240b(assertionError, "$receiver");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null) {
                z = C52830p.m112455b((CharSequence) message, (CharSequence) "getsockname failed", false);
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static final Sink sink(OutputStream outputStream) {
        C52711k.m112240b(outputStream, "$receiver");
        return new OutputStreamSink(outputStream, new Timeout());
    }

    public static final Source source(InputStream inputStream) {
        C52711k.m112240b(inputStream, "$receiver");
        return new InputStreamSource(inputStream, new Timeout());
    }

    public static final Sink sink(Socket socket) throws IOException {
        C52711k.m112240b(socket, "$receiver");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        OutputStream outputStream = socket.getOutputStream();
        C52711k.m112236a((Object) outputStream, "getOutputStream()");
        return socketAsyncTimeout.sink(new OutputStreamSink(outputStream, socketAsyncTimeout));
    }

    public static final Source source(Socket socket) throws IOException {
        C52711k.m112240b(socket, "$receiver");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        InputStream inputStream = socket.getInputStream();
        C52711k.m112236a((Object) inputStream, "getInputStream()");
        return socketAsyncTimeout.source(new InputStreamSource(inputStream, socketAsyncTimeout));
    }

    public static final Sink sink(File file, boolean z) throws FileNotFoundException {
        C52711k.m112240b(file, "$receiver");
        return sink((OutputStream) new FileOutputStream(file, z));
    }

    public static final Sink sink(Path path, OpenOption... openOptionArr) throws IOException {
        C52711k.m112240b(path, "$receiver");
        C52711k.m112240b(openOptionArr, "options");
        OutputStream newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        C52711k.m112236a((Object) newOutputStream, "Files.newOutputStream(this, *options)");
        return sink(newOutputStream);
    }

    public static final Source source(Path path, OpenOption... openOptionArr) throws IOException {
        C52711k.m112240b(path, "$receiver");
        C52711k.m112240b(openOptionArr, "options");
        InputStream newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        C52711k.m112236a((Object) newInputStream, "Files.newInputStream(this, *options)");
        return source(newInputStream);
    }

    public static /* synthetic */ Sink sink$default(File file, boolean z, int i, Object obj) throws FileNotFoundException {
        if ((i & 1) != 0) {
            z = false;
        }
        return sink(file, z);
    }
}
