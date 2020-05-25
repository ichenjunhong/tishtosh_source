package okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: okio.-DeprecatedOkio reason: invalid class name */
public final class DeprecatedOkio {
    public static final DeprecatedOkio INSTANCE = new DeprecatedOkio();

    private DeprecatedOkio() {
    }

    public final Sink blackhole() {
        return Okio.blackhole();
    }

    public final Sink appendingSink(File file) {
        C52711k.m112240b(file, "file");
        return Okio.appendingSink(file);
    }

    public final BufferedSink buffer(Sink sink) {
        C52711k.m112240b(sink, "sink");
        return Okio.buffer(sink);
    }

    public final Sink sink(File file) {
        C52711k.m112240b(file, "file");
        return Okio.sink$default(file, false, 1, null);
    }

    public final Source source(File file) {
        C52711k.m112240b(file, "file");
        return Okio.source(file);
    }

    public final BufferedSource buffer(Source source) {
        C52711k.m112240b(source, "source");
        return Okio.buffer(source);
    }

    public final Sink sink(OutputStream outputStream) {
        C52711k.m112240b(outputStream, "outputStream");
        return Okio.sink(outputStream);
    }

    public final Source source(InputStream inputStream) {
        C52711k.m112240b(inputStream, "inputStream");
        return Okio.source(inputStream);
    }

    public final Sink sink(Socket socket) {
        C52711k.m112240b(socket, "socket");
        return Okio.sink(socket);
    }

    public final Source source(Socket socket) {
        C52711k.m112240b(socket, "socket");
        return Okio.source(socket);
    }

    public final Sink sink(Path path, OpenOption... openOptionArr) {
        C52711k.m112240b(path, LeakCanaryFileProvider.f132050j);
        C52711k.m112240b(openOptionArr, "options");
        return Okio.sink(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    public final Source source(Path path, OpenOption... openOptionArr) {
        C52711k.m112240b(path, LeakCanaryFileProvider.f132050j);
        C52711k.m112240b(openOptionArr, "options");
        return Okio.source(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }
}
