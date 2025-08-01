package com.studence.studence_control_flow.async;

import com.studence.Studence_Protobuf.TimeStatsPb;

/**
 * Interface for collecting and retrieving statistical time measurements.
 */
public interface IStatistics {

    /**
     * Submit a new duration or time value for statistical aggregation.
     *
     * @param value time in milliseconds or nanoseconds (depends on implementation)
     */
    void submitValue(long value);

    /**
     * Returns the aggregated time statistics as a protobuf object.
     *
     * @return a TimeStatsPb object containing statistical data
     */
    TimeStatsPb getTimeStats();
}
