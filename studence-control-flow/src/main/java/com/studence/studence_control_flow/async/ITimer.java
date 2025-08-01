package com.studence.studence_control_flow.async;


/**
 * A simple timer interface to measure elapsed duration between start and stop.
 */
public interface ITimer {

    /**
     * Starts the timer.
     */
    void startTimer();

    /**
     * Stops the timer.
     */
    void stopTimer();

    /**
     * Returns the duration in milliseconds between start and stop.
     *
     * @return elapsed time in milliseconds
     */
    long getDuration();
}
