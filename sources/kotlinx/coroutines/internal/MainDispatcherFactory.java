package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.C53280bw;

public interface MainDispatcherFactory {
    C53280bw createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
