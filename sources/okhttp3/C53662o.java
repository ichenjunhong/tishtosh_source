package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: okhttp3.o */
public interface C53662o {

    /* renamed from: b */
    public static final C53662o f133125b = new C53662o() {
        public final List<InetAddress> lookup(String str) throws UnknownHostException {
            if (str != null) {
                try {
                    return Arrays.asList(InetAddress.getAllByName(str));
                } catch (NullPointerException e) {
                    StringBuilder sb = new StringBuilder("Broken system behaviour for dns lookup of ");
                    sb.append(str);
                    UnknownHostException unknownHostException = new UnknownHostException(sb.toString());
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                } catch (Exception e2) {
                    throw new UnknownHostException(e2.getMessage());
                }
            } else {
                throw new UnknownHostException("hostname == null");
            }
        }
    };

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
