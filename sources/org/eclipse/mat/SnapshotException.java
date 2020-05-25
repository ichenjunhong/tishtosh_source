package org.eclipse.mat;

public class SnapshotException extends Exception {
    private static final long serialVersionUID = 1;

    public SnapshotException() {
    }

    public SnapshotException(String str) {
        super(str);
    }

    public SnapshotException(Throwable th) {
        super(th);
    }

    public static final SnapshotException rethrow(Throwable th) {
        if (th instanceof RuntimeException) {
            RuntimeException runtimeException = (RuntimeException) th;
            if (runtimeException.getCause() instanceof SnapshotException) {
                return (SnapshotException) runtimeException.getCause();
            }
            throw runtimeException;
        } else if (th instanceof SnapshotException) {
            return (SnapshotException) th;
        } else {
            return new SnapshotException(th);
        }
    }

    public SnapshotException(String str, Throwable th) {
        super(str, th);
    }
}
