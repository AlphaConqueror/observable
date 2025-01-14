package observable.net

import kotlinx.serialization.Serializable
import observable.server.ProfilingData
import java.util.*

class S2CPacket {
    @Serializable
    data class ProfilingStarted(val endMillis: Long)

    @Serializable
    object ProfilingCompleted

    @Serializable
    object ProfilerInactive

    @Serializable
    data class ProfilingResult(val data: ProfilingData)

    @Serializable
    enum class Availability {
        Available,
        NoPermissions
    }

    @Serializable
    class ConsiderProfiling(val tps: Double)
}
