package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p2628d.p2639f.p2641b.C52711k;

final class SocketAsyncTimeout extends AsyncTimeout {
    private final Logger logger = Logger.getLogger("okio.Okio");
    private final Socket socket;

    /* access modifiers changed from: protected */
    public final void timedOut() {
        try {
            this.socket.close();
        } catch (Exception e) {
            Logger logger2 = this.logger;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder("Failed to close timed out socket ");
            sb.append(this.socket);
            logger2.log(level, sb.toString(), e);
        } catch (AssertionError e2) {
            if (Okio.isAndroidGetsocknameError(e2)) {
                Logger logger3 = this.logger;
                Level level2 = Level.WARNING;
                StringBuilder sb2 = new StringBuilder("Failed to close timed out socket ");
                sb2.append(this.socket);
                logger3.log(level2, sb2.toString(), e2);
                return;
            }
            throw e2;
        }
    }

    public SocketAsyncTimeout(Socket socket2) {
        C52711k.m112240b(socket2, "socket");
        this.socket = socket2;
    }

    /* access modifiers changed from: protected */
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
